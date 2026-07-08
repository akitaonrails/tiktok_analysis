package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1767410w5r {
    public static final EnumC1767410w5r CLICK_TAB;
    public static final /* synthetic */ EnumC1767410w5r[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1767410w5r ROUTE;

    public static InterfaceC2044707zh<EnumC1767410w5r> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1767410w5r enumC1767410w5r = new EnumC1767410w5r("CLICK_TAB", 0);
        CLICK_TAB = enumC1767410w5r;
        EnumC1767410w5r enumC1767410w5r2 = new EnumC1767410w5r("ROUTE", 1);
        ROUTE = enumC1767410w5r2;
        EnumC1767410w5r[] enumC1767410w5rArr = {enumC1767410w5r, enumC1767410w5r2};
        LL = enumC1767410w5rArr;
        LLILLJJLI = new C2254308sP(enumC1767410w5rArr);
    }

    public static EnumC1767410w5r[] values() {
        return (EnumC1767410w5r[]) LL.clone();
    }

    public static EnumC1767410w5r valueOf(String str) {
        return (EnumC1767410w5r) C08FF.LIZ(EnumC1767410w5r.class, str);
    }

    public EnumC1767410w5r(String str, int i) {
    }
}
