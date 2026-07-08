package X;

import Y.ARunnableS82S0200000_13;
import android.os.SystemClock;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VoT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809030VoT implements InterfaceC808820Vo8 {
    public static final C809030VoT LJIIJ = new C809030VoT();
    public C809220Vom LIZIZ;
    public C809230Von LIZJ;
    public volatile C808990VoP LIZLLL;
    public volatile C808900VoG LJ;
    public volatile C808870VoD LJFF;
    public volatile C808680Vnu LJI;
    public volatile InterfaceC808930VoJ LJII;
    public volatile InterfaceC809180Voi LJIIIIZZ;
    public final C809150Vof LIZ = new Object() { // from class: X.0Vof
    };
    public volatile boolean LJIIIZ = false;

    public static InterfaceC808930VoJ LJIIJJI() {
        return LJIIJ.LJII();
    }

    public static InterfaceC808560Vni LJIILJJIL() {
        return LJIIJ.LJIIIZ();
    }

    public static InterfaceC808700Vnw LJIILLIIL() {
        return LJIIJ.LIZIZ.LJIIJJI;
    }

    public static C808870VoD LJIIZILJ() {
        C809030VoT c809030VoT = LJIIJ;
        if (c809030VoT.LJFF == null) {
            synchronized (c809030VoT) {
                try {
                    if (c809030VoT.LJFF == null) {
                        C808900VoG c808900VoGLJIIJ = c809030VoT.LJIIJ();
                        c809030VoT.LJIIIZ();
                        c809030VoT.LJFF = new C808870VoD(c808900VoGLJIIJ, c809030VoT.LIZIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c809030VoT.LJFF;
    }

    public final Map<String, String> LJI() {
        return this.LIZJ.LIZ();
    }

    public final InterfaceC808930VoJ LJII() {
        if (this.LJII == null) {
            synchronized (this) {
                try {
                    if (this.LJII == null) {
                        if (C0V4R.LJII(this.LIZIZ.LIZ)) {
                            final C809220Vom c809220Vom = this.LIZIZ;
                            this.LJII = new InterfaceC808930VoJ(c809220Vom) { // from class: X.0Vp6
                                public final C809220Vom LIZ;

                                @Override // X.InterfaceC808930VoJ
                                public final void LIZLLL() {
                                    if (C809440Vp8.LIZJ.compareAndSet(false, true)) {
                                        if (C809440Vp8.LIZ().hasMessages(2)) {
                                            C809440Vp8.LIZ().removeMessages(2);
                                        }
                                        C809440Vp8.LIZIZ(0, System.currentTimeMillis() - C809440Vp8.LIZLLL);
                                    }
                                }

                                @Override // X.InterfaceC808930VoJ
                                public final void LJFF() {
                                    WeakHandler.IHandler iHandler = C809450Vp9.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("Push Sender Monitor: ");
                                    sbLIZ.append("update sender success");
                                    C2188811AlT.LIZIZ(sbLIZ);
                                    C809450Vp9.LIZIZ(0, "update sender success", null);
                                }

                                @Override // X.InterfaceC808930VoJ
                                public final void LJII() {
                                    WeakHandler.IHandler iHandler = C809450Vp9.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("Push switcher monitor：");
                                    sbLIZ.append("the out-app switcher upload success");
                                    C2188811AlT.LIZIZ(sbLIZ);
                                    C809450Vp9.LIZ(0, "the out-app switcher upload success", null);
                                }

                                @Override // X.InterfaceC808930VoJ
                                public final void init() {
                                    C809220Vom c809220Vom2 = this.LIZ;
                                    if (C0V4R.LJII(C809360Vp0.LIZ)) {
                                        C809440Vp8.LIZLLL = System.currentTimeMillis();
                                        C786410Ut5.LJLJJI(2, c809220Vom2.LJIL, C809440Vp8.LIZ());
                                    }
                                }

                                {
                                    this.LIZ = c809220Vom;
                                    C809410Vp5.LIZ = c809220Vom.LJIIZILJ;
                                }

                                @Override // X.InterfaceC808930VoJ
                                public final void LIZIZ(int i) {
                                    Map<Integer, Boolean> map = C809450Vp9.LIZJ;
                                    synchronized (map) {
                                        try {
                                            if (((Boolean) ((ConcurrentHashMap) map).get(Integer.valueOf(i))) != null) {
                                                return;
                                            }
                                            ((ConcurrentHashMap) map).put(Integer.valueOf(i), Boolean.TRUE);
                                            WeakHandler weakHandler = C809450Vp9.LIZIZ;
                                            C786410Ut5.LJLJLJ(weakHandler, weakHandler.obtainMessage(1001, Integer.valueOf(i)), TimeUnit.MINUTES.toMillis(1L));
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // X.InterfaceC808930VoJ
                                public final void LJ(int i) {
                                    Map<Integer, Boolean> map = C809450Vp9.LIZJ;
                                    synchronized (map) {
                                        try {
                                            Boolean bool = (Boolean) ((ConcurrentHashMap) map).get(Integer.valueOf(i));
                                            if (bool != null && bool.booleanValue()) {
                                                ((ConcurrentHashMap) map).put(Integer.valueOf(i), Boolean.FALSE);
                                                C809450Vp9.LIZIZ.removeMessages(1001, Integer.valueOf(i));
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append(C809470VpB.LJIIIIZZ(C809360Vp0.LIZ).LIZJ(i));
                                                sbLIZ.append(" register success");
                                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("Push Sender Monitor: ");
                                                sbLIZ2.append(i);
                                                sbLIZ2.append(" register success");
                                                C2188811AlT.LIZIZ(sbLIZ2);
                                                JSONObject jSONObject = new JSONObject();
                                                try {
                                                    jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0);
                                                    jSONObject.put("pushType", i);
                                                } catch (JSONException e) {
                                                }
                                                C809410Vp5.LIZIZ("push_monitor_register_result", jSONObject, null, null);
                                                C809760Vpe.LIZ("1004", jSONObject, strLIZIZ, 0);
                                            }
                                        } finally {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                    }
                                }

                                @Override // X.InterfaceC808930VoJ
                                public final void LIZ(int i, String str) {
                                    String str2;
                                    WeakHandler.IHandler iHandler = C809450Vp9.LIZ;
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("log", str);
                                    } catch (JSONException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                    if (i != 301) {
                                        if (i != 302) {
                                            str2 = "Server return empty response";
                                        } else {
                                            str2 = "Server return not success";
                                        }
                                    } else {
                                        str2 = "network error";
                                    }
                                    C809450Vp9.LIZ(i, str2, jSONObject);
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("Push switcher monitor：upload error，reason: ");
                                    sbLIZ.append(str2);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                }

                                @Override // X.InterfaceC808930VoJ
                                public final void LIZJ(int i, String str) {
                                    String str2;
                                    WeakHandler.IHandler iHandler = C809450Vp9.LIZ;
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("log", str);
                                    } catch (JSONException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                    switch (i) {
                                        case 301:
                                            str2 = "network error";
                                            break;
                                        case 302:
                                            str2 = "server return error";
                                            break;
                                        case 303:
                                            str2 = "server return empty allow_push_list";
                                            break;
                                        default:
                                            str2 = "update_sender api return empty";
                                            break;
                                    }
                                    C809450Vp9.LIZIZ(i, str2, jSONObject);
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("Push Sender Monitor: update sender error, reason: ");
                                    sbLIZ.append(str2);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                }

                                @Override // X.InterfaceC808930VoJ
                                public final void LJI(String str, boolean z) {
                                    WeakHandler.IHandler iHandler = C809450Vp9.LIZ;
                                    if (!z) {
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 107);
                                        } catch (JSONException e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                        JSONObject jSONObject2 = new JSONObject();
                                        try {
                                            jSONObject2.put("sender", str);
                                        } catch (JSONException e2) {
                                            TryCatchGuardChecker.doCheck(e2);
                                        }
                                        C809410Vp5.LIZIZ("push_monitor_register_result", jSONObject, null, jSONObject2);
                                        C809760Vpe.LIZ("1004", jSONObject2, "This device does not support the sender/channel delivered by the server", 107);
                                    }
                                }

                                @Override // X.InterfaceC808930VoJ
                                public final void LJIIIIZZ(int i, int i2, String str, String str2) {
                                    Map<Integer, Boolean> map = C809450Vp9.LIZJ;
                                    synchronized (map) {
                                        try {
                                            Boolean bool = (Boolean) ((ConcurrentHashMap) map).get(Integer.valueOf(i));
                                            if (bool != null && bool.booleanValue()) {
                                                ((ConcurrentHashMap) map).put(Integer.valueOf(i), Boolean.FALSE);
                                                C809450Vp9.LIZIZ.removeMessages(1001, Integer.valueOf(i));
                                                JSONObject jSONObject = new JSONObject();
                                                try {
                                                    jSONObject.put("pushType", i);
                                                    jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i2);
                                                    jSONObject.put("3rd_code", str);
                                                } catch (JSONException e) {
                                                    TryCatchGuardChecker.doCheck(e);
                                                }
                                                JSONObject jSONObject2 = new JSONObject();
                                                try {
                                                    jSONObject2.put("msg", str2);
                                                } catch (JSONException e2) {
                                                }
                                                String str3 = C809470VpB.LJIIIIZZ(C809360Vp0.LIZ).LIZJ(i) + " register failed，reason: " + str2;
                                                C809410Vp5.LIZIZ("push_monitor_register_result", jSONObject, null, jSONObject2);
                                                C809760Vpe.LIZ("1004", jSONObject, str3, i2);
                                            }
                                        } finally {
                                            TryCatchGuardChecker.doCheck(e2);
                                        }
                                    }
                                }
                            };
                        } else {
                            this.LJII = new InterfaceC808930VoJ() { // from class: X.0Voe
                                @Override // X.InterfaceC808930VoJ
                                public final void LIZ(int i, String str) {
                                }

                                @Override // X.InterfaceC808930VoJ
                                public final void LIZIZ(int i) {
                                }

                                @Override // X.InterfaceC808930VoJ
                                public final void LIZJ(int i, String str) {
                                }

                                @Override // X.InterfaceC808930VoJ
                                public final void LIZLLL() {
                                }

                                @Override // X.InterfaceC808930VoJ
                                public final void LJ(int i) {
                                }

                                @Override // X.InterfaceC808930VoJ
                                public final void LJFF() {
                                }

                                @Override // X.InterfaceC808930VoJ
                                public final void LJI(String str, boolean z) {
                                }

                                @Override // X.InterfaceC808930VoJ
                                public final void LJII() {
                                }

                                @Override // X.InterfaceC808930VoJ
                                public final void LJIIIIZZ(int i, int i2, String str, String str2) {
                                }

                                @Override // X.InterfaceC808930VoJ
                                public final void init() {
                                }
                            };
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LJII;
    }

    public final InterfaceC809010VoR LJIIIIZZ() {
        if (this.LIZLLL == null) {
            synchronized (this) {
                try {
                    if (this.LIZLLL == null) {
                        this.LIZLLL = new C808990VoP(this);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZLLL;
    }

    public final InterfaceC808560Vni LJIIIZ() {
        if (this.LJI == null) {
            synchronized (this) {
                try {
                    if (this.LJI == null) {
                        this.LJI = new C808680Vnu(this.LIZIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LJI;
    }

    public final C808900VoG LJIIJ() {
        if (this.LJ == null) {
            synchronized (this) {
                try {
                    if (this.LJ == null) {
                        this.LJ = new C808900VoG();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LJ;
    }

    public final void LIZ(String str) {
        if (this.LJIIIIZZ != null) {
            C809120Voc c809120Voc = (C809120Voc) this.LJIIIIZZ;
            c809120Voc.getClass();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("beginForPush() @");
            sbLIZ.append(C786410Ut5.u3().getName());
            sbLIZ.append("; isMainP: ");
            sbLIZ.append(c809120Voc.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            C810890VrT.LIZIZ.LJIIL(str);
        }
    }

    public final void LIZIZ(String str) {
        if (this.LJIIIIZZ != null) {
            C809120Voc c809120Voc = (C809120Voc) this.LJIIIIZZ;
            c809120Voc.getClass();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("coreStepFinished() @");
            sbLIZ.append(C786410Ut5.u3().getName());
            sbLIZ.append("; isMainP: ");
            sbLIZ.append(c809120Voc.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            C810890VrT.LIZIZ.LJIILLIIL(str);
        }
    }

    public final void LIZJ(String str) {
        if (this.LJIIIIZZ != null) {
            C809120Voc c809120Voc = (C809120Voc) this.LJIIIIZZ;
            c809120Voc.getClass();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("doolittleCustomBegin() @");
            sbLIZ.append(C786410Ut5.u3().getName());
            sbLIZ.append("; isMainP: ");
            sbLIZ.append(c809120Voc.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            C810890VrT.LIZIZ.LJFF(str);
        }
    }

    public final void LIZLLL(String str) {
        if (this.LJIIIIZZ != null) {
            C809120Voc c809120Voc = (C809120Voc) this.LJIIIIZZ;
            c809120Voc.getClass();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("doolittleCustomEnd() @");
            sbLIZ.append(C786410Ut5.u3().getName());
            sbLIZ.append("; isMainP: ");
            sbLIZ.append(c809120Voc.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            C810890VrT.LIZIZ.LJIIJJI(str);
        }
    }

    public final void LJ(String str) {
        if (this.LJIIIIZZ != null) {
            C809120Voc c809120Voc = (C809120Voc) this.LJIIIIZZ;
            c809120Voc.getClass();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("endForPush() @");
            sbLIZ.append(C786410Ut5.u3().getName());
            sbLIZ.append("; isMainP: ");
            sbLIZ.append(c809120Voc.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            C810890VrT.LIZIZ.LJI(str);
        }
    }

    public final void LJFF(Runnable runnable) {
        boolean z;
        if (this.LJIIIIZZ != null) {
            C809120Voc c809120Voc = (C809120Voc) this.LJIIIIZZ;
            c809120Voc.getClass();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("forceInitConfig() @");
            sbLIZ.append(C786410Ut5.u3().getName());
            sbLIZ.append("; isMainP: ");
            sbLIZ.append(c809120Voc.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C810890VrT c810890VrT = C810890VrT.LIZIZ;
            c810890VrT.LJFF("initConfiguration_in_setupInitConfigs");
            c810890VrT.LJIIL("initConfiguration_in_setupInitConfigs");
            C809980Vq0.LIZ(c809120Voc.LIZIZ, c809120Voc.LIZ);
            c810890VrT.LJI("initConfiguration_in_setupInitConfigs");
            c810890VrT.LJIIJJI("initConfiguration_in_setupInitConfigs");
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init_time_cost", jCurrentTimeMillis2);
                if (!C1906580ziK.LJI()) {
                    z = true;
                } else {
                    z = false;
                }
                jSONObject.put("is_foreground", z);
                jSONObject.put("duration_from_launch", SystemClock.uptimeMillis() - C202094145s.LJIILL);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C20684815ws.LJIJ("push_force_init_configs", jSONObject);
            runnable.run();
        }
    }

    public static final void LJIIL(int i, String str) {
        ((C808680Vnu) LJIILJJIL()).LJI(i, "", null, str);
    }

    public static final void LJIILIIL(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sender", i);
            jSONObject.put("push_sdk_version", String.valueOf(30204));
            jSONObject.put("push_sdk_version_name", "3.2.4-alpha.56.4-bugfix");
            jSONObject.put("client_time", System.currentTimeMillis());
            if (str != null) {
                jSONObject.put("msg_str", str);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            C808680Vnu c808680Vnu = (C808680Vnu) LJIILJJIL();
            c808680Vnu.getClass();
            try {
                C808680Vnu.LJIIIIZZ(new ARunnableS82S0200000_13(jSONObject, c808680Vnu, 16));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }

    public final void LJIILL(String str, Throwable th) {
        if (this.LJIIIIZZ != null) {
            C809120Voc c809120Voc = (C809120Voc) this.LJIIIIZZ;
            c809120Voc.getClass();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportForPushException() @");
            sbLIZ.append(C786410Ut5.u3().getName());
            sbLIZ.append("; isMainP: ");
            sbLIZ.append(c809120Voc.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            C810890VrT.LIZIZ.LIZIZ(str, th);
        }
    }
}
