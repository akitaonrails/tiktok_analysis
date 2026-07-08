package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0t5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1652090t5r implements InterfaceC1652140t5w {
    public static final EnumC1652090t5r AI_CAPTION;
    public static final EnumC1652090t5r BEAUTY;
    public static final EnumC1652090t5r DUET_LAYOUT;
    public static final EnumC1652090t5r FLASH;
    public static final /* synthetic */ EnumC1652090t5r[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1652090t5r MICROPHONE;
    public static final EnumC1652090t5r MICROPHONE_WITH_BGM;
    public static final EnumC1652090t5r M_BEAUTY;
    public static final EnumC1652090t5r RATIO;
    public static final EnumC1652090t5r REVERSE_CAMERA;
    public static final EnumC1652090t5r STORY_MUSIC;
    public static final EnumC1652090t5r TEXT;
    public static final EnumC1652090t5r TIMER;
    public final EnumC1651310t4b LL;
    public final String LLILLJJLI;
    public final int LLILLL;

    public static InterfaceC2044707zh<EnumC1652090t5r> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC1651310t4b enumC1651310t4b = EnumC1651310t4b.FIXED;
        EnumC1652090t5r enumC1652090t5r = new EnumC1652090t5r("REVERSE_CAMERA", 0, enumC1651310t4b, "reverse_camera", 0);
        REVERSE_CAMERA = enumC1652090t5r;
        EnumC1652090t5r enumC1652090t5r2 = new EnumC1652090t5r("FLASH", 1, enumC1651310t4b, "flash", 19);
        FLASH = enumC1652090t5r2;
        EnumC1651310t4b enumC1651310t4b2 = EnumC1651310t4b.SLIDE;
        EnumC1652090t5r enumC1652090t5r3 = new EnumC1652090t5r("TIMER", 2, enumC1651310t4b2, "timer", 7);
        TIMER = enumC1652090t5r3;
        EnumC1652090t5r enumC1652090t5r4 = new EnumC1652090t5r("TEXT", 3, enumC1651310t4b2, "text", 11);
        TEXT = enumC1652090t5r4;
        EnumC1652090t5r enumC1652090t5r5 = new EnumC1652090t5r("DUET_LAYOUT", 4, enumC1651310t4b2, "duet_layout", 16);
        DUET_LAYOUT = enumC1652090t5r5;
        EnumC1652090t5r enumC1652090t5r6 = new EnumC1652090t5r("AI_CAPTION", 5, enumC1651310t4b2, "ai_caption", 21);
        AI_CAPTION = enumC1652090t5r6;
        EnumC1652090t5r enumC1652090t5r7 = new EnumC1652090t5r("MICROPHONE", 6, enumC1651310t4b2, "microphone", 10);
        MICROPHONE = enumC1652090t5r7;
        EnumC1652090t5r enumC1652090t5r8 = new EnumC1652090t5r("MICROPHONE_WITH_BGM", 7, enumC1651310t4b2, "microphone", 3);
        MICROPHONE_WITH_BGM = enumC1652090t5r8;
        EnumC1652090t5r enumC1652090t5r9 = new EnumC1652090t5r("M_BEAUTY", 8, enumC1651310t4b2, "beauty", 2);
        M_BEAUTY = enumC1652090t5r9;
        EnumC1652090t5r enumC1652090t5r10 = new EnumC1652090t5r("BEAUTY", 9, enumC1651310t4b2, "beauty", 6);
        BEAUTY = enumC1652090t5r10;
        EnumC1652090t5r enumC1652090t5r11 = new EnumC1652090t5r("RATIO", 10, enumC1651310t4b2, "ratio", 31);
        RATIO = enumC1652090t5r11;
        EnumC1652090t5r enumC1652090t5r12 = new EnumC1652090t5r("STORY_MUSIC", 11, enumC1651310t4b2, "story_music", 37);
        STORY_MUSIC = enumC1652090t5r12;
        EnumC1652090t5r[] enumC1652090t5rArr = {enumC1652090t5r, enumC1652090t5r2, enumC1652090t5r3, enumC1652090t5r4, enumC1652090t5r5, enumC1652090t5r6, enumC1652090t5r7, enumC1652090t5r8, enumC1652090t5r9, enumC1652090t5r10, enumC1652090t5r11, enumC1652090t5r12};
        LLILZ = enumC1652090t5rArr;
        LLILZIL = new C2254308sP(enumC1652090t5rArr);
    }

    public static EnumC1652090t5r[] values() {
        return (EnumC1652090t5r[]) LLILZ.clone();
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

    public static EnumC1652090t5r valueOf(String str) {
        return (EnumC1652090t5r) C08FF.LIZ(EnumC1652090t5r.class, str);
    }

    public EnumC1652090t5r(String str, int i, EnumC1651310t4b enumC1651310t4b, String str2, int i2) {
        this.LL = enumC1651310t4b;
        this.LLILLJJLI = str2;
        this.LLILLL = i2;
    }
}
