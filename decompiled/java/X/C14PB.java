package X;

/* JADX INFO: renamed from: X.14PB, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C14PB {
    FLEX_START,
    FLEX_END,
    CENTER,
    STRETCH,
    SPACE_BETWEEN,
    SPACE_AROUND;

    public static final C20262014Py Companion = new Object() { // from class: X.14Py
    };

    public static C14PB valueOf(String str) {
        return (C14PB) C08FF.LIZ(C14PB.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C14PA.LIZ[ordinal()]) {
            case 1:
                return "flex-start";
            case 2:
                return "flex-end";
            case 3:
                return "center";
            case 4:
                return "stretch";
            case 5:
                return "space-between";
            case 6:
                return "space-around";
            default:
                throw new C1954807lC();
        }
    }
}
