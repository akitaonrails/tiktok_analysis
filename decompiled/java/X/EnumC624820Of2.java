package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Of2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC624820Of2 {
    public static final EnumC624820Of2 CLICK_TURNON;
    public static final EnumC624820Of2 CONTINUE;
    public static final EnumC624820Of2 DOWNLOAD;
    public static final EnumC624820Of2 FYP_BUTTON;
    public static final EnumC624820Of2 FYP_PANEL;
    public static final EnumC624820Of2 ICON;
    public static final /* synthetic */ EnumC624820Of2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC624820Of2 PSP;
    public static final EnumC624820Of2 REFRESH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC624820Of2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC624820Of2 enumC624820Of2 = new EnumC624820Of2("DOWNLOAD", 0, "download");
        DOWNLOAD = enumC624820Of2;
        EnumC624820Of2 enumC624820Of22 = new EnumC624820Of2("CONTINUE", 1, "continue");
        CONTINUE = enumC624820Of22;
        EnumC624820Of2 enumC624820Of23 = new EnumC624820Of2("FYP_PANEL", 2, "fyp_panel");
        FYP_PANEL = enumC624820Of23;
        EnumC624820Of2 enumC624820Of24 = new EnumC624820Of2("ICON", 3, "icon");
        ICON = enumC624820Of24;
        EnumC624820Of2 enumC624820Of25 = new EnumC624820Of2("REFRESH", 4, "refresh");
        REFRESH = enumC624820Of25;
        EnumC624820Of2 enumC624820Of26 = new EnumC624820Of2("FYP_BUTTON", 5, "fyp_button");
        FYP_BUTTON = enumC624820Of26;
        EnumC624820Of2 enumC624820Of27 = new EnumC624820Of2("PSP", 6, "psp");
        PSP = enumC624820Of27;
        EnumC624820Of2 enumC624820Of28 = new EnumC624820Of2("CLICK_TURNON", 7, "click_turnon");
        CLICK_TURNON = enumC624820Of28;
        EnumC624820Of2[] enumC624820Of2Arr = {enumC624820Of2, enumC624820Of22, enumC624820Of23, enumC624820Of24, enumC624820Of25, enumC624820Of26, enumC624820Of27, enumC624820Of28};
        LLILLJJLI = enumC624820Of2Arr;
        LLILLL = new C2254308sP(enumC624820Of2Arr);
    }

    public static EnumC624820Of2[] values() {
        return (EnumC624820Of2[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC624820Of2 valueOf(String str) {
        return (EnumC624820Of2) C08FF.LIZ(EnumC624820Of2.class, str);
    }

    public EnumC624820Of2(String str, int i, String str2) {
        this.LL = str2;
    }
}
