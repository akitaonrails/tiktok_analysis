package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nMZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1431810nMZ {
    public static final EnumC1431810nMZ DOWNLOAD_SHARE_PANEL_AUTO;
    public static final EnumC1431810nMZ EXIT_VIDEO_SHOOT_SEND_TO_FRIENDS;
    public static final /* synthetic */ EnumC1431810nMZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1431810nMZ MAIN_POSTING_CAMERA_ICON;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1431810nMZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1431810nMZ enumC1431810nMZ = new EnumC1431810nMZ("MAIN_POSTING_CAMERA_ICON", 0, "main_posting_camera_icon");
        MAIN_POSTING_CAMERA_ICON = enumC1431810nMZ;
        EnumC1431810nMZ enumC1431810nMZ2 = new EnumC1431810nMZ("DOWNLOAD_SHARE_PANEL_AUTO", 1, "download_share_panel_auto");
        DOWNLOAD_SHARE_PANEL_AUTO = enumC1431810nMZ2;
        EnumC1431810nMZ enumC1431810nMZ3 = new EnumC1431810nMZ("EXIT_VIDEO_SHOOT_SEND_TO_FRIENDS", 2, "exit_video_shoot_send_to_friends");
        EXIT_VIDEO_SHOOT_SEND_TO_FRIENDS = enumC1431810nMZ3;
        EnumC1431810nMZ[] enumC1431810nMZArr = {enumC1431810nMZ, enumC1431810nMZ2, enumC1431810nMZ3};
        LLILLJJLI = enumC1431810nMZArr;
        LLILLL = new C2254308sP(enumC1431810nMZArr);
    }

    public static EnumC1431810nMZ[] values() {
        return (EnumC1431810nMZ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1431810nMZ valueOf(String str) {
        return (EnumC1431810nMZ) C08FF.LIZ(EnumC1431810nMZ.class, str);
    }

    public EnumC1431810nMZ(String str, int i, String str2) {
        this.LL = str2;
    }
}
