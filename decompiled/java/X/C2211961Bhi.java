package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bhi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2211961Bhi {
    public static volatile C2211961Bhi LJIIIIZZ;
    public volatile int LIZ = -1;
    public final AtomicInteger LIZIZ = new AtomicInteger();
    public AtomicInteger LIZJ = new AtomicInteger();
    public int LIZLLL = 0;
    public final List<Map<String, String>> LJ = Collections.synchronizedList(new ArrayList());
    public volatile long LJFF = 0;
    public long LJI = -1;
    public boolean LJII = false;

    public static C2211961Bhi LIZ() {
        if (LJIIIIZZ == null) {
            synchronized (C2211961Bhi.class) {
                try {
                    if (LJIIIIZZ == null) {
                        LJIIIIZZ = new C2211961Bhi();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIIIZZ;
    }

    public final void LIZIZ(long j) {
        if (j == -1) {
            this.LJI = -1L;
            C2212381BiO.LJFF(" time valid, reset remote time ");
        } else {
            if (this.LJI != -1) {
                return;
            }
            C2212141Bi0.LJIIIIZZ().LJIILLIIL(j);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" time valid, saving remote time: ");
            sbLIZ.append(j);
            C2212381BiO.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            this.LJI = j;
        }
    }

    public final void LIZJ(AtomicInteger atomicInteger) {
        JSONObject jSONObject;
        this.LIZJ = atomicInteger;
        if (this.LIZLLL == atomicInteger.get()) {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            try {
                synchronized (this.LJ) {
                    try {
                        Iterator<Map<String, String>> it2 = this.LJ.iterator();
                        while (it2.hasNext()) {
                            JSONObject jSONObject4 = new JSONObject();
                            for (Map.Entry<String, String> entry : it2.next().entrySet()) {
                                jSONObject4.putOpt(entry.getKey(), entry.getValue());
                            }
                            jSONArray.put(jSONObject4);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                jSONObject2.put("udp_addrs", jSONArray);
                jSONObject3.putOpt("log_extra", C2212061Bhs.LIZIZ().LIZJ());
                jSONObject3.putOpt("ad_extra_data", jSONObject2);
                jSONObject3.putOpt("is_ad_event", "1");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UDPClient. sendStopShowingEvent:\n");
                sbLIZ.append(C786410Ut5.J3(jSONObject3));
                C2188811AlT.LIZIZ(sbLIZ);
                jSONObject = jSONObject3;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = null;
            }
            C2212051Bhr.LIZJ().LJFF("splash_ad", "splash_init_monitor_all", jSONObject, 84378473382L);
        }
    }

    public final void LIZLLL(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UDPClient. setUDPSwitchResult: ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZ = i;
    }
}
