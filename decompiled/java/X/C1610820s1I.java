package X;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0s1I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610820s1I extends ValueAnimator {
    public static final /* synthetic */ int LLILLL = 0;
    public final C1610810s1H LL = new ValueAnimator.AnimatorUpdateListener() { // from class: X.0s1H
        public long LL;
        public final C01GW LLILLJJLI;
        public final long LLILLL;

        {
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(676));
            this.LLILLJJLI = c01gwLIZIZ;
            this.LLILLL = ((Number) c01gwLIZIZ.getValue()).longValue() > 0 ? 1000 / ((Number) c01gwLIZIZ.getValue()).longValue() : 0L;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (((Number) this.LLILLJJLI.getValue()).longValue() > -2 && SystemClock.elapsedRealtime() >= this.LL + this.LLILLL) {
                Iterator<ValueAnimator.AnimatorUpdateListener> it2 = this.LLILZ.LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().onAnimationUpdate(valueAnimator);
                }
                this.LL = SystemClock.elapsedRealtime();
            }
        }
    };
    public final ArrayList<ValueAnimator.AnimatorUpdateListener> LLILLJJLI = new ArrayList<>();

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        super.removeAllUpdateListeners();
        this.LLILLJJLI.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        if (animatorUpdateListener != null) {
            if (this.LLILLJJLI.size() == 0) {
                super.addUpdateListener(this.LL);
            }
            this.LLILLJJLI.add(animatorUpdateListener);
        }
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        if (animatorUpdateListener != null) {
            this.LLILLJJLI.remove(animatorUpdateListener);
            if (this.LLILLJJLI.size() == 0) {
                super.removeUpdateListener(this.LL);
            }
        }
    }
}
