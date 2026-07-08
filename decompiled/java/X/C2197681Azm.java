package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1Azm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2197681Azm {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZIZ(EnumC2197791Azx enumC2197791Azx, EnumC21159117rB enumC21159117rB) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (enumC2197791Azx != null) {
            linkedHashMap.put("pay_method", enumC2197791Azx.getValue());
        }
        if (enumC21159117rB != null) {
            linkedHashMap.put("pay_step", enumC21159117rB.getValue());
        }
        return linkedHashMap;
    }

    public static Map LIZ(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("pay_order_id", str);
        }
        if (str2 != null) {
            linkedHashMap.put("recharge_order_id", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("flow_id", str3);
        }
        return linkedHashMap;
    }

    public static void LIZLLL(String str, String str2, String str3) {
        String string;
        String strLIZ = C2195221Avo.LIZ();
        Map mapLIZ = LIZ(str, str2, str3);
        C1232850iBf c1232850iBf = C2197731Azr.LIZIZ;
        C1232830iBd c1232830iBd = C1232830iBd.LIZ;
        String strValueOf = String.valueOf(c1232850iBf.LIZ);
        Integer num = c1232850iBf.LIZJ;
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        EnumC1236600iHi enumC1236600iHi = c1232850iBf.LJFF;
        EnumC21632119lH enumC21632119lH = c1232850iBf.LJI;
        EnumC19415410xc enumC19415410xc = c1232850iBf.LJII;
        c1232830iBd.getClass();
        C1232830iBd.LIZ(strLIZ, "minis_tt_beans_panel_show", strValueOf, string, null, mapLIZ, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisPaymentBeansPanelShow, errorCodeScene:");
        sbLIZ.append(c1232850iBf);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZJ(C1232850iBf c1232850iBf, EnumC2197791Azx enumC2197791Azx, EnumC21159117rB enumC21159117rB, String str, String str2, String str3) {
        String string;
        String strLIZ = C2195221Avo.LIZ();
        Map mapLIZIZ = LIZIZ(enumC2197791Azx, enumC21159117rB);
        Map mapLIZ = LIZ(str, str2, str3);
        C1232830iBd c1232830iBd = C1232830iBd.LIZ;
        String strValueOf = String.valueOf(c1232850iBf.LIZ);
        Integer num = c1232850iBf.LIZJ;
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        EnumC1236600iHi enumC1236600iHi = c1232850iBf.LJFF;
        EnumC21632119lH enumC21632119lH = c1232850iBf.LJI;
        EnumC19415410xc enumC19415410xc = c1232850iBf.LJII;
        c1232830iBd.getClass();
        C1232830iBd.LIZ(strLIZ, "minis_pay_jsb_result", strValueOf, string, mapLIZIZ, mapLIZ, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisPayJsbResult, errorCodeScene:");
        sbLIZ.append(c1232850iBf);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJ(C1232850iBf c1232850iBf, EnumC2197791Azx enumC2197791Azx, EnumC21159117rB enumC21159117rB, String str, String str2, String str3) {
        String string;
        String strLIZ = C2195221Avo.LIZ();
        Map mapLIZIZ = LIZIZ(enumC2197791Azx, enumC21159117rB);
        Map mapLIZ = LIZ(str, str2, str3);
        C1232830iBd c1232830iBd = C1232830iBd.LIZ;
        String strValueOf = String.valueOf(c1232850iBf.LIZ);
        Integer num = c1232850iBf.LIZJ;
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        EnumC1236600iHi enumC1236600iHi = c1232850iBf.LJFF;
        EnumC21632119lH enumC21632119lH = c1232850iBf.LJI;
        EnumC19415410xc enumC19415410xc = c1232850iBf.LJII;
        c1232830iBd.getClass();
        C1232830iBd.LIZ(strLIZ, "minis_recharge_jsb_result", strValueOf, string, mapLIZIZ, mapLIZ, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisRechargeJsbResult, errorCodeScene:");
        sbLIZ.append(c1232850iBf);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
