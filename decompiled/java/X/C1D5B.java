package X;

/* JADX INFO: renamed from: X.1D5B, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public enum C1D5B {
    LEVEL_INVALID(-1),
    LEVEL_UNKNOWN(0),
    LEVEL_RECOMMEND(1),
    LEVEL_PROBE(2),
    LEVEL_MANUAL(3);

    public final int value;

    public int getValue() {
        return this.value;
    }

    public static C1D5B valueOf(String str) {
        return (C1D5B) C08FF.LIZ(C1D5B.class, str);
    }

    C1D5B(int i) {
        this.value = i;
    }
}
