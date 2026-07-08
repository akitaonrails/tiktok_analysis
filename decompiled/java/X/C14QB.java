package X;

/* JADX INFO: renamed from: X.14QB, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C14QB {
    ABSOLUTE,
    RELATIVE;

    public static final C14QC Companion = new Object() { // from class: X.14QC
    };

    public static C14QB valueOf(String str) {
        return (C14QB) C08FF.LIZ(C14QB.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C14QA.LIZ[ordinal()];
        if (i == 1) {
            return "absolute";
        }
        if (i == 2) {
            return "relative";
        }
        throw new C1954807lC();
    }
}
