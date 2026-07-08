package X;

import Y.ARunnableS9S1000000_16;
import com.bytedance.forest.experiments.ForestExperiment;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0q1Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534110q1Z {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final File LIZJ;
    public volatile boolean LIZLLL;
    public long LJ;
    public C1534320q1u<C1534110q1Z> LJFF;
    public Map<String, String> LJI;
    public WeakReference<C1534000q1O> LJII;
    public WeakReference<Map<String, String>> LJIIIIZZ;

    public C1534110q1Z() {
        throw null;
    }

    public final boolean LIZ() {
        C1534000q1O c1534000q1O;
        if (!this.LIZLLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(" is not valid");
            C1534250q1n.LIZIZ("ResponseCache", C2188811AlT.LIZIZ(sbLIZ), null);
            return false;
        }
        WeakReference<C1534000q1O> weakReference = this.LJII;
        if (weakReference != null && (c1534000q1O = weakReference.get()) != null) {
            if (c1534000q1O.LIZIZ()) {
                return true;
            }
            this.LJII = null;
        }
        if (this.LIZJ.isFile()) {
            return this.LIZLLL;
        }
        Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
        C1533480q0Y.LIZJ("ResponseCache", null, null, Boolean.TRUE, "cache is corrupted", this.LIZ, this.LIZJ.getAbsolutePath(), null, null, null, null, 7814);
        this.LIZLLL = false;
        return false;
    }

    public final boolean LIZLLL() {
        C1534000q1O c1534000q1O;
        C1534010q1P c1534010q1PLIZLLL;
        WeakReference<C1534000q1O> weakReference = this.LJII;
        return this.LIZLLL && !(weakReference != null && (c1534000q1O = weakReference.get()) != null && (c1534010q1PLIZLLL = c1534000q1O.LIZLLL()) != null && c1534010q1PLIZLLL.LJI() && !c1534010q1PLIZLLL.LJJJJJ()) && System.currentTimeMillis() > this.LJ;
    }

    public final Map<String, String> LJ() {
        Map<String, String> map;
        Map<String, String> map2;
        Map<String, String> mapLIZJ = null;
        if (!LIZ()) {
            return null;
        }
        WeakReference<Map<String, String>> weakReference = this.LJIIIIZZ;
        if (weakReference != null && (map2 = weakReference.get()) != null) {
            return map2;
        }
        synchronized (this.LIZIZ) {
            try {
                WeakReference<Map<String, String>> weakReference2 = this.LJIIIIZZ;
                if (weakReference2 == null || (map = weakReference2.get()) == null) {
                    Keva keva = C1534880q2o.LIZ;
                    String stringJustDisk = C1534880q2o.LIZ.getStringJustDisk(this.LIZIZ, null);
                    if (stringJustDisk != null) {
                        C1529710puT.LIZ.getClass();
                        mapLIZJ = C1529710puT.LIZJ(stringJustDisk);
                        this.LJIIIIZZ = new WeakReference<>(mapLIZJ);
                    }
                } else {
                    mapLIZJ = map;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return mapLIZJ;
    }

    public final C1534000q1O LJFF() {
        C1534000q1O c1534000q1O;
        C1534000q1O c1534000q1O2;
        C1534000q1O c1534000q1O3 = null;
        if (!LIZ()) {
            return null;
        }
        WeakReference<C1534000q1O> weakReference = this.LJII;
        if (weakReference != null && (c1534000q1O2 = weakReference.get()) != null) {
            return c1534000q1O2;
        }
        synchronized (this.LIZJ) {
            try {
                WeakReference<C1534000q1O> weakReference2 = this.LJII;
                if (weakReference2 == null || (c1534000q1O = weakReference2.get()) == null || !c1534000q1O.LIZIZ()) {
                    File file = this.LIZJ;
                    if (file.isFile()) {
                        c1534000q1O3 = new C1534000q1O(new C1528700psq(file));
                        this.LJII = new WeakReference<>(c1534000q1O3);
                    }
                } else {
                    c1534000q1O3 = c1534000q1O;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1534000q1O3;
    }

    public final void LIZIZ(C1534320q1u<C1534110q1Z> c1534320q1u) {
        this.LJFF = c1534320q1u;
        c1534320q1u.LIZ(this);
    }

    public final void LIZJ(boolean z) {
        C1534320q1u<C1534110q1Z> c1534320q1u;
        this.LIZLLL = false;
        if (z && (c1534320q1u = this.LJFF) != null) {
            c1534320q1u.LIZLLL = true;
            C1534730q2Z c1534730q2Z = c1534320q1u.LJ;
            if (c1534730q2Z != null) {
                c1534730q2Z.LIZ();
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[HttpResponseCache] invalidate cache: ");
        sbLIZ.append(this.LIZIZ);
        C1534250q1n.LJII("ResponseCache", C2188811AlT.LIZIZ(sbLIZ), false);
        C1529710puT c1529710puT = C1529710puT.LIZ;
        String str = this.LIZIZ;
        c1529710puT.getClass();
        C1534880q2o.LIZ(str);
        C1534880q2o.LIZ(C1534020q1Q.LIZJ(str));
        C1534880q2o.LIZ(C1534020q1Q.LJFF(str));
    }

    public final void LJI(String str, Map<String, String> map, Map<String, String> map2, C1534000q1O c1534000q1O) {
        this.LJII = new WeakReference<>(c1534000q1O);
        if (str == null) {
            str = this.LIZ;
        }
        C443120HZe c443120HZeLJ = C1534020q1Q.LJ(str, map, map2);
        String str2 = (String) c443120HZeLJ.getFirst();
        Object second = c443120HZeLJ.getSecond();
        long jLongValue = ((Number) c443120HZeLJ.getThird()).longValue();
        this.LJIIIIZZ = new WeakReference<>(second);
        Keva keva = C1534880q2o.LIZ;
        String str3 = this.LIZIZ;
        C1529710puT.LIZ.getClass();
        C1534880q2o.LIZIZ(str3, GsonProtectorUtils.toJson(C1529710puT.LIZJ, second));
        C1534880q2o.LIZIZ(C1534020q1Q.LIZJ(this.LIZIZ), str2);
        this.LJ = jLongValue;
        if (ForestExperiment.INSTANCE.getRemoveMemoryCacheActive()) {
            long jCurrentTimeMillis = this.LJ - System.currentTimeMillis();
            if (jCurrentTimeMillis >= 300000) {
                String str4 = this.LIZ;
                C086F c086f = C086F.LIZ;
                ARunnableS9S1000000_16 aRunnableS9S1000000_16 = new ARunnableS9S1000000_16(str4, 2);
                c086f.getClass();
                C086F.LIZJ(jCurrentTimeMillis, aRunnableS9S1000000_16);
            }
        }
    }

    public C1534110q1Z(String str, String str2, long j, C0VSJ c0vsj, Map map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c0vsj;
        this.LIZLLL = true;
        this.LJ = j;
        this.LJI = map;
    }
}
