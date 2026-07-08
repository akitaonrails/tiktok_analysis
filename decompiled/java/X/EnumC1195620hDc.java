package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hDc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1195620hDc {
    public static final EnumC1195620hDc CHIP;
    public static final EnumC1195620hDc CHIPS;
    public static final EnumC1195620hDc HIGHLIGHT_INFO;
    public static final /* synthetic */ EnumC1195620hDc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1195620hDc RANKING_TAG;
    public static final EnumC1195620hDc RATING_BAR;
    public static final EnumC1195620hDc RATING_INPUT;
    public static final EnumC1195620hDc SURVEY_FEEDBACK;
    public static final EnumC1195620hDc SURVEY_RATING;
    public static final EnumC1195620hDc VIEW_MORE_BUTTON;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1195620hDc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1195620hDc enumC1195620hDc = new EnumC1195620hDc("VIEW_MORE_BUTTON", 0, "view_more_button");
        VIEW_MORE_BUTTON = enumC1195620hDc;
        EnumC1195620hDc enumC1195620hDc2 = new EnumC1195620hDc("SURVEY_RATING", 1, "survey_rating");
        SURVEY_RATING = enumC1195620hDc2;
        EnumC1195620hDc enumC1195620hDc3 = new EnumC1195620hDc("SURVEY_FEEDBACK", 2, "survey_feedback");
        SURVEY_FEEDBACK = enumC1195620hDc3;
        EnumC1195620hDc enumC1195620hDc4 = new EnumC1195620hDc("RATING_INPUT", 3, "rating_input");
        RATING_INPUT = enumC1195620hDc4;
        EnumC1195620hDc enumC1195620hDc5 = new EnumC1195620hDc("RATING_BAR", 4, "rating_bar");
        RATING_BAR = enumC1195620hDc5;
        EnumC1195620hDc enumC1195620hDc6 = new EnumC1195620hDc("HIGHLIGHT_INFO", 5, "highlight_info");
        HIGHLIGHT_INFO = enumC1195620hDc6;
        EnumC1195620hDc enumC1195620hDc7 = new EnumC1195620hDc("CHIP", 6, "chip");
        CHIP = enumC1195620hDc7;
        EnumC1195620hDc enumC1195620hDc8 = new EnumC1195620hDc("CHIPS", 7, "chips");
        CHIPS = enumC1195620hDc8;
        EnumC1195620hDc enumC1195620hDc9 = new EnumC1195620hDc("RANKING_TAG", 8, "ranking_tag");
        RANKING_TAG = enumC1195620hDc9;
        EnumC1195620hDc[] enumC1195620hDcArr = {enumC1195620hDc, enumC1195620hDc2, enumC1195620hDc3, enumC1195620hDc4, enumC1195620hDc5, enumC1195620hDc6, enumC1195620hDc7, enumC1195620hDc8, enumC1195620hDc9};
        LLILLJJLI = enumC1195620hDcArr;
        LLILLL = new C2254308sP(enumC1195620hDcArr);
    }

    public static EnumC1195620hDc[] values() {
        return (EnumC1195620hDc[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1195620hDc valueOf(String str) {
        return (EnumC1195620hDc) C08FF.LIZ(EnumC1195620hDc.class, str);
    }

    public EnumC1195620hDc(String str, int i, String str2) {
        this.LL = str2;
    }
}
