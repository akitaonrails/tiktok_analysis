package X;

import Y.ARunnableS98S0200000_29;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsBidViewModel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.BidPanel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.CustomizePanel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.text.u;
import webcast.data.oec_msg.ExtendAuctionCfg;

/* JADX INFO: renamed from: X.11yH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19674311yH extends ConstraintLayout implements InterfaceC19677911yr, C181X {
    public final UsBidViewModel LL;
    public final C19EG LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public LinearLayout LLILZ;
    public C197039127h LLILZIL;
    public C197039127h LLILZLL;
    public SmartImageView LLIZ;
    public AbstractC212300186g LLIZLLLIL;
    public String LLJ;
    public long LLJI;
    public boolean LLJIJIL;
    public Function1<? super View, Unit> LLJILJIL;
    public AwS608S0100000_29 LLJILJILJ;

    @Override // X.C181X
    public final void Hi(UsPopupCardVO usPopupCardVO) {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059 A[PHI: r3
      0x0059: PHI (r3v3 androidx.lifecycle.LifecycleOwner) = (r3v0 androidx.lifecycle.LifecycleOwner), (r3v6 androidx.lifecycle.LifecycleOwner) binds: [B:54:0x00f8, B:24:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19674311yH.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        String str;
        UsPopupCardVO usPopupCardVO;
        AuctionData auctionData;
        ExtendAuctionCfg extendAuctionCfg;
        C181U c181u;
        UsBidViewModel usBidViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        super.onDetachedFromWindow();
        UsBidViewModel usBidViewModel2 = this.LL;
        if (usBidViewModel2 != null && (mutableLiveData = usBidViewModel2.LLJ) != null) {
            mutableLiveData.removeObservers(this.LLILLJJLI);
        }
        UsBidViewModel usBidViewModel3 = this.LL;
        if (usBidViewModel3 != null) {
            ((ArrayList) usBidViewModel3.LLJILJIL).remove(this);
        }
        UsBidViewModel usBidViewModel4 = this.LL;
        if (usBidViewModel4 != null) {
            ((ArrayList) usBidViewModel4.LLJILJILJ).remove(this);
        }
        AbstractC212300186g abstractC212300186g = this.LLIZLLLIL;
        if (abstractC212300186g != null && (usBidViewModel = this.LL) != null) {
            ((ArrayList) usBidViewModel.LLJILJIL).remove(abstractC212300186g);
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("page_name", "live_auction_set_bid");
        UsBidViewModel usBidViewModel5 = this.LL;
        if (usBidViewModel5 == null || (c181u = usBidViewModel5.LLJIJIL) == null || (str = c181u.LJIIJJI) == null) {
            str = "";
        }
        pairArr[1] = new Pair("auction_id", str);
        UsBidViewModel usBidViewModel6 = this.LL;
        pairArr[2] = new Pair("is_extended_auction", String.valueOf((usBidViewModel6 == null || (usPopupCardVO = usBidViewModel6.LLILLJJLI) == null || (auctionData = usPopupCardVO.auctionData) == null || (extendAuctionCfg = auctionData.extendAuctionCfg) == null) ? null : C19673811yC.LIZJ(extendAuctionCfg)));
        pairArr[3] = new Pair("stay_time", String.valueOf(System.currentTimeMillis() - this.LLJI));
        pairArr[4] = new Pair("quit_type", this.LLJIJIL ? "submit" : "user_close");
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        UsBidViewModel usBidViewModel7 = this.LL;
        if (usBidViewModel7 != null) {
            mapLJIIJ.putAll(usBidViewModel7.xQ2(null, null, true));
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_stay_page", mapLJIIJ);
        C21198117xT c21198117xT = C21198117xT.LIZ;
        UsBidViewModel usBidViewModel8 = this.LL;
        c21198117xT.getClass();
        C21198117xT.LIZ("auction_popup_dismiss", usBidViewModel8, null);
    }

    public final AbstractC212300186g getBidCardView() {
        return this.LLIZLLLIL;
    }

    public final C197039127h getEcommerceliveBtnBid() {
        return this.LLILZIL;
    }

    public final C197039127h getEcommerceliveBtnMaxBid() {
        return this.LLILZLL;
    }

    public final Function1<View, Unit> getMaxBidClickAction() {
        return this.LLJILJIL;
    }

    public final SmartImageView getShipmentIcon() {
        return this.LLIZ;
    }

    public final LinearLayout getTipInfoLayout() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC19677911yr
    public final void LJLIIIL(C181U c181u) {
        C2487409ou.LIZJ(new ARunnableS98S0200000_29(this, c181u, 56));
    }

    public final void h0(C181U c181u) {
        C197039127h c197039127h;
        C197039127h c197039127h2;
        if (c181u != null && (c181u.LJI == 10 || c181u.LJI == 16)) {
            C197039127h c197039127h3 = this.LLILZIL;
            if (c197039127h3 != null) {
                c197039127h3.setEnabled(true);
            }
            C197039127h c197039127h4 = this.LLILZLL;
            if (c197039127h4 != null) {
                c197039127h4.setEnabled(true);
            }
            C197039127h c197039127h5 = this.LLILZLL;
            if (c197039127h5 != null) {
                C786410Ut5.w5(c197039127h5, 1.0f);
            }
            C197039127h c197039127h6 = this.LLILZIL;
            if (c197039127h6 != null) {
                C786410Ut5.w5(c197039127h6, 1.0f);
            }
            Function1<? super View, Unit> function1 = this.LLJILJIL;
            if (function1 != null && (c197039127h2 = this.LLILZLL) != null) {
                C786410Ut5.I7(new C19673911yD(function1), c197039127h2);
            }
            AwS608S0100000_29 awS608S0100000_29 = this.LLJILJILJ;
            if (awS608S0100000_29 != null && (c197039127h = this.LLILZIL) != null) {
                C786410Ut5.I7(new C19673911yD(awS608S0100000_29), c197039127h);
                return;
            }
            return;
        }
        C197039127h c197039127h7 = this.LLILZIL;
        if (c197039127h7 != null) {
            c197039127h7.setEnabled(false);
        }
        C197039127h c197039127h8 = this.LLILZLL;
        if (c197039127h8 == null) {
            return;
        }
        c197039127h8.setEnabled(false);
    }

    @Override // X.C181X
    public final void ky(UsPopupCardVO usPopupCardVO) {
        if (usPopupCardVO != null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("usbid", "setPopProduct from updatePopInfo");
            setPopProduct(usPopupCardVO);
        }
    }

    public final void setBidCardView(AbstractC212300186g abstractC212300186g) {
        this.LLIZLLLIL = abstractC212300186g;
    }

    public final void setEcommerceliveBtnBid(C197039127h c197039127h) {
        this.LLILZIL = c197039127h;
    }

    public final void setEcommerceliveBtnMaxBid(C197039127h c197039127h) {
        this.LLILZLL = c197039127h;
    }

    public final void setMaxBidClickAction(Function1<? super View, Unit> function1) {
        this.LLJILJIL = function1;
    }

    public final void setNextBidPrice(SinglePriceItem singlePriceItem) {
        String strLJJIFFI;
        String strLIZLLL;
        String str = this.LLJ;
        if (str != null) {
            if (singlePriceItem != null) {
                strLIZLLL = C743702vL.LIZLLL(singlePriceItem);
            } else {
                strLIZLLL = "";
            }
            strLJJIFFI = u.LJJIFFI(str, "{s_price}", strLIZLLL, false);
        } else {
            strLJJIFFI = null;
        }
        C197039127h c197039127h = this.LLILZIL;
        if (c197039127h != null) {
            c197039127h.setText(strLJJIFFI);
        }
    }

    public void setPopProduct(final UsPopupCardVO usPopupCardVO) {
        String str;
        List<String> list;
        String str2;
        C181U c181u;
        CustomizePanel customizePanel;
        BidPanel bidPanel;
        String str3;
        BidPanel bidPanel2;
        BidPanel bidPanel3;
        C197039127h c197039127h;
        AbstractC212300186g abstractC212300186g = this.LLIZLLLIL;
        if (abstractC212300186g != null) {
            abstractC212300186g.F0(usPopupCardVO, null, true, null, null, null, null);
        }
        Function1<? super View, Unit> function1 = this.LLJILJIL;
        if (function1 != null && (c197039127h = this.LLILZLL) != null) {
            C786410Ut5.I7(new C19673911yD(function1), c197039127h);
        }
        AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(this, 619);
        this.LLJILJILJ = awS608S0100000_29;
        C197039127h c197039127h2 = this.LLILZIL;
        if (c197039127h2 != null) {
            C786410Ut5.I7(new C19673911yD(awS608S0100000_29), c197039127h2);
        }
        AuctionData auctionData = usPopupCardVO.auctionData;
        SinglePriceItem singlePriceItem = null;
        if (auctionData != null && (bidPanel3 = auctionData.bidPanel) != null) {
            str = bidPanel3.nextBidBtnPricePrefixText;
        } else {
            str = null;
        }
        this.LLJ = str;
        C197039127h c197039127h3 = this.LLILZLL;
        if (c197039127h3 != null) {
            if (auctionData != null && (bidPanel2 = auctionData.bidPanel) != null) {
                str3 = bidPanel2.customizeBidBtnText;
            } else {
                str3 = null;
            }
            c197039127h3.setText(str3);
        }
        AuctionData auctionData2 = usPopupCardVO.auctionData;
        if (auctionData2 != null && (bidPanel = auctionData2.bidPanel) != null) {
            list = bidPanel.infoList;
        } else {
            list = null;
        }
        LinearLayout linearLayout = this.LLILZ;
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        if (list != null) {
            int i = 0;
            for (String str4 : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    C038R c038r = new C038R(getContext());
                    c038r.LL.setText(str4);
                    if (i > 0) {
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c038r);
                        c038r.setLayoutParams(layoutParams);
                    }
                    LinearLayout linearLayout2 = this.LLILZ;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(c038r);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        C810203Em.LIZIZ(getContext(), this.LLIZ);
        SmartImageView smartImageView = this.LLIZ;
        if (smartImageView != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC19509711Up() { // from class: X.11yK
                @Override // X.AbstractViewOnClickListenerC19509711Up
                public final void LIZ(View view) {
                    BidPanel bidPanel4;
                    String str5;
                    if (view != null) {
                        this.LLILLL.e0("wallet", false);
                        AuctionData auctionData3 = usPopupCardVO.auctionData;
                        if (auctionData3 != null && (bidPanel4 = auctionData3.bidPanel) != null && (str5 = bidPanel4.addressPaymentSchema) != null) {
                            SmartRouter.buildRoute(this.LLILLL.getContext(), str5).open();
                        }
                    }
                }
            }, smartImageView);
        }
        SmartImageView smartImageView2 = this.LLIZ;
        AuctionData auctionData3 = usPopupCardVO.auctionData;
        if (auctionData3 != null && (customizePanel = auctionData3.customizePanel) != null) {
            str2 = customizePanel.addressPayIcon;
        } else {
            str2 = null;
        }
        C810203Em.LIZ(smartImageView2, str2);
        e0("wallet", true);
        UsBidViewModel usBidViewModel = this.LL;
        if (usBidViewModel != null) {
            c181u = usBidViewModel.LLJIJIL;
        } else {
            c181u = null;
        }
        AbstractC212300186g abstractC212300186g2 = this.LLIZLLLIL;
        if (abstractC212300186g2 != null) {
            abstractC212300186g2.z0(c181u, Boolean.FALSE);
        }
        int i3 = C2187451AjH.LIZ;
        C1720106oR.LIZ("usbid", "setAuctionData from popupview setpopproduct");
        if (c181u != null) {
            singlePriceItem = c181u.LIZLLL;
        }
        setNextBidPrice(singlePriceItem);
        h0(c181u);
    }

    public final void setShipmentIcon(SmartImageView smartImageView) {
        this.LLIZ = smartImageView;
    }

    public final void setTipInfoLayout(LinearLayout linearLayout) {
        this.LLILZ = linearLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca A[PHI: r1
      0x00ca: PHI (r1v12 java.lang.String) = (r1v10 java.lang.String), (r1v13 java.lang.String) binds: [B:50:0x00c8, B:48:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(java.lang.String r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19674311yH.e0(java.lang.String, boolean):void");
    }

    public AbstractC19674311yH(Context context, AttributeSet attributeSet, int i, UsBidViewModel usBidViewModel, C19EG c19eg, Function0<Unit> function0) {
        super(context, attributeSet, i);
        this.LL = usBidViewModel;
        this.LLILLJJLI = c19eg;
        this.LLILLL = function0;
    }
}
