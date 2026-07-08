package X;

import Y.ARunnableS12S0000100_12;
import com.bytedance.android.livesdk.livesetting.broadcast.NegativeTestExperiment;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0UUr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C773190UUr {
    public static final C01GW<C773190UUr> LIZIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS199S0000000_12.get$arr$(233));
    public ExecutorService LIZ;

    public final void LIZ() {
        NegativeTestExperiment negativeTestExperiment = NegativeTestExperiment.INSTANCE;
        if (negativeTestExperiment.isEnable()) {
            C20441214yg.LJIIIZ("negative_test", "startNegativeTest--------!!!!!!");
            long cpuSleepTime = negativeTestExperiment.getCpuSleepTime();
            ExecutorService executorServiceLIZ = C823050WQl.LIZ(C2123508Tp.LIZ(C0WQX.SERIAL).LIZ());
            this.LIZ = executorServiceLIZ;
            executorServiceLIZ.submit(new ARunnableS12S0000100_12(cpuSleepTime, 2));
        }
    }
}
