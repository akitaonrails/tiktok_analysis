package X;

import Y.ARunnableS113S0100000_13;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.oppo.OppoCrashMonitor;
import com.bytedance.services.apm.api.IFdCheck;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0VYP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VYP {
    public static C0VYP LIZ;

    public C0VYP(Context context, C0VSJ c0vsj) {
        if (!new C0VSJ(c0vsj, "crash").exists()) {
            C0VYH.LJIILL = true;
        }
        synchronized (C802600Ve6.class) {
            if (C802600Ve6.LIZLLL == null) {
                C802600Ve6.LIZLLL = new C802600Ve6(context, c0vsj);
            }
        }
        C0VYT.LIZ("Crash_Init");
        C802430Vdp.LJ(context, c0vsj);
        C0VYT.LIZ("Anr_Init");
        C0VXF.LIZIZ().LIZJ(0L, new Runnable() { // from class: X.0VJN
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NpthCore$CrashCore@450c.startMonitor$1");
                try {
                    C0VYH.LIZIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NpthCore$CrashCore@450c.startMonitor$1");
            }
        });
        C0VXM.LJI.LIZ = true;
        C0VXF.post(new Runnable() { // from class: X.0VdM
            public static void LIZ() {
                if (C803490VfX.LJFF) {
                    String str = Build.MANUFACTURER;
                    if (!TextUtils.isEmpty(str) && str.toLowerCase(Locale.getDefault()).contains("oppo")) {
                        OppoCrashMonitor.getInstance().start(C0VX9.LJ());
                    }
                }
                C802230VdV c802230VdVLJ = C802230VdV.LJ();
                if (c802230VdVLJ != null) {
                    c802230VdVLJ.LJIIZILJ();
                    if (c802230VdVLJ.LIZ.size() > 0) {
                        if (C802230VdV.LJII) {
                            c802230VdVLJ.LJIILIIL();
                        }
                        if (C802270VdZ.LJFF(C0VX9.LJ(), C802270VdZ.LIZJ())) {
                            C0VXF.post(new ARunnableS113S0100000_13(c802230VdVLJ, 202));
                        }
                    }
                    C0VSJ c0vsj2 = c802230VdVLJ.LIZIZ;
                    if (c0vsj2 != null && !c0vsj2.exists()) {
                        try {
                            c0vsj2.createNewFile();
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    FileObserverC802310Vdd fileObserverC802310Vdd = c802230VdVLJ.LJ;
                    if (fileObserverC802310Vdd != null) {
                        fileObserverC802310Vdd.startWatching();
                    }
                }
                Context contextLJ = C0VX9.LJ();
                if (contextLJ != null && !new C0VSJ(contextLJ.getApplicationInfo().nativeLibraryDir, "libnpth_dumper.so").exists()) {
                    C0VSJ c0vsj3 = new C0VSJ(C08P6.LJ.LIZJ, String.valueOf(40201164));
                    if (!c0vsj3.exists()) {
                        c0vsj3.mkdirs();
                    }
                    if (!new C0VSJ(c0vsj3, "libnpth_dumper.so").exists() && C08OP.LIZ(contextLJ, "c++_shared", c0vsj3) && C08OP.LIZ(contextLJ, "npth_unwind", c0vsj3)) {
                        C08OP.LIZ(contextLJ, "npth_dumper", c0vsj3);
                    }
                }
                C801930Vd1.LIZ();
                C0VXF.post(new Runnable() { // from class: X.09cZ
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("TrackerManager@8bd0.start$1");
                        try {
                            final C2411009ca c2411009caLIZ = C2411009ca.LIZ();
                            c2411009caLIZ.getClass();
                            Context contextLJ2 = C0VX9.LJ();
                            if (contextLJ2 != null) {
                                try {
                                    C786410Ut5.LJIJJ(contextLJ2, new BroadcastReceiver() { // from class: X.09cY
                                        public final void LIZ(Intent intent) {
                                            try {
                                                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                                                    int intExtra = intent.getIntExtra("level", 0);
                                                    c2411009caLIZ.LIZ = (intExtra * 100) / intent.getIntExtra("scale", 100);
                                                }
                                            } catch (Exception e2) {
                                                TryCatchGuardChecker.doCheck(e2);
                                            }
                                        }

                                        @Override // android.content.BroadcastReceiver
                                        public final void onReceive(Context context2, Intent intent) {
                                            if (!C2214201BlK.LJIIJJI && intent != null) {
                                                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                                                    C2188191AkT.LIZIZ();
                                                }
                                            }
                                            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                                                LIZ(intent);
                                            } else {
                                                C2408409cA.LIZ();
                                                LIZ(intent);
                                            }
                                        }
                                    }, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("TrackerManager@8bd0.start$1");
                    }
                });
                NativeBridge.LJJJLL();
                NativeBridge.LJIILL();
                try {
                    C803620Vfk.LIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                try {
                    C791500V3c.LIZ = new InterfaceC791480V3a() { // from class: X.0VdR
                    };
                    C791500V3c.LIZIZ = new InterfaceC791520V3e() { // from class: X.0VdS
                    };
                } catch (Throwable th2) {
                    try {
                        TryCatchGuardChecker.doCheck(th2);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                    }
                }
                try {
                    C802160VdO.LIZ = new Runnable() { // from class: X.0T26
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("NpthAlog@265e.init$1");
                            try {
                                ALog.syncFlush();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("NpthAlog@265e.init$1");
                        }
                    };
                    C802160VdO.LIZIZ = new InterfaceC802210VdT() { // from class: X.0VdP
                    };
                    C802160VdO.LIZJ = new InterfaceC802220VdU() { // from class: X.0VdQ
                    };
                    if (C802160VdO.LIZIZ != null && C802160VdO.LIZ != null) {
                        C802110VdJ.LIZ = new InterfaceC801750Vcj() { // from class: X.0VdN
                            @Override // X.InterfaceC801750Vcj
                            public final boolean isInit() {
                                try {
                                    if (C802160VdO.LIZJ != null) {
                                        return ALog.isInitSuccess();
                                    }
                                    return false;
                                } catch (Throwable th4) {
                                    TryCatchGuardChecker.doCheck(th4);
                                    return false;
                                }
                            }

                            @Override // X.InterfaceC801750Vcj
                            public final void flush() {
                                try {
                                    Runnable runnable = C802160VdO.LIZ;
                                    if (runnable != null) {
                                        runnable.run();
                                    }
                                } catch (Throwable th4) {
                                    TryCatchGuardChecker.doCheck(th4);
                                }
                            }

                            @Override // X.InterfaceC801750Vcj
                            public final List<String> LIZ(long j, String str2) {
                                List<String> aLogFiles = null;
                                try {
                                    if (C802160VdO.LIZIZ == null) {
                                        return null;
                                    }
                                    long j2 = j / 1000;
                                    aLogFiles = ALog.getALogFiles(str2, null, j2 - 3600, j2);
                                    return aLogFiles;
                                } catch (Throwable th4) {
                                    TryCatchGuardChecker.doCheck(th4);
                                    return aLogFiles;
                                }
                            }
                        };
                    }
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                }
                try {
                    if (C0VX9.LJ() != null) {
                        C802400Vdm.LIZIZ(new C0VSJ(C0VX9.LJFF(), "custom_tags"));
                        C802400Vdm.LIZIZ(new C0VSJ(C0VX9.LJFF(), "tags"));
                    }
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                }
                Pattern pattern = C0VXA.LIZ;
                C0VXF.postDelayed(new Runnable() { // from class: X.0VXB
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PluginInfoManager@a2c6.init$2");
                        try {
                            C0VXA.LIZ();
                        } finally {
                            try {
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                        }
                        C1C7U.LIZIZ("PluginInfoManager@a2c6.init$2");
                    }
                }, 1000L);
                if (C802270VdZ.LJ()) {
                    C0VXF.postDelayed(new RunnableC802130VdL(), 0L);
                }
                C792600V7i.LIZ.put(IFdCheck.class, new IFdCheck() { // from class: com.bytedance.crash.NpthCore$1
                    @Override // com.bytedance.services.apm.api.IFdCheck
                    public List<String> getFdList() {
                        return new ArrayList();
                    }
                });
                C0VXF.post(new Runnable() { // from class: X.0VET
                    public final /* synthetic */ C0VES LL = C0VES.LIZ;

                    public final void LIZ() {
                        this.LL.getClass();
                        try {
                            C0VSJ c0vsjLJFF = C0VX9.LJFF();
                            if (new C0VSJ(c0vsjLJFF, "crash.deleted").exists()) {
                                return;
                            }
                            C08SE.LIZIZ(new C0VSJ(c0vsjLJFF, "RuntimeContext"));
                            C08SE.LIZIZ(new C0VSJ(c0vsjLJFF, "ProcessTrack"));
                            C08SE.LIZIZ(new C0VSJ(c0vsjLJFF, "TrackInfo"));
                            C08SE.LIZIZ(new C0VSJ(c0vsjLJFF, "CrashCommonLog"));
                            C08SE.LIZIZ(new C0VSJ(c0vsjLJFF, "CrashLogJava"));
                            C08SE.LIZIZ(new C0VSJ(c0vsjLJFF, "CrashLogNative"));
                            C08SE.LIZIZ(new C0VSJ(c0vsjLJFF, "procanr"));
                            C08SE.LIZIZ(new C0VSJ(c0vsjLJFF, "configCrash"));
                            new C0VSJ(c0vsjLJFF, "crash.deleted").createNewFile();
                        } catch (Throwable th6) {
                            TryCatchGuardChecker.doCheck(th6);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("NpthDiskMonitor@1bb2.init$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("NpthDiskMonitor@1bb2.init$1");
                    }
                });
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NpthCore$CrashCore@450c.startMonitor$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NpthCore$CrashCore@450c.startMonitor$2");
            }
        });
        C0VYT.LIZ("DefaultWorkThread_Init");
    }
}
