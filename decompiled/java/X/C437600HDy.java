package X;

import Y.ALAdapterS3S0200000_6;
import Y.AUListenerS66S0101000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HDy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437600HDy extends View {
    public final float LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final AtomicBoolean LLJJI;
    public Bitmap LLJJIII;
    public Bitmap LLJJIJI;
    public Bitmap LLJJIJIIJIL;
    public Bitmap LLJJIJIL;
    public Bitmap LLJJJ;
    public Bitmap LLJJJIL;
    public Bitmap LLJJJJ;
    public Canvas LLJJJJJIL;
    public C0HE1[] LLJJJJLIIL;
    public C0HE1[] LLJJL;
    public C0HE1[] LLJJLIIIJLLLLLLLZ;
    public AnonymousClass0956 LLJL;
    public AnonymousClass0956 LLJLIL;
    public AnonymousClass0956 LLJLILLLLZIIL;
    public AnonymousClass0956 LLJLL;
    public AnonymousClass0956 LLJLLIL;
    public boolean LLJLLL;

    private final Paint getBallOverlapPaint() {
        return (Paint) this.LLJIJIL.getValue();
    }

    private final Paint getDotPaint() {
        return (Paint) this.LLJI.getValue();
    }

    private final Paint getGridAlphaPaint() {
        return (Paint) this.LLJILJILJ.getValue();
    }

    private final Paint getGridMaskPaint() {
        return (Paint) this.LLJILJIL.getValue();
    }

    private final Paint getLinePaint() {
        return (Paint) this.LLJ.getValue();
    }

    public final void LIZIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LLJL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLJLIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09563 = this.LLJLILLLLZIIL;
        if (anonymousClass09563 != null) {
            anonymousClass09563.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09564 = this.LLJLL;
        if (anonymousClass09564 != null) {
            anonymousClass09564.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09565 = this.LLJLLIL;
        if (anonymousClass09565 != null) {
            anonymousClass09565.LIZIZ(null);
        }
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
    }

    public final InterpolatorC1088790eRJ getFadeInInterpolator() {
        return (InterpolatorC1088790eRJ) this.LLJILLL.getValue();
    }

    public final InterpolatorC1088790eRJ getFadeOutInterpolator() {
        return (InterpolatorC1088790eRJ) this.LLJJ.getValue();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.LLJJIII;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        this.LLJJIII = null;
        Bitmap bitmap2 = this.LLJJIJI;
        if (bitmap2 != null) {
            bitmap2.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
        }
        this.LLJJIJI = null;
        Bitmap bitmap3 = this.LLJJIJIIJIL;
        if (bitmap3 != null) {
            bitmap3.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap3);
        }
        this.LLJJIJIIJIL = null;
        Bitmap bitmap4 = this.LLJJIJIL;
        if (bitmap4 != null) {
            bitmap4.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap4);
        }
        this.LLJJIJIL = null;
        Bitmap bitmap5 = this.LLJJJ;
        if (bitmap5 != null) {
            bitmap5.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap5);
        }
        this.LLJJJ = null;
        Bitmap bitmap6 = this.LLJJJIL;
        if (bitmap6 != null) {
            bitmap6.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap6);
        }
        this.LLJJJIL = null;
        Bitmap bitmap7 = this.LLJJJJ;
        if (bitmap7 != null) {
            bitmap7.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap7);
        }
        this.LLJJJJ = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C0HE1[] c0he1Arr;
        Canvas canvas2;
        Canvas canvas3;
        if (this.LLJJI.get()) {
            if (this.LLJLLL) {
                c0he1Arr = this.LLJJL;
            } else {
                c0he1Arr = this.LLJJJJLIIL;
            }
            this.LLJJLIIIJLLLLLLLZ = c0he1Arr;
            Canvas canvas4 = this.LLJJJJJIL;
            if (canvas4 != null) {
                canvas4.drawColor(0, PorterDuff.Mode.CLEAR);
            }
            C0HE1[] c0he1Arr2 = this.LLJJLIIIJLLLLLLLZ;
            if (c0he1Arr2 != null) {
                for (C0HE1 c0he1 : c0he1Arr2) {
                    Canvas canvas5 = this.LLJJJJJIL;
                    getBallOverlapPaint().setAlpha(c0he1.LIZLLL);
                    int i = C0HE0.LIZ[c0he1.LIZJ.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    Bitmap bitmap = this.LLJJIJI;
                                    if (bitmap != null && canvas5 != null) {
                                        canvas5.drawBitmap(bitmap, c0he1.LIZ, c0he1.LIZIZ, getBallOverlapPaint());
                                    }
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                Bitmap bitmap2 = this.LLJJIJIIJIL;
                                if (bitmap2 != null && canvas5 != null) {
                                    canvas5.drawBitmap(bitmap2, c0he1.LIZ, c0he1.LIZIZ, getBallOverlapPaint());
                                }
                            }
                        } else {
                            Bitmap bitmap3 = this.LLJJIJI;
                            if (bitmap3 != null && canvas5 != null) {
                                canvas5.drawBitmap(bitmap3, c0he1.LIZ, c0he1.LIZIZ, getBallOverlapPaint());
                            }
                        }
                    } else {
                        Bitmap bitmap4 = this.LLJJIII;
                        if (bitmap4 != null && canvas5 != null) {
                            canvas5.drawBitmap(bitmap4, c0he1.LIZ, c0he1.LIZIZ, getBallOverlapPaint());
                        }
                    }
                }
            }
            Bitmap bitmap5 = this.LLJJJIL;
            if (bitmap5 != null) {
                Canvas canvas6 = this.LLJJJJJIL;
                if (canvas6 != null) {
                    canvas6.drawBitmap(bitmap5, 0.0f, 0.0f, getGridMaskPaint());
                }
                Canvas canvas7 = this.LLJJJJJIL;
                if (canvas7 != null) {
                    canvas7.drawBitmap(bitmap5, 0.0f, 0.0f, getGridAlphaPaint());
                }
            }
            if (this.LLJLLL) {
                Bitmap bitmap6 = this.LLJJIJIL;
                if (bitmap6 != null && (canvas3 = this.LLJJJJJIL) != null) {
                    canvas3.drawBitmap(bitmap6, 0.0f, 0.0f, getGridMaskPaint());
                }
                Bitmap bitmap7 = this.LLJJJ;
                if (bitmap7 != null && (canvas2 = this.LLJJJJJIL) != null) {
                    canvas2.drawBitmap(bitmap7, 0.0f, (this.LLILZLL - this.LLILZ) * 1.0f, getGridMaskPaint());
                }
            }
            Bitmap bitmap8 = this.LLJJJJ;
            if (bitmap8 != null) {
                canvas.drawBitmap(bitmap8, 0.0f, 0.0f, (Paint) null);
            }
        }
        super.onDraw(canvas);
    }

    public C437600HDy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = 0.08f;
        this.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
        this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        this.LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
        this.LLJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(325));
        this.LLJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(481));
        this.LLJIJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(480));
        this.LLJILJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(485));
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(484));
        this.LLJILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(482));
        this.LLJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(483));
        this.LLJJI = new AtomicBoolean(false);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size != this.LLILZIL || size2 != this.LLILZLL) {
            this.LLILZIL = size;
            this.LLILZLL = size2;
            int i3 = this.LLILLJJLI;
            this.LLIZ = size2 / i3;
            this.LLIZLLLIL = size / i3;
            EnumC437610HDz enumC437610HDz = EnumC437610HDz.BIG;
            C0HE1 c0he1 = new C0HE1(0.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)) * (-1.0f), enumC437610HDz);
            c0he1.LIZLLL = 204;
            EnumC437610HDz enumC437610HDz2 = EnumC437610HDz.MID_A;
            C0HE1 c0he12 = new C0HE1(this.LLILZIL - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(123)) * 1.0f), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) * (-1.0f), enumC437610HDz2);
            c0he12.LIZLLL = 204;
            EnumC437610HDz enumC437610HDz3 = EnumC437610HDz.SMALL;
            EnumC437610HDz enumC437610HDz4 = EnumC437610HDz.MID_B;
            this.LLJJJJLIIL = new C0HE1[]{c0he1, c0he12, new C0HE1(this.LLILZIL - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(121)) * 1.0f), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(324)) * 1.0f, enumC437610HDz3), new C0HE1(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70)) * 1.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150)) * 1.0f, enumC437610HDz4), new C0HE1(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) * 1.0f, this.LLILZLL - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(154)) * 1.0f), enumC437610HDz4)};
            C0HE1 c0he13 = new C0HE1(0.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)) * 1.0f, enumC437610HDz);
            c0he13.LIZLLL = 204;
            C0HE1 c0he14 = new C0HE1(this.LLILZIL - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(131)) * 1.0f), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)) * 1.0f, enumC437610HDz2);
            c0he14.LIZLLL = 204;
            this.LLJJL = new C0HE1[]{c0he13, c0he14, new C0HE1(this.LLILZIL - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(121)) * 1.0f), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(396)) * 1.0f, enumC437610HDz3), new C0HE1(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70)) * 1.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(214)) * 1.0f, enumC437610HDz4), new C0HE1(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) * 1.0f, this.LLILZLL - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(254)) * 1.0f), enumC437610HDz4)};
            this.LLJJI.set(false);
            Bitmap bitmap = this.LLJJIJIL;
            if (bitmap != null) {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.LLILZIL, this.LLILZ, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LLILZ * 1.0f, 0, -1, Shader.TileMode.CLAMP));
            canvas.drawRect(0.0f, 0.0f, this.LLILZIL * 1.0f, this.LLILZ * 1.0f, paint);
            this.LLJJIJIL = bitmapCreateBitmap;
            Bitmap bitmap2 = this.LLJJJ;
            if (bitmap2 != null) {
                bitmap2.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.LLILZIL, this.LLILZ, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            Paint paint2 = new Paint();
            paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LLILZ * 1.0f, -1, 0, Shader.TileMode.CLAMP));
            canvas2.drawRect(0.0f, 0.0f, this.LLILZIL * 1.0f, this.LLILZ * 1.0f, paint2);
            this.LLJJJ = bitmapCreateBitmap2;
            Bitmap bitmap3 = this.LLJJIII;
            if (bitmap3 != null) {
                bitmap3.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap3);
            }
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(226)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(226)), Bitmap.Config.ARGB_8888);
            Canvas canvas3 = new Canvas(bitmapCreateBitmap3);
            float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(113)) * 1.0f;
            Paint paint3 = new Paint();
            paint3.setShader(new RadialGradient(fLIZIZ, fLIZIZ, fLIZIZ, new int[]{-855638017, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            canvas3.drawCircle(fLIZIZ, fLIZIZ, fLIZIZ, paint3);
            this.LLJJIII = bitmapCreateBitmap3;
            Bitmap bitmap4 = this.LLJJIJI;
            if (bitmap4 != null) {
                bitmap4.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap4);
            }
            Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(154)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(154)), Bitmap.Config.ARGB_8888);
            Canvas canvas4 = new Canvas(bitmapCreateBitmap4);
            float fLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(77)) * 1.0f;
            Paint paint4 = new Paint();
            paint4.setShader(new RadialGradient(fLIZIZ2, fLIZIZ2, fLIZIZ2, new int[]{-1, -1, 0}, new float[]{0.0f, 0.25f, 1.0f}, Shader.TileMode.CLAMP));
            canvas4.drawCircle(fLIZIZ2, fLIZIZ2, fLIZIZ2, paint4);
            this.LLJJIJI = bitmapCreateBitmap4;
            Bitmap bitmap5 = this.LLJJIJIIJIL;
            if (bitmap5 != null) {
                bitmap5.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap5);
            }
            Bitmap bitmapCreateBitmap5 = Bitmap.createBitmap(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(132)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(132)), Bitmap.Config.ARGB_8888);
            Canvas canvas5 = new Canvas(bitmapCreateBitmap5);
            float fLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(66)) * 1.0f;
            Paint paint5 = new Paint();
            paint5.setShader(new RadialGradient(fLIZIZ3, fLIZIZ3, fLIZIZ3, new int[]{-1, -1, 0}, new float[]{0.0f, 0.25f, 1.0f}, Shader.TileMode.CLAMP));
            canvas5.drawCircle(fLIZIZ3, fLIZIZ3, fLIZIZ3, paint5);
            this.LLJJIJIIJIL = bitmapCreateBitmap5;
            Bitmap bitmap6 = this.LLJJJIL;
            if (bitmap6 != null) {
                bitmap6.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap6);
            }
            Bitmap bitmapCreateBitmap6 = Bitmap.createBitmap(this.LLILZIL, this.LLILZLL, Bitmap.Config.ARGB_8888);
            Canvas canvas6 = new Canvas(bitmapCreateBitmap6);
            int i4 = this.LLIZ;
            int i5 = 0;
            while (i5 < i4) {
                i5++;
                float f = this.LLILLJJLI * i5 * 1.0f;
                canvas6.drawLine(0.0f, f, this.LLILZIL * 1.0f, f, getLinePaint());
            }
            int i6 = this.LLIZLLLIL;
            int i7 = 0;
            while (i7 < i6) {
                i7++;
                float f2 = this.LLILLJJLI * i7 * 1.0f;
                canvas6.drawLine(f2, 0.0f, f2, this.LLILZLL * 1.0f, getLinePaint());
            }
            int i8 = this.LLIZ;
            int i9 = 0;
            while (i9 < i8) {
                i9++;
                float f3 = this.LLILLJJLI * i9 * 1.0f;
                int i10 = this.LLIZLLLIL;
                int i11 = 0;
                while (i11 < i10) {
                    i11++;
                    canvas6.drawCircle(this.LLILLJJLI * i11 * 1.0f, f3, this.LLILLL * 1.0f, getDotPaint());
                }
            }
            this.LLJJJIL = bitmapCreateBitmap6;
            Bitmap bitmap7 = this.LLJJJJ;
            if (bitmap7 != null) {
                bitmap7.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap7);
            }
            Bitmap bitmapCreateBitmap7 = Bitmap.createBitmap(this.LLILZIL, this.LLILZLL, Bitmap.Config.ARGB_8888);
            this.LLJJJJ = bitmapCreateBitmap7;
            if (bitmapCreateBitmap7 != null) {
                this.LLJJJJJIL = new Canvas(bitmapCreateBitmap7);
            }
            this.LLJJI.set(true);
        }
        C1447470nlp.LIZ(this, this.LL);
        super.onMeasure(i, i2);
    }

    public final Object LIZ(int i, int i2, int i3, C09AX c09ax) {
        InterpolatorC1088790eRJ fadeOutInterpolator;
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c09ax));
        c2252611DEt.LJIJJ();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i3);
        valueAnimatorOfInt.setDuration(800L);
        if (i2 < i3) {
            fadeOutInterpolator = getFadeInInterpolator();
        } else {
            fadeOutInterpolator = getFadeOutInterpolator();
        }
        valueAnimatorOfInt.setInterpolator(fadeOutInterpolator);
        valueAnimatorOfInt.addListener(new ALAdapterS3S0200000_6(valueAnimatorOfInt, c2252611DEt, 28));
        valueAnimatorOfInt.addUpdateListener(new AUListenerS66S0101000_6(this, i, 1));
        valueAnimatorOfInt.start();
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c09ax);
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }
}
