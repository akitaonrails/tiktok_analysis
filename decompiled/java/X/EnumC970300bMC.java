package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bMC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC970300bMC {
    public static final EnumC970300bMC CONTRIBUTE_ENTRANCE;
    public static final /* synthetic */ EnumC970300bMC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC970300bMC MATCH_HEALTH_BAR;
    public static final EnumC970300bMC MATCH_TITLE_BAR;
    public static final EnumC970300bMC PERSONAL_SCORE;
    public static final EnumC970300bMC REMATCH_BUTTON;
    public static final EnumC970300bMC RESULT_ANIMATION;
    public static final EnumC970300bMC START_ANIMATION;
    public final String LL;

    public static InterfaceC2044707zh<EnumC970300bMC> getEntries() {
        return LLILLL;
    }

    static {
        EnumC970300bMC enumC970300bMC = new EnumC970300bMC("MATCH_HEALTH_BAR", 0, "match_score_bar");
        MATCH_HEALTH_BAR = enumC970300bMC;
        EnumC970300bMC enumC970300bMC2 = new EnumC970300bMC("MATCH_TITLE_BAR", 1, "match_title_bar");
        MATCH_TITLE_BAR = enumC970300bMC2;
        EnumC970300bMC enumC970300bMC3 = new EnumC970300bMC("CONTRIBUTE_ENTRANCE", 2, "match_contribute_entrance");
        CONTRIBUTE_ENTRANCE = enumC970300bMC3;
        EnumC970300bMC enumC970300bMC4 = new EnumC970300bMC("START_ANIMATION", 3, "match_start_animation");
        START_ANIMATION = enumC970300bMC4;
        EnumC970300bMC enumC970300bMC5 = new EnumC970300bMC("PERSONAL_SCORE", 4, "match_personal_score");
        PERSONAL_SCORE = enumC970300bMC5;
        EnumC970300bMC enumC970300bMC6 = new EnumC970300bMC("RESULT_ANIMATION", 5, "match_result_animation");
        RESULT_ANIMATION = enumC970300bMC6;
        EnumC970300bMC enumC970300bMC7 = new EnumC970300bMC("REMATCH_BUTTON", 6, "match_rematch_button");
        REMATCH_BUTTON = enumC970300bMC7;
        EnumC970300bMC[] enumC970300bMCArr = {enumC970300bMC, enumC970300bMC2, enumC970300bMC3, enumC970300bMC4, enumC970300bMC5, enumC970300bMC6, enumC970300bMC7};
        LLILLJJLI = enumC970300bMCArr;
        LLILLL = new C2254308sP(enumC970300bMCArr);
    }

    public static EnumC970300bMC[] values() {
        return (EnumC970300bMC[]) LLILLJJLI.clone();
    }

    public final String getScene() {
        return this.LL;
    }

    public static EnumC970300bMC valueOf(String str) {
        return (EnumC970300bMC) C08FF.LIZ(EnumC970300bMC.class, str);
    }

    public EnumC970300bMC(String str, int i, String str2) {
        this.LL = str2;
    }
}
