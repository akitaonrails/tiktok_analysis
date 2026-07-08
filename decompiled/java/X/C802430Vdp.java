package X;

import Y.ARunnableS46S0300000_13;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.looper.MessageRecorder;
import com.bytedance.crash.monitor.k;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Vdp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802430Vdp {
    public static C802430Vdp LJII = null;
    public static long LJIIIIZZ = 0;
    public static boolean LJIIIZ = true;
    public static boolean LJIIJ = false;
    public static volatile boolean LJIIJJI = true;
    public static InterfaceC2076108Bj LJIIL;
    public AbstractC802420Vdo LIZ;
    public final C803740Vfw LIZIZ = new Object() { // from class: X.0Vfw
    };
    public final C802620Ve8 LIZJ;
    public final C803560Vfe LIZLLL;
    public boolean LJ;
    public final C0VSJ LJFF;
    public long LJI;

    public static void LIZLLL(AbstractC802420Vdo abstractC802420Vdo) {
        C802430Vdp c802430Vdp = LJII;
        if (c802430Vdp != null) {
            synchronized (c802430Vdp) {
                C802430Vdp c802430Vdp2 = LJII;
                if (c802430Vdp2.LIZ == abstractC802420Vdo) {
                    c802430Vdp2.LIZ = null;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Vfw] */
    public C802430Vdp(Context context, File file) {
        C0VSJ c0vsjLIZIZ = C2112008Pe.LIZIZ(file, "anr");
        this.LJFF = c0vsjLIZIZ;
        this.LIZJ = new C802620Ve8(context, c0vsjLIZIZ);
        this.LIZLLL = new C803560Vfe();
    }

    public static void LIZIZ(C0VSJ c0vsj, long j) {
        C802430Vdp c802430Vdp = LJII;
        if (c802430Vdp != null && c802430Vdp.LJ) {
            try {
                c802430Vdp.LIZ(j, false, c0vsj, 0, LSPassThroughRecordSizeConfig.DEFAULT);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C802700VeG.LIZJ(th);
            }
        }
    }

    public static synchronized void LJ(final Context context, final C0VSJ c0vsj) {
        C0VXF.post(new Runnable() { // from class: X.0VeC
            public final void LIZ() {
                if (C802430Vdp.LJII == null) {
                    C802430Vdp.LJII = new C802430Vdp(context, c0vsj);
                }
                C802430Vdp c802430Vdp = C802430Vdp.LJII;
                if (c802430Vdp.LJ) {
                    return;
                }
                c802430Vdp.LJ = true;
                c802430Vdp.LIZIZ.getClass();
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0T5m
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AnrSignalMonitor@ca33.initOnMainThread$1");
                        try {
                            NativeBridge.LJIIIIZZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AnrSignalMonitor@ca33.initOnMainThread$1");
                    }
                });
                C0VXF.post(new Runnable() { // from class: X.0CC1
                    @Override // java.lang.Runnable
                    @C1BCF(distinctId = 22, scene = "boot", taskPriority = EnumC21352718hJ.P2)
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AnrSignalMonitor@ca33.initOnSubThread$1");
                        try {
                            new BPEAThread(new Runnable() { // from class: X.0Vec
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ2;
                                    C1C7U.LIZ("AnrSignalMonitor@ca33.initOnSubThread$1$1");
                                    try {
                                        if (Header.LIZJ == -1) {
                                            Header.LIZJ = C2161108dN.LIZ().contains("64") ? 1 : 0;
                                        }
                                        NativeBridge.LJJJJJ(Header.LIZJ == 1);
                                        NativeBridge.LJJJJL(C801930Vd1.LIZLLL);
                                        NativeBridge.LJII();
                                    } finally {
                                        if (!zLIZ2) {
                                        }
                                    }
                                    C1C7U.LIZIZ("AnrSignalMonitor@ca33.initOnSubThread$1$1");
                                }
                            }, "NPTH-AnrMonitor").start();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AnrSignalMonitor@ca33.initOnSubThread$1");
                    }
                });
                C802620Ve8 c802620Ve8 = c802430Vdp.LIZJ;
                if (!c802620Ve8.LIZ) {
                    c802620Ve8.LIZ = true;
                    c802620Ve8.LIZIZ.startWatching();
                    if (C803490VfX.LIZIZ) {
                        C802670VeD c802670VeD = new C802670VeD(c802620Ve8);
                        c802620Ve8.LJ = c802670VeD;
                        c802670VeD.start();
                    } else {
                        new BPEAThread(c802620Ve8.LIZLLL) { // from class: X.0Ve9
                            public final C0VSJ LL;

                            @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
                            @C1BCF(distinctId = 19, scene = "boot", taskPriority = EnumC21352718hJ.P2)
                            public final void run() {
                                C1C7U.LIZ("AnrInfoMonitor$AnrInfoWriter@d8cc.run");
                                boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                                try {
                                    LIZJ();
                                } finally {
                                }
                                if (zLJ) {
                                    C0W9U.LJFF();
                                }
                                C1C7U.LIZIZ("AnrInfoMonitor$AnrInfoWriter@d8cc.run");
                            }

                            public final void LIZJ() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("AnrInfoMonitor:prepare lock：");
                                sbLIZ.append(C802270VdZ.LIZJ());
                                C2188811AlT.LIZIZ(sbLIZ);
                                int iLJIILLIIL = NativeBridge.LJIILLIIL(this.LL.getAbsolutePath());
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("AnrInfoMonitor:run：");
                                sbLIZ2.append(C802270VdZ.LIZJ());
                                C2188811AlT.LIZIZ(sbLIZ2);
                                ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(this.LLILLJJLI.LIZJ, "activity");
                                long j = C802300Vdc.LIZIZ;
                                ActivityManager.ProcessErrorStateInfo processErrorStateInfo = null;
                                while (this.LLILLJJLI.LIZ) {
                                    SystemClock.sleep(j);
                                    if (activityManager != null || (activityManager = (ActivityManager) C786410Ut5.H2(this.LLILLJJLI.LIZJ, "activity")) != null) {
                                        try {
                                            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                                            if (processesInErrorState != null) {
                                                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo2 : processesInErrorState) {
                                                    if (processErrorStateInfo2.condition == 2 && (processErrorStateInfo == null || !C802470Vdt.LJFF(processErrorStateInfo, processErrorStateInfo2))) {
                                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                                        C0VSJ c0vsj2 = new C0VSJ(this.LLILLJJLI.LIZLLL, C802620Ve8.LIZIZ(processErrorStateInfo2.pid, jCurrentTimeMillis, Process.myPid() == processErrorStateInfo2.pid));
                                                        C2112008Pe.LJII(c0vsj2, C802470Vdt.LIZLLL(processErrorStateInfo2));
                                                        if (c0vsj2.exists()) {
                                                            try {
                                                                if (Process.myPid() == processErrorStateInfo2.pid) {
                                                                    C802430Vdp.LIZIZ(c0vsj2, jCurrentTimeMillis);
                                                                }
                                                                SystemClock.sleep(20 * j);
                                                                processErrorStateInfo = processErrorStateInfo2;
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                TryCatchGuardChecker.doCheck(th);
                                                                processErrorStateInfo = processErrorStateInfo2;
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            processErrorStateInfo2 = processErrorStateInfo;
                                        }
                                    }
                                }
                                if (iLJIILLIIL != -1) {
                                    try {
                                        NativeBridge.LJJLIIIJJIZ(iLJIILLIIL);
                                    } catch (Throwable th3) {
                                        TryCatchGuardChecker.doCheck(th3);
                                    }
                                }
                            }

                            {
                                super("NPTH-AnrInfoPolling");
                                this.LL = C2112008Pe.LIZLLL(c0vsj, "monitor.lock");
                            }
                        }.start();
                    }
                }
                final C803560Vfe c803560Vfe = c802430Vdp.LIZLLL;
                c803560Vfe.getClass();
                C0VXF.post(new Runnable() { // from class: X.0VeQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1C7U.LIZ("AnrProfiler@27ce.start$1");
                        try {
                            try {
                            } finally {
                            }
                            if (!"true".equals(C08SE.LIZJ(new C0VSJ(C0VX9.LIZLLL(), "anr_profiler.config")))) {
                                c803560Vfe.LIZ = NativeBridge.nAnrNativeProfilerStart();
                                C0VXF.postDelayed(new Runnable() { // from class: X.0VeH
                                    public static void LIZ() {
                                        synchronized (C803560Vfe.class) {
                                            try {
                                                Thread thread = Looper.getMainLooper().getThread();
                                                Field declaredField = Thread.class.getDeclaredField("nativePeer");
                                                declaredField.setAccessible(true);
                                                int iNAnrNativeProfilerJvmStart = NativeBridge.nAnrNativeProfilerJvmStart(declaredField.getLong(thread));
                                                int iLJIJJLI = NativeBridge.LJIJJLI();
                                                int iLJIIZILJ = NativeBridge.LJIIZILJ();
                                                C802790VeP c802790VeP = k.LIZ;
                                                if (c802790VeP != null) {
                                                    c802790VeP.LIZJ.LIZIZ("jvm_monitor_state", String.valueOf(iLJIJJLI));
                                                    c802790VeP.LIZJ.LIZIZ("apex_version", String.valueOf(iLJIIZILJ));
                                                }
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append("setMonitorJvm ");
                                                sbLIZ.append(iNAnrNativeProfilerJvmStart);
                                                sbLIZ.append(", ");
                                                sbLIZ.append(iLJIJJLI);
                                                C2188811AlT.LIZIZ(sbLIZ);
                                                C802300Vdc.LIZ();
                                                C0VYR.LIZJ.getClass();
                                                if (C803490VfX.LJI) {
                                                    C802790VeP c802790VeP2 = k.LIZ;
                                                    if (c802790VeP2 != null) {
                                                        c802790VeP2.LIZJ.LIZIZ("leak_object_enable", "1");
                                                    }
                                                    NativeBridge.LJJJLZIJ();
                                                }
                                            } finally {
                                            }
                                        }
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("AnrProfiler@27ce.start$1$1");
                                        try {
                                            LIZ();
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("AnrProfiler@27ce.start$1$1");
                                    }
                                }, 3000L);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (!C2179971ATj.LIZ(th)) {
                            }
                        }
                        C1C7U.LIZIZ("AnrProfiler@27ce.start$1");
                    }
                });
                C0VXH c0vxh = C0VXH.LJIIIZ;
                int i = 0;
                do {
                    c0vxh.LIZ[i] = new C0VXJ();
                    i++;
                } while (i < 300);
                C0VXF.postDelayed(c0vxh.LJIIIIZZ, 1000L);
                c0vxh.LJII = true;
                MessageRecorder.LJFF();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AnrManager@4d13.startMonitor$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AnrManager@4d13.startMonitor$1");
            }
        });
    }

    public final void LJFF(C802790VeP c802790VeP, long j) {
        long j2;
        long j3;
        try {
            this.LIZJ.LJ(this.LJFF);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C802700VeG.LIZJ(e);
        }
        File[] fileArrListFiles = this.LJFF.listFiles(new FilenameFilter() { // from class: X.08Ac
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                String[] strArrSplit = str.split("-");
                if (strArrSplit.length == 2) {
                    try {
                        CastLongProtector.parseLong(strArrSplit[0]);
                        CastIntegerProtector.parseInt(strArrSplit[1]);
                        return true;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                return false;
            }
        });
        int length = fileArrListFiles.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            File file = fileArrListFiles[i2];
            try {
                String[] strArrSplit = file.getName().split("-");
                if (strArrSplit.length == 2) {
                    j2 = CastLongProtector.parseLong(strArrSplit[i]);
                    try {
                        j3 = CastIntegerProtector.parseInt(strArrSplit[1]);
                    } catch (Throwable th) {
                        th = th;
                        TryCatchGuardChecker.doCheck(th);
                        j3 = 0;
                    }
                } else {
                    j2 = 0;
                    j3 = 0;
                }
            } catch (Throwable th2) {
                th = th2;
                j2 = 0;
            }
            if (j2 != C0VX9.LIZJ() || j3 != Process.myPid()) {
                File[] fileArrListFiles2 = file.listFiles(new FilenameFilter() { // from class: X.08ES
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str) {
                        if (new C0VSJ(file2, str).isDirectory()) {
                            try {
                                CastLongProtector.parseLong(str);
                                return true;
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                return false;
                            }
                        }
                        return false;
                    }
                });
                if (j > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : fileArrListFiles2) {
                        C802440Vdq c802440VdqLJI = C802440Vdq.LJI(file2);
                        if (c802440VdqLJI == null) {
                            C2112008Pe.LJ(file2);
                            C802700VeG.LIZJ(new Exception("invalid summary : neither AnrInfo nor Stack"));
                        } else {
                            C802500Vdw.LIZLLL(CrashType.ANR, c802440VdqLJI.getProcessName(), c802440VdqLJI.getPid(), c802440VdqLJI.getCrashTime());
                            if (c802440VdqLJI.getCrashTime() - c802440VdqLJI.getStartTime() <= C802300Vdc.LIZ) {
                                c802440VdqLJI.upload(c802790VeP, null);
                            } else {
                                arrayList.add(c802440VdqLJI);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        C0VXF.postDelayed(new ARunnableS46S0300000_13(arrayList, c802790VeP, this, 3), j);
                    }
                } else {
                    int length2 = fileArrListFiles2.length;
                    while (i < length2) {
                        File file3 = fileArrListFiles2[i];
                        C802440Vdq c802440VdqLJI2 = C802440Vdq.LJI(file3);
                        if (c802440VdqLJI2 == null) {
                            C2112008Pe.LJ(file3);
                            C802700VeG.LIZJ(new Exception("invalid summary : neither AnrInfo nor Stack"));
                        } else {
                            C802500Vdw.LIZLLL(CrashType.ANR, c802440VdqLJI2.getProcessName(), c802440VdqLJI2.getPid(), c802440VdqLJI2.getCrashTime());
                            c802440VdqLJI2.upload(c802790VeP, null);
                        }
                        i++;
                    }
                }
                if (file.listFiles(new FilenameFilter() { // from class: X.08ES
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file22, String str) {
                        if (new C0VSJ(file22, str).isDirectory()) {
                            try {
                                CastLongProtector.parseLong(str);
                                return true;
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                return false;
                            }
                        }
                        return false;
                    }
                }).length == 0) {
                    C2112008Pe.LJ(file);
                }
            }
            i2++;
            i = 0;
        }
    }

    public final void LIZJ(int i, int i2, long j) {
        if (!C803490VfX.LIZ) {
            if (j - this.LJI < Mp4ScreenVideoLoadTimeout.CONTROL) {
                return;
            } else {
                this.LJI = j;
            }
        }
        if ((LJIIJJI || i <= 200) && Math.abs(LJIIIIZZ - j) >= 120000) {
            if (Build.VERSION.SDK_INT >= 34 && C803490VfX.LIZ) {
                int i3 = 0;
                do {
                    i3++;
                    try {
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    if (!C802700VeG.LIZIZ()) {
                        Thread.sleep(20L);
                    }
                } while (i3 < 100);
                return;
            }
            if (!C802700VeG.LIZIZ()) {
                return;
            }
            LJIIIIZZ = j;
            C802670VeD c802670VeD = LJII.LIZJ.LJ;
            if (C803490VfX.LIZ) {
                c802670VeD.getClass();
                C2112008Pe.LJII(new C0VSJ(c802670VeD.LLILLJJLI.LIZLLL, C802620Ve8.LIZIZ(Process.myPid(), j, true)), "silent anr no anr info");
            }
            c802670VeD.LL.add(Long.valueOf(j));
            LJII.LIZ(j, true, null, i, i2);
        }
    }

    public final void LIZ(long j, boolean z, C0VSJ c0vsj, int i, int i2) {
        AbstractC802420Vdo c802730VeJ;
        synchronized (this) {
            AbstractC802420Vdo abstractC802420Vdo = this.LIZ;
            if (abstractC802420Vdo == null) {
                C802620Ve8 c802620Ve8 = this.LIZJ;
                C0VSJ c0vsj2 = this.LJFF;
                if (C803490VfX.LIZIZ) {
                    c802730VeJ = new C802820VeS(c802620Ve8, c0vsj2, j, z);
                } else {
                    c802730VeJ = new C802730VeJ(c802620Ve8, c0vsj2, j, z);
                }
                this.LIZ = c802730VeJ;
            } else if (abstractC802420Vdo.LIZIZ(z)) {
                return;
            }
            AbstractC802420Vdo abstractC802420Vdo2 = this.LIZ;
            if (abstractC802420Vdo2 != null) {
                abstractC802420Vdo2.LJ(j, z, c0vsj, i, i2);
            }
        }
    }
}
