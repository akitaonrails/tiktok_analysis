package X;

import Y.ARunnableS15S0400000_6;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HfQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446700HfQ extends C214906198m {
    public final Context LL;

    public final void LJJIIJZLJL() {
        getContentView().setPivotX(getContentView().getWidth() / 2.0f);
        getContentView().setPivotY(getContentView().getHeight());
        C21616519il c21616519ilLJIILLIIL = C1619980sG4.LJIILLIIL(getContentView(), AbstractC21616419ik.LJIILL, 0.3f);
        c21616519ilLJIILLIIL.LJI(1.0f);
        C21616519il c21616519ilLJIILLIIL2 = C1619980sG4.LJIILLIIL(getContentView(), AbstractC21616419ik.LJIILLIIL, 0.3f);
        c21616519ilLJIILLIIL2.LJI(1.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getContentView(), "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(150L);
        if (getContentView().getParent() != null) {
            HandlerHook.viewPost(getContentView(), new ARunnableS15S0400000_6(this, c21616519ilLJIILLIIL2, objectAnimatorOfFloat, c21616519ilLJIILLIIL, 1));
        }
    }

    public C446700HfQ(Context context) {
        super(context);
        this.LL = context;
        setContentView(C786410Ut5.Sd(R.layout.fwe, C786410Ut5.ne(context), null));
        setWidth(-2);
        setHeight(-2);
        setOutsideTouchable(false);
        setFocusable(false);
        setBackgroundDrawable(null);
    }
}
