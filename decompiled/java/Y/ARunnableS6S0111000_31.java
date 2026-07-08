package Y;

import X.C15LD;
import X.C15LG;
import X.C16FJ;
import X.C1C7U;
import X.C20359714lX;
import X.C500260Jjc;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS6S0111000_31 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ((C16FJ) this.l0).LIZ();
        if (((C16FJ) this.l0).getNestedScrollY() < 0) {
            RecyclerView recyclerView = ((C16FJ) this.l0).LL;
            if (!C500260Jjc.LJJJI(recyclerView != null ? Boolean.valueOf(recyclerView.canScrollVertically(-1)) : null)) {
                int i = this.i2;
                if (i >= 5 || this.z1) {
                    return;
                }
                this.i2 = i + 1;
                RecyclerView recyclerView2 = ((C16FJ) this.l0).LL;
                if (recyclerView2 != null) {
                    HandlerHook.viewPostDelay(recyclerView2, this, 50L);
                    return;
                }
                return;
            }
            this.z1 = true;
            C16FJ c16fj = (C16FJ) this.l0;
            int nestedScrollY = c16fj.getNestedScrollY();
            try {
                RecyclerView recyclerView3 = c16fj.LL;
                if (recyclerView3 != null) {
                    recyclerView3.scrollBy(0, nestedScrollY);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C16FJ c16fj2 = (C16FJ) this.l0;
            c16fj2.scrollTo(0, c16fj2.getHeaderHeight());
        }
    }

    public static final void run$0(ARunnableS6S0111000_31 aRunnableS6S0111000_31) {
        boolean zLIZ;
        C1C7U.LIZ("LiveMessageSpringLayout@68f4.setRefreshing$1");
        try {
            aRunnableS6S0111000_31.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveMessageSpringLayout@68f4.setRefreshing$1");
    }

    public static final void run$1(ARunnableS6S0111000_31 aRunnableS6S0111000_31) {
        boolean zLIZ;
        C1C7U.LIZ("PlaybookDirector@b1f8.runPlaybookStep$1$newTaskStepRunnable$1");
        try {
            ((C20359714lX) aRunnableS6S0111000_31.l0).LJIIJJI(aRunnableS6S0111000_31.i2, "noTask", aRunnableS6S0111000_31.z1, true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlaybookDirector@b1f8.runPlaybookStep$1$newTaskStepRunnable$1");
    }

    public static final void run$2(ARunnableS6S0111000_31 aRunnableS6S0111000_31) {
        C15LD c15ld = (C15LD) aRunnableS6S0111000_31.l0;
        int i = aRunnableS6S0111000_31.i2;
        boolean z = aRunnableS6S0111000_31.z1;
        C15LG c15lg = c15ld.LJFF.LJ;
        if (c15lg != null) {
            c15lg.sa(i, z);
        }
    }

    public ARunnableS6S0111000_31(C16FJ c16fj, int i) {
        this.$t = i;
        this.l0 = c16fj;
    }

    public ARunnableS6S0111000_31(Object obj, int i, boolean z, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.z1 = z;
    }
}
