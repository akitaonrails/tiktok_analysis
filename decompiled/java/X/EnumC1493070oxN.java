package X;

/* JADX INFO: renamed from: X.0oxN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1493070oxN {
    STOPPED(-1),
    NO_NETWORK(0),
    DEFAULT_CELLULAR_WITH_WIFI_DOWN(1),
    DEFAULT_WIFI_WITH_CELLULAR_DOWN(2),
    DEFAULT_WIFI_WITH_CELLULAR_UP(3),
    WAIT_CELLULAR_ALWAYS_UP(4),
    DEFAULT_VPN(5);

    public final int state;

    public static EnumC1493070oxN valueOf(String str) {
        return (EnumC1493070oxN) C08FF.LIZ(EnumC1493070oxN.class, str);
    }

    EnumC1493070oxN(int i) {
        this.state = i;
    }
}
