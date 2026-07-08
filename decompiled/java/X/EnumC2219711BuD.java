package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1BuD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2219711BuD {
    public static final /* synthetic */ EnumC2219711BuD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2219711BuD MOBILE_2G;
    public static final EnumC2219711BuD MOBILE_3G;
    public static final EnumC2219711BuD MOBILE_4G;
    public static final EnumC2219711BuD MOBILE_5G;
    public static final EnumC2219711BuD MOBILE_UNKNOWN;
    public static final EnumC2219711BuD NONE;
    public static final EnumC2219711BuD UNKNOWN;
    public static final EnumC2219711BuD WIFI;

    public static InterfaceC2044707zh<EnumC2219711BuD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2219711BuD enumC2219711BuD = new EnumC2219711BuD("NONE", 0);
        NONE = enumC2219711BuD;
        EnumC2219711BuD enumC2219711BuD2 = new EnumC2219711BuD("UNKNOWN", 1);
        UNKNOWN = enumC2219711BuD2;
        EnumC2219711BuD enumC2219711BuD3 = new EnumC2219711BuD("WIFI", 2);
        WIFI = enumC2219711BuD3;
        EnumC2219711BuD enumC2219711BuD4 = new EnumC2219711BuD("MOBILE_2G", 3);
        MOBILE_2G = enumC2219711BuD4;
        EnumC2219711BuD enumC2219711BuD5 = new EnumC2219711BuD("MOBILE_3G", 4);
        MOBILE_3G = enumC2219711BuD5;
        EnumC2219711BuD enumC2219711BuD6 = new EnumC2219711BuD("MOBILE_4G", 5);
        MOBILE_4G = enumC2219711BuD6;
        EnumC2219711BuD enumC2219711BuD7 = new EnumC2219711BuD("MOBILE_5G", 6);
        MOBILE_5G = enumC2219711BuD7;
        EnumC2219711BuD enumC2219711BuD8 = new EnumC2219711BuD("MOBILE_UNKNOWN", 7);
        MOBILE_UNKNOWN = enumC2219711BuD8;
        EnumC2219711BuD[] enumC2219711BuDArr = {enumC2219711BuD, enumC2219711BuD2, enumC2219711BuD3, enumC2219711BuD4, enumC2219711BuD5, enumC2219711BuD6, enumC2219711BuD7, enumC2219711BuD8};
        LL = enumC2219711BuDArr;
        LLILLJJLI = new C2254308sP(enumC2219711BuDArr);
    }

    public static EnumC2219711BuD[] values() {
        return (EnumC2219711BuD[]) LL.clone();
    }

    public static EnumC2219711BuD valueOf(String str) {
        return (EnumC2219711BuD) C08FF.LIZ(EnumC2219711BuD.class, str);
    }

    public EnumC2219711BuD(String str, int i) {
    }
}
