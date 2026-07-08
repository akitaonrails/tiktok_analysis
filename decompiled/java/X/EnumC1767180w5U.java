package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w5U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1767180w5U {
    public static final EnumC1767180w5U CLICK_CLOSE_BUTTON;
    public static final EnumC1767180w5U CLICK_GOTO_SHOP_BUTTON;
    public static final /* synthetic */ EnumC1767180w5U[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1767180w5U SHOW_MIGRATION_VIEW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1767180w5U> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1767180w5U enumC1767180w5U = new EnumC1767180w5U("SHOW_MIGRATION_VIEW", 0, 1);
        SHOW_MIGRATION_VIEW = enumC1767180w5U;
        EnumC1767180w5U enumC1767180w5U2 = new EnumC1767180w5U("CLICK_CLOSE_BUTTON", 1, 2);
        CLICK_CLOSE_BUTTON = enumC1767180w5U2;
        EnumC1767180w5U enumC1767180w5U3 = new EnumC1767180w5U("CLICK_GOTO_SHOP_BUTTON", 2, 3);
        CLICK_GOTO_SHOP_BUTTON = enumC1767180w5U3;
        EnumC1767180w5U[] enumC1767180w5UArr = {enumC1767180w5U, enumC1767180w5U2, enumC1767180w5U3};
        LLILLJJLI = enumC1767180w5UArr;
        LLILLL = new C2254308sP(enumC1767180w5UArr);
    }

    public static EnumC1767180w5U[] values() {
        return (EnumC1767180w5U[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1767180w5U valueOf(String str) {
        return (EnumC1767180w5U) C08FF.LIZ(EnumC1767180w5U.class, str);
    }

    public EnumC1767180w5U(String str, int i, int i2) {
        this.LL = i2;
    }
}
