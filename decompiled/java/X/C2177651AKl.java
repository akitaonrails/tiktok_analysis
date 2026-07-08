package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.livesdk.performance.memory.MemoryTriggerSetting;

/* JADX INFO: renamed from: X.1AKl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2177651AKl {
    public static C1776980wLI LIZLLL(Context context) {
        ActivityManager activityManager;
        Object objH2 = C786410Ut5.H2(context, "activity");
        if ((objH2 instanceof ActivityManager) && (activityManager = (ActivityManager) objH2) != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+y92D02EruZYmZej6biayyJta1uat0VJFJgi5nTpNQ==", null));
            return new C1776980wLI(LIZJ(memoryInfo.availMem, memoryInfo.totalMem), memoryInfo.availMem, memoryInfo.totalMem);
        }
        return new C1776980wLI(EnumC2177591AKf.NONE, -1L, -1L);
    }

    public static C2177601AKg LIZ(C1776970wLH c1776970wLH, C1776980wLI c1776980wLI) {
        return new C2177601AKg(c1776970wLH.LIZ, c1776970wLH.LIZIZ, c1776970wLH.LIZJ, c1776980wLI.LIZ, c1776980wLI.LIZIZ, c1776980wLI.LIZJ, SystemClock.elapsedRealtime());
    }

    public static EnumC2177591AKf LIZJ(long j, long j2) {
        long jMax = Math.max(j / ((long) 1048576), 0L);
        if (jMax <= MemoryTriggerSetting.getCacheDeviceRamCriticalMB(j2)) {
            return EnumC2177591AKf.CRITICAL;
        }
        if (jMax <= MemoryTriggerSetting.getCacheDeviceRamLowMB(j2)) {
            return EnumC2177591AKf.LOW;
        }
        return EnumC2177591AKf.NORMAL;
    }

    public static EnumC2177591AKf LJ(long j, long j2) {
        long jMax = Math.max(j / ((long) 1048576), 0L);
        if (jMax <= MemoryTriggerSetting.getCacheJavaHeapCriticalMB(j2)) {
            return EnumC2177591AKf.CRITICAL;
        }
        if (jMax <= MemoryTriggerSetting.getCacheJavaHeapLowMB(j2)) {
            return EnumC2177591AKf.LOW;
        }
        return EnumC2177591AKf.NORMAL;
    }
}
