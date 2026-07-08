package X;

/* JADX INFO: renamed from: X.00GK, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public enum C00GK {
    HIGH(999),
    MIDDLE(666),
    LOW(333);

    public int LL;

    public static C00GK valueOf(String str) {
        return (C00GK) C08FF.LIZ(C00GK.class, str);
    }

    public final int getPriority() {
        return this.LL;
    }

    public final void setPriority(int i) {
        this.LL = i;
    }

    C00GK(int i) {
        this.LL = i;
    }
}
