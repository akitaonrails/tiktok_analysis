package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.ui.SearchProsConsTabFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0OyC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C636700OyC extends C20607315kN {
    public final C1390410mHn LL;
    public AnonymousClass0956 LLILLJJLI;
    public final /* synthetic */ SearchProsConsTabFragment LLILLL;

    @Override // X.C20607315kN
    public final void LJIIIIZZ() {
        AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILLJJLI = C948503nH.LJIIIIZZ(this.LLILLL, new C1591106Kv(this, null));
    }

    @Override // X.C20607315kN
    public final void LJII(Exception exc) {
        AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LL.LIZLLL();
        C786410Ut5.LLLZZIL(this.LL, 8);
    }

    @Override // X.C20607315kN
    public final void LJIIIZ(boolean z) {
        AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LL.LIZLLL();
        C786410Ut5.LLLZZIL(this.LL, 8);
    }

    public C636700OyC(View view, SearchProsConsTabFragment searchProsConsTabFragment) {
        int i;
        this.LLILLL = searchProsConsTabFragment;
        this.LL = (C1390410mHn) view.findViewById(R.id.gb1);
        C1390410mHn c1390410mHn = this.LL;
        ViewGroup.LayoutParams layoutParams = c1390410mHn.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            double dLIZLLL = ((double) C1389340mG4.LIZLLL()) * 0.75d;
            if (searchProsConsTabFragment.MR().tags.isEmpty()) {
                i = 0;
            } else {
                i = 64;
            }
            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(((dLIZLLL - ((double) (i + 54))) / ((double) 2)) - ((double) 18))));
            C786410Ut5.W5(c1390410mHn, marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
