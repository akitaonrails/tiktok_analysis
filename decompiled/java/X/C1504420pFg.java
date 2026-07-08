package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.minis.perf.prefetch.model.MinisPrefetchRoute;
import com.ss.android.ugc.aweme.minis.perf.prefetch.model.MinisPrefetchRouteConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0pFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.perf.prefetch.MinisPrefetcher$prefetch$1", f = "MinisPrefetcher.kt", l = {}, m = "invokeSuspend")
public final class C1504420pFg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1504440pFi LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1504420pFg(C1504440pFi c1504440pFi, String str, InterfaceC1364105Vn<? super C1504420pFg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1504440pFi;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1504420pFg(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZIZ;
        String strLIZIZ2;
        Map map;
        MinisPrefetchRoute minisPrefetchRouteLIZ;
        C1C7U.LIZ("MinisPrefetcher@40be.prefetch$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1504440pFi c1504440pFi = this.LL;
        String str = this.LLILLJJLI;
        c1504440pFi.LIZIZ.getClass();
        ArrayList arrayList = new ArrayList();
        try {
            Object obj2 = ((Map) GsonProtectorUtils.fromJson(C08JS.LIZIZ(), str, Map.class)).get("prefetch");
            if ((obj2 instanceof Map) && (map = (Map) obj2) != null) {
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if ((key instanceof String) && (minisPrefetchRouteLIZ = C1504340pFY.LIZ(value, (String) key)) != null) {
                        arrayList.add(minisPrefetchRouteLIZ);
                    }
                }
            }
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!arrayList.isEmpty()) {
            ArrayList<MinisPrefetchRoute> arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                MinisPrefetchRoute minisPrefetchRoute = (MinisPrefetchRoute) obj3;
                String str2 = c1504440pFi.LIZ.pathWithOutParams;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = minisPrefetchRoute.path;
                boolean z = false;
                if (!u.LJJIIJZLJL(str2, "/", false)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('/');
                    sbLIZ.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = str2;
                }
                if (!u.LJJIIJZLJL(str3, "/", false)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('/');
                    sbLIZ2.append(str3);
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    strLIZIZ2 = str3;
                }
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLIZIZ, new String[]{"/"}, 0, 6);
                List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(strLIZIZ2, new String[]{"/"}, 0, 6);
                if (listLJJLIIIJILLIZJL.size() == listLJJLIIIJILLIZJL2.size()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = listLJJLIIIJILLIZJL.size();
                    int size2 = listLJJLIIIJILLIZJL2.size();
                    if (size > size2) {
                        size = size2;
                    }
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            Object obj4 = ListProtector.get(listLJJLIIIJILLIZJL, i);
                            String str4 = (String) ListProtector.get(listLJJLIIIJILLIZJL2, i);
                            if (!Intrinsics.LJFF(obj4, str4)) {
                                if (!u.LJJIIJZLJL(str4, ":", false)) {
                                    break;
                                }
                                linkedHashMap.put(str4.substring(1), obj4);
                            }
                            i++;
                        } else {
                            z = true;
                            linkedHashMap.clear();
                            linkedHashMap.putAll(linkedHashMap);
                            break;
                        }
                    }
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("minisSchemaPath: ");
                    sbLIZ3.append(str2);
                    sbLIZ3.append(" prefetchRoutePath: ");
                    sbLIZ3.append(str3);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    if (z) {
                        arrayList2.add(obj3);
                    }
                }
            }
            for (MinisPrefetchRoute minisPrefetchRoute2 : arrayList2) {
                if (((LinkedHashMap) c1504440pFi.LIZJ).get(minisPrefetchRoute2.path) == null) {
                    c1504440pFi.LIZJ.put(minisPrefetchRoute2.path, new C1504450pFj(c1504440pFi.LIZ, minisPrefetchRoute2));
                }
                C1504450pFj c1504450pFj = (C1504450pFj) ((LinkedHashMap) c1504440pFi.LIZJ).get(minisPrefetchRoute2.path);
                if (c1504450pFj != null) {
                    for (Map.Entry<String, MinisPrefetchRouteConfig> entry2 : c1504450pFj.LIZIZ.configs.entrySet()) {
                        c1504450pFj.LIZLLL.put(entry2.getKey(), new C1504330pFX(c1504450pFj.LIZIZ.path, c1504450pFj.LIZ, entry2.getValue(), c1504450pFj.LIZJ));
                    }
                    for (C1504330pFX c1504330pFX : ((LinkedHashMap) c1504450pFj.LIZLLL).values()) {
                        c1504330pFX.getClass();
                        try {
                            String strLIZ = c1504330pFX.LIZ();
                            int i3 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("[MinisPrefetch] build prefetch url: ");
                            sbLIZ4.append(strLIZ);
                            C1720106oR.LJI("MinisPrefetchWorker", C2188811AlT.LIZIZ(sbLIZ4));
                            c1504330pFX.LIZLLL(strLIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c1504330pFX.LJFF = new C1504480pFm(null, null, null, th, null, 23);
                        }
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MinisPrefetcher@40be.prefetch$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
