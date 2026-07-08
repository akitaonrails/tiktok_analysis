package X;

import Y.AUListenerS266S0100000_17;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0fGC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120340fGC extends ValueAnimator {
    public static final /* synthetic */ int LLILZIL = 0;
    public int LL;
    public int LLILLJJLI = 1;
    public final AUListenerS266S0100000_17 LLILLL = new AUListenerS266S0100000_17(this, 35);
    public final ArrayList<ValueAnimator.AnimatorUpdateListener> LLILZ = new ArrayList<>();

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        super.removeAllUpdateListeners();
        this.LLILZ.clear();
    }

    public final void LIZ(int i) {
        if (i > 0) {
            this.LLILLJJLI = i;
            this.LL = 0;
        }
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        if (animatorUpdateListener != null) {
            if (this.LLILZ.size() == 0) {
                super.addUpdateListener(this.LLILLL);
            }
            this.LLILZ.add(animatorUpdateListener);
        }
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        if (animatorUpdateListener != null) {
            this.LLILZ.remove(animatorUpdateListener);
            if (this.LLILZ.size() == 0) {
                super.removeUpdateListener(this.LLILLL);
            }
        }
    }
}
