package X;

import Y.AAListenerS318S0100000_7;
import Y.ARunnableS107S0100000_7;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0IpF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC478270IpF {
    public final Context LIZ;
    public View LIZIZ;
    public final int LIZJ = C439101nJ.LIZ(16);
    public View LIZLLL;

    public abstract int LIZJ();

    public void LJ() {
    }

    public final View LIZIZ() {
        if (this.LIZIZ == null) {
            this.LIZIZ = C786410Ut5.Sd(LIZJ(), C786410Ut5.ne(this.LIZ), null);
        }
        return this.LIZIZ;
    }

    public final void LJFF() {
        View viewLIZIZ = LIZIZ();
        if (viewLIZIZ == null || viewLIZIZ.getVisibility() == 0) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewLIZIZ, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(100L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
        View viewLIZIZ2 = LIZIZ();
        if (viewLIZIZ2 != null) {
            C786410Ut5.LJLLLLLL(0, viewLIZIZ2);
        }
        HandlerHook.viewPostDelay(viewLIZIZ, new ARunnableS107S0100000_7(this, 234), 2000L);
    }

    public AbstractC478270IpF(Context context) {
        this.LIZ = context;
    }

    public static void LIZ(TextView textView) {
        if (textView == null) {
            return;
        }
        textView.setTextAppearance(C1834150xpV.LJII(textView.getContext()), R.style.rl);
        textView.setTextSize(1, 12.0f);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ey8, C1834150xpV.LJII(textView.getContext()));
        if (numLIZJ != null) {
            textView.setTextColor(numLIZJ.intValue());
        }
    }

    public final void LIZLLL(boolean z) {
        if (!z) {
            View viewLIZIZ = LIZIZ();
            if (viewLIZIZ != null) {
                C786410Ut5.LJLLLLLL(4, viewLIZIZ);
                return;
            }
            return;
        }
        View viewLIZIZ2 = LIZIZ();
        if (viewLIZIZ2 == null || viewLIZIZ2.getVisibility() == 4) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewLIZIZ2, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.addListener(new AAListenerS318S0100000_7(this, 9));
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }
}
