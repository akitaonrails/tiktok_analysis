package X;

/* JADX INFO: renamed from: X.0ayy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955900ayy {
    public static final String LIZ(Integer num) {
        int type = EnumC919170a1j.MATCH_TYPE_1V1.getType();
        if (num != null && num.intValue() == type) {
            return "match";
        }
        int type2 = EnumC919170a1j.MATCH_TYPE_2V2.getType();
        if (num != null && num.intValue() == type2) {
            return "teammatch";
        }
        int type3 = EnumC919170a1j.MATCH_TYPE_INDIVIDUAL.getType();
        if (num != null && num.intValue() == type3) {
            return "individual match";
        }
        int type4 = EnumC919170a1j.MATCH_TYPE_1VN.getType();
        if (num != null && num.intValue() == type4) {
            return "1vn";
        }
        int type5 = EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE.getType();
        if (num != null && num.intValue() == type5) {
            return "take_stage";
        }
        int type6 = EnumC919170a1j.MATCH_TYPE_CATCH_BEANS.getType();
        if (num != null && num.intValue() == type6) {
            return "catch_bean";
        }
        return "";
    }
}
