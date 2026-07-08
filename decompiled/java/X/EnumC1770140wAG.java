package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wAG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1770140wAG {
    public static final EnumC1770140wAG CLICK_BUTTON;
    public static final EnumC1770140wAG CLICK_SHADOW;
    public static final EnumC1770140wAG DRAW_DOWN;
    public static final EnumC1770140wAG DRAW_UP;
    public static final /* synthetic */ EnumC1770140wAG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1770140wAG TAB_SWITCH;
    public static final EnumC1770140wAG TO_FYP_PROFILE;
    public static final EnumC1770140wAG TO_SUBPAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1770140wAG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1770140wAG enumC1770140wAG = new EnumC1770140wAG("CLICK_BUTTON", 0, "click_button");
        CLICK_BUTTON = enumC1770140wAG;
        EnumC1770140wAG enumC1770140wAG2 = new EnumC1770140wAG("CLICK_SHADOW", 1, "click_shadow");
        CLICK_SHADOW = enumC1770140wAG2;
        EnumC1770140wAG enumC1770140wAG3 = new EnumC1770140wAG("DRAW_UP", 2, "draw_up");
        DRAW_UP = enumC1770140wAG3;
        EnumC1770140wAG enumC1770140wAG4 = new EnumC1770140wAG("DRAW_DOWN", 3, "draw_down");
        DRAW_DOWN = enumC1770140wAG4;
        EnumC1770140wAG enumC1770140wAG5 = new EnumC1770140wAG("TO_SUBPAGE", 4, "to_subpage");
        TO_SUBPAGE = enumC1770140wAG5;
        EnumC1770140wAG enumC1770140wAG6 = new EnumC1770140wAG("TO_FYP_PROFILE", 5, "to_fyp_profile");
        TO_FYP_PROFILE = enumC1770140wAG6;
        EnumC1770140wAG enumC1770140wAG7 = new EnumC1770140wAG("TAB_SWITCH", 6, "tab_switch");
        TAB_SWITCH = enumC1770140wAG7;
        EnumC1770140wAG[] enumC1770140wAGArr = {enumC1770140wAG, enumC1770140wAG2, enumC1770140wAG3, enumC1770140wAG4, enumC1770140wAG5, enumC1770140wAG6, enumC1770140wAG7};
        LLILLJJLI = enumC1770140wAGArr;
        LLILLL = new C2254308sP(enumC1770140wAGArr);
    }

    public static EnumC1770140wAG[] values() {
        return (EnumC1770140wAG[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1770140wAG valueOf(String str) {
        return (EnumC1770140wAG) C08FF.LIZ(EnumC1770140wAG.class, str);
    }

    public EnumC1770140wAG(String str, int i, String str2) {
        this.LL = str2;
    }
}
