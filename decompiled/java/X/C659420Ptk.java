package X;

import Y.ACListenerS145S0100000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.ProductAnchor;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;

/* JADX INFO: renamed from: X.0Ptk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659420Ptk implements InterfaceC1011000cPq {
    public final /* synthetic */ Aweme LIZ;
    public final /* synthetic */ SearchVideoHolder LIZIZ;

    @Override // X.InterfaceC1011000cPq
    public final AwS554S0100000_10 Ab() {
        return new AwS554S0100000_10(this.LIZIZ, 547);
    }

    @Override // X.InterfaceC1011000cPq
    public final FixedRatioFrameLayout Bb() {
        return this.LIZIZ.LLJJL;
    }

    @Override // X.InterfaceC1011000cPq
    public final void Cb() {
        SearchVideoHolder searchVideoHolder = this.LIZIZ;
        searchVideoHolder.onClick(searchVideoHolder.i7());
    }

    @Override // X.InterfaceC1011000cPq
    public final void Db() {
        this.LIZIZ.LLJJJ();
    }

    @Override // X.InterfaceC1011000cPq
    public final AwS624S0100000_10 Eb() {
        return new AwS624S0100000_10(this.LIZIZ, 67);
    }

    @Override // X.InterfaceC1011000cPq
    public final ViewGroup Fb() {
        return this.LIZIZ.LLJZIJLIL;
    }

    @Override // X.InterfaceC1011000cPq
    public final View Gb() {
        TextView textView = this.LIZIZ.LLLIZZ;
        if (textView == null) {
            return null;
        }
        return textView;
    }

    @Override // X.InterfaceC1011000cPq
    public final ViewGroup Hb() {
        return this.LIZIZ.LLJZ;
    }

    @Override // X.InterfaceC589020N8i
    public final C622570ObP LJIILJJIL() {
        return this.LIZIZ.T6(this.LIZ);
    }

    @Override // X.InterfaceC1010250cOd
    public final Context getContext() {
        return this.LIZIZ.LLIZ;
    }

    @Override // X.InterfaceC1011000cPq
    public final String getEnterFrom() {
        return this.LIZIZ.l3().LJIIIIZZ;
    }

    @Override // X.InterfaceC1011000cPq
    public final ProductAnchor yb() {
        return this.LIZIZ.LLLLLZL;
    }

    @Override // X.InterfaceC1011000cPq
    public final void zb() {
        InterfaceC588610N6t interfaceC588610N6t;
        Taco tacoLIZ = C0PCE.LIZ(this.LIZIZ.itemView, false);
        if (tacoLIZ != null && (interfaceC588610N6t = tacoLIZ.LLILLJJLI) != null) {
            interfaceC588610N6t.pause();
        }
        this.LIZIZ.LLLLLIL();
    }

    @Override // X.InterfaceC1010250cOd
    public final Aweme getAweme() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1011000cPq
    public final void Ib(ViewGroup viewGroup) {
        C1012300cRw c1012300cRw;
        if (!C07P0.LIZIZ()) {
            return;
        }
        SearchVideoHolder searchVideoHolder = this.LIZIZ;
        if ((viewGroup instanceof C1012300cRw) && (c1012300cRw = (C1012300cRw) viewGroup) != null) {
            searchVideoHolder.LLZLL = c1012300cRw;
            C786410Ut5.Ja(c1012300cRw, new ACListenerS145S0100000_10(searchVideoHolder, 28));
            C663180Pzo c663180Pzo = C663180Pzo.LIZ;
            C1012300cRw c1012300cRw2 = this.LIZIZ.LLZLL;
            c663180Pzo.getClass();
            C663180Pzo.LIZ(c1012300cRw2);
            C659400Pti c659400PtiH7 = this.LIZIZ.h7();
            SearchVideoHolder searchVideoHolder2 = this.LIZIZ;
            C1012300cRw c1012300cRw3 = searchVideoHolder2.LLZLL;
            c659400PtiH7.LLJ = c1012300cRw3;
            if (c1012300cRw3 != null) {
                C427690Gpr.LJI(c1012300cRw3, new AwS624S0100000_10(searchVideoHolder2, 61));
            }
        }
    }

    public C659420Ptk(Aweme aweme, SearchVideoHolder searchVideoHolder) {
        this.LIZ = aweme;
        this.LIZIZ = searchVideoHolder;
    }
}
