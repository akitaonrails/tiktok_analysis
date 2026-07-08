package Y;

import X.C1653370t7v;
import X.C1653530t8B;
import X.C1C7U;
import android.view.View;
import com.ss.android.ugc.gamora.celebration.PreloadConfig;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public class ARunnableS11S1400000_25 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

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

    /* JADX WARN: Removed duplicated region for block: B:64:0x0114 A[PHI: r4
      0x0114: PHI (r4v2 boolean) = (r4v0 boolean), (r4v4 boolean), (r4v5 boolean) binds: [B:63:0x0113, B:7:0x0022, B:5:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS11S1400000_25.LIZ$0():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS11S1400000_25.LIZ$1():void");
    }

    public static final void run$0(ARunnableS11S1400000_25 aRunnableS11S1400000_25) {
        boolean zLIZ;
        C1C7U.LIZ("ScreenShotFloatingViewProvider@87d9.showFloatingView$1");
        try {
            aRunnableS11S1400000_25.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ScreenShotFloatingViewProvider@87d9.showFloatingView$1");
    }

    public static final void run$1(ARunnableS11S1400000_25 aRunnableS11S1400000_25) {
        boolean zLIZ;
        C1C7U.LIZ("EditorTabModule@a6e1.tryShowCelebrationTooltipAndReport$1");
        try {
            aRunnableS11S1400000_25.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditorTabModule@a6e1.tryShowCelebrationTooltipAndReport$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS11S1400000_25(Object obj, View view, C1653370t7v c1653370t7v, List<PreloadConfig> list, C1653530t8B c1653530t8B, String str) {
        this.$t = str;
        this.l1 = obj;
        this.l2 = view;
        this.l3 = c1653370t7v;
        this.l4 = list;
        this.s0 = c1653530t8B;
    }
}
