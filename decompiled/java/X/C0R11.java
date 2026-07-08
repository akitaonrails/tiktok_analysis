package X;

import Y.ALAdapterS7S0200000_10;
import Y.ARunnableS110S0100000_10;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0R11, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R11 implements View.OnTouchListener {
    public boolean LL;
    public final ARunnableS110S0100000_10 LLILLJJLI = new ARunnableS110S0100000_10(this, 113);

    public Animator LIZ(View view) {
        throw null;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 3) {
                    return false;
                }
                LIZ(view).start();
                return false;
            }
            Animator animatorLIZ = LIZ(view);
            animatorLIZ.addListener(new ALAdapterS7S0200000_10(this, view, motionEvent, 2));
            animatorLIZ.start();
            return true;
        }
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.qdd);
        } else {
            viewFindViewById = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewFindViewById, "alpha", 1.0f, 0.2f);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.addListener(new ALAdapterS7S0200000_10(this, view, motionEvent, 1));
        objectAnimatorOfFloat.start();
        return true;
    }
}
