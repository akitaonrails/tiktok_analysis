package Y;

import X.C1699700uKe;
import X.C1700330uLf;
import X.C1C7U;
import android.os.Build;
import android.view.Choreographer;
import com.bytedance.common.jato.jit.JitCodeCacheGc;
import com.bytedance.common.jato.jit.ProfileInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS24S0100100_26 implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

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
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        try {
            Thread.sleep(15000L);
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ((ArrayList) this.l0).size(); i++) {
            ListProtector.get((ArrayList) this.l0, i).getClass();
        }
        JitCodeCacheGc.disable();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ListProtector.get(arrayList, i2).getClass();
            ProfileInfo.createProfileForMethod(null, null, null);
        }
        ProfileInfo.forceSaveProfile();
        JitCodeCacheGc.enable();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ListProtector.get(arrayList, i3).getClass();
            ProfileInfo.jitMethod(null);
            long j = this.j1;
            if (j > 0) {
                try {
                    Thread.sleep(j);
                } catch (InterruptedException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
    }

    public static final void run$0(ARunnableS24S0100100_26 aRunnableS24S0100100_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.createProfileForMethods$1");
        try {
            ArrayList arrayList = (ArrayList) aRunnableS24S0100100_26.l0;
            long j = aRunnableS24S0100100_26.j1;
            if (Build.VERSION.SDK_INT < 29) {
                ExecutorService executorService = ProfileInfo.LIZ;
            } else if (ProfileInfo.init()) {
                ProfileInfo.LIZ.execute(new ARunnableS24S0100100_26(arrayList, j, 1));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.createProfileForMethods$1");
    }

    public static final void run$1(ARunnableS24S0100100_26 aRunnableS24S0100100_26) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileInfo@e852.createProfileForMethods$1");
        try {
            aRunnableS24S0100100_26.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileInfo@e852.createProfileForMethods$1");
    }

    public static final void run$2(ARunnableS24S0100100_26 aRunnableS24S0100100_26) {
        boolean zLIZ;
        C1C7U.LIZ("FpsDowngradeHelper@9826.addStartupJankDoFrameBarrier$1$doFrame$1$println$1");
        try {
            Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
            declaredField.setAccessible(true);
            long jNanoTime = System.nanoTime();
            if (jNanoTime < aRunnableS24S0100100_26.j1) {
                declaredField.set(((C1700330uLf) aRunnableS24S0100100_26.l0).LLILZLL.LLILLJJLI, Long.valueOf(jNanoTime));
            }
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("FpsDowngradeHelper@9826.addStartupJankDoFrameBarrier$1$doFrame$1$println$1");
    }

    public static final void run$3(ARunnableS24S0100100_26 aRunnableS24S0100100_26) {
        boolean zLIZ;
        C1C7U.LIZ("HighPrecisionTimer@61a0.tickRunnable$1$run$2");
        try {
            ((C1699700uKe) aRunnableS24S0100100_26.l0).LIZIZ.invoke(Long.valueOf(aRunnableS24S0100100_26.j1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HighPrecisionTimer@61a0.tickRunnable$1$run$2");
    }

    public ARunnableS24S0100100_26(Object obj, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
