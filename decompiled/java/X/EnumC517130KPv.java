package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KPv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC517130KPv {
    public static final EnumC517130KPv EXTEND;
    public static final EnumC517130KPv GIFT;
    public static final /* synthetic */ EnumC517130KPv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC517130KPv MUSIC;
    public static final EnumC517130KPv PIN;
    public static final EnumC517130KPv SUBSCRIBE;
    public static final EnumC517130KPv SUPPORT;

    public static InterfaceC2044707zh<EnumC517130KPv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC517130KPv enumC517130KPv = new EnumC517130KPv("SUBSCRIBE", 0);
        SUBSCRIBE = enumC517130KPv;
        EnumC517130KPv enumC517130KPv2 = new EnumC517130KPv("EXTEND", 1);
        EXTEND = enumC517130KPv2;
        EnumC517130KPv enumC517130KPv3 = new EnumC517130KPv("SUPPORT", 2);
        SUPPORT = enumC517130KPv3;
        EnumC517130KPv enumC517130KPv4 = new EnumC517130KPv("GIFT", 3);
        GIFT = enumC517130KPv4;
        EnumC517130KPv enumC517130KPv5 = new EnumC517130KPv("MUSIC", 4);
        MUSIC = enumC517130KPv5;
        EnumC517130KPv enumC517130KPv6 = new EnumC517130KPv("PIN", 5);
        PIN = enumC517130KPv6;
        EnumC517130KPv[] enumC517130KPvArr = {enumC517130KPv, enumC517130KPv2, enumC517130KPv3, enumC517130KPv4, enumC517130KPv5, enumC517130KPv6};
        LL = enumC517130KPvArr;
        LLILLJJLI = new C2254308sP(enumC517130KPvArr);
    }

    public static EnumC517130KPv[] values() {
        return (EnumC517130KPv[]) LL.clone();
    }

    public static EnumC517130KPv valueOf(String str) {
        return (EnumC517130KPv) C08FF.LIZ(EnumC517130KPv.class, str);
    }

    public EnumC517130KPv(String str, int i) {
    }
}
