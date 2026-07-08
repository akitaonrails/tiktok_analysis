package X;

import Y.ARunnableS4S0100001_16;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.SafeHandler;

/* JADX INFO: renamed from: X.0e8N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1077050e8N {
    public final View LIZ;
    public final int LIZIZ;
    public final LifecycleOwner LIZJ;
    public LinearLayout LIZLLL;
    public View LJ;
    public HorizontalScrollView LJFF;
    public View LJI;
    public TuxTextView LJII;
    public View LJIIIIZZ;
    public final SafeHandler LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public ViewTreeObserverOnScrollChangedListenerC1077040e8M LJIILJJIL;
    public ValueAnimator LJIIL = ValueAnimator.ofFloat(0.0f, 1.0f);
    public boolean LJIILIIL = true;
    public int LJIILL = -1;

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d A[PHI: r1
      0x000d: PHI (r1v1 float) = (r1v0 float), (r1v2 float) binds: [B:12:0x0022, B:5:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(float r2) {
        /*
            r0 = -1110651699(0xffffffffbdcccccd, float:-0.1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L17
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L17
        Ld:
            r2 = r1
        Le:
            int r0 = X.C814420VxA.LIZIZ(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L17:
            r0 = 1053609165(0x3ecccccd, float:0.4)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto Le
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto Le
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1077050e8N.LIZ(float):java.lang.String");
    }

    public final void LIZIZ(float f) {
        float f2 = ((f + 45.0f) / 90.0f) * this.LIZIZ;
        HorizontalScrollView horizontalScrollView = this.LJFF;
        if (horizontalScrollView == null) {
            horizontalScrollView = null;
        }
        HandlerHook.viewPost(horizontalScrollView, new ARunnableS4S0100001_16(this, f2, 2));
    }

    public C1077050e8N(View view, int i, LifecycleOwner lifecycleOwner) {
        this.LIZ = view;
        this.LIZIZ = i;
        this.LIZJ = lifecycleOwner;
        this.LJIIIZ = new SafeHandler(lifecycleOwner);
    }
}
