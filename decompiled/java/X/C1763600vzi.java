package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BannerCountdown;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CountdownUiTypeConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistStyle;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0vzi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1763600vzi extends C1763620vzk {
    public static final int LLJLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public static final int LLJLLL;
    public static final int LLJZ;
    public static final int LLJZIJLIL;
    public static final int LLL;
    public static final int LLLF;
    public static final int LLLFF;
    public static final int LLLFFI;
    public static final int LLLFZ;
    public final TuxTextView LLJJIJIL;
    public final TuxTextView LLJJJ;
    public final TuxTextView LLJJJIL;
    public final SmartImageView LLJJJJ;
    public final C429650Gt1 LLJJJJJIL;
    public final C19MW LLJJJJLIIL;
    public Integer LLJJL;
    public BannerCountdown LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public CountdownUiTypeConfig LLJLIL;
    public Integer LLJLILLLLZIIL;
    public EnumC1762940vye LLJLL;

    static {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        LLJLLL = iLIZIZ;
        LLJZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        LLJZIJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)) + (iLIZIZ * 2);
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        LLL = iLIZIZ2;
        LLLF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(83)) + iLIZIZ2;
        LLLFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)) + iLIZIZ2;
        LLLFFI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)) + iLIZIZ2;
        LLLFZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    }

    private final int getPriceHeadWidth() {
        return h0(false);
    }

    private final int getPromotionLabelViewWidth() {
        if (this.LLJJIJIL.getVisibility() != 0) {
            return 0;
        }
        return C1763620vzk.i0(this.LLJJIJIL) + ((int) C0H1U.LIZLLL(this.LLJJIJIL));
    }

    private final int getPromotionWaistHeadTextViewWidth() {
        if (this.LLJJJ.getVisibility() != 0) {
            return 0;
        }
        this.LLJJJ.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
        int measuredWidth = this.LLJJJ.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = this.LLJJJ.getLayoutParams();
        int marginStart = measuredWidth + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
        ViewGroup.LayoutParams layoutParams2 = this.LLJJJ.getLayoutParams();
        return (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0) + marginStart;
    }

    private final int getPromotionWaistTailCountdownViewWidth() {
        if (this.LLJJJJJIL.getVisibility() != 0) {
            return 0;
        }
        return C1763620vzk.i0(this.LLJJJJJIL) + ((int) C0H1U.LIZLLL(this.LLJJJJJIL));
    }

    private final int getPromotionWaistTailSuffixIconViewWidth() {
        if (this.LLJJJJ.getVisibility() == 0) {
            return this.LLJJJJ.getLayoutParams().width;
        }
        return 0;
    }

    private final int getPromotionWaistTailTextViewWidth() {
        if (this.LLJJJIL.getVisibility() != 0) {
            return 0;
        }
        return C1763620vzk.i0(this.LLJJJIL) + ((int) C0H1U.LIZLLL(this.LLJJJIL));
    }

    private final C1763650vzn getWaistDefaultPriceStyle() {
        Integer numValueOf = Integer.valueOf(R.attr.gp);
        Integer numValueOf2 = Integer.valueOf(R.attr.a0o);
        return new C1763650vzn(numValueOf, numValueOf2, numValueOf2, numValueOf2, numValueOf2, numValueOf2, Integer.valueOf(R.attr.a0w));
    }

    public final boolean C0() {
        return this.LLJJJ.getVisibility() == 0 && this.LLJJJIL.getVisibility() == 8 && this.LLJJJJJIL.getVisibility() == 8;
    }

    public final boolean E0() {
        if (this.LLJJJ.getVisibility() == 8) {
            return this.LLJJJIL.getVisibility() == 0 || this.LLJJJJJIL.getVisibility() == 0;
        }
        return false;
    }

    public final void I0() {
        int i;
        if (this.LLJJJ.getVisibility() == 8) {
            return;
        }
        int promotionWaistHeadTextViewWidth = getPromotionWaistHeadTextViewWidth();
        int iMax = C0() ? Math.max(getPriceHeadWidth(), getPriceTailWidth()) : getPriceHeadWidth();
        if (iMax + promotionWaistHeadTextViewWidth <= getWidth() || promotionWaistHeadTextViewWidth <= (i = LLLF)) {
            i = Integer.MAX_VALUE;
        } else {
            int width = getWidth() - iMax;
            if (width >= i) {
                i = width;
            }
        }
        if (this.LLJJJ.getMaxWidth() != i) {
            this.LLJJJ.setMaxWidth(i);
        }
    }

    public final void M0() {
        if (this.LLJJJIL.getVisibility() == 8) {
            return;
        }
        int promotionWaistTailTextViewWidth = getPromotionWaistTailTextViewWidth();
        int iMax = (E0() ? Math.max(getPriceTailWidth(), getPriceHeadWidth()) : getPriceTailWidth()) + getPromotionWaistTailCountdownViewWidth();
        int promotionWaistTailSuffixIconViewWidth = getPromotionWaistTailSuffixIconViewWidth();
        int i = LLLFFI - promotionWaistTailSuffixIconViewWidth;
        if (iMax + promotionWaistTailTextViewWidth > getWidth()) {
            int i2 = promotionWaistTailTextViewWidth + promotionWaistTailSuffixIconViewWidth;
            int i3 = LLLFF;
            if (i2 > i3) {
                int width = (getWidth() - iMax) - promotionWaistTailSuffixIconViewWidth;
                if (width <= i) {
                    i = width;
                }
                int i4 = i3 - promotionWaistTailSuffixIconViewWidth;
                if (i < i4) {
                    i = i4;
                }
            }
        }
        if (this.LLJJJIL.getMaxWidth() != i) {
            this.LLJJJIL.setMaxWidth(i);
        }
    }

    private final int getPriceTailWidth() {
        return getSecondLineTotalWidthWhenWrapLine() + getPromotionLabelViewWidth();
    }

    public final void F0(WaistStyle waistStyle, boolean z) {
        Integer numLIZ;
        Integer numLIZ2;
        Integer numLIZ3;
        Integer numLIZ4;
        Integer numLIZ5;
        int iIntValue;
        Integer numLIZ6;
        Integer numLIZ7;
        if (waistStyle == null) {
            z0(getWaistDefaultPriceStyle());
            this.LLJJIJIL.setTextColorRes(R.attr.gp);
            TuxTextView tuxTextView = this.LLJJIJIL;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a0o);
            tuxTextView.setBackground(c384050F3z.LIZ(getContext()));
            return;
        }
        CustomColor customColor = waistStyle.discountTextColor;
        if (customColor != null) {
            numLIZ = C038L.LIZ(customColor, getContext(), null);
        } else {
            numLIZ = null;
        }
        CustomColor customColor2 = waistStyle.discountBgColor;
        if (customColor2 != null) {
            numLIZ2 = C038L.LIZ(customColor2, getContext(), null);
        } else {
            numLIZ2 = null;
        }
        CustomColor customColor3 = waistStyle.realPriceColor;
        if (customColor3 != null) {
            numLIZ3 = C038L.LIZ(customColor3, getContext(), null);
        } else {
            numLIZ3 = null;
        }
        CustomColor customColor4 = waistStyle.couponIconColor;
        if (customColor4 != null) {
            numLIZ4 = C038L.LIZ(customColor4, getContext(), null);
        } else {
            numLIZ4 = null;
        }
        CustomColor customColor5 = waistStyle.originalPriceColor;
        if (customColor5 != null) {
            numLIZ5 = C038L.LIZ(customColor5, getContext(), null);
        } else {
            numLIZ5 = null;
        }
        if (z) {
            iIntValue = ((Number) C074A.LIZ.getValue()).intValue();
        } else {
            iIntValue = 0;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (numLIZ != null) {
            this.LL.setTextColor(numLIZ.intValue());
        }
        if (numLIZ2 != null) {
            int iIntValue2 = numLIZ2.intValue();
            TuxTextView tuxTextView2 = this.LL;
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZJ = Float.valueOf(C1763620vzk.LLJJIJI);
            c384050F3z2.LIZ = Integer.valueOf(iIntValue2);
            tuxTextView2.setBackground(c384050F3z2.LIZ(getContext()));
        }
        if (numLIZ3 != null) {
            int iIntValue3 = numLIZ3.intValue();
            this.LLILLJJLI.setTextColor(iIntValue3);
            this.LLILLL.setTextColor(iIntValue3);
            this.LLILZLL.setTextColor(iIntValue3);
            this.LLILZ.setTextColor(iIntValue3);
            this.LLILZIL.setTextColor(iIntValue3);
        }
        if (numLIZ4 != null) {
            this.LLIZ.setImageTintList(ColorStateList.valueOf(numLIZ4.intValue()));
        }
        if (numLIZ5 != null) {
            this.LLIZLLLIL.setTextColor(numLIZ5.intValue());
        }
        if (numValueOf != null) {
            int iIntValue4 = numValueOf.intValue();
            TuxTextView tuxTextView3 = this.LLILZ;
            if (iIntValue4 > 0) {
                tuxTextView3.setTuxFont(C7736030k.LIZJ(Integer.valueOf(iIntValue4), null));
            } else {
                tuxTextView3.setTuxFont(12);
            }
        }
        CustomColor customColor6 = waistStyle.promotionLabelTextColor;
        if (customColor6 != null && (numLIZ7 = C038L.LIZ(customColor6, getContext(), null)) != null) {
            this.LLJJIJIL.setTextColor(numLIZ7.intValue());
        }
        CustomColor customColor7 = waistStyle.promotionLabelBgColor;
        if (customColor7 == null || (numLIZ6 = C038L.LIZ(customColor7, getContext(), null)) == null) {
            return;
        }
        int iIntValue5 = numLIZ6.intValue();
        TuxTextView tuxTextView4 = this.LLJJIJIL;
        C384050F3z c384050F3z3 = new C384050F3z();
        c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        c384050F3z3.LIZ = Integer.valueOf(iIntValue5);
        tuxTextView4.setBackground(c384050F3z3.LIZ(getContext()));
    }

    public C1763600vzi(Context context, AttributeSet attributeSet, int i) {
        Float fValueOf;
        super(context, attributeSet, i);
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView.setId(ViewGroup.generateViewId());
        C786410Ut5.R6(tuxTextView, new C19ME(-2, -2));
        tuxTextView.setMinWidth(LLJZIJLIL);
        int i2 = LLJLLL;
        Integer numValueOf = Integer.valueOf(i2);
        int i3 = LLJZ;
        C426750GoL.LJIIL(tuxTextView, numValueOf, Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(i3), 16);
        tuxTextView.setGravity(16);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setTuxFont(92);
        tuxTextView.setTextColorRes(R.attr.gp);
        C384050F3z c384050F3z = new C384050F3z();
        if (C0BA6.LIZ()) {
            fValueOf = Float.valueOf(C418440Gaw.LIZIZ(6));
        } else {
            fValueOf = Float.valueOf(C418440Gaw.LIZIZ(4));
        }
        c384050F3z.LIZJ = fValueOf;
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a0o);
        tuxTextView.setBackground(c384050F3z.LIZ(tuxTextView.getContext()));
        this.LLJJIJIL = tuxTextView;
        TuxTextView tuxTextView2 = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView2.setId(ViewGroup.generateViewId());
        C786410Ut5.R6(tuxTextView2, new C19ME(-2, -2));
        int i4 = LLL;
        tuxTextView2.setPadding(i4, 0, 0, 0);
        tuxTextView2.setGravity(8388629);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setTuxFont(42);
        tuxTextView2.setTextColorRes(R.attr.a0o);
        this.LLJJJ = tuxTextView2;
        TuxTextView tuxTextView3 = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView3.setId(ViewGroup.generateViewId());
        C786410Ut5.R6(tuxTextView3, new C19ME(-2, -2));
        tuxTextView3.setPadding(i4, 0, 0, 0);
        tuxTextView3.setGravity(8388629);
        tuxTextView3.setMaxLines(1);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView3.setTuxFont(71);
        tuxTextView3.setTextColorRes(R.attr.a0o);
        this.LLJJJIL = tuxTextView3;
        SmartImageView smartImageView = new SmartImageView(getContext());
        smartImageView.setId(ViewGroup.generateViewId());
        C786410Ut5.G6(smartImageView, new C19ME(-2, -2));
        C03DZ.LIZ(smartImageView);
        this.LLJJJJ = smartImageView;
        C429650Gt1 c429650Gt1 = new C429650Gt1(getContext());
        c429650Gt1.setId(ViewGroup.generateViewId());
        c429650Gt1.setPadding(C1763620vzk.LLJILLL, 0, 0, 0);
        this.LLJJJJJIL = c429650Gt1;
        C19MW c19mw = new C19MW(getContext());
        c19mw.setId(ViewGroup.generateViewId());
        C786410Ut5.l6(c19mw, new C19ME(-2, -2));
        c19mw.setType(5);
        this.LLJJJJLIIL = c19mw;
        this.LLJLL = EnumC1762940vye.LLILLL;
        addView(tuxTextView);
        addView(tuxTextView2);
        addView(tuxTextView3);
        addView(smartImageView);
        addView(c429650Gt1);
        addView(c19mw);
        B0(EnumC1763640vzm.FORCE_WRAP, getWaistDefaultPriceStyle());
        C1763620vzk.p0(this, new AwS605S0100000_26(this, 215));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092 A[PHI: r3
      0x0092: PHI (r3v5 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CountdownUiTypeConfig) = 
      (r3v2 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CountdownUiTypeConfig)
      (r3v8 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CountdownUiTypeConfig)
     binds: [B:41:0x0090, B:37:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void L0(X.C1763600vzi r13, java.lang.String r14, java.lang.Long r15, java.lang.Integer r16, boolean r17, int r18) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1763600vzi.L0(X.0vzi, java.lang.String, java.lang.Long, java.lang.Integer, boolean, int):void");
    }
}
