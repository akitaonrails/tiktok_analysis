package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GX9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GX9 extends C21413918rB {
    public final TypedArray LLILLJJLI;
    public final C0GXA LLILLL;
    public long LLILZ;
    public final C415790GSb LLILZIL;
    public final C415790GSb LLILZLL;
    public int LLIZ;
    public final float LLIZLLLIL;
    public final Paint LLJ;
    public Function1<? super MotionEvent, Boolean> LLJI;
    public Function1<? super Integer, Integer> LLJIJIL;

    public final int getBottomDotColor() {
        return this.LLJ.getColor();
    }

    public final void LJI() {
        setThumb(Intrinsics.LJFF(getThumb(), this.LLILZIL) ? this.LLILZLL : this.LLILZIL);
    }

    @Override // X.C21413918rB, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        if (C12DO.LIZ()) {
            return;
        }
        super.drawableStateChanged();
    }

    public final TypedArray getAttributes() {
        return this.LLILLJJLI;
    }

    public final int getBottomDotProgress() {
        return this.LLIZ;
    }

    public final Function1<MotionEvent, Boolean> getInterceTouchEventCallBack() {
        return this.LLJI;
    }

    public final Function1<Integer, Integer> getProgressSnapper() {
        return this.LLJIJIL;
    }

    @Override // X.C21413918rB, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        float min;
        int max;
        float f;
        int i;
        int progress = getProgress();
        if (Build.VERSION.SDK_INT >= 26) {
            max = getMax() - getMin();
            if (max > 0) {
                min = (progress - getMin()) * 1.0f;
                f = min / max;
            }
            f = 0.0f;
        } else {
            if (getMax() > 0) {
                min = progress * 1.0f;
                max = getMax();
                f = min / max;
            }
            f = 0.0f;
        }
        boolean zLJI = C11VU.LJI(this);
        canvas.save();
        C0GXA c0gxa = this.LLILLL;
        Context context = getContext();
        c0gxa.LJIIIZ = zLJI;
        c0gxa.LJIIJ = f;
        if (c0gxa.LJI) {
            TuxIconDrawable tuxIconDrawable = c0gxa.LJFF;
            if (f >= 0.055f) {
                i = R.attr.zg;
            } else {
                i = R.attr.eh;
            }
            tuxIconDrawable.LJI(i, context);
        }
        C415790GSb c415790GSb = this.LLILZIL;
        Rect bounds = this.LLILLL.getBounds();
        c415790GSb.LJIIIIZZ = f;
        c415790GSb.LJIIIZ = bounds;
        c415790GSb.LJIIJ = zLJI;
        C415790GSb c415790GSb2 = this.LLILZLL;
        Rect bounds2 = this.LLILLL.getBounds();
        c415790GSb2.LJIIIIZZ = f;
        c415790GSb2.LJIIIZ = bounds2;
        c415790GSb2.LJIIJ = zLJI;
        canvas.translate(getPaddingStart(), 0.0f);
        this.LLILLL.draw(canvas);
        getThumb().draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Function1<? super Integer, Integer> function1;
        int iIntValue;
        if (motionEvent.getAction() == 0 && !isEnabled() && this.LLILLJJLI.getBoolean(R$styleable.NewProgressSeekBar_np_toastWhenDisable, false) && System.currentTimeMillis() - this.LLILZ >= 500) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(this.LLILLJJLI.getResourceId(R$styleable.NewProgressSeekBar_np_toast, 0));
            C1390380mHk.LIZLLL(this, 3026, creativeToastBuilder);
            this.LLILZ = System.currentTimeMillis();
        }
        Function1<? super MotionEvent, Boolean> function12 = this.LLJI;
        if (function12 != null && function12.invoke(motionEvent).booleanValue()) {
            return true;
        }
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (isEnabled() && (function1 = this.LLJIJIL) != null && (iIntValue = function1.invoke(Integer.valueOf(getProgress())).intValue()) != getProgress()) {
            setProgress(iIntValue);
        }
        return zOnTouchEvent;
    }

    public final void setBackgroundColorRes(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            this.LLILLL.LIZIZ = numLIZJ.intValue();
        }
    }

    public final void setBottomDotColor(int i) {
        if (this.LLJ.getColor() != i) {
            this.LLJ.setColor(i);
            invalidate();
            Object parent = getParent();
            while (parent instanceof View) {
                View view = (View) parent;
                view.invalidate();
                parent = view.getParent();
            }
        }
    }

    public final void setBottomDotProgress(int i) {
        if (this.LLIZ != i) {
            this.LLIZ = i;
            invalidate();
            Object parent = getParent();
            while (parent instanceof View) {
                View view = (View) parent;
                view.invalidate();
                parent = view.getParent();
            }
        }
    }

    public final void setInterceTouchEventCallBack(Function1<? super MotionEvent, Boolean> function1) {
        this.LLJI = function1;
    }

    public final void setProgressColorRes(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            this.LLILLL.LIZ = numLIZJ.intValue();
        }
    }

    public final void setProgressSnapper(Function1<? super Integer, Integer> function1) {
        this.LLJIJIL = function1;
    }

    public final void setThumbColorRes(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            this.LLILZIL.LIZLLL = iIntValue;
            this.LLILZLL.LIZLLL = iIntValue;
        }
    }

    public final void setThumbShadowColorRes(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            this.LLILZIL.LJFF = iIntValue;
            this.LLILZLL.LJFF = iIntValue;
        }
    }

    public C0GX9(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, android.R.attr.seekBarStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NewProgressSeekBar);
        this.LLILLJJLI = typedArrayObtainStyledAttributes;
        C0GXA c0gxa = new C0GXA(context, attributeSet);
        this.LLILLL = c0gxa;
        C415790GSb c415790GSb = new C415790GSb(context, attributeSet, typedArrayObtainStyledAttributes.getDimension(R$styleable.NewProgressSeekBar_np_thumbSize, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), typedArrayObtainStyledAttributes.getDimension(R$styleable.NewProgressSeekBar_np_thumbRegHeight, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46))));
        this.LLILZIL = c415790GSb;
        this.LLILZLL = new C415790GSb(context, attributeSet, typedArrayObtainStyledAttributes.getDimension(R$styleable.NewProgressSeekBar_np_thumbDragSize, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(19))), typedArrayObtainStyledAttributes.getDimension(R$styleable.NewProgressSeekBar_np_thumbDragHeight, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(55))));
        this.LLIZ = -1;
        this.LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a01, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setColor(iIntValue);
        this.LLJ = paint;
        setThumb(c415790GSb);
        setProgressDrawable(c0gxa);
        setSplitTrack(true);
    }
}
