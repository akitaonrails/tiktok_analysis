package X;

import Y.AUListenerS72S0101000_24;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.experiment.LiveHeadAnimDowngradeExperiment;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0s1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611030s1d extends ValueAnimator {
    public static final /* synthetic */ int LLILZ = 0;
    public int LL = C1611050s1f.LIZ;
    public final AUListenerS72S0101000_24 LLILLJJLI = new AUListenerS72S0101000_24(this, 3);
    public final ArrayList<ValueAnimator.AnimatorUpdateListener> LLILLL = new ArrayList<>();

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void resume() {
        if (LiveHeadAnimDowngradeExperiment.INSTANCE.isSoftDowngradeEnable()) {
            this.LL = C1611050s1f.LIZ;
        }
        super.resume();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void start() {
        if (LiveHeadAnimDowngradeExperiment.INSTANCE.isSoftDowngradeEnable()) {
            this.LL = C1611050s1f.LIZ;
        }
        super.start();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        super.removeAllUpdateListeners();
        this.LLILLL.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        if (animatorUpdateListener != null) {
            if (this.LLILLL.size() == 0) {
                super.addUpdateListener(this.LLILLJJLI);
            }
            this.LLILLL.add(animatorUpdateListener);
        }
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        if (animatorUpdateListener != null) {
            this.LLILLL.remove(animatorUpdateListener);
            if (this.LLILLL.size() == 0) {
                super.removeUpdateListener(this.LLILLJJLI);
            }
        }
    }
}
