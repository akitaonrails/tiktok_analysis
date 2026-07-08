package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0vzk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1763620vzk extends ConstraintLayout {
    public static final int LLJILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
    public static final int LLJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    public static final int LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public static final int LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    public static final float LLJJIJI;
    public static final int LLJJIJIIJIL;
    public final TuxTextView LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxTextView LLILZLL;
    public final SmartImageView LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final C19MW LLJ;
    public String LLJI;
    public String LLJIJIL;
    public EnumC1763640vzm LLJILJIL;
    public boolean LLJILJILJ;

    static {
        LLJJIJI = C0BA6.LIZ() ? C418440Gaw.LIZIZ(6) : C418440Gaw.LIZIZ(4);
        LLJJIJIIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    }

    public final int[] getFirstLineIdsWhenWrapLine() {
        return new int[]{this.LL.getId(), this.LLILLJJLI.getId(), this.LLILLL.getId(), this.LLILZ.getId(), this.LLILZIL.getId(), this.LLILZLL.getId(), this.LLIZ.getId()};
    }

    private final int getCouponIconViewWidth() {
        if (this.LLIZ.getVisibility() != 0) {
            return 0;
        }
        return i0(this.LLIZ) + LLJJIJIIJIL;
    }

    private final int getDiscountViewWidth() {
        if (this.LL.getVisibility() != 0) {
            return 0;
        }
        return i0(this.LL) + ((int) C0H1U.LIZLLL(this.LL));
    }

    private final int getOriginalPriceViewWidth() {
        if (this.LLIZLLLIL.getVisibility() != 0) {
            return 0;
        }
        return i0(this.LLIZLLLIL) + ((int) C0H1U.LIZLLL(this.LLIZLLLIL));
    }

    private final int getRealPriceIntervalTipViewWidth() {
        if (this.LLILLJJLI.getVisibility() != 0) {
            return 0;
        }
        return i0(this.LLILLJJLI) + ((int) C0H1U.LIZLLL(this.LLILLJJLI));
    }

    private final int getRealPriceOrAmountDecimalNumberViewWidth() {
        if (this.LLILZIL.getVisibility() != 0) {
            return 0;
        }
        return i0(this.LLILZIL) + ((int) C0H1U.LIZLLL(this.LLILZIL));
    }

    private final int getRealPriceOrAmountNumberViewMinWidth() {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.setTextSize(C418440Gaw.LIZIZ(Float.valueOf(15.0f)));
        return ((int) c444890HcV.measureText(this.LLJI)) + i0(this.LLILZ);
    }

    private final int getRealPriceOrAmountNumberViewWidth() {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(12);
        return ((int) c444890HcV.measureText(this.LLILZ.getText().toString())) + i0(this.LLILZ);
    }

    private final int getRealPricePrefixCurrencySymbolViewWidth() {
        if (this.LLILLL.getVisibility() != 0) {
            return 0;
        }
        return i0(this.LLILLL) + ((int) C0H1U.LIZLLL(this.LLILLL));
    }

    private final int getRealPriceSuffixCurrencySymbolViewWidth() {
        if (this.LLILZLL.getVisibility() != 0) {
            return 0;
        }
        return i0(this.LLILZLL) + ((int) C0H1U.LIZLLL(this.LLILZLL));
    }

    public final TuxTextView e0() {
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView.setId(ViewGroup.generateViewId());
        C786410Ut5.R6(tuxTextView, new C19ME(-2, -2));
        tuxTextView.setGravity(16);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setTuxFont(C0BA6.LIZ() ? 62 : 42);
        tuxTextView.setTextColorRes(R.attr.a1q);
        C03DZ.LIZ(tuxTextView);
        return tuxTextView;
    }

    public final int getSecondLineTotalWidthWhenWrapLine() {
        return getOriginalPriceViewWidth();
    }

    public final C19MW getBarrierLineWrap() {
        return this.LLJ;
    }

    public final SmartImageView getIvCouponIcon() {
        return this.LLIZ;
    }

    public final TuxTextView getTvOriginalPrice() {
        return this.LLIZLLLIL;
    }

    public static int i0(View view) {
        int marginStart;
        int paddingStart = view.getPaddingStart() + view.getPaddingEnd();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int marginEnd = 0;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        } else {
            marginStart = 0;
        }
        int i = paddingStart + marginStart;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
        }
        return i + marginEnd;
    }

    public final int h0(boolean z) {
        int realPriceOrAmountNumberViewMinWidth;
        int discountViewWidth = getDiscountViewWidth() + getRealPriceIntervalTipViewWidth() + getRealPricePrefixCurrencySymbolViewWidth();
        if (!z) {
            realPriceOrAmountNumberViewMinWidth = getRealPriceOrAmountNumberViewWidth();
        } else {
            realPriceOrAmountNumberViewMinWidth = getRealPriceOrAmountNumberViewMinWidth();
        }
        return discountViewWidth + realPriceOrAmountNumberViewMinWidth + getRealPriceOrAmountDecimalNumberViewWidth() + getRealPriceSuffixCurrencySymbolViewWidth() + getCouponIconViewWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0215 A[EDGE_INSN: B:108:0x0215->B:100:0x0215 BREAK  A[LOOP:0: B:46:0x00a1->B:87:0x01dc]] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x021b A[PHI: r4
      0x021b: PHI (r4v1 java.lang.String) = (r4v5 java.lang.String), (r4v6 java.lang.String), (r4v0 java.lang.String) binds: [B:36:0x0080, B:34:0x007a, B:26:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s0(X.C953503o5 r12) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1763620vzk.s0(X.03o5):void");
    }

    public final void u0(Integer num) {
        if (C0BA6.LIZ() && this.LLILZIL.getVisibility() == 0) {
            j0(this, new AwS427S0200000_26(this, num, 24));
        }
    }

    public final void z0(C1763650vzn c1763650vzn) {
        int iIntValue;
        if (c1763650vzn == null) {
            return;
        }
        Integer num = c1763650vzn.LIZ;
        if (num != null) {
            this.LL.setTextColorRes(num.intValue());
        }
        if (c1763650vzn.LIZIZ != null) {
            TuxTextView tuxTextView = this.LL;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(LLJJIJI);
            c384050F3z.LIZIZ = c1763650vzn.LIZIZ;
            tuxTextView.setBackground(c384050F3z.LIZ(getContext()));
        }
        Integer num2 = c1763650vzn.LIZJ;
        if (num2 != null) {
            this.LLILLJJLI.setTextColorRes(num2.intValue());
        }
        Integer num3 = c1763650vzn.LIZLLL;
        if (num3 != null) {
            this.LLILLL.setTextColorRes(num3.intValue());
            this.LLILZIL.setTextColorRes(c1763650vzn.LIZLLL.intValue());
            this.LLILZLL.setTextColorRes(c1763650vzn.LIZLLL.intValue());
        }
        Integer num4 = c1763650vzn.LJ;
        if (num4 != null) {
            this.LLILZ.setTextColorRes(num4.intValue());
        }
        if (c1763650vzn.LJFF != null) {
            SmartImageView smartImageView = this.LLIZ;
            Integer numLIZJ = C1308910kAL.LIZJ(c1763650vzn.LJFF.intValue(), getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            smartImageView.setImageTintList(ColorStateList.valueOf(iIntValue));
        }
        Integer num5 = c1763650vzn.LJI;
        if (num5 != null) {
            this.LLIZLLLIL.setTextColorRes(num5.intValue());
        }
    }

    public C1763620vzk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void j0(View view, Function0 function0) {
        if (view.getWidth() > 0) {
            function0.invoke();
        } else {
            C430110Gtl.LIZ(view, new AwS570S0100000_26(function0, 433));
        }
    }

    public static void l0(C19MB c19mb, View view) {
        c19mb.LJIJI(view.getId()).LIZLLL.LJJLIIIIJ = true;
        c19mb.LJIJI(view.getId()).LIZLLL.LJJLIIIJ = true;
        c19mb.LJJII(0.0f, view.getId());
        c19mb.LJJIII(view.getId(), 2);
    }

    public static void n0(int i, View view) {
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i2 = marginLayoutParams.bottomMargin;
        } else {
            i2 = 0;
        }
        if (i2 == i) {
            return;
        }
        C0H9H.LIZJ(i, view);
    }

    public static void p0(ConstraintLayout constraintLayout, Function1 function1) {
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        function1.invoke(c19mb);
        c19mb.LIZIZ(constraintLayout);
    }

    public final void B0(EnumC1763640vzm enumC1763640vzm, C1763650vzn c1763650vzn) {
        if (this.LLJILJIL != enumC1763640vzm) {
            this.LLJILJIL = enumC1763640vzm;
            int i = C1763630vzl.LIZ[enumC1763640vzm.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        j0(this, new AwS570S0100000_26(this, 1380));
                    } else {
                        throw new C1954807lC();
                    }
                } else if (!this.LLJILJILJ) {
                    this.LLJILJILJ = true;
                    p0(this, new AwS605S0100000_26(this, 584));
                }
            } else if (this.LLJILJILJ) {
                this.LLJILJILJ = false;
                p0(this, new AwS605S0100000_26(this, 214));
            }
        }
        z0(c1763650vzn);
    }

    public C1763620vzk(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        int iIntValue;
        int i4;
        super(context, attributeSet, i);
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView.setId(ViewGroup.generateViewId());
        C786410Ut5.R6(tuxTextView, new C19ME(-2, -2));
        int i5 = LLJJI;
        Integer numValueOf = Integer.valueOf(i5);
        int i6 = LLJJIII;
        C426750GoL.LJIIL(tuxTextView, numValueOf, Integer.valueOf(i6), Integer.valueOf(i5), Integer.valueOf(i6), 16);
        tuxTextView.setGravity(16);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        if (((Boolean) C268800AgA.LIZ.getValue()).booleanValue()) {
            i2 = 62;
        } else {
            i2 = 52;
        }
        tuxTextView.setTuxFont(i2);
        tuxTextView.setTextColorRes(R.attr.a0p);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(LLJJIJI);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
        tuxTextView.setBackground(c384050F3z.LIZ(tuxTextView.getContext()));
        this.LL = tuxTextView;
        TuxTextView tuxTextView2 = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView2.setId(ViewGroup.generateViewId());
        C786410Ut5.R6(tuxTextView2, new C19ME(-2, -2));
        tuxTextView2.setGravity(16);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        if (C0BA6.LIZ()) {
            i3 = 62;
        } else {
            i3 = 72;
        }
        tuxTextView2.setTuxFont(i3);
        tuxTextView2.setTextColorRes(R.attr.a1q);
        this.LLILLJJLI = tuxTextView2;
        TuxTextView tuxTextViewE0 = e0();
        this.LLILLL = tuxTextViewE0;
        TuxTextView tuxTextView3 = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView3.setId(ViewGroup.generateViewId());
        C786410Ut5.R6(tuxTextView3, new C19ME(-2, -2));
        tuxTextView3.setGravity(16);
        tuxTextView3.setMaxLines(1);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView3.setTuxFont(12);
        tuxTextView3.setMinTextSize(15.0f);
        tuxTextView3.setTextColorRes(R.attr.a1q);
        this.LLILZ = tuxTextView3;
        TuxTextView tuxTextView4 = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView4.setId(ViewGroup.generateViewId());
        C786410Ut5.R6(tuxTextView4, new C19ME(-2, -2));
        tuxTextView4.setGravity(16);
        tuxTextView4.setMaxLines(1);
        tuxTextView4.setTuxFont(62);
        tuxTextView4.setTextColorRes(R.attr.a1q);
        C03DZ.LIZ(tuxTextView4);
        this.LLILZIL = tuxTextView4;
        TuxTextView tuxTextViewE02 = e0();
        this.LLILZLL = tuxTextViewE02;
        SmartImageView smartImageView = new SmartImageView(getContext());
        smartImageView.setId(ViewGroup.generateViewId());
        C786410Ut5.G6(smartImageView, new C19ME(LLJJIJIIJIL, -2));
        smartImageView.setImageResource(R.drawable.bja);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1q, smartImageView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        smartImageView.setImageTintList(ColorStateList.valueOf(iIntValue));
        this.LLIZ = smartImageView;
        TuxTextView tuxTextView5 = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView5.setId(ViewGroup.generateViewId());
        C786410Ut5.R6(tuxTextView5, new C19ME(-2, -2));
        tuxTextView5.setGravity(16);
        tuxTextView5.getPaint().setFlags(16);
        tuxTextView5.getPaint().setAntiAlias(true);
        tuxTextView5.setMaxLines(1);
        tuxTextView5.setEllipsize(TextUtils.TruncateAt.END);
        if (C0BA6.LIZ()) {
            i4 = 61;
        } else {
            i4 = 71;
        }
        tuxTextView5.setTuxFont(i4);
        tuxTextView5.setTextColorRes(R.attr.a1k);
        this.LLIZLLLIL = tuxTextView5;
        C19MW c19mw = new C19MW(getContext());
        c19mw.setId(ViewGroup.generateViewId());
        C786410Ut5.l6(c19mw, new C19ME(-2, -2));
        c19mw.setType(3);
        this.LLJ = c19mw;
        this.LLJI = "";
        this.LLJIJIL = "";
        this.LLJILJIL = EnumC1763640vzm.AUTO_WRAP;
        addView(tuxTextView);
        addView(tuxTextView2);
        addView(tuxTextViewE0);
        addView(tuxTextView3);
        addView(tuxTextView4);
        addView(tuxTextViewE02);
        addView(smartImageView);
        addView(tuxTextView5);
        addView(c19mw);
        p0(this, new AwS605S0100000_26(this, 212));
    }
}
