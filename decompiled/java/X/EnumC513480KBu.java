package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KBu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC513480KBu {
    public static final EnumC513480KBu ANY;
    public static final /* synthetic */ EnumC513480KBu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC513480KBu NORMAL_SUBSCRIPTION;
    public static final EnumC513480KBu PLAN_CHANGE;
    public static final EnumC513480KBu PRIVILEGE_PAGE;
    public static final EnumC513480KBu SUB_ONLY_LIVE_VIP_SUBSCRIPTION;
    public static final EnumC513480KBu UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC513480KBu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC513480KBu enumC513480KBu = new EnumC513480KBu("NORMAL_SUBSCRIPTION", 0, 0);
        NORMAL_SUBSCRIPTION = enumC513480KBu;
        EnumC513480KBu enumC513480KBu2 = new EnumC513480KBu("SUB_ONLY_LIVE_VIP_SUBSCRIPTION", 1, 1);
        SUB_ONLY_LIVE_VIP_SUBSCRIPTION = enumC513480KBu2;
        EnumC513480KBu enumC513480KBu3 = new EnumC513480KBu("PLAN_CHANGE", 2, 2);
        PLAN_CHANGE = enumC513480KBu3;
        EnumC513480KBu enumC513480KBu4 = new EnumC513480KBu("PRIVILEGE_PAGE", 3, 3);
        PRIVILEGE_PAGE = enumC513480KBu4;
        EnumC513480KBu enumC513480KBu5 = new EnumC513480KBu("UNKNOWN", 4, -1);
        UNKNOWN = enumC513480KBu5;
        EnumC513480KBu enumC513480KBu6 = new EnumC513480KBu("ANY", 5, -2);
        ANY = enumC513480KBu6;
        EnumC513480KBu[] enumC513480KBuArr = {enumC513480KBu, enumC513480KBu2, enumC513480KBu3, enumC513480KBu4, enumC513480KBu5, enumC513480KBu6};
        LLILLJJLI = enumC513480KBuArr;
        LLILLL = new C2254308sP(enumC513480KBuArr);
    }

    public static EnumC513480KBu[] values() {
        return (EnumC513480KBu[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC513480KBu valueOf(String str) {
        return (EnumC513480KBu) C08FF.LIZ(EnumC513480KBu.class, str);
    }

    public EnumC513480KBu(String str, int i, int i2) {
        this.LL = i2;
    }
}
