package X;

import Y.AAListenerS341S0100000_31;
import Y.AUListenerS278S0100000_31;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.15fa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20577615fa extends View {
    public final ArrayList<Path> LL;
    public final ArrayList<Path> LLILLJJLI;
    public final ArrayList<PathMeasure> LLILLL;
    public final Paint LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public InterfaceC20578315fh LLIZ;
    public List<? extends List<Coordinate>> LLIZLLLIL;
    public boolean LLJ;
    public ValueAnimator LLJI;
    public int LLJIJIL;
    public float LLJILJIL;
    public boolean LLJILJILJ;

    public final boolean LIZ() {
        return this.LLJI.isRunning() || this.LLJI.isStarted();
    }

    public final ValueAnimator getAnimator() {
        return this.LLJI;
    }

    public final InterfaceC20578315fh getCompleteListener() {
        return this.LLIZ;
    }

    public final boolean getDynamicLength() {
        return this.LLJILJILJ;
    }

    public final float getLength() {
        return this.LLILZIL;
    }

    public final List<List<Coordinate>> getPoints() {
        return this.LLIZLLLIL;
    }

    public final float getRatio() {
        return this.LLJILJIL;
    }

    public final int getRepeatCount() {
        return this.LLJIJIL;
    }

    public final boolean getShowAnimation() {
        return this.LLJ;
    }

    public final float getValue() {
        return this.LLILZLL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        List<? extends List<Coordinate>> list;
        float f;
        super.onDraw(canvas);
        if (this.LLJ && (list = this.LLIZLLLIL) != null) {
            int i = 0;
            for (List<Coordinate> list2 : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    List<Coordinate> list3 = list2;
                    Path path = (Path) ListProtector.get(this.LL, i);
                    Path path2 = (Path) ListProtector.get(this.LLILLJJLI, i);
                    PathMeasure pathMeasure = (PathMeasure) ListProtector.get(this.LLILLL, i);
                    path.moveTo(((Coordinate) ListProtector.get(list3, 0)).x, ((Coordinate) ListProtector.get(list3, 0)).y);
                    for (Coordinate coordinate : list3) {
                        path.lineTo(coordinate.x, coordinate.y);
                    }
                    path.close();
                    pathMeasure.setPath(path, true);
                    this.LLILZIL = pathMeasure.getLength();
                    path2.reset();
                    path2.lineTo(0.0f, 0.0f);
                    float f2 = 0.2f;
                    if (this.LLJILJILJ) {
                        float f3 = this.LLILZIL;
                        float f4 = this.LLILZLL;
                        float f5 = f3 * f4;
                        if (0.0f <= f4 && f4 <= 0.2f) {
                            f = f4 * 2;
                        } else if (0.2f <= f4 && f4 <= 0.4f) {
                            f = 0.4f;
                        } else {
                            f = ((1 - f4) * 2.0f) / 3.0f;
                        }
                        pathMeasure.getSegment(f5, (f3 * f) + f5, path2, true);
                    } else {
                        float f6 = this.LLILZIL;
                        float f7 = this.LLILZLL;
                        float f8 = f6 * f7;
                        if (0.0f <= f7 && f7 <= 0.2f) {
                            f2 = f7;
                        } else if (0.2f > f7 || f7 > 0.8f) {
                            f2 = 1.0f - f7;
                        }
                        pathMeasure.getSegment(f8, (f6 * f2) + f8, path2, true);
                    }
                    if (canvas != null) {
                        canvas.drawPath(path2, this.LLILZ);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public final void setAnimator(ValueAnimator valueAnimator) {
        this.LLJI = valueAnimator;
    }

    public final void setCompleteListener(InterfaceC20578315fh interfaceC20578315fh) {
        this.LLIZ = interfaceC20578315fh;
    }

    public final void setDynamicLength(boolean z) {
        this.LLJILJILJ = z;
    }

    public final void setLength(float f) {
        this.LLILZIL = f;
    }

    public final void setPoints(List<? extends List<Coordinate>> list) {
        this.LLIZLLLIL = list;
        if (list != null) {
            this.LL.clear();
            this.LLILLJJLI.clear();
            this.LLILLL.clear();
            int size = list.size();
            if (size >= 0) {
                int i = 0;
                while (true) {
                    this.LL.add(new Path());
                    this.LLILLJJLI.add(new Path());
                    this.LLILLL.add(new PathMeasure());
                    if (i != size) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void setRatio(float f) {
        this.LLJILJIL = f;
        this.LLILZ.setStrokeWidth(C366700EZg.LIZ(2.0d) / f);
    }

    public final void setRepeatCount(int i) {
        this.LLJIJIL = i;
        this.LLJI.setRepeatCount(i);
    }

    public final void setShowAnimation(boolean z) {
        this.LLJ = z;
        if (z) {
            this.LLJI.start();
            C201955140j.LJIIL("AnimationPathView# Start animation");
        } else {
            this.LLJI.cancel();
            C201955140j.LJIIL("AnimationPathView# cancel animation");
        }
        invalidate();
    }

    public final void setValue(float f) {
        this.LLILZLL = f;
    }

    public C20577615fa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new ArrayList<>();
        this.LLILLJJLI = new ArrayList<>();
        this.LLILLL = new ArrayList<>();
        Paint paint = new Paint();
        this.LLILZ = paint;
        this.LLJILJIL = 1.0f;
        paint.setAntiAlias(true);
        paint.setColor(C960203pA.LIZ(R.attr.bx, context));
        paint.setStrokeWidth(C366700EZg.LIZ(2.0d));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLJI = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS278S0100000_31(this, 61));
        this.LLJI.setDuration(1200L);
        this.LLJI.setInterpolator(new AccelerateDecelerateInterpolator());
        this.LLJI.setRepeatCount(this.LLJIJIL);
        this.LLJI.addListener(new AAListenerS341S0100000_31(this, 3));
    }
}
