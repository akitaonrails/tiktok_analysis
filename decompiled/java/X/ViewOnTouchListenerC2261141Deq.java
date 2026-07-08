package X;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: renamed from: X.1Deq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class ViewOnTouchListenerC2261141Deq implements View.OnTouchListener {
    public final /* synthetic */ View LL;
    public final /* synthetic */ C2261151Der LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    public ViewOnTouchListenerC2261141Deq(View view, C2261151Der c2261151Der, View view2) {
        this.LL = view;
        this.LLILLJJLI = c2261151Der;
        this.LLILLL = view2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.LL.isClickable()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            C2261151Der c2261151Der = this.LLILLJJLI;
            if (!c2261151Der.LIZIZ) {
                c2261151Der.LIZIZ = true;
                C786410Ut5.T4(this.LLILLL, 1.0f);
                ValueAnimator valueAnimator = this.LLILLJJLI.LIZ;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                C2261151Der c2261151Der2 = this.LLILLJJLI;
                c2261151Der2.LIZ = c2261151Der2.LIZJ.LIZIZ(this.LLILLL, AFwS226S0000000_35.get$arr$(535));
            }
        }
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            C2261151Der c2261151Der3 = this.LLILLJJLI;
            if (c2261151Der3.LIZIZ) {
                c2261151Der3.LIZIZ = false;
                C786410Ut5.T4(this.LLILLL, 0.34f);
                ValueAnimator valueAnimator2 = this.LLILLJJLI.LIZ;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                C2261151Der c2261151Der4 = this.LLILLJJLI;
                c2261151Der4.LIZ = c2261151Der4.LIZJ.LIZ(this.LLILLL, AFwS226S0000000_35.get$arr$(536));
            }
        }
        return false;
    }
}
