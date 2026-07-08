package X;

import Y.AUListenerS79S0110000_33;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19c1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21574719c1 extends FrameLayout {
    public final RectF LL;
    public final RectF LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public Rect LLILZIL;
    public Rect LLILZLL;
    public final Rect LLIZ;
    public final C19672911y3 LLIZLLLIL;
    public final C19672911y3 LLJ;

    public AbstractC21574719c1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC21574719c1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new RectF();
        this.LLILLJJLI = new RectF();
        this.LLIZ = new Rect();
        this.LLIZLLLIL = new C19672911y3(new Rect());
        this.LLJ = new C19672911y3(new Rect());
    }

    public boolean LIZJ(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final Animator LIZLLL(Rect rect, Rect rect2, boolean z) {
        this.LLILZIL = new Rect(rect);
        this.LLILZLL = new Rect(rect2);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS79S0110000_33(this, z, 0));
        return valueAnimatorOfFloat;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int iSave;
        boolean zLIZJ;
        if (this.LLILZ) {
            RectF rectF = this.LLILLJJLI;
            int iSave2 = canvas.save();
            canvas.clipRect(rectF);
            try {
                if (this.LLILLL) {
                    RectF rectF2 = this.LL;
                    iSave = canvas.save();
                    canvas.clipRect(rectF2);
                    try {
                        zLIZJ = LIZJ(canvas, view, j);
                        canvas.restoreToCount(iSave);
                    } finally {
                    }
                } else {
                    zLIZJ = LIZJ(canvas, view, j);
                }
                canvas.restoreToCount(iSave2);
                return zLIZJ;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.LLILLL) {
            RectF rectF3 = this.LL;
            iSave = canvas.save();
            canvas.clipRect(rectF3);
            try {
                boolean zLIZJ2 = LIZJ(canvas, view, j);
                canvas.restoreToCount(iSave);
                return zLIZJ2;
            } finally {
                TryCatchGuardChecker.doCheck(th);
                canvas.restoreToCount(iSave);
            }
        }
        return LIZJ(canvas, view, j);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLIZ.set(0, 0, getWidth(), getHeight());
    }
}
