package X;

import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Card;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShopPromotionData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS20S0300000_1;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0vg9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1751470vg9 extends AbstractC1751430vg5 {
    public final SeaPdpViewModel LL;
    public boolean LLILLJJLI;
    public final C994990c01 LLILLL;
    public final float LLILZ;

    public final void L5(PDPShopPromotionData pDPShopPromotionData) {
        boolean z;
        String strConcat;
        boolean z2;
        String string;
        boolean z3;
        Voucher voucher = pDPShopPromotionData.voucher;
        if (voucher == null) {
            return;
        }
        C1751490vgB couponItemView = this.LLILLL.getCouponItemView();
        Integer costType = voucher.getCostType();
        if (costType != null && costType.intValue() == 2) {
            String voucherID = voucher.getVoucherID();
            if (voucherID != null && C123100dR.LIZ(voucherID)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                c384050F3z.LJFF = Integer.valueOf(R.attr.g2);
                c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                couponItemView.setButtonBackgroundDrawable(c384050F3z.LIZ(couponItemView.getContext()));
                couponItemView.setButtonTextColorRes(R.attr.g4);
                couponItemView.setButtonAlpha(1.0f);
            } else if (this.LL.LLLLLLZ) {
                couponItemView.setButtonBackgroundDrawable(new C384050F3z().LIZ(couponItemView.getContext()));
                couponItemView.setButtonTextColorRes(R.attr.g2);
                couponItemView.setButtonAlpha(0.5f);
            } else {
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.g2);
                c384050F3z2.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                couponItemView.setButtonBackgroundDrawable(c384050F3z2.LIZ(couponItemView.getContext()));
                couponItemView.setButtonTextColorRes(R.attr.a0p);
                couponItemView.setButtonAlpha(1.0f);
            }
            C958103op.LIZ.getClass();
            couponItemView.setBackground(new C1751480vgA(Integer.valueOf(R.attr.g0), Integer.valueOf(R.attr.g1), C958103op.LJIIIZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), Integer.valueOf(R.attr.g1)));
            couponItemView.setDiscountTextColor(R.attr.g4);
            C384050F3z c384050F3z3 = new C384050F3z();
            c384050F3z3.LIZIZ = Integer.valueOf(R.attr.g2);
            c384050F3z3.LJIIJJI = Float.valueOf(this.LLILZ);
            c384050F3z3.LJIIIIZZ = Float.valueOf(this.LLILZ);
            couponItemView.setCouponNumberBackgroundDrawable(c384050F3z3.LIZ(couponItemView.getContext()));
        } else {
            String voucherID2 = voucher.getVoucherID();
            if (voucherID2 != null && C123100dR.LIZ(voucherID2)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C384050F3z c384050F3z4 = new C384050F3z();
                c384050F3z4.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                c384050F3z4.LJFF = Integer.valueOf(R.attr.a1q);
                c384050F3z4.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                couponItemView.setButtonBackgroundDrawable(c384050F3z4.LIZ(couponItemView.getContext()));
                couponItemView.setButtonTextColorRes(R.attr.a1q);
                couponItemView.setButtonAlpha(1.0f);
            } else if (this.LL.LLLLLLZ) {
                couponItemView.setButtonBackgroundDrawable(new C384050F3z().LIZ(couponItemView.getContext()));
                couponItemView.setButtonTextColorRes(R.attr.a1q);
                couponItemView.setButtonAlpha(0.5f);
            } else {
                C384050F3z c384050F3z5 = new C384050F3z();
                c384050F3z5.LIZIZ = Integer.valueOf(R.attr.a04);
                c384050F3z5.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                couponItemView.setButtonBackgroundDrawable(c384050F3z5.LIZ(couponItemView.getContext()));
                couponItemView.setButtonTextColorRes(R.attr.a0p);
                couponItemView.setButtonAlpha(1.0f);
            }
            C958103op.LIZ.getClass();
            couponItemView.setBackground(new C1751480vgA(Integer.valueOf(R.attr.gl), Integer.valueOf(R.attr.gm), C958103op.LJIIIZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), Integer.valueOf(R.attr.gm)));
            couponItemView.setDiscountTextColor(R.attr.a1r);
            C384050F3z c384050F3z6 = new C384050F3z();
            c384050F3z6.LIZIZ = Integer.valueOf(R.attr.a04);
            c384050F3z6.LJIIJJI = Float.valueOf(this.LLILZ);
            c384050F3z6.LJIIIIZZ = Float.valueOf(this.LLILZ);
            couponItemView.setCouponNumberBackgroundDrawable(c384050F3z6.LIZ(couponItemView.getContext()));
        }
        Integer voucherCount = voucher.getVoucherCount();
        String str = "";
        if (voucherCount == null || (string = voucherCount.toString()) == null || (strConcat = "x".concat(string)) == null) {
            strConcat = "";
        }
        couponItemView.setCouponNumberText(strConcat);
        couponItemView.setDiscountText(voucher.getDiscountText());
        String thresholdText = voucher.getThresholdText();
        if (thresholdText != null && thresholdText.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        couponItemView.setThresholdVisible(z2);
        couponItemView.setThresholdText(voucher.getThresholdText());
        String voucherID3 = voucher.getVoucherID();
        if ((voucherID3 != null && C123100dR.LIZ(voucherID3)) || !this.LL.LLLLLLZ || !C123100dR.LIZ(pDPShopPromotionData.voucherButtonNextStage)) {
            String buttonText = voucher.getButtonText();
            if (buttonText != null) {
                str = buttonText;
            }
        } else {
            str = pDPShopPromotionData.voucherButtonNextStage;
        }
        couponItemView.setButtonText(str);
        couponItemView.LLJJJJLIIL = true;
        C786410Ut5.LJLLLLLL(0, couponItemView.getDividerLineFromXml());
        GradientDrawable gradientDrawable = new GradientDrawable();
        C1751480vgA c1751480vgA = couponItemView.LLJJL;
        if (c1751480vgA != null) {
            Integer num = c1751480vgA.LJII;
            if (num != null) {
                gradientDrawable.setColor(C960203pA.LIZ(num.intValue(), couponItemView.getContext()));
            } else {
                gradientDrawable.setColor(c1751480vgA.LJI);
            }
        }
        C1751480vgA c1751480vgA2 = couponItemView.LLJJL;
        if (c1751480vgA2 != null) {
            Integer num2 = c1751480vgA2.LJII;
            if (num2 != null) {
                gradientDrawable.setStroke(c1751480vgA2.LJIIIZ, C960203pA.LIZ(num2.intValue(), couponItemView.getContext()), c1751480vgA2.LJIIJ, c1751480vgA2.LJIIIIZZ);
            } else {
                gradientDrawable.setStroke(c1751480vgA2.LJIIIZ, c1751480vgA2.LJI, c1751480vgA2.LJIIJ, c1751480vgA2.LJIIIIZZ);
            }
        }
        gradientDrawable.setShape(2);
        couponItemView.getDividerLineFromXml().setBackground(gradientDrawable);
        Float fValueOf = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        Float fValueOf2 = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        if (fValueOf != null) {
            couponItemView.LLJJJ = fValueOf.floatValue();
        }
        if (fValueOf2 != null) {
            couponItemView.LLJJJIL = fValueOf2.floatValue();
        }
    }

    public C1751470vg9(ViewGroup viewGroup, SeaPdpViewModel seaPdpViewModel) {
        super(new C994990c01(viewGroup.getContext()));
        this.LL = seaPdpViewModel;
        this.LLILLL = (C994990c01) this.itemView;
        this.LLILZ = C418440Gaw.LIZIZ(Double.valueOf(6.67d));
    }

    @Override // X.AbstractC1751430vg5
    public final void I5(Feed feed, int i) {
        PDPShopPromotionData pDPShopPromotionData;
        Voucher voucher;
        Card card = feed.card;
        if (card == null || (pDPShopPromotionData = card.pdpShopPromotionData) == null || (voucher = pDPShopPromotionData.voucher) == null) {
            return;
        }
        L5(pDPShopPromotionData);
        C786410Ut5.I7(new AjS20S0300000_1(this, pDPShopPromotionData, voucher, 52), this.LLILLL.getCouponItemView());
        if (!this.LLILLJJLI) {
            this.LLILLJJLI = true;
            if (this.LL.LLJLIL != null) {
                new AwS570S0100000_26(this, 1634).invoke();
            }
            C1054104Ah c1054104Ah = this.LL.LLJLIL;
            if (c1054104Ah != null) {
                new C1055904Az(1, voucher, c1054104Ah, "1", "pdp_shop_view_more").invoke();
            }
        }
    }
}
