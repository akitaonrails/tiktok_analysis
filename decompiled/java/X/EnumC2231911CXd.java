package X;

/* JADX INFO: renamed from: X.1CXd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231911CXd {
    Im,
    Recharge,
    Rts;

    public static final C2232251CYl Companion = new Object() { // from class: X.1CYl
    };

    public static EnumC2231911CXd valueOf(String str) {
        return (EnumC2231911CXd) C08FF.LIZ(EnumC2231911CXd.class, str);
    }

    public final EnumC2231901CXc into() {
        int i = C1CY3.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2231901CXc.VAR_LINK_MIC_IM_MODE_IM;
        }
        if (i == 2) {
            return EnumC2231901CXc.VAR_LINK_MIC_IM_MODE_RECHARGE;
        }
        if (i == 3) {
            return EnumC2231901CXc.VAR_LINK_MIC_IM_MODE_RTS;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1CY3.LIZ[ordinal()];
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
