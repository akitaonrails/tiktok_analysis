package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wAF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1770130wAF {
    public static final EnumC1770130wAF CLICK_BUTTON;
    public static final EnumC1770130wAF CLICK_SHADOW;
    public static final EnumC1770130wAF DRAW_DOWN;
    public static final EnumC1770130wAF DRAW_UP;
    public static final /* synthetic */ EnumC1770130wAF[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1770130wAF TAB_SWITCH;
    public static final EnumC1770130wAF TO_FYP_PROFILE;
    public static final EnumC1770130wAF TO_SUBPAGE;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1770130wAF> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1770130wAF enumC1770130wAF = new EnumC1770130wAF("CLICK_BUTTON", 0, "click_button", "click_fyp_ecom_video_shop_now_button");
        CLICK_BUTTON = enumC1770130wAF;
        EnumC1770130wAF enumC1770130wAF2 = new EnumC1770130wAF("CLICK_SHADOW", 1, "click_shadow", "click_mask_page");
        CLICK_SHADOW = enumC1770130wAF2;
        EnumC1770130wAF enumC1770130wAF3 = new EnumC1770130wAF("DRAW_UP", 2, "draw_up", "draw_up");
        DRAW_UP = enumC1770130wAF3;
        EnumC1770130wAF enumC1770130wAF4 = new EnumC1770130wAF("DRAW_DOWN", 3, "draw_down", "draw_down");
        DRAW_DOWN = enumC1770130wAF4;
        EnumC1770130wAF enumC1770130wAF5 = new EnumC1770130wAF("TO_SUBPAGE", 4, "to_subpage", "to_subpage");
        TO_SUBPAGE = enumC1770130wAF5;
        EnumC1770130wAF enumC1770130wAF6 = new EnumC1770130wAF("TO_FYP_PROFILE", 5, "to_fyp_profile", "to_fyp_profile");
        TO_FYP_PROFILE = enumC1770130wAF6;
        EnumC1770130wAF enumC1770130wAF7 = new EnumC1770130wAF("TAB_SWITCH", 6, "tab_switch", "switch_tab");
        TAB_SWITCH = enumC1770130wAF7;
        EnumC1770130wAF[] enumC1770130wAFArr = {enumC1770130wAF, enumC1770130wAF2, enumC1770130wAF3, enumC1770130wAF4, enumC1770130wAF5, enumC1770130wAF6, enumC1770130wAF7};
        LLILLL = enumC1770130wAFArr;
        LLILZ = new C2254308sP(enumC1770130wAFArr);
    }

    public static EnumC1770130wAF[] values() {
        return (EnumC1770130wAF[]) LLILLL.clone();
    }

    public final String getDaValue() {
        return this.LLILLJJLI;
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1770130wAF valueOf(String str) {
        return (EnumC1770130wAF) C08FF.LIZ(EnumC1770130wAF.class, str);
    }

    public EnumC1770130wAF(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
