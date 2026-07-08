package X;

import com.bytedance.memrelief.pressure.MemoryPressureWatcher;
import com.ss.android.ugc.aweme.memory.ab.MemoryEwmaConfigParameters;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0rpu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1603760rpu {
    public static void LIZ() {
        boolean zBooleanValue = ((Boolean) C1603780rpw.LIZJ.getValue()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) C1603790rpx.LIZJ.getValue()).booleanValue();
        if (zBooleanValue) {
            MemoryEwmaConfigParameters memoryEwmaConfigParameters = (MemoryEwmaConfigParameters) C1603780rpw.LIZIZ.getValue();
            C1591290rVn debounceConfig = MemoryPressureWatcher.getInstance().getJavaImpl().getDebounceConfig();
            debounceConfig.LIZ = memoryEwmaConfigParameters.windowSize * memoryEwmaConfigParameters.freezeFactor;
            debounceConfig.LIZIZ = memoryEwmaConfigParameters.hysteresisRatio;
            debounceConfig.LIZJ = memoryEwmaConfigParameters.dwellSize;
            MemoryPressureWatcher.getInstance().getJavaImpl().setNewEwma(memoryEwmaConfigParameters.newEwma);
            MemoryPressureWatcher.getInstance().getJavaImpl().setDebug(C089K.LIZ());
            MemoryPressureWatcher.getInstance().getJavaImpl().init(new C1591240rVi(memoryEwmaConfigParameters.period, memoryEwmaConfigParameters.windowSize, memoryEwmaConfigParameters.alpha, memoryEwmaConfigParameters.ewmaRate, memoryEwmaConfigParameters.lowValue, memoryEwmaConfigParameters.extremeValue));
        } else {
            zBooleanValue = false;
        }
        if (zBooleanValue2) {
            MemoryEwmaConfigParameters memoryEwmaConfigParameters2 = (MemoryEwmaConfigParameters) C1603790rpx.LIZIZ.getValue();
            C1591290rVn debounceConfig2 = MemoryPressureWatcher.getInstance().getNativeImpl().getDebounceConfig();
            debounceConfig2.LIZ = memoryEwmaConfigParameters2.windowSize * memoryEwmaConfigParameters2.freezeFactor;
            debounceConfig2.LIZIZ = memoryEwmaConfigParameters2.hysteresisRatio;
            debounceConfig2.LIZJ = memoryEwmaConfigParameters2.dwellSize;
            MemoryPressureWatcher.getInstance().getNativeImpl().setNewEwma(memoryEwmaConfigParameters2.newEwma);
            MemoryPressureWatcher.getInstance().getNativeImpl().setDebug(C089K.LIZ());
            MemoryPressureWatcher.getInstance().getNativeImpl().init(new C1591240rVi(memoryEwmaConfigParameters2.period, memoryEwmaConfigParameters2.windowSize, memoryEwmaConfigParameters2.alpha, memoryEwmaConfigParameters2.ewmaRate, memoryEwmaConfigParameters2.lowValue, memoryEwmaConfigParameters2.extremeValue));
        }
        if (zBooleanValue || zBooleanValue2) {
            MemoryPressureWatcher.getInstance().registerMemoryLevelChangeListener(new InterfaceC1603810rpz() { // from class: X.0rpy
                @Override // X.InterfaceC1603810rpz
                public final void LIZ(C09Q3 c09q3) {
                }

                @Override // X.InterfaceC1603810rpz
                public final void LIZIZ(C09Q3 c09q3) {
                }
            });
            MemoryPressureWatcher.getInstance().start();
            final boolean z = ((MemoryEwmaConfigParameters) C1603780rpw.LIZIZ.getValue()).monitor;
            final boolean z2 = ((MemoryEwmaConfigParameters) C1603790rpx.LIZIZ.getValue()).monitor;
            if (z || z2) {
                C823050WQl.LJ().scheduleWithFixedDelay(new Runnable() { // from class: X.08K5
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("MemoryGlobalEwmaPressure@4447.start$2");
                        try {
                            if (z) {
                                C09Q3 javaMemoryLevel = MemoryPressureWatcher.getInstance().getJavaMemoryLevel();
                                boolean z3 = C2142408aM.LIZ;
                                C2142408aM.LIZ(javaMemoryLevel.ordinal(), "java");
                            }
                            if (z2) {
                                C09Q3 nativeMemoryLevel = MemoryPressureWatcher.getInstance().getNativeMemoryLevel();
                                boolean z4 = C2142408aM.LIZ;
                                C2142408aM.LIZ(nativeMemoryLevel.ordinal(), "native");
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("MemoryGlobalEwmaPressure@4447.start$2");
                    }
                }, 0L, 300000L, TimeUnit.MILLISECONDS);
            }
        }
    }
}
