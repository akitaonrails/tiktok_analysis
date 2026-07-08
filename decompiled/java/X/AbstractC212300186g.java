package X;

import Y.AAListenerS278S0200000_32;
import Y.AAListenerS36S0100100_32;
import Y.ARunnableS98S0200000_29;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionText;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.BidPanel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS159S0400000_32;
import kotlin.jvm.internal.AwS276S0300000_32;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import webcast.data.oec_msg.CarouselCfg;
import webcast.data.oec_msg.ExtendAuctionCfg;

/* JADX INFO: renamed from: X.186g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC212300186g extends ConstraintLayout implements InterfaceC1631620sYq<Integer, Integer, Long, Unit>, InterfaceC19677911yr {
    public CopyOnWriteArrayList<Long> LL;
    public CopyOnWriteArrayList<Long> LLILLJJLI;
    public long LLILLL;
    public Function0<Unit> LLILZ;
    public Function0<Unit> LLILZIL;
    public C0NOH LLILZLL;
    public Function1<? super String, Unit> LLIZ;
    public Function1<? super Boolean, Unit> LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public Map<String, AuctionText> LLJIJIL;
    public AnonymousClass1875 LLJILJIL;
    public String LLJILJILJ;
    public C212295186b<ViewGroup> LLJILLL;
    public C212295186b<ViewGroup> LLJJ;
    public Map<String, String> LLJJI;

    public abstract void C0();

    public abstract void L0();

    public abstract void M0(C212167181d c212167181d, Map<String, AuctionText> map, boolean z, int i, int i2, C212294186a c212294186a, boolean z2, CarouselCfg carouselCfg);

    public abstract void O0(long j, AAListenerS36S0100100_32 aAListenerS36S0100100_32);

    public abstract void e0(boolean z, boolean z2);

    public abstract C197039127h getBidButton();

    public abstract C197039127h getCustomButton();

    public abstract TuxTextView getMaxBidText();

    public abstract void i0(boolean z);

    public abstract void l0();

    public abstract AnonymousClass1875 n0();

    public void setAtmosphere(UsPopupCardVO usPopupCardVO) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0NOH c0noh = this.LLILZLL;
        if (c0noh != null) {
            c0noh.LIZJ();
        }
        this.LL.clear();
        this.LLILLJJLI.clear();
        AnonymousClass1875 anonymousClass1875 = this.LLJILJIL;
        if (anonymousClass1875 != null) {
            anonymousClass1875.LJL();
        }
    }

    public void p0() {
        C197039127h bidButton = getBidButton();
        if (bidButton != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC19509711Up() { // from class: X.186z
                @Override // X.AbstractViewOnClickListenerC19509711Up
                public final void LIZ(View view) {
                    Function1<? super Boolean, Unit> function1;
                    if (view != null && (function1 = this.LLILLL.LLIZLLLIL) != null) {
                        function1.invoke(Boolean.FALSE);
                    }
                }
            }, bidButton);
            setGreyBtn(bidButton);
        }
    }

    public final void s0() {
        C197039127h bidButton = getBidButton();
        if (bidButton != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC19509711Up() { // from class: X.1870
                @Override // X.AbstractViewOnClickListenerC19509711Up
                public final void LIZ(View view) {
                    Function1<? super Boolean, Unit> function1;
                    if (view != null && (function1 = this.LLILLL.LLIZLLLIL) != null) {
                        function1.invoke(Boolean.TRUE);
                    }
                }
            }, bidButton);
            setRedActiveBtn(bidButton);
        }
    }

    public final Map<String, AuctionText> getAuctionTextMap() {
        return this.LLJIJIL;
    }

    public final Map<String, String> getBidBtnTextMap() {
        return this.LLJJI;
    }

    public final CopyOnWriteArrayList<Long> getBidPriceVersionExtendCountDownShownList() {
        return this.LL;
    }

    public final CopyOnWriteArrayList<Long> getBidPriceVersionPriceUpdateShownList() {
        return this.LLILLJJLI;
    }

    public final Function1<String, Unit> getButtonShowCallback() {
        return this.LLIZ;
    }

    public final C0NOH getCountDownManager() {
        return this.LLILZLL;
    }

    public final String getMaxbidPricePrefixText() {
        return this.LLJILJILJ;
    }

    public final C212295186b<ViewGroup> getPriceLayoutViewControllerBehind() {
        return this.LLJJ;
    }

    public final C212295186b<ViewGroup> getPriceLayoutViewControllerFront() {
        return this.LLJILLL;
    }

    public final long getRemainingTime() {
        return this.LLILLL;
    }

    public final long getRemainingTimeInSeconds() {
        return this.LLILLL;
    }

    private final void setCustomBtnStyle(C197039127h c197039127h) {
        if (c197039127h != null) {
            C786410Ut5.w5(c197039127h, 1.0f);
            c197039127h.LJJJJL(new AwS580S0100000_1(this, 486));
        }
    }

    private final void setGreyBtn(C197039127h c197039127h) {
        if (c197039127h != null) {
            C786410Ut5.w5(c197039127h, 1.0f);
            c197039127h.LJJJJL(new AwS580S0100000_1(this, 487));
        }
    }

    @Override // X.InterfaceC19677911yr
    public final void LJLIIIL(C181U c181u) {
        C2487409ou.LIZJ(new ARunnableS98S0200000_29(this, c181u, 55));
    }

    public final void N0(C181U c181u) {
        Boolean boolValueOf;
        Animator animatorV;
        ExtendAuctionCfg extendAuctionCfg;
        Animator animatorV2;
        Animator animatorV3;
        Animator animatorV4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isPopup:");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(";tryShowExtendTime auctiondata:");
        sbLIZ.append(c181u.LJIILJJIL);
        sbLIZ.append(" shouldExtend=");
        ExtendAuctionCfg extendAuctionCfg2 = c181u.LJIILJJIL;
        Animator animatorV5 = null;
        if (extendAuctionCfg2 != null) {
            boolValueOf = Boolean.valueOf(extendAuctionCfg2.shouldExtend);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", remainingTime = ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append("， version = ");
        sbLIZ.append(c181u.LIZ);
        sbLIZ.append("SimpleExtendedAddTimeHelper: ");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append("extended animator = ");
        AnonymousClass1875 anonymousClass1875 = this.LLJILJIL;
        if (anonymousClass1875 != null) {
            animatorV = anonymousClass1875.V();
        } else {
            animatorV = null;
        }
        sbLIZ.append(animatorV);
        C1720106oR.LJI("UsBidCardView", C2188811AlT.LIZIZ(sbLIZ));
        ExtendAuctionCfg extendAuctionCfg3 = c181u.LJIILJJIL;
        if (extendAuctionCfg3 == null) {
            return;
        }
        long j = extendAuctionCfg3.extendAuctionTime;
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        long j3 = j / j2;
        if (!this.LL.contains(Long.valueOf(c181u.LIZ)) && (extendAuctionCfg = c181u.LJIILJJIL) != null && extendAuctionCfg.shouldExtend) {
            long j4 = this.LLILLL;
            if (j4 <= j3) {
                long j5 = j3 - j4;
                AnonymousClass1875 anonymousClass18752 = this.LLJILJIL;
                if (anonymousClass18752 != null) {
                    anonymousClass18752.q(j5);
                }
                if (this.LLILLL == 0) {
                    AnonymousClass1875 anonymousClass18753 = this.LLJILJIL;
                    if (anonymousClass18753 != null) {
                        anonymousClass18753.LJJLIIIJJIZ(false);
                    }
                    C0NOI c0noiLIZ = C0NOL.LIZ(0L, SystemClock.elapsedRealtime() + ((j3 + 1) * j2), 1L, 1L);
                    if (c0noiLIZ != null) {
                        C0NOH c0noh = this.LLILZLL;
                        if (c0noh != null) {
                            c0noh.LIZLLL(c0noiLIZ);
                        }
                        C0NOH c0noh2 = this.LLILZLL;
                        if (c0noh2 != null) {
                            C0NOH.LJ(c0noh2);
                        }
                        this.LL.add(Long.valueOf(c181u.LIZ));
                        Function0<Unit> function0 = this.LLILZIL;
                        if (function0 != null) {
                            function0.invoke();
                            return;
                        }
                        return;
                    }
                    return;
                }
                AnonymousClass1875 anonymousClass18754 = this.LLJILJIL;
                if (anonymousClass18754 != null) {
                    anonymousClass18754.LJJLIIIJJIZ(true);
                }
                AnonymousClass1875 anonymousClass18755 = this.LLJILJIL;
                if (anonymousClass18755 != null && (animatorV4 = anonymousClass18755.V()) != null) {
                    animatorV4.cancel();
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("extendTimeAnimator cancel: ");
                AnonymousClass1875 anonymousClass18756 = this.LLJILJIL;
                if (anonymousClass18756 != null) {
                    animatorV5 = anonymousClass18756.V();
                }
                sbLIZ2.append(animatorV5);
                sbLIZ2.append(", isPopup: ");
                sbLIZ2.append(this.LLJI);
                C1720106oR.LJI("UsBidCardView", C2188811AlT.LIZIZ(sbLIZ2));
                AnonymousClass1875 anonymousClass18757 = this.LLJILJIL;
                if (anonymousClass18757 != null) {
                    anonymousClass18757.LLLLLZL();
                }
                AnonymousClass1875 anonymousClass18758 = this.LLJILJIL;
                if (anonymousClass18758 != null && (animatorV3 = anonymousClass18758.V()) != null) {
                    animatorV3.addListener(new AAListenerS36S0100100_32(j3, this, 0));
                }
                this.LL.add(Long.valueOf(c181u.LIZ));
                AnonymousClass1875 anonymousClass18759 = this.LLJILJIL;
                if (anonymousClass18759 != null && (animatorV2 = anonymousClass18759.V()) != null) {
                    animatorV2.start();
                }
                Function0<Unit> function02 = this.LLILZIL;
                if (function02 == null) {
                    return;
                }
                function02.invoke();
            }
        }
    }

    public final void setAuctionTextMap(Map<String, AuctionText> map) {
        this.LLJIJIL = map;
    }

    public final void setBidBtnTextMap(Map<String, String> map) {
        this.LLJJI = map;
    }

    public final void setBidPriceVersionExtendCountDownShownList(CopyOnWriteArrayList<Long> copyOnWriteArrayList) {
        this.LL = copyOnWriteArrayList;
    }

    public final void setBidPriceVersionPriceUpdateShownList(CopyOnWriteArrayList<Long> copyOnWriteArrayList) {
        this.LLILLJJLI = copyOnWriteArrayList;
    }

    public final void setBtnLoading(boolean z) {
        C197039127h bidButton = getBidButton();
        if (bidButton != null) {
            bidButton.setLoading(z);
        }
    }

    public final void setButtonShowCallback(Function1<? super String, Unit> function1) {
        this.LLIZ = function1;
    }

    public final void setCountDownManager(C0NOH c0noh) {
        this.LLILZLL = c0noh;
    }

    public final void setCustomBtnLoading(boolean z) {
        C197039127h customButton = getCustomButton();
        if (customButton != null) {
            customButton.setLoading(z);
        }
    }

    public final void setMaxbidPricePrefixText(String str) {
        this.LLJILJILJ = str;
    }

    public void setMaxbidStatus(C181U c181u) {
        TuxTextView maxBidText = getMaxBidText();
        if (maxBidText != null) {
            C03DZ.LIZJ(maxBidText);
            String str = this.LLJILJILJ;
            String strLJJIFFI = null;
            if (str != null) {
                SinglePriceItem singlePriceItem = c181u.LJFF;
                if (singlePriceItem != null) {
                    strLJJIFFI = C743702vL.LIZLLL(singlePriceItem);
                }
                strLJJIFFI = u.LJJIFFI(str, "{s_currencyprice}", String.valueOf(strLJJIFFI), false);
            }
            maxBidText.setText(strLJJIFFI);
        }
        C197039127h bidButton = getBidButton();
        if (bidButton != null) {
            C0H1U.LIZIZ(bidButton);
        }
    }

    public final void setPopupStyle(boolean z) {
        this.LLJI = z;
    }

    public final void setPriceLayoutViewControllerBehind(C212295186b<ViewGroup> c212295186b) {
        this.LLJJ = c212295186b;
    }

    public final void setPriceLayoutViewControllerFront(C212295186b<ViewGroup> c212295186b) {
        this.LLJILLL = c212295186b;
    }

    public final void setRedActiveBtn(C197039127h c197039127h) {
        if (c197039127h != null) {
            C786410Ut5.w5(c197039127h, 1.0f);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ob);
            c197039127h.setBackground(c384050F3z.LIZ(getContext()));
            c197039127h.setTextColorRes(R.attr.ee);
        }
    }

    public final void setRedDisActiveBtn(C197039127h c197039127h) {
        if (c197039127h != null) {
            C786410Ut5.w5(c197039127h, 0.4f);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ob);
            c197039127h.setBackground(c384050F3z.LIZ(getContext()));
            c197039127h.setTextColorRes(R.attr.ee);
        }
    }

    public final void setRemainingTime(long j) {
        this.LLILLL = j;
    }

    public AbstractC212300186g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void E0(SinglePriceItem singlePriceItem, long j) {
        boolean z;
        String priceNumText;
        C212332187m c212332187m;
        C212332187m c212332187m2;
        C212332187m c212332187m3;
        C212332187m c212332187m4;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bidPriceVersion: ");
        sbLIZ.append(j);
        sbLIZ.append(", isPopup: ");
        sbLIZ.append(this.LLJI);
        C1720106oR.LJI("usbidprice", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILLJJLI.contains(Long.valueOf(j))) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("same price version stop, isPopup: ");
            sbLIZ2.append(this.LLJI);
            sbLIZ2.append(", already shown");
            C1720106oR.LJI("usbidprice", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        this.LLILLJJLI.add(Long.valueOf(j));
        if (singlePriceItem != null) {
            String str = singlePriceItem.salePriceFormat;
            String strCurrency = singlePriceItem.currency();
            if (singlePriceItem.symbolPosition == 1) {
                z = true;
            } else {
                z = false;
            }
            C212294186a c212294186a = new C212294186a(str, strCurrency, z);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("ispopup: ");
            sbLIZ3.append(this.LLJI);
            sbLIZ3.append(" setCurrentBidPrice: ");
            sbLIZ3.append(singlePriceItem.salePriceFormat);
            sbLIZ3.append(", behind price: ");
            C212295186b<ViewGroup> c212295186b = this.LLJJ;
            String priceNumText2 = null;
            if (c212295186b != null && (c212332187m4 = c212295186b.LJII) != null) {
                priceNumText = c212332187m4.getPriceNumText();
            } else {
                priceNumText = null;
            }
            sbLIZ3.append(priceNumText);
            C1720106oR.LJI("usbidprice", C2188811AlT.LIZIZ(sbLIZ3));
            C212295186b<ViewGroup> c212295186b2 = this.LLJILLL;
            if (c212295186b2 != null && (c212332187m2 = c212295186b2.LJII) != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("ispopup: ");
                sbLIZ4.append(this.LLJI);
                sbLIZ4.append(" oldPrice:");
                sbLIZ4.append(c212332187m2.getPriceNumText());
                sbLIZ4.append(", newprice:");
                sbLIZ4.append(singlePriceItem.salePriceFormat);
                sbLIZ4.append(", front y: ");
                sbLIZ4.append(c212332187m2.getY());
                C1720106oR.LJI("usbidprice", C2188811AlT.LIZIZ(sbLIZ4));
                if (Intrinsics.LJFF(c212332187m2.getPriceNumText(), singlePriceItem.salePriceFormat)) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("ispopup: ");
                    sbLIZ5.append(this.LLJI);
                    sbLIZ5.append(" same price, no need to flip up");
                    C1720106oR.LJI("usbidprice", C2188811AlT.LIZIZ(sbLIZ5));
                    return;
                }
                C212295186b<ViewGroup> c212295186b3 = this.LLJJ;
                if (c212295186b3 != null) {
                    c212295186b3.LJIIJJI(c212294186a);
                }
                C212295186b<ViewGroup> c212295186b4 = this.LLJJ;
                if (c212295186b4 != null && (c212332187m3 = c212295186b4.LJII) != null) {
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
                    AwS276S0300000_32 awS276S0300000_32 = new AwS276S0300000_32(c212332187m2, c212332187m3, this, 14);
                    AwS159S0400000_32 awS159S0400000_32 = new AwS159S0400000_32(this, c212294186a, c212332187m2, c212332187m3, 8);
                    AnimatorSet animatorSet = new AnimatorSet();
                    float f = iLIZIZ;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c212332187m2, "translationY", 0.0f, -f);
                    objectAnimatorOfFloat.setDuration(480L);
                    animatorSet.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(c212332187m3, "translationY", f, 0.0f));
                    animatorSet.addListener(new AAListenerS278S0200000_32(awS276S0300000_32, awS159S0400000_32, 3));
                    animatorSet.start();
                    return;
                }
                return;
            }
            C212295186b<ViewGroup> c212295186b5 = this.LLJILLL;
            if (c212295186b5 != null) {
                c212295186b5.LJIIJJI(c212294186a);
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("ispopup: ");
            sbLIZ6.append(this.LLJI);
            sbLIZ6.append(" update front price: ");
            C212295186b<ViewGroup> c212295186b6 = this.LLJILLL;
            if (c212295186b6 != null && (c212332187m = c212295186b6.LJII) != null) {
                priceNumText2 = c212332187m.getPriceNumText();
            }
            sbLIZ6.append(priceNumText2);
            C1720106oR.LJI("usbidprice", C2188811AlT.LIZIZ(sbLIZ6));
        }
    }

    public void j0(C181U c181u, Boolean bool) {
        if (c181u != null) {
            Integer numValueOf = Integer.valueOf(c181u.LJI);
            boolean z = true;
            if (numValueOf != null) {
                if (numValueOf.intValue() == 1) {
                    this.LLILLJJLI.clear();
                    this.LL.clear();
                    p0();
                    return;
                }
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 10) {
                        if (c181u.LJII == 16) {
                            z = false;
                        }
                        i0(z);
                        if (!Intrinsics.LJFF(bool, Boolean.TRUE)) {
                            return;
                        }
                        N0(c181u);
                        return;
                    }
                    if (numValueOf.intValue() == 20) {
                        int i = c181u.LJII;
                        if (i == 20) {
                            e0(false, true);
                            return;
                        }
                        if (i != 16) {
                            z = false;
                        }
                        e0(z, false);
                        return;
                    }
                }
            }
        }
        p0();
    }

    public void u0(UsPopupCardVO usPopupCardVO, boolean z) {
        String str;
        AuctionData auctionData = usPopupCardVO.auctionData;
        if (auctionData != null) {
            str = auctionData.customizeBidPricePrefix;
        } else {
            str = null;
        }
        this.LLJILJILJ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f A[PHI: r4
      0x005f: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:28:0x005c, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z0(X.C181U r17, java.lang.Boolean r18) {
        /*
            r16 = this;
            r7 = r16
            boolean r0 = r7.LLJI
            r6 = 0
            r2 = r17
            if (r0 != 0) goto L18
            if (r2 == 0) goto L63
            java.lang.Boolean r1 = r2.LJ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L63
            r7.setMaxbidStatus(r2)
        L18:
            r0 = r18
            r7.j0(r2, r0)
            X.186a r13 = new X.186a
            r5 = 0
            if (r2 == 0) goto L5b
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem r0 = r2.LIZJ
            if (r0 == 0) goto L5b
            java.lang.String r4 = r0.salePriceFormat
        L28:
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem r0 = r2.LIZJ
            if (r0 == 0) goto L5f
            java.lang.String r3 = r0.currency()
        L30:
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem r0 = r2.LIZJ
            if (r0 == 0) goto L3a
            int r1 = r0.symbolPosition
            r0 = 1
            if (r1 != r0) goto L3a
            r6 = 1
        L3a:
            r13.<init>(r4, r3, r6)
            if (r2 == 0) goto L58
            X.181d r8 = r2.LIZIZ
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionText> r9 = r7.LLJIJIL
            boolean r10 = r7.LLJI
            int r11 = r2.LJI
            int r12 = r2.LJII
            boolean r14 = r2.LJIIIZ
            webcast.data.oec_msg.CarouselCfg r15 = r2.LJIIJ
            r7.M0(r8, r9, r10, r11, r12, r13, r14, r15)
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem r5 = r2.LIZJ
            long r0 = r2.LIZ
        L54:
            r7.E0(r5, r0)
            return
        L58:
            r0 = 0
            goto L54
        L5b:
            r4 = r5
            if (r2 == 0) goto L5f
            goto L28
        L5f:
            r3 = r5
            if (r2 == 0) goto L3a
            goto L30
        L63:
            boolean r0 = r7.LLJ
            if (r0 == 0) goto L72
            r7.LLJ = r6
            kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r1 = r7.LLIZ
            if (r1 == 0) goto L72
            java.lang.String r0 = "bid"
            r1.invoke(r0)
        L72:
            r7.C0()
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC212300186g.z0(X.181U, java.lang.Boolean):void");
    }

    public AbstractC212300186g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new CopyOnWriteArrayList<>();
        this.LLILLJJLI = new CopyOnWriteArrayList<>();
        this.LLJ = true;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Integer num, Integer num2, Long l) {
        Animator animatorV;
        num.intValue();
        num2.intValue();
        long jLongValue = l.longValue();
        if (jLongValue <= 1000) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isPopup: ");
            sbLIZ.append(this.LLJI);
            sbLIZ.append(";count down end, remaining time: ");
            sbLIZ.append(jLongValue);
            C1720106oR.LIZ("UsBidCardView", C2188811AlT.LIZIZ(sbLIZ));
            AnonymousClass1875 anonymousClass1875 = this.LLJILJIL;
            if (anonymousClass1875 != null && (animatorV = anonymousClass1875.V()) != null && animatorV.isRunning()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("isPopup: ");
                sbLIZ2.append(this.LLJI);
                sbLIZ2.append(";count down end, but extend animator is running");
                C1720106oR.LIZ("UsBidCardView", C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                Function0<Unit> function0 = this.LLILZ;
                if (function0 != null) {
                    function0.invoke();
                }
                e0(true, false);
            }
        } else {
            O0(jLongValue, new AAListenerS36S0100100_32(jLongValue, this, 1));
        }
        return Unit.LIZ;
    }

    public final void F0(UsPopupCardVO usPopupCardVO, Function1<? super String, Unit> function1, boolean z, Function1<? super Boolean, Unit> function12, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        boolean z2;
        String str;
        Map<String, AuctionText> map;
        long jLongValue;
        C0NOH c0noh;
        Long l;
        String str2;
        BidPanel bidPanel;
        BidPanel bidPanel2;
        Map<String, String> map2;
        String str3;
        BidPanel bidPanel3;
        Map<String, String> map3;
        String string;
        if (z) {
            this.LLJI = true;
            L0();
        }
        C0NOH c0noh2 = this.LLILZLL;
        if (c0noh2 != null) {
            c0noh2.LIZJ();
        }
        this.LLILZ = function0;
        this.LLILZIL = function03;
        this.LLIZ = function1;
        this.LLIZLLLIL = function12;
        u0(usPopupCardVO, z);
        this.LLJILJIL = n0();
        setAtmosphere(usPopupCardVO);
        C0NOH c0noh3 = new C0NOH();
        this.LLILZLL = c0noh3;
        c0noh3.LIZ(this);
        s0();
        AuctionData auctionData = usPopupCardVO.auctionData;
        if (auctionData != null && auctionData.pincardDisplayDoubleBtns) {
            z2 = true;
        } else {
            z2 = false;
        }
        Long l2 = null;
        if (z2 && z) {
            C197039127h bidButton = getBidButton();
            if (bidButton != null) {
                AuctionData auctionData2 = usPopupCardVO.auctionData;
                if (auctionData2 != null && (bidPanel3 = auctionData2.bidPanel) != null && (map3 = bidPanel3.bidBtnTextMap) != null) {
                    Integer num = bidPanel3.bidBtnTextType;
                    if (num != null) {
                        string = num.toString();
                    } else {
                        string = null;
                    }
                    str3 = map3.get(string);
                } else {
                    str3 = null;
                }
                bidButton.setText(str3);
            }
        } else {
            C197039127h bidButton2 = getBidButton();
            if (bidButton2 != null) {
                AuctionData auctionData3 = usPopupCardVO.auctionData;
                if (auctionData3 != null) {
                    str = auctionData3.bidBtnText;
                } else {
                    str = null;
                }
                bidButton2.setText(str);
            }
        }
        AuctionData auctionData4 = usPopupCardVO.auctionData;
        if (auctionData4 != null && (bidPanel2 = auctionData4.bidPanel) != null && (map2 = bidPanel2.bidBtnTextMap) != null) {
            this.LLJJI = map2;
        }
        C197039127h customButton = getCustomButton();
        if (customButton != null) {
            AuctionData auctionData5 = usPopupCardVO.auctionData;
            if (auctionData5 != null && (bidPanel = auctionData5.bidPanel) != null) {
                str2 = bidPanel.customizeBidBtnText;
            } else {
                str2 = null;
            }
            customButton.setText(str2);
        }
        setCustomBtnStyle(getCustomButton());
        AuctionData auctionData6 = usPopupCardVO.auctionData;
        if (auctionData6 != null) {
            map = auctionData6.auctionStatusText;
        } else {
            map = null;
        }
        this.LLJIJIL = map;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("end time: ");
        AuctionData auctionData7 = usPopupCardVO.auctionData;
        if (auctionData7 != null) {
            l2 = auctionData7.endTime;
        }
        sbLIZ.append(l2);
        sbLIZ.append(", isPopup: ");
        sbLIZ.append(z);
        C1720106oR.LJI("usbidcardendtime", C2188811AlT.LIZIZ(sbLIZ));
        AuctionData auctionData8 = usPopupCardVO.auctionData;
        if (auctionData8 != null && (l = auctionData8.endTime) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C0NOI c0noiLIZ = C0NOL.LIZ(0L, jLongValue, usPopupCardVO.createTime, usPopupCardVO.serverTime);
        if (c0noiLIZ != null && (c0noh = this.LLILZLL) != null) {
            c0noh.LIZLLL(c0noiLIZ);
        }
        C0NOH c0noh4 = this.LLILZLL;
        if (c0noh4 != null && c0noh4.LIZIZ()) {
            C0NOH c0noh5 = this.LLILZLL;
            if (c0noh5 != null) {
                C0NOH.LJ(c0noh5);
            }
            if (function02 != null) {
                function02.invoke();
                return;
            }
            return;
        }
        l0();
        AuctionData auctionData9 = usPopupCardVO.auctionData;
        if (auctionData9 == null || auctionData9.auctionStatus != 10) {
            return;
        }
        e0(true, false);
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }
}
