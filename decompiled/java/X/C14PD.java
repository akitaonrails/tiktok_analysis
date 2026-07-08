package X;

/* JADX INFO: renamed from: X.14PD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C14PD {
    AUTO,
    STRETCH,
    FLEX_START,
    FLEX_END,
    CENTER,
    BASELINE,
    START,
    END;

    public static final C14Q0 Companion = new Object() { // from class: X.14Q0
    };

    public static C14PD valueOf(String str) {
        return (C14PD) C08FF.LIZ(C14PD.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C14PC.LIZ[ordinal()]) {
            case 1:
                return "auto";
            case 2:
                return "stretch";
            case 3:
                return "flex-start";
            case 4:
                return "flex-end";
            case 5:
                return "center";
            case 6:
                return "baseline";
            case 7:
                return "start";
            case 8:
                return "end";
            default:
                throw new C1954807lC();
        }
    }
}
