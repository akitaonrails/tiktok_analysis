package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZEn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC896390ZEn {
    public static final EnumC896390ZEn DEFAULT_VIDEO;
    public static final EnumC896390ZEn HIGHLIGHT_STORY;
    public static final EnumC896390ZEn HIGHLIGHT_STORY_COLLECTION;
    public static final /* synthetic */ EnumC896390ZEn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC896390ZEn PHOTO_MODE;
    public static final EnumC896390ZEn SHARE_VIDEO_INLINE;
    public static final EnumC896390ZEn STORY;
    public static final EnumC896390ZEn TEXT_MODE;
    public static final EnumC896390ZEn VIDEO_SUBSCRIPTION;
    public final String LL;

    public static InterfaceC2044707zh<EnumC896390ZEn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC896390ZEn enumC896390ZEn = new EnumC896390ZEn("DEFAULT_VIDEO", 0, "share_video");
        DEFAULT_VIDEO = enumC896390ZEn;
        EnumC896390ZEn enumC896390ZEn2 = new EnumC896390ZEn("PHOTO_MODE", 1, "share_video_photo");
        PHOTO_MODE = enumC896390ZEn2;
        EnumC896390ZEn enumC896390ZEn3 = new EnumC896390ZEn("TEXT_MODE", 2, "share_video_text");
        TEXT_MODE = enumC896390ZEn3;
        EnumC896390ZEn enumC896390ZEn4 = new EnumC896390ZEn("STORY", 3, "share_video_story");
        STORY = enumC896390ZEn4;
        EnumC896390ZEn enumC896390ZEn5 = new EnumC896390ZEn("HIGHLIGHT_STORY", 4, "share_highlight_story");
        HIGHLIGHT_STORY = enumC896390ZEn5;
        EnumC896390ZEn enumC896390ZEn6 = new EnumC896390ZEn("HIGHLIGHT_STORY_COLLECTION", 5, "share_highlight_story_collection");
        HIGHLIGHT_STORY_COLLECTION = enumC896390ZEn6;
        EnumC896390ZEn enumC896390ZEn7 = new EnumC896390ZEn("VIDEO_SUBSCRIPTION", 6, "share_video_sub");
        VIDEO_SUBSCRIPTION = enumC896390ZEn7;
        EnumC896390ZEn enumC896390ZEn8 = new EnumC896390ZEn("SHARE_VIDEO_INLINE", 7, "share_video_inline");
        SHARE_VIDEO_INLINE = enumC896390ZEn8;
        EnumC896390ZEn[] enumC896390ZEnArr = {enumC896390ZEn, enumC896390ZEn2, enumC896390ZEn3, enumC896390ZEn4, enumC896390ZEn5, enumC896390ZEn6, enumC896390ZEn7, enumC896390ZEn8};
        LLILLJJLI = enumC896390ZEnArr;
        LLILLL = new C2254308sP(enumC896390ZEnArr);
    }

    public static EnumC896390ZEn[] values() {
        return (EnumC896390ZEn[]) LLILLJJLI.clone();
    }

    public final String getScene() {
        return this.LL;
    }

    public static EnumC896390ZEn valueOf(String str) {
        return (EnumC896390ZEn) C08FF.LIZ(EnumC896390ZEn.class, str);
    }

    public EnumC896390ZEn(String str, int i, String str2) {
        this.LL = str2;
    }
}
