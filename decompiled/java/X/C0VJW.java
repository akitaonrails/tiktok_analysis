package X;

/* JADX INFO: renamed from: X.0VJW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0VJW {
    NORMAL(1),
    WITH_BLOCK(2);

    public final int LL;

    public static C0VJW valueOf(String str) {
        return (C0VJW) C08FF.LIZ(C0VJW.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    C0VJW(int i) {
        this.LL = i;
    }
}
