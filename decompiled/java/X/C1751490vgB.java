package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0vgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1751490vgB extends FrameLayout {
    public ConstraintLayout LL;
    public View LLILLJJLI;
    public ConstraintLayout LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public SmartImageView LLIZLLLIL;
    public TuxTextView LLJ;
    public LinearLayout LLJI;
    public FrameLayout LLJIJIL;
    public SmartImageView LLJILJIL;
    public TuxIconView LLJILJILJ;
    public C977203ru LLJILLL;
    public FrameLayout LLJJ;
    public TuxTextView LLJJI;
    public FrameLayout LLJJIII;
    public TuxTextView LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public float LLJJJ;
    public float LLJJJIL;
    public final C01GW LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public C1751480vgA LLJJL;

    private final Paint getArcPaint() {
        return (Paint) this.LLJJJJ.getValue();
    }

    private final Paint getCirclePaint() {
        return (Paint) this.LLJJIJIL.getValue();
    }

    private final ViewTreeObserverOnPreDrawListenerC1751500vgC getExposureHandler() {
        return (ViewTreeObserverOnPreDrawListenerC1751500vgC) this.LLJJIJIIJIL.getValue();
    }

    public final C977203ru getBtnVoucherFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cws);
            this.LLJILLL = (C977203ru) callbackFindViewById;
        }
        return (C977203ru) callbackFindViewById;
    }

    public final ConstraintLayout getCouponContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f2k);
            this.LL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final SmartImageView getCouponLabelFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f39);
            this.LLIZLLLIL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final FrameLayout getCouponNumberContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f3a);
            this.LLJJIII = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxTextView getDiscountTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fwv);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final View getDividerLineFromXml() {
        View view = this.LLILLJJLI;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.fzj);
        this.LLILLJJLI = viewFindViewById;
        return viewFindViewById;
    }

    public final FrameLayout getFlIconContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.i6d);
            this.LLJIJIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final FrameLayout getFrBtnContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iik);
            this.LLJJ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final ConstraintLayout getLayoutMoreDetailFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mcn);
            this.LLILLL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final LinearLayout getLlInfoContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ne8);
            this.LLJI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final SmartImageView getSivAuthorIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vd0);
            this.LLJILJIL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxIconView getTivStatusFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y4c);
            this.LLJILJILJ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getTtvCouponStatusFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.yy8);
            this.LLJJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTtvThresholdTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.yz_);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvCostRoleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zfk);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvCouponNumberFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zgb);
            this.LLJJIJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvSubTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_sub_title);
            this.LLJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvTermsApplyFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_terms_apply);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserverOnPreDrawListenerC1751500vgC exposureHandler = getExposureHandler();
        exposureHandler.LLILLJJLI = true;
        C786410Ut5.y3(exposureHandler.LL.getViewTreeObserver(), exposureHandler);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserverOnPreDrawListenerC1751500vgC exposureHandler = getExposureHandler();
        exposureHandler.LLILLJJLI = false;
        C786410Ut5.D3(exposureHandler.LL.getViewTreeObserver(), exposureHandler);
    }

    public final void LIZ(C1069304Gd c1069304Gd) {
        TuxTextView discountTextFromXml = getDiscountTextFromXml();
        c1069304Gd.getClass();
        discountTextFromXml.setTuxFont(53);
        getDiscountTextFromXml().setTextColorRes(R.attr.a1h);
        getTtvThresholdTextFromXml().setTuxFont(81);
        getTtvThresholdTextFromXml().setTextColorRes(R.attr.a1j);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float height;
        if (this.LLJJJJJIL) {
            View dividerLineFromXml = getDividerLineFromXml();
            if (this.LLJJJJLIIL && dividerLineFromXml != null) {
                height = (float) ((((double) dividerLineFromXml.getY()) - (((double) this.LLJJJIL) / 2.0d)) + (((double) dividerLineFromXml.getHeight()) / 2.0d));
            } else {
                height = (float) ((((double) getHeight()) / 2.0d) - (((double) this.LLJJJIL) / 2.0d));
            }
            Paint circlePaint = getCirclePaint();
            float f = 0;
            float f2 = 2;
            float f3 = this.LLJJJ / f2;
            canvas.drawOval(f - f3, height, f + f3, height + this.LLJJJIL, circlePaint);
            canvas.drawOval(getWidth() - (this.LLJJJ / f2), height, getWidth() + (this.LLJJJ / f2), height + this.LLJJJIL, getCirclePaint());
            Paint arcPaint = getArcPaint();
            float f4 = this.LLJJJ / f2;
            canvas.drawArc(f - f4, height, f + f4, height + this.LLJJJIL, 0.0f, 360.0f, false, arcPaint);
            canvas.drawArc(getWidth() - (this.LLJJJ / f2), height, getWidth() + (this.LLJJJ / f2), height + this.LLJJJIL, 0.0f, 360.0f, false, getArcPaint());
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        getExposureHandler().LLILZ = z;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        getExposureHandler().LLILLL = z;
    }

    public final void setBackground(C1751480vgA c1751480vgA) {
        int iLIZ;
        this.LLJJJJJIL = true;
        this.LLJJL = c1751480vgA;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJ = Integer.valueOf(c1751480vgA.LIZJ);
        c384050F3z.LJFF = c1751480vgA.LIZLLL;
        c384050F3z.LIZLLL = Integer.valueOf(c1751480vgA.LJ);
        c384050F3z.LIZJ = Float.valueOf(c1751480vgA.LJFF);
        c384050F3z.LIZIZ = c1751480vgA.LIZIZ;
        c384050F3z.LIZ = Integer.valueOf(c1751480vgA.LIZ);
        setBackground(c384050F3z.LIZ(getContext()));
        Paint arcPaint = getArcPaint();
        Integer num = c1751480vgA.LIZLLL;
        if (num != null) {
            iLIZ = C960203pA.LIZ(num.intValue(), getContext());
        } else {
            iLIZ = c1751480vgA.LIZJ;
        }
        arcPaint.setColor(iLIZ);
        getArcPaint().setStrokeWidth(c1751480vgA.LJ);
    }

    public final void setBackgroundRes(int i) {
        getCouponContainerFromXml().setBackgroundResource(i);
    }

    public final void setBtnVoucherFromXml(C977203ru c977203ru) {
        this.LLJILLL = c977203ru;
    }

    public final void setButtonAlpha(float f) {
        C977203ru btnVoucherFromXml = getBtnVoucherFromXml();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(btnVoucherFromXml);
        btnVoucherFromXml.setAlpha(f);
    }

    public final void setButtonBackgroundColor(int i) {
        getBtnVoucherFromXml().setBackgroundColor(i);
    }

    public final void setButtonBackgroundDrawable(Drawable drawable) {
        getBtnVoucherFromXml().setBackground(drawable);
    }

    public final void setButtonBackgroundRes(int i) {
        getBtnVoucherFromXml().setBackgroundResource(i);
    }

    public final void setButtonContainerVisible(boolean z) {
        int i;
        FrameLayout frBtnContainerFromXml = getFrBtnContainerFromXml();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, frBtnContainerFromXml);
    }

    public final void setButtonGravity(int i) {
        getBtnVoucherFromXml().setGravity(i);
    }

    public final void setButtonNeedRedBorder(boolean z) {
        getBtnVoucherFromXml().setNeedCustomColor(z);
    }

    public final void setButtonText(String str) {
        getBtnVoucherFromXml().setText(str);
    }

    public final void setButtonTextColor(int i) {
        getBtnVoucherFromXml().setTextColor(i);
    }

    public final void setButtonTextColorRes(int i) {
        getBtnVoucherFromXml().setTextColorRes(i);
    }

    public final void setButtonTextFont(int i) {
        getBtnVoucherFromXml().setTuxFont(i);
    }

    public final void setButtonTextSize(float f) {
        getBtnVoucherFromXml().setTextSize(f);
    }

    public final void setButtonVariant(int i) {
        getBtnVoucherFromXml().setButtonVariant(i);
    }

    public final void setButtonVisible(boolean z) {
        int i;
        C977203ru btnVoucherFromXml = getBtnVoucherFromXml();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, btnVoucherFromXml);
    }

    public final void setCouponContainerFromXml(ConstraintLayout constraintLayout) {
        this.LL = constraintLayout;
    }

    public final void setCouponLabelFromXml(SmartImageView smartImageView) {
        this.LLIZLLLIL = smartImageView;
    }

    public final void setCouponNumberBackgroundDrawable(Drawable drawable) {
        getCouponNumberContainerFromXml().setBackground(drawable);
    }

    public final void setCouponNumberContainerFromXml(FrameLayout frameLayout) {
        this.LLJJIII = frameLayout;
    }

    public final void setCouponNumberText(String str) {
        getTvCouponNumberFromXml().setText(str);
    }

    public final void setCouponNumberTextColorRes(int i) {
        getTvCouponNumberFromXml().setTextColorRes(i);
    }

    public final void setCouponNumberVisible(boolean z) {
        int i;
        FrameLayout couponNumberContainerFromXml = getCouponNumberContainerFromXml();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, couponNumberContainerFromXml);
    }

    public final void setCouponStatusText(String str) {
        getTtvCouponStatusFromXml().setText(str);
    }

    public final void setCouponStatusTextColor(int i) {
        getTtvCouponStatusFromXml().setTextColor(i);
    }

    public final void setCouponStatusTextColorRes(int i) {
        getTtvCouponStatusFromXml().setTextColorRes(i);
    }

    public final void setCouponStatusTextFont(int i) {
        getTtvCouponStatusFromXml().setTuxFont(i);
    }

    public final void setCouponStatusTextGravity(int i) {
        getTtvCouponStatusFromXml().setGravity(i);
    }

    public final void setCouponStatusTextSize(float f) {
        getTtvCouponStatusFromXml().setTextSize(f);
    }

    public final void setCouponStatusVisible(boolean z) {
        int i;
        TuxTextView ttvCouponStatusFromXml = getTtvCouponStatusFromXml();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, ttvCouponStatusFromXml);
    }

    public final void setDiscountText(String str) {
        if (str != null && str.length() != 0) {
            C786410Ut5.LJLLLLLL(0, getDiscountTextFromXml());
            getDiscountTextFromXml().setText(str);
        } else {
            C786410Ut5.LJLLLLLL(8, getDiscountTextFromXml());
        }
    }

    public final void setDiscountTextColor(int i) {
        getDiscountTextFromXml().setTextColorRes(i);
    }

    public final void setDiscountTextFont(int i) {
        getDiscountTextFromXml().setTuxFont(i);
    }

    public final void setDiscountTextFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setDiscountTextSize(float f) {
        getDiscountTextFromXml().setTextSize(f);
    }

    public final void setDiscountVisible(boolean z) {
        int i;
        TuxTextView discountTextFromXml = getDiscountTextFromXml();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, discountTextFromXml);
    }

    public final void setDividerLineFromXml(View view) {
        this.LLILLJJLI = view;
    }

    public final void setExposureCallback(InterfaceC1751510vgD interfaceC1751510vgD) {
        getExposureHandler().getClass();
    }

    public final void setFlIconContainerFromXml(FrameLayout frameLayout) {
        this.LLJIJIL = frameLayout;
    }

    public final void setFollowerContainerVisible(boolean z) {
        int i;
        FrameLayout flIconContainerFromXml = getFlIconContainerFromXml();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, flIconContainerFromXml);
    }

    public final void setFollowerInteractiveText(String str) {
        if (str != null && str.length() != 0) {
            C786410Ut5.LJLLLLLL(0, getTtvThresholdTextFromXml());
            getTtvThresholdTextFromXml().setText(str);
        } else {
            C786410Ut5.LJLLLLLL(8, getTtvThresholdTextFromXml());
        }
    }

    public final void setFollowerInteractiveTextColor(int i) {
        getTtvThresholdTextFromXml().setTextColor(i);
    }

    public final void setFollowerInteractiveTextFont(int i) {
        getTtvThresholdTextFromXml().setTuxFont(i);
    }

    public final void setFollowerInteractiveTextSize(float f) {
        getTtvThresholdTextFromXml().setTextSize(f);
    }

    public final void setFollowerInteractiveTextVisible(boolean z) {
        int i;
        TuxTextView ttvThresholdTextFromXml = getTtvThresholdTextFromXml();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, ttvThresholdTextFromXml);
    }

    public final void setFollowerPortraitVisible(boolean z) {
        int i;
        SmartImageView sivAuthorIconFromXml = getSivAuthorIconFromXml();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, sivAuthorIconFromXml);
    }

    public final void setFollowerStatusBackground(int i) {
        getTivStatusFromXml().setBackgroundResource(i);
    }

    public final void setFollowerStatusIcon(C419910GdJ c419910GdJ) {
        setFollowerStatusVisible(true);
        getTivStatusFromXml().setTuxIcon(c419910GdJ);
    }

    public final void setFollowerStatusVisible(boolean z) {
        int i;
        TuxIconView tivStatusFromXml = getTivStatusFromXml();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, tivStatusFromXml);
    }

    public final void setFrBtnContainerFromXml(FrameLayout frameLayout) {
        this.LLJJ = frameLayout;
    }

    public final void setInfoContainerVisible(boolean z) {
        int i;
        LinearLayout llInfoContainerFromXml = getLlInfoContainerFromXml();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, llInfoContainerFromXml);
    }

    public final void setLayoutMoreDetailFromXml(ConstraintLayout constraintLayout) {
        this.LLILLL = constraintLayout;
    }

    public final void setLlInfoContainerFromXml(LinearLayout linearLayout) {
        this.LLJI = linearLayout;
    }

    public final void setSivAuthorIconFromXml(SmartImageView smartImageView) {
        this.LLJILJIL = smartImageView;
    }

    public final void setSubTitle(String str) {
        if (str != null && str.length() != 0) {
            C786410Ut5.LJLLLLLL(0, getTvSubTitleFromXml());
            getTvSubTitleFromXml().setText(str);
        } else {
            C786410Ut5.LJLLLLLL(8, getTvSubTitleFromXml());
        }
    }

    public final void setSubTitleFont(int i) {
        getTvSubTitleFromXml().setTuxFont(i);
    }

    public final void setThresholdText(String str) {
        TuxTextView ttvThresholdTextFromXml = getTtvThresholdTextFromXml();
        if (str == null) {
            str = "";
        }
        ttvThresholdTextFromXml.setText(str);
    }

    public final void setThresholdTextColor(int i) {
        getTtvThresholdTextFromXml().setTextColor(i);
    }

    public final void setThresholdTextFont(int i) {
        getTtvThresholdTextFromXml().setTuxFont(i);
    }

    public final void setThresholdTextMaxLine(int i) {
        getTtvThresholdTextFromXml().setMaxLines(i);
    }

    public final void setThresholdTextSize(float f) {
        getTtvThresholdTextFromXml().setTextSize(f);
    }

    public final void setThresholdVisible(boolean z) {
        int i;
        TuxTextView ttvThresholdTextFromXml = getTtvThresholdTextFromXml();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, ttvThresholdTextFromXml);
    }

    public final void setTivStatusFromXml(TuxIconView tuxIconView) {
        this.LLJILJILJ = tuxIconView;
    }

    public final void setTtvCouponStatusFromXml(TuxTextView tuxTextView) {
        this.LLJJI = tuxTextView;
    }

    public final void setTtvThresholdTextFromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setTvCostRoleFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setTvCouponNumberFromXml(TuxTextView tuxTextView) {
        this.LLJJIJI = tuxTextView;
    }

    public final void setTvSubTitleFromXml(TuxTextView tuxTextView) {
        this.LLJ = tuxTextView;
    }

    public final void setTvTermsApplyFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public C1751490vgB(int i, Context context, AttributeSet attributeSet, Function1 function1) {
        super(context, attributeSet, i);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1542));
        if (function1 == null) {
            C1701430uNR.LIZ(context, R.layout.bph, this, true);
        } else {
            addView((View) function1.invoke(this));
        }
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(context, 1489));
        float f = 6;
        this.LLJJJ = C0H9H.LIZ(f);
        this.LLJJJIL = C0H9H.LIZ(f);
        this.LLJJJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(551));
    }
}
