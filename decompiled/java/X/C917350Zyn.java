package X;

/* JADX INFO: renamed from: X.0Zyn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917350Zyn {
    public static String LIZ(EnumC919170a1j enumC919170a1j) {
        switch (C917360Zyo.LIZ[enumC919170a1j.ordinal()]) {
            case 1:
                return "1v1";
            case 2:
                return "2v2";
            case 3:
                return "individual";
            case 4:
                return "1vN";
            case 5:
                return "take_stage";
            case 6:
                return "catch_bean";
            default:
                return "none";
        }
    }

    public static String LIZJ(EnumC919170a1j enumC919170a1j) {
        switch (C917360Zyo.LIZ[enumC919170a1j.ordinal()]) {
            case 1:
                return "1v1";
            case 2:
                return "team_match";
            case 3:
                return "individual";
            case 4:
                return "1vN";
            case 5:
                return "take_stage";
            case 6:
                return "catch_bean";
            default:
                return "";
        }
    }

    public static String LIZIZ(EnumC919170a1j enumC919170a1j, int i) {
        switch (C917360Zyo.LIZ[enumC919170a1j.ordinal()]) {
            case 1:
                return "1v1";
            case 2:
                return "2v2";
            case 3:
                if (i == 4) {
                    return "1v1v1v1";
                }
                return "1v1v1";
            case 4:
                if (i <= 3) {
                    return "1v2";
                }
                return "1v3";
            case 5:
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return "take_stage_4p";
                        }
                        return "";
                    }
                    return "take_stage_3p";
                }
                return "take_stage_2p";
            case 6:
                return "catch_bean";
            case 7:
                return "";
            default:
                throw new C1954807lC();
        }
    }
}
