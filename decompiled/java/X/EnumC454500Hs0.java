package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hs0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC454500Hs0 {
    public static final EnumC454500Hs0 GREETING_CARD;
    public static final /* synthetic */ EnumC454500Hs0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC454500Hs0 PHOTO_COMMENT_STICKER;
    public static final EnumC454500Hs0 PRIVATE_PHOTO;
    public static final EnumC454500Hs0 PRIVATE_VIDEO;
    public static final EnumC454500Hs0 PUBLIC_VIDEO_LEGACY;
    public static final EnumC454500Hs0 PUBLIC_VIDEO_TEMPLATE;
    public static final EnumC454500Hs0 STICKER_DETAIL_PAGE;
    public static final EnumC454500Hs0 STICKER_MSG_GIPHY;
    public static final EnumC454500Hs0 STICKER_MSG_UGC;
    public static final EnumC454500Hs0 STICKER_PANEL;
    public static final EnumC454500Hs0 STICKER_RECOMMENDATION;
    public static final EnumC454500Hs0 STICKER_STORE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC454500Hs0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC454500Hs0 enumC454500Hs0 = new EnumC454500Hs0("PRIVATE_VIDEO", 0, "private_video");
        PRIVATE_VIDEO = enumC454500Hs0;
        EnumC454500Hs0 enumC454500Hs02 = new EnumC454500Hs0("PRIVATE_PHOTO", 1, "private_photo");
        PRIVATE_PHOTO = enumC454500Hs02;
        EnumC454500Hs0 enumC454500Hs03 = new EnumC454500Hs0("PUBLIC_VIDEO_TEMPLATE", 2, "public_video_template");
        PUBLIC_VIDEO_TEMPLATE = enumC454500Hs03;
        EnumC454500Hs0 enumC454500Hs04 = new EnumC454500Hs0("PUBLIC_VIDEO_LEGACY", 3, "public_video_legacy");
        PUBLIC_VIDEO_LEGACY = enumC454500Hs04;
        EnumC454500Hs0 enumC454500Hs05 = new EnumC454500Hs0("STICKER_MSG_UGC", 4, "sticker_chat_ugc");
        STICKER_MSG_UGC = enumC454500Hs05;
        EnumC454500Hs0 enumC454500Hs06 = new EnumC454500Hs0("STICKER_MSG_GIPHY", 5, "sticker_chat_giphy");
        STICKER_MSG_GIPHY = enumC454500Hs06;
        EnumC454500Hs0 enumC454500Hs07 = new EnumC454500Hs0("STICKER_STORE", 6, "sticker_store");
        STICKER_STORE = enumC454500Hs07;
        EnumC454500Hs0 enumC454500Hs08 = new EnumC454500Hs0("STICKER_DETAIL_PAGE", 7, "sticker_detail_page");
        STICKER_DETAIL_PAGE = enumC454500Hs08;
        EnumC454500Hs0 enumC454500Hs09 = new EnumC454500Hs0("STICKER_PANEL", 8, "sticker_panel");
        STICKER_PANEL = enumC454500Hs09;
        EnumC454500Hs0 enumC454500Hs010 = new EnumC454500Hs0("STICKER_RECOMMENDATION", 9, "sticker_recommendation");
        STICKER_RECOMMENDATION = enumC454500Hs010;
        EnumC454500Hs0 enumC454500Hs011 = new EnumC454500Hs0("GREETING_CARD", 10, "greeting_card");
        GREETING_CARD = enumC454500Hs011;
        EnumC454500Hs0 enumC454500Hs012 = new EnumC454500Hs0("PHOTO_COMMENT_STICKER", 11, "photo_comment_sticker");
        PHOTO_COMMENT_STICKER = enumC454500Hs012;
        EnumC454500Hs0[] enumC454500Hs0Arr = {enumC454500Hs0, enumC454500Hs02, enumC454500Hs03, enumC454500Hs04, enumC454500Hs05, enumC454500Hs06, enumC454500Hs07, enumC454500Hs08, enumC454500Hs09, enumC454500Hs010, enumC454500Hs011, enumC454500Hs012};
        LLILLJJLI = enumC454500Hs0Arr;
        LLILLL = new C2254308sP(enumC454500Hs0Arr);
    }

    public static EnumC454500Hs0[] values() {
        return (EnumC454500Hs0[]) LLILLJJLI.clone();
    }

    public final String getCallerId() {
        return this.LL;
    }

    public static EnumC454500Hs0 valueOf(String str) {
        return (EnumC454500Hs0) C08FF.LIZ(EnumC454500Hs0.class, str);
    }

    public EnumC454500Hs0(String str, int i, String str2) {
        this.LL = str2;
    }
}
