package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0kYI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1323760kYI {
    public static final /* synthetic */ EnumC1323760kYI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1323760kYI NO_NETWORK;
    public static final EnumC1323760kYI OTHER;
    public static final EnumC1323760kYI WIFI;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1323760kYI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1323760kYI enumC1323760kYI = new EnumC1323760kYI("NO_NETWORK", 0, "no_network");
        NO_NETWORK = enumC1323760kYI;
        EnumC1323760kYI enumC1323760kYI2 = new EnumC1323760kYI("WIFI", 1, "wifi");
        WIFI = enumC1323760kYI2;
        EnumC1323760kYI enumC1323760kYI3 = new EnumC1323760kYI("OTHER", 2, "other");
        OTHER = enumC1323760kYI3;
        EnumC1323760kYI[] enumC1323760kYIArr = {enumC1323760kYI, enumC1323760kYI2, enumC1323760kYI3};
        LLILLJJLI = enumC1323760kYIArr;
        LLILLL = new C2254308sP(enumC1323760kYIArr);
    }

    public static EnumC1323760kYI[] values() {
        return (EnumC1323760kYI[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1323760kYI valueOf(String str) {
        return (EnumC1323760kYI) C08FF.LIZ(EnumC1323760kYI.class, str);
    }

    public EnumC1323760kYI(String str, int i, String str2) {
        this.LL = str2;
    }
}
