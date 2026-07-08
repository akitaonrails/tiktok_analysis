package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS167S1100000_18;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0gxK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185520gxK {
    public final List<InterfaceC1185760gxi> LIZ = Collections.singletonList(new InterfaceC1185760gxi() { // from class: X.0gvz
        /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
        @Override // X.InterfaceC1185760gxi
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Map<java.lang.String, java.lang.String> LIZIZ(com.ss.android.ugc.aweme.slash.component.BaseComponentData r9) {
            /*
                Method dump skipped, instruction units count: 363
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1184690gvz.LIZIZ(com.ss.android.ugc.aweme.slash.component.BaseComponentData):java.util.Map");
        }

        @Override // X.InterfaceC1185760gxi
        public final boolean LIZ(String str, BaseComponentData baseComponentData) {
            if (!a0.LJJIIZI(str, "head_info", false) || !(baseComponentData instanceof PoiListApi.PoiDetailResponse)) {
                return false;
            }
            return true;
        }
    });
    public final Set<String> LIZIZ = Collections.synchronizedSet(new LinkedHashSet());
    public C19487011Lw LIZJ;

    public C1185520gxK(int i) {
    }

    public final Map<String, String> LIZ(C1185690gxb c1185690gxb, String str) {
        Map<String, String> map;
        InterfaceC1185760gxi next;
        if (c1185690gxb == null) {
            return null;
        }
        Map<String, Map<String, String>> map2 = c1185690gxb.LIZLLL;
        if (map2 != null) {
            map = map2.get(str);
        } else {
            map = null;
        }
        if (map != null) {
            return map;
        }
        if (c1185690gxb.LIZJ != EnumC1202700hP2.SLASH_LITE_PRELOAD) {
            return null;
        }
        InterfaceC1173960geg interfaceC1173960geg = C1180170goh.LIZ;
        C1180620gpQ c1180620gpQLIZ = C1181290gqV.LIZ(new SlashApiResponse(c1185690gxb.LIZIZ, null), false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<C1180920gpu> listLJIILIIL = c1180620gpQLIZ.LJIILIIL();
        if (listLJIILIIL != null) {
            for (C1180920gpu c1180920gpu : listLJIILIIL) {
                Iterator<InterfaceC1185760gxi> it2 = this.LIZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.LIZ(c1180920gpu.LIZ, c1180920gpu.LIZLLL)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                InterfaceC1185760gxi interfaceC1185760gxi = next;
                if (interfaceC1185760gxi != null) {
                    Map<String, String> mapLIZIZ = interfaceC1185760gxi.LIZIZ(c1180920gpu.LIZLLL);
                    if (!mapLIZIZ.isEmpty()) {
                        linkedHashMap.put(c1180920gpu.LIZ, new LinkedHashMap(mapLIZIZ));
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        synchronized (c1185690gxb) {
            try {
                Map<String, Map<String, String>> map3 = c1185690gxb.LIZLLL;
                if (map3 == null) {
                    c1185690gxb.LIZLLL = linkedHashMap;
                } else {
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str2 = (String) entry.getKey();
                        Map<String, String> map4 = (Map) entry.getValue();
                        if (!map3.containsKey(str2)) {
                            map3.put(str2, map4);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        new AwS167S1100000_18(str, (String) linkedHashMap, (Map<String, String>) 28);
        Map<String, Map<String, String>> map5 = c1185690gxb.LIZLLL;
        if (map5 == null) {
            return null;
        }
        return map5.get(str);
    }
}
