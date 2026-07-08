package X;

/* JADX INFO: renamed from: X.1AZU, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public enum C1AZU {
    Unknown,
    Inner,
    Cross;

    public static final C1AZV Companion = new Object() { // from class: X.1AZV
    };

    public static C1AZU valueOf(String str) {
        return (C1AZU) C08FF.LIZ(C1AZU.class, str);
    }

    public final EnumC2183371Ach into() {
        int i = C1AZT.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
        }
        if (i == 2) {
            return EnumC2183371Ach.VAR_LINK_ARCH_TYPE_INNER;
        }
        if (i == 3) {
            return EnumC2183371Ach.VAR_LINK_ARCH_TYPE_CROSS;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1AZT.LIZ[ordinal()];
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
