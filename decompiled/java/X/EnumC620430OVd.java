package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC620430OVd {
    public static final EnumC620430OVd AWEME_POST;
    public static final EnumC620430OVd CAMERA;
    public static final EnumC620430OVd IMAGE_UPLOAD;
    public static final EnumC620430OVd LIVE_EVENT;
    public static final EnumC620430OVd LIVE_HIGHLIGHT;
    public static final /* synthetic */ EnumC620430OVd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC620430OVd MUSIC;
    public static final EnumC620430OVd POLL;
    public static final EnumC620430OVd TEXT;
    public static final EnumC620430OVd VIDEO_UPLOAD;
    public static final EnumC620430OVd VOICE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC620430OVd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC620430OVd enumC620430OVd = new EnumC620430OVd("IMAGE_UPLOAD", 0, 1);
        IMAGE_UPLOAD = enumC620430OVd;
        EnumC620430OVd enumC620430OVd2 = new EnumC620430OVd("AWEME_POST", 1, 2);
        AWEME_POST = enumC620430OVd2;
        EnumC620430OVd enumC620430OVd3 = new EnumC620430OVd("CAMERA", 2, 3);
        CAMERA = enumC620430OVd3;
        EnumC620430OVd enumC620430OVd4 = new EnumC620430OVd("POLL", 3, 4);
        POLL = enumC620430OVd4;
        EnumC620430OVd enumC620430OVd5 = new EnumC620430OVd("LIVE_EVENT", 4, 5);
        LIVE_EVENT = enumC620430OVd5;
        EnumC620430OVd enumC620430OVd6 = new EnumC620430OVd("MUSIC", 5, 6);
        MUSIC = enumC620430OVd6;
        EnumC620430OVd enumC620430OVd7 = new EnumC620430OVd("VOICE", 6, 7);
        VOICE = enumC620430OVd7;
        EnumC620430OVd enumC620430OVd8 = new EnumC620430OVd("VIDEO_UPLOAD", 7, 8);
        VIDEO_UPLOAD = enumC620430OVd8;
        EnumC620430OVd enumC620430OVd9 = new EnumC620430OVd("TEXT", 8, 0);
        TEXT = enumC620430OVd9;
        EnumC620430OVd enumC620430OVd10 = new EnumC620430OVd("LIVE_HIGHLIGHT", 9, 10001);
        LIVE_HIGHLIGHT = enumC620430OVd10;
        EnumC620430OVd[] enumC620430OVdArr = {enumC620430OVd, enumC620430OVd2, enumC620430OVd3, enumC620430OVd4, enumC620430OVd5, enumC620430OVd6, enumC620430OVd7, enumC620430OVd8, enumC620430OVd9, enumC620430OVd10};
        LLILLJJLI = enumC620430OVdArr;
        LLILLL = new C2254308sP(enumC620430OVdArr);
    }

    public static EnumC620430OVd[] values() {
        return (EnumC620430OVd[]) LLILLJJLI.clone();
    }

    public final int getPostType() {
        return this.LL;
    }

    public static EnumC620430OVd valueOf(String str) {
        return (EnumC620430OVd) C08FF.LIZ(EnumC620430OVd.class, str);
    }

    public EnumC620430OVd(String str, int i, int i2) {
        this.LL = i2;
    }
}
