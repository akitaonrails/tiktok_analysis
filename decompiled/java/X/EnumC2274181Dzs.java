package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Dzs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class EnumC2274181Dzs {
    public static final EnumC2274181Dzs AME_EFFECT_DETAIL_PAGE;
    public static final EnumC2274181Dzs AME_MAIN_PAGE;
    public static final /* synthetic */ EnumC2274181Dzs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2274181Dzs MAIN_TEMPLATE_CATEGORY_TAB;
    public static final EnumC2274181Dzs PROFILE_AME_EFFECT_TAB;
    public static final EnumC2274181Dzs SHOOT_EFFECT_TEMPLATE_TAB;
    public static final EnumC2274181Dzs TT_LAUNCH;
    public static final EnumC2274181Dzs TT_MAIN_PROFILE;
    public static final EnumC2274181Dzs TT_MAIN_SHOT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2274181Dzs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2274181Dzs enumC2274181Dzs = new EnumC2274181Dzs("TT_LAUNCH", 0, "tt_launch");
        TT_LAUNCH = enumC2274181Dzs;
        EnumC2274181Dzs enumC2274181Dzs2 = new EnumC2274181Dzs("PROFILE_AME_EFFECT_TAB", 1, "profile_ame_effect_tab");
        PROFILE_AME_EFFECT_TAB = enumC2274181Dzs2;
        EnumC2274181Dzs enumC2274181Dzs3 = new EnumC2274181Dzs("SHOOT_EFFECT_TEMPLATE_TAB", 2, "shoot_effect_template_tab");
        SHOOT_EFFECT_TEMPLATE_TAB = enumC2274181Dzs3;
        EnumC2274181Dzs enumC2274181Dzs4 = new EnumC2274181Dzs("MAIN_TEMPLATE_CATEGORY_TAB", 3, "main_template_category_tab");
        MAIN_TEMPLATE_CATEGORY_TAB = enumC2274181Dzs4;
        EnumC2274181Dzs enumC2274181Dzs5 = new EnumC2274181Dzs("TT_MAIN_PROFILE", 4, "tt_main_profile");
        TT_MAIN_PROFILE = enumC2274181Dzs5;
        EnumC2274181Dzs enumC2274181Dzs6 = new EnumC2274181Dzs("TT_MAIN_SHOT", 5, "tt_main_shot");
        TT_MAIN_SHOT = enumC2274181Dzs6;
        EnumC2274181Dzs enumC2274181Dzs7 = new EnumC2274181Dzs("AME_EFFECT_DETAIL_PAGE", 6, "ame_effect_detail_page");
        AME_EFFECT_DETAIL_PAGE = enumC2274181Dzs7;
        EnumC2274181Dzs enumC2274181Dzs8 = new EnumC2274181Dzs("AME_MAIN_PAGE", 7, "ame_main_page");
        AME_MAIN_PAGE = enumC2274181Dzs8;
        EnumC2274181Dzs[] enumC2274181DzsArr = {enumC2274181Dzs, enumC2274181Dzs2, enumC2274181Dzs3, enumC2274181Dzs4, enumC2274181Dzs5, enumC2274181Dzs6, enumC2274181Dzs7, enumC2274181Dzs8};
        LLILLJJLI = enumC2274181DzsArr;
        LLILLL = new C2254308sP(enumC2274181DzsArr);
    }

    public static EnumC2274181Dzs[] values() {
        return (EnumC2274181Dzs[]) LLILLJJLI.clone();
    }

    public final String getConfigName() {
        return this.LL;
    }

    public static EnumC2274181Dzs valueOf(String str) {
        return (EnumC2274181Dzs) C08FF.LIZ(EnumC2274181Dzs.class, str);
    }

    public EnumC2274181Dzs(String str, int i, String str2) {
        this.LL = str2;
    }
}
