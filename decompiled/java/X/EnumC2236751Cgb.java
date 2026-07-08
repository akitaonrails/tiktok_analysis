package X;

/* JADX INFO: renamed from: X.1Cgb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2236751Cgb {
    LinkmicUserSettingMultiGuestShareRevenueRatioNotSet,
    LinkmicUserSettingMultiGuestShareRevenueRatioZero,
    LinkmicUserSettingMultiGuestShareRevenueRatio30,
    LinkmicUserSettingMultiGuestShareRevenueRatio70;

    public static final C2236771Cgd Companion = new C2236771Cgd();

    public static EnumC2236751Cgb valueOf(String str) {
        return (EnumC2236751Cgb) C08FF.LIZ(EnumC2236751Cgb.class, str);
    }

    public final EnumC2231931CXf into() {
        int i = C2236761Cgc.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2231931CXf.VAR_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_NOT_SET;
        }
        if (i == 2) {
            return EnumC2231931CXf.VAR_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_ZERO;
        }
        if (i == 3) {
            return EnumC2231931CXf.VAR_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO30;
        }
        if (i == 4) {
            return EnumC2231931CXf.VAR_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO70;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C2236761Cgc.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            throw new C1954807lC();
        }
        return 3;
    }
}
