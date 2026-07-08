package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15UL, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15UL {
    public static final C15UL IDLE;
    public static final /* synthetic */ C15UL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C15UL LOADING;
    public static final C15UL READING_FAKE_REFRESH_CACHE;
    public static final C15UL READING_FALLBACK_CACHE;
    public static final C15UL READING_HOT_CACHE;
    public static final C15UL READING_PRELOAD_CACHE;
    public static final C15UL REQUEST_FAILED;
    public static final C15UL REQUEST_SUCCESS_EMPTY;
    public static final C15UL REQUEST_SUCCESS_NOT_RENDERED;
    public static final C15UL SHOWING_FAKE_REFRESH_DATA;
    public static final C15UL SHOWING_HOT_CACHE_DATA;
    public static final C15UL SHOWING_PRELOADING_DATA;
    public static final C15UL SHOWING_REQUEST_DATA;
    public final String LL;

    public static InterfaceC2044707zh<C15UL> getEntries() {
        return LLILLL;
    }

    static {
        C15UL c15ul = new C15UL("IDLE", 0, "idle");
        IDLE = c15ul;
        C15UL c15ul2 = new C15UL("READING_FAKE_REFRESH_CACHE", 1, "reading_fake_refresh_cache");
        READING_FAKE_REFRESH_CACHE = c15ul2;
        C15UL c15ul3 = new C15UL("READING_PRELOAD_CACHE", 2, "reading_preload_cache");
        READING_PRELOAD_CACHE = c15ul3;
        C15UL c15ul4 = new C15UL("READING_FALLBACK_CACHE", 3, "reading_fallback_cache");
        READING_FALLBACK_CACHE = c15ul4;
        C15UL c15ul5 = new C15UL("READING_HOT_CACHE", 4, "reading_hot_cache");
        READING_HOT_CACHE = c15ul5;
        C15UL c15ul6 = new C15UL("LOADING", 5, "loading");
        LOADING = c15ul6;
        C15UL c15ul7 = new C15UL("REQUEST_FAILED", 6, "request_failed");
        REQUEST_FAILED = c15ul7;
        C15UL c15ul8 = new C15UL("REQUEST_SUCCESS_EMPTY", 7, "request_success_empty");
        REQUEST_SUCCESS_EMPTY = c15ul8;
        C15UL c15ul9 = new C15UL("REQUEST_SUCCESS_NOT_RENDERED", 8, "request_success_not_rendered");
        REQUEST_SUCCESS_NOT_RENDERED = c15ul9;
        C15UL c15ul10 = new C15UL("SHOWING_FAKE_REFRESH_DATA", 9, "showing_fake_refresh_data");
        SHOWING_FAKE_REFRESH_DATA = c15ul10;
        C15UL c15ul11 = new C15UL("SHOWING_PRELOADING_DATA", 10, "showing_preloading_data");
        SHOWING_PRELOADING_DATA = c15ul11;
        C15UL c15ul12 = new C15UL("SHOWING_REQUEST_DATA", 11, "showing_request_data");
        SHOWING_REQUEST_DATA = c15ul12;
        C15UL c15ul13 = new C15UL("SHOWING_HOT_CACHE_DATA", 12, "showing_hot_cache_data");
        SHOWING_HOT_CACHE_DATA = c15ul13;
        C15UL[] c15ulArr = {c15ul, c15ul2, c15ul3, c15ul4, c15ul5, c15ul6, c15ul7, c15ul8, c15ul9, c15ul10, c15ul11, c15ul12, c15ul13};
        LLILLJJLI = c15ulArr;
        LLILLL = new C2254308sP(c15ulArr);
    }

    public static C15UL[] values() {
        return (C15UL[]) LLILLJJLI.clone();
    }

    public final String getStatus() {
        return this.LL;
    }

    public static C15UL valueOf(String str) {
        return (C15UL) C08FF.LIZ(C15UL.class, str);
    }

    public C15UL(String str, int i, String str2) {
        this.LL = str2;
    }
}
