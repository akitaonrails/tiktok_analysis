package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0E8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC359810E8t {
    public static final EnumC359810E8t ADJUST_FILTER;
    public static final EnumC359810E8t AI_GENERATING;
    public static final EnumC359810E8t AUDIO_MUSIC;
    public static final EnumC359810E8t AUDIO_NONE;
    public static final EnumC359810E8t AUDIO_RECORD;
    public static final EnumC359810E8t AUDIO_SOUND_EFFECT;
    public static final EnumC359810E8t CAPTION;
    public static final EnumC359810E8t EFFECT;
    public static final EnumC359810E8t FILTER;
    public static final /* synthetic */ EnumC359810E8t[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC359810E8t LYRIC;
    public static final EnumC359810E8t MAGIC_GENERATING;
    public static final EnumC359810E8t MAIN_VIDEO;
    public static final EnumC359810E8t STICKER;
    public static final EnumC359810E8t SUB_VIDEO;
    public static final EnumC359810E8t TEXT;

    public static InterfaceC2044707zh<EnumC359810E8t> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC359810E8t enumC359810E8t = new EnumC359810E8t("MAIN_VIDEO", 0);
        MAIN_VIDEO = enumC359810E8t;
        EnumC359810E8t enumC359810E8t2 = new EnumC359810E8t("SUB_VIDEO", 1);
        SUB_VIDEO = enumC359810E8t2;
        EnumC359810E8t enumC359810E8t3 = new EnumC359810E8t("AUDIO_SOUND_EFFECT", 2);
        AUDIO_SOUND_EFFECT = enumC359810E8t3;
        EnumC359810E8t enumC359810E8t4 = new EnumC359810E8t("AUDIO_MUSIC", 3);
        AUDIO_MUSIC = enumC359810E8t4;
        EnumC359810E8t enumC359810E8t5 = new EnumC359810E8t("AUDIO_RECORD", 4);
        AUDIO_RECORD = enumC359810E8t5;
        EnumC359810E8t enumC359810E8t6 = new EnumC359810E8t("AUDIO_NONE", 5);
        AUDIO_NONE = enumC359810E8t6;
        EnumC359810E8t enumC359810E8t7 = new EnumC359810E8t("CAPTION", 6);
        CAPTION = enumC359810E8t7;
        EnumC359810E8t enumC359810E8t8 = new EnumC359810E8t("TEXT", 7);
        TEXT = enumC359810E8t8;
        EnumC359810E8t enumC359810E8t9 = new EnumC359810E8t("EFFECT", 8);
        EFFECT = enumC359810E8t9;
        EnumC359810E8t enumC359810E8t10 = new EnumC359810E8t("STICKER", 9);
        STICKER = enumC359810E8t10;
        EnumC359810E8t enumC359810E8t11 = new EnumC359810E8t("FILTER", 10);
        FILTER = enumC359810E8t11;
        EnumC359810E8t enumC359810E8t12 = new EnumC359810E8t("ADJUST_FILTER", 11);
        ADJUST_FILTER = enumC359810E8t12;
        EnumC359810E8t enumC359810E8t13 = new EnumC359810E8t("AI_GENERATING", 12);
        AI_GENERATING = enumC359810E8t13;
        EnumC359810E8t enumC359810E8t14 = new EnumC359810E8t("MAGIC_GENERATING", 13);
        MAGIC_GENERATING = enumC359810E8t14;
        EnumC359810E8t enumC359810E8t15 = new EnumC359810E8t("LYRIC", 14);
        LYRIC = enumC359810E8t15;
        EnumC359810E8t[] enumC359810E8tArr = {enumC359810E8t, enumC359810E8t2, enumC359810E8t3, enumC359810E8t4, enumC359810E8t5, enumC359810E8t6, enumC359810E8t7, enumC359810E8t8, enumC359810E8t9, enumC359810E8t10, enumC359810E8t11, enumC359810E8t12, enumC359810E8t13, enumC359810E8t14, enumC359810E8t15};
        LL = enumC359810E8tArr;
        LLILLJJLI = new C2254308sP(enumC359810E8tArr);
    }

    public static EnumC359810E8t[] values() {
        return (EnumC359810E8t[]) LL.clone();
    }

    public static EnumC359810E8t valueOf(String str) {
        return (EnumC359810E8t) C08FF.LIZ(EnumC359810E8t.class, str);
    }

    public EnumC359810E8t(String str, int i) {
    }
}
