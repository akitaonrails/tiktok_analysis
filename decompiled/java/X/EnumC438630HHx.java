package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HHx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC438630HHx {
    public static final EnumC438630HHx DRAFT_ICON;
    public static final EnumC438630HHx GENERATING_LOTTIE;
    public static final EnumC438630HHx GENERATION_COMPLETE_SOUND_EFFECT;
    public static final EnumC438630HHx HALF_SHEET_HEADER_IMG;
    public static final /* synthetic */ EnumC438630HHx[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC438630HHx LOADING;
    public static final EnumC438630HHx SOCIAL_AVATAR_CREATE_ICON;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC438630HHx> getEntries() {
        return LLILZ;
    }

    static {
        EnumC438630HHx enumC438630HHx = new EnumC438630HHx("GENERATING_LOTTIE", 0, "avatar_thought_generating_lottie.json", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-internal-sg/7/teko/resource/story_thought_bg_res/avatar_thought_generating_lottie.json");
        GENERATING_LOTTIE = enumC438630HHx;
        EnumC438630HHx enumC438630HHx2 = new EnumC438630HHx("HALF_SHEET_HEADER_IMG", 1, "avatar_thought_half_sheet.jpg", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-internal-sg/7/teko/resource/story_thought_bg_res/avatar_thought_half_sheet.jpg");
        HALF_SHEET_HEADER_IMG = enumC438630HHx2;
        EnumC438630HHx enumC438630HHx3 = new EnumC438630HHx("SOCIAL_AVATAR_CREATE_ICON", 2, "avatar_thought_new_social_avatar.png", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-internal-sg/7/teko/resource/story_thought_bg_res/avatar_thought_new_social_avatar.png");
        SOCIAL_AVATAR_CREATE_ICON = enumC438630HHx3;
        EnumC438630HHx enumC438630HHx4 = new EnumC438630HHx("DRAFT_ICON", 3, "avatar_thought_draft.png", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-internal-sg/7/teko/resource/story_thought_bg_res/avatar_thought_draft.png");
        DRAFT_ICON = enumC438630HHx4;
        EnumC438630HHx enumC438630HHx5 = new EnumC438630HHx("LOADING", 4, "avatar_thought_loading.png", "https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/10/teko/resource/story_thought_bg_res/avatar_thought_loading.png");
        LOADING = enumC438630HHx5;
        EnumC438630HHx enumC438630HHx6 = new EnumC438630HHx("GENERATION_COMPLETE_SOUND_EFFECT", 5, "magic_sound_effect.MP3", "https://sf-teko-source.tiktokcdn-us.com/obj/gecko-internal-tx/9/teko/resource/story_thought_bg_res/magic_sound_effect.MP3");
        GENERATION_COMPLETE_SOUND_EFFECT = enumC438630HHx6;
        EnumC438630HHx[] enumC438630HHxArr = {enumC438630HHx, enumC438630HHx2, enumC438630HHx3, enumC438630HHx4, enumC438630HHx5, enumC438630HHx6};
        LLILLL = enumC438630HHxArr;
        LLILZ = new C2254308sP(enumC438630HHxArr);
    }

    public static EnumC438630HHx[] values() {
        return (EnumC438630HHx[]) LLILLL.clone();
    }

    public final String getBackupUrl() {
        return this.LLILLJJLI;
    }

    public final String getFileName() {
        return this.LL;
    }

    public static EnumC438630HHx valueOf(String str) {
        return (EnumC438630HHx) C08FF.LIZ(EnumC438630HHx.class, str);
    }

    public EnumC438630HHx(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
