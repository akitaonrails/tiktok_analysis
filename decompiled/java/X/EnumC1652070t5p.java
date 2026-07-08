package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0t5p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1652070t5p implements InterfaceC1652140t5w {
    public static final EnumC1652070t5p ADD_YOURS;
    public static final EnumC1652070t5p AI_ENHANCE;
    public static final EnumC1652070t5p BEAUTY;
    public static final EnumC1652070t5p DUET_LAYOUT;
    public static final EnumC1652070t5p FILTER;
    public static final EnumC1652070t5p FLASH;
    public static final EnumC1652070t5p HDR;
    public static final /* synthetic */ EnumC1652070t5p[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1652070t5p MICROPHONE;
    public static final EnumC1652070t5p MICROPHONE_WITH_BGM;
    public static final EnumC1652070t5p M_BEAUTY;
    public static final EnumC1652070t5p REVERSE_CAMERA;
    public static final EnumC1652070t5p SPEED;
    public static final EnumC1652070t5p TIMER;
    public static final EnumC1652070t5p VOICE_FILTER;
    public static final EnumC1652070t5p WIDE_CAMERA;
    public final EnumC1651310t4b LL;
    public final String LLILLJJLI;
    public final int LLILLL;

    public static InterfaceC2044707zh<EnumC1652070t5p> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC1651310t4b enumC1651310t4b = EnumC1651310t4b.FIXED;
        EnumC1652070t5p enumC1652070t5p = new EnumC1652070t5p("REVERSE_CAMERA", 0, enumC1651310t4b, "reverse_camera", 0);
        REVERSE_CAMERA = enumC1652070t5p;
        EnumC1652070t5p enumC1652070t5p2 = new EnumC1652070t5p("FLASH", 1, enumC1651310t4b, "flash", 19);
        FLASH = enumC1652070t5p2;
        EnumC1651310t4b enumC1651310t4b2 = EnumC1651310t4b.SLIDE;
        EnumC1652070t5p enumC1652070t5p3 = new EnumC1652070t5p("TIMER", 2, enumC1651310t4b2, "timer", 7);
        TIMER = enumC1652070t5p3;
        EnumC1652070t5p enumC1652070t5p4 = new EnumC1652070t5p("DUET_LAYOUT", 3, enumC1651310t4b2, "duet_layout", 9);
        DUET_LAYOUT = enumC1652070t5p4;
        EnumC1652070t5p enumC1652070t5p5 = new EnumC1652070t5p("MICROPHONE", 4, enumC1651310t4b2, "microphone", 10);
        MICROPHONE = enumC1652070t5p5;
        EnumC1652070t5p enumC1652070t5p6 = new EnumC1652070t5p("MICROPHONE_WITH_BGM", 5, enumC1651310t4b2, "microphone", 3);
        MICROPHONE_WITH_BGM = enumC1652070t5p6;
        EnumC1652070t5p enumC1652070t5p7 = new EnumC1652070t5p("M_BEAUTY", 6, enumC1651310t4b2, "beauty", 2);
        M_BEAUTY = enumC1652070t5p7;
        EnumC1652070t5p enumC1652070t5p8 = new EnumC1652070t5p("BEAUTY", 7, enumC1651310t4b2, "beauty", 6);
        BEAUTY = enumC1652070t5p8;
        EnumC1652070t5p enumC1652070t5p9 = new EnumC1652070t5p("FILTER", 8, enumC1651310t4b2, "filter", 4);
        FILTER = enumC1652070t5p9;
        EnumC1652070t5p enumC1652070t5p10 = new EnumC1652070t5p("SPEED", 9, enumC1651310t4b2, "speed", 1);
        SPEED = enumC1652070t5p10;
        EnumC1652070t5p enumC1652070t5p11 = new EnumC1652070t5p("WIDE_CAMERA", 10, enumC1651310t4b2, "wide_camera", 11);
        WIDE_CAMERA = enumC1652070t5p11;
        EnumC1652070t5p enumC1652070t5p12 = new EnumC1652070t5p("VOICE_FILTER", 11, enumC1651310t4b2, "voice_filter", 14);
        VOICE_FILTER = enumC1652070t5p12;
        EnumC1652070t5p enumC1652070t5p13 = new EnumC1652070t5p("ADD_YOURS", 12, enumC1651310t4b2, "add_yours", 18);
        ADD_YOURS = enumC1652070t5p13;
        EnumC1652070t5p enumC1652070t5p14 = new EnumC1652070t5p("AI_ENHANCE", 13, enumC1651310t4b2, "ai_enhance", 20);
        AI_ENHANCE = enumC1652070t5p14;
        EnumC1652070t5p enumC1652070t5p15 = new EnumC1652070t5p("HDR", 14, enumC1651310t4b2, "hdr", 29);
        HDR = enumC1652070t5p15;
        EnumC1652070t5p[] enumC1652070t5pArr = {enumC1652070t5p, enumC1652070t5p2, enumC1652070t5p3, enumC1652070t5p4, enumC1652070t5p5, enumC1652070t5p6, enumC1652070t5p7, enumC1652070t5p8, enumC1652070t5p9, enumC1652070t5p10, enumC1652070t5p11, enumC1652070t5p12, enumC1652070t5p13, enumC1652070t5p14, enumC1652070t5p15};
        LLILZ = enumC1652070t5pArr;
        LLILZIL = new C2254308sP(enumC1652070t5pArr);
    }

    public static EnumC1652070t5p[] values() {
        return (EnumC1652070t5p[]) LLILZ.clone();
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

    public static EnumC1652070t5p valueOf(String str) {
        return (EnumC1652070t5p) C08FF.LIZ(EnumC1652070t5p.class, str);
    }

    public EnumC1652070t5p(String str, int i, EnumC1651310t4b enumC1651310t4b, String str2, int i2) {
        this.LL = enumC1651310t4b;
        this.LLILLJJLI = str2;
        this.LLILLL = i2;
    }
}
