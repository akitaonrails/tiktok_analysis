package X;

/* JADX INFO: renamed from: X.0ebS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1095080ebS {
    public static String LIZ(C1095010ebL c1095010ebL) {
        Object objValueOf;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9 = "";
        if (c1095010ebL == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scene=");
        sbLIZ.append(c1095010ebL.LIZ);
        sbLIZ.append(",sceneLogId=");
        sbLIZ.append(c1095010ebL.LIZIZ);
        sbLIZ.append(",msgType=");
        C1095110ebV c1095110ebV = c1095010ebL.LIZJ;
        if (c1095110ebV == null) {
            objValueOf = "";
        } else {
            objValueOf = Integer.valueOf(c1095110ebV.LIZ);
        }
        sbLIZ.append(objValueOf);
        sbLIZ.append(",msgId=");
        C1095110ebV c1095110ebV2 = c1095010ebL.LIZJ;
        if (c1095110ebV2 == null || (str = c1095110ebV2.LIZIZ) == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append(",msgLogId=");
        C1095110ebV c1095110ebV3 = c1095010ebL.LIZJ;
        if (c1095110ebV3 == null || (str2 = c1095110ebV3.LIZJ) == null) {
            str2 = "";
        }
        sbLIZ.append(str2);
        sbLIZ.append(",giftId=");
        C1095120ebW c1095120ebW = c1095010ebL.LIZLLL;
        if (c1095120ebW == null || (str3 = c1095120ebW.LIZ) == null) {
            str3 = "";
        }
        sbLIZ.append(str3);
        sbLIZ.append(",giftLogId=");
        C1095120ebW c1095120ebW2 = c1095010ebL.LIZLLL;
        if (c1095120ebW2 == null || (str4 = c1095120ebW2.LIZIZ) == null) {
            str4 = "";
        }
        sbLIZ.append(str4);
        sbLIZ.append(",curRoomId=");
        C1095070ebR c1095070ebR = c1095010ebL.LJ;
        if (c1095070ebR == null || (str5 = c1095070ebR.LIZ) == null) {
            str5 = "";
        }
        sbLIZ.append(str5);
        sbLIZ.append(",curCreatorId=");
        C1095070ebR c1095070ebR2 = c1095010ebL.LJ;
        if (c1095070ebR2 == null || (str6 = c1095070ebR2.LIZIZ) == null) {
            str6 = "";
        }
        sbLIZ.append(str6);
        sbLIZ.append(",userType=");
        C1095070ebR c1095070ebR3 = c1095010ebL.LJ;
        if (c1095070ebR3 == null || (str7 = c1095070ebR3.LIZJ) == null) {
            str7 = "";
        }
        sbLIZ.append(str7);
        sbLIZ.append(",enterRoomLogId=");
        C1095070ebR c1095070ebR4 = c1095010ebL.LJ;
        if (c1095070ebR4 != null && (str8 = c1095070ebR4.LIZLLL) != null) {
            str9 = str8;
        }
        sbLIZ.append(str9);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
