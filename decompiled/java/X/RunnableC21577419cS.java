package X;

import android.view.View;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.19cS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class RunnableC21577419cS implements Runnable {
    public int LL;
    public float LLILLJJLI;
    public long LLILLL;
    public long LLILZ = AnimationUtils.currentAnimationTimeMillis();
    public final /* synthetic */ C21576919cN LLILZIL;

    public final void LIZ() {
        C21576919cN c21576919cN = this.LLILZIL;
        if (c21576919cN.LLLLZ != this || c21576919cN.LLLLLLL.isFinishing) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j = jCurrentAnimationTimeMillis - this.LLILZ;
        float fPow = (float) (((double) this.LLILLJJLI) * Math.pow(0.98f, (jCurrentAnimationTimeMillis - this.LLILLL) / (1000.0f / 10)));
        this.LLILLJJLI = fPow;
        float f = fPow * ((j * 1.0f) / 1000.0f);
        if (Math.abs(f) <= 1.0f) {
            this.LLILZIL.LLLLZ = null;
            return;
        }
        this.LLILZ = jCurrentAnimationTimeMillis;
        int i = (int) (this.LL + f);
        this.LL = i;
        C21576919cN c21576919cN2 = this.LLILZIL;
        if (c21576919cN2.LLILLJJLI * i > 0) {
            c21576919cN2.LLLLLLJ.LIZIZ(i, true);
            C786410Ut5.LJLIIL(10, this.LLILZIL.LLLLLLIL, this);
            return;
        }
        c21576919cN2.LLLLZ = null;
        c21576919cN2.LLLLLLJ.LIZIZ(0, true);
        View view = this.LLILZIL.LLLLLJLJLL.LLILLL;
        int i2 = (int) (-this.LLILLJJLI);
        float f2 = C19ZZ.LIZIZ;
        if (view instanceof ScrollView) {
            ((ScrollView) view).fling(i2);
        } else if (view instanceof AbsListView) {
            ((AbsListView) view).fling(i2);
        } else if (view instanceof WebView) {
            ((WebView) view).flingScroll(0, i2);
        } else if (view instanceof C21578619ce) {
            ((C21578619ce) view).fling(i2);
        } else if (view instanceof RecyclerView) {
            ((RecyclerView) view).fling(0, i2);
        }
        C21576919cN c21576919cN3 = this.LLILZIL;
        if (!c21576919cN3.LLLLLZ || f <= 0.0f) {
            return;
        }
        c21576919cN3.LLLLLZ = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SmartRefreshLayout$FlingRunnable@7f3c.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SmartRefreshLayout$FlingRunnable@7f3c.run");
    }

    public RunnableC21577419cS(C21576919cN c21576919cN, float f) {
        this.LLILZIL = c21576919cN;
        this.LLILLJJLI = f;
        this.LL = c21576919cN.LLILLJJLI;
    }
}
