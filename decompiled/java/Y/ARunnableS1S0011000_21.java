package Y;

import X.C1389880mGw;
import X.C1389890mGx;
import X.C1C7U;
import com.ss.android.ugc.aweme.utils.ActivityStack;

/* JADX INFO: loaded from: classes22.dex */
public class ARunnableS1S0011000_21 implements Runnable {
    public final int $t;
    public int i1;
    public boolean z0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (ActivityStack.getValidTopActivity() != null) {
            if (this.z0) {
                C1389880mGw c1389880mGw = new C1389880mGw(ActivityStack.getValidTopActivity());
                c1389880mGw.LJIIIIZZ(this.i1);
                c1389880mGw.LJIIJ();
            } else {
                C1389890mGx c1389890mGx = new C1389890mGx(ActivityStack.getValidTopActivity());
                c1389890mGx.LJIIIZ(this.i1);
                c1389890mGx.LJIIJJI();
            }
        }
    }

    public final void LIZ$1() {
        if (ActivityStack.getValidTopActivity() != null) {
            if (this.z0) {
                C1389880mGw c1389880mGw = new C1389880mGw(ActivityStack.getValidTopActivity());
                c1389880mGw.LJIIIIZZ(this.i1);
                c1389880mGw.LJIIJ();
            } else {
                C1389890mGx c1389890mGx = new C1389890mGx(ActivityStack.getValidTopActivity());
                c1389890mGx.LJIIIZ(this.i1);
                c1389890mGx.LJIIJJI();
            }
        }
    }

    public static final void run$0(ARunnableS1S0011000_21 aRunnableS1S0011000_21) {
        boolean zLIZ;
        C1C7U.LIZ("DuetWithMovieHelper@adfe.showToast$1");
        try {
            aRunnableS1S0011000_21.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DuetWithMovieHelper@adfe.showToast$1");
    }

    public static final void run$1(ARunnableS1S0011000_21 aRunnableS1S0011000_21) {
        boolean zLIZ;
        C1C7U.LIZ("StitchWithMovieHelper@c4b6.showToast$1$1");
        try {
            aRunnableS1S0011000_21.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StitchWithMovieHelper@c4b6.showToast$1$1");
    }

    public ARunnableS1S0011000_21(boolean z, int i, int i2) {
        this.$t = i2;
        this.z0 = z;
        this.i1 = i;
    }
}
