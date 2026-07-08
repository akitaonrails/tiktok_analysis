package X;

/* JADX INFO: renamed from: X.0mip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1407170mip {
    public static EnumC1407180miq LIZ(EnumC1407150min enumC1407150min) {
        if (enumC1407150min != null) {
            int i = C1407120mik.LIZ[enumC1407150min.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return EnumC1407180miq.LOADING;
                        }
                    } else {
                        return EnumC1407180miq.TRANSLATING;
                    }
                } else {
                    return EnumC1407180miq.SHOW_TRANSLATION;
                }
            } else {
                return EnumC1407180miq.SHOW_ORIGINAL;
            }
        }
        return EnumC1407180miq.ERROR;
    }

    public static EnumC1407150min LIZIZ(Integer num) {
        int value = EnumC992150bvR.ORIGINAL_CAN_TRANSLATE.getValue();
        if (num != null && num.intValue() == value) {
            return EnumC1407150min.SHOW_ORIGINAL;
        }
        int value2 = EnumC992150bvR.TRANSLATED_CAN_SEE_ORIGINAL.getValue();
        if (num != null && num.intValue() == value2) {
            return EnumC1407150min.SHOW_TRANSLATION;
        }
        return EnumC1407150min.NONE;
    }

    public static String LIZJ(EnumC1407150min enumC1407150min) {
        if (enumC1407150min != null) {
            int i = C1407120mik.LIZ[enumC1407150min.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "view_original";
                }
                return "";
            }
            return "view_translation";
        }
        return "";
    }
}
