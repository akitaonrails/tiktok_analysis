package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0t5s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1652100t5s implements InterfaceC1652140t5w {
    public static final EnumC1652100t5s AI_CAPTION;
    public static final EnumC1652100t5s BEAUTY;
    public static final EnumC1652100t5s DUET_LAYOUT;
    public static final EnumC1652100t5s FLASH;
    public static final /* synthetic */ EnumC1652100t5s[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1652100t5s MICROPHONE;
    public static final EnumC1652100t5s MICROPHONE_WITH_BGM;
    public static final EnumC1652100t5s M_BEAUTY;
    public static final EnumC1652100t5s RATIO;
    public static final EnumC1652100t5s REVERSE_CAMERA;
    public static final EnumC1652100t5s STORY_MUSIC;
    public static final EnumC1652100t5s TEXT;
    public static final EnumC1652100t5s TIMER;
    public final EnumC1651310t4b LL;
    public final String LLILLJJLI;
    public final int LLILLL;

    public static InterfaceC2044707zh<EnumC1652100t5s> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC1651310t4b enumC1651310t4b = EnumC1651310t4b.FIXED;
        EnumC1652100t5s enumC1652100t5s = new EnumC1652100t5s("REVERSE_CAMERA", 0, enumC1651310t4b, "reverse_camera", 0);
        REVERSE_CAMERA = enumC1652100t5s;
        EnumC1652100t5s enumC1652100t5s2 = new EnumC1652100t5s("FLASH", 1, enumC1651310t4b, "flash", 19);
        FLASH = enumC1652100t5s2;
        EnumC1651310t4b enumC1651310t4b2 = EnumC1651310t4b.SLIDE;
        EnumC1652100t5s enumC1652100t5s3 = new EnumC1652100t5s("TIMER", 2, enumC1651310t4b2, "timer", 7);
        TIMER = enumC1652100t5s3;
        EnumC1652100t5s enumC1652100t5s4 = new EnumC1652100t5s("TEXT", 3, enumC1651310t4b2, "text", 11);
        TEXT = enumC1652100t5s4;
        EnumC1652100t5s enumC1652100t5s5 = new EnumC1652100t5s("DUET_LAYOUT", 4, enumC1651310t4b2, "duet_layout", 16);
        DUET_LAYOUT = enumC1652100t5s5;
        EnumC1652100t5s enumC1652100t5s6 = new EnumC1652100t5s("AI_CAPTION", 5, enumC1651310t4b2, "ai_caption", 21);
        AI_CAPTION = enumC1652100t5s6;
        EnumC1652100t5s enumC1652100t5s7 = new EnumC1652100t5s("MICROPHONE", 6, enumC1651310t4b2, "microphone", 10);
        MICROPHONE = enumC1652100t5s7;
        EnumC1652100t5s enumC1652100t5s8 = new EnumC1652100t5s("MICROPHONE_WITH_BGM", 7, enumC1651310t4b2, "microphone", 3);
        MICROPHONE_WITH_BGM = enumC1652100t5s8;
        EnumC1652100t5s enumC1652100t5s9 = new EnumC1652100t5s("RATIO", 8, enumC1651310t4b2, "ratio", 31);
        RATIO = enumC1652100t5s9;
        EnumC1652100t5s enumC1652100t5s10 = new EnumC1652100t5s("M_BEAUTY", 9, enumC1651310t4b2, "beauty", 2);
        M_BEAUTY = enumC1652100t5s10;
        EnumC1652100t5s enumC1652100t5s11 = new EnumC1652100t5s("BEAUTY", 10, enumC1651310t4b2, "beauty", 6);
        BEAUTY = enumC1652100t5s11;
        EnumC1652100t5s enumC1652100t5s12 = new EnumC1652100t5s("STORY_MUSIC", 11, enumC1651310t4b2, "story_music", 37);
        STORY_MUSIC = enumC1652100t5s12;
        EnumC1652100t5s[] enumC1652100t5sArr = {enumC1652100t5s, enumC1652100t5s2, enumC1652100t5s3, enumC1652100t5s4, enumC1652100t5s5, enumC1652100t5s6, enumC1652100t5s7, enumC1652100t5s8, enumC1652100t5s9, enumC1652100t5s10, enumC1652100t5s11, enumC1652100t5s12};
        LLILZ = enumC1652100t5sArr;
        LLILZIL = new C2254308sP(enumC1652100t5sArr);
    }

    public static EnumC1652100t5s[] values() {
        return (EnumC1652100t5s[]) LLILZ.clone();
    }

    @Override // X.InterfaceC1652140t5w
    public /* bridge */ /* synthetic */ int getOrdinal() {
        return ordinal();
    }

    @Override // X.InterfaceC1652140t5w
    public String getItemTag() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1652140t5w
    public EnumC1651310t4b getSection() {
        return this.LL;
    }

    @Override // X.InterfaceC1652140t5w
    public int getType() {
        return this.LLILLL;
    }

    public static EnumC1652100t5s valueOf(String str) {
        return (EnumC1652100t5s) C08FF.LIZ(EnumC1652100t5s.class, str);
    }

    public EnumC1652100t5s(String str, int i, EnumC1651310t4b enumC1651310t4b, String str2, int i2) {
        this.LL = enumC1651310t4b;
        this.LLILLJJLI = str2;
        this.LLILLL = i2;
    }
}
