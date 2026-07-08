package X;

/* JADX INFO: renamed from: X.0bPT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC972330bPT {
    Float,
    Fixed;

    public static final C972340bPU Companion = new Object() { // from class: X.0bPU
    };

    public static EnumC972330bPT valueOf(String str) {
        return (EnumC972330bPT) C08FF.LIZ(EnumC972330bPT.class, str);
    }

    public final C1CFA into() {
        int i = C972320bPS.LIZ[ordinal()];
        if (i == 1) {
            return C1CFA.VAR_LINK_MIC_LAYOUT_TYPE_FLOAT;
        }
        if (i == 2) {
            return C1CFA.VAR_LINK_MIC_LAYOUT_TYPE_FIXED;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C972320bPS.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            throw new C1954807lC();
        }
        return 1;
    }
}
