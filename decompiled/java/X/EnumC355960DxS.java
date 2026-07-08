package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DxS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC355960DxS {
    public static final EnumC355960DxS AUDIO_RECORD;
    public static final EnumC355960DxS BGM;
    public static final EnumC355960DxS CUTSAME_MUTE;
    public static final EnumC355960DxS CUTSAME_USER;
    public static final EnumC355960DxS DUB;
    public static final EnumC355960DxS EDITOR_MUSIC;
    public static final EnumC355960DxS KTV_AUDIO_TUNING;
    public static final EnumC355960DxS KTV_BGM;
    public static final EnumC355960DxS KTV_ORIGIN;
    public static final EnumC355960DxS KTV_VOICE;
    public static final /* synthetic */ EnumC355960DxS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC355960DxS MEME_SOUND_BGM;
    public static final EnumC355960DxS ORIGIN;
    public static final EnumC355960DxS ORIGIN_VOICE_CONVERSION;
    public static final EnumC355960DxS REVERSE_AUDIO;
    public static final EnumC355960DxS SOUND_EFFECT;
    public static final EnumC355960DxS TEXT_SPEAK;
    public static final EnumC355960DxS VOICE_PUBLISH;

    public static InterfaceC2044707zh<EnumC355960DxS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC355960DxS enumC355960DxS = new EnumC355960DxS("BGM", 0);
        BGM = enumC355960DxS;
        EnumC355960DxS enumC355960DxS2 = new EnumC355960DxS("TEXT_SPEAK", 1);
        TEXT_SPEAK = enumC355960DxS2;
        EnumC355960DxS enumC355960DxS3 = new EnumC355960DxS("ORIGIN", 2);
        ORIGIN = enumC355960DxS3;
        EnumC355960DxS enumC355960DxS4 = new EnumC355960DxS("REVERSE_AUDIO", 3);
        REVERSE_AUDIO = enumC355960DxS4;
        EnumC355960DxS enumC355960DxS5 = new EnumC355960DxS("KTV_BGM", 4);
        KTV_BGM = enumC355960DxS5;
        EnumC355960DxS enumC355960DxS6 = new EnumC355960DxS("KTV_VOICE", 5);
        KTV_VOICE = enumC355960DxS6;
        EnumC355960DxS enumC355960DxS7 = new EnumC355960DxS("KTV_ORIGIN", 6);
        KTV_ORIGIN = enumC355960DxS7;
        EnumC355960DxS enumC355960DxS8 = new EnumC355960DxS("CUTSAME_USER", 7);
        CUTSAME_USER = enumC355960DxS8;
        EnumC355960DxS enumC355960DxS9 = new EnumC355960DxS("CUTSAME_MUTE", 8);
        CUTSAME_MUTE = enumC355960DxS9;
        EnumC355960DxS enumC355960DxS10 = new EnumC355960DxS("KTV_AUDIO_TUNING", 9);
        KTV_AUDIO_TUNING = enumC355960DxS10;
        EnumC355960DxS enumC355960DxS11 = new EnumC355960DxS("DUB", 10);
        DUB = enumC355960DxS11;
        EnumC355960DxS enumC355960DxS12 = new EnumC355960DxS("VOICE_PUBLISH", 11);
        VOICE_PUBLISH = enumC355960DxS12;
        EnumC355960DxS enumC355960DxS13 = new EnumC355960DxS("EDITOR_MUSIC", 12);
        EDITOR_MUSIC = enumC355960DxS13;
        EnumC355960DxS enumC355960DxS14 = new EnumC355960DxS("SOUND_EFFECT", 13);
        SOUND_EFFECT = enumC355960DxS14;
        EnumC355960DxS enumC355960DxS15 = new EnumC355960DxS("ORIGIN_VOICE_CONVERSION", 14);
        ORIGIN_VOICE_CONVERSION = enumC355960DxS15;
        EnumC355960DxS enumC355960DxS16 = new EnumC355960DxS("AUDIO_RECORD", 15);
        AUDIO_RECORD = enumC355960DxS16;
        EnumC355960DxS enumC355960DxS17 = new EnumC355960DxS("MEME_SOUND_BGM", 16);
        MEME_SOUND_BGM = enumC355960DxS17;
        EnumC355960DxS[] enumC355960DxSArr = {enumC355960DxS, enumC355960DxS2, enumC355960DxS3, enumC355960DxS4, enumC355960DxS5, enumC355960DxS6, enumC355960DxS7, enumC355960DxS8, enumC355960DxS9, enumC355960DxS10, enumC355960DxS11, enumC355960DxS12, enumC355960DxS13, enumC355960DxS14, enumC355960DxS15, enumC355960DxS16, enumC355960DxS17};
        LL = enumC355960DxSArr;
        LLILLJJLI = new C2254308sP(enumC355960DxSArr);
    }

    public static EnumC355960DxS[] values() {
        return (EnumC355960DxS[]) LL.clone();
    }

    public static EnumC355960DxS valueOf(String str) {
        return (EnumC355960DxS) C08FF.LIZ(EnumC355960DxS.class, str);
    }

    public EnumC355960DxS(String str, int i) {
    }
}
