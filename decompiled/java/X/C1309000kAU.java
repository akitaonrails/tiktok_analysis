package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import fyo.e;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kAU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309000kAU implements InterfaceC1309140kAi {
    public final InterfaceC1308990kAT LIZ;
    public boolean LIZIZ;
    public long LIZJ;
    public int LIZLLL = 100;
    public int LJ;
    public long LJFF;
    public AbstractC1309040kAY LJI;

    public C1309000kAU(C1309070kAb c1309070kAb) {
        this.LIZ = c1309070kAb;
    }

    @Override // X.InterfaceC1309140kAi
    public final InterfaceC1309140kAi setConfigVersion(long j) {
        if (j < 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set config version fail. version = ");
            sbLIZ.append(j);
            C2188811AlT.LIZIZ(sbLIZ);
            return this;
        }
        this.LIZJ = j;
        return this;
    }

    @Override // X.InterfaceC1309140kAi
    public final InterfaceC1309140kAi setDebug(boolean z) {
        this.LIZIZ = z;
        return this;
    }

    @Override // X.InterfaceC1309140kAi
    public final InterfaceC1309140kAi setFetchInterval(int i) {
        if (i < 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set fetch interval fail. interval = ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return this;
    }

    @Override // X.InterfaceC1309140kAi
    public final InterfaceC1309140kAi setMaxFetchTimes(int i) {
        if (i < 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set max fetch times fail. times = ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            return this;
        }
        this.LIZLLL = i;
        return this;
    }

    @Override // X.InterfaceC1309140kAi
    public final InterfaceC1309140kAi setNet(AbstractC1309040kAY abstractC1309040kAY) {
        this.LJI = abstractC1309040kAY;
        return this;
    }

    public final void LIZ(final String str, final String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("retry fetch, count = ");
        sbLIZ.append(this.LJFF);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LJ > 10) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetch fail, module = ");
            sbLIZ2.append(str);
            sbLIZ2.append(", retry times = ");
            sbLIZ2.append(this.LJ);
            C2188811AlT.LIZIZ(sbLIZ2);
            InterfaceC1308990kAT interfaceC1308990kAT = this.LIZ;
            if (interfaceC1308990kAT != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("fetch fail. try times = ");
                sbLIZ3.append(this.LJ);
                sbLIZ3.append(", max = ");
                sbLIZ3.append(10);
                ((C1309070kAb) interfaceC1308990kAT).LIZ(-999, C2188811AlT.LIZIZ(sbLIZ3));
            }
            this.LJ = 0;
            return;
        }
        new PthreadTimer("tings/Fetcher").schedule(new C0W9W() { // from class: X.0T5G
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("Fetcher@601f.delayFetch$1");
                boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                try {
                    this.LLILLL.LIZIZ(str, str2);
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("Fetcher@601f.delayFetch$1");
            }
        }, Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    public final void LIZIZ(String str, String str2) {
        int i = this.LIZLLL;
        if (i > 0 && this.LJFF > i) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetch reach max count, maxFetchTimes = ");
            sbLIZ.append(this.LIZLLL);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        long j = this.LJFF;
        if (j == Long.MAX_VALUE) {
            this.LJFF = 1L;
        } else {
            this.LJFF = j + 1;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("start to fetch, module = ");
        sbLIZ2.append(str);
        sbLIZ2.append(", fetch count = ");
        sbLIZ2.append(this.LJFF);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (this.LJI == null) {
            InterfaceC1308990kAT interfaceC1308990kAT = this.LIZ;
            if (interfaceC1308990kAT != null) {
                ((C1309070kAb) interfaceC1308990kAT).LIZ(-996, "netClient is null");
                return;
            }
            return;
        }
        String strLIZIZ = C1308970kAR.LIZIZ(C1308970kAR.LIZJ);
        if (TextUtils.isEmpty(strLIZIZ)) {
            InterfaceC1308990kAT interfaceC1308990kAT2 = this.LIZ;
            if (interfaceC1308990kAT2 != null) {
                ((C1309070kAb) interfaceC1308990kAT2).LIZ(-998, "host is null");
                return;
            }
            return;
        }
        this.LJ++;
        HashMap map = new HashMap();
        map.put("caller_name", "datacenter");
        map.put("platform", "2");
        map.put("os_version", Build.VERSION.RELEASE);
        map.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("");
        sbLIZ3.append(this.LIZJ);
        map.put("config_version", C2188811AlT.LIZIZ(sbLIZ3));
        if (!map.containsKey("device_brand")) {
            map.put("device_brand", Build.BRAND);
        }
        if (!map.containsKey("device_type")) {
            map.put("device_type", Build.MODEL.toLowerCase());
        }
        if (!TextUtils.isEmpty(str) && !str.equals("all")) {
            map.put("module", str);
        }
        if (this.LIZIZ) {
            map.put("debug", "1");
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put("config_key", str2);
        }
        if (C1308970kAR.LIZ(C1308970kAR.LIZLLL) != null) {
            map.putAll(C1308970kAR.LIZ(C1308970kAR.LIZLLL));
        }
        if (C1308970kAR.LIZ(C1308970kAR.LJ) != null) {
            map.putAll(C1308970kAR.LIZ(C1308970kAR.LJ));
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("https://");
        sbLIZ4.append(strLIZIZ);
        sbLIZ4.append("/vod/settings/v1/get_configs");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
        AbstractC1309040kAY abstractC1309040kAY = this.LJI;
        final C1309010kAV c1309010kAV = new C1309010kAV(this, str, str2);
        C1309030kAX c1309030kAX = (C1309030kAX) abstractC1309040kAY;
        synchronized (c1309030kAX) {
            try {
                C1309100kAe c1309100kAe = c1309030kAX.LIZ;
                if (c1309100kAe.LJI == null) {
                    c1309100kAe.LJI = new C1469810oLr();
                }
                c1309030kAX.LIZ.getClass();
                String strLIZ = C1309100kAe.LIZ(strLIZIZ2, map);
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("setting query ");
                sbLIZ5.append(strLIZ);
                TTVideoEngineLog.d("VodSettings", C2188811AlT.LIZIZ(sbLIZ5));
                c1309030kAX.LIZ.LJI.LIZJ(strLIZ, null, new InterfaceC1309180kAm() { // from class: X.0kAW
                    @Override // X.InterfaceC1309180kAm
                    public final void LIZIZ(JSONObject jSONObject, e eVar) {
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("setting result ");
                        sbLIZ6.append(jSONObject);
                        TTVideoEngineLog.d("VodSettings", C2188811AlT.LIZIZ(sbLIZ6));
                        if (eVar != null) {
                            InterfaceC1309050kAZ interfaceC1309050kAZ = c1309010kAV;
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append(" fail. info: ");
                            sbLIZ7.append(eVar.toString());
                            ((C1309010kAV) interfaceC1309050kAZ).LIZ(null, new Error(C2188811AlT.LIZIZ(sbLIZ7)));
                            return;
                        }
                        if (jSONObject == null) {
                            return;
                        }
                        ((C1309010kAV) c1309010kAV).LIZ(jSONObject, null);
                    }
                });
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1309140kAi
    public final void fetch(String str, String str2, boolean z) {
        this.LJ = 0;
        LIZIZ(str, null);
    }
}
