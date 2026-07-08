package X;

import Y.ARunnableS110S0100000_10;
import Y.ARunnableS79S0200000_10;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;

/* JADX INFO: renamed from: X.0PNZ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PNZ implements C0POE<SearchMixFeedList> {
    public final /* synthetic */ C0POK LIZ;
    public final /* synthetic */ C15O7 LIZIZ;
    public final /* synthetic */ C15O7 LIZJ;
    public final /* synthetic */ C0PNY LIZLLL;

    @Override // X.C0POE
    public final void onComplete() {
        C0QLU.LIZIZ();
        this.LIZLLL.LLLLIILLL.LJJIJIL();
        C0POK c0pok = this.LIZ;
        if (c0pok.LLLII) {
            C0POL c0pol = C0POL.LIZ;
            EnumC643900PNk enumC643900PNk = EnumC643900PNk.OTHER;
            c0pol.getClass();
            C0POL.LIZ(false, enumC643900PNk, c0pok);
            return;
        }
        C0PNY c0pny = this.LIZLLL;
        if (c0pny.LLLLLJLJLL) {
            c0pny.mHandler.post(new ARunnableS110S0100000_10(this, 197));
            this.LIZLLL.mHandler.post(new ARunnableS79S0200000_10(this, this.LIZJ, 95));
        } else if (c0pny.LLLLLLIL != null) {
            this.LIZLLL.LLLLLLIL.LIZ(new ARunnableS110S0100000_10(this, 198), this.LIZLLL.LLLJIL, "C", false, -1);
            this.LIZLLL.LLLLLLIL.LIZ(new ARunnableS79S0200000_10(this, this.LIZJ, 96), this.LIZLLL.LLLJIL, "R", false, -1);
        }
    }

    @Override // X.C0POE
    public final void onFailed(Throwable th) {
        if (((Boolean) C079D.LIZ.getValue()).booleanValue() && this.LIZLLL.LLLLLLIL == null) {
            this.LIZLLL.LLLLLLIL = new C643830PNd(this.LIZLLL.mHandler, this.LIZ);
        }
        C0QLU.LIZIZ();
        C0PNY c0pny = this.LIZLLL;
        c0pny.LLLIIIIL = true;
        c0pny.LJJLIL(5);
        this.LIZLLL.LLLLIILLL.LJJIIZ();
        this.LIZLLL.LLLLIILLL.LJJIJIL();
        C0POL c0pol = C0POL.LIZ;
        EnumC643900PNk enumC643900PNk = EnumC643900PNk.FAILED;
        c0pol.getClass();
        C0POL.LIZ(false, enumC643900PNk, null);
        C0POK c0pok = this.LIZ;
        if (c0pok.LLLII) {
            return;
        }
        C0PNY c0pny2 = this.LIZLLL;
        SearchResultParam searchResultParam = c0pok.LL;
        String str = c0pok.LLILZLL;
        c0pny2.getClass();
        C0P9F.LIZ.getClass();
        String searchFrom = searchResultParam.getSearchFrom();
        String enterMethod = searchResultParam.getEnterMethod();
        searchResultParam.key();
        String prefetchId = searchResultParam.getPrefetchId();
        C0P9G c0p9g = C0P9G.LIZ;
        C0P9H c0p9hLIZ = C0P9F.LIZ();
        c0p9g.getClass();
        C0P9G.LJII(searchFrom, enterMethod, prefetchId, str, "", -1, c0p9hLIZ);
        if (th instanceof Exception) {
            this.LIZLLL.LJJLIIIJJIZ((Exception) th, this.LIZJ);
            return;
        }
        this.LIZLLL.LJJLIIIJJIZ(this.LIZJ.LJIIJJI(), this.LIZJ);
        C0PNY c0pny3 = this.LIZLLL;
        c0pny3.LLJI = false;
        if (c0pny3.LLLLLJLJLL) {
            c0pny3.mHandler.post(new ARunnableS79S0200000_10(this, this.LIZJ, 97));
        } else {
            if (c0pny3.LLLLLLIL == null) {
                return;
            }
            this.LIZLLL.LLLLLLIL.LIZ(new ARunnableS79S0200000_10(this, this.LIZJ, 98), this.LIZLLL.LLLJIL, "R", false, -1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:325:0x0630  */
    @Override // X.C0POE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNext(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList r15) {
        /*
            Method dump skipped, instruction units count: 1587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PNZ.onNext(java.lang.Object):void");
    }

    public C0PNZ(C0PNY c0pny, C0POK c0pok, C15O7 c15o7, C15O7 c15o72) {
        this.LIZLLL = c0pny;
        this.LIZ = c0pok;
        this.LIZIZ = c15o7;
        this.LIZJ = c15o72;
    }
}
