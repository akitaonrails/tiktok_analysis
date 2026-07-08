package X;

import Y.ARunnableS76S0200000_7;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0IsJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C480170IsJ extends AbstractC712240Rwk {
    public int LL = -1;
    public final BPEAHandler LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
    public final /* synthetic */ WeakReference<C21546719Ub> LLILLL;

    public C480170IsJ(WeakReference<C21546719Ub> weakReference) {
        this.LLILLL = weakReference;
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            C786410Ut5.LJL(this.LLILLJJLI, new ARunnableS76S0200000_7(this.LLILLL, this, 30));
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageSelected(int i) {
        this.LL = i;
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrolled(int i, float f, int i2) {
        C21546719Ub c21546719Ub = this.LLILLL.get();
        if (c21546719Ub != null) {
            c21546719Ub.LJIILLIIL(i, f, true, true);
        }
    }
}
