package X;

/* JADX INFO: renamed from: X.10nq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public enum EnumC19354810nq {
    ROUND_UP(0),
    ROUND_DOWN(1),
    ROUND_CEILING(2),
    ROUND_FLOOR(3),
    ROUND_HALF_UP(4),
    ROUND_BANKER(6);

    public final int LL;

    public static EnumC19354810nq valueOf(String str) {
        return (EnumC19354810nq) C08FF.LIZ(EnumC19354810nq.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC19354810nq(int i) {
        this.LL = i;
    }
}
