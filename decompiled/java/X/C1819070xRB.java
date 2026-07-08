package X;

import Y.ARunnableS31S1100000_27;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0xRB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1819070xRB extends FrameLayout {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public final Paint LL;
    public Drawable LLILLJJLI;
    public float LLILLL;
    public EnumC1802220x00 LLILZ;
    public RectF LLILZIL;
    public RectF LLILZLL;
    public ValueAnimator LLIZ;
    public float LLIZLLLIL;
    public boolean LLJ;
    public final C420180Gdk LLJI;
    public final C420170Gdj LLJIJIL;
    public final C1819090xRD LLJILJIL;

    public final void LIZ() {
        View viewFindViewById;
        float fLIZLLL = C13LZ.LIZLLL(this.LLILLL, 0.0f, 1.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(fLIZLLL);
        C1819090xRD c1819090xRD = this.LLJILJIL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1819090xRD);
        c1819090xRD.setAlpha(1.0f);
        C1836680xta c1836680xtaLJIIIZ = LJIIIZ();
        if (c1836680xtaLJIIIZ == null || (viewFindViewById = c1836680xtaLJIIIZ.findViewById(R.id.khq)) == null) {
            return;
        }
        C786410Ut5.T4(viewFindViewById, 1.0f - fLIZLLL);
    }

    public final RectF LJFF() {
        RectF rectFLJ;
        RectF rectFLIZLLL;
        if (!this.LLJ) {
            return LJIIIIZZ();
        }
        EnumC1802220x00 enumC1802220x00 = this.LLILZ;
        int[] iArr = C1802230x01.LIZ;
        if (iArr[enumC1802220x00.ordinal()] != 1 || (rectFLJ = this.LLILZLL) == null) {
            rectFLJ = LJ();
        }
        if (iArr[this.LLILZ.ordinal()] != 2 || (rectFLIZLLL = this.LLILZIL) == null) {
            rectFLIZLLL = LIZLLL();
        }
        float f = this.LLILLL;
        float f2 = rectFLIZLLL.left;
        float f3 = f2 + ((rectFLJ.left - f2) * f);
        float f4 = rectFLIZLLL.top;
        float f5 = f4 + ((rectFLJ.top - f4) * f);
        float f6 = rectFLIZLLL.right;
        float f7 = f6 + ((rectFLJ.right - f6) * f);
        float f8 = rectFLIZLLL.bottom;
        return new RectF(f3, f5, f7, f8 + ((rectFLJ.bottom - f8) * f));
    }

    public final RectF LJIIIIZZ() {
        float fLJI = LJI(32.0f);
        float height = (getHeight() - fLJI) / 2.0f;
        return new RectF(0.0f, height, Math.min(LJI(81.0f), getWidth()), fLJI + height);
    }

    public final void LJIIJ() {
        invalidate();
        invalidate();
        LIZ();
    }

    public final float getCornerRadiusPx() {
        return LJI(10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View viewFindViewById;
        ValueAnimator valueAnimator = this.LLIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLIZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLILZ = EnumC1802220x00.LL;
        this.LLJ = false;
        this.LLILLL = 0.0f;
        C786410Ut5.Z1(this.LLJILJIL, 8);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(1.0f);
        C1819090xRD c1819090xRD = this.LLJILJIL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1819090xRD);
        c1819090xRD.setAlpha(1.0f);
        C1836680xta c1836680xtaLJIIIZ = LJIIIZ();
        if (c1836680xtaLJIIIZ != null && (viewFindViewById = c1836680xtaLJIIIZ.findViewById(R.id.khq)) != null) {
            C786410Ut5.T4(viewFindViewById, 1.0f);
        }
        super.onDetachedFromWindow();
    }

    public final RectF LIZLLL() {
        C1836680xta c1836680xtaLJIIIZ = LJIIIZ();
        if (c1836680xtaLJIIIZ == null) {
            return LJIIIIZZ();
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr);
        c1836680xtaLJIIIZ.getLocationOnScreen(iArr2);
        float f = iArr2[1] - iArr[1];
        float height = c1836680xtaLJIIIZ.getHeight() + f;
        int[] iArr3 = new int[2];
        int[] iArr4 = new int[2];
        getLocationOnScreen(iArr3);
        c1836680xtaLJIIIZ.getLocationOnScreen(iArr4);
        float f2 = iArr4[0] - iArr3[0];
        float fLJII = LJII(40.5f);
        float fLJII2 = f2 - LJII(6.0f);
        return new RectF(fLJII2 - fLJII, f, fLJII2, height);
    }

    public final RectF LJ() {
        C1836680xta c1836680xtaLJIIIZ = LJIIIZ();
        if (c1836680xtaLJIIIZ == null) {
            return LJIIIIZZ();
        }
        View viewFindViewById = c1836680xtaLJIIIZ.findViewById(R.id.khp);
        if (viewFindViewById == null) {
            return LJIIIIZZ();
        }
        float fLJII = LJII(32.0f);
        float fLIZJ = LIZJ(viewFindViewById) - LJII(6.0f);
        getLocationOnScreen(new int[2]);
        c1836680xtaLJIIIZ.getLocationOnScreen(new int[2]);
        float height = (r1[1] - r2[1]) + ((c1836680xtaLJIIIZ.getHeight() - fLJII) / 2.0f);
        float fLJII2 = LJII(24.0f);
        float fLJII3 = this.LLIZLLLIL - LJII(6.0f);
        if (fLJII3 < 0.0f) {
            fLJII3 = 0.0f;
        }
        float f = fLIZJ - fLJII2;
        if (fLJII3 > f) {
            fLJII3 = Math.max(0.0f, f);
        }
        return new RectF(fLJII3, height, fLIZJ, fLJII + height);
    }

    public final C1836680xta LJIIIZ() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return null;
        }
        return (C1836680xta) view.findViewById(R.id.oe4);
    }

    public final void LJIIJJI() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            this.LLJ = false;
            return;
        }
        C1836680xta c1836680xtaLJIIIZ = LJIIIZ();
        if (c1836680xtaLJIIIZ == null) {
            this.LLJ = false;
            return;
        }
        View viewFindViewById = c1836680xtaLJIIIZ.findViewById(R.id.khp);
        if (viewFindViewById == null) {
            this.LLJ = false;
            return;
        }
        float fLIZJ = LIZJ(viewFindViewById) - LJII(12.0f);
        this.LLJILJIL.getLabelView().setMaxWidth(C13LZ.LJ((int) (((((fLIZJ - LJII(14.0f)) - LJII(2.0f)) - LJII(4.0f)) - LJII(20.0f)) - LJII(6.0f)), 40, SpeechEngineDefines.TTS_WORK_MODE_BOTH));
        this.LLJILJIL.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        float measuredWidth = fLIZJ - this.LLJILJIL.getMeasuredWidth();
        if (measuredWidth < 0.0f) {
            measuredWidth = 0.0f;
        }
        this.LLIZLLLIL = measuredWidth;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LLJILJIL.getLayoutParams();
        layoutParams.leftMargin = (int) this.LLIZLLLIL;
        layoutParams.topMargin = 0;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 8388627;
        C1819090xRD c1819090xRD = this.LLJILJIL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1819090xRD);
        c1819090xRD.setLayoutParams(layoutParams);
        this.LLJ = true;
        this.LLJILJIL.requestLayout();
        if (this.LLILZ == EnumC1802220x00.LL && this.LLIZ == null) {
            LJIIJ();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LIZ();
    }

    public final void LIZIZ(C1802010wzf c1802010wzf) {
        boolean z;
        C1331670kl3 c1331670kl3LJFF;
        final String string;
        final C1819090xRD c1819090xRD = this.LLJILJIL;
        c1819090xRD.getClass();
        CharSequence charSequence = c1802010wzf.LIZJ;
        String str = c1802010wzf.LIZ;
        int i = c1802010wzf.LIZIZ;
        int i2 = c1802010wzf.LIZLLL;
        EnumC992990bwn enumC992990bwn = c1802010wzf.LJI;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C786410Ut5.Z1(c1819090xRD, 8);
        } else {
            int i3 = C993000bwo.LIZ[enumC992990bwn.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    c1819090xRD.LLIZ.setTuxFont(41);
                } else {
                    throw new C1954807lC();
                }
            } else {
                c1819090xRD.LLIZ.setTuxFont(52);
            }
            c1819090xRD.LLIZ.setText(charSequence);
            c1819090xRD.setContentDescription(charSequence);
            c1819090xRD.LLIZLLLIL.setIconRes(i2);
            String str2 = null;
            if (enumC992990bwn == EnumC992990bwn.REVISIT_REWARD) {
                if (str == null || (string = a0.LJLIIIL(str).toString()) == null) {
                    string = "";
                }
                if (string.length() != 0) {
                    str2 = string;
                }
                c1819090xRD.LLILLJJLI = str2;
                c1819090xRD.LIZIZ();
                if (string.length() != 0) {
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(string);
                    c1331670kl3LJIIIZ.LIZLLL("MinisOperationBanner");
                    c1331670kl3LJIIIZ.LJJ(c1819090xRD.LLILZIL);
                    c1331670kl3LJIIIZ.LJIIJ(new AbstractC1335900krs() { // from class: X.0xRC
                        @Override // X.InterfaceC427850Gq7
                        public final void cm(Uri uri, View view, Throwable th) {
                            C1819090xRD c1819090xRD2 = c1819090xRD;
                            HandlerHook.viewPost(c1819090xRD2.LLILZIL, new ARunnableS31S1100000_27(c1819090xRD2, string, 4));
                        }

                        @Override // X.InterfaceC427850Gq7
                        public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                            C1819090xRD c1819090xRD2 = c1819090xRD;
                            HandlerHook.viewPost(c1819090xRD2.LLILZIL, new ARunnableS31S1100000_27(c1819090xRD2, string, 3));
                        }
                    });
                }
            } else {
                c1819090xRD.LLILLJJLI = null;
                C786410Ut5.LLFF(0, c1819090xRD.LLILLL);
                C786410Ut5.LJZ(8, c1819090xRD.LLILZ);
                C786410Ut5.LLFF(8, c1819090xRD.LLILZIL);
                C786410Ut5.LLLLLLZZ(c1819090xRD.LLILZLL, 8);
                if (str != null && !a0.LJJJIL(str)) {
                    c1331670kl3LJFF = C1331660kl2.LJIIIZ(str);
                    c1331670kl3LJFF.LJJIIZ(i);
                    c1331670kl3LJFF.LJIJJLI(i);
                } else {
                    c1331670kl3LJFF = C1331660kl2.LJFF(i);
                }
                c1331670kl3LJFF.LIZLLL("MinisOperationBanner");
                c1331670kl3LJFF.LJJ(c1819090xRD.LLILLL);
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LJ = c1819090xRD.getResources().getDisplayMetrics().density * 4.0f;
                c1331670kl3LJFF.LJJI = new C1331730kl9(c1331750klB);
                c1331670kl3LJFF.LJIIJ(new C1864440ycM(c1819090xRD, 1));
            }
            C786410Ut5.Z1(c1819090xRD, 0);
            c1819090xRD.requestLayout();
            c1819090xRD.invalidate();
        }
        setContentDescription(this.LLJILJIL.getContentDescription());
        requestLayout();
        invalidate();
    }

    public final float LIZJ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int marginStart;
        int marginEnd;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (getLayoutDirection() == 1) {
            if (marginLayoutParams != null) {
                marginEnd = marginLayoutParams.getMarginEnd();
            } else {
                marginEnd = 0;
            }
            getLocationOnScreen(new int[2]);
            view.getLocationOnScreen(new int[2]);
            return ((r0[0] + view.getWidth()) - r2[0]) + marginEnd;
        }
        if (marginLayoutParams != null) {
            marginStart = marginLayoutParams.getMarginStart();
        } else {
            marginStart = 0;
        }
        getLocationOnScreen(new int[2]);
        view.getLocationOnScreen(new int[2]);
        return (r0[0] - r2[0]) - marginStart;
    }

    public final int LJI(float f) {
        return (int) ((f * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final float LJII(float f) {
        return f * getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setOnOperationBannerClickListener(android.view.View.OnClickListener r3) {
        /*
            r2 = this;
            boolean r0 = X.C1848410yCV.LIZ
            if (r0 == 0) goto L2a
            if (r3 == 0) goto L2a
            avg.f r1 = new avg.f
            r1.<init>(r3)
        Lb:
            mf.a r0 = new mf.a
            r0.<init>(r1)
            r1 = r0
        L11:
            X.1Bky r0 = X.C2213981Bky.LIZIZ
            boolean r0 = r0.isOffline()
            if (r0 == 0) goto L1e
            X.1Bhg r0 = X.C2211941Bhg.LIZ
            r0.injectViewListener(r2)
        L1e:
            r2.setOnClickListener(r1)
            if (r3 == 0) goto L28
            r0 = 1
        L24:
            r2.setClickable(r0)
            return
        L28:
            r0 = 0
            goto L24
        L2a:
            r1 = r3
            if (r3 == 0) goto L11
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1819070xRB.setOnOperationBannerClickListener(android.view.View$OnClickListener):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Gdj, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0Gdk, android.view.View] */
    public C1819070xRB(final Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setColor(iIntValue);
        this.LL = paint;
        this.LLILZ = EnumC1802220x00.LL;
        ?? r4 = new View(context) { // from class: X.0Gdk
            @Override // android.view.View
            public final void onDraw(Canvas canvas) {
                RectF rectFLJFF = this.LL.LJFF();
                float fMin = Math.min(this.LL.getCornerRadiusPx(), rectFLJFF.height() / 2.0f);
                C1819070xRB c1819070xRB = this.LL;
                Drawable drawable = c1819070xRB.LLILLJJLI;
                if (drawable != null) {
                    drawable.setBounds((int) rectFLJFF.left, (int) rectFLJFF.top, (int) rectFLJFF.right, (int) rectFLJFF.bottom);
                    drawable.draw(canvas);
                } else {
                    canvas.drawRoundRect(rectFLJFF, fMin, fMin, c1819070xRB.LL);
                }
            }

            {
                setWillNotDraw(false);
            }
        };
        this.LLJI = r4;
        ?? r3 = new FrameLayout(context) { // from class: X.0Gdj
            @Override // android.view.ViewGroup, android.view.View
            public final void dispatchDraw(Canvas canvas) {
                C1819070xRB c1819070xRB = this.LL;
                RectF rectFLJFF = c1819070xRB.LJFF();
                float fLJI = c1819070xRB.LJI(6.0f);
                float fLJI2 = c1819070xRB.LJI(4.0f);
                RectF rectF = new RectF(rectFLJFF.left + fLJI, rectFLJFF.top + fLJI2, rectFLJFF.right - fLJI, rectFLJFF.bottom - fLJI2);
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    canvas.save();
                    canvas.clipRect(rectF);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                }
            }

            {
                setWillNotDraw(false);
            }
        };
        this.LLJIJIL = r3;
        C1819090xRD c1819090xRD = new C1819090xRD(context);
        this.LLJILJIL = c1819090xRD;
        setClipChildren(false);
        setImportantForAccessibility(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        r3.addView(c1819090xRD, layoutParams);
        addView((View) r4, -1, -1);
        addView((View) r3, -1, -1);
        r3.bringToFront();
        C786410Ut5.Z1(c1819090xRD, 8);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iLJI;
        C1836680xta c1836680xtaLJIIIZ = LJIIIZ();
        if (c1836680xtaLJIIIZ != null && c1836680xtaLJIIIZ.getHeight() > 0) {
            iLJI = c1836680xtaLJIIIZ.getHeight();
        } else {
            iLJI = LJI(32.0f);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iLJI, 1073741824));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LJIIJ();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LJIIJJI();
        super.onLayout(z, i, i2, i3, i4);
    }
}
