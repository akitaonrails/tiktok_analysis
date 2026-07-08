package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1EOE, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EOE implements InterfaceC1652140t5w {
    public static final C1EOE AI_LIVE_PHOTO;
    public static final C1EOE EDIT_FILTER;
    public static final C1EOE IMAGE_CROP;
    public static final C1EOE INFO_STICKER;
    public static final C1EOE LIVEPHOTO_EDIT;
    public static final /* synthetic */ C1EOE[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final C1EOE PRIVACY_SETTING;
    public static final C1EOE SAVE_LOCAL;
    public static final C1EOE SEND_TO_DM;
    public static final C1EOE STORY_COLLAGE;
    public static final C1EOE STORY_FILTER;
    public static final C1EOE STORY_MUSIC;
    public static final C1EOE TEXT_STICKER;
    public final EnumC1651310t4b LL;
    public final String LLILLJJLI;
    public final int LLILLL;

    public static InterfaceC2044707zh<C1EOE> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC1651310t4b enumC1651310t4b = EnumC1651310t4b.SLIDE;
        C1EOE c1eoe = new C1EOE("PRIVACY_SETTING", 0, enumC1651310t4b, "privacy_setting", 17);
        PRIVACY_SETTING = c1eoe;
        C1EOE c1eoe2 = new C1EOE("LIVEPHOTO_EDIT", 1, enumC1651310t4b, "livephoto_edit", 1105);
        LIVEPHOTO_EDIT = c1eoe2;
        C1EOE c1eoe3 = new C1EOE("TEXT_STICKER", 2, enumC1651310t4b, "text_sticker", 3);
        TEXT_STICKER = c1eoe3;
        C1EOE c1eoe4 = new C1EOE("INFO_STICKER", 3, enumC1651310t4b, "info_sticker", 4);
        INFO_STICKER = c1eoe4;
        C1EOE c1eoe5 = new C1EOE("STORY_MUSIC", 4, enumC1651310t4b, "story_music", 1101);
        STORY_MUSIC = c1eoe5;
        C1EOE c1eoe6 = new C1EOE("EDIT_FILTER", 5, enumC1651310t4b, "edit_filter", 5);
        EDIT_FILTER = c1eoe6;
        C1EOE c1eoe7 = new C1EOE("STORY_FILTER", 6, enumC1651310t4b, "story_filter", 1700);
        STORY_FILTER = c1eoe7;
        C1EOE c1eoe8 = new C1EOE("STORY_COLLAGE", 7, enumC1651310t4b, "layout", 31);
        STORY_COLLAGE = c1eoe8;
        C1EOE c1eoe9 = new C1EOE("IMAGE_CROP", 8, enumC1651310t4b, "image_crop", 16);
        IMAGE_CROP = c1eoe9;
        C1EOE c1eoe10 = new C1EOE("AI_LIVE_PHOTO", 9, enumC1651310t4b, "ai_live_photo", 1800);
        AI_LIVE_PHOTO = c1eoe10;
        C1EOE c1eoe11 = new C1EOE("SEND_TO_DM", 10, enumC1651310t4b, "send_dm", 1200);
        SEND_TO_DM = c1eoe11;
        C1EOE c1eoe12 = new C1EOE("SAVE_LOCAL", 11, enumC1651310t4b, "save_local", 25);
        SAVE_LOCAL = c1eoe12;
        C1EOE[] c1eoeArr = {c1eoe, c1eoe2, c1eoe3, c1eoe4, c1eoe5, c1eoe6, c1eoe7, c1eoe8, c1eoe9, c1eoe10, c1eoe11, c1eoe12};
        LLILZ = c1eoeArr;
        LLILZIL = new C2254308sP(c1eoeArr);
    }

    public static C1EOE[] values() {
        return (C1EOE[]) LLILZ.clone();
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

    public static C1EOE valueOf(String str) {
        return (C1EOE) C08FF.LIZ(C1EOE.class, str);
    }

    public C1EOE(String str, int i, EnumC1651310t4b enumC1651310t4b, String str2, int i2) {
        this.LL = enumC1651310t4b;
        this.LLILLJJLI = str2;
        this.LLILLL = i2;
    }
}
