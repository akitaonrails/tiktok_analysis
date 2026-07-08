package X;

/* JADX INFO: renamed from: X.14OR, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C14OR {
    RTL(2),
    LTR(3);

    public static final C14OT Companion = new Object() { // from class: X.14OT
    };
    public final int LL;

    public static C14OR valueOf(String str) {
        return (C14OR) C08FF.LIZ(C14OR.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C14OS.LIZ[ordinal()];
        if (i == 1) {
            return "rtl";
        }
        if (i == 2) {
            return "ltr";
        }
        throw new C1954807lC();
    }

    public final int getValue() {
        return this.LL;
    }

    C14OR(int i) {
        this.LL = i;
    }
}
