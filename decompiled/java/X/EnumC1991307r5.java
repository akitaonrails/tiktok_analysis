package X;

/* JADX INFO: renamed from: X.07r5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC1991307r5 {
    UnknownLogType(0),
    SlaApiLog(1),
    SlaEventLog(2);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1991307r5 valueOf(String str) {
        return (EnumC1991307r5) C08FF.LIZ(EnumC1991307r5.class, str);
    }

    EnumC1991307r5(int i) {
        this.LL = i;
    }
}
