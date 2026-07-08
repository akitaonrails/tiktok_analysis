package X;

import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMix;
import com.ss.android.ugc.aweme.search.pages.result.videosearch.core.ui.SearchFeedFragment;

/* JADX INFO: renamed from: X.0PLh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643350PLh extends C643800PNa<C0PNL> {
    public final C0PL7 LLILZLL;

    @Override // X.C643800PNa, X.C1260870iur
    public final void LJIILJJIL() {
        T t;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unbinding SearchAwemeModel listener count: ");
        T t2 = this.LL;
        sbLIZ.append(t2 != 0 ? Integer.valueOf(t2.mNotifyListeners.size()) : null);
        sbLIZ.append(" scene ");
        sbLIZ.append(this.LLILZLL.name());
        C2188811AlT.LIZIZ(sbLIZ);
        if (!((Boolean) C1820807Be.LIZ.getValue()).booleanValue() || this.LLILZLL != C0PL7.INFLOW || (t = this.LL) == 0 || t.mNotifyListeners.size() <= 1) {
            super.LJIILJJIL();
            return;
        }
        T t3 = this.LL;
        if (t3 != 0) {
            t3.clearNotifyListener(this);
        }
        this.LL = null;
    }

    @Override // X.C643800PNa, X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        SearchFragment searchFragment;
        C645140PSe c645140PSe;
        SearchMix searchMix;
        super.onSuccess();
        InterfaceC643870PNh interfaceC643870PNh = this.LLILZIL;
        String str = null;
        if (!(interfaceC643870PNh instanceof SearchFeedFragment) || (searchFragment = (SearchFragment) interfaceC643870PNh) == null) {
            return;
        }
        T t = this.LL;
        if (t != 0 && (searchMix = (SearchMix) t.getData()) != null) {
            str = searchMix.feedbackType;
        }
        AbstractC683590Qrd abstractC683590QrdNS = searchFragment.NS();
        if (!(abstractC683590QrdNS instanceof C645140PSe) || (c645140PSe = (C645140PSe) abstractC683590QrdNS) == null) {
            return;
        }
        c645140PSe.LLJI = str;
    }

    public C643350PLh(C0PL7 c0pl7) {
        this.LLILZLL = c0pl7;
    }

    @Override // X.C643800PNa
    /* JADX INFO: renamed from: LJIJJLI, reason: merged with bridge method [inline-methods] */
    public final void LJIIJ(C0PNL c0pnl) {
        super.LJIIJ(c0pnl);
        if (c0pnl != null) {
            c0pnl.onModelBound();
        }
    }
}
