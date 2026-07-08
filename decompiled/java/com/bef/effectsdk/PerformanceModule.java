package com.bef.effectsdk;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class PerformanceModule {
    public static final List<String> list;
    public final Map<String, Object> extras;
    public final boolean monitorCPU;
    public final boolean monitorFPS;
    public final boolean monitorGPU;
    public final boolean monitorMemory;
    public final boolean monitorThermal;
    public long nativeHandle;
    public final long timeIntervalInMillis;

    public static class Builder {
        public boolean monitorCPU;
        public boolean monitorFPS;
        public boolean monitorGPU;
        public boolean monitorMemory;
        public boolean monitorThermal;
        public long timeIntervalInMillis = 1000;
        public final Map<String, Object> extras = new HashMap();

        public Builder withCpu() {
            this.monitorCPU = true;
            return this;
        }

        public Builder withFPS() {
            this.monitorFPS = true;
            return this;
        }

        public Builder withGPU() {
            this.monitorGPU = true;
            return this;
        }

        public Builder withMemory() {
            this.monitorMemory = true;
            return this;
        }

        public Builder withThermal() {
            this.monitorThermal = true;
            return this;
        }

        public PerformanceModule build() {
            if (this.monitorCPU || this.monitorMemory || this.monitorThermal || this.monitorFPS || this.monitorGPU) {
                return new PerformanceModule(this);
            }
            throw new IllegalArgumentException("monitor type not set");
        }

        public Builder withTimeIntervalInMillis(long j) {
            this.timeIntervalInMillis = j;
            return this;
        }

        public Builder withExtra(String str, Object obj) {
            this.extras.put(str, obj);
            return this;
        }
    }

    public static class PerfMetrics {
        public float cpuProcUsage;
        public float cpuUsage;
        public float fps;
        public float gpuUsage;
        public float memory;
        public float memoryUsage;
        public float temperature;
        public float virtualMemory;
    }

    public static class PerfMetricsStats {
        public float cpuProcUsageAvg;
        public float cpuProcUsageMax;
        public float cpuUsageAvg;
        public float cpuUsageMax;
        public float fpsAvg;
        public float fpsMax;
        public float gpuUsageAvg;
        public float gpuUsageMax;
        public float memoryUsageAvg;
        public float memoryUsageMax;
        public float temperatureAvg;
        public float temperatureMax;
        public float virtualMemoryAvg;
        public float virtualMemoryMax;
    }

    private native long getOrCreateHandle(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, Map<String, Object> map);

    private native PerfMetrics nativeGetSnapshot(long j);

    private native PerfMetricsStats nativeGetStats(long j);

    private native void nativePause(long j);

    private native void nativeResume(long j);

    private native void nativeStart(long j);

    private native void nativeStop(long j);

    private native void releaseHandle(String str);

    static {
        List<String> listAsList = Arrays.asList("effect");
        list = listAsList;
        try {
            Iterator<String> it2 = listAsList.iterator();
            while (it2.hasNext()) {
                INVOKESTATIC_com_bef_effectsdk_PerformanceModule_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(it2.next());
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public PerfMetrics getSnapshot() {
        return nativeGetSnapshot(this.nativeHandle);
    }

    public PerfMetricsStats getStats() {
        return nativeGetStats(this.nativeHandle);
    }

    public void pause() {
        long j = this.nativeHandle;
        if (j == -1) {
            return;
        }
        nativePause(j);
    }

    public void release() {
        releaseHandle("AndroidCreation");
        this.nativeHandle = -1L;
    }

    public void resume() {
        long j = this.nativeHandle;
        if (j == -1) {
            return;
        }
        nativeResume(j);
    }

    public void start() {
        long j = this.nativeHandle;
        if (j == -1) {
            return;
        }
        nativeStart(j);
    }

    public void stop() {
        long j = this.nativeHandle;
        if (j == -1) {
            return;
        }
        nativeStop(j);
    }

    public PerformanceModule(Builder builder) {
        this.nativeHandle = -1L;
        boolean z = builder.monitorCPU;
        this.monitorCPU = z;
        boolean z2 = builder.monitorMemory;
        this.monitorMemory = z2;
        boolean z3 = builder.monitorThermal;
        this.monitorThermal = z3;
        boolean z4 = builder.monitorFPS;
        this.monitorFPS = z4;
        boolean z5 = builder.monitorGPU;
        this.monitorGPU = z5;
        long j = builder.timeIntervalInMillis;
        this.timeIntervalInMillis = j;
        Map<String, Object> mapUnmodifiableMap = Collections.unmodifiableMap(builder.extras);
        this.extras = mapUnmodifiableMap;
        this.nativeHandle = getOrCreateHandle("AndroidCreation", z, z2, z3, z4, z5, j, mapUnmodifiableMap);
    }

    public static void INVOKESTATIC_com_bef_effectsdk_PerformanceModule_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }
}
