package X;

import Y.ARunnableS110S0100000_10;
import Y.ARunnableS21S0101000_10;
import android.os.Build;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.search.lcp.SearchLcpExperiment;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0P8S, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P8S {
    public static final C0P8R LJIJJLI = new C0P8R();
    public static volatile C0P8S LJIL;
    public boolean LIZ;
    public long LIZIZ;
    public int LIZJ;
    public boolean LJ;
    public boolean LJIILJJIL;
    public final CopyOnWriteArrayList<Integer> LIZLLL = new CopyOnWriteArrayList<>();
    public final ConcurrentHashMap<Integer, Long> LJFF = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, Long> LJI = new ConcurrentHashMap<>();
    public final CopyOnWriteArrayList<Integer> LJII = new CopyOnWriteArrayList<>();
    public final ConcurrentHashMap<Integer, String> LJIIIIZZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, AtomicInteger> LJIIIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, Runnable> LJIIJ = new ConcurrentHashMap<>();
    public final CopyOnWriteArrayList<Integer> LJIIJJI = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<String> LJIIL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<String> LJIILIIL = new CopyOnWriteArrayList<>();
    public final BPEAHandler LJIILL = new BPEAHandler(Looper.getMainLooper());
    public final CopyOnWriteArrayList<Integer> LJIIZILJ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<C0P5Z> LJIJ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<C639280P5q> LJIJI = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<C639180P5g> LJIJJ = new CopyOnWriteArrayList<>();
    public final ARunnableS110S0100000_10 LJIILLIIL = new ARunnableS110S0100000_10(this, 130);

    public final List<Integer> LJ() {
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = this.LIZLLL;
        ArrayList arrayList = new ArrayList();
        for (Integer num : copyOnWriteArrayList) {
            if (true ^ this.LJIIJJI.contains(num)) {
                arrayList.add(num);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str = this.LJIIIIZZ.get(obj);
            if (str != null && !this.LJIIL.contains(str) && (this.LJIILJJIL || this.LJIILIIL.contains(str))) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final void LJIIJJI() {
        this.LJIILL.removeCallbacks(this.LJIILLIIL);
        this.LJ = false;
        this.LIZ = false;
        this.LIZIZ = 0L;
        this.LIZJ = 0;
        this.LIZLLL.clear();
        this.LJFF.clear();
        this.LJI.clear();
        this.LJII.clear();
        this.LJIIIIZZ.clear();
        this.LJIIJJI.clear();
        this.LJIIIZ.clear();
        Iterator<T> it2 = this.LJIIJ.values().iterator();
        while (it2.hasNext()) {
            this.LJIILL.removeCallbacks((Runnable) it2.next());
        }
        this.LJIIJ.clear();
        this.LJIIZILJ.clear();
        this.LJIJ.clear();
        this.LJIJI.clear();
        this.LJIJJ.clear();
    }

    public final void LJIIL() {
        this.LJIILL.removeCallbacks(this.LJIILLIIL);
        List<Integer> listLJ = LJ();
        if (this.LJ && (!((ArrayList) listLJ).isEmpty()) && this.LIZIZ > 0) {
            C786410Ut5.LJLIIL(20000L, this.LJIILL, this.LJIILLIIL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0P8S() {
        List listLJJLIIIJILLIZJL;
        List listLJJLIIIJILLIZJL2;
        this.LJIILJJIL = true;
        String str = ((SearchLcpExperiment.Config) SearchLcpExperiment.LIZJ.getValue()).types;
        if (C123100dR.LIZ(str) && (listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) != null) {
            for (Object obj : listLJJLIIIJILLIZJL2) {
                if (!this.LJIILIIL.contains(obj)) {
                    this.LJIILIIL.add((String) obj);
                }
                this.LJIILJJIL = false;
                Objects.toString(this.LJIILIIL);
                if (this.LJ) {
                    if (((ArrayList) LJ()).isEmpty()) {
                        LJI(C0PG5.NO_TRACKED_ITEMS);
                    }
                    LJII();
                    LJIIL();
                }
            }
        }
        String str2 = ((SearchLcpExperiment.Config) SearchLcpExperiment.LIZJ.getValue()).blackList;
        if (!C123100dR.LIZ(str2) || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6)) == null || !(!listLJJLIIIJILLIZJL.isEmpty())) {
            String[] strArr = {"5"};
            if (this.LIZ) {
                return;
            }
            this.LJIIL.clear();
            C19719612Di.LJJII(this.LJIIL, strArr);
            return;
        }
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            String[] strArr2 = {it2.next()};
            if (!this.LIZ) {
                this.LJIIL.clear();
                C19719612Di.LJJII(this.LJIIL, strArr2);
            }
        }
    }

    public final void LIZ() {
        List<Integer> listLJ = LJ();
        if (!this.LJ || ((ArrayList) listLJ).isEmpty()) {
            return;
        }
        if (!listLJ.isEmpty()) {
            Iterator<Integer> it2 = listLJ.iterator();
            while (it2.hasNext()) {
                if (!this.LJI.containsKey(Integer.valueOf(it2.next().intValue()))) {
                    return;
                }
            }
        }
        LJI(C0PG5.SUCCESS);
    }

    public final void LIZIZ() {
        List<Integer> listLJ = LJ();
        if (!this.LJ || ((ArrayList) listLJ).isEmpty()) {
            return;
        }
        if (!listLJ.isEmpty()) {
            Iterator<Integer> it2 = listLJ.iterator();
            while (it2.hasNext()) {
                int iIntValue = it2.next().intValue();
                if (!this.LJI.containsKey(Integer.valueOf(iIntValue)) && !this.LJII.contains(Integer.valueOf(iIntValue))) {
                    return;
                }
            }
        }
        LJI(C0PG5.PARTIAL_FAIL);
    }

    public final void LJII() {
        List<Integer> listLJ = LJ();
        if (listLJ.isEmpty()) {
            return;
        }
        Iterator<Integer> it2 = listLJ.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            if (this.LJI.containsKey(Integer.valueOf(iIntValue)) || this.LJII.contains(Integer.valueOf(iIntValue))) {
                LIZ();
                LIZIZ();
                return;
            }
        }
    }

    public final void LIZJ(int i) {
        String str;
        if (!this.LIZ && !this.LJIIJJI.contains(Integer.valueOf(i)) && i >= 0 && (str = this.LJIIIIZZ.get(Integer.valueOf(i))) != null) {
            if ((this.LJIILJJIL || this.LJIILIIL.contains(str)) && this.LIZLLL.contains(Integer.valueOf(i))) {
                Runnable runnableRemove = this.LJIIJ.remove(Integer.valueOf(i));
                if (runnableRemove != null) {
                    this.LJIILL.removeCallbacks(runnableRemove);
                }
                AtomicInteger atomicInteger = this.LJIIIZ.get(Integer.valueOf(i));
                if (atomicInteger != null) {
                    atomicInteger.set(0);
                    ConcurrentHashMap<Integer, AtomicInteger> concurrentHashMap = this.LJIIIZ;
                    Integer numValueOf = Integer.valueOf(i);
                    if (Build.VERSION.SDK_INT >= 24) {
                        concurrentHashMap.remove(numValueOf, atomicInteger);
                    } else {
                        ReentrantLock reentrantLock = new ReentrantLock();
                        ConcurrentHashMap<Object, ReentrantLock> concurrentHashMap2 = C0P8U.LIZ;
                        ReentrantLock reentrantLockPutIfAbsent = concurrentHashMap2.putIfAbsent(numValueOf, reentrantLock);
                        if (reentrantLockPutIfAbsent != null) {
                            reentrantLock = reentrantLockPutIfAbsent;
                        }
                        try {
                            reentrantLock.lock();
                            if (Intrinsics.LJFF(concurrentHashMap.get(numValueOf), atomicInteger)) {
                                concurrentHashMap.remove(numValueOf);
                            }
                            reentrantLock.unlock();
                            concurrentHashMap2.remove(numValueOf);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            reentrantLock.unlock();
                            C0P8U.LIZ.remove(numValueOf);
                            throw th;
                        }
                    }
                }
                LJIIIZ(i);
            }
        }
    }

    public final void LJFF(int i) {
        if (this.LIZ || this.LJIIJJI.contains(Integer.valueOf(i)) || i < 0) {
            return;
        }
        String str = this.LJIIIIZZ.get(Integer.valueOf(i));
        if (!this.LJ) {
            if (str != null) {
                if (this.LJIILJJIL || this.LJIILIIL.contains(str)) {
                    this.LJIIZILJ.addIfAbsent(Integer.valueOf(i));
                    return;
                }
                return;
            }
            return;
        }
        if (str != null) {
            if ((this.LJIILJJIL || this.LJIILIIL.contains(str)) && this.LIZLLL.contains(Integer.valueOf(i))) {
                ConcurrentHashMap<Integer, AtomicInteger> concurrentHashMap = this.LJIIIZ;
                Integer numValueOf = Integer.valueOf(i);
                AtomicInteger atomicInteger = new AtomicInteger(0);
                AtomicInteger atomicIntegerPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, atomicInteger);
                if (atomicIntegerPutIfAbsent != null) {
                    atomicInteger = atomicIntegerPutIfAbsent;
                }
                atomicInteger.incrementAndGet();
                ARunnableS21S0101000_10 aRunnableS21S0101000_10 = new ARunnableS21S0101000_10(i, this, 7);
                Runnable runnableRemove = this.LJIIJ.remove(Integer.valueOf(i));
                if (runnableRemove != null) {
                    this.LJIILL.removeCallbacks(runnableRemove);
                }
                C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, this.LJIILL, aRunnableS21S0101000_10);
                this.LJIIJ.put(Integer.valueOf(i), aRunnableS21S0101000_10);
            }
        }
    }

    public final void LJI(C0PG5 c0pg5) {
        if (this.LIZ) {
            return;
        }
        this.LJIILL.removeCallbacks(this.LJIILLIIL);
        this.LIZ = true;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C640640PAw(this, this.LIZIZ, this.LJ, LJ(), c0pg5, 20000L, null), 3);
        this.LJIIIZ.clear();
        Iterator<T> it2 = this.LJIIJ.values().iterator();
        while (it2.hasNext()) {
            this.LJIILL.removeCallbacks((Runnable) it2.next());
        }
        this.LJIIJ.clear();
    }

    public final void LJIIIZ(int i) {
        String str;
        if (!this.LIZ && !this.LJIIJJI.contains(Integer.valueOf(i)) && i >= 0 && (str = this.LJIIIIZZ.get(Integer.valueOf(i))) != null) {
            if (!this.LJIILJJIL && !this.LJIILIIL.contains(str)) {
                return;
            }
            if (!this.LJ) {
                this.LJIJI.addIfAbsent(new C639280P5q(i));
            } else if (this.LIZLLL.contains(Integer.valueOf(i)) && this.LJI.putIfAbsent(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis())) == null) {
                this.LJII.remove(Integer.valueOf(i));
                LIZ();
            }
        }
    }

    public final void LJIIIIZZ(int i, long j) {
        String str;
        if (!this.LIZ && !this.LJIIJJI.contains(Integer.valueOf(i)) && i >= 0 && (str = this.LJIIIIZZ.get(Integer.valueOf(i))) != null) {
            if (!this.LJIILJJIL && !this.LJIILIIL.contains(str)) {
                return;
            }
            if (!this.LJ) {
                this.LJIJ.addIfAbsent(new C0P5Z(i, j));
            } else {
                this.LJFF.put(Integer.valueOf(i), Long.valueOf(j));
            }
        }
    }

    public final void LJIIJ(int i, String str) {
        if (this.LIZ) {
            return;
        }
        if (this.LJIIL.contains(str)) {
            this.LJIIIIZZ.remove(Integer.valueOf(i));
            return;
        }
        if (!Intrinsics.LJFF(this.LJIIIIZZ.get(Integer.valueOf(i)), str)) {
            this.LJIIIIZZ.put(Integer.valueOf(i), str);
            if (this.LJ && this.LIZLLL.contains(Integer.valueOf(i))) {
                LJII();
                LJIIL();
            }
        }
    }

    public final void LIZLLL(long j, C0PG5 c0pg5, List<Integer> list, int i) throws JSONException {
        Object jSONArray;
        int i2;
        int i3;
        boolean z;
        long jLongValue;
        long jLongValue2;
        boolean zContains;
        long jLongValue3;
        long jLongValue4;
        Long l;
        Long l2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, c0pg5.name());
        jSONObject.put("total_load_time_ms", j);
        jSONObject.put("global_start_time", this.LIZIZ);
        jSONObject.put("finish_time", System.currentTimeMillis());
        jSONObject.put("is_first_screen_determined", this.LJ);
        jSONObject.put("total_first_screen_items", this.LIZLLL.size());
        if (this.LJIILJJIL) {
            jSONArray = "all";
        } else {
            jSONArray = new JSONArray((Collection) this.LJIILIIL);
        }
        jSONObject.put("tracked_types", jSONArray);
        jSONObject.put("tracked_items_count", list.size());
        if (list.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<Integer> it2 = list.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if (this.LJI.containsKey(Integer.valueOf(it2.next().intValue())) && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        jSONObject.put("success_tracked_items", i2);
        if (list.isEmpty()) {
            i3 = 0;
        } else {
            Iterator<Integer> it3 = list.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                if (this.LJII.contains(Integer.valueOf(it3.next().intValue())) && (i3 = i3 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        jSONObject.put("failed_tracked_items", i3);
        if ((c0pg5 == C0PG5.SUCCESS || c0pg5 == C0PG5.PARTIAL_FAIL) && i > 0) {
            long j2 = i;
            if (j > j2) {
                jSONObject.put("e2e_gap_ms", j - j2);
                jSONObject.put("e2e_cost", i);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        for (Integer num : this.LIZLLL) {
            String str = this.LJIIIIZZ.get(num);
            if (str == null) {
                str = "unknown";
            }
            if (!this.LJIILJJIL && !this.LJIILIIL.contains(str)) {
                z = false;
            } else {
                z = true;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("position", num.intValue());
            jSONObject2.put("view_holder_type", str);
            jSONObject2.put("is_tracked", z);
            long j3 = 0;
            if (z && (l2 = this.LJFF.get(num)) != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            jSONObject2.put("bind_start_time", jLongValue);
            if (z && (l = this.LJI.get(num)) != null) {
                jLongValue2 = l.longValue();
            } else {
                jLongValue2 = 0;
            }
            jSONObject2.put("load_finish_time", jLongValue2);
            if (z) {
                zContains = this.LJII.contains(num);
            } else {
                zContains = false;
            }
            jSONObject2.put("is_failed", zContains);
            if (z) {
                Long l3 = this.LJFF.get(num);
                if (l3 != null) {
                    jLongValue3 = l3.longValue();
                } else {
                    jLongValue3 = 0;
                }
                Long l4 = this.LJI.get(num);
                if (l4 != null) {
                    jLongValue4 = l4.longValue();
                } else {
                    jLongValue4 = 0;
                }
                if (jLongValue3 > 0 && jLongValue4 > 0) {
                    j3 = jLongValue4 - jLongValue3;
                }
                jSONObject2.put("item_load_duration_ms", j3);
            } else {
                jSONObject2.put("item_load_duration_ms", 0L);
                jSONObject2.put("exclude_reason", "not in tracked types");
            }
            jSONArray2.put(jSONObject2);
        }
        jSONObject.put("first_screen_items", jSONArray2);
        AppLogNewUtils.onEventV3("search_lcp_monitor", jSONObject);
    }
}
