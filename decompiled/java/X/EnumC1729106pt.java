package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06pt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1729106pt {
    public static final EnumC1729106pt CHAT_GAME_BANNER;
    public static final EnumC1729106pt CHAT_GAME_NOTICE;
    public static final EnumC1729106pt CHAT_PAGE_CAMERA;
    public static final EnumC1729106pt GAME_BATTLE_ACTION_BAR;
    public static final EnumC1729106pt INBOX_CAMERA_ICON;
    public static final /* synthetic */ EnumC1729106pt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1729106pt TRY_EFFECT;
    public static final EnumC1729106pt VIDEO_DETAIL_CAMERA_ICON;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1729106pt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1729106pt enumC1729106pt = new EnumC1729106pt("CHAT_PAGE_CAMERA", 0, "chat_page_camera");
        CHAT_PAGE_CAMERA = enumC1729106pt;
        EnumC1729106pt enumC1729106pt2 = new EnumC1729106pt("INBOX_CAMERA_ICON", 1, "inbox_camera_icon");
        INBOX_CAMERA_ICON = enumC1729106pt2;
        EnumC1729106pt enumC1729106pt3 = new EnumC1729106pt("TRY_EFFECT", 2, "try_effect");
        TRY_EFFECT = enumC1729106pt3;
        EnumC1729106pt enumC1729106pt4 = new EnumC1729106pt("VIDEO_DETAIL_CAMERA_ICON", 3, "video_detail_camera_icon");
        VIDEO_DETAIL_CAMERA_ICON = enumC1729106pt4;
        EnumC1729106pt enumC1729106pt5 = new EnumC1729106pt("GAME_BATTLE_ACTION_BAR", 4, "game_battle_action_bar");
        GAME_BATTLE_ACTION_BAR = enumC1729106pt5;
        EnumC1729106pt enumC1729106pt6 = new EnumC1729106pt("CHAT_GAME_BANNER", 5, "chat_game_banner");
        CHAT_GAME_BANNER = enumC1729106pt6;
        EnumC1729106pt enumC1729106pt7 = new EnumC1729106pt("CHAT_GAME_NOTICE", 6, "chat_game_notice");
        CHAT_GAME_NOTICE = enumC1729106pt7;
        EnumC1729106pt[] enumC1729106ptArr = {enumC1729106pt, enumC1729106pt2, enumC1729106pt3, enumC1729106pt4, enumC1729106pt5, enumC1729106pt6, enumC1729106pt7};
        LLILLJJLI = enumC1729106ptArr;
        LLILLL = new C2254308sP(enumC1729106ptArr);
    }

    public static EnumC1729106pt[] values() {
        return (EnumC1729106pt[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1729106pt valueOf(String str) {
        return (EnumC1729106pt) C08FF.LIZ(EnumC1729106pt.class, str);
    }

    public EnumC1729106pt(String str, int i, String str2) {
        this.LL = str2;
    }
}
