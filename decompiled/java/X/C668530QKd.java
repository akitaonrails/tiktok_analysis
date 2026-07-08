package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;

/* JADX INFO: renamed from: X.0QKd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668530QKd implements InterfaceC2385309Wh<C1515820pY4<SearchSugResponse>, Void> {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ C668540QKe LIZIZ;
    public final /* synthetic */ C668510QKb LIZJ;
    public final /* synthetic */ C0QKX LIZLLL;
    public final /* synthetic */ C0QJX LJ;

    @Override // X.InterfaceC2385309Wh
    public final Void then(C15O7<C1515820pY4<SearchSugResponse>> c15o7) {
        C1C7U.LIZ("SearchSugPresenter@ac4.fetchSugByChunk$1");
        C1515820pY4<SearchSugResponse> c1515820pY4LJIIL = c15o7.LJIIL();
        if (c1515820pY4LJIIL != null) {
            c1515820pY4LJIIL.LIZLLL(new C0POE<SearchSugResponse>() { // from class: X.0QKY
                public boolean LIZ;

                @Override // X.C0POE
                public final void onComplete() {
                    if (this.LIZIZ.LIZJ.LIZIZ(null)) {
                        this.LIZIZ.LIZLLL.LIZLLL.LJJIJL("complete with null");
                    }
                }

                @Override // X.C0POE
                public final void onFailed(Throwable th) {
                    if (this.LIZIZ.LIZJ.LIZIZ(null)) {
                        this.LIZIZ.LIZLLL.LIZLLL.LJJIJL(th.getMessage());
                    }
                }

                @Override // X.C0POE
                public final void onNext(SearchSugResponse searchSugResponse) {
                    SearchSugResponse searchSugResponse2 = searchSugResponse;
                    if (searchSugResponse2 != null && !TextUtils.isEmpty(searchSugResponse2.originQuery)) {
                        searchSugResponse2.LLILLL = searchSugResponse2.originQuery;
                        C668170QIt c668170QItLIZ = C668200QIw.LIZ(this.LIZIZ.LIZIZ.keywords);
                        if (!this.LIZ) {
                            this.LIZ = true;
                            c668170QItLIZ.LIZLLL();
                        }
                        if (this.LIZIZ.LIZ.equals(searchSugResponse2.originQuery)) {
                            this.LIZIZ.LIZJ.LIZIZ(searchSugResponse2);
                            c668170QItLIZ.LIZ(Long.valueOf(searchSugResponse2.LJI()));
                        } else {
                            C668510QKb c668510QKb = this.LIZIZ.LJ.LLJJIII.get(searchSugResponse2.originQuery);
                            if (c668510QKb != null) {
                                c668510QKb.LIZIZ(searchSugResponse2);
                                c668170QItLIZ.LIZ(Long.valueOf(searchSugResponse2.LJI()));
                            }
                        }
                        boolean zLJIILIIL = searchSugResponse2.LJIILIIL();
                        if (zLJIILIIL) {
                            C0QJL c0qjl = new C0QJL();
                            c0qjl.LJIIZILJ("type", "obtain");
                            c0qjl.LJIILJJIL();
                        }
                        if (!this.LIZIZ.LJ.LLJILJIL.containsKey(searchSugResponse2.LLILLL)) {
                            this.LIZIZ.LJ.LJIJ(searchSugResponse2);
                        } else {
                            if (!zLJIILIIL) {
                                return;
                            }
                            C0QJL c0qjl2 = new C0QJL();
                            c0qjl2.LJIIZILJ("type", "overdue");
                            c0qjl2.LJIILJJIL();
                        }
                    }
                }
            });
        } else if (this.LIZJ.LIZIZ(null)) {
            this.LIZLLL.LIZLLL.LJJIJL("stream is null");
        }
        C1C7U.LIZIZ("SearchSugPresenter@ac4.fetchSugByChunk$1");
        return null;
    }

    public C668530QKd(C0QJX c0qjx, String str, C668540QKe c668540QKe, C668510QKb c668510QKb, C0QKX c0qkx) {
        this.LJ = c0qjx;
        this.LIZ = str;
        this.LIZIZ = c668540QKe;
        this.LIZJ = c668510QKb;
        this.LIZLLL = c0qkx;
    }
}
