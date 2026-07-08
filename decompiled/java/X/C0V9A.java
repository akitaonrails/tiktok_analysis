package X;

/* JADX INFO: renamed from: X.0V9A, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0V9A {
    AUTOMATIC(0),
    MANUAL(1);

    public final int value;

    public static C0V9A valueOf(String str) {
        return (C0V9A) C08FF.LIZ(C0V9A.class, str);
    }

    C0V9A(int i) {
        this.value = i;
    }
}
