package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NEV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NEV {
    public static final C0NEV ALL_KEVA_EMPTY;
    public static final C0NEV ALL_TIME_OUT;
    public static final C0NEV CHANGE_UID;
    public static final C0NEV DEFAULT;
    public static final C0NEV ELIMINATE_DUPLICATION;
    public static final C0NEV FEED_FAST;
    public static final C0NEV HAD_CACHE;
    public static final C0NEV HAD_DOWNLOAD_VIDEO;
    public static final C0NEV HAD_LOAD_VIDEO;
    public static final C0NEV ITEM_LIST_IS_NULL;
    public static final /* synthetic */ C0NEV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0NEV NEVER_DOWNLOAD_VIDEO_SUC;
    public static final C0NEV NEVER_ENTER_CACHE_MODULE;
    public static final C0NEV NEVER_FETCH_FEED_SUC;
    public static final C0NEV NON_PERSONALIZED;
    public static final C0NEV NOT_HIT_CACHE;
    public static final C0NEV SAME_LAST_SESSION;
    public static final C0NEV VIDEO_IS_NULL;
    public final int LL;

    public static InterfaceC2044707zh<C0NEV> getEntries() {
        return LLILLL;
    }

    static {
        C0NEV c0nev = new C0NEV("HAD_LOAD_VIDEO", 0, -4);
        HAD_LOAD_VIDEO = c0nev;
        C0NEV c0nev2 = new C0NEV("HAD_DOWNLOAD_VIDEO", 1, -3);
        HAD_DOWNLOAD_VIDEO = c0nev2;
        C0NEV c0nev3 = new C0NEV(LivePreviewCTASmartDisplayManager.DEFAULT, 2, -2);
        DEFAULT = c0nev3;
        C0NEV c0nev4 = new C0NEV("HAD_CACHE", 3, -1);
        HAD_CACHE = c0nev4;
        C0NEV c0nev5 = new C0NEV("NEVER_ENTER_CACHE_MODULE", 4, 0);
        NEVER_ENTER_CACHE_MODULE = c0nev5;
        C0NEV c0nev6 = new C0NEV("NEVER_FETCH_FEED_SUC", 5, 1);
        NEVER_FETCH_FEED_SUC = c0nev6;
        C0NEV c0nev7 = new C0NEV("NEVER_DOWNLOAD_VIDEO_SUC", 6, 2);
        NEVER_DOWNLOAD_VIDEO_SUC = c0nev7;
        C0NEV c0nev8 = new C0NEV("ELIMINATE_DUPLICATION", 7, 3);
        ELIMINATE_DUPLICATION = c0nev8;
        C0NEV c0nev9 = new C0NEV("ALL_KEVA_EMPTY", 8, 4);
        ALL_KEVA_EMPTY = c0nev9;
        C0NEV c0nev10 = new C0NEV("ALL_TIME_OUT", 9, 5);
        ALL_TIME_OUT = c0nev10;
        C0NEV c0nev11 = new C0NEV("VIDEO_IS_NULL", 10, 6);
        VIDEO_IS_NULL = c0nev11;
        C0NEV c0nev12 = new C0NEV("NOT_HIT_CACHE", 11, 7);
        NOT_HIT_CACHE = c0nev12;
        C0NEV c0nev13 = new C0NEV("ITEM_LIST_IS_NULL", 12, 8);
        ITEM_LIST_IS_NULL = c0nev13;
        C0NEV c0nev14 = new C0NEV("CHANGE_UID", 13, 9);
        CHANGE_UID = c0nev14;
        C0NEV c0nev15 = new C0NEV("NON_PERSONALIZED", 14, 10);
        NON_PERSONALIZED = c0nev15;
        C0NEV c0nev16 = new C0NEV("FEED_FAST", 15, 11);
        FEED_FAST = c0nev16;
        C0NEV c0nev17 = new C0NEV("SAME_LAST_SESSION", 16, 12);
        SAME_LAST_SESSION = c0nev17;
        C0NEV[] c0nevArr = {c0nev, c0nev2, c0nev3, c0nev4, c0nev5, c0nev6, c0nev7, c0nev8, c0nev9, c0nev10, c0nev11, c0nev12, c0nev13, c0nev14, c0nev15, c0nev16, c0nev17};
        LLILLJJLI = c0nevArr;
        LLILLL = new C2254308sP(c0nevArr);
    }

    public static C0NEV[] values() {
        return (C0NEV[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0NEV valueOf(String str) {
        return (C0NEV) C08FF.LIZ(C0NEV.class, str);
    }

    public C0NEV(String str, int i, int i2) {
        this.LL = i2;
    }
}
