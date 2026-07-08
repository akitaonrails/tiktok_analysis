package X;

/* JADX INFO: renamed from: X.14Ou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC20259014Ou {
    NONE,
    FLEX;

    public static final C20259214Ow Companion = new Object() { // from class: X.14Ow
    };

    public static EnumC20259014Ou valueOf(String str) {
        return (EnumC20259014Ou) C08FF.LIZ(EnumC20259014Ou.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C20259114Ov.LIZ[ordinal()];
        if (i == 1) {
            return "none";
        }
        if (i == 2) {
            return "flex";
        }
        throw new C1954807lC();
    }
}
