package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS31S0000100_16;
import kotlin.jvm.internal.AwS50S0100100_16;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.AwS9S0101100_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cQ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011150cQ5 extends C1011080cPy implements InterfaceC656730PpP {
    public final InterfaceC1011400cQU LLILZLL;
    public final Aweme LLIZ;
    public final C1011580cQm LLIZLLLIL;
    public final C1011230cQD LLJ;
    public final SearchAdEventLogger LLJI;
    public final C1066240dqw LLJIJIL;
    public final C1011930cRL LLJILJIL;
    public long LLJILJILJ;
    public boolean LLJILLL;
    public final C1484050oip LLJJ;
    public final C1011360cQQ LLJJI;
    public C0Q18 LLJJIII;
    public boolean LLJJIJI;
    public long LLJJIJIIJIL;
    public Long LLJJIJIL;
    public boolean LLJJJ;
    public List<Long> LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final InterfaceC585680My6 LLJJJJLIIL;

    @Override // X.InterfaceC656670PpJ
    public final void J0() {
        C1007860cKm c1007860cKmLJIILIIL;
        if (this.LLJILLL) {
            C1011580cQm c1011580cQm = this.LLIZLLLIL;
            if (c1011580cQm != null) {
                c1011580cQm.LIZIZ(EnumC1011130cQ3.PHOTO_CARD_START_PLAY);
            }
            this.LLJJ.LIZJ(this.LLIZ);
            this.LLJILLL = false;
            Aweme aweme = this.LLIZ;
            if (C1010120cOQ.LJJIIZI(aweme != null ? aweme.getAwemeRawAd() : null)) {
                SearchAdEventLogger searchAdEventLogger = this.LLJI;
                C1009980cOC.LIZ.getClass();
                searchAdEventLogger.logAd((InterfaceC1023400cjq) C1009980cOC.LJJLIIIJILLIZJL.getValue());
            }
        } else {
            C1484050oip c1484050oip = this.LLJJ;
            c1484050oip.getClass();
            int i = C2510609se.LIZ;
            c1484050oip.LIZ().resume();
        }
        int i2 = C2510609se.LIZ;
        InterfaceC657510Pqf interfaceC657510Pqf = this.LLILZIL;
        if (interfaceC657510Pqf != null && (c1007860cKmLJIILIIL = interfaceC657510Pqf.LJIILIIL()) != null && c1007860cKmLJIILIIL.LIZLLL) {
            this.LLJJI.LIZIZ();
            C1011930cRL c1011930cRL = this.LLJILJIL;
            if (c1011930cRL != null) {
                c1011930cRL.LLFFF(this.LLILZIL.LJIILIIL().LJ, false);
            }
            this.LLILZIL.LJIILIIL().LIZLLL = false;
        }
        C1011930cRL c1011930cRL2 = this.LLJILJIL;
        if (c1011930cRL2 != null) {
            c1011930cRL2.LJJJIL();
        }
        C1011580cQm c1011580cQm2 = this.LLIZLLLIL;
        if (c1011580cQm2 != null) {
            c1011580cQm2.LIZIZ(EnumC1011130cQ3.PHOTO_CARD_REQUEST_TO_PLAY);
        }
        this.LLJJ.LIZIZ(this.LLILZLL.isMute());
    }

    public final void LJJ() {
        if (((Boolean) C0BIM.LIZ.getValue()).booleanValue()) {
            InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
            C0Q18 c0q18LIZIZ = interfaceC657510PqfLIZLLL != null ? interfaceC657510PqfLIZLLL.LIZIZ(this.LLILZLL.getAweme(), null, false, false) : null;
            this.LLJJIII = c0q18LIZIZ;
            if (c0q18LIZIZ != null) {
                Aweme aweme = this.LLILZLL.getAweme();
                Context context = this.LLILZLL.getContext();
                ViewGroup itemView = this.LLILZLL.getItemView();
                c0q18LIZIZ.Jt2(new C1010460cOy(aweme, context, new C1009920cO6(this.LLILZLL.getAweme(), this.LLJI, new AwS630S0100000_16(this, 4)), new C1011250cQF(this.LLILLL, this.LLIZLLLIL, this.LLILZLL.getAweme()), itemView, null, 32));
            }
            C0Q18 c0q18 = this.LLJJIII;
            if (c0q18 != null) {
                c0q18.bind();
            }
        }
    }

    public final boolean LJJI() {
        Aweme aweme = this.LLILZLL.getAweme();
        return (!C1010120cOQ.LJJJI(aweme != null ? aweme.getAwemeRawAd() : null) || C0Q1P.LIZIZ(this.LLILZLL.getSubType()) || C0Q1P.LIZJ(this.LLILZLL.getSubType())) ? false : true;
    }

    public final void LJJIFFI() {
        this.LLILZLL.LJIIL().invoke();
        this.LLJJI.LIZ();
    }

    public final C1009960cOA LJJII() {
        return (C1009960cOA) this.LLJJJJ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ() {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1011150cQ5.LJJIIJ():void");
    }

    public final void LJJIIZ() {
        if ((C0Q1P.LIZIZ(this.LLILZLL.getSubType()) || C0Q1P.LIZJ(this.LLILZLL.getSubType())) && this.LLJJIJI) {
            onViewDetachedFromWindow();
        }
    }

    @Override // X.InterfaceC656670PpJ
    public final void LLZZZZ() {
        int i = C2510609se.LIZ;
        C1011930cRL c1011930cRL = this.LLJILJIL;
        if (c1011930cRL != null) {
            c1011930cRL.LJJJJ();
        }
        C1011580cQm c1011580cQm = this.LLIZLLLIL;
        if (c1011580cQm != null) {
            c1011580cQm.LIZIZ(EnumC1011130cQ3.PHOTO_CARD_REQUEST_TO_PAUSE);
        }
        C1484050oip c1484050oip = this.LLJJ;
        c1484050oip.getClass();
        c1484050oip.LIZ().pause();
    }

    @Override // X.C0PPF
    public final void onDestroy() {
        C0Q18 c0q18 = this.LLJJIII;
        if (c0q18 != null) {
            c0q18.onDestroy();
        }
        C1009960cOA c1009960cOALJJII = LJJII();
        if (c1009960cOALJJII != null) {
            c1009960cOALJJII.LJ = null;
        }
        LJJIIZ();
        InterfaceC585680My6 interfaceC585680My6 = this.LLJJJJLIIL;
        if (interfaceC585680My6 != null) {
            interfaceC585680My6.LJ(null, null);
        }
        this.LLJJIJI = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0190  */
    @Override // X.C1011080cPy, X.C0PPF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewAttachedToWindow() {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1011150cQ5.onViewAttachedToWindow():void");
    }

    @Override // X.C1011080cPy, X.C0PPF
    public final void onViewDetachedFromWindow() {
        InterfaceC585680My6 interfaceC585680My6;
        if ((C0Q1P.LIZIZ(this.LLILZLL.getSubType()) || C0Q1P.LIZJ(this.LLILZLL.getSubType())) && !this.LLJJIJI) {
            return;
        }
        super.onViewDetachedFromWindow();
        this.LLJILLL = true;
        int i = C0Q1I.LIZIZ[this.LLILZLL.getSubType().ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            SearchAdEventLogger searchAdEventLogger = this.LLJI;
            C1009980cOC.LIZ.getClass();
            searchAdEventLogger.logAd(C1009980cOC.LJJIJIIJIL, new AwS595S0100000_16(this, 48));
            C1011930cRL c1011930cRL = this.LLJILJIL;
            Long lValueOf = c1011930cRL != null ? Long.valueOf(c1011930cRL.getCurrentPlayTime()) : null;
            if (this.LLILLL.LJI > 0) {
                Long lValueOf2 = lValueOf != null ? Long.valueOf(lValueOf.longValue() + this.LLILLL.LJI) : null;
                this.LLILLL.LJI = 0L;
                lValueOf = lValueOf2;
            }
            if (C256470A3h.LIZIZ) {
                if (C256550A3p.LIZIZ) {
                    lValueOf = Long.valueOf(System.currentTimeMillis() - this.LLJILJILJ);
                }
                this.LLJI.logAd(C1009980cOC.LJJIJIL, new AwS595S0100000_16(lValueOf, 49));
            }
        }
        C1484050oip c1484050oip = this.LLJJ;
        c1484050oip.getClass();
        int i2 = C2510609se.LIZ;
        c1484050oip.LIZ().release();
        C1011930cRL c1011930cRL2 = this.LLJILJIL;
        if (c1011930cRL2 != null) {
            c1011930cRL2.LJJJJ();
        }
        C1011930cRL c1011930cRL3 = this.LLJILJIL;
        if (c1011930cRL3 != null) {
            c1011930cRL3.LLFFF(0, false);
        }
        C1011230cQD c1011230cQD = this.LLJ;
        c1011230cQD.LIZ.clear();
        c1011230cQD.LIZIZ = 0;
        c1011230cQD.LIZJ = 0;
        C622570ObP c622570ObPLJIILJJIL = this.LLILZLL.LJIILJJIL();
        if (c622570ObPLJIILJJIL != null) {
            C1011700cQy.LIZ(this, c622570ObPLJIILJJIL);
        }
        C0Q18 c0q18 = this.LLJJIII;
        if (c0q18 != null) {
            c0q18.onViewDetachedFromWindow();
        }
        if (C1009940cO8.LIZLLL(this.LLIZ)) {
            Aweme aweme = this.LLILZLL.getAweme();
            Context context = this.LLILZLL.getContext();
            ViewGroup itemView = this.LLILZLL.getItemView();
            if (aweme != null && context != null && itemView != null && (interfaceC585680My6 = this.LLJJJJLIIL) != null) {
                interfaceC585680My6.LIZIZ(context, aweme);
            }
        }
        C1011930cRL c1011930cRL4 = this.LLJILJIL;
        if (c1011930cRL4 != null) {
            c1011930cRL4.LLLZL = 0L;
            c1011930cRL4.LLLZLL = 0L;
            c1011930cRL4.LLLZLZ = false;
        }
        this.LLJJIJI = false;
    }

    public final boolean LJJIIJZLJL() {
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        C1009960cOA c1009960cOALJJII;
        AwemeRawAd awemeRawAd2;
        AwemeSearchAdModel searchAdInfo2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[shouldOpenCarouselAdsDetail] hasPassedPlayTimeThreshold = ");
        C1009960cOA c1009960cOALJJII2 = LJJII();
        sbLIZ.append(c1009960cOALJJII2 != null ? c1009960cOALJJII2.LJ : null);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        Aweme aweme = this.LLIZ;
        if ((aweme != null && C1010120cOQ.LJJIFFI(aweme) && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && (searchAdInfo2 = awemeRawAd2.getSearchAdInfo()) != null && searchAdInfo2.shouldOpenCarouselAdDetail) || LJJI()) {
            return true;
        }
        Aweme aweme2 = this.LLIZ;
        return (aweme2 == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null || (searchAdInfo = awemeRawAd.getSearchAdInfo()) == null || searchAdInfo.openLpPlaytimeThreshold <= 0 || (c1009960cOALJJII = LJJII()) == null || !Intrinsics.LJFF(c1009960cOALJJII.LJ, Boolean.FALSE)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x014d  */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.0cOe] */
    @Override // X.C1011080cPy, X.C0PPF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bind() {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1011150cQ5.bind():void");
    }

    @Override // X.C1011080cPy, X.C0PPF
    public final void unBind() {
        super.unBind();
        C0Q18 c0q18 = this.LLJJIII;
        if (c0q18 != null) {
            c0q18.onDestroy();
        }
    }

    @Override // X.InterfaceC1011690cQx
    public final boolean LJIJJLI() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC1010250cOd Mh() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC656660PpI
    public final C1011930cRL Mm0() {
        return this.LLJILJIL;
    }

    @Override // X.C1011080cPy, X.InterfaceC660150Puv
    public final InterfaceC1011430cQX vQ0() {
        return this.LLIZLLLIL;
    }

    public C1011150cQ5(InterfaceC1011400cQU interfaceC1011400cQU) {
        C19EG c19egLIZIZ;
        C1011580cQm c1011580cQm;
        C1066240dqw c1066240dqw;
        InterfaceC1019050ccp interfaceC1019050ccpLIZJ;
        super(interfaceC1011400cQU);
        this.LLILZLL = interfaceC1011400cQU;
        Aweme aweme = interfaceC1011400cQU.getAweme();
        this.LLIZ = aweme;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        ViewGroup itemView = interfaceC1011400cQU.getItemView();
        Context context = interfaceC1011400cQU.getContext();
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
        C1011230cQD c1011230cQD = new C1011230cQD();
        this.LLJ = c1011230cQD;
        SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger(aweme, c1011230cQD);
        this.LLJI = searchAdEventLogger;
        C1010580cPA c1010580cPA = new C1010580cPA(interfaceC1011400cQU.getItemView(), null, EnumC658110Prd.CAROUSEL_ADS, c1011580cQm, searchAdEventLogger, this.LLILLL, interfaceC1011400cQU);
        Context context2 = interfaceC1011400cQU.getContext();
        if (context2 != null) {
            c1066240dqw = new C1066240dqw(context2);
        } else {
            c1066240dqw = null;
        }
        this.LLJIJIL = c1066240dqw;
        this.LLJILLL = true;
        this.LLJJ = new C1484050oip();
        this.LLJJI = new C1011360cQQ(searchAdEventLogger);
        this.LLJJIJIIJIL = 1700L;
        C1011040cPu c1011040cPu = new C1011040cPu(C1010580cPA.LIZ(c1010580cPA, interfaceC1011400cQU.LJIIJJI()), interfaceC1011400cQU.getSubType());
        this.LLJJJJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 17));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 14));
        if (C1009940cO8.LIZLLL(aweme)) {
            int i = C2510609se.LIZ;
            IMeasurementService iMeasurementService = (IMeasurementService) PluggableExtentionKt.pluggableSpi$default(IMeasurementService.class, false, false, false, 14, null);
            if (iMeasurementService != null && (interfaceC1019050ccpLIZJ = iMeasurementService.LIZJ("search")) != null) {
                interfaceC1019050ccpLIZJ.LJIILLIIL();
                ViewGroup itemView2 = this.LLJILJIL;
                itemView2 = itemView2 == null ? interfaceC1011400cQU.getItemView() : itemView2;
                if (aweme != null) {
                    interfaceC1019050ccpLIZJ.LJ(itemView2, aweme);
                }
            } else {
                interfaceC1019050ccpLIZJ = null;
            }
            this.LLJJJJLIIL = interfaceC1019050ccpLIZJ instanceof InterfaceC585680My6 ? (InterfaceC585680My6) interfaceC1019050ccpLIZJ : null;
        }
        ((ArrayList) this.LLILZ).add(c1011040cPu);
        this.LLJILJIL = (C1011930cRL) C786410Ut5.Td(C786410Ut5.ne(interfaceC1011400cQU.getContext()), R.layout.esw, interfaceC1011400cQU.LJFF(), false).findViewById(R.id.qdq);
    }

    @Override // X.InterfaceC1011690cQx
    public final void LJIIIZ(boolean z) {
        this.LLJJJ = z;
    }

    @Override // X.InterfaceC656730PpP
    public final void LJIILJJIL(boolean z) {
        this.LLJJ.LIZIZ(z);
    }

    public final String LJJIII(int i) {
        List<Long> list;
        Long l;
        List<Long> list2 = this.LLJJJIL;
        if ((list2 == null || (l = (Long) C13LP.LJJJLZIJ(i, list2)) == null) && ((list = this.LLJJJIL) == null || (l = (Long) C13LP.LJJJLL(list)) == null)) {
            return null;
        }
        return l.toString();
    }

    @Override // X.InterfaceC656660PpI
    public final void Q1(C0Q1G c0q1g) {
        long currentPlayTime;
        long j;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        AwemeRawAd awemeRawAd2;
        AwemeSearchAdModel searchAdInfo2;
        C1007860cKm c1007860cKmLJIILIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLiveCardClick clickFrom ");
        sbLIZ.append(c0q1g);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        InterfaceC657510Pqf interfaceC657510Pqf = this.LLILZIL;
        if (interfaceC657510Pqf != null && (c1007860cKmLJIILIIL = interfaceC657510Pqf.LJIILIIL()) != null) {
            c1007860cKmLJIILIIL.LIZJ = EnumC710310Rtd.CLICK;
            c1007860cKmLJIILIIL.LJ = this.LLJ.LIZJ;
        }
        C1011930cRL c1011930cRL = this.LLJILJIL;
        if (c1011930cRL != null) {
            currentPlayTime = c1011930cRL.getCurrentPlayTime();
        } else {
            currentPlayTime = -1;
        }
        int i2 = this.LLJ.LIZJ;
        this.LLILLL.LJFF = currentPlayTime;
        Aweme aweme2 = this.LLIZ;
        long currentPlayTime2 = 0;
        if (aweme2 != null && (awemeRawAd2 = aweme2.getAwemeRawAd()) != null && (searchAdInfo2 = awemeRawAd2.getSearchAdInfo()) != null) {
            j = searchAdInfo2.openLpPlaytimeThreshold;
        } else {
            j = 0;
        }
        if (j > 0) {
            C1009960cOA c1009960cOALJJII = LJJII();
            Boolean bool = null;
            if ((c1009960cOALJJII == null || c1009960cOALJJII.LJ == null) && (aweme = this.LLIZ) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null) {
                long j2 = searchAdInfo.openLpPlaytimeThreshold;
                if (j2 > 0) {
                    if (C256460A3g.LIZIZ) {
                        currentPlayTime2 = System.currentTimeMillis() - this.LLJILJILJ;
                    } else {
                        C1011930cRL c1011930cRL2 = this.LLJILJIL;
                        if (c1011930cRL2 != null) {
                            currentPlayTime2 = c1011930cRL2.getCurrentPlayTime();
                        }
                    }
                    if (currentPlayTime2 >= j2) {
                        C1009960cOA c1009960cOALJJII2 = LJJII();
                        if (c1009960cOALJJII2 != null) {
                            c1009960cOALJJII2.LJ = Boolean.TRUE;
                        }
                    } else {
                        C1009960cOA c1009960cOALJJII3 = LJJII();
                        if (c1009960cOALJJII3 != null) {
                            c1009960cOALJJII3.LJ = Boolean.FALSE;
                        }
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[checkPlayTimeThresholdOnce],currentPlayTime = ");
                    sbLIZ2.append(currentPlayTime2);
                    sbLIZ2.append(", playTimeThreshold = ");
                    sbLIZ2.append(j2);
                    sbLIZ2.append(", hasPassedPlayTimeThreshold = ");
                    C1009960cOA c1009960cOALJJII4 = LJJII();
                    if (c1009960cOALJJII4 != null) {
                        bool = c1009960cOALJJII4.LJ;
                    }
                    sbLIZ2.append(bool);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
        }
        int i3 = C0Q1I.LIZ[c0q1g.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        if (LJJIIJZLJL()) {
                            LJJIFFI();
                            return;
                        } else {
                            LJJIIJ();
                            return;
                        }
                    }
                    return;
                }
                if (LJJIIJZLJL()) {
                    LJJIFFI();
                    this.LLILLJJLI = 53;
                    C0DHT.LIZ = 53;
                    Aweme aweme3 = this.LLIZ;
                    if (aweme3 != null && !C1010120cOQ.LJIJJLI(aweme3)) {
                        SearchAdEventLogger searchAdEventLogger = this.LLJI;
                        C1009980cOC.LIZ.getClass();
                        searchAdEventLogger.logAd(C1009980cOC.LJJIZ, new AwS31S0000100_16(currentPlayTime, 0));
                    }
                } else {
                    LJJIIJ();
                }
                SearchAdEventLogger searchAdEventLogger2 = this.LLJI;
                C1009980cOC.LIZ.getClass();
                searchAdEventLogger2.logAd(C1009980cOC.LJJIL, new AwS9S0101100_16(currentPlayTime, this, i2, 0));
                return;
            }
            if (LJJIIJZLJL()) {
                LJJIFFI();
                if (LJJI()) {
                    this.LLILLJJLI = 80;
                    C0DHT.LIZ = 80;
                    this.LLILLL.LJII = new AwS50S0100100_16(this, currentPlayTime, 1);
                    return;
                }
                Aweme aweme4 = this.LLIZ;
                if (aweme4 != null && C1010120cOQ.LJIJJLI(aweme4)) {
                    SearchAdEventLogger searchAdEventLogger3 = this.LLJI;
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger3.logAd(C1009980cOC.LJJJ, new AwS9S0101100_16(currentPlayTime, this, i2, 2));
                    return;
                } else {
                    SearchAdEventLogger searchAdEventLogger4 = this.LLJI;
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger4.logAd(C1009980cOC.LJJJI, new AwS31S0000100_16(currentPlayTime, 3));
                    return;
                }
            }
            LJJIIJ();
            SearchAdEventLogger searchAdEventLogger5 = this.LLJI;
            C1009980cOC.LIZ.getClass();
            searchAdEventLogger5.logAd(C1009980cOC.LJJJ, new AwS31S0000100_16(currentPlayTime, 4));
            return;
        }
        if (LJJIIJZLJL()) {
            LJJIFFI();
            if (LJJI()) {
                this.LLILLJJLI = 80;
                C0DHT.LIZ = 80;
                this.LLILLL.LJII = new AwS50S0100100_16(this, currentPlayTime, 0);
                return;
            }
            Aweme aweme5 = this.LLIZ;
            if (aweme5 != null && C1010120cOQ.LJIJJLI(aweme5)) {
                SearchAdEventLogger searchAdEventLogger6 = this.LLJI;
                C1009980cOC.LIZ.getClass();
                searchAdEventLogger6.logAd(C1009980cOC.LJJIII, new AwS9S0101100_16(currentPlayTime, this, i2, 1));
                return;
            } else {
                SearchAdEventLogger searchAdEventLogger7 = this.LLJI;
                C1009980cOC.LIZ.getClass();
                searchAdEventLogger7.logAd(C1009980cOC.LJJIJLIJ, new AwS31S0000100_16(currentPlayTime, 1));
                return;
            }
        }
        LJJIIJ();
        SearchAdEventLogger searchAdEventLogger8 = this.LLJI;
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger8.logAd(C1009980cOC.LJJIJL, new AwS31S0000100_16(currentPlayTime, 2));
    }
}
