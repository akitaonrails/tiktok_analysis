package X;

import com.ss.android.ugc.aweme.search.lazy.SearchLazyCache;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PGJ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PGJ {
    public static final C0PGJ FIRST_FRAME;
    public static final /* synthetic */ C0PGJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0PGJ TOP_FIRST_SCREEN_SHOW;
    public final SearchLazyCache LL;

    public static InterfaceC2044707zh<C0PGJ> getEntries() {
        return LLILLL;
    }

    static {
        C0PGJ c0pgj = new C0PGJ("FIRST_FRAME", 0, new SearchLazyCache());
        FIRST_FRAME = c0pgj;
        C0PGJ c0pgj2 = new C0PGJ("TOP_FIRST_SCREEN_SHOW", 1, new SearchLazyCache());
        TOP_FIRST_SCREEN_SHOW = c0pgj2;
        C0PGJ[] c0pgjArr = {c0pgj, c0pgj2};
        LLILLJJLI = c0pgjArr;
        LLILLL = new C2254308sP(c0pgjArr);
    }

    public static C0PGJ[] values() {
        return (C0PGJ[]) LLILLJJLI.clone();
    }

    public final SearchLazyCache getCache$search_release() {
        return this.LL;
    }

    public static C0PGJ valueOf(String str) {
        return (C0PGJ) C08FF.LIZ(C0PGJ.class, str);
    }

    public C0PGJ(String str, int i, SearchLazyCache searchLazyCache) {
        this.LL = searchLazyCache;
    }
}
