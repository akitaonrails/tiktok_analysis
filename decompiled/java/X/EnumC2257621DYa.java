package X;

/* JADX INFO: renamed from: X.1DYa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2257621DYa {
    COLUMN,
    ROW,
    ALL;

    public static final C2257671DYf Companion = new Object() { // from class: X.1DYf
    };

    public static EnumC2257621DYa valueOf(String str) {
        return (EnumC2257621DYa) C08FF.LIZ(EnumC2257621DYa.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C2257661DYe.LIZ[ordinal()];
        if (i == 1) {
            return "column";
        }
        if (i == 2) {
            return "row";
        }
        if (i == 3) {
            return "all";
        }
        throw new C1954807lC();
    }
}
