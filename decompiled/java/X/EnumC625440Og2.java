package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Og2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC625440Og2 {
    public static final EnumC625440Og2 AUTO_CLEAR;
    public static final EnumC625440Og2 CLICK_CLEAR_ICON;
    public static final /* synthetic */ EnumC625440Og2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC625440Og2 SETTING_PAGE_CLEAR;
    public final String LL;

    public static InterfaceC2044707zh<EnumC625440Og2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC625440Og2 enumC625440Og2 = new EnumC625440Og2("CLICK_CLEAR_ICON", 0, "click_clear_icon");
        CLICK_CLEAR_ICON = enumC625440Og2;
        EnumC625440Og2 enumC625440Og22 = new EnumC625440Og2("AUTO_CLEAR", 1, "auto_clear");
        AUTO_CLEAR = enumC625440Og22;
        EnumC625440Og2 enumC625440Og23 = new EnumC625440Og2("SETTING_PAGE_CLEAR", 2, "setting_page_clear");
        SETTING_PAGE_CLEAR = enumC625440Og23;
        EnumC625440Og2[] enumC625440Og2Arr = {enumC625440Og2, enumC625440Og22, enumC625440Og23};
        LLILLJJLI = enumC625440Og2Arr;
        LLILLL = new C2254308sP(enumC625440Og2Arr);
    }

    public static EnumC625440Og2[] values() {
        return (EnumC625440Og2[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC625440Og2 valueOf(String str) {
        return (EnumC625440Og2) C08FF.LIZ(EnumC625440Og2.class, str);
    }

    public EnumC625440Og2(String str, int i, String str2) {
        this.LL = str2;
    }
}
