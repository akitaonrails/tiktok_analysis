package Y;

import X.C1468940oKS;
import X.C1497220p44;
import X.C1512130pS7;
import X.C1520640pfq;
import X.C1521180pgi;
import X.C1521380ph2;
import X.C1549240qPy;
import X.C1551020qSq;
import X.C1551210qT9;
import X.C1551780qU4;
import X.C1553130qWF;
import X.C1C7U;
import X.C2188811AlT;
import X.C824310WVh;
import X.InterfaceC1551180qT6;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.feature.SmartDataTrackerServiceImpl;
import com.ttnet.org.chromium.net.impl.CronetUrlRequest;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS6S2200000_23 implements Runnable {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() throws JSONException {
        C1521180pgi c1521180pgi = (C1521180pgi) this.l2;
        if (c1521180pgi != null) {
            if (c1521180pgi.LLJI.isEmpty()) {
                ((C1521180pgi) this.l2).LJIIIIZZ(this.s0);
                C824310WVh.LIZ(new ARunnableS123S0100000_23(this, 10));
            }
            if (((C1521180pgi) this.l2).LLIZ.isEmpty()) {
                ((C1521180pgi) this.l2).LJIIJ(this.s1);
                C824310WVh.LIZ(new ARunnableS123S0100000_23(this, 11));
            }
            C1521180pgi c1521180pgi2 = (C1521180pgi) this.l2;
            c1521180pgi2.LLJJIJIIJIL = C1520640pfq.LIZJ(c1521180pgi2.LLJJIJIIJIL, C1521380ph2.LIZ((JSONObject) this.l3));
        }
    }

    public final void LIZ$1() {
        ((CronetUrlRequest) this.l3).LJJI();
        synchronized (((CronetUrlRequest) this.l3).LJFF) {
            try {
                if (((CronetUrlRequest) this.l3).LJJIIJZLJL()) {
                    return;
                }
                CronetUrlRequest cronetUrlRequest = (CronetUrlRequest) this.l3;
                cronetUrlRequest.LIZLLL = true;
                try {
                    cronetUrlRequest.LJIIIZ.LIZLLL(cronetUrlRequest, (C1497220p44) this.l2, this.s0, this.s1);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    ((CronetUrlRequest) this.l3).LJJIIZI(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZ$2() {
        InterfaceC1551180qT6 interfaceC1551180qT6;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zLIZJ = C1551020qSq.LIZJ(((File) this.l2).getAbsolutePath());
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clean channel old resources finish, channel:");
        sbLIZ.append(this.s0);
        sbLIZ.append("delete:");
        sbLIZ.append(zLIZJ);
        sbLIZ.append(" , cost:");
        sbLIZ.append(jCurrentTimeMillis2);
        C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ));
        if (zLIZJ && (interfaceC1551180qT6 = (InterfaceC1551180qT6) this.l3) != null) {
            interfaceC1551180qT6.LIZ(this.s0);
        }
        C1551780qU4.LJFF(new C1551210qT9(zLIZJ ? 1 : 0, 0, 3, jCurrentTimeMillis2, this.s1, this.s0));
    }

    public static final void run$0(ARunnableS6S2200000_23 aRunnableS6S2200000_23) {
        boolean zLIZ;
        C1C7U.LIZ("WebViewMonitorJsBridge@6e17.config$1");
        try {
            aRunnableS6S2200000_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WebViewMonitorJsBridge@6e17.config$1");
    }

    public static final void run$1(ARunnableS6S2200000_23 aRunnableS6S2200000_23) {
        boolean zLIZ;
        JSONObject jSONObject;
        C1C7U.LIZ("SmartDataTrackerServiceImpl@68d5.putExtData$1");
        try {
            for (SmartDataTrackerServiceImpl.TrackerMonitorData trackerMonitorData : ((C1512130pS7) aRunnableS6S2200000_23.l2).LIZLLL) {
                String str = aRunnableS6S2200000_23.s0;
                if (str != null && TextUtils.equals(trackerMonitorData.key, str) && (jSONObject = trackerMonitorData.jsonData) != null) {
                    jSONObject.put(aRunnableS6S2200000_23.s1, aRunnableS6S2200000_23.l3);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SmartDataTrackerServiceImpl@68d5.putExtData$1");
    }

    public static final void run$2(ARunnableS6S2200000_23 aRunnableS6S2200000_23) {
        boolean zLIZ;
        C1C7U.LIZ("CronetUrlRequest@8822.onRedirectReceived$1");
        try {
            aRunnableS6S2200000_23.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CronetUrlRequest@8822.onRedirectReceived$1");
    }

    public static final void run$3(ARunnableS6S2200000_23 aRunnableS6S2200000_23) {
        C1468940oKS c1468940oKS = (C1468940oKS) aRunnableS6S2200000_23.l2;
        String[] strArr = (String[]) aRunnableS6S2200000_23.l3;
        String str = aRunnableS6S2200000_23.s0;
        String str2 = aRunnableS6S2200000_23.s1;
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.setDirectUrlUseDataLoader$1L");
        c1468940oKS.LLLLLLIL(0L, str, str2, strArr);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.setDirectUrlUseDataLoader$1L");
    }

    public static final void run$4(ARunnableS6S2200000_23 aRunnableS6S2200000_23) {
        boolean zLIZ;
        C1C7U.LIZ("GeckoSpecifiedVersionChannelManager@80d.clearCacheForAccessKey$1");
        try {
            aRunnableS6S2200000_23.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GeckoSpecifiedVersionChannelManager@80d.clearCacheForAccessKey$1");
    }

    public static final void run$5(ARunnableS6S2200000_23 aRunnableS6S2200000_23) {
        boolean zLIZ;
        C1C7U.LIZ("MonitorLogAsyncImpl@2dda.e$2");
        try {
            ((C1549240qPy) aRunnableS6S2200000_23.l3).LIZ.e(aRunnableS6S2200000_23.s0, aRunnableS6S2200000_23.s1, (Throwable) aRunnableS6S2200000_23.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MonitorLogAsyncImpl@2dda.e$2");
    }

    public ARunnableS6S2200000_23(Object obj, String str, Object obj2, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.l3 = obj2;
        this.s1 = str2;
    }
}
