package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionText;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.oec_msg.CarouselCfg;

/* JADX INFO: renamed from: X.186l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C212305186l extends C212302186i implements InterfaceC21143117ob {
    public final C197039127h LLLF;
    public final C197039127h LLLFF;
    public final C197039127h LLLFFI;
    public final FrameLayout LLLFZ;
    public final FrameLayout LLLI;
    public final FrameLayout LLLII;
    public AnonymousClass1871 LLLIIII;
    public Function1<? super Boolean, Unit> LLLIIIIL;
    public Integer LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;

    @Override // X.C212302186i
    public int P0() {
        return R.layout.bwt;
    }

    @Override // X.C212302186i, X.AbstractC212300186g
    public C197039127h getBidButton() {
        Integer num;
        return (this.LLLIIL || (num = this.LLLIIIL) == null || num.intValue() != 10) ? this.LLLFFI : this.LLLFF;
    }

    @Override // X.AbstractC212300186g
    public final void p0() {
        super.p0();
        setRedDisActiveBtn(getBidButton());
    }

    public final C197039127h getCustomBidBtn() {
        return this.LLLF;
    }

    @Override // X.C212302186i, X.AbstractC212300186g
    public C197039127h getCustomButton() {
        return this.LLLF;
    }

    public final C197039127h getDoubleBidBtn() {
        return this.LLLFF;
    }

    public final C197039127h getSingleBidBtn() {
        return this.LLLFFI;
    }

    public final FrameLayout getWinnerInfoWithPriceContainer() {
        return this.LLLFZ;
    }

    public final AnonymousClass1871 getWinnerInfoWithPriceController() {
        return this.LLLIIII;
    }

    @Override // X.InterfaceC21143117ob
    public final boolean LLJLLIL(Integer num) {
        return C212309186p.LIZJ(num);
    }

    @Override // X.InterfaceC21143117ob
    public void setCustomButtonAction(Function1<? super Boolean, Unit> function1) {
        this.LLLIIIIL = function1;
        C786410Ut5.I7(new C212317186x(this), this.LLLF);
    }

    @Override // X.C212302186i, X.AbstractC212300186g
    public void setMaxbidStatus(C181U c181u) {
        this.LLLIIL = true;
        super.setMaxbidStatus(c181u);
        C0H1U.LIZIZ(this.LLLF);
        C0H1U.LIZIZ(this.LLLFF);
        C0H1U.LIZIZ(this.LLLFFI);
    }

    public final void setWinnerInfoWithPriceController(AnonymousClass1871 anonymousClass1871) {
        this.LLLIIII = anonymousClass1871;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048 A[PHI: r1
      0x0048: PHI (r1v2 java.util.Map<java.lang.String, java.lang.String>) = (r1v1 java.util.Map<java.lang.String, java.lang.String>), (r1v5 java.util.Map<java.lang.String, java.lang.String>) binds: [B:22:0x0045, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C212302186i, X.AbstractC212300186g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u0(com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO r7, boolean r8) {
        /*
            r6 = this;
            super.u0(r7, r8)
            X.1871 r0 = r6.LLLIIII
            if (r0 != 0) goto L10
            X.1871 r1 = new X.1871
            android.widget.FrameLayout r0 = r6.LLLFZ
            r1.<init>(r0)
            r6.LLLIIII = r1
        L10:
            android.widget.FrameLayout r0 = r6.LLLI
            X.C0H1U.LIZIZ(r0)
            android.widget.FrameLayout r0 = r6.LLLII
            X.C0H1U.LIZIZ(r0)
            X.127h r1 = r6.LLLF
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData r0 = r7.auctionData
            r5 = 0
            if (r0 == 0) goto L4c
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.BidPanel r0 = r0.bidPanel
            if (r0 == 0) goto L4c
            java.lang.String r0 = r0.customizeBidBtnText
        L27:
            r1.setText(r0)
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData r4 = r7.auctionData
            X.127h r3 = r6.LLLFF
            X.127h r2 = r6.LLLFFI
            if (r4 == 0) goto L44
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.BidPanel r0 = r4.bidPanel
            if (r0 == 0) goto L44
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.bidBtnTextMap
        L38:
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.BidPanel r0 = r4.bidPanel
            if (r0 == 0) goto L48
            java.lang.Integer r0 = r0.bidBtnTextType
        L3e:
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem r5 = r4.nextBidPrice
        L40:
            X.C212309186p.LIZLLL(r3, r2, r1, r0, r5)
            return
        L44:
            r1 = r5
            if (r4 == 0) goto L48
            goto L38
        L48:
            r0 = r5
            if (r4 == 0) goto L40
            goto L3e
        L4c:
            r0 = r5
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212305186l.u0(com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO, boolean):void");
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
        this.LLLIIIL = numValueOf;
        if (c181u != null) {
            zLJFF = Intrinsics.LJFF(c181u.LJ, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        this.LLLIIL = zLJFF;
        super.z0(c181u, bool);
        if (this.LLLIIL) {
            C0H1U.LIZIZ(this.LLLF);
            C0H1U.LIZIZ(this.LLLFF);
            return;
        }
        C197039127h c197039127h = this.LLLFF;
        C197039127h c197039127h2 = this.LLLFFI;
        Map<String, String> bidBtnTextMap = getBidBtnTextMap();
        if (c181u != null) {
            numValueOf2 = Integer.valueOf(c181u.LJIIIIZZ);
            singlePriceItem = c181u.LIZLLL;
        } else {
            numValueOf2 = null;
            singlePriceItem = null;
        }
        C212309186p.LIZLLL(c197039127h, c197039127h2, bidBtnTextMap, numValueOf2, singlePriceItem);
        if (this.LLJI) {
            C0H1U.LIZIZ(this.LLLFFI);
            C0H1U.LIZIZ(this.LLLFF);
            C0H1U.LIZIZ(this.LLLF);
            return;
        }
        if (c181u != null) {
            numValueOf3 = Integer.valueOf(c181u.LJI);
        } else {
            numValueOf3 = null;
        }
        C212309186p.LIZIZ(this, numValueOf3, this.LLLFFI, this.LLLF, this.LLLFF);
        if (c181u != null) {
            numValueOf4 = Integer.valueOf(c181u.LJI);
        }
        if (C212309186p.LIZJ(numValueOf4)) {
            if (!this.LLLIILIL) {
                return;
            }
            this.LLLIILIL = false;
            Function1<String, Unit> buttonShowCallback = getButtonShowCallback();
            if (buttonShowCallback == null) {
                return;
            }
            buttonShowCallback.invoke("custom");
            return;
        }
        p0();
    }

    public C212305186l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C197039127h c197039127h = (C197039127h) findViewById(R.id.gkg);
        this.LLLF = c197039127h;
        this.LLLFF = (C197039127h) findViewById(R.id.gkh);
        this.LLLFFI = (C197039127h) findViewById(R.id.gkl);
        this.LLLFZ = (FrameLayout) findViewById(R.id.gn7);
        this.LLLI = (FrameLayout) findViewById(R.id.b_s);
        this.LLLII = (FrameLayout) findViewById(R.id.gmb);
        this.LLLIILIL = true;
        C786410Ut5.I7(new C212317186x(this), c197039127h);
    }

    @Override // X.C212302186i, X.AbstractC212300186g
    public void M0(C212167181d c212167181d, Map<String, AuctionText> map, boolean z, int i, int i2, C212294186a c212294186a, boolean z2, CarouselCfg carouselCfg) {
        String str;
        String str2;
        Boolean bool;
        if (this.LLLIIII == null) {
            this.LLLIIII = new AnonymousClass1871(this.LLLFZ);
        }
        Long l = null;
        if (c212167181d != null) {
            l = c212167181d.LIZ;
            str = c212167181d.LIZIZ;
            str2 = c212167181d.LIZJ;
            bool = c212167181d.LIZLLL;
        } else {
            str = null;
            str2 = null;
            bool = null;
        }
        AnonymousClass1872 anonymousClass1872 = new AnonymousClass1872(l, str, str2, bool, map, false, i, i2, false, c212294186a, z2, carouselCfg, 1280);
        AnonymousClass1871 anonymousClass1871 = this.LLLIIII;
        if (anonymousClass1871 != null) {
            anonymousClass1871.LJIILIIL(anonymousClass1872);
        }
        C212309186p.LIZ(this.LLLIIII);
    }
}
