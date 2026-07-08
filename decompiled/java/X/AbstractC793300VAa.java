package X;

import X.AbstractC793340VAe;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VAa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC793300VAa<T extends AbstractC793340VAe> extends AbstractC793320VAc<T> {
    public volatile int LJ;
    public long LJFF;
    public int LJI;
    public long LJII;

    public AbstractC793300VAa() {
        super("power");
    }

    @Override // X.C0VAV
    public final void LIZLLL() {
        if (this.LJ > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.LJII;
            C787900UvU.LIZ.LIZJ(new RunnableC793330VAd(this, this.LIZJ, j));
            this.LJII = jCurrentTimeMillis;
        }
        this.LIZJ = true;
    }

    @Override // X.C0VAV
    public final void LJIJ() {
        if (this.LJ > 0 && this.LJII > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.LJII;
            C787900UvU.LIZ.LIZJ(new RunnableC793330VAd(this, this.LIZJ, j));
            this.LJII = jCurrentTimeMillis;
        }
        this.LIZJ = false;
    }

    @Override // X.AbstractC793320VAc
    public final void LJI(long j, long j2) {
        int i = 0;
        this.LJI = 0;
        this.LJFF = 0L;
        if (this.LJ > 0 && this.LJII > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C787900UvU.LIZ.LIZJ(new RunnableC793330VAd(this, this.LIZJ, jCurrentTimeMillis - this.LJII));
            this.LJII = jCurrentTimeMillis;
        }
        super.LJI(j, j2);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        double d = this.LJFF;
        double d2 = jCurrentTimeMillis2 - this.LIZIZ;
        double d3 = (d / d2) * 60000.0d * 10.0d;
        double d4 = (((double) this.LJI) / d2) * 60000.0d * 10.0d;
        if (d3 >= C0VAU.LIZJ) {
            i = 17;
        }
        if (d4 >= C0VAU.LIZIZ) {
            i |= 18;
        }
        if (i != 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("issue_type", i).put("total_hold_time", d3).put("total_acquire_count", d4);
                ConcurrentHashMap<Integer, T> concurrentHashMap = this.LIZLLL;
                if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<T> it2 = this.LIZLLL.values().iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(((C793360VAg) it2.next()).LIZIZ());
                    }
                    jSONObject.put("detail", jSONArray);
                }
                C0V1J.LIZ(jSONObject);
                C792310V6f.LJIIIZ().LIZJ(new C0V1I("battery_trace", jSONObject));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // X.AbstractC793320VAc
    public final void LIZJ(T t, long j, long j2) {
        this.LJI++;
        long j3 = t.LIZ;
        if (j3 >= j) {
            j = j3;
        }
        long j4 = t.LIZIZ;
        if (j4 > 0 && j2 >= j4) {
            j2 = j4;
        }
        long j5 = j2 - j3;
        C793360VAg c793360VAg = (C793360VAg) t;
        if (j5 >= C0VAU.LIZ) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_type", "battery_trace");
                jSONObject.put("issue_type", 16).put("single_hold_time", j5).put("wake_lock_info", c793360VAg.toString());
                C0V1J.LIZ(jSONObject);
                C792310V6f.LJIIIZ().LIZJ(new C0V1I("battery_trace", jSONObject));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        long j6 = j2 - j;
        if (j6 > 0) {
            this.LJFF += j6;
        }
    }
}
