package X;

import Y.ARunnableS3S1301000_31;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BiF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212291BiF {
    public static volatile C2212291BiF LIZLLL = null;
    public static volatile boolean LJ = true;
    public volatile boolean LIZ;
    public volatile boolean LIZIZ;
    public volatile int LIZJ;

    public static JSONObject LIZJ() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (C2212231Bi9.LIZIZ() == null) {
                return jSONObject;
            }
            String strLIZLLL = C2212231Bi9.LIZIZ().LIZLLL();
            jSONObject.put("device_id", C2212231Bi9.LIZLLL());
            jSONObject.put("app_version", "2.1.36-rc.6-tt");
            jSONObject.put("channel", strLIZLLL);
            jSONObject.put("update_version_code", C2212231Bi9.LIZ);
            jSONObject.put("package_name", C2212231Bi9.LJIILL.getPackageName());
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public static C2212291BiF LIZLLL() {
        if (LIZLLL == null) {
            synchronized (C2212291BiF.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C2212291BiF();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public final boolean LJFF() {
        return this.LIZ && LJ;
    }

    public final synchronized void LJ(final InterfaceC2212841Bj8 interfaceC2212841Bj8) {
        if (!LJFF()) {
            return;
        }
        if (C2212231Bi9.LIZIZ() != null && C2212231Bi9.LJFF != null) {
            C2212311BiH c2212311BiHLIZIZ = C2212231Bi9.LIZIZ();
            if (c2212311BiHLIZIZ != null) {
                String strLIZLLL = c2212311BiHLIZIZ.LIZLLL();
                String strLIZLLL2 = C2212231Bi9.LIZLLL();
                String strLIZIZ = c2212311BiHLIZIZ.LIZIZ();
                if (!TextUtils.isEmpty(strLIZLLL) && !TextUtils.isEmpty(strLIZLLL2) && !TextUtils.isEmpty(strLIZIZ)) {
                    if (this.LIZIZ) {
                        LIZIZ(interfaceC2212841Bj8, true);
                        return;
                    }
                    if (this.LIZJ <= 5) {
                        C2212671Bir c2212671BirLIZ = C2212671Bir.LIZ();
                        Runnable runnable = new Runnable() { // from class: X.1BiL
                            public final void LIZ() {
                                try {
                                    if (!this.LLILLJJLI.LIZIZ) {
                                        C0VRP c0vrp = C2212231Bi9.LJJJJZ;
                                        this.LLILLJJLI.getClass();
                                        ((C0VRO) c0vrp).LIZ(C2212291BiF.LIZJ());
                                    }
                                    this.LLILLJJLI.LIZIZ = true;
                                    this.LLILLJJLI.LIZJ = 0;
                                    C2212291BiF c2212291BiF = this.LLILLJJLI;
                                    InterfaceC2212841Bj8 interfaceC2212841Bj82 = interfaceC2212841Bj8;
                                    c2212291BiF.getClass();
                                    C2212291BiF.LIZIZ(interfaceC2212841Bj82, true);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    if ((th instanceof ClassNotFoundException) || (th instanceof NoClassDefFoundError)) {
                                        C2212381BiO.LJFF(" no sdk monitor ");
                                        C2212291BiF.LJ = false;
                                    }
                                    this.LLILLJJLI.LIZIZ = false;
                                    C2212291BiF c2212291BiF2 = this.LLILLJJLI;
                                    InterfaceC2212841Bj8 interfaceC2212841Bj83 = interfaceC2212841Bj8;
                                    c2212291BiF2.getClass();
                                    C2212291BiF.LIZIZ(interfaceC2212841Bj83, false);
                                    this.LLILLJJLI.LIZJ++;
                                    th.getMessage();
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("SplashAdMonitor@5afa.initMonitorSdk$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("SplashAdMonitor@5afa.initMonitorSdk$1");
                            }
                        };
                        if (c2212671BirLIZ.LIZ == null) {
                            c2212671BirLIZ.LIZ = C786410Ut5.d4(2);
                        }
                        c2212671BirLIZ.LIZ.submit(runnable);
                        return;
                    }
                    LIZIZ(interfaceC2212841Bj8, false);
                    return;
                }
            }
            this.LIZIZ = false;
            LIZIZ(interfaceC2212841Bj8, false);
            return;
        }
        LIZIZ(interfaceC2212841Bj8, false);
    }

    public static void LIZIZ(InterfaceC2212841Bj8 interfaceC2212841Bj8, boolean z) {
        if (interfaceC2212841Bj8 == null) {
            return;
        }
        if (z) {
            interfaceC2212841Bj8.onSuccess();
        } else {
            interfaceC2212841Bj8.onFail();
        }
    }

    public final void LIZ(String str, Exception exc) {
        if (!LJFF()) {
            return;
        }
        try {
            String message = exc.getMessage();
            if (!TextUtils.isEmpty(message)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, message);
                LJI("service_ad_exception", null, jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJI(final String str, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (!LJFF()) {
            return;
        }
        if (!this.LIZIZ) {
            LJ(new InterfaceC2212841Bj8() { // from class: X.1BiX
                @Override // X.InterfaceC2212841Bj8
                public final void onFail() {
                }

                @Override // X.InterfaceC2212841Bj8
                public final void onSuccess() {
                    String str2 = C2212231Bi9.LIZ;
                    SDKMonitorUtils.getInstance("1385").LJIILIIL(str, 0, jSONObject, jSONObject2);
                    this.LIZLLL.getClass();
                }
            });
        } else {
            String str2 = C2212231Bi9.LIZ;
            SDKMonitorUtils.getInstance("1385").LJIILIIL(str, 0, jSONObject, jSONObject2);
        }
    }

    public final void LJIIIZ(final String str, int i, final JSONObject jSONObject) {
        if (!LJFF()) {
            return;
        }
        if (!this.LIZIZ) {
            LJ(new InterfaceC2212841Bj8() { // from class: X.1BiW
                @Override // X.InterfaceC2212841Bj8
                public final void onFail() {
                }

                @Override // X.InterfaceC2212841Bj8
                public final void onSuccess() {
                    String str2 = C2212231Bi9.LIZ;
                    SDKMonitorUtils.getInstance("1385").LJIILIIL(str, 1, null, jSONObject);
                    this.LIZJ.getClass();
                }
            });
        } else {
            String str2 = C2212231Bi9.LIZ;
            SDKMonitorUtils.getInstance("1385").LJIILIIL(str, i, null, jSONObject);
        }
    }

    public final void LJII(final String str, int i, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (!LJFF()) {
            return;
        }
        if (!this.LIZIZ) {
            LJ(new InterfaceC2212841Bj8() { // from class: X.1BiV
                @Override // X.InterfaceC2212841Bj8
                public final void onFail() {
                }

                @Override // X.InterfaceC2212841Bj8
                public final void onSuccess() {
                    String str2 = C2212231Bi9.LIZ;
                    SDKMonitorUtils.getInstance("1385").LJIILIIL(str, 1, jSONObject, jSONObject2);
                    this.LIZLLL.getClass();
                }
            });
        } else {
            String str2 = C2212231Bi9.LIZ;
            SDKMonitorUtils.getInstance("1385").LJIILIIL(str, i, jSONObject, jSONObject2);
        }
    }

    public final void LJIIIIZZ(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        if (!LJFF()) {
            return;
        }
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, new BPEAHandler(Looper.getMainLooper()), new ARunnableS3S1301000_31(this, str, i, jSONObject, jSONObject2, 0));
    }
}
