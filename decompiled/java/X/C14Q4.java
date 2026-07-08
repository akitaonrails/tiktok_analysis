package X;

/* JADX INFO: renamed from: X.14Q4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C14Q4 {
    WRAP,
    NO_WRAP,
    WRAP_REVERSE;

    public static final C14Q5 Companion = new Object() { // from class: X.14Q5
    };

    public static C14Q4 valueOf(String str) {
        return (C14Q4) C08FF.LIZ(C14Q4.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C14Q3.LIZ[ordinal()];
        if (i == 1) {
            return "wrap";
        }
        if (i == 2) {
            return "no-wrap";
        }
        if (i == 3) {
            return "wrap-reverse";
        }
        throw new C1954807lC();
    }
}
