package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Rni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC706640Rni {
    public static final EnumC706640Rni GUIDE_CARD_PHOTO;
    public static final EnumC706640Rni GUIDE_CARD_THOUGHT;
    public static final EnumC706640Rni GUIDE_CARD_VIDEO;
    public static final EnumC706640Rni GUIDE_UPLOAD_CARD;
    public static final EnumC706640Rni IMMERSIVE_LIST_VIEW;
    public static final EnumC706640Rni IMMERSIVE_USER_FEED_VIEW;
    public static final EnumC706640Rni INVISIBLE_VIDEO_VIEW;
    public static final EnumC706640Rni LIST_VIEW;
    public static final EnumC706640Rni LIVE_SHARE_STORY_VIEW;
    public static final /* synthetic */ EnumC706640Rni[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC706640Rni NOTE_VIEW;
    public static final EnumC706640Rni PHOTO_VIEW;
    public static final EnumC706640Rni REVEAL_PROMO_CARD;
    public static final EnumC706640Rni UPLOADING_VIDEO_VIEW;
    public static final EnumC706640Rni VIDEO_VIEW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC706640Rni> getEntries() {
        return LLILLL;
    }

    static {
        EnumC706640Rni enumC706640Rni = new EnumC706640Rni("LIST_VIEW", 0, "common_feed_item_feed");
        LIST_VIEW = enumC706640Rni;
        EnumC706640Rni enumC706640Rni2 = new EnumC706640Rni("IMMERSIVE_LIST_VIEW", 1, "story_item_immersive_collection");
        IMMERSIVE_LIST_VIEW = enumC706640Rni2;
        EnumC706640Rni enumC706640Rni3 = new EnumC706640Rni("VIDEO_VIEW", 2, "story_item_video");
        VIDEO_VIEW = enumC706640Rni3;
        EnumC706640Rni enumC706640Rni4 = new EnumC706640Rni("UPLOADING_VIDEO_VIEW", 3, "story_item_video");
        UPLOADING_VIDEO_VIEW = enumC706640Rni4;
        EnumC706640Rni enumC706640Rni5 = new EnumC706640Rni("INVISIBLE_VIDEO_VIEW", 4, "story_item_invisible_video");
        INVISIBLE_VIDEO_VIEW = enumC706640Rni5;
        EnumC706640Rni enumC706640Rni6 = new EnumC706640Rni("PHOTO_VIEW", 5, "story_item_photo");
        PHOTO_VIEW = enumC706640Rni6;
        EnumC706640Rni enumC706640Rni7 = new EnumC706640Rni("IMMERSIVE_USER_FEED_VIEW", 6, "story_layout_immersive_user_feed");
        IMMERSIVE_USER_FEED_VIEW = enumC706640Rni7;
        EnumC706640Rni enumC706640Rni8 = new EnumC706640Rni("GUIDE_CARD_VIDEO", 7, "story_layout_guide_card_video");
        GUIDE_CARD_VIDEO = enumC706640Rni8;
        EnumC706640Rni enumC706640Rni9 = new EnumC706640Rni("GUIDE_CARD_PHOTO", 8, "story_layout_guide_card_photo");
        GUIDE_CARD_PHOTO = enumC706640Rni9;
        EnumC706640Rni enumC706640Rni10 = new EnumC706640Rni("GUIDE_CARD_THOUGHT", 9, "story_layout_guide_card_thought");
        GUIDE_CARD_THOUGHT = enumC706640Rni10;
        EnumC706640Rni enumC706640Rni11 = new EnumC706640Rni("REVEAL_PROMO_CARD", 10, "story_item_immersive_reveal_promo_card");
        REVEAL_PROMO_CARD = enumC706640Rni11;
        EnumC706640Rni enumC706640Rni12 = new EnumC706640Rni("NOTE_VIEW", 11, "story_item_note");
        NOTE_VIEW = enumC706640Rni12;
        EnumC706640Rni enumC706640Rni13 = new EnumC706640Rni("GUIDE_UPLOAD_CARD", 12, "story_item_immersive_guide_upload_card");
        GUIDE_UPLOAD_CARD = enumC706640Rni13;
        EnumC706640Rni enumC706640Rni14 = new EnumC706640Rni("LIVE_SHARE_STORY_VIEW", 13, "story_item_video");
        LIVE_SHARE_STORY_VIEW = enumC706640Rni14;
        EnumC706640Rni[] enumC706640RniArr = {enumC706640Rni, enumC706640Rni2, enumC706640Rni3, enumC706640Rni4, enumC706640Rni5, enumC706640Rni6, enumC706640Rni7, enumC706640Rni8, enumC706640Rni9, enumC706640Rni10, enumC706640Rni11, enumC706640Rni12, enumC706640Rni13, enumC706640Rni14};
        LLILLJJLI = enumC706640RniArr;
        LLILLL = new C2254308sP(enumC706640RniArr);
    }

    public static EnumC706640Rni[] values() {
        return (EnumC706640Rni[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC706640Rni valueOf(String str) {
        return (EnumC706640Rni) C08FF.LIZ(EnumC706640Rni.class, str);
    }

    public EnumC706640Rni(String str, int i, String str2) {
        this.LL = str2;
    }
}
