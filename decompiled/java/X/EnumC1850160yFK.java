package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yFK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1850160yFK {
    public static final EnumC1850160yFK AI_RECOMMEND_MUSIC_CARD_LIST_VIEW;
    public static final /* synthetic */ EnumC1850160yFK[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1850160yFK NEW_AI_RECOMMENDED_MUSIC_SHEET_MUSIC_VIEW;
    public static final EnumC1850160yFK NEW_AI_RECOMMENDED_MUSIC_SHEET_MV_VIEW;
    public static final EnumC1850160yFK NOTHING;
    public static final EnumC1850160yFK ONLY_COMMERCIAL_MUSIC_TEXT_VIEW;
    public final boolean LL;
    public final EnumC1850200yFO LLILLJJLI;
    public final EnumC1839020xxM LLILLL;

    public static InterfaceC2044707zh<EnumC1850160yFK> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC1850160yFK enumC1850160yFK = new EnumC1850160yFK("NOTHING", 0, true, EnumC1850200yFO.DIRECT_TO_SHOOT, EnumC1839020xxM.NONE);
        NOTHING = enumC1850160yFK;
        EnumC1850200yFO enumC1850200yFO = EnumC1850200yFO.BANNED;
        EnumC1850160yFK enumC1850160yFK2 = new EnumC1850160yFK("ONLY_COMMERCIAL_MUSIC_TEXT_VIEW", 1, false, enumC1850200yFO, EnumC1839020xxM.TEXT_ONLY);
        ONLY_COMMERCIAL_MUSIC_TEXT_VIEW = enumC1850160yFK2;
        EnumC1850160yFK enumC1850160yFK3 = new EnumC1850160yFK("AI_RECOMMEND_MUSIC_CARD_LIST_VIEW", 2, false, enumC1850200yFO, EnumC1839020xxM.RECOMMEND_MUSIC_LIST);
        AI_RECOMMEND_MUSIC_CARD_LIST_VIEW = enumC1850160yFK3;
        EnumC1850160yFK enumC1850160yFK4 = new EnumC1850160yFK("NEW_AI_RECOMMENDED_MUSIC_SHEET_MV_VIEW", 3, true, EnumC1850200yFO.DIRECT_TO_MUSIC_VIDEO_SHEET, EnumC1839020xxM.NEW_UI_2_MV_LIST_SHEET);
        NEW_AI_RECOMMENDED_MUSIC_SHEET_MV_VIEW = enumC1850160yFK4;
        EnumC1850160yFK enumC1850160yFK5 = new EnumC1850160yFK("NEW_AI_RECOMMENDED_MUSIC_SHEET_MUSIC_VIEW", 4, true, EnumC1850200yFO.DIRECT_TO_MUSIC_LIST_SHEET, EnumC1839020xxM.NEW_UI_2_MUSIC_LIST_SHEET);
        NEW_AI_RECOMMENDED_MUSIC_SHEET_MUSIC_VIEW = enumC1850160yFK5;
        EnumC1850160yFK[] enumC1850160yFKArr = {enumC1850160yFK, enumC1850160yFK2, enumC1850160yFK3, enumC1850160yFK4, enumC1850160yFK5};
        LLILZ = enumC1850160yFKArr;
        LLILZIL = new C2254308sP(enumC1850160yFKArr);
    }

    public static EnumC1850160yFK[] values() {
        return (EnumC1850160yFK[]) LLILZ.clone();
    }

    public final boolean getEnableNormalUiElements() {
        return this.LL;
    }

    public final EnumC1850200yFO getShootAction() {
        return this.LLILLJJLI;
    }

    public final EnumC1839020xxM getVersion() {
        return this.LLILLL;
    }

    public static EnumC1850160yFK valueOf(String str) {
        return (EnumC1850160yFK) C08FF.LIZ(EnumC1850160yFK.class, str);
    }

    public EnumC1850160yFK(String str, int i, boolean z, EnumC1850200yFO enumC1850200yFO, EnumC1839020xxM enumC1839020xxM) {
        this.LL = z;
        this.LLILLJJLI = enumC1850200yFO;
        this.LLILLL = enumC1839020xxM;
    }
}
