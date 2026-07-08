package X;

import Y.ARunnableS125S0100000_25;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uGH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696990uGH extends View {
    public static final int[] LLILZLL = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] LLIZ = new int[0];
    public C1697000uGI LL;
    public Boolean LLILLJJLI;
    public Long LLILLL;
    public ARunnableS125S0100000_25 LLILZ;
    public Function0<Unit> LLILZIL;

    public final void LIZIZ() {
        this.LLILZIL = null;
        Runnable runnable = this.LLILZ;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.LLILZ.run();
        } else {
            C1697000uGI c1697000uGI = this.LL;
            if (c1697000uGI != null) {
                c1697000uGI.setState(LLIZ);
            }
        }
        C1697000uGI c1697000uGI2 = this.LL;
        if (c1697000uGI2 == null) {
            return;
        }
        c1697000uGI2.setVisible(false, false);
        unscheduleDrawable(c1697000uGI2);
    }

    public final void LIZLLL() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    public C1696990uGH(Context context) {
        super(context);
    }

    private final void setRippleState(boolean z) {
        long jLongValue;
        int[] iArr;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.LLILZ;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.LLILLL;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        long j = jCurrentAnimationTimeMillis - jLongValue;
        if (!z) {
            if (j < 5) {
                ARunnableS125S0100000_25 aRunnableS125S0100000_25 = new ARunnableS125S0100000_25(this, 69);
                this.LLILZ = aRunnableS125S0100000_25;
                postDelayed(aRunnableS125S0100000_25, 50L);
                this.LLILLL = Long.valueOf(jCurrentAnimationTimeMillis);
            }
            iArr = LLIZ;
        } else {
            iArr = LLILZLL;
        }
        C1697000uGI c1697000uGI = this.LL;
        if (c1697000uGI != null) {
            c1697000uGI.setState(iArr);
        }
        this.LLILLL = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    public static final void setRippleState$lambda$2(C1696990uGH c1696990uGH) {
        C1697000uGI c1697000uGI = c1696990uGH.LL;
        if (c1697000uGI != null) {
            c1697000uGI.setState(LLIZ);
        }
        c1696990uGH.LLILZ = null;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Function0<Unit> function0 = this.LLILZIL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void LJ(float f, int i, long j, long j2) {
        C1697000uGI c1697000uGI = this.LL;
        if (c1697000uGI == null) {
            return;
        }
        Integer num = c1697000uGI.LLILLL;
        if (num == null || num.intValue() != i) {
            c1697000uGI.LLILLL = Integer.valueOf(i);
            C1697010uGJ.LIZ(c1697000uGI, i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jLIZJ = C1685910tyP.LIZJ(f, j2);
        C1685910tyP c1685910tyP = c1697000uGI.LLILLJJLI;
        if (c1685910tyP == null || !C1685910tyP.LJ(c1685910tyP.LIZ, jLIZJ)) {
            c1697000uGI.LLILLJJLI = new C1685910tyP(jLIZJ);
            c1697000uGI.setColor(ColorStateList.valueOf(C1685850tyJ.LJIIIZ(jLIZJ)));
        }
        Rect rect = new Rect(0, 0, C814420VxA.LIZIZ(C1680770tq7.LIZLLL(j)), C814420VxA.LIZIZ(C1680770tq7.LIZIZ(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        c1697000uGI.setBounds(rect);
    }

    public final void LIZ(C0NW2 c0nw2, boolean z, long j, int i, long j2, float f, AwS569S0100000_25 awS569S0100000_25) {
        if (this.LL == null || !Intrinsics.LJFF(Boolean.valueOf(z), this.LLILLJJLI)) {
            C1697000uGI c1697000uGI = new C1697000uGI(z);
            setBackground(c1697000uGI);
            this.LL = c1697000uGI;
            this.LLILLJJLI = Boolean.valueOf(z);
        }
        C1697000uGI c1697000uGI2 = this.LL;
        this.LLILZIL = awS569S0100000_25;
        LJ(f, i, j, j2);
        if (z) {
            c1697000uGI2.setHotspot(Float.intBitsToFloat((int) (c0nw2.LIZ >> 32)), C1378605aS.LJ(c0nw2.LIZ));
        } else {
            c1697000uGI2.setHotspot(c1697000uGI2.getBounds().centerX(), c1697000uGI2.getBounds().centerY());
        }
        setRippleState(true);
    }
}
