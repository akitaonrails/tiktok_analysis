package X;

import Y.ALAdapterS1S0201000_26;
import Y.AUListenerS60S0201000_26;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.SizeF;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.BTMModel;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.FixedItemAsset;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.FixedItemData;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.FixedItemDivisionLineStyle;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.FixedItemLineModeStyle;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.FixedItemOnboardingData;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.FixedItemOnboardingShiningMode;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.FixedItemOnboardingShiningStyle;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.FixedItemOnboardingStyle;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.FixedItemStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS62S1300000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0wIF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1775090wIF extends FrameLayout implements InterfaceC1774700wHc {
    public final FrameLayout LL;
    public final View LLILLJJLI;
    public final View LLILLL;
    public final View LLILZ;
    public final View LLILZIL;
    public final RemoteImageView LLILZLL;
    public final FrameLayout LLIZ;
    public final TextView LLIZLLLIL;
    public final C0GZ5 LLJ;
    public FixedItemStyle LLJI;
    public FixedItemData LLJIJIL;
    public FixedItemOnboardingStyle LLJILJIL;
    public FixedItemOnboardingData LLJILJILJ;
    public BTMModel LLJILLL;
    public String LLJJ;
    public int LLJJI;
    public C1775100wIG LLJJIII;
    public int LLJJIJI;
    public ValueAnimator LLJJIJIIJIL;
    public ValueAnimator LLJJIJIL;
    public ValueAnimator LLJJJ;
    public Function1<? super Boolean, Unit> LLJJJIL;
    public final Interpolator LLJJJJ;
    public EnumC1775120wII LLJJJJJIL;
    public float LLJJJJLIIL;
    public float LLJJL;
    public int LLJJLIIIJLLLLLLLZ;

    private final SizeF getDisplayIconSize() {
        Float fValueOf;
        Float fValueOf2;
        float fLIZIZ;
        Float f;
        FixedItemData fixedItemData = this.LLJIJIL;
        FixedItemAsset fixedItemAssetLIZ = fixedItemData != null ? fixedItemData.LIZ(C960203pA.LIZIZ(getContext())) : null;
        FixedItemStyle fixedItemStyle = this.LLJI;
        if ((fixedItemStyle == null || (fValueOf = fixedItemStyle.width) == null) && (fixedItemAssetLIZ == null || (fValueOf = fixedItemAssetLIZ.width) == null)) {
            fValueOf = Float.valueOf(20.0f);
        }
        float fLIZIZ2 = C418440Gaw.LIZIZ(fValueOf);
        FixedItemStyle fixedItemStyle2 = this.LLJI;
        if (fixedItemStyle2 == null || (f = fixedItemStyle2.height) == null) {
            if (fixedItemAssetLIZ == null || (fValueOf2 = fixedItemAssetLIZ.height) == null) {
                fValueOf2 = Float.valueOf(20.0f);
            }
            fLIZIZ = C418440Gaw.LIZIZ(fValueOf2);
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(f);
        }
        if (fLIZIZ2 <= 0.0f) {
            fLIZIZ2 = C418440Gaw.LIZIZ(Float.valueOf(20.0f));
        }
        if (fLIZIZ <= 0.0f) {
            fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(20.0f));
        }
        return new SizeF(fLIZIZ2, fLIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1775100wIG LIZJ() {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1775090wIF.LIZJ():X.0wIG");
    }

    public final void LJ() {
        ValueAnimator valueAnimator = this.LLJJIJIIJIL;
        if (!((valueAnimator == null && this.LLJJIJIL == null && this.LLJJJ == null) ? false : true)) {
            C1775100wIG c1775100wIGLIZJ = this.LLJJIII;
            if (c1775100wIGLIZJ != null || (LJI() && getWidth() > 0 && getHeight() > 0 && (c1775100wIGLIZJ = LIZJ()) != null)) {
                this.LLJJJJJIL = EnumC1775120wII.LL;
                this.LLJJJJLIIL = 0.0f;
                this.LLJJL = 0.0f;
                LJIIJ(c1775100wIGLIZJ);
                return;
            }
            return;
        }
        this.LLJJIJI++;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LLJJIJIL;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.LLJJJ;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        this.LLJJJ = null;
        C1775100wIG c1775100wIG = this.LLJJIII;
        if (c1775100wIG != null) {
            this.LLJJJJJIL = EnumC1775120wII.LL;
            this.LLJJJJLIIL = 0.0f;
            this.LLJJL = 0.0f;
            LJIIJ(c1775100wIG);
        }
        Function1<? super Boolean, Unit> function1 = this.LLJJJIL;
        if (function1 != null) {
            this.LLJJJIL = null;
            function1.invoke(Boolean.FALSE);
        }
    }

    public final float LJFF() {
        FixedItemDivisionLineStyle fixedItemDivisionLineStyle;
        Float f;
        FixedItemStyle fixedItemStyle = this.LLJI;
        if (fixedItemStyle == null || (fixedItemDivisionLineStyle = fixedItemStyle.divisionLine) == null || (f = fixedItemDivisionLineStyle.width) == null) {
            return 0.0f;
        }
        return C418440Gaw.LIZIZ(f);
    }

    public final boolean LJI() {
        FixedItemAsset fixedItemAssetLIZ;
        FixedItemData fixedItemData;
        String str;
        FixedItemData fixedItemData2 = this.LLJIJIL;
        return (fixedItemData2 == null || (fixedItemAssetLIZ = fixedItemData2.LIZ(C960203pA.LIZIZ(getContext()))) == null || !fixedItemAssetLIZ.LIZ() || (fixedItemData = this.LLJIJIL) == null || (str = fixedItemData.schema) == null || a0.LJJJIL(str)) ? false : true;
    }

    public final void LJIIL() {
        FixedItemDivisionLineStyle fixedItemDivisionLineStyle;
        FixedItemLineModeStyle fixedItemLineModeStyle;
        FixedItemOnboardingShiningStyle fixedItemOnboardingShiningStyle;
        FixedItemOnboardingShiningMode fixedItemOnboardingShiningMode;
        String str;
        Integer numValueOf;
        FixedItemDivisionLineStyle fixedItemDivisionLineStyle2;
        FixedItemLineModeStyle fixedItemLineModeStyle2;
        final int iIntValue = this.LLJJI;
        this.LLILZIL.setBackgroundColor(iIntValue);
        this.LLILLL.setBackgroundColor(iIntValue);
        String str2 = null;
        if (C960203pA.LIZIZ(getContext())) {
            FixedItemStyle fixedItemStyle = this.LLJI;
            if (fixedItemStyle != null && (fixedItemDivisionLineStyle2 = fixedItemStyle.divisionLine) != null && (fixedItemLineModeStyle2 = fixedItemDivisionLineStyle2.dark) != null) {
                str2 = fixedItemLineModeStyle2.lineColor;
            }
        } else {
            FixedItemStyle fixedItemStyle2 = this.LLJI;
            if (fixedItemStyle2 != null && (fixedItemDivisionLineStyle = fixedItemStyle2.divisionLine) != null && (fixedItemLineModeStyle = fixedItemDivisionLineStyle.light) != null) {
                str2 = fixedItemLineModeStyle.lineColor;
            }
        }
        int iLIZ = str2 != null ? C1774710wHd.LIZ(str2) : 0;
        C786410Ut5.LJLLLLLL(LJFF() > 0.0f ? 0 : 8, this.LLILZ);
        View view = this.LLILZ;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Float.valueOf(4.0f)));
        gradientDrawable.setColor(iLIZ);
        view.setBackground(gradientDrawable);
        final int iLJIIL = C2441009hQ.LJIIL(iIntValue, 0);
        this.LLILLJJLI.setBackground(new Drawable(iLJIIL, iIntValue) { // from class: X.0GQm
            public final int LIZ;
            public final int LIZIZ;
            public final float LIZJ = 0.5f;
            public final Paint LIZLLL = new Paint(1);

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                float fWidth = getBounds().width();
                float fHeight = getBounds().height();
                if (fWidth > 0.0f && fHeight > 0.0f) {
                    Paint paint = this.LIZLLL;
                    int i = this.LIZIZ;
                    paint.setShader(new LinearGradient(0.0f, 0.0f, fWidth, 0.0f, new int[]{this.LIZ, i, i}, new float[]{0.0f, this.LIZJ, 1.0f}, Shader.TileMode.CLAMP));
                    canvas.drawRect(getBounds(), this.LIZLLL);
                }
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i) {
                this.LIZLLL.setAlpha(i);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.LIZLLL.setColorFilter(colorFilter);
            }

            {
                this.LIZ = iLJIIL;
                this.LIZIZ = iIntValue;
            }
        });
        FixedItemOnboardingStyle fixedItemOnboardingStyle = this.LLJILJIL;
        if (fixedItemOnboardingStyle != null && (fixedItemOnboardingShiningStyle = fixedItemOnboardingStyle.shining) != null) {
            if (C960203pA.LIZIZ(getContext())) {
                fixedItemOnboardingShiningMode = fixedItemOnboardingShiningStyle.dark;
                if (fixedItemOnboardingShiningMode == null) {
                    fixedItemOnboardingShiningMode = fixedItemOnboardingShiningStyle.light;
                    if (fixedItemOnboardingShiningMode != null) {
                    }
                }
                str = fixedItemOnboardingShiningMode.color;
                if (str != null && (numValueOf = Integer.valueOf(C1774710wHd.LIZ(str))) != null) {
                    iIntValue = numValueOf.intValue();
                }
            } else {
                fixedItemOnboardingShiningMode = fixedItemOnboardingShiningStyle.light;
                if (fixedItemOnboardingShiningMode == null) {
                    fixedItemOnboardingShiningMode = fixedItemOnboardingShiningStyle.dark;
                    if (fixedItemOnboardingShiningMode != null) {
                    }
                }
                str = fixedItemOnboardingShiningMode.color;
                if (str != null) {
                    iIntValue = numValueOf.intValue();
                }
            }
        }
        C0GZ5 c0gz5 = this.LLJ;
        if (c0gz5.LLILZLL != iIntValue) {
            c0gz5.LLILZLL = iIntValue;
            c0gz5.invalidate();
        }
    }

    public final boolean LIZLLL() {
        FixedItemOnboardingData fixedItemOnboardingData;
        String str;
        return LJI() && (fixedItemOnboardingData = this.LLJILJILJ) != null && (str = fixedItemOnboardingData.title) != null && !a0.LJJJIL(str) && getVisibility() == 0 && isShown() && getWidth() > 0 && getHeight() > 0;
    }

    public final int LJIIIZ() {
        if (!LJI()) {
            return 0;
        }
        FixedItemStyle fixedItemStyle = this.LLJI;
        C1774740wHg c1774740wHg = new C1774740wHg(fixedItemStyle != null ? fixedItemStyle.iconInset : null);
        return (int) Math.ceil(LJFF() + c1774740wHg.LIZIZ() + getDisplayIconSize().getWidth() + c1774740wHg.LIZJ());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJ();
    }

    public final BTMModel getBtmInfo() {
        return this.LLJILLL;
    }

    public final FixedItemData getData() {
        return this.LLJIJIL;
    }

    public final FixedItemOnboardingData getOnboardingData() {
        return this.LLJILJILJ;
    }

    public final FixedItemOnboardingStyle getOnboardingStyle() {
        return this.LLJILJIL;
    }

    public final FixedItemStyle getStyle() {
        return this.LLJI;
    }

    public C1775090wIF(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.LL = frameLayout;
        View view = new View(context);
        this.LLILLJJLI = view;
        View view2 = new View(context);
        this.LLILLL = view2;
        View view3 = new View(context);
        this.LLILZ = view3;
        View view4 = new View(context);
        this.LLILZIL = view4;
        RemoteImageView remoteImageView = new RemoteImageView(context);
        this.LLILZLL = remoteImageView;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.LLIZ = frameLayout2;
        TextView textView = new TextView(context);
        this.LLIZLLLIL = textView;
        C0GZ5 c0gz5 = new C0GZ5(this, context);
        this.LLJ = c0gz5;
        this.LLJJJJ = C1619980sG4.LJIIJ();
        this.LLJJJJJIL = EnumC1775120wII.LL;
        setClipChildren(false);
        setClipToPadding(false);
        setBackgroundColor(0);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setClickable(false);
        addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        view.setClickable(false);
        frameLayout.addView(view);
        view2.setClickable(false);
        frameLayout.addView(view2);
        view3.setClickable(false);
        frameLayout.addView(view3);
        view4.setClickable(false);
        frameLayout.addView(view4, 1);
        remoteImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        remoteImageView.setClickable(false);
        frameLayout.addView(remoteImageView);
        frameLayout2.setClipChildren(true);
        frameLayout2.setClipToPadding(true);
        frameLayout2.setClickable(false);
        frameLayout.addView(frameLayout2);
        textView.setTextColor(0);
        textView.setSingleLine();
        textView.setClickable(false);
        frameLayout2.addView(textView);
        c0gz5.setClickable(false);
        int visibility = c0gz5.getVisibility();
        c0gz5.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c0gz5);
        frameLayout.addView(c0gz5);
    }

    @Override // X.InterfaceC1774700wHc
    public final boolean LIZIZ(String str) {
        if (Intrinsics.LJFF(str, "preset") && LIZLLL()) {
            return true;
        }
        return false;
    }

    public final void LJIIJ(C1775100wIG c1775100wIG) {
        float f;
        if (c1775100wIG == null) {
            return;
        }
        float fLIZLLL = C13LZ.LIZLLL(this.LLJJJJLIIL, 0.0f, 1.0f);
        RectF rectFLJIIIIZZ = LJIIIIZZ(fLIZLLL, c1775100wIG.LIZJ, c1775100wIG.LIZLLL);
        RectF rectFLJIIIIZZ2 = LJIIIIZZ(fLIZLLL, c1775100wIG.LJII, c1775100wIG.LJIIIIZZ);
        float f2 = (c1775100wIG.LIZLLL.left + c1775100wIG.LJIIJ.left) - rectFLJIIIIZZ.left;
        RectF rectF = new RectF(f2, 0.0f, c1775100wIG.LJIIJ.width() + f2, c1775100wIG.LIZ);
        RectF rectF2 = new RectF(0.0f, c1775100wIG.LJIIJJI.top, c1775100wIG.LJIIJ.width(), c1775100wIG.LJIIJJI.bottom);
        float f3 = c1775100wIG.LIZLLL.left;
        RectF rectF3 = c1775100wIG.LJIIJ;
        float f4 = rectF3.left + f3;
        Rect rect = new Rect(C814420VxA.LIZIZ(C13LZ.LIZLLL(Math.min(f3 + rectF3.right, Math.max(f4, (rectFLJIIIIZZ.left + rectFLJIIIIZZ2.right) + c1775100wIG.LIZIZ)) - f4, 0.0f, c1775100wIG.LJIIJ.width())), 0, C814420VxA.LIZIZ(c1775100wIG.LJIIJ.width()), C814420VxA.LIZIZ(c1775100wIG.LIZ));
        LJII(this.LL, rectFLJIIIIZZ);
        LJII(this.LLILLJJLI, c1775100wIG.LJ);
        LJII(this.LLILLL, c1775100wIG.LJFF);
        LJII(this.LLILZ, c1775100wIG.LJI);
        LJII(this.LLILZIL, new RectF(c1775100wIG.LJI.left, 0.0f, rectFLJIIIIZZ.width(), rectFLJIIIIZZ.height()));
        LJII(this.LLILZLL, rectFLJIIIIZZ2);
        LJII(this.LLIZ, rectF);
        LJII(this.LLIZLLLIL, rectF2);
        LJII(this.LLJ, new RectF(0.0f, 0.0f, rectFLJIIIIZZ.width(), rectFLJIIIIZZ.height()));
        this.LLIZ.setClipBounds(rect);
        C0GZ5 c0gz5 = this.LLJ;
        float f5 = rectF.left;
        float f6 = rectF2.left + f5;
        float f7 = rectF.top;
        RectF rectF4 = new RectF(f6, rectF2.top + f7, f5 + rectF2.right, f7 + rectF2.bottom);
        if (!Intrinsics.LJFF(c0gz5.LLILZ, rectFLJIIIIZZ2) || !Intrinsics.LJFF(c0gz5.LLILZIL, rectF4)) {
            c0gz5.LLILZ.set(rectFLJIIIIZZ2);
            c0gz5.LLILZIL.set(rectF4);
            c0gz5.LLJILJIL = true;
            c0gz5.invalidate();
        }
        if (this.LLJJJJJIL == EnumC1775120wII.LLILLL) {
            C0GZ5 c0gz52 = this.LLJ;
            int visibility = c0gz52.getVisibility();
            c0gz52.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c0gz52);
            C0GZ5 c0gz53 = this.LLJ;
            float f8 = this.LLJJL;
            if (f8 >= 0.08f) {
                if (f8 > 0.92f) {
                    f8 = 1.0f - f8;
                    f = f8 / 0.08f;
                } else {
                    f = 1.0f;
                }
            } else {
                f = f8 / 0.08f;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gz53);
            c0gz53.setAlpha(f);
            float fLIZLLL2 = C13LZ.LIZLLL(this.LLJJL, 0.0f, 1.0f);
            float f9 = c1775100wIG.LJIIL;
            float f10 = c1775100wIG.LJIILIIL;
            float f11 = c1775100wIG.LJIILJJIL;
            float f12 = f11 + ((c1775100wIG.LJIILL - f11) * fLIZLLL2);
            float f13 = c1775100wIG.LIZ * 0.5f;
            C0GZ5 c0gz54 = this.LLJ;
            c0gz54.LLIZ = f9;
            c0gz54.LLIZLLLIL = f10;
            c0gz54.LLJ = f12;
            c0gz54.LLJI = f13;
            c0gz54.invalidate();
            return;
        }
        C0GZ5 c0gz55 = this.LLJ;
        int visibility2 = c0gz55.getVisibility();
        c0gz55.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, c0gz55);
        C0GZ5 c0gz56 = this.LLJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gz56);
        c0gz56.setAlpha(0.0f);
    }

    public static void LJII(View view, RectF rectF) {
        view.layout(C814420VxA.LIZIZ(rectF.left), C814420VxA.LIZIZ(rectF.top), C814420VxA.LIZIZ(rectF.right), C814420VxA.LIZIZ(rectF.bottom));
    }

    @Override // X.InterfaceC1774700wHc
    public final void LIZ(String str, AwS62S1300000_26 awS62S1300000_26) {
        if (Intrinsics.LJFF(str, "preset") && LIZLLL()) {
            LJ();
            this.LLJJJIL = awS62S1300000_26;
            C1775100wIG c1775100wIGLIZJ = LIZJ();
            this.LLJJIII = c1775100wIGLIZJ;
            int i = this.LLJJIJI + 1;
            this.LLJJIJI = i;
            this.LLJJJJJIL = EnumC1775120wII.LLILLJJLI;
            this.LLJJJJLIIL = 0.0f;
            this.LLJJL = 0.0f;
            LJIIJ(c1775100wIGLIZJ);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.setInterpolator(this.LLJJJJ);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS60S0201000_26(i, this, c1775100wIGLIZJ, 1));
            valueAnimatorOfFloat.addListener(new ALAdapterS1S0201000_26(i, this, c1775100wIGLIZJ, 0));
            valueAnimatorOfFloat.start();
            this.LLJJIJIIJIL = valueAnimatorOfFloat;
            return;
        }
        awS62S1300000_26.invoke(Boolean.FALSE);
    }

    public static RectF LJIIIIZZ(float f, RectF rectF, RectF rectF2) {
        float f2 = rectF.left;
        float f3 = f2 + ((rectF2.left - f2) * f);
        float f4 = rectF.top;
        float f5 = f4 + ((rectF2.top - f4) * f);
        float f6 = rectF.right;
        float f7 = f6 + ((rectF2.right - f6) * f);
        float f8 = rectF.bottom;
        return new RectF(f3, f5, f7, f8 + ((rectF2.bottom - f8) * f));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.FixedItemStyle r13, com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.FixedItemData r14, com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.FixedItemOnboardingStyle r15, com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.FixedItemOnboardingData r16, com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.BTMModel r17) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1775090wIF.LJIIJJI(com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.FixedItemStyle, com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.FixedItemData, com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.FixedItemOnboardingStyle, com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.FixedItemOnboardingData, com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar.BTMModel):void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!LJI()) {
            return;
        }
        this.LLJJIII = LIZJ();
        LJIIJ(this.LLJJIII);
    }
}
