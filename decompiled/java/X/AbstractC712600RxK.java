package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS197S0000000_11;

/* JADX INFO: renamed from: X.0RxK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC712600RxK extends ConstraintLayout {
    public final Map<Integer, Integer> LL;
    public final C01GW LLILLJJLI;

    public final C1331730kl9 e0() {
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LIZ = false;
        c1331750klB.LJ = C339190DRl.LIZ(40);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, getContext());
        int iIntValue = numLIZJ != null ? numLIZJ.intValue() : 0;
        float fLIZ = C339190DRl.LIZ(5);
        c1331750klB.LIZJ = iIntValue;
        c1331750klB.LIZIZ = fLIZ;
        return c1331750klB.LIZ();
    }

    public final AbstractC1335900krs getDisplayListener() {
        return (AbstractC1335900krs) this.LLILLJJLI.getValue();
    }

    private final int getNavigationBarHeight() {
        return C14KQ.LIZLLL(getContext());
    }

    private final int getStatusBarHeight() {
        return C497820Jfg.LIZJ(getContext());
    }

    public final int getScreenHeight() {
        return C497820Jfg.LIZ(getContext());
    }

    public final int getScreenWidth() {
        return C497820Jfg.LIZIZ(getContext());
    }

    public final int getVerticalHeight() {
        return (getScreenHeight() - getStatusBarHeight()) - getNavigationBarHeight();
    }

    public AbstractC712600RxK(Context context, int i) {
        super(context, null, 0);
        Map<Integer, Integer> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(1, Integer.valueOf(R.layout.fcg)), new Pair(3, Integer.valueOf(R.layout.fci)), new Pair(2, Integer.valueOf(R.layout.fci)), new Pair(4, Integer.valueOf(R.layout.fch)));
        this.LL = mapLJIIIIZZ;
        Integer num = mapLJIIIIZZ.get(Integer.valueOf(i));
        if (num != null) {
            C786410Ut5.Sd(num.intValue(), C786410Ut5.ne(context), this);
        }
        setClipChildren(false);
        setClipToPadding(false);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS197S0000000_11(i, 16));
    }

    public static void h0(View view, float f) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "rotation", 0.0f, f);
        objectAnimatorOfFloat.setDuration(50L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public static void i0(View view, float f) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", 0.0f, f);
        objectAnimatorOfFloat.setDuration(50L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public static void j0(View view, float f) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, f);
        objectAnimatorOfFloat.setDuration(50L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }
}
