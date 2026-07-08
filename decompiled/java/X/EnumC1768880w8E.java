package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w8E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1768880w8E {
    public static final /* synthetic */ EnumC1768880w8E[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1768880w8E TAB_BADGE;
    public static final EnumC1768880w8E TAB_ICON;
    public static final EnumC1768880w8E TAB_TOOLTIP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1768880w8E> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1768880w8E enumC1768880w8E = new EnumC1768880w8E("TAB_TOOLTIP", 0, "tab_tooltip");
        TAB_TOOLTIP = enumC1768880w8E;
        EnumC1768880w8E enumC1768880w8E2 = new EnumC1768880w8E("TAB_ICON", 1, "tab_icon");
        TAB_ICON = enumC1768880w8E2;
        EnumC1768880w8E enumC1768880w8E3 = new EnumC1768880w8E("TAB_BADGE", 2, "tab_badge");
        TAB_BADGE = enumC1768880w8E3;
        EnumC1768880w8E[] enumC1768880w8EArr = {enumC1768880w8E, enumC1768880w8E2, enumC1768880w8E3};
        LLILLJJLI = enumC1768880w8EArr;
        LLILLL = new C2254308sP(enumC1768880w8EArr);
    }

    public static EnumC1768880w8E[] values() {
        return (EnumC1768880w8E[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1768880w8E valueOf(String str) {
        return (EnumC1768880w8E) C08FF.LIZ(EnumC1768880w8E.class, str);
    }

    public EnumC1768880w8E(String str, int i, String str2) {
        this.LL = str2;
    }
}
