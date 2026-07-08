package X;

import Y.AAListenerS317S0100000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0GjT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423730GjT extends AbstractC423760GjW {
    public static final float LLIZLLLIL = C418440Gaw.LIZIZ(Double.valueOf(5.5d));
    public static final float LLJ = C418440Gaw.LIZIZ(Double.valueOf(2.5d));
    public static final long LLJI = 100;
    public final Paint LL;
    public final List<C423740GjU> LLILLJJLI;
    public final List<Float> LLILLL;
    public final long LLILZ;
    public boolean LLILZIL;
    public ValueAnimator LLILZLL;
    public final List<Float> LLIZ;

    @Override // X.AbstractC423760GjW
    public final void LIZ() {
        this.LLILZIL = false;
        ValueAnimator valueAnimator = this.LLILZLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        LJ();
        invalidate();
    }

    @Override // X.AbstractC423760GjW
    public final void LIZIZ() {
        this.LLILZIL = true;
        ((ArrayList) this.LLIZ).clear();
        LJFF();
    }

    @Override // X.AbstractC423760GjW
    public final void LIZJ() {
        this.LLILZIL = false;
        ValueAnimator valueAnimator = this.LLILZLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void LJ() {
        ((ArrayList) this.LLILLJJLI).clear();
        int iLIZIZ = (int) (C497820Jfg.LIZIZ(getContext()) / LLIZLLLIL);
        for (int i = 0; i < iLIZIZ; i++) {
            ((ArrayList) this.LLILLJJLI).add(new C423740GjU(-1.0f));
        }
    }

    public final void LJFF() {
        float fLJJIZ;
        if (this.LLILZIL) {
            ValueAnimator valueAnimator = this.LLILZLL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            synchronized (this) {
                try {
                    fLJJIZ = ((ArrayList) this.LLILLL).isEmpty() ? 0.0f : (float) C13LP.LJJIZ(this.LLILLL);
                    ((ArrayList) this.LLILLL).clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            ((ArrayList) this.LLIZ).add(Float.valueOf(fLJJIZ));
            C19719612Di.LJJIJ(this.LLILLJJLI);
            ListProtector.add(this.LLILLJJLI, 0, new C423740GjU(fLJJIZ));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(LLJI);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 44));
            valueAnimatorOfFloat.addListener(new AAListenerS317S0100000_6(this, 19));
            valueAnimatorOfFloat.start();
            this.LLILZLL = valueAnimatorOfFloat;
        }
    }

    @Override // X.AbstractC423760GjW
    public float getSampleRate() {
        return 1000.0f / LLJI;
    }

    @Override // X.AbstractC423760GjW
    public List<Float> getWave() {
        List<Float> list = this.LLIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Float> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf(it2.next().floatValue() / (getHeight() - LLJ)));
        }
        return C13LP.LLIIII(arrayList);
    }

    @Override // X.AbstractC423760GjW
    public final void LIZLLL(List<Float> list) {
        synchronized (this) {
            try {
                List<Float> list2 = this.LLILLL;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<Float> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Float.valueOf(it2.next().floatValue() * (getHeight() - LLJ)));
                }
                ((ArrayList) list2).addAll(arrayList);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0061 A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r21) {
        /*
            r20 = this;
            r9 = r21
            r7 = r20
            super.onDraw(r9)
            android.animation.ValueAnimator r0 = r7.LLILZLL
            if (r0 == 0) goto Lc3
            float r19 = r0.getAnimatedFraction()
            long r17 = java.lang.System.currentTimeMillis()
            java.util.List<X.0GjU> r0 = r7.LLILLJJLI
            java.util.Iterator r16 = r0.iterator()
            r8 = 0
        L1a:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto Lc3
            java.lang.Object r1 = r16.next()
            int r15 = r8 + 1
            if (r8 < 0) goto Lbe
            X.0GjU r1 = (X.C423740GjU) r1
            float r6 = r1.LIZ
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L61
            long r0 = r1.LIZIZ
            long r2 = r17 - r0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 1056964608(0x3f000000, float:0.5)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r0 >= 0) goto L63
            r6 = 0
        L40:
            float r2 = (float) r8
            float r2 = r2 + r5
            float r2 = r2 + r19
            float r0 = X.C423730GjT.LLIZLLLIL
            float r2 = r2 * r0
            float r1 = X.C423730GjT.LLJ
            r0 = 2
            float r0 = (float) r0
            float r3 = r1 / r0
            int r0 = r9.getHeight()
            float r0 = (float) r0
            float r0 = r0 - r1
            float r0 = r0 - r6
            float r0 = r0 / r4
            float r3 = r3 + r0
            float r5 = r3 + r6
            android.graphics.Paint r0 = r7.LL
            r1 = r9
            r2 = r2
            r4 = r2
            r6 = r0
            r1.drawLine(r2, r3, r4, r5, r6)
        L61:
            r8 = r15
            goto L1a
        L63:
            long r0 = r7.LLILZ
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r10 = 1
            r13 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            if (r11 <= 0) goto Lb2
            int r0 = r7.getWidth()
            float r3 = (float) r0
            float r12 = X.C423730GjT.LLIZLLLIL
            float r3 = r3 / r12
            long r0 = X.C423730GjT.LLJI
            float r2 = (float) r0
            float r3 = r3 * r2
            float r11 = (float) r8
            float r11 = r11 + r5
            float r11 = r11 + r19
            float r11 = r11 * r12
            int r0 = r7.getWidth()
            float r0 = (float) r0
            float r12 = r11 / r0
            long r0 = r7.LLILZ
            float r2 = (float) r0
            float r2 = r2 / r3
            float r3 = (float) r10
            float r0 = r3 - r2
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lac
            int r0 = r7.getWidth()
            float r1 = (float) r0
            float r1 = r1 - r11
            int r0 = r7.getWidth()
            float r0 = (float) r0
            float r2 = r2 * r0
            float r1 = r1 / r2
            float r1 = r1 + r3
            double r0 = (double) r1
            double r0 = r0 * r13
            double r2 = java.lang.Math.cos(r0)
        La6:
            double r0 = (double) r4
            double r2 = r2 / r0
            double r0 = (double) r5
            double r2 = r2 + r0
            float r0 = (float) r2
            float r6 = r6 * r0
        Lac:
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L61
            goto L40
        Lb2:
            float r11 = (float) r2
            float r2 = (float) r0
            float r11 = r11 / r2
            float r0 = (float) r10
            float r11 = r11 + r0
            double r0 = (double) r11
            double r0 = r0 * r13
            double r2 = java.lang.Math.cos(r0)
            goto La6
        Lbe:
            X.C1697810uHb.LJIJI()
            r0 = 0
            throw r0
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C423730GjT.onDraw(android.graphics.Canvas):void");
    }

    public C423730GjT(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        paint.setColor(iIntValue);
        paint.setStrokeWidth(LLJ);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        this.LL = paint;
        this.LLILLJJLI = new ArrayList();
        this.LLILLL = new ArrayList();
        this.LLILZ = 150L;
        LJ();
        this.LLIZ = new ArrayList();
    }
}
