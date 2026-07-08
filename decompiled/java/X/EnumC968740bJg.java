package X;

/* JADX INFO: renamed from: X.0bJg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC968740bJg {
    LinkmicShareRevenueNotSet,
    LinkmicShareRevenueOpen,
    LinkmicShareRevenueClose;

    public static final C968770bJj Companion = new Object() { // from class: X.0bJj
    };

    public static EnumC968740bJg valueOf(String str) {
        return (EnumC968740bJg) C08FF.LIZ(EnumC968740bJg.class, str);
    }

    public final EnumC2232051CXr into() {
        int i = C968730bJf.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2232051CXr.VAR_LINKMIC_SHARE_REVENUE_SETTING_LINKMIC_SHARE_REVENUE_NOT_SET;
        }
        if (i == 2) {
            return EnumC2232051CXr.VAR_LINKMIC_SHARE_REVENUE_SETTING_LINKMIC_SHARE_REVENUE_OPEN;
        }
        if (i == 3) {
            return EnumC2232051CXr.VAR_LINKMIC_SHARE_REVENUE_SETTING_LINKMIC_SHARE_REVENUE_CLOSE;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C968730bJf.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        throw new C1954807lC();
    }
}
