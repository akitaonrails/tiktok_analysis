package X;

/* JADX INFO: renamed from: X.0VhM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC804620VhM {
    UNKNOWN(-1),
    NONE(0),
    MOBILE(1),
    MOBILE_2G(2),
    MOBILE_3G(3),
    WIFI(4),
    MOBILE_4G(5),
    MOBILE_5G(6),
    WIFI_24GHZ(7),
    WIFI_5GHZ(8),
    MOBILE_3G_H(9),
    MOBILE_3G_HP(10);

    public final int LL;

    public boolean is2G() {
        return this == MOBILE || this == MOBILE_2G;
    }

    public boolean is3GOrHigher() {
        return this == MOBILE_3G || this == MOBILE_3G_H || this == MOBILE_3G_HP || this == MOBILE_4G || this == MOBILE_5G;
    }

    public boolean is4GOrHigher() {
        return this == MOBILE_4G || this == MOBILE_5G;
    }

    public boolean isAvailable() {
        return (this == UNKNOWN || this == NONE) ? false : true;
    }

    public boolean isWifi() {
        return this == WIFI;
    }

    public int getValue() {
        return this.LL;
    }

    public static EnumC804620VhM valueOf(String str) {
        return (EnumC804620VhM) C08FF.LIZ(EnumC804620VhM.class, str);
    }

    EnumC804620VhM(int i) {
        this.LL = i;
    }
}
