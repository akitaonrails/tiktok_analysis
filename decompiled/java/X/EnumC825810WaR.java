package X;

/* JADX INFO: renamed from: X.0WaR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC825810WaR {
    UNKNOWN(0),
    APP2APP(1),
    USER_INPUT(2),
    NETWORK(3);

    public final int LL;

    public static EnumC825810WaR valueOf(String str) {
        return (EnumC825810WaR) C08FF.LIZ(EnumC825810WaR.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC825810WaR(int i) {
        this.LL = i;
    }
}
