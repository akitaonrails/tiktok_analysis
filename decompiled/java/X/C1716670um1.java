package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0um1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1716670um1 {
    public static final C1716670um1 LIZ = new C1716670um1();
    public static final Map<String, String> LIZIZ = new LinkedHashMap();
    public static long LIZJ;

    public static void LIZJ(String str) {
        String str2;
        LIZJ = System.currentTimeMillis();
        if (u.LJIJI(str, "MOBILE", true)) {
            str2 = "fp_sdk_phone_info_collect_guide_show";
        } else if (u.LJIJI(str, "BIO", true)) {
            str2 = "fp_sdk_biometric_info_agreement_show";
        } else {
            str2 = "fp_sdk_pin_info_collect_guide_show";
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Map<String, String> map = LIZIZ;
        c1716310ulR.getClass();
        C1716310ulR.LIZLLL(str2, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.ss.android.ugc.aweme.component.guide.InfoCollectGuideModel r7, java.util.Map r8) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1716670um1.LIZ(com.ss.android.ugc.aweme.component.guide.InfoCollectGuideModel, java.util.Map):void");
    }

    public static void LIZIZ(String str, String str2) {
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.put("click_use_time", String.valueOf(System.currentTimeMillis() - LIZJ));
        linkedHashMap.put("obj_id", str2);
        if (u.LJIJI(str, "MOBILE", true)) {
            str3 = "fp_sdk_phone_info_collect_guide_click";
        } else if (u.LJIJI(str, "BIO", true)) {
            str3 = "fp_sdk_biometric_info_agreement_click";
        } else {
            str3 = "fp_sdk_pin_info_collect_guide_click";
        }
        C1716310ulR.LIZ.getClass();
        C1716310ulR.LIZLLL(str3, linkedHashMap);
    }
}
