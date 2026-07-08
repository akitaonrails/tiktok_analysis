package X;

/* JADX INFO: renamed from: X.0O0L, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public enum C0O0L {
    UNKNOWN(-1),
    NOT_AVAILABLE(0),
    AVAILABLE(1),
    FAKE(2);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static C0O0L valueOf(String str) {
        return (C0O0L) C08FF.LIZ(C0O0L.class, str);
    }

    C0O0L(int i) {
        this.LL = i;
    }
}
