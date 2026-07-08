package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC697700RYi {
    public static final EnumC697700RYi ANCHOR;
    public static final EnumC697700RYi ANNOTATION;
    public static final EnumC697700RYi BOTTOM_BANNER;
    public static final EnumC697700RYi BOTTOM_BUTTON;
    public static final EnumC697700RYi GLOBAL;
    public static final /* synthetic */ EnumC697700RYi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC697700RYi VIDEO_GENRE_TAG;
    public static final EnumC697700RYi VIDEO_META_TAG;
    public static final EnumC697700RYi VIDEO_TAG;
    public static final EnumC697700RYi VIDEO_TAG_HIGH;
    public static final EnumC697700RYi VIDEO_TAG_LOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC697700RYi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC697700RYi enumC697700RYi = new EnumC697700RYi("GLOBAL", 0, "interaction_root_container");
        GLOBAL = enumC697700RYi;
        EnumC697700RYi enumC697700RYi2 = new EnumC697700RYi("BOTTOM_BANNER", 1, "bottom_banner");
        BOTTOM_BANNER = enumC697700RYi2;
        EnumC697700RYi enumC697700RYi3 = new EnumC697700RYi("BOTTOM_BUTTON", 2, "bottom_button");
        BOTTOM_BUTTON = enumC697700RYi3;
        EnumC697700RYi enumC697700RYi4 = new EnumC697700RYi("VIDEO_TAG", 3, "main_tag");
        VIDEO_TAG = enumC697700RYi4;
        EnumC697700RYi enumC697700RYi5 = new EnumC697700RYi("VIDEO_TAG_LOW", 4, "low_tag");
        VIDEO_TAG_LOW = enumC697700RYi5;
        EnumC697700RYi enumC697700RYi6 = new EnumC697700RYi("VIDEO_TAG_HIGH", 5, "high_tag");
        VIDEO_TAG_HIGH = enumC697700RYi6;
        EnumC697700RYi enumC697700RYi7 = new EnumC697700RYi("VIDEO_GENRE_TAG", 6, "genre_tag");
        VIDEO_GENRE_TAG = enumC697700RYi7;
        EnumC697700RYi enumC697700RYi8 = new EnumC697700RYi("VIDEO_META_TAG", 7, "meta_tag");
        VIDEO_META_TAG = enumC697700RYi8;
        EnumC697700RYi enumC697700RYi9 = new EnumC697700RYi("ANNOTATION", 8, "annotation_container");
        ANNOTATION = enumC697700RYi9;
        EnumC697700RYi enumC697700RYi10 = new EnumC697700RYi("ANCHOR", 9, "anchor");
        ANCHOR = enumC697700RYi10;
        EnumC697700RYi[] enumC697700RYiArr = {enumC697700RYi, enumC697700RYi2, enumC697700RYi3, enumC697700RYi4, enumC697700RYi5, enumC697700RYi6, enumC697700RYi7, enumC697700RYi8, enumC697700RYi9, enumC697700RYi10};
        LLILLJJLI = enumC697700RYiArr;
        LLILLL = new C2254308sP(enumC697700RYiArr);
    }

    public static EnumC697700RYi[] values() {
        return (EnumC697700RYi[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC697700RYi valueOf(String str) {
        return (EnumC697700RYi) C08FF.LIZ(EnumC697700RYi.class, str);
    }

    public EnumC697700RYi(String str, int i, String str2) {
        this.LL = str2;
    }
}
