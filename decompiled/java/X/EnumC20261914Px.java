package X;

/* JADX INFO: renamed from: X.14Px, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC20261914Px {
    COLUMN,
    ROW,
    ROW_REVERSE,
    COLUMN_REVERSE;

    public static final C14Q1 Companion = new Object() { // from class: X.14Q1
    };

    public static EnumC20261914Px valueOf(String str) {
        return (EnumC20261914Px) C08FF.LIZ(EnumC20261914Px.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C20261814Pw.LIZ[ordinal()];
        if (i == 1) {
            return "column";
        }
        if (i == 2) {
            return "row";
        }
        if (i == 3) {
            return "row-reverse";
        }
        if (i == 4) {
            return "column-reverse";
        }
        throw new C1954807lC();
    }
}
