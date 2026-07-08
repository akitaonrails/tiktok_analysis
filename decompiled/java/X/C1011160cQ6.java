package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;

/* JADX INFO: renamed from: X.0cQ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011160cQ6 extends C1011080cPy implements InterfaceC656740PpQ {
    public final InterfaceC656790PpV LLILZLL;
    public final Aweme LLIZ;
    public final C1011580cQm LLIZLLLIL;
    public final SearchAdEventLogger LLJ;
    public final C1066240dqw LLJI;
    public final C1011930cRL LLJIJIL;
    public boolean LLJILJIL;
    public C0Q18 LLJILJILJ;
    public boolean LLJILLL;
    public final InterfaceC585680My6 LLJJ;

    @Override // X.InterfaceC656670PpJ
    public final void J0() {
        if (this.LLJILJIL) {
            C1011580cQm c1011580cQm = this.LLIZLLLIL;
            if (c1011580cQm != null) {
                c1011580cQm.LIZIZ(EnumC1011130cQ3.PHOTO_CARD_START_PLAY);
            }
            this.LLJILJIL = false;
        }
        int i = C2510609se.LIZ;
        C1011930cRL c1011930cRL = this.LLJIJIL;
        if (c1011930cRL != null) {
            c1011930cRL.LJJJIL();
        }
    }

    public final void LJJ() {
        AwemeRawAd awemeRawAd;
        Aweme aweme = this.LLIZ;
        SmartRouter.buildRoute(this.LLILZLL.getContext(), (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) ? null : awemeRawAd.getOpenUrl()).open();
    }

    @Override // X.InterfaceC656670PpJ
    public final void LLZZZZ() {
        int i = C2510609se.LIZ;
        C1011930cRL c1011930cRL = this.LLJIJIL;
        if (c1011930cRL != null) {
            c1011930cRL.LJJJJ();
        }
    }

    @Override // X.C1011080cPy, X.C0PPF
    public final void bind() {
        if (this.LLIZ == null) {
            return;
        }
        if (((Boolean) C0BIM.LIZ.getValue()).booleanValue()) {
            InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
            C0Q18 c0q18LIZIZ = interfaceC657510PqfLIZLLL != null ? interfaceC657510PqfLIZLLL.LIZIZ(this.LLILZLL.getAweme(), null, false, false) : null;
            this.LLJILJILJ = c0q18LIZIZ;
            if (c0q18LIZIZ != null) {
                Aweme aweme = this.LLILZLL.getAweme();
                Context context = this.LLILZLL.getContext();
                ViewGroup itemView = this.LLILZLL.getItemView();
                c0q18LIZIZ.Jt2(new C1010460cOy(aweme, context, new C1009920cO6(this.LLILZLL.getAweme(), this.LLJ, new AwS630S0100000_16(this, 3)), new C1011250cQF(this.LLILLL, this.LLIZLLLIL, this.LLILZLL.getAweme()), itemView, null, 32));
            }
            C0Q18 c0q18 = this.LLJILJILJ;
            if (c0q18 != null) {
                c0q18.bind();
            }
        }
        super.bind();
        ViewGroup viewGroupLJFF = this.LLILZLL.LJFF();
        if (viewGroupLJFF != null) {
            C1009940cO8.LJI(viewGroupLJFF);
        }
        C1066240dqw c1066240dqw = this.LLJI;
        if (c1066240dqw != null) {
            Aweme aweme2 = this.LLIZ;
            C1066240dqw.LJJIJLIJ(c1066240dqw, aweme2, aweme2 != null ? C1005340cGi.LIZ(aweme2) : null, null, new InterfaceC1066270dqz() { // from class: X.0cQL
                @Override // X.InterfaceC1066270dqz
                public final void LIZ(int i) {
                    this.LIZ.Q1(C0Q1G.VIDEO);
                }

                @Override // X.InterfaceC1066270dqz
                public final void LIZIZ(View view) {
                    InterfaceC1631620sYq<Aweme, String, View, Unit> interfaceC1631620sYqLIZ;
                    InterfaceC656790PpV interfaceC656790PpV = this.LIZ.LLILZLL;
                    if (interfaceC656790PpV != null && (interfaceC1631620sYqLIZ = interfaceC656790PpV.LIZ()) != null) {
                        interfaceC1631620sYqLIZ.invoke(this.LIZ.LLIZ, "ads", view);
                    }
                }
            }, 20);
        }
        C1011930cRL c1011930cRL = this.LLJIJIL;
        if (c1011930cRL != null) {
            c1011930cRL.setAdapter(this.LLJI);
            c1011930cRL.setSupportSlide(false);
            c1011930cRL.LJJJI(new C1011950cRN(800L, 1700L, C1010120cOQ.LJ(this.LLIZ)));
        }
        ViewGroup viewGroupLJFF2 = this.LLILZLL.LJFF();
        if (viewGroupLJFF2 != null) {
            viewGroupLJFF2.addView(this.LLJIJIL);
            C786410Ut5.LJLZ(0, viewGroupLJFF2);
        }
        C1011580cQm c1011580cQm = this.LLIZLLLIL;
        if (c1011580cQm != null) {
            c1011580cQm.LIZLLL(EnumC1011130cQ3.CTA_CLICK, new AwS560S0100000_16(this, 14));
        }
    }

    @Override // X.C0PPF
    public final void onDestroy() {
        InterfaceC585680My6 interfaceC585680My6 = this.LLJJ;
        if (interfaceC585680My6 != null) {
            interfaceC585680My6.LJ(null, null);
        }
    }

    @Override // X.C1011080cPy, X.C0PPF
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C622570ObP c622570ObPLJIILJJIL = this.LLILZLL.LJIILJJIL();
        SearchAdEventLogger searchAdEventLogger = this.LLJ;
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd(C1009980cOC.LIZIZ, new AwS595S0100000_16(c622570ObPLJIILJJIL, 47));
        if (c622570ObPLJIILJJIL != null) {
            C625790Ogb.LIZ();
            LJIIIZ(c622570ObPLJIILJJIL.LJIILIIL);
        }
        C0Q18 c0q18 = this.LLJILJILJ;
        if (c0q18 != null) {
            c0q18.onViewAttachedToWindow();
        }
        if (C1009940cO8.LIZLLL(this.LLIZ)) {
            int i = C2510609se.LIZ;
            Aweme aweme = this.LLILZLL.getAweme();
            Context context = this.LLILZLL.getContext();
            ViewGroup itemView = this.LLILZLL.getItemView();
            if (aweme == null || context == null || itemView == null) {
                return;
            }
            InterfaceC585680My6 interfaceC585680My6 = this.LLJJ;
            if (interfaceC585680My6 != null) {
                interfaceC585680My6.LJIIL(context, aweme, C588990N8f.LIZ(this.LLILZLL.LJIILJJIL()));
            }
            InterfaceC585680My6 interfaceC585680My62 = this.LLJJ;
            if (interfaceC585680My62 != null) {
                interfaceC585680My62.LIZJ(context, itemView, aweme, C588990N8f.LIZ(this.LLILZLL.LJIILJJIL()));
            }
        }
    }

    @Override // X.C1011080cPy, X.C0PPF
    public final void onViewDetachedFromWindow() {
        InterfaceC585680My6 interfaceC585680My6;
        super.onViewDetachedFromWindow();
        this.LLJILJIL = true;
        SearchAdEventLogger searchAdEventLogger = this.LLJ;
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd(C1009980cOC.LIZJ);
        C622570ObP c622570ObPLJIILJJIL = this.LLILZLL.LJIILJJIL();
        if (c622570ObPLJIILJJIL != null) {
            C1011700cQy.LIZ(this, c622570ObPLJIILJJIL);
        }
        C0Q18 c0q18 = this.LLJILJILJ;
        if (c0q18 != null) {
            c0q18.onViewDetachedFromWindow();
        }
        if (C1009940cO8.LIZLLL(this.LLIZ)) {
            int i = C2510609se.LIZ;
            Aweme aweme = this.LLILZLL.getAweme();
            Context context = this.LLILZLL.getContext();
            ViewGroup itemView = this.LLILZLL.getItemView();
            if (aweme == null || context == null || itemView == null || (interfaceC585680My6 = this.LLJJ) == null) {
                return;
            }
            interfaceC585680My6.LIZIZ(context, aweme);
        }
    }

    @Override // X.C1011080cPy, X.C0PPF
    public final void unBind() {
        super.unBind();
        C1011930cRL c1011930cRL = this.LLJIJIL;
        if (c1011930cRL != null) {
            c1011930cRL.LJJJJ();
        }
        C0Q18 c0q18 = this.LLJILJILJ;
        if (c0q18 != null) {
            c0q18.onDestroy();
        }
    }

    @Override // X.InterfaceC1011690cQx
    public final boolean LJIJJLI() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC1010250cOd Mh() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC656660PpI
    public final C1011930cRL Mm0() {
        return this.LLJIJIL;
    }

    @Override // X.C1011080cPy, X.InterfaceC660150Puv
    public final InterfaceC1011430cQX vQ0() {
        return this.LLIZLLLIL;
    }

    public C1011160cQ6(C656780PpU c656780PpU) {
        C19EG c19egLIZIZ;
        C1011580cQm c1011580cQm;
        C1066240dqw c1066240dqw;
        InterfaceC1019050ccp interfaceC1019050ccpLIZJ;
        super(c656780PpU);
        this.LLILZLL = c656780PpU;
        Aweme aweme = c656780PpU.getAweme();
        this.LLIZ = aweme;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        ViewGroup itemView = c656780PpU.getItemView();
        Context context = c656780PpU.getContext();
        if (context != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(itemView, c19egLIZIZ);
        if (lifecycleOwnerLJIJI != null) {
            c1011580cQm = new C1011580cQm(lifecycleOwnerLJIJI);
        } else {
            c1011580cQm = null;
        }
        this.LLIZLLLIL = c1011580cQm;
        SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger(aweme);
        this.LLJ = searchAdEventLogger;
        C1010580cPA c1010580cPA = new C1010580cPA(c656780PpU.getItemView(), null, EnumC658110Prd.PRODUCT_PHOTO, c1011580cQm, searchAdEventLogger, this.LLILLL, c656780PpU);
        Context context2 = c656780PpU.getContext();
        if (context2 != null) {
            c1066240dqw = new C1066240dqw(context2);
        } else {
            c1066240dqw = null;
        }
        this.LLJI = c1066240dqw;
        this.LLJILJIL = true;
        C1011040cPu c1011040cPu = new C1011040cPu(C1010580cPA.LIZ(c1010580cPA, c656780PpU.LJIIJJI()), EnumC658790Psj.PRODUCT_PHOTO_OLD);
        if (C1009940cO8.LIZLLL(aweme)) {
            int i = C2510609se.LIZ;
            IMeasurementService iMeasurementService = (IMeasurementService) PluggableExtentionKt.pluggableSpi$default(IMeasurementService.class, false, false, false, 14, null);
            if (iMeasurementService != null && (interfaceC1019050ccpLIZJ = iMeasurementService.LIZJ("search")) != null) {
                interfaceC1019050ccpLIZJ.LJIILLIIL();
                ViewGroup itemView2 = this.LLJIJIL;
                itemView2 = itemView2 == null ? c656780PpU.getItemView() : itemView2;
                if (aweme != null) {
                    interfaceC1019050ccpLIZJ.LJ(itemView2, aweme);
                }
            } else {
                interfaceC1019050ccpLIZJ = null;
            }
            this.LLJJ = interfaceC1019050ccpLIZJ instanceof InterfaceC585680My6 ? (InterfaceC585680My6) interfaceC1019050ccpLIZJ : null;
        }
        ((ArrayList) this.LLILZ).add(c1011040cPu);
        this.LLJIJIL = (C1011930cRL) C786410Ut5.Td(C786410Ut5.ne(c656780PpU.getContext()), R.layout.esw, c656780PpU.LJFF(), false).findViewById(R.id.qdq);
    }

    @Override // X.InterfaceC1011690cQx
    public final void LJIIIZ(boolean z) {
        this.LLJILLL = z;
    }

    @Override // X.InterfaceC656660PpI
    public final void Q1(C0Q1G c0q1g) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLiveCardClick clickFrom ");
        sbLIZ.append(c0q1g);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        int i2 = C0Q1M.LIZ[c0q1g.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                SearchAdEventLogger searchAdEventLogger = this.LLJ;
                C1009980cOC.LIZ.getClass();
                searchAdEventLogger.logAd(C1009980cOC.LJJIIJ);
            }
        } else {
            SearchAdEventLogger searchAdEventLogger2 = this.LLJ;
            C1009980cOC.LIZ.getClass();
            searchAdEventLogger2.logAd(C1009980cOC.LJJIII);
        }
        LJJ();
    }
}
