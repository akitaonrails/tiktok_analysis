package X;

/* JADX INFO: renamed from: X.0oxM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1493060oxM {
    STOPPED(-1),
    NO_NETWORK(0),
    DEFAULT_CELLULAR(1),
    DEFAULT_WIFI_WITH_CELLULAR_DOWN(2),
    DEFAULT_WIFI_WITH_CELLULAR_UP(3),
    WAIT_CELLULAR_ALWAYS_UP(4),
    WAIT_USER_ALLOW_TO_CELLULAR(5),
    WIFI_WITH_CELLULAR_TRANS_DATA(6),
    EVALUATE_CELLULAR(7),
    WAIT_USER_ALLOW_TO_WIFI(8);

    public final int state;

    public static EnumC1493060oxM valueOf(String str) {
        return (EnumC1493060oxM) C08FF.LIZ(EnumC1493060oxM.class, str);
    }

    EnumC1493060oxM(int i) {
        this.state = i;
    }
}
