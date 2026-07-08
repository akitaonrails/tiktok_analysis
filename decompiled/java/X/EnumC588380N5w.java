package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N5w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC588380N5w implements InterfaceC593520NPq<String> {
    public static final /* synthetic */ EnumC588380N5w[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC588380N5w MUSIC_PAGE;
    public static final EnumC588380N5w VIDEO_FEED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC588380N5w> getEntries() {
        return LLILLL;
    }

    static {
        EnumC588380N5w enumC588380N5w = new EnumC588380N5w("MUSIC_PAGE", 0, "music_page");
        MUSIC_PAGE = enumC588380N5w;
        EnumC588380N5w enumC588380N5w2 = new EnumC588380N5w("VIDEO_FEED", 1, "video_feed");
        VIDEO_FEED = enumC588380N5w2;
        EnumC588380N5w[] enumC588380N5wArr = {enumC588380N5w, enumC588380N5w2};
        LLILLJJLI = enumC588380N5wArr;
        LLILLL = new C2254308sP(enumC588380N5wArr);
    }

    public static EnumC588380N5w[] values() {
        return (EnumC588380N5w[]) LLILLJJLI.clone();
    }

    @Override // X.InterfaceC593520NPq
    public String getParamValue() {
        return this.LL;
    }

    public static EnumC588380N5w valueOf(String str) {
        return (EnumC588380N5w) C08FF.LIZ(EnumC588380N5w.class, str);
    }

    public EnumC588380N5w(String str, int i, String str2) {
        this.LL = str2;
    }
}
