package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1Azl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2197671Azl {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("trade_order_id", str);
        }
        if (str2 != null) {
            linkedHashMap.put("flow_id", str2);
        }
        return linkedHashMap;
    }

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

    public static void LJFF(C1232850iBf c1232850iBf, String str, String str2) {
        String string;
        String strLIZ = C2195221Avo.LIZ();
        Map mapLIZ = LIZ(str, str2);
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
        C1232830iBd.LIZ(strLIZ, "minis_subscribe_reactivate_click", strValueOf, string, null, mapLIZ, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisPayUserClick, errorCodeScene:");
        sbLIZ.append(c1232850iBf);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZJ(C1232850iBf c1232850iBf, EnumC2197791Azx enumC2197791Azx, EnumC21159117rB enumC21159117rB, String str, String str2) {
        String string;
        String strLIZ = C2195221Avo.LIZ();
        Map mapLIZIZ = LIZIZ(enumC2197791Azx, enumC21159117rB);
        Map mapLIZ = LIZ(str, str2);
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
        C1232830iBd.LIZ(strLIZ, "minis_subscribe_change_jsb_result", strValueOf, string, mapLIZIZ, mapLIZ, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisSubscriptionChangeJsbResult, errorCodeScene:");
        sbLIZ.append(c1232850iBf);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZLLL(C1232850iBf c1232850iBf, EnumC2197791Azx enumC2197791Azx, EnumC21159117rB enumC21159117rB, String str, String str2) {
        String string;
        String strLIZ = C2195221Avo.LIZ();
        Map mapLIZIZ = LIZIZ(enumC2197791Azx, enumC21159117rB);
        Map mapLIZ = LIZ(str, str2);
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
        C1232830iBd.LIZ(strLIZ, "minis_subscribe_create_jsb_result", strValueOf, string, mapLIZIZ, mapLIZ, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisSubscriptionCreateJsbResult, errorCodeScene:");
        sbLIZ.append(c1232850iBf);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJ(C1232850iBf c1232850iBf, EnumC2197791Azx enumC2197791Azx, EnumC21159117rB enumC21159117rB, String str, String str2) {
        String string;
        String strLIZ = C2195221Avo.LIZ();
        Map mapLIZIZ = LIZIZ(enumC2197791Azx, enumC21159117rB);
        Map mapLIZ = LIZ(str, str2);
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
        C1232830iBd.LIZ(strLIZ, "minis_subscribe_reactive_jsb_result", strValueOf, string, mapLIZIZ, mapLIZ, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisSubscriptionReactiveJsbResult, errorCodeScene:");
        sbLIZ.append(c1232850iBf);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
