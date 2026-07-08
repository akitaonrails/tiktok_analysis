package X;

/* JADX INFO: renamed from: X.08HB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public enum C08HB {
    ENCRYPT_NONE(0),
    ENCRYPT_QUERY(1),
    ENCRYPT_BODY(2),
    ENCRYPT_BOTH_QUERY_AND_BODY(3);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static C08HB valueOf(String str) {
        return (C08HB) C08FF.LIZ(C08HB.class, str);
    }

    C08HB(int i) {
        this.LL = i;
    }
}
