package X;

import Y.ARunnableS89S0200000_20;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.ITerminalMonitorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0krv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335930krv extends C1320270kSf {
    public static ExecutorService LIZLLL;
    public int LIZIZ;
    public final C830490Whz LIZ = new C830490Whz();
    public long LIZJ = -1;

    public static void LJIIL() {
        if (LIZLLL == null) {
            synchronized (C1335930krv.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = C786410Ut5.e4(1, new ThreadFactoryC1339280kxK(2));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325670kbN
    public final void LIZLLL(String str) {
        this.LIZ.remove(str);
    }

    @Override // X.C1320270kSf, X.InterfaceC1325690kbP
    public final void LIZIZ(String str, String str2, Map<String, String> map) {
        List list = (List) this.LIZ.get(str);
        if (list != null) {
            list.add(str2);
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325670kbN
    public final void LJII(C1325710kbR c1325710kbR, String str, boolean z) {
        List list = (List) this.LIZ.remove(str);
        if (list != null) {
            final boolean zContains = list.contains("NetworkFetchProducer");
            final Uri uri = c1325710kbR.LIZIZ;
            final long j = -1;
            if (this.LIZJ > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZJ;
                this.LIZJ = -1L;
                j = jCurrentTimeMillis;
            }
            LJIIL();
            LIZLLL.submit(new Runnable() { // from class: X.0Qyy
                @Override // java.lang.Runnable
                public final void run() {
                    Uri uri2 = uri;
                    long j2 = j;
                    boolean z2 = zContains;
                    C1C7U.LIZ("ImageNetworkRequestsMonitor@817e.onRequestSuccess$1L");
                    String string = uri2 != null ? uri2.toString() : null;
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("url", string);
                            jSONObject.put("fromNetwork", z2);
                            jSONObject.put("url_convert", false);
                            if (!TextUtils.isEmpty("")) {
                                jSONObject.put("caller_id", "");
                            }
                            jSONObject.put("duration", j2);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        ITerminalMonitorService iTerminalMonitorService = (ITerminalMonitorService) PluggableExtentionKt.pluggableSpi$default(ITerminalMonitorService.class, false, false, false, 14, null);
                        if (iTerminalMonitorService != null) {
                            iTerminalMonitorService.LIZLLL(0, jSONObject);
                        }
                        if (j2 > 0 && iTerminalMonitorService != null) {
                            iTerminalMonitorService.LIZIZ(j2);
                        }
                    }
                    C1C7U.LIZIZ("ImageNetworkRequestsMonitor@817e.onRequestSuccess$1L");
                }
            });
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325670kbN
    public final void LIZJ(C1325710kbR c1325710kbR, Object obj, String str, boolean z) {
        this.LIZ.put(str, new LinkedList());
        if (this.LIZJ == -1) {
            this.LIZJ = System.currentTimeMillis();
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325670kbN
    public final void LJ(C1325710kbR c1325710kbR, String str, Throwable th, boolean z) {
        this.LIZ.remove(str);
        int i = this.LIZIZ - 1;
        this.LIZIZ = i;
        if (i == 0) {
            LJIIL();
            LIZLLL.submit(new ARunnableS89S0200000_20(th, c1325710kbR, 198));
        }
    }
}
