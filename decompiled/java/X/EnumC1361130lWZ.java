package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lWZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1361130lWZ {
    public static final EnumC1361130lWZ DANMAKU_LIST;
    public static final EnumC1361130lWZ IS_INTRO_SHOW;
    public static final EnumC1361130lWZ KEYBOARD;
    public static final EnumC1361130lWZ LANDSCAPE_MODE;
    public static final /* synthetic */ EnumC1361130lWZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1361130lWZ LONG_PRESS;
    public static final EnumC1361130lWZ VIDEO;
    public static final EnumC1361130lWZ VIDEO_PLAYBACK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1361130lWZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1361130lWZ enumC1361130lWZ = new EnumC1361130lWZ("IS_INTRO_SHOW", 0, "is_intro_show");
        IS_INTRO_SHOW = enumC1361130lWZ;
        EnumC1361130lWZ enumC1361130lWZ2 = new EnumC1361130lWZ("VIDEO", 1, "video");
        VIDEO = enumC1361130lWZ2;
        EnumC1361130lWZ enumC1361130lWZ3 = new EnumC1361130lWZ("LONG_PRESS", 2, "long_press");
        LONG_PRESS = enumC1361130lWZ3;
        EnumC1361130lWZ enumC1361130lWZ4 = new EnumC1361130lWZ("KEYBOARD", 3, "keyboard");
        KEYBOARD = enumC1361130lWZ4;
        EnumC1361130lWZ enumC1361130lWZ5 = new EnumC1361130lWZ("DANMAKU_LIST", 4, "danmaku_list_panel");
        DANMAKU_LIST = enumC1361130lWZ5;
        EnumC1361130lWZ enumC1361130lWZ6 = new EnumC1361130lWZ("VIDEO_PLAYBACK", 5, "video_playback_screen");
        VIDEO_PLAYBACK = enumC1361130lWZ6;
        EnumC1361130lWZ enumC1361130lWZ7 = new EnumC1361130lWZ("LANDSCAPE_MODE", 6, "landscape_mode");
        LANDSCAPE_MODE = enumC1361130lWZ7;
        EnumC1361130lWZ[] enumC1361130lWZArr = {enumC1361130lWZ, enumC1361130lWZ2, enumC1361130lWZ3, enumC1361130lWZ4, enumC1361130lWZ5, enumC1361130lWZ6, enumC1361130lWZ7};
        LLILLJJLI = enumC1361130lWZArr;
        LLILLL = new C2254308sP(enumC1361130lWZArr);
    }

    public static EnumC1361130lWZ[] values() {
        return (EnumC1361130lWZ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1361130lWZ valueOf(String str) {
        return (EnumC1361130lWZ) C08FF.LIZ(EnumC1361130lWZ.class, str);
    }

    public EnumC1361130lWZ(String str, int i, String str2) {
        this.LL = str2;
    }
}
