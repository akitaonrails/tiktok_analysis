package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.event.data.ECMMKGlobalContextCallback;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NlG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C603200NlG {
    public static Map<String, Object> LIZ;
    public static String LIZIZ = "";

    public static void LIZ(Map map, final InterfaceC599750Nfh interfaceC599750Nfh) {
        if (interfaceC599750Nfh.LIZLLL("popup_diversion_config", EnumC599720Nfe.NATIVE, C2097608Jq.LJ()) == null) {
            LIZIZ(map, interfaceC599750Nfh);
            return;
        }
        if (!Intrinsics.LJFF(interfaceC599750Nfh.LIZLLL("global_runtime_init", EnumC599720Nfe.NATIVE, C2097608Jq.LJ()), Double.valueOf(1.0d))) {
            LIZ = map;
            String str = LIZIZ;
            if (str == null || str.length() == 0) {
                LIZIZ = interfaceC599750Nfh.LIZIZ("global_runtime_init", new ECMMKGlobalContextCallback() { // from class: X.0NlH
                    @Override // com.ss.android.ugc.aweme.ecommerce.mixmall.event.data.ECMMKGlobalContextCallback
                    public final void invoke(Object obj) {
                        if (Intrinsics.LJFF(obj, Double.valueOf(1.0d))) {
                            C603200NlG.LIZIZ(C603200NlG.LIZ, interfaceC599750Nfh);
                            InterfaceC599750Nfh interfaceC599750Nfh2 = interfaceC599750Nfh;
                            String str2 = C603200NlG.LIZIZ;
                            if (str2 == null) {
                                str2 = "";
                            }
                            interfaceC599750Nfh2.LIZJ("global_runtime_init", str2, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
                        }
                    }
                }, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
                return;
            }
            return;
        }
        LIZIZ(map, interfaceC599750Nfh);
    }

    public static void LIZIZ(Map map, InterfaceC599750Nfh interfaceC599750Nfh) {
        if (map != null) {
            interfaceC599750Nfh.LJ("popup_diversion_config", C1741890vQh.LJIIIIZZ(map), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("diversion_config_send_time", Long.valueOf(System.currentTimeMillis()));
        linkedHashMap.put("diversion_config", "{}");
        interfaceC599750Nfh.LJ("popup_diversion_config", C1741890vQh.LJIIIIZZ(linkedHashMap), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
    }
}
