package X;

import Y.AAListenerS317S0100000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0GjQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423700GjQ extends C0GSU {
    public static final float LLJIJIL = C418440Gaw.LIZIZ(8);
    public static final float LLJILJIL = C418440Gaw.LIZIZ(5);
    public static final float LLJILJILJ = C418440Gaw.LIZIZ(5);
    public static final long LLJILLL = 160;
    public static final float LLJJ = C418440Gaw.LIZIZ(8);
    public static final int LLJJI = 20;
    public static final int LLJJIII = 10;
    public int LL;
    public boolean LLILLJJLI;
    public final Paint LLILLL;
    public final Paint LLILZ;
    public final List<C423710GjR> LLILZIL;
    public final List<Float> LLILZLL;
    public final long LLIZ;
    public boolean LLIZLLLIL;
    public ValueAnimator LLJ;
    public final List<Float> LLJI;

    public final void LIZ() {
        this.LLIZLLLIL = false;
        this.LLILLJJLI = false;
        ValueAnimator valueAnimator = this.LLJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ((ArrayList) this.LLJI).clear();
        ((ArrayList) this.LLILZIL).clear();
        int i = LLJJIII;
        this.LL = i;
        for (int i2 = 0; i2 < i; i2++) {
            ((ArrayList) this.LLILZIL).add(new C423710GjR(true, LLJIJIL, 2));
        }
        invalidate();
    }

    public final void LIZIZ() {
        float fLJJIZ;
        if (this.LLIZLLLIL) {
            ValueAnimator valueAnimator = this.LLJ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            synchronized (this) {
                try {
                    if (((ArrayList) this.LLILZLL).isEmpty()) {
                        fLJJIZ = LLJJ;
                    } else {
                        fLJJIZ = LLJIJIL + (((float) C13LP.LJJIZ(this.LLILZLL)) * getHeight());
                        float height = getHeight();
                        if (fLJJIZ > height) {
                            fLJJIZ = height;
                        }
                    }
                    ((ArrayList) this.LLILZLL).clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            ((ArrayList) this.LLJI).add(Float.valueOf(fLJJIZ));
            if (((ArrayList) this.LLILZIL).size() > LLJJI) {
                C19719612Di.LJJIJ(this.LLILZIL);
            }
            if (this.LLILLJJLI) {
                int i = this.LL;
                if (i > 0) {
                    ListProtector.add(this.LLILZIL, i - 1, new C423710GjR(false, fLJJIZ, 6));
                    ListProtector.remove(this.LLILZIL, this.LL);
                    this.LL--;
                }
            } else {
                int size = ((ArrayList) this.LLILZIL).size();
                int i2 = LLJJIII;
                if (size > i2) {
                    ListProtector.add(this.LLILZIL, i2, new C423710GjR(false, fLJJIZ, 6));
                } else {
                    ((ArrayList) this.LLILZIL).add(new C423710GjR(false, fLJJIZ, 6));
                }
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(LLJILLL);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 18));
            valueAnimatorOfFloat.addListener(new AAListenerS317S0100000_6(this, 7));
            valueAnimatorOfFloat.start();
            this.LLJ = valueAnimatorOfFloat;
        }
    }

    @Override // X.C0GSU
    public float getSampleRate() {
        return 1000.0f / LLJILLL;
    }

    @Override // X.C0GSU
    public List<Float> getWave() {
        List<Float> list = this.LLJI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Float> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf(it2.next().floatValue() / (getHeight() - 0.0f)));
        }
        return C13LP.LLIIII(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C423700GjQ.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C423700GjQ(final Context context, final AttributeSet attributeSet) {
        int iIntValue;
        final int i = 0;
        new View(context, attributeSet, i) { // from class: X.0GSU
            public abstract float getSampleRate();

            public abstract List<Float> getWave();
        };
        this.LL = LLJJIII;
        Paint paint = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        paint.setColor(iIntValue);
        paint.setStrokeWidth(0.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a04, context);
        if (numLIZJ2 != null) {
            paint2.setColor(numLIZJ2.intValue());
        }
        this.LLILLL = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.FILL);
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a02, context);
        if (numLIZJ3 != null) {
            paint3.setColor(numLIZJ3.intValue());
        }
        this.LLILZ = paint3;
        this.LLILZIL = new ArrayList();
        this.LLILZLL = new ArrayList();
        this.LLIZ = 150L;
        this.LLJI = new ArrayList();
    }
}
