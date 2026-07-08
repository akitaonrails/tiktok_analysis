package X;

import Y.ALAdapterS9S0100000_12;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.ConstraintFloatWindowLayout;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0UfZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778030UfZ extends AbstractC776850Udf {
    public final C779160UhO LIZ;
    public final C776900Udk LIZIZ;
    public ValueAnimator LIZJ;
    public TimeInterpolator LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJJI;
    public boolean LJIIJ = true;
    public boolean LJIIL = true;
    public final ChoreographerFrameCallbackC778050Ufb LJIILIIL = new Choreographer.FrameCallback() { // from class: X.0Ufb
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            this.LL.LJIIL = true;
            C786410Ut5.v2().postFrameCallback(this.LL.LJIILIIL);
        }
    };

    @Override // X.AbstractC776850Udf
    public final void LIZ() {
        ((HashMap) C776920Udm.LIZ).remove(this.LIZIZ.LJIIJJI);
        this.LIZ.LJI();
        C786410Ut5.v2().removeFrameCallback(this.LJIILIIL);
        InterfaceC778060Ufc interfaceC778060Ufc = this.LIZIZ.LJIIL;
        if (interfaceC778060Ufc != null) {
            interfaceC778060Ufc.onDismiss();
        }
    }

    public final View LIZIZ() {
        this.LJIIIZ = ViewConfiguration.get(this.LIZIZ.LIZ).getScaledTouchSlop();
        return this.LIZIZ.LIZIZ;
    }

    public final void LIZJ() {
        if (this.LIZIZ.LJIIJ == null) {
            if (this.LIZLLL == null) {
                this.LIZLLL = new DecelerateInterpolator();
            }
            this.LIZIZ.LJIIJ = this.LIZLLL;
        }
        this.LIZJ.setInterpolator(this.LIZIZ.LJIIJ);
        this.LIZJ.addListener(new ALAdapterS9S0100000_12(this, 2));
        this.LIZJ.setDuration(this.LIZIZ.LJIIIZ).start();
        InterfaceC778060Ufc interfaceC778060Ufc = this.LIZIZ.LJIIL;
        if (interfaceC778060Ufc != null) {
            interfaceC778060Ufc.LJ();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Ufb] */
    public C778030UfZ() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Ufb] */
    public C778030UfZ(C776900Udk c776900Udk) {
        this.LIZIZ = c776900Udk;
        C779160UhO c779160UhO = new C779160UhO(c776900Udk.LIZ);
        this.LIZ = c779160UhO;
        LIZIZ().setOnTouchListener(new View.OnTouchListener() { // from class: X.0Ufa
            public float LL;
            public float LLILLJJLI;
            public float LLILLL;
            public float LLILZ;
            public int LLILZIL;
            public int LLILZLL;
            public final Point LLIZ = new Point();
            public int LLIZLLLIL;
            public int LLJ;

            /* JADX WARN: Removed duplicated region for block: B:64:0x020f  */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
                /*
                    Method dump skipped, instruction units count: 679
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC778040Ufa.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
        c779160UhO.LJIIL(c776900Udk.LIZJ, c776900Udk.LIZLLL);
        c779160UhO.LJII(c776900Udk.LJ, c776900Udk.LJFF);
        c779160UhO.LIZLLL = c776900Udk.LIZIZ;
        c779160UhO.LJFF = c776900Udk.LJIILIIL;
        int i = c776900Udk.LJIILJJIL;
        if (i != 0) {
            ConstraintFloatWindowLayout.LayoutParams layoutParams = c779160UhO.LIZJ;
            ((WindowManager.LayoutParams) layoutParams).flags = i | ((WindowManager.LayoutParams) layoutParams).flags;
        }
    }
}
