package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bUT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC975430bUT {
    public static final /* synthetic */ EnumC975430bUT[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC975430bUT NORMAL;
    public static final EnumC975430bUT PERSONAL_SCORE_POSITION;
    public static final EnumC975430bUT PERSONAL_SCORE_SHOW;
    public static final EnumC975430bUT PERSONAL_SCORE_VALUE;
    public static final EnumC975430bUT SCORE_BAR_POSITION;
    public static final EnumC975430bUT SCORE_BAR_SHOW;
    public static final EnumC975430bUT SCORE_BAR_VALUE;
    public static final EnumC975430bUT SCORE_DROP_OFF;
    public static final EnumC975430bUT SCORE_RESULT_CONSISTENT;
    public static final EnumC975430bUT SCORE_UI_CONSISTENT;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC975430bUT> getEntries() {
        return LLILZ;
    }

    static {
        EnumC975430bUT enumC975430bUT = new EnumC975430bUT("NORMAL", 0, 0, "normal");
        NORMAL = enumC975430bUT;
        EnumC975430bUT enumC975430bUT2 = new EnumC975430bUT("SCORE_BAR_SHOW", 1, 1, "score_bar_show");
        SCORE_BAR_SHOW = enumC975430bUT2;
        EnumC975430bUT enumC975430bUT3 = new EnumC975430bUT("SCORE_BAR_POSITION", 2, 2, "score_bar_position");
        SCORE_BAR_POSITION = enumC975430bUT3;
        EnumC975430bUT enumC975430bUT4 = new EnumC975430bUT("SCORE_BAR_VALUE", 3, 4, "score_bar_value");
        SCORE_BAR_VALUE = enumC975430bUT4;
        EnumC975430bUT enumC975430bUT5 = new EnumC975430bUT("PERSONAL_SCORE_SHOW", 4, 8, "personal_score_show");
        PERSONAL_SCORE_SHOW = enumC975430bUT5;
        EnumC975430bUT enumC975430bUT6 = new EnumC975430bUT("PERSONAL_SCORE_POSITION", 5, 16, "personal_score_position");
        PERSONAL_SCORE_POSITION = enumC975430bUT6;
        EnumC975430bUT enumC975430bUT7 = new EnumC975430bUT("PERSONAL_SCORE_VALUE", 6, 32, "personal_score_value");
        PERSONAL_SCORE_VALUE = enumC975430bUT7;
        EnumC975430bUT enumC975430bUT8 = new EnumC975430bUT("SCORE_UI_CONSISTENT", 7, 64, "score_ui_consistent");
        SCORE_UI_CONSISTENT = enumC975430bUT8;
        EnumC975430bUT enumC975430bUT9 = new EnumC975430bUT("SCORE_RESULT_CONSISTENT", 8, 128, "score_result_consistent");
        SCORE_RESULT_CONSISTENT = enumC975430bUT9;
        EnumC975430bUT enumC975430bUT10 = new EnumC975430bUT("SCORE_DROP_OFF", 9, 1024, "score_drop_off");
        SCORE_DROP_OFF = enumC975430bUT10;
        EnumC975430bUT[] enumC975430bUTArr = {enumC975430bUT, enumC975430bUT2, enumC975430bUT3, enumC975430bUT4, enumC975430bUT5, enumC975430bUT6, enumC975430bUT7, enumC975430bUT8, enumC975430bUT9, enumC975430bUT10};
        LLILLL = enumC975430bUTArr;
        LLILZ = new C2254308sP(enumC975430bUTArr);
    }

    public static EnumC975430bUT[] values() {
        return (EnumC975430bUT[]) LLILLL.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public final String getValueStr() {
        return this.LLILLJJLI;
    }

    public static EnumC975430bUT valueOf(String str) {
        return (EnumC975430bUT) C08FF.LIZ(EnumC975430bUT.class, str);
    }

    public EnumC975430bUT(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
