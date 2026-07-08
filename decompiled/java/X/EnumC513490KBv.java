package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC513490KBv {
    public static final EnumC513490KBv ANY;
    public static final /* synthetic */ EnumC513490KBv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC513490KBv NORMAL_SUBSCRIPTION;
    public static final EnumC513490KBv PLAN_CHANGE;
    public static final EnumC513490KBv PRIVILEGE_PAGE;
    public static final EnumC513490KBv SUB_ONLY_LIVE_VIP_SUBSCRIPTION;
    public static final EnumC513490KBv UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC513490KBv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC513490KBv enumC513490KBv = new EnumC513490KBv("NORMAL_SUBSCRIPTION", 0, 0);
        NORMAL_SUBSCRIPTION = enumC513490KBv;
        EnumC513490KBv enumC513490KBv2 = new EnumC513490KBv("SUB_ONLY_LIVE_VIP_SUBSCRIPTION", 1, 1);
        SUB_ONLY_LIVE_VIP_SUBSCRIPTION = enumC513490KBv2;
        EnumC513490KBv enumC513490KBv3 = new EnumC513490KBv("PLAN_CHANGE", 2, 2);
        PLAN_CHANGE = enumC513490KBv3;
        EnumC513490KBv enumC513490KBv4 = new EnumC513490KBv("PRIVILEGE_PAGE", 3, 3);
        PRIVILEGE_PAGE = enumC513490KBv4;
        EnumC513490KBv enumC513490KBv5 = new EnumC513490KBv("UNKNOWN", 4, -1);
        UNKNOWN = enumC513490KBv5;
        EnumC513490KBv enumC513490KBv6 = new EnumC513490KBv("ANY", 5, -2);
        ANY = enumC513490KBv6;
        EnumC513490KBv[] enumC513490KBvArr = {enumC513490KBv, enumC513490KBv2, enumC513490KBv3, enumC513490KBv4, enumC513490KBv5, enumC513490KBv6};
        LLILLJJLI = enumC513490KBvArr;
        LLILLL = new C2254308sP(enumC513490KBvArr);
    }

    public static EnumC513490KBv[] values() {
        return (EnumC513490KBv[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC513490KBv valueOf(String str) {
        return (EnumC513490KBv) C08FF.LIZ(EnumC513490KBv.class, str);
    }

    public EnumC513490KBv(String str, int i, int i2) {
        this.LL = i2;
    }
}
