package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fjv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1138770fjv {
    public static final EnumC1138770fjv DELETE_ALL;
    public static final EnumC1138770fjv DELETE_UNUSED;
    public static final /* synthetic */ EnumC1138770fjv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1138770fjv MESSAGE_USE;
    public static final EnumC1138770fjv ONLY_CHECK;
    public static final EnumC1138770fjv PRE_DOWNLOAD;

    public static InterfaceC2044707zh<EnumC1138770fjv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1138770fjv enumC1138770fjv = new EnumC1138770fjv("PRE_DOWNLOAD", 0);
        PRE_DOWNLOAD = enumC1138770fjv;
        EnumC1138770fjv enumC1138770fjv2 = new EnumC1138770fjv("MESSAGE_USE", 1);
        MESSAGE_USE = enumC1138770fjv2;
        EnumC1138770fjv enumC1138770fjv3 = new EnumC1138770fjv("DELETE_UNUSED", 2);
        DELETE_UNUSED = enumC1138770fjv3;
        EnumC1138770fjv enumC1138770fjv4 = new EnumC1138770fjv("DELETE_ALL", 3);
        DELETE_ALL = enumC1138770fjv4;
        EnumC1138770fjv enumC1138770fjv5 = new EnumC1138770fjv("ONLY_CHECK", 4);
        ONLY_CHECK = enumC1138770fjv5;
        EnumC1138770fjv[] enumC1138770fjvArr = {enumC1138770fjv, enumC1138770fjv2, enumC1138770fjv3, enumC1138770fjv4, enumC1138770fjv5};
        LL = enumC1138770fjvArr;
        LLILLJJLI = new C2254308sP(enumC1138770fjvArr);
    }

    public static EnumC1138770fjv[] values() {
        return (EnumC1138770fjv[]) LL.clone();
    }

    public static EnumC1138770fjv valueOf(String str) {
        return (EnumC1138770fjv) C08FF.LIZ(EnumC1138770fjv.class, str);
    }

    public EnumC1138770fjv(String str, int i) {
    }
}
