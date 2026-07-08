package X;

/* JADX INFO: renamed from: X.0bAL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962950bAL {
    public static EnumC962960bAM LIZIZ(Integer num) {
        EnumC962960bAM enumC962960bAM = EnumC962960bAM.TAKE_THE_STAGE;
        int type = enumC962960bAM.getType();
        if (num != null && num.intValue() == type) {
            return enumC962960bAM;
        }
        EnumC962960bAM enumC962960bAM2 = EnumC962960bAM.CATCH_BEANS;
        int type2 = enumC962960bAM2.getType();
        if (num != null && num.intValue() == type2) {
            return enumC962960bAM2;
        }
        EnumC962960bAM enumC962960bAM3 = EnumC962960bAM.MATCH_1V1;
        int type3 = enumC962960bAM3.getType();
        if (num != null && num.intValue() == type3) {
            return enumC962960bAM3;
        }
        EnumC962960bAM enumC962960bAM4 = EnumC962960bAM.MATCH_2V2;
        int type4 = enumC962960bAM4.getType();
        if (num != null && num.intValue() == type4) {
            return enumC962960bAM4;
        }
        EnumC962960bAM enumC962960bAM5 = EnumC962960bAM.MATCH_INDIVIDUAL;
        int type5 = enumC962960bAM5.getType();
        if (num != null && num.intValue() == type5) {
            return enumC962960bAM5;
        }
        EnumC962960bAM enumC962960bAM6 = EnumC962960bAM.MATCH_1VN;
        int type6 = enumC962960bAM6.getType();
        if (num != null && num.intValue() == type6) {
            return enumC962960bAM6;
        }
        return EnumC962960bAM.UNKNOWN;
    }

    public static String LIZJ(EnumC962960bAM enumC962960bAM) {
        switch (C962970bAN.LIZ[enumC962960bAM.ordinal()]) {
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
                return "unknown";
        }
    }

    public static EnumC962960bAM LIZLLL(EnumC919170a1j enumC919170a1j) {
        if (enumC919170a1j != null) {
            switch (C962970bAN.LIZIZ[enumC919170a1j.ordinal()]) {
                case 1:
                    return EnumC962960bAM.TAKE_THE_STAGE;
                case 2:
                    return EnumC962960bAM.CATCH_BEANS;
                case 3:
                    return EnumC962960bAM.UNKNOWN;
                case 4:
                    return EnumC962960bAM.MATCH_1V1;
                case 5:
                    return EnumC962960bAM.MATCH_2V2;
                case 6:
                    return EnumC962960bAM.MATCH_INDIVIDUAL;
                case 7:
                    return EnumC962960bAM.MATCH_1VN;
            }
        }
        return EnumC962960bAM.UNKNOWN;
    }

    public static EnumC962960bAM LJ(EnumC919170a1j enumC919170a1j) {
        if (enumC919170a1j != null) {
            int i = C962970bAN.LIZIZ[enumC919170a1j.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return EnumC962960bAM.CATCH_BEANS;
                }
            } else {
                return EnumC962960bAM.TAKE_THE_STAGE;
            }
        }
        return EnumC962960bAM.UNKNOWN;
    }

    public static EnumC919170a1j LJFF(EnumC962960bAM enumC962960bAM) {
        if (enumC962960bAM != null) {
            int i = C962970bAN.LIZ[enumC962960bAM.ordinal()];
            if (i != 5) {
                if (i == 6) {
                    return EnumC919170a1j.MATCH_TYPE_CATCH_BEANS;
                }
            } else {
                return EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE;
            }
        }
        return EnumC919170a1j.UNKNOWN;
    }

    public static String LIZ(EnumC962960bAM enumC962960bAM, int i) {
        switch (C962970bAN.LIZ[enumC962960bAM.ordinal()]) {
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
                if (i == 3) {
                    return "1v2";
                }
                return "1v3";
            case 5:
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return "";
                        }
                        return "take_stage_4p";
                    }
                    return "take_stage_3p";
                }
                return "take_stage_2p";
            case 6:
                return "catch_bean";
            case 7:
                return "unknown";
            default:
                throw new C1954807lC();
        }
    }
}
