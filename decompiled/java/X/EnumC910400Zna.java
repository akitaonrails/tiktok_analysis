package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Zna, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC910400Zna {
    public static final EnumC910400Zna CARD_BACKGROUND_IMAGE_PATH;
    public static final EnumC910400Zna CARD_SKIN_TEXT_OVERLAY_IMAGE_PATH;
    public static final EnumC910400Zna CREATE_ANIMATION_JSON_PATH;
    public static final EnumC910400Zna CREATE_ANIMATION_VIDEO_PATH;
    public static final /* synthetic */ EnumC910400Zna[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC910400Zna OPEN_ANIMATION_JSON_PATH;
    public static final EnumC910400Zna OPEN_ANIMATION_VIDEO_PATH;
    public static final EnumC910400Zna SENDER_SEND_ANIMATION_JSON_PATH;
    public static final EnumC910400Zna SENDER_SEND_ANIMATION_VIDEO_PATH;
    public static final EnumC910400Zna SPARKLE_LOTTIE_JSON_PATH;
    public static final EnumC910400Zna STATE_TRANSITION_ANIMATION_JSON_PATH;
    public static final EnumC910400Zna STATE_TRANSITION_ANIMATION_VIDEO_PATH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC910400Zna> getEntries() {
        return LLILLL;
    }

    static {
        EnumC910400Zna enumC910400Zna = new EnumC910400Zna("CARD_BACKGROUND_IMAGE_PATH", 0, "/static_cardskin.png");
        CARD_BACKGROUND_IMAGE_PATH = enumC910400Zna;
        EnumC910400Zna enumC910400Zna2 = new EnumC910400Zna("CARD_SKIN_TEXT_OVERLAY_IMAGE_PATH", 1, "/cardskin_text_overlay.png");
        CARD_SKIN_TEXT_OVERLAY_IMAGE_PATH = enumC910400Zna2;
        EnumC910400Zna enumC910400Zna3 = new EnumC910400Zna("SPARKLE_LOTTIE_JSON_PATH", 2, "/cardskin_sparkle_lottie.json");
        SPARKLE_LOTTIE_JSON_PATH = enumC910400Zna3;
        EnumC910400Zna enumC910400Zna4 = new EnumC910400Zna("OPEN_ANIMATION_VIDEO_PATH", 3, "/receiver_open_card_alpha_animation/output.mp4");
        OPEN_ANIMATION_VIDEO_PATH = enumC910400Zna4;
        EnumC910400Zna enumC910400Zna5 = new EnumC910400Zna("OPEN_ANIMATION_JSON_PATH", 4, "/receiver_open_card_alpha_animation/config.json");
        OPEN_ANIMATION_JSON_PATH = enumC910400Zna5;
        EnumC910400Zna enumC910400Zna6 = new EnumC910400Zna("CREATE_ANIMATION_VIDEO_PATH", 5, "/acb_open_card_alpha_animation/output.mp4");
        CREATE_ANIMATION_VIDEO_PATH = enumC910400Zna6;
        EnumC910400Zna enumC910400Zna7 = new EnumC910400Zna("CREATE_ANIMATION_JSON_PATH", 6, "/acb_open_card_alpha_animation/config.json");
        CREATE_ANIMATION_JSON_PATH = enumC910400Zna7;
        EnumC910400Zna enumC910400Zna8 = new EnumC910400Zna("SENDER_SEND_ANIMATION_VIDEO_PATH", 7, "/send_card_alpha_animation/output.mp4");
        SENDER_SEND_ANIMATION_VIDEO_PATH = enumC910400Zna8;
        EnumC910400Zna enumC910400Zna9 = new EnumC910400Zna("SENDER_SEND_ANIMATION_JSON_PATH", 8, "/send_card_alpha_animation/config.json");
        SENDER_SEND_ANIMATION_JSON_PATH = enumC910400Zna9;
        EnumC910400Zna enumC910400Zna10 = new EnumC910400Zna("STATE_TRANSITION_ANIMATION_VIDEO_PATH", 9, "/magicswirl_card_transit_alpha_animation/output.mp4");
        STATE_TRANSITION_ANIMATION_VIDEO_PATH = enumC910400Zna10;
        EnumC910400Zna enumC910400Zna11 = new EnumC910400Zna("STATE_TRANSITION_ANIMATION_JSON_PATH", 10, "/magicswirl_card_transit_alpha_animation/config.json");
        STATE_TRANSITION_ANIMATION_JSON_PATH = enumC910400Zna11;
        EnumC910400Zna[] enumC910400ZnaArr = {enumC910400Zna, enumC910400Zna2, enumC910400Zna3, enumC910400Zna4, enumC910400Zna5, enumC910400Zna6, enumC910400Zna7, enumC910400Zna8, enumC910400Zna9, enumC910400Zna10, enumC910400Zna11};
        LLILLJJLI = enumC910400ZnaArr;
        LLILLL = new C2254308sP(enumC910400ZnaArr);
    }

    public static EnumC910400Zna[] values() {
        return (EnumC910400Zna[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC910400Zna valueOf(String str) {
        return (EnumC910400Zna) C08FF.LIZ(EnumC910400Zna.class, str);
    }

    public EnumC910400Zna(String str, int i, String str2) {
        this.LL = str2;
    }
}
