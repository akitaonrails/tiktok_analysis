package Y;

import X.C1273160jEg;
import X.C1273190jEj;
import X.C1277540jLk;
import X.C1C7U;
import X.C2188811AlT;
import android.view.SurfaceHolder;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS1S0203000_20 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public int i4;
    public Object l0;
    public Object l1;

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

    public static final void run$0(ARunnableS1S0203000_20 aRunnableS1S0203000_20) {
        C1277540jLk c1277540jLk = (C1277540jLk) aRunnableS1S0203000_20.l0;
        int[] iArr = (int[]) aRunnableS1S0203000_20.l1;
        int i = aRunnableS1S0203000_20.i2;
        int i2 = aRunnableS1S0203000_20.i3;
        int i3 = aRunnableS1S0203000_20.i4;
        c1277540jLk.getClass();
        C1C7U.LIZ("VeLivePusherWrapper@9eaa.setVideoPerformanceConfig$1L");
        iArr[0] = c1277540jLk.LJI(i, i2, i3);
        C1C7U.LIZIZ("VeLivePusherWrapper@9eaa.setVideoPerformanceConfig$1L");
    }

    public static final void run$1(ARunnableS1S0203000_20 aRunnableS1S0203000_20) {
        SurfaceHolder surfaceHolder = (SurfaceHolder) aRunnableS1S0203000_20.l0;
        int i = aRunnableS1S0203000_20.i2;
        int i2 = aRunnableS1S0203000_20.i3;
        int i3 = aRunnableS1S0203000_20.i4;
        C1273190jEj c1273190jEj = (C1273190jEj) aRunnableS1S0203000_20.l1;
        C1C7U.LIZ("InteractMixManager$setSingleView$1@5d0.surfaceChanged$1L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("surfaceChanged() called with: holder = ");
        sbLIZ.append(surfaceHolder);
        sbLIZ.append(", format = ");
        sbLIZ.append(i);
        sbLIZ.append(", width = ");
        sbLIZ.append(i2);
        sbLIZ.append(", height = ");
        sbLIZ.append(i3);
        sbLIZ.append(" , mRenderTarget = ");
        sbLIZ.append(c1273190jEj.LLILZ);
        AVLog.logKibana(4, "InteractMixManager", C2188811AlT.LIZIZ(sbLIZ), null);
        C1273160jEg c1273160jEg = c1273190jEj.LLILZ;
        if (c1273160jEg != null) {
            c1273160jEg.LIZJ(i2, i3);
        }
        C1C7U.LIZIZ("InteractMixManager$setSingleView$1@5d0.surfaceChanged$1L");
    }

    public ARunnableS1S0203000_20(Object obj, int i, int i2, int i3, Object obj2, int i4) {
        this.$t = i4;
        this.l0 = obj;
        this.i2 = i;
        this.i3 = i2;
        this.i4 = i3;
        this.l1 = obj2;
    }
}
