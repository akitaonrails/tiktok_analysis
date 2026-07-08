package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hrv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC454450Hrv {
    public static final EnumC454450Hrv AIMOJI;
    public static final EnumC454450Hrv AISELF_STICKER;
    public static final EnumC454450Hrv COMMENT_STICKER;
    public static final C454460Hrw Companion;
    public static final EnumC454450Hrv GIPHY;
    public static final /* synthetic */ EnumC454450Hrv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC454450Hrv STICKER;
    public static final EnumC454450Hrv VIDEO_STICKER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC454450Hrv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC454450Hrv enumC454450Hrv = new EnumC454450Hrv("STICKER", 0, "sticker");
        STICKER = enumC454450Hrv;
        EnumC454450Hrv enumC454450Hrv2 = new EnumC454450Hrv("AIMOJI", 1, "aimoji");
        AIMOJI = enumC454450Hrv2;
        EnumC454450Hrv enumC454450Hrv3 = new EnumC454450Hrv("GIPHY", 2, "giphy");
        GIPHY = enumC454450Hrv3;
        EnumC454450Hrv enumC454450Hrv4 = new EnumC454450Hrv("VIDEO_STICKER", 3, "video_sticker");
        VIDEO_STICKER = enumC454450Hrv4;
        EnumC454450Hrv enumC454450Hrv5 = new EnumC454450Hrv("AISELF_STICKER", 4, "ai_self_sticker");
        AISELF_STICKER = enumC454450Hrv5;
        EnumC454450Hrv enumC454450Hrv6 = new EnumC454450Hrv("COMMENT_STICKER", 5, "comment_sticker");
        COMMENT_STICKER = enumC454450Hrv6;
        EnumC454450Hrv[] enumC454450HrvArr = {enumC454450Hrv, enumC454450Hrv2, enumC454450Hrv3, enumC454450Hrv4, enumC454450Hrv5, enumC454450Hrv6};
        LLILLJJLI = enumC454450HrvArr;
        LLILLL = new C2254308sP(enumC454450HrvArr);
        Companion = new C454460Hrw();
    }

    public static EnumC454450Hrv[] values() {
        return (EnumC454450Hrv[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC454450Hrv valueOf(String str) {
        return (EnumC454450Hrv) C08FF.LIZ(EnumC454450Hrv.class, str);
    }

    public EnumC454450Hrv(String str, int i, String str2) {
        this.LL = str2;
    }
}
