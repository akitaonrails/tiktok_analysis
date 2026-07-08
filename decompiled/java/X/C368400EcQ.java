package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EcQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368400EcQ extends View {
    public final C368390EcP LL;
    public C0E6E LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final Drawable LLIZLLLIL;
    public final Drawable LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final Rect LLJILJIL;
    public final Rect LLJILJILJ;
    public final RectF LLJILLL;
    public final RectF LLJJ;
    public final RectF LLJJI;
    public final float[] LLJJIII;
    public final Path LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final Paint LLJJIJIL;
    public final C368500Eca LLJJJ;
    public final C368500Eca LLJJJIL;
    public final int LLJJJJ;
    public float LLJJJJJIL;
    public float LLJJJJLIIL;
    public final int LLJJL;
    public final int LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public Animation LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public final Paint LLJZ;
    public final Paint LLJZIJLIL;
    public final float LLL;
    public final float LLLF;
    public final float LLLFF;
    public final float LLLFFI;
    public final float LLLFZ;
    public final float LLLI;
    public final Rect LLLII;
    public final RectF LLLIIII;
    public final Paint LLLIIIIL;
    public C368500Eca LLLIIIL;
    public Function0<Boolean> LLLIIL;

    private final TuxIconDrawable getLeftHandleIcon() {
        return (TuxIconDrawable) this.LLJI.getValue();
    }

    private final TuxIconDrawable getRightHandleIcon() {
        return (TuxIconDrawable) this.LLJIJIL.getValue();
    }

    public final boolean LIZIZ() {
        return ((Boolean) this.LLJJIJIIJIL.getValue()).booleanValue();
    }

    public final C368500Eca getLeftHandler() {
        return this.LLJJJ;
    }

    public final C368500Eca getRightHandler() {
        return this.LLJJJIL;
    }

    public final C368500Eca getTargetHandler() {
        return this.LLLIIIL;
    }

    public final Function0<Boolean> getTouchInterceptor() {
        return this.LLLIIL;
    }

    public final void LIZLLL(boolean z) {
        if (this.LLJLILLLLZIIL != (!z)) {
            this.LLJLILLLLZIIL = !z;
            invalidate();
        }
    }

    public final void LJ(boolean z) {
        if (this.LLJLL != (!z)) {
            this.LLJLL = !z;
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        boolean z2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        super.onDraw(canvas);
        C0E6E c0e6e = this.LLILLJJLI;
        if (c0e6e == C0E6E.NONE) {
            return;
        }
        boolean z3 = true;
        if (c0e6e == C0E6E.LINE) {
            this.LLJJIJIL.setColor(this.LLJJL);
            if (this.LLILZIL && C369140Edc.LIZ() && this.LLILZLL && !this.LLIZ) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.LLJJIJI.reset();
                float f9 = this.LLJJJJJIL;
                if (LIZIZ()) {
                    f6 = 0.0f;
                } else {
                    f6 = f9;
                }
                if (LIZIZ()) {
                    f7 = f9;
                } else {
                    f7 = 0.0f;
                }
                if (LIZIZ()) {
                    f8 = f9;
                } else {
                    f8 = 0.0f;
                }
                if (LIZIZ()) {
                    f9 = 0.0f;
                }
                float[] fArr = this.LLJJIII;
                fArr[0] = f6;
                fArr[1] = f6;
                fArr[2] = f7;
                fArr[3] = f7;
                fArr[4] = f8;
                fArr[5] = f8;
                fArr[6] = f9;
                fArr[7] = f9;
                this.LLJJIJI.addRoundRect(this.LLJJ, fArr, Path.Direction.CCW);
                canvas.drawPath(this.LLJJIJI, this.LLJJIJIL);
            } else {
                RectF rectF = this.LLJJ;
                float f10 = this.LLJJJJJIL;
                canvas.drawRoundRect(rectF, f10, f10, this.LLJJIJIL);
            }
            this.LLJJIJIL.setColor(this.LLJJLIIIJLLLLLLLZ);
            if (z2) {
                this.LLJJIJI.reset();
                float f11 = this.LLJJJJLIIL;
                if (LIZIZ()) {
                    f3 = 0.0f;
                } else {
                    f3 = f11;
                }
                if (LIZIZ()) {
                    f4 = f11;
                } else {
                    f4 = 0.0f;
                }
                if (LIZIZ()) {
                    f5 = f11;
                } else {
                    f5 = 0.0f;
                }
                if (LIZIZ()) {
                    f11 = 0.0f;
                }
                float[] fArr2 = this.LLJJIII;
                fArr2[0] = f3;
                fArr2[1] = f3;
                fArr2[2] = f4;
                fArr2[3] = f4;
                fArr2[4] = f5;
                fArr2[5] = f5;
                fArr2[6] = f11;
                fArr2[7] = f11;
                this.LLJJIJI.addRoundRect(this.LLJJI, fArr2, Path.Direction.CCW);
                canvas.drawPath(this.LLJJIJI, this.LLJJIJIL);
                return;
            }
            RectF rectF2 = this.LLJJI;
            float f12 = this.LLJJJJLIIL;
            canvas.drawRoundRect(rectF2, f12, f12, this.LLJJIJIL);
            return;
        }
        if (c0e6e == C0E6E.CLIP) {
            if ((this.LLJLL && !LIZIZ()) || (this.LLJLILLLLZIIL && LIZIZ())) {
                z = true;
            } else {
                z = false;
            }
            if ((!this.LLJLILLLLZIIL || LIZIZ()) && (!this.LLJLL || !LIZIZ())) {
                z3 = false;
            }
            if (z) {
                this.LLJILJIL.set(0, 0, 0, 0);
                this.LLJILJILJ.set(getWidth() - this.LL.LJFF, 0, getWidth(), getHeight());
            } else {
                if (z3) {
                    this.LLJILJIL.set(0, 0, this.LL.LJFF, getHeight());
                    this.LLJILJILJ.set(0, 0, 0, 0);
                } else {
                    this.LLJILJIL.set(0, 0, this.LL.LJFF, getHeight());
                    this.LLJILJILJ.set(getWidth() - this.LL.LJFF, 0, getWidth(), getHeight());
                }
                if (this.LLJLLIL) {
                    LIZ(EnumC368410EcR.LEFT, canvas);
                } else {
                    Drawable drawable = this.LLIZLLLIL;
                    if (drawable != null) {
                        drawable.setBounds(this.LLJILJIL);
                        drawable.draw(canvas);
                    }
                }
            }
            if (!z3) {
                if (this.LLJLLIL) {
                    LIZ(EnumC368410EcR.RIGHT, canvas);
                } else {
                    Drawable drawable2 = this.LLJ;
                    if (drawable2 != null) {
                        drawable2.setBounds(this.LLJILJILJ);
                        drawable2.draw(canvas);
                    }
                }
            }
            this.LLJJIJIL.setColor(this.LLJJL);
            if (this.LLILLL) {
                if (this.LLJLLIL) {
                    return;
                }
                this.LLJJIJIL.setStyle(Paint.Style.STROKE);
                this.LLJJIJIL.setStrokeWidth(this.LL.LJI);
                C368390EcP c368390EcP = this.LL;
                float f13 = c368390EcP.LJFF;
                float f14 = c368390EcP.LJI / 2;
                float width = getWidth() - this.LL.LJFF;
                float height = getHeight();
                C368390EcP c368390EcP2 = this.LL;
                float f15 = height - (c368390EcP2.LJI / 2);
                if (!this.LLJLL && !this.LLJLILLLLZIIL) {
                    canvas.drawRect(c368390EcP2.LJFF, f14, getWidth() - this.LL.LJFF, f15, this.LLJJIJIL);
                } else if (z) {
                    canvas.drawLine(f13, f14, width, f14, this.LLJJIJIL);
                    canvas.drawLine(width, f14, width, f15, this.LLJJIJIL);
                    width = width;
                    canvas.drawLine(width, f15, f13, f15, this.LLJJIJIL);
                } else if (z3) {
                    canvas.drawLine(width, f14, f13, f14, this.LLJJIJIL);
                    canvas.drawLine(f13, f14, f13, f15, this.LLJJIJIL);
                    canvas.drawLine(f13, f15, width, f15, this.LLJJIJIL);
                }
                if (this.LLILZ && getWidth() > this.LL.LJFF * 2) {
                    RectF rectF3 = this.LLLIIII;
                    RectF rectF4 = this.LLJJI;
                    rectF3.set(0.0f, 0.0f, rectF4.right - this.LLL, rectF4.bottom);
                    canvas.save();
                    canvas.clipRect(this.LLLIIII);
                    String strLIZ = C367880Eba.LIZ((long) ((getWidth() - (this.LL.LJFF * 2)) / C360610EBv.LIZJ()));
                    this.LLJZ.getTextBounds(strLIZ, 0, strLIZ.length(), this.LLLII);
                    float fWidth = this.LLLII.width() + (2 * this.LLLFZ);
                    if (LIZIZ()) {
                        f = width - this.LLLF;
                    } else {
                        f = this.LLLF + f13;
                    }
                    if (LIZIZ()) {
                        f2 = f - fWidth;
                    } else {
                        f2 = f;
                    }
                    float f16 = this.LLLFF;
                    if (!LIZIZ()) {
                        f += fWidth;
                    }
                    float f18 = this.LLLFFI + f16;
                    float f19 = this.LLL;
                    canvas.drawRoundRect(f2, f16, f, f18, f19, f19, this.LLJZIJLIL);
                    canvas.drawText(strLIZ, f2 + this.LLLFZ, f18 - this.LLLI, this.LLJZ);
                    canvas.restore();
                    return;
                }
                return;
            }
            this.LLJJIJIL.setStyle(Paint.Style.FILL);
            canvas.drawRect(this.LL.LJFF, 0.0f, getWidth() - this.LL.LJFF, getHeight(), this.LLJJIJIL);
            this.LLJJIJIL.setColor(this.LLJJLIIIJLLLLLLLZ);
            C368390EcP c368390EcP3 = this.LL;
            canvas.drawRect(c368390EcP3.LJFF, c368390EcP3.LJI, getWidth() - this.LL.LJFF, getHeight() - this.LL.LJI, this.LLJJIJIL);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.09AY, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.09AY, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.09AY, kotlin.jvm.functions.Function2] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent;
        if (motionEvent == null || this.LLILLJJLI != C0E6E.CLIP) {
            return false;
        }
        Function0<Boolean> function0 = this.LLLIIL;
        if (function0 != null && !function0.invoke().booleanValue()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.LLLIIIL = null;
            if (this.LLJILJIL.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.LLLIIIL = this.LLJJJ;
            }
            if (this.LLJILJILJ.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.LLLIIIL = this.LLJJJIL;
            }
        }
        if (this.LLJLLL) {
            zOnTouchEvent = super.onTouchEvent(motionEvent);
        } else {
            zOnTouchEvent = false;
        }
        C368500Eca c368500Eca = this.LLLIIIL;
        if (c368500Eca != null) {
            if (!c368500Eca.LJ) {
                return false;
            }
            Integer numValueOf = Integer.valueOf(motionEvent.getAction());
            if (numValueOf != null) {
                if (numValueOf.intValue() == 0) {
                    c368500Eca.LJFF = motionEvent.getRawX();
                    c368500Eca.LIZ = motionEvent.getX();
                    c368500Eca.LJI = motionEvent.getRawX();
                    ?? r1 = c368500Eca.LIZLLL;
                    if (r1 != 0) {
                        r1.invoke(this, Float.valueOf(c368500Eca.LIZ));
                    }
                } else if (numValueOf.intValue() == 2) {
                    ?? r2 = c368500Eca.LIZIZ;
                    if (r2 != 0) {
                        r2.invoke(Float.valueOf(motionEvent.getRawX() - c368500Eca.LJI), Float.valueOf(motionEvent.getRawX()));
                    }
                    c368500Eca.LJI = motionEvent.getRawX();
                } else if (numValueOf.intValue() == 1) {
                    float rawX = motionEvent.getRawX();
                    ?? r12 = c368500Eca.LIZJ;
                    if (r12 != 0) {
                        r12.invoke(Float.valueOf(rawX - c368500Eca.LJFF));
                    }
                }
            }
            return true;
        }
        return zOnTouchEvent;
    }

    public final void setAiExtendVisible$editor_trackpanel_release(boolean z) {
        this.LLILZLL = z;
    }

    public final void setDragMode(boolean z) {
        this.LLIZ = z;
        invalidate();
    }

    public final void setEnableClick(boolean z) {
        this.LLJLLL = z;
    }

    public final void setHandlerGone(boolean z) {
        this.LLJL = z;
    }

    public final void setHollowOutDrawClipStyle$editor_trackpanel_release(boolean z) {
        this.LLILLL = z;
    }

    public final void setIsAiExtendVisible(boolean z) {
        this.LLILZLL = z;
        invalidate();
    }

    public final void setIsLastSlot(boolean z) {
        this.LLILZIL = z;
        invalidate();
    }

    public final void setLastSlot$editor_trackpanel_release(boolean z) {
        this.LLILZIL = z;
    }

    public final void setNeedDrawDurationTag$editor_trackpanel_release(boolean z) {
        this.LLILZ = z;
    }

    public final void setTargetHandler(C368500Eca c368500Eca) {
        this.LLLIIIL = c368500Eca;
    }

    public final void setTouchInterceptor(Function0<Boolean> function0) {
        this.LLLIIL = function0;
    }

    public C368400EcQ(Context context, AttributeSet attributeSet) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        super(context, attributeSet, 0);
        Typeface typeface = C368130Ebz.LIZ;
        C368390EcP c368390EcPLIZ = C368130Ebz.LIZ(getContext());
        this.LL = c368390EcPLIZ;
        this.LLILLJJLI = C0E6E.NONE;
        this.LLIZLLLIL = c368390EcPLIZ.LIZ;
        this.LLJ = c368390EcPLIZ.LIZIZ;
        this.LLJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1214));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1216));
        this.LLJILJIL = new Rect();
        this.LLJILJILJ = new Rect();
        this.LLJILLL = new RectF();
        this.LLJJ = new RectF();
        this.LLJJI = new RectF();
        this.LLJJIII = new float[8];
        this.LLJJIJI = new Path();
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1213));
        Paint paint = new Paint();
        this.LLJJIJIL = paint;
        this.LLJJJ = new C368500Eca();
        this.LLJJJIL = new C368500Eca();
        this.LLJJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
        float f = c368390EcPLIZ.LJ;
        this.LLJJJJJIL = f;
        this.LLJJJJLIIL = f / 2.0f;
        Integer num = c368390EcPLIZ.LIZJ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        this.LLJJL = iIntValue;
        Integer num2 = c368390EcPLIZ.LIZLLL;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = -16777216;
        }
        this.LLJJLIIIJLLLLLLLZ = iIntValue2;
        Integer num3 = c368390EcPLIZ.LJIIJJI;
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = -7829368;
        }
        Paint paint2 = new Paint();
        this.LLJZ = paint2;
        Paint paint3 = new Paint();
        this.LLJZIJLIL = paint3;
        Typeface typeface2 = C368130Ebz.LIZ;
        this.LLL = C0FU0.LIZ(2.0f);
        this.LLLF = C0FU0.LIZ(2.0f);
        this.LLLFF = C0FU0.LIZ(3.0f);
        this.LLLFFI = C0FU0.LIZ(16.0f);
        this.LLLFZ = C0FU0.LIZ(4.0f);
        this.LLLI = C0FU0.LIZ(4.0f);
        this.LLLII = new Rect();
        this.LLLIIII = new RectF();
        Paint paint4 = new Paint();
        this.LLLIIIIL = paint4;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iIntValue);
        paint.setAntiAlias(true);
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(iIntValue3);
        paint2.setAntiAlias(true);
        paint2.setTextSize(C0FU0.LIZ(12.0f));
        paint2.setTypeface(typeface2);
        paint2.setColor(iIntValue);
        paint4.setAntiAlias(true);
        paint4.setStyle(Paint.Style.FILL);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, getContext());
        if (numLIZJ != null) {
            paint4.setColor(numLIZJ.intValue());
        }
    }

    public final void LIZ(EnumC368410EcR enumC368410EcR, Canvas canvas) {
        TuxIconDrawable rightHandleIcon;
        EnumC368410EcR enumC368410EcR2 = EnumC368410EcR.LEFT;
        if (enumC368410EcR == enumC368410EcR2) {
            rightHandleIcon = getLeftHandleIcon();
        } else {
            rightHandleIcon = getRightHandleIcon();
        }
        if (enumC368410EcR == enumC368410EcR2) {
            this.LLJILLL.set(this.LLJILJIL);
        } else {
            this.LLJILLL.set(this.LLJILJILJ);
        }
        canvas.drawRoundRect(this.LLJILLL, C0FU0.LIZ(8.0f), C0FU0.LIZ(8.0f), this.LLLIIIIL);
        int iCenterX = (int) this.LLJILLL.centerX();
        int iCenterY = (int) this.LLJILLL.centerY();
        int i = this.LLJJJJ / 2;
        rightHandleIcon.setBounds(iCenterX - i, iCenterY - i, iCenterX + i, iCenterY + i);
        rightHandleIcon.draw(canvas);
    }

    public final void LIZJ(C0E6E c0e6e, boolean z) {
        this.LLILLJJLI = c0e6e;
        this.LLIZ = false;
        setHandlerGone(false);
        C368390EcP c368390EcP = this.LL;
        this.LLJJJJLIIL = c368390EcP.LJIIIIZZ;
        this.LLJJJJJIL = c368390EcP.LJ;
        if (z) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(500L);
            setAnimation(alphaAnimation);
            this.LLJLIL = alphaAnimation;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (this.LLJL) {
            this.LLJILJIL.set(0, 0, 0, 0);
            this.LLJILJILJ.set(0, 0, 0, 0);
            float f = 0;
            this.LLJJ.set(f, f, i5, i6);
            RectF rectF = this.LLJJI;
            float f2 = this.LL.LJI;
            rectF.set(f2, f2, i5 - r0, i6 - r0);
            return;
        }
        boolean z3 = true;
        if ((this.LLJLL && !LIZIZ()) || (this.LLJLILLLLZIIL && LIZIZ())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((!this.LLJLILLLLZIIL || LIZIZ()) && (!this.LLJLL || !LIZIZ())) {
            z3 = false;
        }
        if (z2) {
            this.LLJILJIL.set(0, 0, 0, 0);
            this.LLJILJILJ.set(i5 - this.LL.LJFF, 0, i5, i6);
        } else if (z3) {
            this.LLJILJIL.set(0, 0, this.LL.LJFF, i6);
            this.LLJILJILJ.set(0, 0, 0, 0);
        } else {
            this.LLJILJIL.set(0, 0, this.LL.LJFF, i6);
            this.LLJILJILJ.set(i5 - this.LL.LJFF, 0, i5, i6);
        }
        RectF rectF2 = this.LLJJ;
        C368390EcP c368390EcP = this.LL;
        int i7 = c368390EcP.LJFF;
        int i8 = c368390EcP.LJI;
        rectF2.set(i7 - i8, 0, (i5 - i7) + i8, i6);
        RectF rectF3 = this.LLJJI;
        C368390EcP c368390EcP2 = this.LL;
        rectF3.set(c368390EcP2.LJFF, c368390EcP2.LJI, i5 - r1, i6 - r0);
    }
}
