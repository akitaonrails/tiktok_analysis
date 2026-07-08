package X;

/* JADX INFO: renamed from: X.157J, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public enum C157J {
    WAVE_NET_FAILED("wave_net_failed"),
    WAVE_NET_SUCCESS("wave_net_success"),
    WAVE_NET_CANCELED("wave_net_canceled"),
    WAVE_NET_TIMEOUT("wave_net_timeout");

    public final String LL;

    public static C157J valueOf(String str) {
        return (C157J) C08FF.LIZ(C157J.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    C157J(String str) {
        this.LL = str;
    }
}
