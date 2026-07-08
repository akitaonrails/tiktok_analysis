package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GX7, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GX7 extends C21413918rB {
    public final TypedArray LLILLJJLI;
    public final C0GX8 LLILLL;
    public long LLILZ;
    public final C415780GSa LLILZIL;
    public final C415780GSa LLILZLL;

    public final void LJI() {
        setThumb(Intrinsics.LJFF(getThumb(), this.LLILZIL) ? this.LLILZLL : this.LLILZIL);
    }

    @Override // X.C21413918rB, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public final TypedArray getAttributes() {
        return this.LLILLJJLI;
    }

    @Override // X.C21413918rB, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        float min;
        int max;
        float f;
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
        C0GX8 c0gx8 = this.LLILLL;
        Context context = getContext();
        c0gx8.LJIIIZ = zLJI;
        c0gx8.LJIIJ = f;
        if (c0gx8.LJI) {
            c0gx8.LJFF.LJI(R.attr.zg, context);
        }
        C415780GSa c415780GSa = this.LLILZIL;
        Rect bounds = this.LLILLL.getBounds();
        c415780GSa.LJII = f;
        c415780GSa.LJIIIIZZ = bounds;
        c415780GSa.LJIIIZ = zLJI;
        C415780GSa c415780GSa2 = this.LLILZLL;
        Rect bounds2 = this.LLILLL.getBounds();
        c415780GSa2.LJII = f;
        c415780GSa2.LJIIIIZZ = bounds2;
        c415780GSa2.LJIIIZ = zLJI;
        canvas.translate(getPaddingStart(), 0.0f);
        this.LLILLL.draw(canvas);
        getThumb().draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !isEnabled() && this.LLILLJJLI.getBoolean(R$styleable.LiveMusicProgressSeekBar_np_toastWhenDisable, false) && System.currentTimeMillis() - this.LLILZ >= 500) {
            C766270U4b.LIZLLL(this.LLILLJJLI.getResourceId(R$styleable.LiveMusicProgressSeekBar_np_toast, 0));
            this.LLILZ = System.currentTimeMillis();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setBackgroundColorRes(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            this.LLILLL.LIZIZ = numLIZJ.intValue();
        }
    }

    public final void setProgressColorRes(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            this.LLILLL.LIZ = numLIZJ.intValue();
        }
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
            numLIZJ.intValue();
            this.LLILZIL.getClass();
            this.LLILZLL.getClass();
        }
    }

    public C0GX7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, android.R.attr.seekBarStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LiveMusicProgressSeekBar);
        this.LLILLJJLI = typedArrayObtainStyledAttributes;
        C0GX8 c0gx8 = new C0GX8(context, attributeSet);
        this.LLILLL = c0gx8;
        C415780GSa c415780GSa = new C415780GSa(context, attributeSet, typedArrayObtainStyledAttributes.getDimension(R$styleable.LiveMusicProgressSeekBar_np_thumbSize, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), typedArrayObtainStyledAttributes.getDimension(R$styleable.LiveMusicProgressSeekBar_np_thumbRegHeight, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46))));
        this.LLILZIL = c415780GSa;
        this.LLILZLL = new C415780GSa(context, attributeSet, typedArrayObtainStyledAttributes.getDimension(R$styleable.LiveMusicProgressSeekBar_np_thumbDragSize, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(19))), typedArrayObtainStyledAttributes.getDimension(R$styleable.LiveMusicProgressSeekBar_np_thumbDragHeight, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(55))));
        setThumb(c415780GSa);
        setProgressDrawable(c0gx8);
        setSplitTrack(true);
    }
}
