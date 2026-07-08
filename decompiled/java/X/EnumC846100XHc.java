package X;

/* JADX INFO: renamed from: X.0XHc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC846100XHc {
    NONE(0),
    MOBILE(1),
    MOBILE_2G(2),
    MOBILE_3G(3),
    WIFI(4),
    MOBILE_4G(5);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC846100XHc valueOf(String str) {
        return (EnumC846100XHc) C08FF.LIZ(EnumC846100XHc.class, str);
    }

    EnumC846100XHc(int i) {
        this.LL = i;
    }
}
