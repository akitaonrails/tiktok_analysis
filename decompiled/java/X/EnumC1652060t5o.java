package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0t5o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1652060t5o implements InterfaceC1652140t5w {
    public static final EnumC1652060t5o ADD_YOURS;
    public static final EnumC1652060t5o AI_ENHANCE;
    public static final EnumC1652060t5o BEAUTY;
    public static final EnumC1652060t5o DUET_LAYOUT;
    public static final EnumC1652060t5o FILTER;
    public static final EnumC1652060t5o FLASH;
    public static final EnumC1652060t5o HDR;
    public static final /* synthetic */ EnumC1652060t5o[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1652060t5o MICROPHONE;
    public static final EnumC1652060t5o MICROPHONE_WITH_BGM;
    public static final EnumC1652060t5o M_BEAUTY;
    public static final EnumC1652060t5o REVERSE_CAMERA;
    public static final EnumC1652060t5o SPEED;
    public static final EnumC1652060t5o TIMER;
    public static final EnumC1652060t5o VOICE_FILTER;
    public static final EnumC1652060t5o WIDE_CAMERA;
    public final EnumC1651310t4b LL;
    public final String LLILLJJLI;
    public final int LLILLL;

    public static InterfaceC2044707zh<EnumC1652060t5o> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC1651310t4b enumC1651310t4b = EnumC1651310t4b.FIXED;
        EnumC1652060t5o enumC1652060t5o = new EnumC1652060t5o("REVERSE_CAMERA", 0, enumC1651310t4b, "reverse_camera", 0);
        REVERSE_CAMERA = enumC1652060t5o;
        EnumC1652060t5o enumC1652060t5o2 = new EnumC1652060t5o("FLASH", 1, enumC1651310t4b, "flash", 19);
        FLASH = enumC1652060t5o2;
        EnumC1651310t4b enumC1651310t4b2 = EnumC1651310t4b.SLIDE;
        EnumC1652060t5o enumC1652060t5o3 = new EnumC1652060t5o("TIMER", 2, enumC1651310t4b2, "timer", 7);
        TIMER = enumC1652060t5o3;
        EnumC1652060t5o enumC1652060t5o4 = new EnumC1652060t5o("DUET_LAYOUT", 3, enumC1651310t4b2, "duet_layout", 9);
        DUET_LAYOUT = enumC1652060t5o4;
        EnumC1652060t5o enumC1652060t5o5 = new EnumC1652060t5o("MICROPHONE", 4, enumC1651310t4b2, "microphone", 10);
        MICROPHONE = enumC1652060t5o5;
        EnumC1652060t5o enumC1652060t5o6 = new EnumC1652060t5o("MICROPHONE_WITH_BGM", 5, enumC1651310t4b2, "microphone", 3);
        MICROPHONE_WITH_BGM = enumC1652060t5o6;
        EnumC1652060t5o enumC1652060t5o7 = new EnumC1652060t5o("M_BEAUTY", 6, enumC1651310t4b2, "beauty", 2);
        M_BEAUTY = enumC1652060t5o7;
        EnumC1652060t5o enumC1652060t5o8 = new EnumC1652060t5o("BEAUTY", 7, enumC1651310t4b2, "beauty", 6);
        BEAUTY = enumC1652060t5o8;
        EnumC1652060t5o enumC1652060t5o9 = new EnumC1652060t5o("FILTER", 8, enumC1651310t4b2, "filter", 4);
        FILTER = enumC1652060t5o9;
        EnumC1652060t5o enumC1652060t5o10 = new EnumC1652060t5o("SPEED", 9, enumC1651310t4b2, "speed", 1);
        SPEED = enumC1652060t5o10;
        EnumC1652060t5o enumC1652060t5o11 = new EnumC1652060t5o("WIDE_CAMERA", 10, enumC1651310t4b2, "wide_camera", 11);
        WIDE_CAMERA = enumC1652060t5o11;
        EnumC1652060t5o enumC1652060t5o12 = new EnumC1652060t5o("VOICE_FILTER", 11, enumC1651310t4b2, "voice_filter", 14);
        VOICE_FILTER = enumC1652060t5o12;
        EnumC1652060t5o enumC1652060t5o13 = new EnumC1652060t5o("ADD_YOURS", 12, enumC1651310t4b2, "add_yours", 18);
        ADD_YOURS = enumC1652060t5o13;
        EnumC1652060t5o enumC1652060t5o14 = new EnumC1652060t5o("AI_ENHANCE", 13, enumC1651310t4b2, "ai_enhance", 20);
        AI_ENHANCE = enumC1652060t5o14;
        EnumC1652060t5o enumC1652060t5o15 = new EnumC1652060t5o("HDR", 14, enumC1651310t4b2, "hdr", 29);
        HDR = enumC1652060t5o15;
        EnumC1652060t5o[] enumC1652060t5oArr = {enumC1652060t5o, enumC1652060t5o2, enumC1652060t5o3, enumC1652060t5o4, enumC1652060t5o5, enumC1652060t5o6, enumC1652060t5o7, enumC1652060t5o8, enumC1652060t5o9, enumC1652060t5o10, enumC1652060t5o11, enumC1652060t5o12, enumC1652060t5o13, enumC1652060t5o14, enumC1652060t5o15};
        LLILZ = enumC1652060t5oArr;
        LLILZIL = new C2254308sP(enumC1652060t5oArr);
    }

    public static EnumC1652060t5o[] values() {
        return (EnumC1652060t5o[]) LLILZ.clone();
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

    public static EnumC1652060t5o valueOf(String str) {
        return (EnumC1652060t5o) C08FF.LIZ(EnumC1652060t5o.class, str);
    }

    public EnumC1652060t5o(String str, int i, EnumC1651310t4b enumC1651310t4b, String str2, int i2) {
        this.LL = enumC1651310t4b;
        this.LLILLJJLI = str2;
        this.LLILLL = i2;
    }
}
