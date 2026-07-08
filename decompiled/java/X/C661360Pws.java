package X;

import Y.AUListenerS260S0100000_10;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661360Pws extends Drawable implements C0QMP {
    public final Bitmap LL;
    public final Context LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ;
    public final Paint LLILZIL;
    public boolean LLILZLL;
    public float LLIZ;
    public ValueAnimator LLIZLLLIL;
    public final Rect LLJ;
    public int LLJI;
    public final Rect LLJIJIL;
    public float LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public final int LLJJIII;
    public boolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public C661370Pwt LLJJJJ;

    @Override // X.C0QMP
    public final C661360Pws LIZ() {
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void LJ() {
        if (this.LLJJJJ == null) {
            this.LLJJJJ = new C661370Pwt(this.LLILZLL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIJI, this.LLIZ);
        }
        C661370Pwt c661370Pwt = this.LLJJJJ;
        if (c661370Pwt != null) {
            c661370Pwt.LIZ = this.LLILZLL;
            c661370Pwt.LIZIZ = this.LLJILJIL;
            c661370Pwt.LIZJ = this.LLJILJILJ;
            c661370Pwt.LIZLLL = this.LLJILLL;
            c661370Pwt.LJ = this.LLJJ;
            c661370Pwt.LJFF = this.LLJJI;
            c661370Pwt.LJI = this.LLJJIJI;
            c661370Pwt.LJII = this.LLIZ;
        }
    }

    public final Rect LJI() {
        return (Rect) this.LLJJJIL.getValue();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        C661370Pwt c661370Pwt;
        C661370Pwt c661370Pwt2 = this.LLJJJJ;
        if (c661370Pwt2 != null && this.LLILZLL == c661370Pwt2.LIZ && this.LLJJIJI == c661370Pwt2.LJI) {
            if (Intrinsics.LIZ(this.LLJILJIL, c661370Pwt2 != null ? Float.valueOf(c661370Pwt2.LIZIZ) : null) && (c661370Pwt = this.LLJJJJ) != null && this.LLJILJILJ == c661370Pwt.LIZJ && this.LLJILLL == c661370Pwt.LIZLLL && this.LLJJ == c661370Pwt.LJ && this.LLJJI == c661370Pwt.LJFF) {
                if (Intrinsics.LIZ(this.LLIZ, c661370Pwt != null ? Float.valueOf(c661370Pwt.LJII) : null)) {
                    return;
                }
            }
        }
        super.invalidateSelf();
    }

    public final void LIZLLL() {
        if (C301270BrR.LIZ()) {
            float f = this.LLILZLL ? 1.0f : 0.0f;
            ValueAnimator valueAnimator = this.LLIZLLLIL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.LLIZLLLIL = null;
            this.LLIZ = f;
        }
        this.LLJJIJI = false;
        invalidateSelf();
    }

    public final Drawable LJFF(int i) {
        int iIntValue;
        Integer numLIZJ;
        GradientDrawable gradientDrawable = new GradientDrawable();
        Context context = this.LLILLJJLI;
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        gradientDrawable.setColor(iIntValue);
        float f = this.LLJJIII;
        if (i != 0) {
            if (i == 1) {
                gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f});
            }
            return gradientDrawable;
        }
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
        return gradientDrawable;
    }

    public final void LJII(boolean z) {
        float f;
        if (!C301270BrR.LIZ()) {
            this.LLILZLL = z;
            invalidateSelf();
            return;
        }
        if (z == this.LLILZLL) {
            return;
        }
        this.LLILZLL = z;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator valueAnimator = this.LLIZLLLIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.LLIZ, f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS260S0100000_10(this, 9));
        valueAnimatorOfFloat.start();
        this.LLIZLLLIL = valueAnimatorOfFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iLIZIZ;
        if (!C301270BrR.LIZ() ? this.LLILZLL : this.LLIZ > 0.0f) {
            if (this.LLJILJILJ > 0 && this.LLJJIJI) {
                canvas.translate(0.0f, this.LLJILJIL);
                float width = (this.LL.getWidth() * 1.0f) / this.LLJILLL;
                int i = (int) (this.LLJI * width);
                int height = this.LL.getHeight();
                if (i > height) {
                    i = height;
                }
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) ((this.LLJI + this.LLJILJILJ) * width);
                int height2 = this.LL.getHeight();
                if (i2 > height2) {
                    i2 = height2;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                this.LLJ.set(0, i, this.LL.getWidth(), i2);
                if (C301270BrR.LIZ()) {
                    iLIZIZ = C814420VxA.LIZIZ((i2 - i) / width);
                    int i3 = this.LLJILJILJ;
                    if (iLIZIZ > i3) {
                        iLIZIZ = i3;
                    }
                } else {
                    iLIZIZ = this.LLJILJILJ;
                }
                this.LLJIJIL.set(0, 0, this.LLJILLL, iLIZIZ);
                if (C301270BrR.LIZ()) {
                    this.LLILZIL.setAlpha(C13LZ.LJ((int) (this.LLIZ * 255), 0, 255));
                }
                if (!this.LL.isRecycled()) {
                    canvas.drawBitmap(this.LL, this.LLJ, this.LLJIJIL, this.LLILZIL);
                }
                if (this.LLILLL) {
                    Rect rect = this.LLJIJIL;
                    int i4 = this.LLJJ;
                    int i5 = this.LLJJI;
                    Drawable drawable = (Drawable) this.LLJJIJIL.getValue();
                    int i6 = rect.left;
                    int i7 = rect.bottom;
                    drawable.setBounds(i6, i7 - this.LLJJIII, rect.right, i7);
                    ((Drawable) this.LLJJIJIL.getValue()).draw(canvas);
                    if (i4 > 0 && i5 > 0) {
                        LJI().set(rect.left, i4 - this.LLJJIII, rect.right, i4);
                        ((Drawable) this.LLJJJ.getValue()).setBounds(LJI());
                        ((GradientDrawable) this.LLJJJ.getValue()).draw(canvas);
                        ((Drawable) this.LLJJIJIIJIL.getValue()).setBounds(LJI());
                        ((Drawable) this.LLJJIJIIJIL.getValue()).draw(canvas);
                        Rect rectLJI = LJI();
                        rectLJI.top = i5;
                        rectLJI.bottom = i5 + this.LLJJIII;
                        ((Drawable) this.LLJJJ.getValue()).setBounds(LJI());
                        ((GradientDrawable) this.LLJJJ.getValue()).draw(canvas);
                        ((Drawable) this.LLJJIJIL.getValue()).setBounds(LJI());
                        ((Drawable) this.LLJJIJIL.getValue()).draw(canvas);
                    }
                }
                LJ();
                return;
            }
        }
        canvas.drawColor(this.LLILZ);
        LJ();
    }

    @Override // X.C0QMP
    public final void LIZIZ(int i, int i2) {
        this.LLJI = i;
        this.LLJILJILJ = i2;
        invalidateSelf();
    }

    @Override // X.C0QMP
    public final void LIZJ(Integer num, Integer num2) {
        if (num != null) {
            this.LLJILJILJ = num.intValue();
        }
        if (num2 != null) {
            this.LLJILLL = num2.intValue();
        }
    }

    public C661360Pws(Bitmap bitmap, Context context, boolean z, int i, int i2, int i3) {
        z = (i3 & 4) != 0 ? false : z;
        i = (i3 & 8) != 0 ? 0 : i;
        i2 = (i3 & 16) != 0 ? 0 : i2;
        this.LL = bitmap;
        this.LLILLJJLI = context;
        this.LLILLL = z;
        this.LLILZ = i2;
        this.LLILZIL = new Paint();
        this.LLILZLL = !C301270BrR.LIZ();
        this.LLJ = new Rect();
        this.LLJIJIL = new Rect();
        this.LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1101));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1102));
        this.LLJJJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1100));
        this.LLJJJIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(567));
    }
}
