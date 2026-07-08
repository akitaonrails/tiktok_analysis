package X;

/* JADX INFO: renamed from: X.08PL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public enum C08PL {
    SHARED(0),
    UNIQUE(1),
    MULTI(2);

    public final int value;

    public static C08PL valueOf(String str) {
        return (C08PL) C08FF.LIZ(C08PL.class, str);
    }

    C08PL(int i) {
        this.value = i;
    }
}
