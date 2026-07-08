package X;

import Y.ARunnableS79S0200000_10;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0QKa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668500QKa implements C0POE<SearchSugResponse> {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ C668540QKe LIZIZ;
    public final /* synthetic */ AtomicBoolean LIZJ;
    public final /* synthetic */ C668510QKb LIZLLL;
    public final /* synthetic */ C0QKX LJ;
    public final /* synthetic */ C0QJX LJFF;

    @Override // X.C0POE
    public final void onComplete() {
        if (this.LIZLLL.LIZIZ(null)) {
            this.LJ.LIZLLL.LJJIJL("complete with null");
        }
    }

    @Override // X.C0POE
    public final void onFailed(Throwable th) {
        if (this.LIZLLL.LIZIZ(null)) {
            this.LJ.LIZLLL.LJJIJL(th.getMessage());
        }
    }

    @Override // X.C0POE
    public final void onNext(SearchSugResponse searchSugResponse) {
        SearchSugResponse searchSugResponse2 = searchSugResponse;
        if (searchSugResponse2 != null && !TextUtils.isEmpty(searchSugResponse2.originQuery)) {
            searchSugResponse2.LLILLL = searchSugResponse2.originQuery;
            C668170QIt c668170QItLIZ = C668200QIw.LIZ(this.LIZIZ.keywords);
            if (!this.LIZJ.get()) {
                this.LIZJ.set(true);
                c668170QItLIZ.LIZLLL();
            }
            if (this.LIZ.equals(searchSugResponse2.originQuery)) {
                this.LIZLLL.LIZIZ(searchSugResponse2);
                c668170QItLIZ.LIZ(Long.valueOf(searchSugResponse2.LJI()));
            } else {
                C668510QKb c668510QKb = this.LJFF.LLJJIII.get(searchSugResponse2.originQuery);
                if (c668510QKb != null) {
                    c668510QKb.LIZIZ(searchSugResponse2);
                    c668170QItLIZ.LIZ(Long.valueOf(searchSugResponse2.LJI()));
                }
            }
            boolean zLJIILIIL = searchSugResponse2.LJIILIIL();
            if (zLJIILIIL) {
                if (((Number) C284250BCd.LIZ.getValue()).intValue() == 1 && this.LJFF.LLJJIII.containsKey(searchSugResponse2.LLILLL)) {
                    C786410Ut5.LJJZZIII(this.LJFF.LLILZ, new ARunnableS79S0200000_10(this, searchSugResponse2, 57));
                }
                C0QJL c0qjl = new C0QJL();
                c0qjl.LJIIZILJ("type", "obtain");
                c0qjl.LJIILJJIL();
            }
            if (!this.LJFF.LLJILJIL.containsKey(searchSugResponse2.LLILLL)) {
                this.LJFF.LJIJ(searchSugResponse2);
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

    public C668500QKa(C668540QKe c668540QKe, C668510QKb c668510QKb, C0QKX c0qkx, C0QJX c0qjx, String str, AtomicBoolean atomicBoolean) {
        this.LJFF = c0qjx;
        this.LIZ = str;
        this.LIZIZ = c668540QKe;
        this.LIZJ = atomicBoolean;
        this.LIZLLL = c668510QKb;
        this.LJ = c0qkx;
    }
}
