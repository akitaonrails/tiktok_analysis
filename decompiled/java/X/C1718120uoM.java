package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0uoM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1718120uoM {
    public static final C1718120uoM LIZ = new C1718120uoM();

    public static void LJ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("obj_id", str4);
        linkedHashMap.put("end_type", "native");
        linkedHashMap.put("popup_id", str5);
        linkedHashMap.put("merchant_id", str7);
        linkedHashMap.put("merchant_user_id", str8);
        linkedHashMap.put("source_id", str9);
        linkedHashMap.put("busi_type", str);
        C1716310ulR.LIZ.getClass();
        linkedHashMap.putAll(C1716310ulR.LIZ(str6));
        C1716310ulR.LIZJ("fp_sdk_bnpl_popup_click", str2, str3, linkedHashMap);
    }

    public static void LJFF(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("obj_id", str4);
        linkedHashMap.put("end_type", "native");
        linkedHashMap.put("popup_id", str5);
        linkedHashMap.put("merchant_id", str7);
        linkedHashMap.put("merchant_user_id", str8);
        linkedHashMap.put("source_id", str9);
        linkedHashMap.put("busi_type", str);
        C1716310ulR.LIZ.getClass();
        linkedHashMap.putAll(C1716310ulR.LIZ(str6));
        C1716310ulR.LIZJ("fp_sdk_bnpl_popup_show", str2, str3, linkedHashMap);
    }

    public static void LJIIIIZZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        LJIIJ(null, str, str2, "change", str3, str4, str5, str6, str7, str8, str9);
    }

    public static void LJI(String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, String str8, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("interface_return_cost", String.valueOf(j));
        linkedHashMap.put("end_type", "native");
        linkedHashMap.put("merchant_id", str3);
        linkedHashMap.put("merchant_user_id", str4);
        linkedHashMap.put("source_id", str8);
        linkedHashMap.put("busi_type", str);
        if (C1948507kB.LIZ(str6)) {
            linkedHashMap.put("set_pin_step", str6);
        }
        linkedHashMap.putAll(map);
        C1716310ulR.LIZ.getClass();
        linkedHashMap.putAll(C1716310ulR.LIZ(str7));
        C1716310ulR.LIZJ("fp_sdk_bnpl_pin_show", str2, str5, linkedHashMap);
    }

    public static void LJIIIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l) {
        String str10 = str3;
        if (str10 == null) {
            str10 = "";
        }
        LJIIJ(l, str, str2, "forgot", str10, str4, str5, str6, str7, str8, str9);
    }

    public static void LIZ(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("obj_id", str4);
        linkedHashMap.put("end_type", "native");
        linkedHashMap.put("merchant_id", str6);
        linkedHashMap.put("merchant_user_id", str7);
        linkedHashMap.put("source_id", str8);
        linkedHashMap.put("busi_type", str);
        linkedHashMap.put("click_use_time", String.valueOf(j));
        if (C1948507kB.LIZ(str9)) {
            linkedHashMap.put("set_pin_step", str9);
        }
        linkedHashMap.putAll(map);
        C1716310ulR.LIZ.getClass();
        linkedHashMap.putAll(C1716310ulR.LIZ(str5));
        C1716310ulR.LIZJ("fp_sdk_bnpl_pin_click", str2, str3, linkedHashMap);
    }

    public static void LJIIJ(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Unit unit;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("busi_type", str);
        linkedHashMap.put("enter_from", str2);
        linkedHashMap.put("manage_type", str3);
        linkedHashMap.put("auth_type", str4);
        linkedHashMap.put("step_name", str5);
        linkedHashMap.put("action_name", str6);
        linkedHashMap.put("action_result", str7);
        linkedHashMap.put("error_msg", str8);
        linkedHashMap.put("merchant_id", str9);
        linkedHashMap.put("- merchant_user_id", str10);
        if (C1158360gFW.LIZ() && C1718440uos.LIZJ()) {
            try {
                linkedHashMap.put("verify_id", C1718440uos.LIZIZ);
                linkedHashMap.put("enter_seq", String.valueOf(C1718440uos.LIZJ));
                linkedHashMap.put("session_id", C1718440uos.LIZLLL);
                if (l == null) {
                    unit = null;
                } else {
                    linkedHashMap.put("duration", String.valueOf(l.longValue()));
                    unit = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C1716310ulR.LIZ.getClass();
        C1716310ulR.LIZLLL("rd_pipo_pin_manage_step", linkedHashMap);
    }

    public static void LIZJ(String str, String str2, String str3, long j, long j2, String str4, String str5, String str6, String str7, String str8, String str9, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("obj_id", str3);
        linkedHashMap.put("end_type", "native");
        linkedHashMap.put("merchant_id", str7);
        linkedHashMap.put("merchant_user_id", str8);
        linkedHashMap.put("source_id", str9);
        linkedHashMap.put("busi_type", str);
        linkedHashMap.put("finish_timestamp", String.valueOf(j));
        linkedHashMap.put("duration", String.valueOf(j2));
        if (C1948507kB.LIZ(str5)) {
            linkedHashMap.put("pin_err_code", str5);
        }
        if (C1948507kB.LIZ(str6)) {
            linkedHashMap.put("verification_err_msg", str6);
        }
        C1716310ulR.LIZ.getClass();
        linkedHashMap.putAll(C1716310ulR.LIZ(str4));
        linkedHashMap.putAll(map);
        C1716310ulR.LIZJ("fp_sdk_bnpl_pin_fillin", "bnpl_pin_set", str2, linkedHashMap);
    }
}
