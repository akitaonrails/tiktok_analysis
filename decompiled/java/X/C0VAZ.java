package X;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VAZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VAZ extends AbstractC793320VAc<C793350VAf> implements AnonymousClass0830 {
    public int[] LJ;
    public int LJFF;
    public final List<Long> LJI;
    public int LJII;
    public final Object LJIIIIZZ;
    public final List<Long> LJIIIZ;

    @Override // X.AnonymousClass0830
    public final String LIZIZ() {
        return "android.app.IAlarmManager";
    }

    @Override // X.C0VAV
    public final void LIZLLL() {
        this.LIZJ = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.LJIIIIZZ) {
            try {
                ((ArrayList) this.LJI).add(Long.valueOf(jCurrentTimeMillis));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C0VAV
    public final void LJIJ() {
        this.LIZJ = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.LJIIIIZZ) {
            try {
                ((ArrayList) this.LJI).add(Long.valueOf(jCurrentTimeMillis));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C0VAZ() {
        super("alarm");
        this.LJI = new ArrayList();
        this.LJIIIIZZ = new Object();
        this.LJIIIZ = new ArrayList();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LJII(Object[] objArr) {
        long j;
        String string;
        C793350VAf c793350VAf = new C793350VAf();
        boolean z = false;
        int i = 0;
        int iHashCode = -1;
        for (Object obj : objArr) {
            if ((obj instanceof Integer) && !z) {
                c793350VAf.LJ = ((Integer) obj).intValue();
                z = true;
            } else if (obj instanceof Long) {
                if (i == 0) {
                    long jLongValue = ((Long) obj).longValue();
                    c793350VAf.LIZ = jLongValue;
                    int i2 = c793350VAf.LJ;
                    if (i2 != 1 && i2 != 0) {
                        jLongValue = (jLongValue + System.currentTimeMillis()) - SystemClock.elapsedRealtime();
                    }
                    c793350VAf.LIZ = jLongValue;
                } else if (i == 2) {
                    c793350VAf.LJFF = ((Long) obj).longValue();
                }
                i++;
            } else if (obj instanceof PendingIntent) {
                PendingIntent pendingIntent = (PendingIntent) obj;
                if (Build.VERSION.SDK_INT <= 23 && pendingIntent != null) {
                    string = ((Intent) Reflect.on(pendingIntent).call("getIntent").get()).toString();
                } else {
                    string = "";
                }
                c793350VAf.LJI = string;
                iHashCode = pendingIntent.hashCode();
            }
        }
        if (iHashCode != -1) {
            if (c793350VAf.LJFF == 0) {
                j = c793350VAf.LIZ;
            } else {
                j = -1;
            }
            c793350VAf.LIZIZ = j;
            if (C0V5J.LIZ.LLJILJIL) {
                c793350VAf.LIZJ = C786410Ut5.u3().getName();
                c793350VAf.LIZLLL = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
            }
            this.LIZLLL.put(Integer.valueOf(iHashCode), c793350VAf);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.AnonymousClass0830
    public final void LIZ(Method method, Object[] objArr) {
        int iHashCode;
        try {
            String name = method.getName();
            if ("set".equals(name)) {
                LJII(objArr);
                return;
            }
            if ("remove".equals(name)) {
                Object obj = objArr[0];
                if (obj != null && (obj instanceof PendingIntent)) {
                    iHashCode = obj.hashCode();
                } else {
                    iHashCode = -1;
                }
                C793350VAf c793350VAf = (C793350VAf) this.LIZLLL.get(Integer.valueOf(iHashCode));
                if (c793350VAf != null && c793350VAf.LJFF > 0) {
                    c793350VAf.LIZIZ = System.currentTimeMillis();
                    this.LIZLLL.put(Integer.valueOf(iHashCode), c793350VAf);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C0VAV
    public final void LJFF(C793380VAi c793380VAi, C793390VAj c793390VAj) {
        if (!this.LIZ.equals(c793390VAj.LIZLLL)) {
            return;
        }
        if (!c793390VAj.LIZIZ) {
            c793380VAi.LJIIJ += c793390VAj.LJI;
        } else {
            c793380VAi.LJFF += c793390VAj.LJI;
        }
    }

    @Override // X.AbstractC793320VAc
    public final void LJI(long j, long j2) {
        int i = 0;
        this.LJFF = 0;
        this.LJ = new int[2];
        ((ArrayList) this.LJIIIZ).add(Long.valueOf(j));
        synchronized (this.LJIIIIZZ) {
            try {
                ((ArrayList) this.LJIIIZ).addAll(this.LJI);
                ((ArrayList) this.LJI).clear();
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        ((ArrayList) this.LJIIIZ).add(Long.valueOf(j2));
        this.LJII = 1;
        while (this.LJII < ((ArrayList) this.LJIIIZ).size()) {
            super.LJI(((Long) ListProtector.get(this.LJIIIZ, this.LJII - 1)).longValue(), ((Long) ListProtector.get(this.LJIIIZ, this.LJII)).longValue());
            this.LJII++;
        }
        int[] iArr = this.LJ;
        if (iArr[0] + iArr[1] != 0) {
            int size = ((ArrayList) this.LJIIIZ).size();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!this.LIZJ ? size % 2 != 1 : size % 2 != 0) {
                C793370VAh c793370VAh = C0VAY.LIZ;
                c793370VAh.LIZJ(new C793390VAj(jCurrentTimeMillis, iArr[0], this.LIZ, true));
                c793370VAh.LIZJ(new C793390VAj(jCurrentTimeMillis, iArr[1], this.LIZ, false));
            } else {
                C793370VAh c793370VAh2 = C0VAY.LIZ;
                c793370VAh2.LIZJ(new C793390VAj(jCurrentTimeMillis, iArr[0], this.LIZ, false));
                c793370VAh2.LIZJ(new C793390VAj(jCurrentTimeMillis, iArr[1], this.LIZ, true));
            }
        }
        ((ArrayList) this.LJIIIZ).clear();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        int[] iArr2 = this.LJ;
        double d = ((double) iArr2[0]) + ((double) iArr2[1]);
        double d2 = jCurrentTimeMillis2 - this.LIZIZ;
        double d3 = (d / d2) * 60000.0d * 10.0d;
        double d4 = (((double) this.LJFF) / d2) * 60000.0d * 10.0d;
        if (d3 >= C0VAU.LIZLLL) {
            i = 49;
        }
        if (d4 >= C0VAU.LJ) {
            i |= 50;
        }
        if (i != 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("issue_type", i).put("wake_up_count", d3).put("normal_count", d4);
                ConcurrentHashMap<Integer, T> concurrentHashMap = this.LIZLLL;
                if (concurrentHashMap != 0 && concurrentHashMap.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it2 = this.LIZLLL.values().iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(((C793350VAf) it2.next()).LIZIZ());
                    }
                    jSONObject.put("detail", jSONArray);
                }
                C0V1J.LIZ(jSONObject);
                C792310V6f.LJIIIZ().LIZJ(new C0V1I("battery_trace", jSONObject));
            } catch (Throwable th) {
            }
        }
    }

    @Override // X.AbstractC793320VAc
    public final void LIZJ(AbstractC793340VAe abstractC793340VAe, long j, long j2) {
        int i;
        C793350VAf c793350VAf = (C793350VAf) abstractC793340VAe;
        long j3 = c793350VAf.LJFF;
        if (j3 <= 0) {
            long j4 = c793350VAf.LIZ;
            if (j <= j4 && j4 <= j2) {
                i = 1;
            } else {
                return;
            }
        } else {
            long j5 = c793350VAf.LIZ;
            if (j5 < j) {
                j5 = (j + j3) - ((j - j5) % j3);
            }
            long j6 = c793350VAf.LIZIZ;
            if (j6 <= j2 && j6 > 0) {
                j2 = j6;
            }
            long j7 = j2 - j5;
            if (j7 <= 0) {
                return;
            } else {
                i = ((int) (j7 / j3)) + 1;
            }
        }
        int i2 = c793350VAf.LJ;
        if (i2 != 2 && i2 != 0) {
            this.LJFF += i;
            return;
        }
        int[] iArr = this.LJ;
        int i3 = this.LJII % 2;
        iArr[i3] = iArr[i3] + i;
    }
}
