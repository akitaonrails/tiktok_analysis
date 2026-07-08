package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS72S0200000_3;
import Y.ARunnableS89S0200000_20;
import android.os.Looper;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.params.LiveSdkSetting;
import com.ss.pusher.core.transport.RTMPUploadBWProbe;
import com.ss.pusher.core.utils.AVLog;
import com.ss.pusher.core.utils.GsonHolder;
import com.ss.pusher.core.utils.SafeHandlerThread;
import com.ss.pusher.core.utils.TimeUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jUB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282770jUB implements InterfaceC1283000jUY {
    public final C1282820jUG LIZIZ;
    public final LiveSdkSetting LIZJ;
    public final C1282760jUA LIZLLL;

    @Override // X.InterfaceC1283000jUY
    public final C1282850jUJ getBandwidthResult() {
        C1282760jUA c1282760jUA = this.LIZLLL;
        RTMPUploadBWProbe rTMPUploadBWProbe = c1282760jUA.LIZ;
        if (rTMPUploadBWProbe == null) {
            return null;
        }
        C1282850jUJ c1282850jUJGetBandwidthResult = rTMPUploadBWProbe.GetBandwidthResult();
        return new C1282850jUJ(c1282850jUJGetBandwidthResult.LIZ, c1282850jUJGetBandwidthResult.LIZIZ, c1282850jUJGetBandwidthResult.LIZJ, c1282760jUA.LIZIZ(c1282850jUJGetBandwidthResult.LIZLLL));
    }

    @Override // X.InterfaceC1283000jUY
    public final void release() {
        C1282760jUA c1282760jUA = this.LIZLLL;
        c1282760jUA.getClass();
        AVLog.logKibana(4, "LiveCoreUploadBWProbe", "release()", null);
        if (c1282760jUA.LIZ != null) {
            C786410Ut5.LJJZZIII(c1282760jUA.LIZJ, new ARunnableS120S0100000_20(c1282760jUA, 98));
        }
        Object obj = new Object();
        boolean[] zArr = {true};
        synchronized (obj) {
            try {
                C786410Ut5.LJJZZIII(c1282760jUA.LIZJ, new ARunnableS72S0200000_3(obj, zArr, 18));
                try {
                    obj.wait(500L);
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        SafeHandlerThread safeHandlerThread = c1282760jUA.LIZIZ;
        if (safeHandlerThread != null) {
            safeHandlerThread.release();
            c1282760jUA.LIZIZ = null;
        }
        if (c1282760jUA.LJJI != null) {
            c1282760jUA.LJJI = null;
        }
        if (this.LIZJ.switchParams.LJ) {
            AVLog.setupLogKibanaDevice(null);
        }
        AVLog.iow("VeLiveProbeRtmpImp", "release");
    }

    @Override // X.InterfaceC1283000jUY
    public final void stop() {
        AVLog.ioi("VeLiveProbeRtmpImp", "stop probe");
        C1282760jUA c1282760jUA = this.LIZLLL;
        c1282760jUA.getClass();
        AVLog.logKibana(4, "LiveCoreUploadBWProbe", "stopBWTest()", null);
        if (c1282760jUA.LJFF == 1) {
            C786410Ut5.LJJZZIII(c1282760jUA.LIZJ, new ARunnableS120S0100000_20(c1282760jUA, 101));
            return;
        }
        RTMPUploadBWProbe rTMPUploadBWProbe = c1282760jUA.LIZ;
        if (rTMPUploadBWProbe != null) {
            rTMPUploadBWProbe.stopBWTest();
        }
    }

    @Override // X.InterfaceC1283000jUY
    public final void start() {
        SafeHandlerThread.SafeHandler safeHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start probe: ");
        sbLIZ.append(this.LIZIZ.LIZIZ);
        AVLog.ioi("VeLiveProbeRtmpImp", C2188811AlT.LIZIZ(sbLIZ));
        C1282760jUA c1282760jUA = this.LIZLLL;
        String str = this.LIZIZ.LIZIZ;
        c1282760jUA.getClass();
        boolean z = Looper.getMainLooper().getThread() == C786410Ut5.u3();
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(c1282760jUA, 97);
        if (!z || (safeHandler = c1282760jUA.LIZJ) == null) {
            aRunnableS120S0100000_20.run();
        } else {
            C1283060jUe.LIZIZ(safeHandler, aRunnableS120S0100000_20);
        }
        long jCurrentTimeMillis = c1282760jUA.LJJIIJ;
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        c1282760jUA.LJJIIJ = jCurrentTimeMillis;
        c1282760jUA.LJIIIIZZ(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0jUC] */
    public C1282770jUB(C1282820jUG c1282820jUG) {
        LiveSdkSetting liveSdkSetting;
        this.LIZIZ = c1282820jUG;
        try {
            liveSdkSetting = (LiveSdkSetting) GsonHolder.LIZ.LJII(c1282820jUG.LIZJ, LiveSdkSetting.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            liveSdkSetting = new LiveSdkSetting();
        }
        this.LIZJ = liveSdkSetting;
        C1282760jUA c1282760jUA = new C1282760jUA(new InterfaceC1282750jU9() { // from class: X.0jUC
            @Override // X.InterfaceC1282750jU9
            public final void LIZ(int i, int i2, long j, String str) {
                EnumC1282790jUD enumC1282790jUD;
                InterfaceC1282840jUI interfaceC1282840jUI = this.LIZ.LIZIZ.LIZLLL;
                EnumC1282790jUD.Companion.getClass();
                if (i != 1) {
                    if (i != 2) {
                        enumC1282790jUD = EnumC1282790jUD.STOPPED_MANUALLY;
                    } else {
                        enumC1282790jUD = EnumC1282790jUD.FAILED;
                    }
                } else {
                    enumC1282790jUD = EnumC1282790jUD.SUCCESS;
                }
                if (str == null) {
                    str = "{}";
                }
                interfaceC1282840jUI.LIZ(enumC1282790jUD, i2, str);
            }
        }, liveSdkSetting);
        this.LIZLLL = c1282760jUA;
        AVLog.initLogFile(this.LIZIZ.LIZ, 10485760);
        InterfaceC1282830jUH interfaceC1282830jUH = this.LIZIZ.LJ;
        if (interfaceC1282830jUH != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" setDns(), dns: ");
            sbLIZ.append(interfaceC1282830jUH);
            AVLog.logKibana(4, "LiveCoreUploadBWProbe", C2188811AlT.LIZIZ(sbLIZ), null);
            SafeHandlerThread.SafeHandler safeHandler = c1282760jUA.LIZJ;
            if (safeHandler != null) {
                C786410Ut5.LJJZZIII(safeHandler, new ARunnableS89S0200000_20(c1282760jUA, interfaceC1282830jUH, 63));
            }
        }
        AVLog.setupLogKibanaDevice(new InterfaceC1279060jOC() { // from class: X.0jOm
            @Override // X.InterfaceC1279060jOC
            public final int getType() {
                return 1;
            }

            @Override // X.InterfaceC1279060jOC
            public final void LIZ(int i, String str, String str2, Throwable th) throws JSONException {
                LIZIZ(i, str, "live_sdk_log", str2, th);
            }

            @Override // X.InterfaceC1279060jOC
            public final void LIZIZ(int i, String str, String str2, String str3, Throwable th) throws JSONException {
                Object c098200Yq;
                JSONObject jSONObject;
                Object c098200Yq2;
                if (str != null && str3 != null && str2 != null) {
                    long jNativeNanoTime = TimeUtils.nativeNanoTime() / ((long) 1000000);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    boolean zLJFF = Intrinsics.LJFF(str2, "bw_probe");
                    if (zLJFF) {
                        try {
                            c098200Yq = new JSONObject(str3);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c098200Yq = new C098200Yq(th2);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        if (thM5exceptionOrNullimpl != null) {
                            AVLog.iow(str, Log.getStackTraceString(thM5exceptionOrNullimpl));
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = jSONObject2;
                        }
                        jSONObject = (JSONObject) c098200Yq;
                    } else {
                        jSONObject = new JSONObject();
                    }
                    this.LIZ.getClass();
                    jSONObject.put("product_line", "live");
                    jSONObject.put("version", "7.22.0.93900");
                    jSONObject.put("live_sdk_version", "7.22.0.93900");
                    jSONObject.put("report_version", 5);
                    jSONObject.put("mode", "push");
                    jSONObject.put("project_key", "live-stream-sdk");
                    jSONObject.put("timestamp", jCurrentTimeMillis);
                    try {
                        if (zLJFF) {
                            jSONObject.put("clockMs", jNativeNanoTime);
                            jSONObject.put("level", i);
                            jSONObject.put("tag", str);
                        } else {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("clockMs", jNativeNanoTime);
                            jSONObject3.put("level", i);
                            JSONObject jSONObjectPut = jSONObject3.put("tag", str);
                            jSONObjectPut.put("msg", str3);
                            jSONObject.put("message", C786410Ut5.J3(jSONObjectPut));
                        }
                        c098200Yq2 = jSONObject.put("event_key", str2);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        c098200Yq2 = new C098200Yq(th3);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                    if (thM5exceptionOrNullimpl2 != null) {
                        AVLog.iow(str, Log.getStackTraceString(thM5exceptionOrNullimpl2));
                    }
                    this.LIZ.LIZIZ.LIZLLL.LIZIZ(jSONObject);
                }
            }

            @Override // X.InterfaceC1279060jOC
            public final void LIZJ(int i, String str, String str2, String str3, Throwable th) throws JSONException {
                LIZIZ(i, str, str2, str3, th);
            }
        });
    }
}
