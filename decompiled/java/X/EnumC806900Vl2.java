package X;

/* JADX INFO: renamed from: X.0Vl2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC806900Vl2 {
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

    public static EnumC806900Vl2 valueOf(String str) {
        return (EnumC806900Vl2) C08FF.LIZ(EnumC806900Vl2.class, str);
    }

    EnumC806900Vl2(int i) {
        this.LL = i;
    }
}
