package X;

/* JADX INFO: renamed from: X.14O3, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C14O3 {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    public static final C14O4 Companion = new Object() { // from class: X.14O4
    };
    public final int LL;

    public static C14O3 valueOf(String str) {
        return (C14O3) C08FF.LIZ(C14O3.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    C14O3(int i) {
        this.LL = i;
    }
}
