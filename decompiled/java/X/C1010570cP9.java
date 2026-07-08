package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0cP9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010570cP9 extends C1010600cPC implements InterfaceC655240Pn0 {
    public final InterfaceC657350PqP LLIZLLLIL;
    public final SearchAdEventLogger LLJ;
    public C0Q1G LLJI;
    public final C1011580cQm LLJIJIL;
    public final C1009960cOA LLJILJIL;

    @Override // X.C1010600cPC
    public final void LJJI() {
    }

    @Override // X.InterfaceC655240Pn0
    public final void Tu() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onLivePlay], trackedLiveAutoPlay = ");
        C1009960cOA c1009960cOA = this.LLJILJIL;
        sbLIZ.append(c1009960cOA != null ? Boolean.valueOf(c1009960cOA.LIZIZ) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        C1009960cOA c1009960cOA2 = this.LLJILJIL;
        if (c1009960cOA2 == null || c1009960cOA2.LIZIZ) {
            return;
        }
        SearchAdEventLogger searchAdEventLogger = this.LLJ;
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd(C1009980cOC.LJJLIIIJ);
        this.LLJILJIL.LIZIZ = true;
    }

    @Override // X.C1010600cPC, X.C0PPF
    public final void bind() {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        ViewGroup viewGroupLJIIJ;
        super.bind();
        SearchAdEventLogger searchAdEventLogger = this.LLJ;
        Object[] objArr = new Object[2];
        objArr[0] = this.LLIZLLLIL.getAweme();
        Aweme aweme2 = this.LLIZLLLIL.getAweme();
        objArr[1] = aweme2 != null ? C1010120cOQ.LJIIIIZZ(aweme2) : null;
        searchAdEventLogger.withContext(objArr);
        Aweme aweme3 = this.LLIZLLLIL.getAweme();
        if (aweme3 != null && AwemeExtKt.isAdTraffic(aweme3) && (aweme = this.LLIZLLLIL.getAweme()) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (viewGroupLJIIJ = this.LLIZLLLIL.LJIIJ()) != null) {
            C786410Ut5.LJJJJI(viewGroupLJIIJ);
            C717630SCz c717630SCz = new C717630SCz(viewGroupLJIIJ);
            c717630SCz.LIZ(awemeRawAd, EnumC658120Pre.MULTI_LIVE_CARD);
            C21279718Pj c21279718Pj = c717630SCz.LIZ;
            if (c21279718Pj != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                C786410Ut5.W5(c21279718Pj, layoutParams);
                viewGroupLJIIJ.addView(c21279718Pj);
                C786410Ut5.LJLZ(0, viewGroupLJIIJ);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[bind], aweme.desc = ");
        Aweme aweme4 = this.LLIZLLLIL.getAweme();
        sbLIZ.append(aweme4 != null ? aweme4.getDesc() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
    }

    @Override // X.C1010600cPC, X.C0PPF
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        SearchAdEventLogger searchAdEventLogger = this.LLJ;
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd(C1009980cOC.LIZIZ);
        int i = C2510609se.LIZ;
    }

    @Override // X.C1010600cPC, X.C0PPF
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C1009960cOA c1009960cOA = this.LLJILJIL;
        if (c1009960cOA != null) {
            c1009960cOA.LIZIZ = false;
        }
        SearchAdEventLogger searchAdEventLogger = this.LLJ;
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd(C1009980cOC.LIZJ);
        int i = C2510609se.LIZ;
    }

    @Override // X.C1010600cPC
    public final /* bridge */ /* synthetic */ InterfaceC1010250cOd LJJ() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC1010250cOd Mh() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC655290Pn5
    public final C0Q1G getClickType() {
        return this.LLJI;
    }

    @Override // X.C1010600cPC, X.InterfaceC660150Puv
    public final InterfaceC1011430cQX vQ0() {
        return this.LLJIJIL;
    }

    public C1010570cP9(InterfaceC657350PqP interfaceC657350PqP) {
        C1011580cQm c1011580cQm;
        C1007860cKm c1007860cKmLJIILIIL;
        C19EG c19egLIZIZ;
        super(interfaceC657350PqP);
        this.LLIZLLLIL = interfaceC657350PqP;
        this.LLJ = new SearchAdEventLogger();
        this.LLJI = C0Q1G.OTHER;
        Context context = interfaceC657350PqP.getContext();
        C1009960cOA c1009960cOALIZ = null;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            c1011580cQm = new C1011580cQm(c19egLIZIZ);
        } else {
            c1011580cQm = null;
        }
        this.LLJIJIL = c1011580cQm;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        if (interfaceC657510PqfLIZLLL != null && (c1007860cKmLJIILIIL = interfaceC657510PqfLIZLLL.LJIILIIL()) != null) {
            c1009960cOALIZ = c1007860cKmLJIILIIL.LIZ(interfaceC657350PqP.getAweme());
        }
        this.LLJILJIL = c1009960cOALIZ;
    }

    @Override // X.InterfaceC655240Pn0
    public final void i60(C0Q1G c0q1g) {
        Aweme aweme;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onLiveCardClick] clickFrom = ");
        sbLIZ.append(c0q1g);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        this.LLJI = c0q1g;
        if (C1010120cOQ.LJJIJ(this.LLIZLLLIL.getAweme()) || ((aweme = this.LLIZLLLIL.getAweme()) != null && AwemeExtKt.isAdTraffic(aweme))) {
            SearchAdEventLogger searchAdEventLogger = this.LLJ;
            C1009980cOC.LIZ.getClass();
            searchAdEventLogger.logAd(C1009980cOC.LJIILLIIL);
        }
    }
}
