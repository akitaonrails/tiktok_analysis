package X;

/* JADX INFO: renamed from: X.1CX5, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CX5 {
    Undefined,
    Excellent,
    Good,
    Poor,
    Bad,
    Vbad,
    Down;

    public static final C2232341CYu Companion = new Object() { // from class: X.1CYu
    };

    public static C1CX5 valueOf(String str) {
        return (C1CX5) C08FF.LIZ(C1CX5.class, str);
    }

    public final C1CXN into() {
        switch (C2231961CXi.LIZ[ordinal()]) {
            case 1:
                return C1CXN.VAR_LINK_MIC_RTC_NETWORK_QUALITY_UNDEFINED;
            case 2:
                return C1CXN.VAR_LINK_MIC_RTC_NETWORK_QUALITY_EXCELLENT;
            case 3:
                return C1CXN.VAR_LINK_MIC_RTC_NETWORK_QUALITY_GOOD;
            case 4:
                return C1CXN.VAR_LINK_MIC_RTC_NETWORK_QUALITY_POOR;
            case 5:
                return C1CXN.VAR_LINK_MIC_RTC_NETWORK_QUALITY_BAD;
            case 6:
                return C1CXN.VAR_LINK_MIC_RTC_NETWORK_QUALITY_VBAD;
            case 7:
                return C1CXN.VAR_LINK_MIC_RTC_NETWORK_QUALITY_DOWN;
            default:
                throw new C1954807lC();
        }
    }

    public final int intoInt() {
        switch (C2231961CXi.LIZ[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                throw new C1954807lC();
        }
    }
}
