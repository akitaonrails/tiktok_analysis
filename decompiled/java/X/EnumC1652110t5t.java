package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0t5t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1652110t5t implements InterfaceC1652140t5w {
    public static final EnumC1652110t5t BEAUTY;
    public static final EnumC1652110t5t FILTER;
    public static final EnumC1652110t5t FLASH;
    public static final /* synthetic */ EnumC1652110t5t[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1652110t5t MICROPHONE;
    public static final EnumC1652110t5t M_BEAUTY;
    public static final EnumC1652110t5t REVERSE_CAMERA;
    public static final EnumC1652110t5t STORY_MUSIC;
    public static final EnumC1652110t5t TEXT;
    public final EnumC1651310t4b LL;
    public final String LLILLJJLI;
    public final int LLILLL;

    public static InterfaceC2044707zh<EnumC1652110t5t> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC1651310t4b enumC1651310t4b = EnumC1651310t4b.FIXED;
        EnumC1652110t5t enumC1652110t5t = new EnumC1652110t5t("REVERSE_CAMERA", 0, enumC1651310t4b, "reverse_camera", 0);
        REVERSE_CAMERA = enumC1652110t5t;
        EnumC1652110t5t enumC1652110t5t2 = new EnumC1652110t5t("FLASH", 1, enumC1651310t4b, "flash", 19);
        FLASH = enumC1652110t5t2;
        EnumC1651310t4b enumC1651310t4b2 = EnumC1651310t4b.SLIDE;
        EnumC1652110t5t enumC1652110t5t3 = new EnumC1652110t5t("TEXT", 2, enumC1651310t4b2, "text", 11);
        TEXT = enumC1652110t5t3;
        EnumC1652110t5t enumC1652110t5t4 = new EnumC1652110t5t("MICROPHONE", 3, enumC1651310t4b2, "microphone", 10);
        MICROPHONE = enumC1652110t5t4;
        EnumC1652110t5t enumC1652110t5t5 = new EnumC1652110t5t("M_BEAUTY", 4, enumC1651310t4b2, "beauty", 2);
        M_BEAUTY = enumC1652110t5t5;
        EnumC1652110t5t enumC1652110t5t6 = new EnumC1652110t5t("BEAUTY", 5, enumC1651310t4b2, "beauty", 6);
        BEAUTY = enumC1652110t5t6;
        EnumC1652110t5t enumC1652110t5t7 = new EnumC1652110t5t("STORY_MUSIC", 6, enumC1651310t4b2, "story_music", 37);
        STORY_MUSIC = enumC1652110t5t7;
        EnumC1652110t5t enumC1652110t5t8 = new EnumC1652110t5t("FILTER", 7, enumC1651310t4b2, "filter", 4);
        FILTER = enumC1652110t5t8;
        EnumC1652110t5t[] enumC1652110t5tArr = {enumC1652110t5t, enumC1652110t5t2, enumC1652110t5t3, enumC1652110t5t4, enumC1652110t5t5, enumC1652110t5t6, enumC1652110t5t7, enumC1652110t5t8};
        LLILZ = enumC1652110t5tArr;
        LLILZIL = new C2254308sP(enumC1652110t5tArr);
    }

    public static EnumC1652110t5t[] values() {
        return (EnumC1652110t5t[]) LLILZ.clone();
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

    public static EnumC1652110t5t valueOf(String str) {
        return (EnumC1652110t5t) C08FF.LIZ(EnumC1652110t5t.class, str);
    }

    public EnumC1652110t5t(String str, int i, EnumC1651310t4b enumC1651310t4b, String str2, int i2) {
        this.LL = enumC1651310t4b;
        this.LLILLJJLI = str2;
        this.LLILLL = i2;
    }
}
