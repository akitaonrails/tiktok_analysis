package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QFd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC667230QFd {
    public static final EnumC667230QFd CSI_BANNER_PROFILE;
    public static final /* synthetic */ EnumC667230QFd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC667230QFd SEARCH_ENTITY_WORD;
    public static final EnumC667230QFd SEARCH_FEED_BAR;
    public static final EnumC667230QFd SEARCH_HASH_TAG;
    public static final EnumC667230QFd SEARCH_RELATED_WORD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC667230QFd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC667230QFd enumC667230QFd = new EnumC667230QFd("SEARCH_FEED_BAR", 0, "related_search_anchor_v2");
        SEARCH_FEED_BAR = enumC667230QFd;
        EnumC667230QFd enumC667230QFd2 = new EnumC667230QFd("SEARCH_ENTITY_WORD", 1, "comment_highlighted_words");
        SEARCH_ENTITY_WORD = enumC667230QFd2;
        EnumC667230QFd enumC667230QFd3 = new EnumC667230QFd("SEARCH_RELATED_WORD", 2, "comment_related_search");
        SEARCH_RELATED_WORD = enumC667230QFd3;
        EnumC667230QFd enumC667230QFd4 = new EnumC667230QFd("SEARCH_HASH_TAG", 3, "video_title_challenge");
        SEARCH_HASH_TAG = enumC667230QFd4;
        EnumC667230QFd enumC667230QFd5 = new EnumC667230QFd("CSI_BANNER_PROFILE", 4, "csi_banner_profile");
        CSI_BANNER_PROFILE = enumC667230QFd5;
        EnumC667230QFd[] enumC667230QFdArr = {enumC667230QFd, enumC667230QFd2, enumC667230QFd3, enumC667230QFd4, enumC667230QFd5};
        LLILLJJLI = enumC667230QFdArr;
        LLILLL = new C2254308sP(enumC667230QFdArr);
    }

    public static EnumC667230QFd[] values() {
        return (EnumC667230QFd[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC667230QFd valueOf(String str) {
        return (EnumC667230QFd) C08FF.LIZ(EnumC667230QFd.class, str);
    }

    public EnumC667230QFd(String str, int i, String str2) {
        this.LL = str2;
    }
}
