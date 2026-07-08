package X;

import Y.ALAdapterS26S0200000_32;
import Y.AUListenerS14S0202000_32;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.188m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class RunnableC212358188m implements Runnable {
    public final /* synthetic */ C212359188n LL;
    public final /* synthetic */ C212360188o LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ View LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    public RunnableC212358188m(C212359188n c212359188n, C212360188o c212360188o, int i, Integer num, int i2, View view, Function0<Unit> function0) {
        this.LL = c212359188n;
        this.LLILLJJLI = c212360188o;
        this.LLILLL = i;
        this.LLILZ = num;
        this.LLILZIL = i2;
        this.LLILZLL = view;
        this.LLIZ = function0;
    }

    public final void LIZ() {
        if (this.LL.getParent() == null) {
            return;
        }
        C212360188o c212360188o = this.LLILLJJLI;
        int i = this.LLILLL;
        c212360188o.getClass();
        long jLIZIZ = C212360188o.LIZIZ(i);
        Integer num = this.LLILZ;
        int iLIZ = this.LLILLJJLI.LIZ(num != null ? num.intValue() : this.LLILZIL, this.LLILZLL, true);
        if (iLIZ != 0) {
            C212360188o c212360188o2 = this.LLILLJJLI;
            c212360188o2.LJIILJJIL = true;
            RecyclerView recyclerView = c212360188o2.LIZIZ;
            if (recyclerView != null) {
                recyclerView.smoothScrollBy(0, iLIZ, C1619980sG4.LJIILIIL(), (int) jLIZIZ);
            }
        }
        int height = this.LL.getHeight() > 0 ? this.LL.getHeight() : this.LLILLL;
        int i2 = this.LLILZIL;
        if (i2 > height) {
            i2 = height;
        }
        Animator animator = this.LLILLJJLI.LJIIJ;
        if (animator != null) {
            animator.cancel();
        }
        C212360188o c212360188o3 = this.LLILLJJLI;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, i2);
        C212359188n c212359188n = this.LL;
        C212360188o c212360188o4 = this.LLILLJJLI;
        Function0<Unit> function0 = this.LLIZ;
        valueAnimatorOfInt.setDuration(jLIZIZ);
        valueAnimatorOfInt.setInterpolator(C1619980sG4.LJIILIIL());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS14S0202000_32(height, c212359188n, i2, c212360188o4, 1));
        valueAnimatorOfInt.addListener(new ALAdapterS26S0200000_32(function0, c212360188o4, 5));
        valueAnimatorOfInt.start();
        c212360188o3.LJIIJ = valueAnimatorOfInt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("Top1CardExpandHelper@b918.collapseCard$2");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Top1CardExpandHelper@b918.collapseCard$2");
    }
}
