package X;

import Y.AfS185S0100000_16;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService;
import com.bytedance.ies.ugc.aweme.commercialize.search.setting.CommerceSearchAdConfigSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;

/* JADX INFO: renamed from: X.0cPr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011010cPr extends C1010590cPB implements InterfaceC659670Pu9 {
    public final InterfaceC1011000cPq LLJ;
    public final String LLJI;
    public final C1011580cQm LLJIJIL;
    public final SearchAdEventLogger LLJILJIL;
    public final C1011020cPs LLJILJILJ;
    public final C1011090cPz LLJILLL;
    public final C1010680cPK LLJJ;
    public final C1011360cQQ LLJJI;
    public C0PPD LLJJIII;
    public boolean LLJJIJI;
    public C0Q18 LLJJIJIIJIL;
    public InterfaceC1602960roc LLJJIJIL;
    public C0Q1G LLJJJ;
    public final List<C0Q1G> LLJJJIL;
    public final InterfaceC585680My6 LLJJJJ;

    @Override // X.C1010590cPB, X.C1010600cPC
    public final void LJJI() {
    }

    @Override // X.C1010600cPC, X.C0PPF
    public final void bind() {
        Aweme aweme;
        User author;
        String uid;
        User author2;
        String secUid;
        C1007860cKm c1007860cKmLJIILIIL;
        C0PPD c0ppdLIZIZ = null;
        if (((Boolean) C0BIM.LIZ.getValue()).booleanValue()) {
            InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
            C0Q18 c0q18LIZIZ = interfaceC657510PqfLIZLLL != null ? interfaceC657510PqfLIZLLL.LIZIZ(this.LLJ.getAweme(), null, false, false) : null;
            this.LLJJIJIIJIL = c0q18LIZIZ;
            if (c0q18LIZIZ != null) {
                c0q18LIZIZ.onDestroy();
            }
            C0Q18 c0q18 = this.LLJJIJIIJIL;
            if (c0q18 != null) {
                c0q18.Jt2(new C1010460cOy(this.LLJ.getAweme(), this.LLJ.getContext(), new C1009920cO6(this.LLJ.getAweme(), this.LLJILJIL, new AwS630S0100000_16(this, 80)), new C1011250cQF(this.LLILZ, this.LLJIJIL, this.LLJ.getAweme()), this.LLJ.Bb(), null, 32));
            }
            C0Q18 c0q182 = this.LLJJIJIIJIL;
            if (c0q182 != null) {
                c0q182.bind();
            }
        }
        super.bind();
        InterfaceC657510Pqf interfaceC657510Pqf = this.LLILLJJLI;
        if (interfaceC657510Pqf != null && (c1007860cKmLJIILIIL = interfaceC657510Pqf.LJIILIIL()) != null) {
            c0ppdLIZIZ = c1007860cKmLJIILIIL.LIZIZ(this.LLJ.getAweme(), null);
        }
        this.LLJJIII = c0ppdLIZIZ;
        if (C1010120cOQ.LJJIJ(this.LLJ.getAweme())) {
            this.LLJILJIL.withContext(C1010120cOQ.LJIIIIZZ(this.LLJ.getAweme()));
        }
        C1011580cQm c1011580cQm = this.LLJIJIL;
        if (c1011580cQm != null && (aweme = this.LLJ.getAweme()) != null && C1009740cNo.LJII(aweme) && (author = aweme.getAuthor()) != null && (uid = author.getUid()) != null && (author2 = aweme.getAuthor()) != null && (secUid = author2.getSecUid()) != null) {
            ((ISearchAdMainService) ServiceManager.get().getService(ISearchAdMainService.class)).LJIJI(uid, secUid, new AfS185S0100000_16(c1011580cQm, 19), new AfS185S0100000_16(c1011580cQm, 20));
        }
        C1011580cQm c1011580cQm2 = this.LLJIJIL;
        if (c1011580cQm2 != null) {
            c1011580cQm2.LIZLLL(EnumC1011130cQ3.CTA_CLICK, new AwS560S0100000_16(this, 814));
        }
        C1011580cQm c1011580cQm3 = this.LLJIJIL;
        if (c1011580cQm3 != null) {
            c1011580cQm3.LIZLLL(EnumC1011130cQ3.MASK_CTA_CLICK, new AwS560S0100000_16(this, 815));
        }
        C1011580cQm c1011580cQm4 = this.LLJIJIL;
        if (c1011580cQm4 != null) {
            c1011580cQm4.LIZLLL(EnumC1011130cQ3.MASK_SHOW, new AwS560S0100000_16(this, 816));
        }
        C1011580cQm c1011580cQm5 = this.LLJIJIL;
        if (c1011580cQm5 != null) {
            c1011580cQm5.LIZLLL(EnumC1011130cQ3.MASK_HIDE, new AwS560S0100000_16(this, 817));
        }
    }

    @Override // X.C1010600cPC, X.C0PPF
    public final void onDestroy() {
        InterfaceC585680My6 interfaceC585680My6;
        C0Q18 c0q18 = this.LLJJIJIIJIL;
        if (c0q18 != null) {
            c0q18.onDestroy();
        }
        if (!((Boolean) C1EKI.LIZLLL.getValue()).booleanValue() || (interfaceC585680My6 = this.LLJJJJ) == null) {
            return;
        }
        interfaceC585680My6.LJ(null, null);
    }

    @Override // X.C1010600cPC, X.C0PPF
    public final void onViewAttachedToWindow() {
        C0PPD c0ppd = this.LLJJIII;
        if (c0ppd != null) {
            c0ppd.LIZJ();
        }
        super.onViewAttachedToWindow();
        C622570ObP c622570ObPLJIILJJIL = this.LLJ.LJIILJJIL();
        this.LLIZ.LIZJ(this.LLJ.getAweme(), this.LLJ.getEnterFrom(), c622570ObPLJIILJJIL);
        C0Q18 c0q18 = this.LLJJIJIIJIL;
        if (c0q18 != null) {
            c0q18.onViewAttachedToWindow();
        }
        if (c622570ObPLJIILJJIL != null) {
            C625790Ogb.LIZ();
            LJIIIZ(c622570ObPLJIILJJIL.LJIILIIL);
        }
        if (!C1011530cQh.LIZ().enableSearchPreload && !CommerceSearchAdConfigSetting.LIZ().disableFpsMonitorForSearchAd) {
            if (this.LLJJIJIL == null) {
                try {
                    this.LLJJIJIL = C0VWN.LIZ("search_ad_video", false);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            InterfaceC1602960roc interfaceC1602960roc = this.LLJJIJIL;
            if (interfaceC1602960roc != null) {
                interfaceC1602960roc.start();
            }
        }
        if (C293490Bet.LIZIZ) {
            Aweme aweme = this.LLJ.getAweme();
            Context context = this.LLJ.getContext();
            FixedRatioFrameLayout fixedRatioFrameLayoutBb = this.LLJ.Bb();
            if (aweme != null && context != null && fixedRatioFrameLayoutBb != null) {
                InterfaceC585680My6 interfaceC585680My6 = this.LLJJJJ;
                if (interfaceC585680My6 != null) {
                    interfaceC585680My6.LJIIL(context, aweme, C588990N8f.LIZ(c622570ObPLJIILJJIL));
                }
                InterfaceC585680My6 interfaceC585680My62 = this.LLJJJJ;
                if (interfaceC585680My62 != null) {
                    interfaceC585680My62.LIZJ(context, fixedRatioFrameLayoutBb, aweme, C588990N8f.LIZ(c622570ObPLJIILJJIL));
                }
            }
        }
        C0PPD c0ppd2 = this.LLJJIII;
        if (c0ppd2 != null) {
            c0ppd2.LIZLLL();
            c0ppd2.LJ();
        }
    }

    @Override // X.InterfaceC659670Pu9
    public final void qA0() {
        C1011580cQm c1011580cQm = this.LLJIJIL;
        if (c1011580cQm != null) {
            c1011580cQm.LIZIZ(EnumC1011130cQ3.TRACK_PRODUCT_SHOW);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    @Override // X.InterfaceC659670Pu9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.ViewGroup yb() {
        /*
            r4 = this;
            java.util.List<X.0cPM> r0 = r4.LLILLL
            java.util.Iterator r2 = r0.iterator()
        L6:
            boolean r0 = r2.hasNext()
            r3 = 0
            if (r0 == 0) goto L54
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C1011020cPs
            if (r0 == 0) goto L6
        L15:
            X.0cPM r1 = (X.AbstractC1010700cPM) r1
            if (r1 == 0) goto L52
            java.util.List<X.0cPN<android.view.View>> r0 = r1.LLILLL
            if (r0 == 0) goto L52
            java.util.Iterator r2 = r0.iterator()
        L21:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C1010970cPn
            if (r0 == 0) goto L21
        L2f:
            X.0cPN r1 = (X.AbstractC1010710cPN) r1
            if (r1 == 0) goto L52
            android.view.View r1 = r1.LIZIZ()
        L37:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L3e
            r3 = r1
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L3e:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getProductAnchor view = "
            r1.append(r0)
            r1.append(r3)
            X.C2188811AlT.LIZIZ(r1)
            int r0 = X.C2510609se.LIZ
            return r3
        L50:
            r1 = r3
            goto L2f
        L52:
            r1 = r3
            goto L37
        L54:
            r1 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1011010cPr.yb():android.view.ViewGroup");
    }

    @Override // X.C1010590cPB, X.C1010600cPC, X.InterfaceC1002830cCf
    public final void LJIJI() {
        AwemeRawAd awemeRawAd;
        String strLJFF;
        super.LJIJI();
        Aweme aweme = this.LLJ.getAweme();
        boolean z = false;
        if (aweme != null && C1010120cOQ.LJJIJL(aweme) && C1010120cOQ.LJIJ(aweme) && (strLJFF = C1010120cOQ.LJFF(aweme)) != null && strLJFF.length() != 0) {
            C1004580cFU c1004580cFU = this.LLILZ;
            c1004580cFU.LJIIIZ = strLJFF;
            c1004580cFU.LJIIJ = true;
            FixedRatioFrameLayout fixedRatioFrameLayoutBb = this.LLJ.Bb();
            if (fixedRatioFrameLayoutBb != null) {
                this.LLILZ.LJIIJJI = BtmSDK.INSTANCE.createJumpSourceBtmToken("c55236.d0", PageFinder.via((View) fixedRatioFrameLayoutBb), null);
            }
        }
        C0Q1G c0q1g = this.LLJJJ;
        switch (c0q1g == null ? -1 : C0Q1H.LIZ[c0q1g.ordinal()]) {
            case 1:
                LJIJJ(54);
                break;
            case 2:
                LJIJJ(53);
                break;
            case 3:
                LJIJJ(55);
                break;
            case 4:
                LJIJJ(57);
                break;
            case 5:
                LJIJJ(56);
                break;
            case 6:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                Aweme aweme2 = this.LLJ.getAweme();
                boolean z2 = (aweme2 == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null || !C1017180cZo.LJJII(awemeRawAd)) ? false : true;
                if (aweme != null && C1010120cOQ.LJJIJL(aweme) && C1010120cOQ.LJIJ(aweme)) {
                    z = true;
                }
                Aweme aweme3 = this.LLJ.getAweme();
                LJIJJ((z2 || z || C1010120cOQ.LIZIZ(80, aweme3 != null ? aweme3.getAwemeRawAd() : null)) ? 80 : null);
                break;
            default:
                LJIJJ(null);
                break;
        }
        this.LLJJI.LIZ();
        C0Q1G c0q1g2 = this.LLJJJ;
        if (c0q1g2 != null) {
            c0q1g2.name();
        }
        InterfaceC1010450cOx interfaceC1010450cOx = this.LLILZLL;
        if (interfaceC1010450cOx != null) {
            interfaceC1010450cOx.s2();
        }
        int i = C2510609se.LIZ;
        this.LLJJJ = null;
    }

    @Override // X.C1010600cPC, X.C0PPF
    public final void onViewDetachedFromWindow() {
        InterfaceC585680My6 interfaceC585680My6;
        super.onViewDetachedFromWindow();
        C0Q18 c0q18 = this.LLJJIJIIJIL;
        if (c0q18 != null) {
            c0q18.onViewDetachedFromWindow();
        }
        InterfaceC1602960roc interfaceC1602960roc = this.LLJJIJIL;
        if (interfaceC1602960roc != null) {
            interfaceC1602960roc.stop();
        }
        C1011580cQm c1011580cQm = this.LLJIJIL;
        if (c1011580cQm != null) {
            c1011580cQm.LIZ(C1011570cQl.LIZ((C1011570cQl) c1011580cQm.LIZLLL.getValue(), false, 0, 1, 75));
        }
        C622570ObP c622570ObPLJIILJJIL = this.LLJ.LJIILJJIL();
        if (c622570ObPLJIILJJIL != null) {
            C1011700cQy.LIZ(this, c622570ObPLJIILJJIL);
        }
        if (C293490Bet.LIZIZ) {
            Aweme aweme = this.LLJ.getAweme();
            Context context = this.LLJ.getContext();
            FixedRatioFrameLayout fixedRatioFrameLayoutBb = this.LLJ.Bb();
            if (aweme == null || context == null || fixedRatioFrameLayoutBb == null || (interfaceC585680My6 = this.LLJJJJ) == null) {
                return;
            }
            interfaceC585680My6.LIZIZ(context, aweme);
        }
    }

    @Override // X.InterfaceC1011690cQx
    public final boolean LJIJJLI() {
        return this.LLJJIJI;
    }

    @Override // X.C1010590cPB, X.C1010600cPC
    public final /* bridge */ /* synthetic */ InterfaceC1010250cOd LJJ() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC1010250cOd Mh() {
        return this.LLJ;
    }

    @Override // X.C1010600cPC, X.InterfaceC660150Puv
    public final InterfaceC1011430cQX vQ0() {
        return this.LLJIJIL;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [X.0cPK] */
    public C1011010cPr(C659420Ptk c659420Ptk) {
        C19EG c19egLIZIZ;
        C1011580cQm c1011580cQm;
        AwemeRawAd awemeRawAdLJIIIIZZ;
        InterfaceC1019050ccp interfaceC1019050ccpLIZJ;
        super(c659420Ptk);
        this.LLJ = c659420Ptk;
        this.LLJI = " SearchAdNormalVideoModule";
        EnumC658110Prd enumC658110Prd = EnumC658110Prd.NORMAL_VIDEO_AD;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        SearchVideoHolder searchVideoHolder = c659420Ptk.LIZIZ;
        FixedRatioFrameLayout fixedRatioFrameLayout = searchVideoHolder.LLJJL;
        Context context = searchVideoHolder.LLIZ;
        if (context != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(fixedRatioFrameLayout, c19egLIZIZ);
        if (lifecycleOwnerLJIJI != null) {
            c1011580cQm = new C1011580cQm(lifecycleOwnerLJIJI);
        } else {
            c1011580cQm = null;
        }
        this.LLJIJIL = c1011580cQm;
        Object[] objArr = new Object[2];
        Aweme aweme = c659420Ptk.LIZ;
        objArr[0] = aweme;
        if (aweme != null) {
            awemeRawAdLJIIIIZZ = C1010120cOQ.LJIIIIZZ(aweme);
        } else {
            awemeRawAdLJIIIIZZ = null;
        }
        objArr[1] = awemeRawAdLJIIIIZZ;
        SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger(objArr);
        this.LLJILJIL = searchAdEventLogger;
        C1010580cPA c1010580cPA = new C1010580cPA(c659420Ptk.LIZIZ.LLJJL, null, enumC658110Prd, c1011580cQm, searchAdEventLogger, this.LLILZ, c659420Ptk);
        this.LLJILJILJ = new C1011020cPs(C1010580cPA.LIZ(c1010580cPA, c659420Ptk.LIZIZ.LLJZIJLIL));
        this.LLJILLL = new C1011090cPz(C1010580cPA.LIZ(c1010580cPA, c659420Ptk.LIZIZ.LLJZ));
        final C1010580cPA c1010580cPALIZ = C1010580cPA.LIZ(c1010580cPA, c659420Ptk.LIZIZ.LLL);
        this.LLJJ = new AbstractC1010700cPM(c1010580cPALIZ) { // from class: X.0cPK
            public final ViewGroup LLILZIL;

            @Override // X.AbstractC1010700cPM
            public final void LIZIZ() {
            }

            @Override // X.AbstractC1010700cPM
            public final void LIZJ() {
                ViewGroup viewGroup = this.LLILZIL;
                if (viewGroup != null) {
                    C1009940cO8.LJI(viewGroup);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(" param.slotView = ");
                    sbLIZ.append(this.LL.LIZIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2510609se.LIZ;
                }
            }

            @Override // X.AbstractC1010700cPM, X.C0PPF
            public final void bind() {
                C0Q18 c0q18LIZIZ;
                super.bind();
                InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
                if (interfaceC657510PqfLIZLLL == null || (c0q18LIZIZ = interfaceC657510PqfLIZLLL.LIZIZ(this.LLILLJJLI, null, false, true)) == null) {
                    return;
                }
                c0q18LIZIZ.Xq2(EnumC656000PoE.SEARCH_AD_NORMAL_VIDEO_DESC.getValue(), this.LL.LIZIZ);
            }

            {
                super(c1010580cPALIZ);
                this.LLILZIL = c1010580cPALIZ.LIZIZ;
            }
        };
        this.LLJJI = new C1011360cQQ(searchAdEventLogger);
        this.LLJJJIL = C1697810uHb.LJIIJJI(C0Q1G.BOTTOM_CTA, C0Q1G.MASK_CTA, C0Q1G.TRANSFORM_SOURCE, C0Q1G.TRANSFORM_LIKE, C0Q1G.TRANSFORM_DESC, C0Q1G.PRODUCT_ANCHOR);
        if (C293490Bet.LIZIZ) {
            IMeasurementService iMeasurementService = (IMeasurementService) PluggableExtentionKt.pluggableSpi$default(IMeasurementService.class, false, false, false, 14, null);
            if (iMeasurementService != null && (interfaceC1019050ccpLIZJ = iMeasurementService.LIZJ("search")) != null) {
                interfaceC1019050ccpLIZJ.LJIIIIZZ();
                interfaceC1019050ccpLIZJ.LIZLLL();
                interfaceC1019050ccpLIZJ.LJI(AFwS300S0000000_16.get$arr$(74));
                interfaceC1019050ccpLIZJ.setTracker(AFwS204S0000000_16.get$arr$(450));
                Aweme aweme2 = c659420Ptk.LIZ;
                FixedRatioFrameLayout fixedRatioFrameLayout2 = c659420Ptk.LIZIZ.LLJJL;
                if (aweme2 != null && fixedRatioFrameLayout2 != null) {
                    interfaceC1019050ccpLIZJ.LJ(fixedRatioFrameLayout2, aweme2);
                }
            } else {
                interfaceC1019050ccpLIZJ = null;
            }
            this.LLJJJJ = interfaceC1019050ccpLIZJ instanceof InterfaceC585680My6 ? (InterfaceC585680My6) interfaceC1019050ccpLIZJ : null;
        }
    }

    @Override // X.C1010590cPB, X.C1010600cPC, X.InterfaceC1002830cCf
    public final void LJFF(String str) {
        InterfaceC585680My6 interfaceC585680My6;
        super.LJFF(str);
        this.LLJJI.LIZIZ();
        C0Q18 c0q18 = this.LLJJIJIIJIL;
        if (c0q18 != null) {
            c0q18.LJFF(str);
        }
        if (C293490Bet.LIZIZ) {
            Aweme aweme = this.LLJ.getAweme();
            Context context = this.LLJ.getContext();
            FixedRatioFrameLayout fixedRatioFrameLayoutBb = this.LLJ.Bb();
            if (aweme != null && context != null && fixedRatioFrameLayoutBb != null && (interfaceC585680My6 = this.LLJJJJ) != null) {
                interfaceC585680My6.LJIJI(context, aweme, fixedRatioFrameLayoutBb, true, new AwS560S0100000_16(this, 818), new AwS560S0100000_16(this, 819));
            }
        }
    }

    @Override // X.InterfaceC1011690cQx
    public final void LJIIIZ(boolean z) {
        this.LLJJIJI = z;
    }

    @Override // X.C1010600cPC
    public final void LJJII(List<AbstractC1010700cPM> list) {
        ViewGroup viewGroupFb;
        super.LJJII(list);
        if (!C1010120cOQ.LJJIJ(this.LLJ.getAweme())) {
            ArrayList arrayList = (ArrayList) list;
            arrayList.add(this.LLJILJILJ);
            arrayList.add(this.LLJILLL);
            if (C1010120cOQ.LIZ(this.LLJ.getAweme(), EnumC656000PoE.SEARCH_AD_NORMAL_VIDEO_DESC.getValue())) {
                arrayList.add(this.LLJJ);
                View viewGb = this.LLJ.Gb();
                if (viewGb != null) {
                    C786410Ut5.LJLLLLLL(8, viewGb);
                    return;
                }
                return;
            }
            View viewGb2 = this.LLJ.Gb();
            if (viewGb2 == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, viewGb2);
            return;
        }
        if (((Boolean) C07AB.LIZ.getValue()).booleanValue() && (viewGroupFb = this.LLJ.Fb()) != null) {
            C1009940cO8.LIZ(viewGroupFb);
        }
        ViewGroup viewGroupFb2 = this.LLJ.Fb();
        if (viewGroupFb2 != null) {
            C786410Ut5.LJLZ(8, viewGroupFb2);
        }
        ViewGroup viewGroupHb = this.LLJ.Hb();
        if (viewGroupHb == null) {
            return;
        }
        C786410Ut5.LJLZ(8, viewGroupHb);
    }

    @Override // X.C1010600cPC, X.InterfaceC658610PsR
    public final void Ms(InterfaceC1010450cOx interfaceC1010450cOx) {
        super.Ms(interfaceC1010450cOx);
        this.LLJILJIL.withContext(interfaceC1010450cOx);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011b  */
    @Override // X.InterfaceC659670Pu9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1011010cPr.onClick(java.lang.String):void");
    }
}
