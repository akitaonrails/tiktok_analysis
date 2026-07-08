package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rcl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1595610rcl {
    public static final EnumC1595610rcl DOUBLE_LIVE_REFRESH;
    public static final /* synthetic */ EnumC1595610rcl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1595610rcl NO_REFRESH;
    public static final EnumC1595610rcl SINGLE_LIVE_REFRESH;

    public static InterfaceC2044707zh<EnumC1595610rcl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1595610rcl enumC1595610rcl = new EnumC1595610rcl("SINGLE_LIVE_REFRESH", 0);
        SINGLE_LIVE_REFRESH = enumC1595610rcl;
        EnumC1595610rcl enumC1595610rcl2 = new EnumC1595610rcl("DOUBLE_LIVE_REFRESH", 1);
        DOUBLE_LIVE_REFRESH = enumC1595610rcl2;
        EnumC1595610rcl enumC1595610rcl3 = new EnumC1595610rcl("NO_REFRESH", 2);
        NO_REFRESH = enumC1595610rcl3;
        EnumC1595610rcl[] enumC1595610rclArr = {enumC1595610rcl, enumC1595610rcl2, enumC1595610rcl3};
        LL = enumC1595610rclArr;
        LLILLJJLI = new C2254308sP(enumC1595610rclArr);
    }

    public static EnumC1595610rcl[] values() {
        return (EnumC1595610rcl[]) LL.clone();
    }

    public static EnumC1595610rcl valueOf(String str) {
        return (EnumC1595610rcl) C08FF.LIZ(EnumC1595610rcl.class, str);
    }

    public EnumC1595610rcl(String str, int i) {
    }
}
