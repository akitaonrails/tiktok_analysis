package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionText;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.SurpriseSetData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.oec_msg.CarouselCfg;

/* JADX INFO: renamed from: X.186k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212304186k extends C212301186h implements InterfaceC21143117ob {
    public final C197039127h LLLFF;
    public final C197039127h LLLFFI;
    public final C197039127h LLLFZ;
    public final C212307186n LLLI;
    public C212315186v LLLII;
    public Function1<? super Boolean, Unit> LLLIIII;
    public Integer LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;

    @Override // X.C212301186h
    public final int T0() {
        return R.layout.bxq;
    }

    @Override // X.C212301186h, X.AbstractC212300186g
    public C197039127h getBidButton() {
        Integer num;
        return (this.LLLIIIL || (num = this.LLLIIIIL) == null || num.intValue() != 10) ? this.LLLFZ : this.LLLFFI;
    }

    @Override // X.AbstractC212300186g
    public final void p0() {
        super.p0();
        setRedDisActiveBtn(getBidButton());
    }

    @Override // X.C212301186h, X.AbstractC212300186g
    public C197039127h getCustomButton() {
        return this.LLLFF;
    }

    private final void setDblLineProgBar(UsPopupCardVO usPopupCardVO) {
        C212315186v c212315186v;
        Long l;
        String str;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.wqd);
        if (this.LLLII == null) {
            C212315186v c212315186v2 = new C212315186v(frameLayout);
            this.LLLII = c212315186v2;
            C427980GqK c427980GqK = new C427980GqK(R.attr.a1k, 71);
            C427990GqL c427990GqL = c212315186v2.LJFF;
            if (c427990GqL != null) {
                c427990GqL.setStyle(c427980GqK);
            }
        }
        AuctionData auctionData = usPopupCardVO.auctionData;
        if (auctionData != null && (c212315186v = this.LLLII) != null) {
            C12ES.LJIILL(0, c212315186v.LIZ);
            C786410Ut5.LJJJJIZL((FrameLayout) c212315186v.LIZ);
            C427990GqL c427990GqL2 = new C427990GqL(c212315186v.LJ, c212315186v.LIZLLL);
            SurpriseSetData surpriseSetData = auctionData.surpriseSetData;
            Long l2 = null;
            if (surpriseSetData != null) {
                l2 = surpriseSetData.remainingStock;
                l = surpriseSetData.totalStock;
            } else {
                l = null;
            }
            float fLIZLLL = -1.0f;
            if (l2 != null && l != null) {
                if (surpriseSetData == null || (str = surpriseSetData.playName) == null) {
                    str = "";
                }
                c427990GqL2.LLILZIL = str;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(l2);
                sbLIZ.append('/');
                sbLIZ.append(l);
                c427990GqL2.LLILZLL = C2188811AlT.LIZIZ(sbLIZ);
                c427990GqL2.LL.setText(c427990GqL2.LLILZIL);
                c427990GqL2.LLILLJJLI.setText(c427990GqL2.LLILZLL);
                if (l.longValue() <= 0) {
                    C03DZ.LIZ(c427990GqL2.LLILLL);
                } else {
                    try {
                        C12ES.LJIILL(0, c427990GqL2.LLILLL);
                        fLIZLLL = C13LZ.LIZLLL(l2.longValue() / l.longValue(), 0.0f, 1.0f);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C03DZ.LIZ(c427990GqL2.LLILLL);
                    }
                }
                c427990GqL2.LLIZ = fLIZLLL;
                c427990GqL2.requestLayout();
            } else {
                c427990GqL2.LLIZ = -1.0f;
                c427990GqL2.requestLayout();
            }
            c212315186v.LJFF = c427990GqL2;
            ((ViewGroup) c212315186v.LIZ).addView(c427990GqL2);
        }
    }

    @Override // X.InterfaceC21143117ob
    public final boolean LLJLLIL(Integer num) {
        return C212309186p.LIZJ(num);
    }

    @Override // X.InterfaceC21143117ob
    public void setCustomButtonAction(Function1<? super Boolean, Unit> function1) {
        this.LLLIIII = function1;
        C786410Ut5.I7(new C212318186y(this), this.LLLFF);
    }

    @Override // X.C212301186h, X.AbstractC212300186g
    public void setMaxbidStatus(C181U c181u) {
        this.LLLIIIL = true;
        super.setMaxbidStatus(c181u);
        C0H1U.LIZIZ(this.LLLFF);
        C0H1U.LIZIZ(this.LLLFFI);
        C0H1U.LIZIZ(this.LLLFZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0085 A[PHI: r1
      0x0085: PHI (r1v4 java.util.Map<java.lang.String, java.lang.String>) = (r1v3 java.util.Map<java.lang.String, java.lang.String>), (r1v7 java.util.Map<java.lang.String, java.lang.String>) binds: [B:49:0x0082, B:43:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0091 A[PHI: r1
      0x0091: PHI (r1v10 java.lang.String) = (r1v9 java.lang.String), (r1v12 java.lang.String), (r1v12 java.lang.String) binds: [B:57:0x008e, B:24:0x0034, B:26:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C212301186h, X.AbstractC212300186g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u0(com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO r7, boolean r8) {
        /*
            r6 = this;
            r0 = 0
            super.u0(r7, r0)
            X.186n r1 = r6.LLLI
            r5 = 0
            if (r1 == 0) goto L1e
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData r0 = r7.auctionData
            if (r0 == 0) goto L93
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.SurpriseSetData r0 = r0.surpriseSetData
            if (r0 == 0) goto L93
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionLabel r0 = r0.auctionLabel
            if (r0 == 0) goto L93
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.Color r0 = r0.color
            if (r0 == 0) goto L93
            java.lang.String r0 = r0.value
        L1b:
            r1.LJIIL(r0)
        L1e:
            X.186n r4 = r6.LLLI
            if (r4 == 0) goto L42
            X.1877 r3 = new X.1877
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData r2 = r7.auctionData
            if (r2 == 0) goto L8d
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.SurpriseSetData r0 = r2.surpriseSetData
            if (r0 == 0) goto L8d
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionLabel r0 = r0.auctionLabel
            if (r0 == 0) goto L8d
            java.lang.String r1 = r0.defaultText
        L32:
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.SurpriseSetData r0 = r2.surpriseSetData
            if (r0 == 0) goto L91
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage r0 = r0.auctionIconLight
            if (r0 == 0) goto L91
            java.lang.String r0 = r0.url
        L3c:
            r3.<init>(r1, r0)
            r4.LJIILIIL(r3)
        L42:
            X.186n r0 = r6.LLLI
            if (r0 == 0) goto L8b
            X.0hm9 r0 = r0.LJIIJJI
        L48:
            r6.setExtendedAddTimeHelper(r0)
            kotlin.jvm.internal.AwS646S0100000_32 r1 = new kotlin.jvm.internal.AwS646S0100000_32
            r0 = 23
            r1.<init>(r6, r0)
            r6.setCountDownUpdateCallback(r1)
            X.127h r1 = r6.LLLFF
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData r0 = r7.auctionData
            if (r0 == 0) goto L89
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.BidPanel r0 = r0.bidPanel
            if (r0 == 0) goto L89
            java.lang.String r0 = r0.customizeBidBtnText
        L61:
            r1.setText(r0)
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData r4 = r7.auctionData
            X.127h r3 = r6.LLLFFI
            X.127h r2 = r6.LLLFZ
            if (r4 == 0) goto L81
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.BidPanel r0 = r4.bidPanel
            if (r0 == 0) goto L81
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.bidBtnTextMap
        L72:
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.BidPanel r0 = r4.bidPanel
            if (r0 == 0) goto L85
            java.lang.Integer r0 = r0.bidBtnTextType
        L78:
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem r5 = r4.nextBidPrice
        L7a:
            X.C212309186p.LIZLLL(r3, r2, r1, r0, r5)
            r6.setDblLineProgBar(r7)
            return
        L81:
            r1 = r5
            if (r4 == 0) goto L85
            goto L72
        L85:
            r0 = r5
            if (r4 == 0) goto L7a
            goto L78
        L89:
            r0 = r5
            goto L61
        L8b:
            r0 = r5
            goto L48
        L8d:
            r1 = r5
            if (r2 == 0) goto L91
            goto L32
        L91:
            r0 = r5
            goto L3c
        L93:
            r0 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212304186k.u0(com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO, boolean):void");
    }

    @Override // X.AbstractC212300186g
    public final void z0(C181U c181u, Boolean bool) {
        Integer numValueOf;
        boolean zLJFF;
        Integer numValueOf2;
        SinglePriceItem singlePriceItem;
        Integer numValueOf3;
        Integer numValueOf4 = null;
        if (c181u != null) {
            numValueOf = Integer.valueOf(c181u.LJI);
        } else {
            numValueOf = null;
        }
        this.LLLIIIIL = numValueOf;
        if (c181u != null) {
            zLJFF = Intrinsics.LJFF(c181u.LJ, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        this.LLLIIIL = zLJFF;
        super.z0(c181u, bool);
        if (this.LLLIIIL) {
            C0H1U.LIZIZ(this.LLLFF);
            C0H1U.LIZIZ(this.LLLFFI);
            return;
        }
        C197039127h c197039127h = this.LLLFFI;
        C197039127h c197039127h2 = this.LLLFZ;
        Map<String, String> bidBtnTextMap = getBidBtnTextMap();
        if (c181u != null) {
            numValueOf2 = Integer.valueOf(c181u.LJIIIIZZ);
            singlePriceItem = c181u.LIZLLL;
        } else {
            numValueOf2 = null;
            singlePriceItem = null;
        }
        C212309186p.LIZLLL(c197039127h, c197039127h2, bidBtnTextMap, numValueOf2, singlePriceItem);
        if (c181u != null) {
            numValueOf3 = Integer.valueOf(c181u.LJI);
        } else {
            numValueOf3 = null;
        }
        C212309186p.LIZIZ(this, numValueOf3, this.LLLFZ, this.LLLFF, this.LLLFFI);
        if (c181u != null) {
            numValueOf4 = Integer.valueOf(c181u.LJI);
        }
        if (C212309186p.LIZJ(numValueOf4)) {
            if (!this.LLLIIL) {
                return;
            }
            this.LLLIIL = false;
            Function1<String, Unit> buttonShowCallback = getButtonShowCallback();
            if (buttonShowCallback == null) {
                return;
            }
            buttonShowCallback.invoke("custom");
            return;
        }
        p0();
    }

    public C212304186k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C197039127h c197039127h = (C197039127h) findViewById(R.id.gkg);
        this.LLLFF = c197039127h;
        this.LLLFFI = (C197039127h) findViewById(R.id.gkh);
        this.LLLFZ = (C197039127h) findViewById(R.id.gkl);
        this.LLLIIL = true;
        C786410Ut5.I7(new C212318186y(this), c197039127h);
        this.LLLI = new C212307186n((ViewGroup) findViewById(R.id.yb5));
    }

    @Override // X.C212301186h, X.AbstractC212300186g
    public final void M0(C212167181d c212167181d, Map<String, AuctionText> map, boolean z, int i, int i2, C212294186a c212294186a, boolean z2, CarouselCfg carouselCfg) {
        super.M0(c212167181d, map, z, i, i2, c212294186a, z2, carouselCfg);
        C212309186p.LIZ(getWinnerInfoWithPriceController());
    }
}
