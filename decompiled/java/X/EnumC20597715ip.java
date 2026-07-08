package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15ip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20597715ip {
    public static final EnumC20597715ip ALL;
    public static final /* synthetic */ EnumC20597715ip[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20597715ip SELF;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20597715ip> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20597715ip enumC20597715ip = new EnumC20597715ip("SELF", 0, "self");
        SELF = enumC20597715ip;
        EnumC20597715ip enumC20597715ip2 = new EnumC20597715ip("ALL", 1, "all");
        ALL = enumC20597715ip2;
        EnumC20597715ip[] enumC20597715ipArr = {enumC20597715ip, enumC20597715ip2};
        LLILLJJLI = enumC20597715ipArr;
        LLILLL = new C2254308sP(enumC20597715ipArr);
    }

    public static EnumC20597715ip[] values() {
        return (EnumC20597715ip[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20597715ip valueOf(String str) {
        return (EnumC20597715ip) C08FF.LIZ(EnumC20597715ip.class, str);
    }

    public EnumC20597715ip(String str, int i, String str2) {
        this.LL = str2;
    }
}
