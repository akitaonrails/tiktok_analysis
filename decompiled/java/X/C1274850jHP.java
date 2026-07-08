package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS24S1200000_20;
import Y.ARunnableS25S1100000_20;
import Y.ARunnableS53S0300000_20;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.opengl.EGLContext;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.RTCVideoInterface;
import com.ss.bytertc.engine.data.SEICountPerFrame;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.VPassInteractCfg;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jHP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274850jHP implements InterfaceC1269080j86, InterfaceC1274800jHK, InterfaceC1269030j81 {
    public static final AtomicInteger LJJI = new AtomicInteger(0);
    public final C1274250jGR LIZIZ;
    public final Map<String, Integer> LIZJ;
    public C1275030jHh LIZLLL;
    public Runnable LJ;
    public boolean LJFF;
    public final Object LJI = new Object();
    public final C1271090jBL LJII;
    public final ArrayList<InterfaceC1276380jJs> LJIIIIZZ;
    public String LJIIIZ;
    public C1274890jHT LJIIJ;
    public JSONObject LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public final AbstractC1273900jFs LJIILJJIL;
    public final C1271010jBD LJIILL;
    public final JSONObject LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public ARunnableS120S0100000_20 LJIJJ;
    public Context LJIJJLI;
    public final boolean LJIL;
    public volatile boolean LJJ;

    public final synchronized void LJFF() {
        ArrayList<InterfaceC1276380jJs> arrayList = this.LJIIIIZZ;
        if (arrayList != null && arrayList.size() == 0 && C1274690jH9.LIZJ() != null && !C786410Ut5.LJJZZIII(C1274690jH9.LIZJ(), new ARunnableS120S0100000_20(this, 286))) {
            C1274890jHT c1274890jHT = this.LJIIJ;
            if (c1274890jHT != null) {
                c1274890jHT.LJIIIIZZ();
                this.LJIIJ = null;
            }
            this.LJIIJ = null;
        }
    }

    public final synchronized void LJJ() {
        C1274890jHT c1274890jHT;
        ArrayList<InterfaceC1276380jJs> arrayList = this.LJIIIIZZ;
        if (arrayList != null && arrayList.size() == 0 && C1274690jH9.LIZJ() != null && !C786410Ut5.LJJZZIII(C1274690jH9.LIZJ(), new ARunnableS120S0100000_20(this, 285)) && (c1274890jHT = this.LJIIJ) != null) {
            c1274890jHT.LJJII();
        }
    }

    public final void LIZLLL() {
        boolean z;
        C1275030jHh c1275030jHh = this.LIZLLL;
        VPassInteractCfg vPassInteractCfg = this.LIZIZ.LJFF;
        if (c1275030jHh == null || vPassInteractCfg == null) {
            return;
        }
        boolean z2 = false;
        if (c1275030jHh.LJIIL == EnumC1274430jGj.ANCHOR) {
            z = true;
            if (c1275030jHh.LJJIFFI == EnumC1275210jHz.NONE) {
                c1275030jHh.LJJIFFI = EnumC1275210jHz.SERVER_MIX;
            }
        } else {
            z = false;
        }
        if (z && c1275030jHh.LJJIFFI != EnumC1275210jHz.NONE && c1275030jHh.LJJII) {
            JSONObject jSONObject = vPassInteractCfg.LIZ;
            this.LJIIJJI = jSONObject;
            if (jSONObject != null) {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("mixOnClient Params:");
                    sbLIZ.append(C786410Ut5.J3(this.LJIIJJI));
                    AVLog.logKibana(5, "InteractEngineImpl", C2188811AlT.LIZIZ(sbLIZ), null);
                    int iCurrentTimeMillis = (int) (System.currentTimeMillis() % 100);
                    try {
                        JSONObject jSONObject2 = this.LJIIJJI;
                        if (jSONObject2 != null && !jSONObject2.isNull("byte")) {
                            if (JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(this.LJIIJJI, "byte"), this.LIZLLL.LJIILL.toString()) > iCurrentTimeMillis) {
                                z2 = true;
                            }
                        }
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C1275030jHh c1275030jHh2 = this.LIZLLL;
                    if (c1275030jHh2.LJJIFFI != EnumC1275210jHz.NONE) {
                        if (z2) {
                            c1275030jHh2.LJJIFFI = EnumC1275210jHz.CLIENT_MIX;
                        } else {
                            c1275030jHh2.LJJIFFI = EnumC1275210jHz.SERVER_MIX;
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            try {
                int i = JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(new JSONObject(this.LIZLLL.LIZLLL), "live_rtc_video_param"), "rtc_mix_type");
                if (i >= 0 && i <= 3 && (i == 0 || i == 1)) {
                    this.LIZLLL.LJJIFFI = i == 1 ? EnumC1275210jHz.CLIENT_MIX : EnumC1275210jHz.SERVER_MIX;
                }
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("parseRTCExtInfo happen exception");
                sbLIZ2.append(e3.getStackTrace().toString());
                LogUtil.w("RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        c1275030jHh.LJJ = 5;
        c1275030jHh.LJIJ = true;
        c1275030jHh.LJJIZ = true;
        c1275030jHh.LJJIJ = c1275030jHh.LJJIJ;
        C1269340j8W c1269340j8WLLD = this.LIZIZ.LIZ().LLD();
        if (z) {
            LJJIIJ();
        } else {
            EnumC1275210jHz enumC1275210jHz = c1275030jHh.LJJIFFI;
            EnumC1275210jHz enumC1275210jHz2 = EnumC1275210jHz.NONE;
            if (enumC1275210jHz != enumC1275210jHz2) {
                AVLog.iow("InteractEngineImpl", "Guest doesn't need mix stream!");
                c1275030jHh.LJJIFFI = enumC1275210jHz2;
            }
        }
        this.LIZIZ.LIZJ = c1275030jHh.LJJIFFI;
        c1269340j8WLLD.getClass();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("AdmType: ");
        sbLIZ3.append(1);
        AVLog.w("InteractEngineImpl", C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("AdmType: ");
        sbLIZ4.append(1);
        AVLog.iow("InteractEngineImpl", C2188811AlT.LIZIZ(sbLIZ4));
        c1275030jHh.LIZJ = GLThreadManager.getEGLContext();
        if (c1275030jHh.LIZ == null) {
            c1275030jHh.LIZ = C1274690jH9.LIZJ();
        }
    }

    public final String LJIIJ() {
        C1274890jHT c1274890jHT = this.LJIIJ;
        return c1274890jHT != null ? c1274890jHT.LJ.LIZLLL : "";
    }

    public final boolean LJIIJJI() {
        AbstractC1273900jFs abstractC1273900jFs = this.LJIILJJIL;
        return abstractC1273900jFs != null && abstractC1273900jFs.LLD().LJLJI.LIZIZ;
    }

    public final void LJIIZILJ() {
        C1274890jHT c1274890jHT = this.LJIIJ;
        if (c1274890jHT != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("confirmDestroy() isEnableAnchorNet():");
            sbLIZ.append(c1274890jHT.LJIILLIIL());
            sbLIZ.append(";isAnchorNetExperimentalGroup()=");
            C1269160j8E c1269160j8E = c1274890jHT.LJIJI;
            sbLIZ.append(c1269160j8E != null && c1269160j8E.LJJJ());
            AVLog.logKibana(4, "RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ), null);
            C1269160j8E c1269160j8E2 = c1274890jHT.LJIJI;
            if (c1269160j8E2 != null && c1269160j8E2.LJJJ()) {
                c1274890jHT.LJ.LIZ();
                c1274890jHT.LJIJJLI();
                ScheduledExecutorService scheduledExecutorService = c1274890jHT.LJFF;
                if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
                    c1274890jHT.LJFF.execute(new ARunnableS113S0100000_13(c1274890jHT, 248));
                }
                ScheduledExecutorService scheduledExecutorService2 = c1274890jHT.LJFF;
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdown();
                }
                C1275010jHf c1275010jHf = c1274890jHT.LJIILIIL;
                if (c1275010jHf != null) {
                    c1275010jHf.LIZ();
                }
            }
            this.LJIIJ = null;
        }
    }

    public final void LJIJ() {
        C1275030jHh c1275030jHh = this.LIZLLL;
        if (c1275030jHh != null) {
            c1275030jHh.LJJIJIL = null;
        }
        ArrayList<InterfaceC1276380jJs> arrayList = this.LJIIIIZZ;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        synchronized (this.LJIIIIZZ) {
            try {
                for (InterfaceC1276380jJs interfaceC1276380jJs : this.LJIIIIZZ) {
                    if (interfaceC1276380jJs instanceof C1274810jHL) {
                        C1274810jHL c1274810jHL = (C1274810jHL) interfaceC1276380jJs;
                        c1274810jHL.getClass();
                        C1274690jH9.LJFF(new ARunnableS120S0100000_20(c1274810jHL, 292));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIL() {
        synchronized (this.LJIIIIZZ) {
            try {
                ArrayList<InterfaceC1276380jJs> arrayList = this.LJIIIIZZ;
                if (arrayList != null && arrayList.size() > 0) {
                    for (InterfaceC1276380jJs interfaceC1276380jJs : this.LJIIIIZZ) {
                        if (interfaceC1276380jJs != null) {
                            interfaceC1276380jJs.stop();
                        }
                    }
                    this.LJIIIIZZ.clear();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (C1274690jH9.LIZJ() == null || C786410Ut5.LJJZZIII(C1274690jH9.LIZJ(), new ARunnableS120S0100000_20(this, 284))) {
            return;
        }
        C1274890jHT c1274890jHT = this.LJIIJ;
        if (c1274890jHT != null) {
            c1274890jHT.LJIIIIZZ();
            this.LJIIJ = null;
        }
        this.LJIIJ = null;
    }

    public final void LJJI() {
        synchronized (this.LJI) {
            try {
                Runnable runnable = this.LJ;
                if (runnable != null) {
                    runnable.run();
                }
                this.LJ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJIFFI() {
        AbstractC1273900jFs abstractC1273900jFsLIZ = this.LIZIZ.LIZ();
        if (abstractC1273900jFsLIZ == null || abstractC1273900jFsLIZ.LJIIIZ() == 7) {
            return;
        }
        String strLJIIJ = LJIIJ();
        if (abstractC1273900jFsLIZ.LLD() != null) {
            abstractC1273900jFsLIZ.LLLLL(strLJIIJ, false);
        }
        if (LJIIJJI()) {
            abstractC1273900jFsLIZ.LLLI(1);
        }
        AudioDeviceModule audioDeviceModuleLJLLI = abstractC1273900jFsLIZ.LJLLI();
        if (audioDeviceModuleLJLLI != null) {
            audioDeviceModuleLJLLI.enableAudioPushStream(false);
        }
    }

    public final void LJJII() {
        C1274810jHL c1274810jHL;
        C1269340j8W c1269340j8WLLD;
        AbstractC1273900jFs abstractC1273900jFs = this.LJIILJJIL;
        boolean z = false;
        if (abstractC1273900jFs != null) {
            if (abstractC1273900jFs.LLJILJIL()) {
                z = true;
            } else if (((this.LJIILJJIL.LJII() != null && this.LJIILJJIL.LJII().LL) || this.LJIJI) && (c1269340j8WLLD = this.LJIILJJIL.LLD()) != null) {
                z = c1269340j8WLLD.LJJI;
            }
        }
        if (z != this.LJIIZILJ) {
            C1274890jHT c1274890jHT = this.LJIIJ;
            if (c1274890jHT != null && (c1274810jHL = c1274890jHT.LJIJ) != null) {
                c1274810jHL.LJJJJIZL = z;
                c1274810jHL.LLFF();
            }
            this.LJIIZILJ = z;
            if (C1267520j5a.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("mSendSeiWithRTCMessage:");
                sbLIZ.append(this.LJIIZILJ);
                AVLog.logKibana(4, "InteractEngineImpl", C2188811AlT.LIZIZ(sbLIZ), null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0084 A[PHI: r0
      0x0084: PHI (r0v45 int) = (r0v44 int), (r0v46 int) binds: [B:19:0x007e, B:21:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ() {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1274850jHP.LJJIIJ():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1274850jHP(X.AbstractC1273900jFs r9) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1274850jHP.<init>(X.0jFs):void");
    }

    public static String LJIIIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.contains("http://")) {
                return str.replace("http", "wss");
            }
            if (!str.contains("https://")) {
                return str;
            }
            return str.replace("https", "wss");
        }
        return str;
    }

    public static ArrayList LJIIL(String str) {
        File[] fileArrListFiles;
        C0VSJ c0vsj = new C0VSJ(str);
        ArrayList arrayList = new ArrayList();
        if (c0vsj.isDirectory() && (fileArrListFiles = c0vsj.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    arrayList.add(file.getPath());
                } else if (file.isDirectory()) {
                    arrayList.addAll(LJIIL(file.getPath()));
                }
            }
        }
        return arrayList;
    }

    public static void LJIJJ(AbstractC1273900jFs abstractC1273900jFs) {
        if (abstractC1273900jFs.LLD() != null) {
            abstractC1273900jFs.LLLLIL(abstractC1273900jFs.LLIILII(), true, true);
        }
    }

    public final void LIZIZ(C1275510jIT c1275510jIT) throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (c1275510jIT.LJI == EnumC1275480jIQ.DispatchNetVersion_V2) {
            str = "rtc_url_dispatcher_V2";
        } else {
            str = "rtc_url_dispatcher_V1";
        }
        jSONObject.put("event_key", str);
        jSONObject.put("value", "rtc");
        jSONObject.put("dispatch_state", c1275510jIT.LJFF.getValue());
        jSONObject2.put("finalUrl", c1275510jIT.LIZ);
        jSONObject2.put("originUrl", c1275510jIT.LIZIZ);
        jSONObject2.put("userRegion", c1275510jIT.LIZJ);
        jSONObject2.put("ePoc", c1275510jIT.LIZLLL);
        jSONObject2.put("eTag", c1275510jIT.LJ);
        jSONObject2.put("dispatchState", c1275510jIT.LJFF.getValue());
        jSONObject.put("message", C786410Ut5.J3(jSONObject2));
        LJIILJJIL("live_client_monitor_log", jSONObject);
    }

    public final C1274030jG5 LJI(C1275030jHh c1275030jHh) {
        if (!this.LJJ) {
            C1274030jG5 c1274030jG5 = new C1274030jG5();
            c1274030jG5.LIZIZ = 8402;
            return c1274030jG5;
        }
        AVLog.logApiCall("RTCInteractAPI", "create", null);
        C1274030jG5[] c1274030jG5Arr = new C1274030jG5[1];
        try {
            LJIIIIZZ(c1275030jHh);
            this.LIZLLL = c1275030jHh;
            LIZLLL();
            AVLog.logApiCall("RTCInteractAPI", "check config done", null);
            Handler handlerLIZJ = C1274690jH9.LIZJ();
            if (handlerLIZJ != null) {
                C1283100jUi.LIZIZ(handlerLIZJ, new ARunnableS53S0300000_20(c1274030jG5Arr, c1275030jHh, this, 56));
            }
            if (this.LIZIZ.LIZ().LLD().LJLJI.LJJIFFI) {
                if (c1274030jG5Arr[0].LIZIZ == 0) {
                    C1269520j8o.LIZ("create");
                } else {
                    synchronized (C1269520j8o.class) {
                        if (((C1269530j8p) ((ConcurrentHashMap) C1269520j8o.LJ).get("create")) != null) {
                            throw null;
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorCode", c1274030jG5Arr[0].LIZIZ);
                jSONObject.put("client", c1274030jG5Arr[0].LIZ);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            AVLog.logApiCall("RTCInteractAPI", "create result", jSONObject);
            return c1274030jG5Arr[0];
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("check config exception:");
            sbLIZ.append(Log.getStackTraceString(e2));
            AVLog.logApiCall("RTCInteractAPI", C2188811AlT.LIZIZ(sbLIZ), null);
            return c1274030jG5Arr[0];
        }
    }

    public final C1274030jG5 LJII(C1275030jHh c1275030jHh) {
        InterfaceC1276380jJs c1274810jHL;
        C1269340j8W c1269340j8WLLD;
        C1274890jHT c1274890jHT;
        C1269340j8W c1269340j8WLLD2;
        String str;
        C1274030jG5 c1274030jG5 = new C1274030jG5();
        boolean z = false;
        c1274030jG5.LIZIZ = 0;
        if (c1275030jHh == null) {
            AVLog.ioe("InteractEngineImpl", "create client interact config is null");
            LJIILLIIL("interact config is null");
            c1274030jG5.LIZIZ = 8403;
            return c1274030jG5;
        }
        List<String> list = c1275030jHh.LJJIJL;
        AbstractC1273900jFs abstractC1273900jFs = this.LJIILJJIL;
        if (abstractC1273900jFs != null && abstractC1273900jFs.LLJILJIL() && this.LIZIZ.LJFF.LIZIZ()) {
            z = true;
        }
        this.LJIJ = z;
        if (z) {
            AVLog.iod("InteractEngineImpl", "createClient with native interact implementation");
            AbstractC1273900jFs abstractC1273900jFs2 = this.LJIILJJIL;
            c1274810jHL = new C1274840jHO(abstractC1273900jFs2, c1275030jHh, abstractC1273900jFs2.LLD(), this);
        } else {
            C1269340j8W c1269340j8WLLD3 = null;
            if (this.LJIIJ == null) {
                int iLJIJI = LJIJI(c1275030jHh);
                c1274030jG5.LIZIZ = iLJIJI;
                if (iLJIJI != 0) {
                    LJIILLIIL("set rtc parameters failed");
                    return c1274030jG5;
                }
                Context context = c1275030jHh.LIZIZ;
                this.LJIJJLI = context;
                String str2 = c1275030jHh.LIZLLL;
                EGLContext eGLContext = c1275030jHh.LIZJ;
                JSONObject jSONObject = this.LJIILLIIL;
                AbstractC1273900jFs abstractC1273900jFs3 = this.LJIILJJIL;
                if (abstractC1273900jFs3 != null) {
                    c1269340j8WLLD2 = abstractC1273900jFs3.LLD();
                } else {
                    c1269340j8WLLD2 = null;
                }
                C1274890jHT c1274890jHT2 = new C1274890jHT(context, str2, eGLContext, jSONObject, c1269340j8WLLD2, this.LJIILJJIL, list, c1275030jHh);
                this.LJIIJ = c1274890jHT2;
                if (c1274890jHT2.LJIILL == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("create rtc engine failed, rtcExtInfo:");
                    sbLIZ.append(c1275030jHh.LIZLLL);
                    sbLIZ.append(" context:");
                    sbLIZ.append(c1275030jHh.LIZIZ);
                    sbLIZ.append(" rtcEngineParameters:");
                    sbLIZ.append(this.LJIILLIIL);
                    LJIILLIIL(C2188811AlT.LIZIZ(sbLIZ));
                    c1274030jG5.LIZIZ = 8402;
                    return c1274030jG5;
                }
                this.LJIIL = c1274890jHT2.LJIIIZ();
            }
            C1271090jBL c1271090jBL = this.LJII;
            if (c1271090jBL != null && (c1274890jHT = this.LJIIJ) != null) {
                C1271110jBN c1271110jBN = c1271090jBL.LLILLJJLI;
                RTCVideoInterface rTCVideoInterface = c1274890jHT.LJIILL;
                c1271110jBN.getClass();
                if (rTCVideoInterface instanceof RTCVideoInterface) {
                    c1271110jBN.LLILLJJLI = rTCVideoInterface;
                } else {
                    AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("TYPEERROR");
                    C1274080jGA.LIZ.LIZ("SurfacePublisherMgr.setRtcEngine", androidRuntimeException);
                    if (C1274040jG6.LIZ()) {
                        throw androidRuntimeException;
                    }
                }
            }
            if (this.LJIIJ != null && !this.LJIIL.equalsIgnoreCase(C1274890jHT.LJIIJ(c1275030jHh.LIZLLL))) {
                this.LJIIJ.LJIIIIZZ();
                int iLJIJI2 = LJIJI(c1275030jHh);
                c1274030jG5.LIZIZ = iLJIJI2;
                if (iLJIJI2 != 0) {
                    LJIILLIIL("set rtc parameters failed");
                    return c1274030jG5;
                }
                Context context2 = c1275030jHh.LIZIZ;
                String str3 = c1275030jHh.LIZLLL;
                JSONObject jSONObject2 = this.LJIILLIIL;
                AbstractC1273900jFs abstractC1273900jFs4 = this.LJIILJJIL;
                if (abstractC1273900jFs4 != null) {
                    c1269340j8WLLD = abstractC1273900jFs4.LLD();
                } else {
                    c1269340j8WLLD = null;
                }
                C1274890jHT c1274890jHT3 = new C1274890jHT(context2, str3, null, jSONObject2, c1269340j8WLLD, this.LJIILJJIL, list, c1275030jHh);
                this.LJIIJ = c1274890jHT3;
                if (c1274890jHT3.LJIILL == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("create rtc engine failed, rtcExtInfo:");
                    sbLIZ2.append(c1275030jHh.LIZLLL);
                    sbLIZ2.append(" context:");
                    sbLIZ2.append(c1275030jHh.LIZIZ);
                    sbLIZ2.append(" rtcEngineParameters:");
                    sbLIZ2.append(this.LJIILLIIL);
                    LJIILLIIL(C2188811AlT.LIZIZ(sbLIZ2));
                    c1274030jG5.LIZIZ = 8402;
                    return c1274030jG5;
                }
                this.LJIIL = c1274890jHT3.LJIIIZ();
            }
            C1274890jHT c1274890jHT4 = this.LJIIJ;
            AbstractC1273900jFs abstractC1273900jFs5 = this.LJIILJJIL;
            if (abstractC1273900jFs5 != null) {
                c1269340j8WLLD3 = abstractC1273900jFs5.LLD();
            }
            C1271090jBL c1271090jBL2 = this.LJII;
            c1274810jHL = new C1274810jHL(c1274890jHT4, c1275030jHh, c1269340j8WLLD3, c1271090jBL2.LLILZ, c1271090jBL2.LLILLL, c1271090jBL2, this);
        }
        C1274890jHT c1274890jHT5 = this.LJIIJ;
        if (c1274890jHT5 != null && c1274890jHT5.LJIIL() != null) {
            this.LJIILIIL = this.LJIIJ.LJIIL().LJFF;
            this.LJII.getClass();
        }
        AbstractC1273900jFs abstractC1273900jFs6 = this.LJIILJJIL;
        if (abstractC1273900jFs6 != null) {
            abstractC1273900jFs6.LLJL(this);
            this.LJIILJJIL.LLJJLIIIJLLLLLLLZ();
            InterfaceC1268640j7O interfaceC1268640j7OLJIIL = this.LJIILJJIL.LJIIL();
            if (interfaceC1268640j7OLJIIL != null && (str = this.LJIILIIL) != null) {
                interfaceC1268640j7OLJIIL.setContourInfoIndex(str);
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Create Interact Client ");
        sbLIZ3.append(c1274810jHL);
        sbLIZ3.append(" with mix type ");
        sbLIZ3.append(c1275030jHh.LJJIFFI);
        AVLog.iod("InteractEngineImpl", C2188811AlT.LIZIZ(sbLIZ3));
        c1274030jG5.LIZ = c1274810jHL;
        return c1274030jG5;
    }

    public final void LJIIIIZZ(C1275030jHh c1275030jHh) {
        String str = c1275030jHh.LJJJI;
        if (str != null) {
            try {
                JSONObject jSONObject = this.LJIILLIIL;
                if (jSONObject != null) {
                    jSONObject.put("rtc.ab_label", str);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (c1275030jHh.LJIJI) {
            c1275030jHh.LJIJI = false;
        }
        this.LJIILJJIL.LJJLIIIJL(c1275030jHh.LIZJ());
        if (this.LIZIZ.LJFF == null) {
            AVLog.logApiCall("RTCInteractAPI", "dealInteractConfig getVPassInteractCfg null", null);
        }
    }

    public final int LJIILL(String str) {
        synchronized (this.LIZJ) {
            try {
                for (Map.Entry<String, Integer> entry : this.LIZJ.entrySet()) {
                    if (entry.getKey().equals(str)) {
                        return entry.getValue().intValue();
                    }
                }
                int iIncrementAndGet = LJJI.incrementAndGet();
                this.LIZJ.put(str, Integer.valueOf(iIncrementAndGet));
                return iIncrementAndGet;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIILLIIL(String str) {
        Handler handlerLIZIZ = C1274690jH9.LIZIZ();
        if (handlerLIZIZ != null) {
            C786410Ut5.LJJZZIII(handlerLIZIZ, new ARunnableS25S1100000_20(this, str, 24));
        }
    }

    public final int LJIJI(C1275030jHh c1275030jHh) {
        try {
            JSONObject jSONObject = this.LJIILLIIL;
            if (jSONObject == null) {
                return 8401;
            }
            jSONObject.put("rtc.aid", c1275030jHh.LJIIIIZZ);
            jSONObject.put("rtc.device_id", c1275030jHh.LJI);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("app_version", c1275030jHh.LJIIIZ);
            jSONObject2.put("app_min_version", c1275030jHh.LJIIJ);
            jSONObject2.put("app_channel", c1275030jHh.LJII);
            jSONObject.put("rtc.common_extra_info", C786410Ut5.J3(jSONObject2));
            jSONObject.put("rtc.transcoding_data_send_interval", 5);
            LIZ(c1275030jHh, jSONObject);
            InterfaceC1275660jIi interfaceC1275660jIi = c1275030jHh.LJJJ;
            if (interfaceC1275660jIi != null) {
                String strLIZ = interfaceC1275660jIi.LIZ();
                if (!TextUtils.isEmpty(strLIZ)) {
                    jSONObject.put("rtc.user_region", strLIZ);
                    return 0;
                }
                return 0;
            }
            return 0;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public final void LJIJJLI(C1274810jHL c1274810jHL) {
        C1274890jHT c1274890jHT;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Stop clientFactory at client: ");
        sbLIZ.append(c1274810jHL);
        AVLog.iod("InteractEngineImpl", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.LJI) {
            try {
                this.LJ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        AbstractC1273900jFs abstractC1273900jFsLIZ = this.LIZIZ.LIZ();
        if (abstractC1273900jFsLIZ != null) {
            AVLog.iod("InteractEngineImpl", "livecore switch audio mode to MODE_MIC");
            abstractC1273900jFsLIZ.LJJIJIL(1);
            AudioDeviceModule audioDeviceModuleLJLLI = abstractC1273900jFsLIZ.LJLLI();
            if (audioDeviceModuleLJLLI != null) {
                C1274890jHT c1274890jHT2 = this.LJIIJ;
                if (c1274890jHT2 != null && !c1274890jHT2.LJJIIZ()) {
                    audioDeviceModuleLJLLI.setAudioLiveScene(0);
                }
                audioDeviceModuleLJLLI.enableAudioPushStream(true);
            }
            if (this.LIZIZ.LIZJ == EnumC1275210jHz.SERVER_MIX && (c1274890jHT = this.LJIIJ) != null) {
                if (!c1274890jHT.LJIILLIIL() || this.LJIIJ.LJJIIZ()) {
                    List<String> listLLIILII = abstractC1273900jFsLIZ.LLIILII();
                    if (listLLIILII != null && !listLLIILII.isEmpty()) {
                        AbstractC1273900jFs abstractC1273900jFs = this.LJIILJJIL;
                        if (abstractC1273900jFs != null) {
                            abstractC1273900jFs.LLJJIJIIJIL(6, LJIIJ());
                        }
                        abstractC1273900jFsLIZ.LLLJIL();
                        LJIJJ(abstractC1273900jFsLIZ);
                    }
                    if (LJIIJJI()) {
                        abstractC1273900jFsLIZ.LLLI(0);
                    }
                }
            }
        }
    }

    public final void LJJIII(int i) {
        ArrayList<InterfaceC1276380jJs> arrayList = this.LJIIIIZZ;
        if (arrayList != null && !arrayList.isEmpty()) {
            synchronized (this.LJIIIIZZ) {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("fps", i);
                        JSONObject jSONObjectPut = new JSONObject().put("PushBase", jSONObject);
                        for (InterfaceC1276380jJs interfaceC1276380jJs : this.LJIIIIZZ) {
                            if (interfaceC1276380jJs instanceof C1274810jHL) {
                                interfaceC1276380jJs.LJIIZILJ(C786410Ut5.J3(jSONObjectPut));
                            }
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    public final void LIZ(C1275030jHh c1275030jHh, JSONObject jSONObject) throws JSONException {
        boolean z;
        InterfaceC1275660jIi interfaceC1275660jIi = c1275030jHh.LJJJ;
        if (interfaceC1275660jIi != null) {
            String str = "https://rtc-sg.tiktokv.com/";
            C1275510jIT c1275510jITLIZIZ = interfaceC1275660jIi.LIZIZ("https://rtc-sg.tiktokv.com/");
            String str2 = "https://rtcpc-access-sg.tiktokv.com/";
            C1275510jIT c1275510jITLIZIZ2 = interfaceC1275660jIi.LIZIZ("https://rtcpc-access-sg.tiktokv.com/");
            String str3 = "https://rtc-access-sg.tiktokv.com/";
            C1275510jIT c1275510jITLIZIZ3 = interfaceC1275660jIi.LIZIZ("https://rtc-access-sg.tiktokv.com/");
            C1275510jIT c1275510jITLIZIZ4 = interfaceC1275660jIi.LIZIZ("https://rtc-logger-va.tiktokv.com/");
            LIZIZ(c1275510jITLIZIZ);
            LIZIZ(c1275510jITLIZIZ2);
            LIZIZ(c1275510jITLIZIZ3);
            LIZIZ(c1275510jITLIZIZ4);
            EnumC1276340jJo enumC1276340jJo = c1275510jITLIZIZ.LJFF;
            EnumC1276340jJo enumC1276340jJo2 = EnumC1276340jJo.DISPATCH_SUCCESS;
            if (enumC1276340jJo == enumC1276340jJo2 && c1275510jITLIZIZ2.LJFF == enumC1276340jJo2 && c1275510jITLIZIZ3.LJFF == enumC1276340jJo2 && c1275510jITLIZIZ4.LJFF == enumC1276340jJo2 && c1275510jITLIZIZ.LIZ != null && c1275510jITLIZIZ2.LIZ != null && c1275510jITLIZIZ3.LIZ != null && c1275510jITLIZIZ4.LIZ != null) {
                z = true;
            } else {
                z = false;
            }
            String str4 = c1275510jITLIZIZ.LIZ;
            String str5 = c1275510jITLIZIZ2.LIZ;
            String str6 = c1275510jITLIZIZ3.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LJIIIZ(c1275510jITLIZIZ4.LIZ));
            sbLIZ.append("report");
            Object objLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String strLIZ = interfaceC1275660jIi.LIZ();
            if (!z) {
                if (strLIZ != null && strLIZ.toLowerCase(Locale.ENGLISH).equals("us")) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(LJIIIZ("https://rtc-logger.tiktokv.us/"));
                    sbLIZ2.append("report");
                    objLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    str = "https://rtc.tiktokv.us/";
                    str2 = "https://rtcpc-access.tiktokv.us/";
                    str3 = "https://rtc-access16-normal-useast5.tiktokv.us/";
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(LJIIIZ("https://rtc-logger-va.tiktokv.com/"));
                    sbLIZ3.append("report");
                    objLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                }
            } else {
                str = str4;
                str2 = str5;
                str3 = str6;
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONObject.put("config_hosts", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(str2);
            jSONArray2.put(str3);
            jSONObject.put("access_hosts", jSONArray2);
            jSONObject.put("rtc.log_sdk_websocket_url", objLIZIZ);
        }
    }

    public final void LJIILJJIL(String str, JSONObject jSONObject) {
        Handler handlerLIZIZ = C1274690jH9.LIZIZ();
        try {
            if (!this.LJIL) {
                jSONObject = new JSONObject(C786410Ut5.J3(jSONObject));
            }
            if (handlerLIZIZ != null) {
                C786410Ut5.LJJZZIII(handlerLIZIZ, new ARunnableS24S1200000_20(this, str, jSONObject, 13));
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.logToIODeviceInternal(6, "InteractEngineImpl", "log report function error", e);
        }
    }

    public final void LJJIIJZLJL(Object obj, String str) {
        int size;
        ByteBuffer byteBufferSlice;
        RTCVideoInterface rTCVideoInterface;
        LJJII();
        C1274890jHT c1274890jHT = this.LJIIJ;
        if (this.LJIJ) {
            ArrayList<InterfaceC1276380jJs> arrayList = this.LJIIIIZZ;
            if (arrayList != null && !arrayList.isEmpty()) {
                ((InterfaceC1276380jJs) ListProtector.get(this.LJIIIIZZ, 0)).LJJJJI(obj, str);
                return;
            }
            return;
        }
        if (this.LJIIZILJ && c1274890jHT != null) {
            if (obj == null || obj.toString() == null || obj.toString().isEmpty()) {
                return;
            }
            if (!(obj instanceof ByteBuffer)) {
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(str, obj);
                    } catch (JSONException e) {
                    }
                    obj = C786410Ut5.J3(jSONObject);
                } else {
                    obj = obj.toString();
                }
            }
            if (obj instanceof ByteBuffer) {
                byteBufferSlice = (ByteBuffer) obj;
            } else {
                if (!(obj instanceof String) || obj == null) {
                    return;
                }
                String str2 = (String) obj;
                int length = str2.length();
                ByteBuffer byteBuffer = c1274890jHT.LJIIZILJ;
                if (byteBuffer == null || byteBuffer.capacity() < length + 64) {
                    c1274890jHT.LJIIZILJ = ByteBuffer.allocateDirect(length + 64);
                    if (length > 1024) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("sei length ");
                        sbLIZ.append(length);
                        sbLIZ.append(" is too large.");
                        AVLog.iow("RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                int i = 3;
                while (true) {
                    int i2 = i - 1;
                    if (i <= 0) {
                        return;
                    }
                    int iNativeBuildBufferFromString = EffectWrapper.nativeBuildBufferFromString(0, str2, c1274890jHT.LJIIZILJ);
                    if (iNativeBuildBufferFromString != 0) {
                        if (iNativeBuildBufferFromString <= 0) {
                            return;
                        }
                        c1274890jHT.LJIIZILJ.position(0);
                        c1274890jHT.LJIIZILJ.limit(iNativeBuildBufferFromString);
                        byteBufferSlice = c1274890jHT.LJIIZILJ.slice();
                    } else {
                        c1274890jHT.LJIIZILJ = ByteBuffer.allocateDirect(c1274890jHT.LJIIZILJ.capacity() * 2);
                        i = i2;
                    }
                }
            }
            if (byteBufferSlice == null || !byteBufferSlice.hasRemaining()) {
                return;
            }
            byte[] bArr = new byte[byteBufferSlice.remaining()];
            byteBufferSlice.get(bArr);
            if (bArr.length <= 0 || (rTCVideoInterface = c1274890jHT.LJIILL) == null) {
                return;
            }
            rTCVideoInterface.sendSEIMessage(StreamIndex.STREAM_INDEX_MAIN, bArr, 0, SEICountPerFrame.SEI_COUNT_PER_FRAME_SINGLE);
            return;
        }
        C1272750jE1 c1272750jE1 = this.LJII.LLILZ;
        if (c1272750jE1 == null) {
            return;
        }
        AbstractC1273900jFs abstractC1273900jFs = this.LJIILJJIL;
        if (abstractC1273900jFs != null && abstractC1273900jFs.LLJJ()) {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(str, obj);
                    c1272750jE1.LJ(C786410Ut5.J3(jSONObject2));
                    return;
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    AVLog.ioe("InteractVideoClientFactory", "Saving sei failed. ", e2);
                    C1274070jG9 c1274070jG9 = C1274080jGA.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("InteractVideoClientFactory");
                    sbLIZ2.append(".needSaveSei");
                    c1274070jG9.LIZ(C2188811AlT.LIZIZ(sbLIZ2), e2);
                    if (!C1274040jG6.LIZ()) {
                        return;
                    } else {
                        throw new AndroidRuntimeException(e2);
                    }
                }
            }
            if (!(obj instanceof ByteBuffer) || !C1272780jE4.LIZ((ByteBuffer) obj)) {
                return;
            }
            c1272750jE1.LJ(obj);
            return;
        }
        synchronized (c1272750jE1.LL) {
            try {
                size = c1272750jE1.LL.size();
            } finally {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (size > 0 && (obj instanceof JSONObject)) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put(str, obj);
                c1272750jE1.LJ(C786410Ut5.J3(jSONObject3));
                return;
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
                AVLog.ioe("InteractVideoClientFactory", "Saving sei failed. ", e3);
                C1274070jG9 c1274070jG92 = C1274080jGA.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("InteractVideoClientFactory");
                sbLIZ3.append(".needSaveSei");
                c1274070jG92.LIZ(C2188811AlT.LIZIZ(sbLIZ3), e3);
                if (!C1274040jG6.LIZ()) {
                    return;
                } else {
                    throw new AndroidRuntimeException(e3);
                }
            }
        }
        if (!(obj instanceof ByteBuffer) || !C1272780jE4.LIZ((ByteBuffer) obj)) {
            return;
        }
        c1272750jE1.LJ(obj);
    }

    public static void LJ(Context context, String str, JSONObject jSONObject) throws JSONException {
        int longVersionCode;
        String parent;
        if (context == null) {
            return;
        }
        String packageName = context.getPackageName();
        int longVersionCode2 = 0;
        PackageInfo packageInfoY3 = C786410Ut5.Y3(context.getPackageManager(), packageName, 0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            longVersionCode = (int) packageInfoY3.getLongVersionCode();
        } else {
            longVersionCode = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/data/user/0/");
        sbLIZ.append(packageName);
        sbLIZ.append("/files/splitcompat/");
        sbLIZ.append(longVersionCode);
        sbLIZ.append("/verified-splits");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!strLIZIZ.isEmpty()) {
            LIZJ(strLIZIZ, "df_live_byte_link", "split_df_live_byte_link", jSONObject);
        }
        String[] strArr = context.getApplicationInfo().splitSourceDirs;
        String parent2 = "";
        if (strArr == null) {
            parent = "";
        } else {
            parent = new C0VSJ(strArr[0]).getParent();
        }
        if (!parent.isEmpty()) {
            LIZJ(parent, "df_live_byte_link", "split_df_live_byte_link", jSONObject);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("lib");
        sbLIZ2.append(str);
        sbLIZ2.append(".so");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        String packageName2 = context.getPackageName();
        PackageInfo packageInfoY32 = C786410Ut5.Y3(context.getPackageManager(), packageName2, 0);
        if (i >= 28) {
            longVersionCode2 = (int) packageInfoY32.getLongVersionCode();
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("/data/data/");
        sbLIZ3.append(packageName2);
        sbLIZ3.append("/files/splitcompat/");
        sbLIZ3.append(longVersionCode2);
        sbLIZ3.append("/native-libraries");
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        if (!strLIZIZ3.isEmpty()) {
            LIZJ(strLIZIZ3, strLIZIZ2, null, jSONObject);
        }
        String str2 = context.getApplicationInfo().nativeLibraryDir;
        if (str2 != null) {
            parent2 = new C0VSJ(str2).getParent();
        }
        if (!parent2.isEmpty()) {
            LIZJ(parent2, strLIZIZ2, null, jSONObject);
        }
    }

    public final void LJIILIIL(int i, int i2, Object... objArr) {
        Object obj;
        ArrayList<InterfaceC1276380jJs> arrayList;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 15) {
                        if (i != 34) {
                            if (i != 43) {
                                if (i != 39) {
                                    if (i != 40) {
                                        switch (i) {
                                            case 40007:
                                                if (this.LJIJJ == null) {
                                                    this.LJIJJ = new ARunnableS120S0100000_20(this, 293);
                                                }
                                                this.LJIJI = true;
                                                ArrayList<InterfaceC1276380jJs> arrayList2 = this.LJIIIIZZ;
                                                if (arrayList2 != null && !arrayList2.isEmpty()) {
                                                    ((InterfaceC1276380jJs) ListProtector.get(this.LJIIIIZZ, 0)).LJJJIL(this.LJIJI);
                                                }
                                                Handler handlerLIZJ = C1274690jH9.LIZJ();
                                                if (handlerLIZJ == null) {
                                                    return;
                                                }
                                                handlerLIZJ.removeCallbacks(this.LJIJJ);
                                                C786410Ut5.LJLIIL(C538540LAe.LLJJJIL, handlerLIZJ, this.LJIJJ);
                                                return;
                                            case 40008:
                                                if (objArr.length != 2) {
                                                    return;
                                                }
                                                boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
                                                float fFloatValue = ((Float) objArr[1]).floatValue();
                                                ArrayList<InterfaceC1276380jJs> arrayList3 = this.LJIIIIZZ;
                                                if (arrayList3 == null || arrayList3.isEmpty()) {
                                                    return;
                                                }
                                                ((InterfaceC1276380jJs) ListProtector.get(this.LJIIIIZZ, 0)).LJJZZI(fFloatValue, zBooleanValue);
                                                return;
                                            case 40009:
                                                if (objArr.length != 1) {
                                                    return;
                                                }
                                                Object obj2 = objArr[0];
                                                if (!(obj2 instanceof String)) {
                                                    return;
                                                }
                                                String str = (String) obj2;
                                                ArrayList<InterfaceC1276380jJs> arrayList4 = this.LJIIIIZZ;
                                                if (arrayList4 == null || arrayList4.isEmpty()) {
                                                    return;
                                                }
                                                ((InterfaceC1276380jJs) ListProtector.get(this.LJIIIIZZ, 0)).LJJLIIIJ(str);
                                                return;
                                            case 40010:
                                                if (objArr.length != 1) {
                                                    return;
                                                }
                                                Object obj3 = objArr[0];
                                                if (!(obj3 instanceof String)) {
                                                    return;
                                                }
                                                String str2 = (String) obj3;
                                                ArrayList<InterfaceC1276380jJs> arrayList5 = this.LJIIIIZZ;
                                                if (arrayList5 == null || arrayList5.isEmpty()) {
                                                    return;
                                                }
                                                ((InterfaceC1276380jJs) ListProtector.get(this.LJIIIIZZ, 0)).LJJLIIIJILLIZJL(str2);
                                                return;
                                            case 40011:
                                                if (objArr.length != 2) {
                                                    return;
                                                }
                                                Object obj4 = objArr[0];
                                                if (!(obj4 instanceof String)) {
                                                    return;
                                                }
                                                Object obj5 = objArr[1];
                                                if (!(obj5 instanceof Long)) {
                                                    return;
                                                }
                                                String str3 = (String) obj4;
                                                long jLongValue = ((Long) obj5).longValue();
                                                ArrayList<InterfaceC1276380jJs> arrayList6 = this.LJIIIIZZ;
                                                if (arrayList6 == null || arrayList6.isEmpty()) {
                                                    return;
                                                }
                                                ((InterfaceC1276380jJs) ListProtector.get(this.LJIIIIZZ, 0)).LJJLL(jLongValue, str3);
                                                return;
                                            case 40012:
                                                if (objArr.length != 1) {
                                                    return;
                                                }
                                                Object obj6 = objArr[0];
                                                if (!(obj6 instanceof String)) {
                                                    return;
                                                }
                                                String str4 = (String) obj6;
                                                ArrayList<InterfaceC1276380jJs> arrayList7 = this.LJIIIIZZ;
                                                if (arrayList7 == null || arrayList7.isEmpty()) {
                                                    return;
                                                }
                                                ((InterfaceC1276380jJs) ListProtector.get(this.LJIIIIZZ, 0)).LJJLIIJ(str4);
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                    ArrayList<InterfaceC1276380jJs> arrayList8 = this.LJIIIIZZ;
                                    if (arrayList8 == null || arrayList8.isEmpty()) {
                                        return;
                                    }
                                    synchronized (this.LJIIIIZZ) {
                                        try {
                                            for (InterfaceC1276380jJs interfaceC1276380jJs : this.LJIIIIZZ) {
                                                if (interfaceC1276380jJs instanceof C1274810jHL) {
                                                    if (this.LJIILJJIL != null && this.LIZIZ.LIZJ == EnumC1275210jHz.RTC_CLIENT_MIX) {
                                                        C1274810jHL c1274810jHL = (C1274810jHL) interfaceC1276380jJs;
                                                        c1274810jHL.getClass();
                                                        C1274690jH9.LJFF(new ARunnableS120S0100000_20(c1274810jHL, 271));
                                                    }
                                                    if (this.LJIILJJIL != null && this.LIZIZ.LIZJ == EnumC1275210jHz.CLIENT_MIX) {
                                                        ((C1274810jHL) interfaceC1276380jJs).LJJL();
                                                    }
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                    return;
                                }
                                C1274250jGR c1274250jGR = this.LIZIZ;
                                String str5 = c1274250jGR.LIZIZ;
                                c1274250jGR.LIZIZ();
                                if (!(!str5.equals(this.LIZIZ.LIZIZ))) {
                                    return;
                                }
                                LJIJ();
                                return;
                            }
                            C1274250jGR c1274250jGR2 = this.LIZIZ;
                            if (c1274250jGR2.LIZJ != EnumC1275210jHz.RTC_CLIENT_MIX) {
                                return;
                            }
                            C1269340j8W c1269340j8WLLD = c1274250jGR2.LIZ().LLD();
                            C1274930jHX c1274930jHXLIZ = this.LIZLLL.LIZ();
                            if ((c1269340j8WLLD.LJJIL(1) == c1274930jHXLIZ.LIZ && c1269340j8WLLD.LJJIJIIJIL(1) == c1274930jHXLIZ.LIZIZ) || (arrayList = this.LJIIIIZZ) == null || arrayList.isEmpty()) {
                                return;
                            }
                            synchronized (this.LJIIIIZZ) {
                                try {
                                    AVLog.iod("InteractEngineImpl", "rtc client video resolution adjust");
                                    LJJIIJ();
                                    for (InterfaceC1276380jJs interfaceC1276380jJs2 : this.LJIIIIZZ) {
                                        if ((interfaceC1276380jJs2 instanceof C1274810jHL) && this.LJIILJJIL != null && this.LIZIZ.LIZJ == EnumC1275210jHz.RTC_CLIENT_MIX) {
                                            interfaceC1276380jJs2.LIZIZ();
                                        }
                                    }
                                } finally {
                                }
                            }
                            return;
                        }
                        LJJIII(i2);
                        return;
                    }
                } else {
                    if (objArr.length <= 1) {
                        return;
                    }
                    Object obj7 = objArr[0];
                    if (!(obj7 instanceof String) || (obj = objArr[1]) == null) {
                        return;
                    }
                    LJJIIJZLJL(obj, (String) obj7);
                    return;
                }
            } else {
                if (objArr.length <= 0) {
                    return;
                }
                Object obj8 = objArr[0];
                if (!(obj8 instanceof JSONObject)) {
                    return;
                }
                JSONObject jSONObject = (JSONObject) obj8;
                EnumC1275330jIB enumC1275330jIB = EnumC1275330jIB.SEI;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3 && i2 == 4) {
                            enumC1275330jIB = EnumC1275330jIB.METADATA_SEI;
                        }
                    } else {
                        enumC1275330jIB = EnumC1275330jIB.METADATA;
                    }
                } else {
                    enumC1275330jIB = EnumC1275330jIB.DEFAULT_OCCUPY;
                }
                ArrayList<InterfaceC1276380jJs> arrayList9 = this.LJIIIIZZ;
                if (arrayList9 == null) {
                    return;
                }
                Iterator<InterfaceC1276380jJs> it2 = arrayList9.iterator();
                while (it2.hasNext()) {
                    it2.next().LJJJJL(jSONObject, enumC1275330jIB);
                }
                return;
            }
        } else {
            ArrayList<InterfaceC1276380jJs> arrayList10 = this.LJIIIIZZ;
            if (arrayList10 != null && !arrayList10.isEmpty()) {
                synchronized (this.LJIIIIZZ) {
                    try {
                        for (InterfaceC1276380jJs interfaceC1276380jJs3 : this.LJIIIIZZ) {
                            if (interfaceC1276380jJs3 instanceof C1274810jHL) {
                                interfaceC1276380jJs3.LJJL();
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        LJJI();
    }

    public static void LIZJ(String str, String str2, String str3, JSONObject jSONObject) throws JSONException {
        ArrayList<String> arrayListLJIIL = LJIIL(str);
        ArrayList arrayList = new ArrayList();
        for (String str4 : arrayListLJIIL) {
            String name = new C0VSJ(str4).getName();
            if ((str2 != null && name.startsWith(str2)) || (str3 != null && name.startsWith(str3))) {
                arrayList.add(str4);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!arrayList.isEmpty()) {
            jSONObject2.put("findFiles", new JSONArray((Collection) arrayList));
        } else {
            jSONObject2.put("findFiles", "null");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkfile result:");
        sbLIZ.append(str);
        sbLIZ.append("/");
        sbLIZ.append(str2);
        jSONObject.put(C2188811AlT.LIZIZ(sbLIZ), jSONObject2);
    }
}
