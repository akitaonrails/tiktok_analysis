package X;

import Y.AAListenerS36S0100100_32;
import Y.ARunnableS49S0110000_31;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionText;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.SurpriseSetData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.oec_msg.CarouselCfg;
import webcast.data.oec_msg.ScrollElement;

/* JADX INFO: renamed from: X.186h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C212301186h extends AbstractC212300186g {
    public final C197039127h LLJJIII;
    public final TuxTextView LLJJIJI;
    public final FrameLayout LLJJIJIIJIL;
    public final FrameLayout LLJJIJIL;
    public final ConstraintLayout LLJJJ;
    public final FrameLayout LLJJJIL;
    public final TuxTextView LLJJJJ;
    public final AnonymousClass1879 LLJJJJJIL;
    public final FrameLayout LLJJJJLIIL;
    public final ConstraintLayout LLJJL;
    public final TuxTextView LLJJLIIIJLLLLLLLZ;
    public final TuxTextView LLJL;
    public final SmartImageView LLJLIL;
    public final SmartImageView LLJLILLLLZIIL;
    public Function2<? super Long, ? super Boolean, Unit> LLJLL;
    public AnonymousClass1875 LLJLLIL;
    public final C01GW LLJLLL;
    public AnonymousClass1873 LLJZ;
    public AnonymousClass1871 LLJZIJLIL;
    public C212170181g LLL;
    public final int LLLF;

    public int T0() {
        return R.layout.bxp;
    }

    @Override // X.AbstractC212300186g
    public C197039127h getCustomButton() {
        return null;
    }

    private final String getUserId() {
        return (String) this.LLJLLL.getValue();
    }

    @Override // X.AbstractC212300186g
    public final void C0() {
        C197039127h c197039127h = this.LLJJIII;
        if (c197039127h != null) {
            C12ES.LJIILL(0, c197039127h);
        }
        C19MB c19mb = new C19MB();
        c19mb.LJII(this.LLJJJ);
        c19mb.LJIIIIZZ(R.id.gn7, 7, R.id.gkl, 6);
        c19mb.LIZIZ(this.LLJJJ);
        TuxTextView tuxTextView = this.LLJJIJI;
        if (tuxTextView != null) {
            C0H1U.LIZIZ(tuxTextView);
        }
    }

    @Override // X.AbstractC212300186g
    public final void L0() {
        C12ES.LJIILL(0, this.LLJJJJLIIL);
        C12ES.LJIILL(0, this.LLJJIJIIJIL);
        C197039127h c197039127h = this.LLJJIII;
        if (c197039127h != null) {
            C0H1U.LIZIZ(c197039127h);
        }
        TuxTextView tuxTextView = this.LLJJIJI;
        if (tuxTextView != null) {
            C0H1U.LIZIZ(tuxTextView);
        }
        FrameLayout frameLayout = this.LLJJIJIL;
        if (frameLayout != null) {
            C0H1U.LIZIZ(frameLayout);
        }
        TuxTextView tuxTextView2 = this.LLJJJJ;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(33);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.bottomMargin = C0H9H.LIZIZ(4);
            C786410Ut5.R6(tuxTextView2, layoutParams);
        }
        AnonymousClass1879 anonymousClass1879 = this.LLJJJJJIL;
        if (anonymousClass1879 != null) {
            C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)), anonymousClass1879);
        }
        TuxTextView tuxTextView3 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView3 != null) {
            C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)), tuxTextView3);
        }
        TuxTextView tuxTextView4 = this.LLJL;
        if (tuxTextView4 != null) {
            C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(37)), tuxTextView4);
        }
        C212170181g c212170181g = this.LLL;
        if (c212170181g != null) {
            C427980GqK c427980GqK = new C427980GqK(R.attr.a1j, 61);
            C427970GqJ c427970GqJ = c212170181g.LJFF;
            if (c427970GqJ != null) {
                c427970GqJ.setStyle(c427980GqK);
            }
        }
        ConstraintLayout constraintLayout = this.LLJJL;
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
            layoutParams2.height = C0H9H.LIZIZ(103);
            C0H1U.LJIIJ(C0H9H.LIZIZ(13), constraintLayout);
            C786410Ut5.m6(constraintLayout, layoutParams2);
        }
        SmartImageView smartImageView = this.LLJLILLLLZIIL;
        if (smartImageView != null) {
            ViewGroup.LayoutParams layoutParams3 = smartImageView.getLayoutParams();
            layoutParams3.height = C0H9H.LIZIZ(60);
            layoutParams3.width = C0H9H.LIZIZ(60);
        }
        SmartImageView smartImageView2 = this.LLJLIL;
        if (smartImageView2 != null) {
            C0H9H.LJFF(C0H9H.LIZIZ(38), smartImageView2);
        }
    }

    @Override // X.AbstractC212300186g
    public final void l0() {
        Function2<? super Long, ? super Boolean, Unit> function2 = this.LLJLL;
        if (function2 != null) {
            function2.invoke(0L, Boolean.FALSE);
        }
    }

    @Override // X.AbstractC212300186g
    public C197039127h getBidButton() {
        return this.LLJJIII;
    }

    public final Function2<Long, Boolean, Unit> getCountDownUpdateCallback() {
        return this.LLJLL;
    }

    public final AnonymousClass1875 getExtendedAddTimeHelper() {
        return this.LLJLLIL;
    }

    @Override // X.AbstractC212300186g
    public TuxTextView getMaxBidText() {
        return this.LLJJIJI;
    }

    public final C212170181g getSurpriseSetStockController() {
        return this.LLL;
    }

    public final AnonymousClass1871 getWinnerInfoWithPriceController() {
        return this.LLJZIJLIL;
    }

    @Override // X.AbstractC212300186g
    public final AnonymousClass1875 n0() {
        return this.LLJLLIL;
    }

    public /* synthetic */ C212301186h(Context context) {
        this(context, null, 0);
    }

    @Override // X.AbstractC212300186g
    public final void i0(boolean z) {
        s0();
    }

    public final void setCountDownUpdateCallback(Function2<? super Long, ? super Boolean, Unit> function2) {
        this.LLJLL = function2;
    }

    public final void setExtendedAddTimeHelper(AnonymousClass1875 anonymousClass1875) {
        this.LLJLLIL = anonymousClass1875;
    }

    @Override // X.AbstractC212300186g
    public void setMaxbidStatus(C181U c181u) {
        super.setMaxbidStatus(c181u);
        C19MB c19mb = new C19MB();
        c19mb.LJII(this.LLJJJ);
        c19mb.LJI(R.id.gn7, 7);
        c19mb.LIZIZ(this.LLJJJ);
    }

    public final void setSurpriseSetStockController(C212170181g c212170181g) {
        this.LLL = c212170181g;
    }

    public final void setWinnerInfoWithPriceController(AnonymousClass1871 anonymousClass1871) {
        this.LLJZIJLIL = anonymousClass1871;
    }

    @Override // X.AbstractC212300186g
    public final void E0(SinglePriceItem singlePriceItem, long j) {
        if (this.LLJI) {
            super.E0(singlePriceItem, j);
        }
    }

    @Override // X.AbstractC212300186g
    public final void O0(long j, AAListenerS36S0100100_32 aAListenerS36S0100100_32) {
        Function2<? super Long, ? super Boolean, Unit> function2 = this.LLJLL;
        if (function2 != null) {
            function2.invoke(Long.valueOf(j), Boolean.TRUE);
        }
        setRemainingTime((j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) % ((long) 60));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String P0(java.lang.Integer r5, X.C212167181d r6) {
        /*
            r4 = this;
            r3 = 0
            if (r6 == 0) goto L51
            java.lang.Boolean r1 = r6.LIZLLL
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
        Lb:
            r2 = 0
            if (r0 != 0) goto L20
            if (r6 == 0) goto L4f
            java.lang.Long r0 = r6.LIZ
        L12:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r4.getUserId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L21
        L20:
            r3 = 1
        L21:
            java.util.Map r1 = r4.getAuctionTextMap()
            if (r3 == 0) goto L3c
            if (r1 == 0) goto L3b
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionText r0 = (com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionText) r0
            if (r0 == 0) goto L3b
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.Color r0 = r0.winnerColor
            if (r0 == 0) goto L3b
        L39:
            java.lang.String r2 = r0.value
        L3b:
            return r2
        L3c:
            if (r1 == 0) goto L3b
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionText r0 = (com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionText) r0
            if (r0 == 0) goto L3b
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.Color r0 = r0.defaultColor
            if (r0 == 0) goto L3b
            goto L39
        L4f:
            r0 = r2
            goto L12
        L51:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212301186h.P0(java.lang.Integer, X.181d):java.lang.String");
    }

    @Override // X.AbstractC212300186g
    public final void e0(boolean z, boolean z2) {
        HandlerHook.viewPost(this, new ARunnableS49S0110000_31(this, z, 4));
    }

    @Override // X.AbstractC212300186g
    public final void j0(C181U c181u, Boolean bool) {
        String strLIZLLL;
        String str;
        ArrayList arrayList = null;
        if (c181u != null) {
            Integer numValueOf = Integer.valueOf(c181u.LJI);
            boolean z = true;
            if (numValueOf != null) {
                if (numValueOf.intValue() == 1) {
                    C0H1U.LIZIZ(this.LLJJL);
                    C12ES.LJIILL(0, this.LLJJJ);
                    getBidPriceVersionPriceUpdateShownList().clear();
                    getBidPriceVersionExtendCountDownShownList().clear();
                    p0();
                    return;
                }
                if (numValueOf.intValue() == 10) {
                    C0H1U.LIZIZ(this.LLJJL);
                    C12ES.LJIILL(0, this.LLJJJ);
                    s0();
                    if (!Intrinsics.LJFF(bool, Boolean.TRUE)) {
                        return;
                    }
                    N0(c181u);
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LJI("UsBidCardView", "changeStatus, tryShowExtendTime");
                    return;
                }
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 16) {
                        C0H1U.LIZIZ(this.LLJJL);
                        C12ES.LJIILL(0, this.LLJJJ);
                        s0();
                        if (!Intrinsics.LJFF(bool, Boolean.TRUE)) {
                            return;
                        }
                        N0(c181u);
                        return;
                    }
                    if (numValueOf.intValue() == 20) {
                        C0H1U.LIZIZ(this.LLJJL);
                        C12ES.LJIILL(0, this.LLJJJ);
                        int i2 = c181u.LJII;
                        if (i2 == 20) {
                            e0(false, true);
                            return;
                        }
                        if (i2 != 16) {
                            z = false;
                        }
                        e0(z, false);
                        return;
                    }
                    if (numValueOf.intValue() == 30 || numValueOf.intValue() == 32 || numValueOf.intValue() == 33 || numValueOf.intValue() == 31) {
                        C12ES.LJIILL(0, this.LLJJL);
                        C0H1U.LIZIZ(this.LLJJJ);
                        SinglePriceItem singlePriceItem = c181u.LIZJ;
                        if (singlePriceItem != null) {
                            strLIZLLL = C743702vL.LIZLLL(singlePriceItem);
                        } else {
                            strLIZLLL = "";
                        }
                        this.LLJL.setText(S0(Integer.valueOf(c181u.LJIILL), c181u.LIZIZ, strLIZLLL));
                        String strP0 = P0(Integer.valueOf(c181u.LJIILL), c181u.LIZIZ);
                        if (strP0 != null) {
                            this.LLJL.setTextColor(C1100000ejO.LIZ(strP0));
                        }
                        switch (c181u.LJI) {
                            case 30:
                                C12ES.LJIILL(0, this.LLJJLIIIJLLLLLLLZ);
                                C0H1U.LIZIZ(this.LLJJJJJIL);
                                this.LLJJLIIIJLLLLLLLZ.setText(S0(Integer.valueOf(c181u.LJII), c181u.LIZIZ, strLIZLLL));
                                String strP02 = P0(Integer.valueOf(c181u.LJII), c181u.LIZIZ);
                                if (strP02 != null) {
                                    this.LLJJLIIIJLLLLLLLZ.setTextColor(C1100000ejO.LIZ(strP02));
                                }
                                C12ES.LJIILL(0, this.LLJLIL);
                                break;
                            case 31:
                                C0H1U.LIZIZ(this.LLJJJJJIL);
                                C12ES.LJIILL(0, this.LLJJLIIIJLLLLLLLZ);
                                this.LLJJLIIIJLLLLLLLZ.setText(S0(Integer.valueOf(c181u.LJII), c181u.LIZIZ, strLIZLLL));
                                String strP03 = P0(Integer.valueOf(c181u.LJII), c181u.LIZIZ);
                                if (strP03 != null) {
                                    this.LLJJLIIIJLLLLLLLZ.setTextColor(C1100000ejO.LIZ(strP03));
                                }
                                C0H1U.LIZIZ(this.LLJLIL);
                                break;
                            case 32:
                                AnonymousClass1879 anonymousClass1879 = this.LLJJJJJIL;
                                List<ScrollElement> list = c181u.LJIILLIIL;
                                if (list != null) {
                                    arrayList = new ArrayList();
                                    Iterator<ScrollElement> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        String str2 = it2.next().productTitle;
                                        if (str2 != null) {
                                            arrayList.add(str2);
                                        }
                                    }
                                }
                                anonymousClass1879.setDataAndStart(arrayList);
                                C12ES.LJIILL(0, this.LLJJJJJIL);
                                C0H1U.LIZIZ(this.LLJJLIIIJLLLLLLLZ);
                                C12ES.LJIILL(0, this.LLJLIL);
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                ScrollElement scrollElement = c181u.LJIIZILJ;
                                if (scrollElement != null && (str = scrollElement.productTitle) != null) {
                                    AnonymousClass1879 anonymousClass18792 = this.LLJJJJJIL;
                                    anonymousClass18792.LLJI = str;
                                    AnonymousClass0956 anonymousClass0956 = anonymousClass18792.LLIZ;
                                    if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
                                        anonymousClass18792.LIZ();
                                        TuxTextView tuxTextView = anonymousClass18792.LL;
                                        if (tuxTextView != null) {
                                            tuxTextView.setText(anonymousClass18792.LLJI);
                                        }
                                    }
                                    C12ES.LJIILL(0, this.LLJJJJJIL);
                                } else {
                                    AnonymousClass0956 anonymousClass09562 = this.LLJJJJJIL.LLIZ;
                                    if (anonymousClass09562 != null) {
                                        anonymousClass09562.LIZIZ(null);
                                    }
                                    C0H1U.LIZIZ(this.LLJJJJJIL);
                                }
                                C0H1U.LIZIZ(this.LLJJLIIIJLLLLLLLZ);
                                C12ES.LJIILL(0, this.LLJLIL);
                                break;
                        }
                        return;
                    }
                }
            }
        }
        p0();
    }

    @Override // X.AbstractC212300186g
    public void u0(UsPopupCardVO usPopupCardVO, boolean z) {
        SurpriseSetData surpriseSetData;
        ECImage eCImage;
        String str;
        C212170181g c212170181g;
        super.u0(usPopupCardVO, z);
        if (z) {
            if (this.LLJZ == null) {
                this.LLJZ = new AnonymousClass1873(this.LLJJIJIIJIL, 0, 6);
            }
        } else if (this.LLJZIJLIL == null) {
            this.LLJZIJLIL = new AnonymousClass1871(this.LLJJIJIL);
        }
        if (this.LLL == null) {
            this.LLL = new C212170181g(this.LLJJJIL, 0, 6);
        }
        AuctionData auctionData = usPopupCardVO.auctionData;
        if (auctionData != null && (c212170181g = this.LLL) != null) {
            c212170181g.LJIIJJI(auctionData);
        }
        TuxTextView tuxTextView = this.LLJJJJ;
        String str2 = null;
        if (tuxTextView != null) {
            AuctionData auctionData2 = usPopupCardVO.auctionData;
            if (auctionData2 != null) {
                str = auctionData2.auctionTitle;
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
        C19411510wz c19411510wz = C19411510wz.LIZ;
        EnumC1769850w9n enumC1769850w9n = EnumC1769850w9n.LIVE_SURPRISE_AUCTION_WINNER_DECORATION;
        SmartImageView smartImageView = this.LLJLIL;
        AuctionData auctionData3 = usPopupCardVO.auctionData;
        if (auctionData3 != null && (surpriseSetData = auctionData3.surpriseSetData) != null && (eCImage = surpriseSetData.winnerDecoration) != null) {
            str2 = eCImage.url;
        }
        c19411510wz.LJ(enumC1769850w9n, smartImageView, str2);
    }

    public C212301186h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJLLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(392));
        this.LLLF = 72;
        LayoutInflater layoutInflaterCloneInContext = C786410Ut5.ne(context).cloneInContext(new ContextThemeWrapper(context, R.style.acp));
        if (layoutInflaterCloneInContext != null) {
            C786410Ut5.Sd(T0(), layoutInflaterCloneInContext, this);
        }
        this.LLJJIII = (C197039127h) findViewById(R.id.gkl);
        this.LLJJIJI = (TuxTextView) findViewById(R.id.o4h);
        this.LLJJIJIIJIL = (FrameLayout) findViewById(R.id.b_t);
        this.LLJJIJIL = (FrameLayout) findViewById(R.id.gn7);
        this.LLJJJ = (ConstraintLayout) findViewById(R.id.emx);
        this.LLJJJIL = (FrameLayout) findViewById(R.id.wqd);
        this.LLJJJJ = (TuxTextView) findViewById(R.id.wqc);
        this.LLJJJJJIL = (AnonymousClass1879) findViewById(R.id.ntg);
        this.LLJJJJLIIL = (FrameLayout) findViewById(R.id.gmb);
        this.LLJJL = (ConstraintLayout) findViewById(R.id.nth);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) findViewById(R.id.nti);
        this.LLJL = (TuxTextView) findViewById(R.id.ntf);
        this.LLJLIL = (SmartImageView) findViewById(R.id.winner_avatar_decoration);
        this.LLJLILLLLZIIL = (SmartImageView) findViewById(R.id.nr4);
        setPriceLayoutViewControllerFront(new C212295186b<>(this, new C212299186f(R.id.gmd), 5, 5));
        setPriceLayoutViewControllerBehind(new C212295186b<>(this, new C212299186f(R.id.gme), 5, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079 A[PHI: r0
      0x0079: PHI (r0v9 java.lang.String) = (r0v8 java.lang.String), (r0v15 java.lang.String) binds: [B:38:0x0072, B:27:0x004f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String S0(java.lang.Integer r8, X.C212167181d r9, java.lang.String r10) {
        /*
            r7 = this;
            java.lang.String r6 = ""
            if (r9 == 0) goto L8
            java.lang.String r5 = r9.LIZIZ
            if (r5 != 0) goto L9
        L8:
            r5 = r6
        L9:
            r4 = 0
            if (r9 == 0) goto L77
            java.lang.Boolean r1 = r9.LIZLLL
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L75
            if (r9 == 0) goto L77
            java.lang.Long r0 = r9.LIZ
        L1a:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r7.getUserId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L75
            r0 = 0
        L29:
            java.lang.String r3 = "{s_price}"
            java.lang.String r2 = "{s_name}"
            if (r0 == 0) goto L52
            java.util.Map r1 = r7.getAuctionTextMap()
            if (r1 == 0) goto L51
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionText r0 = (com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionText) r0
            if (r0 == 0) goto L51
            java.lang.String r0 = r0.winnerText
            if (r0 == 0) goto L51
            java.lang.String r0 = kotlin.text.u.LJJIFFI(r0, r2, r5, r4)
            if (r0 == 0) goto L51
            java.lang.String r0 = kotlin.text.u.LJJIFFI(r0, r3, r10, r4)
            if (r0 != 0) goto L79
        L51:
            return r6
        L52:
            java.util.Map r1 = r7.getAuctionTextMap()
            if (r1 == 0) goto L51
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionText r0 = (com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionText) r0
            if (r0 == 0) goto L51
            java.lang.String r0 = r0.defaultText
            if (r0 == 0) goto L51
            java.lang.String r0 = kotlin.text.u.LJJIFFI(r0, r2, r5, r4)
            if (r0 == 0) goto L51
            java.lang.String r0 = kotlin.text.u.LJJIFFI(r0, r3, r10, r4)
            if (r0 != 0) goto L79
            return r6
        L75:
            r0 = 1
            goto L29
        L77:
            r0 = 0
            goto L1a
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212301186h.S0(java.lang.Integer, X.181d, java.lang.String):java.lang.String");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TuxTextView tuxTextView;
        Layout layout;
        AnonymousClass1871 anonymousClass1871;
        C212310186q c212310186q;
        C212295186b<ViewGroup> productPriceController;
        C212332187m c212332187m;
        Float fValueOf;
        C212295186b<ViewGroup> productPriceController2;
        C212332187m c212332187m2;
        C212295186b<ViewGroup> productPriceController3;
        C212332187m c212332187m3;
        super.onLayout(z, i, i2, i3, i4);
        TuxTextView tuxTextView2 = this.LLJJIJI;
        if (tuxTextView2 != null && tuxTextView2.getVisibility() == 0 && (tuxTextView = this.LLJJIJI) != null && (layout = tuxTextView.getLayout()) != null && layout.getEllipsisCount(0) > 0 && (anonymousClass1871 = this.LLJZIJLIL) != null && (c212310186q = anonymousClass1871.LJ) != null && (productPriceController = c212310186q.getProductPriceController()) != null && (c212332187m = productPriceController.LJII) != null && (fValueOf = Float.valueOf(c212332187m.getPriceNumTextSize())) != null && C679280Qkg.LIZIZ(fValueOf) > 12.0f) {
            AnonymousClass1871 anonymousClass18712 = this.LLJZIJLIL;
            if (anonymousClass18712 != null) {
                int i5 = this.LLLF;
                C212310186q c212310186q2 = anonymousClass18712.LJ;
                if (c212310186q2 != null && (productPriceController3 = c212310186q2.getProductPriceController()) != null && (c212332187m3 = productPriceController3.LJII) != null) {
                    c212332187m3.setPriceNumTuxFont(i5);
                }
                C212310186q c212310186q3 = anonymousClass18712.LJFF;
                if (c212310186q3 != null && (productPriceController2 = c212310186q3.getProductPriceController()) != null && (c212332187m2 = productPriceController2.LJII) != null) {
                    c212332187m2.setPriceNumTuxFont(i5);
                }
            }
            requestLayout();
        }
    }

    @Override // X.AbstractC212300186g
    public void M0(C212167181d c212167181d, Map<String, AuctionText> map, boolean z, int i, int i2, C212294186a c212294186a, boolean z2, CarouselCfg carouselCfg) {
        Long l;
        String str;
        String str2;
        String str3;
        Boolean bool = null;
        if (c212167181d != null) {
            l = c212167181d.LIZ;
            str = c212167181d.LIZIZ;
            str2 = c212167181d.LIZJ;
            bool = c212167181d.LIZLLL;
        } else {
            l = null;
            str = null;
            str2 = null;
        }
        AnonymousClass1872 anonymousClass1872 = new AnonymousClass1872(l, str, str2, bool, map, z, i, i2, false, c212294186a, z2, carouselCfg, 1280);
        if (z) {
            AnonymousClass1873 anonymousClass1873 = this.LLJZ;
            if (anonymousClass1873 != null) {
                anonymousClass1873.LJIIL(anonymousClass1872);
            }
        } else {
            AnonymousClass1871 anonymousClass1871 = this.LLJZIJLIL;
            if (anonymousClass1871 != null) {
                anonymousClass1871.LJIILIIL(anonymousClass1872);
            }
        }
        SmartImageView smartImageView = this.LLJLILLLLZIIL;
        if (smartImageView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
            if (c212167181d != null && (str3 = c212167181d.LIZJ) != null) {
                C19411510wz.LIZIZ(C19411510wz.LIZ, str3, EnumC1769850w9n.LIVE_SURPRISE_AUCTION_WINNER_AVATAR);
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str3);
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LIZ = true;
                c1331670kl3LIZLLL.LJJI = new C1331730kl9(c1331750klB);
                c1331670kl3LIZLLL.LJJ(smartImageView);
                c1331670kl3LIZLLL.LJJIIZI(c419910GdJ.LIZ(smartImageView.getContext()));
                c1331670kl3LIZLLL.LJIL(c419910GdJ.LIZ(smartImageView.getContext()));
                C786410Ut5.h3(c1331670kl3LIZLLL);
                C12ES.LJIILL(0, smartImageView);
            }
        }
    }
}
