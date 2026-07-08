package com.benchmark.bytemonitor.nativePort;

import android.os.SystemClock;
import com.benchmark.bytemonitor.BatteryMonitor;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class ByteMonitorPort {
    public static volatile boolean LIZ;

    public static native void nativeInit(BatteryMonitor batteryMonitor);

    static {
        try {
            LoadSoLancet.LIZJ("bytemonitor");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("bytemonitor");
            LoadSoLancet.LJ(jUptimeMillis, "bytemonitor");
            LoadSoLancet.LIZLLL(jUptimeMillis, "bytemonitor");
            LoadSoLancet.LIZIZ("bytemonitor");
            LIZ = true;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ(BatteryMonitor batteryMonitor) {
        try {
            if (LIZ) {
                nativeInit(batteryMonitor);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
