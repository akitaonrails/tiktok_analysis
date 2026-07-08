package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS108S0400000_10;

/* JADX INFO: renamed from: X.0QhJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C677190QhJ extends C0R11 {
    public final /* synthetic */ Function1<View, Unit> LLILLL;

    public C677190QhJ(AwS108S0400000_10 awS108S0400000_10) {
        this.LLILLL = awS108S0400000_10;
    }

    @Override // X.C0R11
    public final Animator LIZ(View view) {
        View viewFindViewById;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.qdd);
        } else {
            viewFindViewById = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewFindViewById, "alpha", 0.2f, 1.0f);
        objectAnimatorOfFloat.setDuration(150L);
        return objectAnimatorOfFloat;
    }
}
