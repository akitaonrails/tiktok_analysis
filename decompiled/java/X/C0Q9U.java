package X;

import com.ss.android.ugc.aweme.discover.model.SearchApiResult;

/* JADX INFO: renamed from: X.0Q9U, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q9U {
    public final C0Q9S LIZ;
    public final SearchApiResult LIZIZ;
    public final Exception LIZJ;
    public final boolean LIZLLL;

    public C0Q9U() {
        this(null, null, null, false, 15);
    }

    public C0Q9U(C0Q9S c0q9s, SearchApiResult searchApiResult, Exception exc, boolean z, int i) {
        c0q9s = (i & 1) != 0 ? null : c0q9s;
        searchApiResult = (i & 2) != 0 ? null : searchApiResult;
        exc = (i & 4) != 0 ? null : exc;
        z = (i & 8) != 0 ? false : z;
        this.LIZ = c0q9s;
        this.LIZIZ = searchApiResult;
        this.LIZJ = exc;
        this.LIZLLL = z;
    }
}
