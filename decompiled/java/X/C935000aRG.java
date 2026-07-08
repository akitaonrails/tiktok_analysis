package X;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aRG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935000aRG {
    public final View LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 773));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 772));
    public ObjectAnimator LIZLLL;
    public ObjectAnimator LJ;

    public final void LIZ() {
        C917750ZzR.LJII("disappear");
        ObjectAnimator objectAnimator = this.LJ;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        Integer num = (Integer) this.LIZJ.getValue();
        if (num != null) {
            int iIntValue = num.intValue();
            Integer num2 = (Integer) this.LIZIZ.getValue();
            if (num2 != null) {
                ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.LIZ, "backgroundColor", num2.intValue(), iIntValue);
                if (objectAnimatorOfInt != null) {
                    objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
                    objectAnimatorOfInt.setStartDelay(3000L);
                    objectAnimatorOfInt.setDuration(300L);
                    C786410Ut5.Pd(objectAnimatorOfInt);
                } else {
                    objectAnimatorOfInt = null;
                }
                this.LJ = objectAnimatorOfInt;
            }
        }
    }

    public final Integer LIZIZ() {
        Context context;
        View view = this.LIZ;
        if (view == null || (context = view.getContext()) == null) {
            return null;
        }
        if (C960203pA.LIZIZ(context)) {
            return C1308910kAL.LIZJ(R.attr.c9c, context);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.eus, context);
        return Integer.valueOf(numLIZJ != null ? numLIZJ.intValue() : -14625300);
    }

    public C935000aRG(View view) {
        this.LIZ = view;
    }
}
