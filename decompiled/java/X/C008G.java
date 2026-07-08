package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008G, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008G {
    public static final /* synthetic */ C008G[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C008G SEARCH_STICKER_STICKER_DOWNLOADING;
    public static final C008G SEARCH_STICKER_STICKER_DOWNLOAD_FAILED;
    public static final C008G SEARCH_STICKER_STICKER_DOWNLOAD_SUCCESS;
    public static final C008G SEARCH_STICKER_STICKER_NOT_DOWNLOAD;
    public static final C008G SEARCH_STICKER_STICKER_UNKNOWN;

    public static InterfaceC2044707zh<C008G> getEntries() {
        return LLILLJJLI;
    }

    static {
        C008G c008g = new C008G("SEARCH_STICKER_STICKER_UNKNOWN", 0);
        SEARCH_STICKER_STICKER_UNKNOWN = c008g;
        C008G c008g2 = new C008G("SEARCH_STICKER_STICKER_NOT_DOWNLOAD", 1);
        SEARCH_STICKER_STICKER_NOT_DOWNLOAD = c008g2;
        C008G c008g3 = new C008G("SEARCH_STICKER_STICKER_DOWNLOADING", 2);
        SEARCH_STICKER_STICKER_DOWNLOADING = c008g3;
        C008G c008g4 = new C008G("SEARCH_STICKER_STICKER_DOWNLOAD_SUCCESS", 3);
        SEARCH_STICKER_STICKER_DOWNLOAD_SUCCESS = c008g4;
        C008G c008g5 = new C008G("SEARCH_STICKER_STICKER_DOWNLOAD_FAILED", 4);
        SEARCH_STICKER_STICKER_DOWNLOAD_FAILED = c008g5;
        C008G[] c008gArr = {c008g, c008g2, c008g3, c008g4, c008g5};
        LL = c008gArr;
        LLILLJJLI = new C2254308sP(c008gArr);
    }

    public static C008G[] values() {
        return (C008G[]) LL.clone();
    }

    public static C008G valueOf(String str) {
        return (C008G) C08FF.LIZ(C008G.class, str);
    }

    public C008G(String str, int i) {
    }
}
