package X;

/* JADX INFO: renamed from: X.14P8, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C14P8 {
    BORDER_BOX,
    CONTENT_BOX;

    public static final C20262114Pz Companion = new Object() { // from class: X.14Pz
    };

    public static C14P8 valueOf(String str) {
        return (C14P8) C08FF.LIZ(C14P8.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C14P9.LIZ[ordinal()];
        if (i == 1) {
            return "border-box";
        }
        if (i == 2) {
            return "content-box";
        }
        throw new C1954807lC();
    }
}
