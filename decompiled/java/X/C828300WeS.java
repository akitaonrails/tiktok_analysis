package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.hybridkit.experiment.EnableGlobalpropsDesensitizationSettings;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0WeS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828300WeS extends C1547220qMi {
    public final C828290WeR LJ = new C0WTD() { // from class: X.0WeR
        @Override // X.C0WTD, X.InterfaceC1059260dfg
        public final void LIZ(InterfaceC1541990qEH interfaceC1541990qEH, List<String> list) {
            Map<String, Object> mapLJFF;
            Map<String, Object> map;
            InterfaceC1531560pxS interfaceC1531560pxS = interfaceC1541990qEH.getHybridContext().hybridParams;
            if (interfaceC1531560pxS != null && (mapLJFF = interfaceC1531560pxS.LJFF()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Object> entry : mapLJFF.entrySet()) {
                    if (((ArrayList) list).contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    C828310WeT c828310WeT = (C828310WeT) interfaceC1541990qEH.getHybridContext().LJFF(C828310WeT.class);
                    if (c828310WeT != null && (map = c828310WeT.LIZ) != null) {
                        map.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            super.LIZ(interfaceC1541990qEH, list);
        }

        @Override // X.C0WTD, X.InterfaceC1059260dfg
        public final void LIZIZ(InterfaceC1541990qEH interfaceC1541990qEH, Map<String, Object> map) {
            this.LIZ.getClass();
            super.LIZIZ(interfaceC1541990qEH, C828300WeS.LJIIIZ(interfaceC1541990qEH, map));
        }

        @Override // X.C0WTD, X.InterfaceC1059260dfg
        public final void LIZJ(InterfaceC1541990qEH interfaceC1541990qEH, Map<String, Object> map) {
            this.LIZ.getClass();
            super.LIZJ(interfaceC1541990qEH, C828300WeS.LJIIIZ(interfaceC1541990qEH, map));
        }
    };
    public final C1059240dfe LJFF = C1059240dfe.LIZ;

    @Override // X.C1547220qMi, X.InterfaceC1541510qDV
    public final InterfaceC1536300q56 LIZ() {
        return this.LJFF;
    }

    @Override // X.C1547220qMi, X.InterfaceC1541510qDV
    public final InterfaceC1059260dfg LJIIIIZZ() {
        return this.LJ;
    }

    public static Map LJIIIZ(InterfaceC1541990qEH interfaceC1541990qEH, Map map) {
        LinkedHashMap linkedHashMap;
        Object obj;
        C828310WeT c828310WeT;
        Map<String, Object> map2;
        String str;
        if (interfaceC1541990qEH instanceof WebKitView) {
            WebKitView webKitView = (WebKitView) interfaceC1541990qEH;
            if (webKitView.getHybridContext() instanceof SparkContext) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(webKitView.getHybridContext().LJIJI()), "url");
                C828310WeT c828310WeT2 = (C828310WeT) webKitView.getHybridContext().LJFF(C828310WeT.class);
                if (c828310WeT2 != null && (str = c828310WeT2.LIZIZ) != null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = str;
                }
                List<String> listLIZ = EnableGlobalpropsDesensitizationSettings.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                LinkedHashMap linkedHashMap2 = null;
                if (map != null) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (!((ArrayList) listLIZ).contains(entry.getKey())) {
                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                        }
                    }
                    linkedHashMap = new LinkedHashMap(linkedHashMap3);
                } else {
                    linkedHashMap = null;
                }
                if (webKitView.getHybridContext().LJFF(C828310WeT.class) == null) {
                    if (map != null) {
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        for (Map.Entry entry2 : map.entrySet()) {
                            if (((ArrayList) listLIZ).contains(entry2.getKey())) {
                                linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        linkedHashMap2 = new LinkedHashMap(linkedHashMap4);
                    }
                    webKitView.getHybridContext().LJJ(C828310WeT.class, new C828310WeT(linkedHashMap2));
                } else {
                    for (Object obj2 : (ArrayList) listLIZ) {
                        if (map != null && (obj = map.get(obj2)) != null && (c828310WeT = (C828310WeT) webKitView.getHybridContext().LJFF(C828310WeT.class)) != null && (map2 = c828310WeT.LIZ) != null) {
                            map2.put((String) obj2, obj);
                        }
                    }
                }
                return linkedHashMap;
            }
        }
        return map;
    }
}
