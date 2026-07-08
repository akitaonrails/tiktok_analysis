package X;

import Y.ARunnableS79S0200000_10;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;

/* JADX INFO: renamed from: X.0QKZ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QKZ implements C0POE<SearchSugResponse> {
    public final /* synthetic */ C668520QKc LIZ;

    @Override // X.C0POE
    public final void onComplete() {
        if (this.LIZ.LIZLLL.LIZIZ(null)) {
            this.LIZ.LJ.LIZLLL.LJJIJL("complete with null");
        }
    }

    public C0QKZ(C668520QKc c668520QKc) {
        this.LIZ = c668520QKc;
    }

    @Override // X.C0POE
    public final void onFailed(Throwable th) {
        if (this.LIZ.LIZLLL.LIZIZ(null)) {
            this.LIZ.LJ.LIZLLL.LJJIJL(th.getMessage());
        }
    }

    @Override // X.C0POE
    public final void onNext(SearchSugResponse searchSugResponse) {
        SearchSugResponse searchSugResponse2 = searchSugResponse;
        if (searchSugResponse2 != null && !TextUtils.isEmpty(searchSugResponse2.originQuery)) {
            searchSugResponse2.LLILLL = searchSugResponse2.originQuery;
            C668170QIt c668170QItLIZ = C668200QIw.LIZ(this.LIZ.LIZIZ.keywords);
            if (!this.LIZ.LIZJ.get()) {
                this.LIZ.LIZJ.set(true);
                c668170QItLIZ.LIZLLL();
            }
            if (this.LIZ.LIZ.equals(searchSugResponse2.originQuery)) {
                this.LIZ.LIZLLL.LIZIZ(searchSugResponse2);
                c668170QItLIZ.LIZ(Long.valueOf(searchSugResponse2.LJI()));
            } else {
                C668510QKb c668510QKb = this.LIZ.LJFF.LLJJIII.get(searchSugResponse2.originQuery);
                if (c668510QKb != null) {
                    c668510QKb.LIZIZ(searchSugResponse2);
                    c668170QItLIZ.LIZ(Long.valueOf(searchSugResponse2.LJI()));
                }
            }
            boolean zLJIILIIL = searchSugResponse2.LJIILIIL();
            if (zLJIILIIL) {
                if (((Number) C284250BCd.LIZ.getValue()).intValue() == 1 && this.LIZ.LJFF.LLJJIII.containsKey(searchSugResponse2.LLILLL)) {
                    C786410Ut5.LJJZZIII(this.LIZ.LJFF.LLILZ, new ARunnableS79S0200000_10(this, searchSugResponse2, 58));
                }
                C0QJL c0qjl = new C0QJL();
                c0qjl.LJIIZILJ("type", "obtain");
                c0qjl.LJIILJJIL();
            }
            if (!this.LIZ.LJFF.LLJILJIL.containsKey(searchSugResponse2.LLILLL)) {
                this.LIZ.LJFF.LJIJ(searchSugResponse2);
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
}
