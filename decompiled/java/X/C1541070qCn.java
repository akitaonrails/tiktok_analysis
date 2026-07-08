package X;

import X.InterfaceC1541240qD4;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS56S0300000_23;
import Y.ARunnableS92S0200000_23;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS107S1000000_23;
import kotlin.jvm.internal.AwS12S1010000_23;
import kotlin.jvm.internal.AwS211S0000000_23;
import kotlin.jvm.internal.AwS37S0000100_23;
import kotlin.jvm.internal.AwS43S0600000_23;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.AwS637S0100000_23;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qCn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541070qCn<Input, Output extends InterfaceC1541240qD4> {
    public static final C1541250qD5 LJIILIIL = new InterfaceC1541240qD4() { // from class: X.0qD5
        @Override // X.InterfaceC1541240qD4, X.InterfaceC1541260qD6
        public final boolean LIZ(C1540930qCZ c1540930qCZ) {
            return true;
        }

        @Override // X.InterfaceC1541260qD6
        public final boolean LIZJ(C1540930qCZ c1540930qCZ) {
            return true;
        }

        @Override // X.InterfaceC1541240qD4
        public final boolean isSuccess() {
            return false;
        }
    };
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final EnumC1533170q03 LJFF;
    public final boolean LJI;
    public int LJII;
    public final InterfaceC1541110qCr<Input, Output> LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final C1541090qCp<Output> LJIIJJI;
    public final AtomicLong LJIIL;

    public final C1535940q4W LJ() {
        return new C1535940q4W(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
    }

    public final void LJI() throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LJIIL.get() < Mp4ScreenVideoLoadTimeout.CONTROL) {
            return;
        }
        this.LJIIL.set(jCurrentTimeMillis);
        int i = this.LJIIJJI.LJ;
        if (i == 0) {
            return;
        }
        this.LJIIJJI.LIZ(new C1541120qCs(jCurrentTimeMillis, this));
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        int i2 = this.LJIIJJI.LJ;
        int i3 = i - i2;
        int i4 = this.LJII;
        if (i4 > 0) {
            int i5 = i4 / 3;
            if (i5 < 10) {
                i5 = 10;
            }
            this.LJII = i5;
        }
        if (i3 > 0 || i > 5) {
            C1541090qCp<Output> c1541090qCp = this.LJIIJJI;
            int i6 = c1541090qCp.LIZ / 2;
            c1541090qCp.LIZ = i6 >= 10 ? i6 : 10;
            InterfaceC1532860pzY.LIZ.getClass();
            InterfaceC1532860pzY interfaceC1532860pzY = C1532910pzd.LIZJ;
            if (interfaceC1532860pzY != null) {
                JSONObject jSONObjectPut = new JSONObject().put("type", "strict").put("service", this.LIZ);
                JSONObject jSONObjectPut2 = new JSONObject().put("duration", jCurrentTimeMillis2 - jCurrentTimeMillis);
                InterfaceC1532860pzY interfaceC1532860pzY2 = C1532910pzd.LIZJ;
                interfaceC1532860pzY.LJIIJJI(jSONObjectPut, jSONObjectPut2.put("app_life_time", jCurrentTimeMillis - (interfaceC1532860pzY2 != null ? interfaceC1532860pzY2.getAppStartTime() : 0L)).put("before_size", i).put("after_size", i2).put("trim_size", i3));
            }
        }
    }

    public final void LJII() throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LJIIL.get() < 15000) {
            return;
        }
        this.LJIIL.set(jCurrentTimeMillis);
        C1532390pyn c1532390pyn = new C1532390pyn(this.LJIIJJI.LJ, new AwS37S0000100_23(jCurrentTimeMillis, 1));
        this.LJIIJJI.LIZ(new AwS637S0100000_23(c1532390pyn, (C1532390pyn<Pair<C1540930qCZ, AbstractC1541140qCu<?>>>) 7));
        int i = c1532390pyn.LIZJ;
        int i2 = this.LJII;
        if (i2 <= 0 || i >= i2) {
            Object objLIZIZ = c1532390pyn.LIZIZ();
            while (true) {
                Pair pair = (Pair) objLIZIZ;
                if (pair == null) {
                    break;
                }
                C1540930qCZ c1540930qCZ = (C1540930qCZ) pair.getFirst();
                AbstractC1541140qCu abstractC1541140qCu = (AbstractC1541140qCu) pair.getSecond();
                Long l = abstractC1541140qCu.LIZIZ;
                if (jCurrentTimeMillis - (l != null ? l.longValue() : jCurrentTimeMillis) >= 60000) {
                    if (abstractC1541140qCu instanceof C1541080qCo) {
                        C1541080qCo<Output> c1541080qCo = (C1541080qCo) abstractC1541140qCu;
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        if (c1541080qCo.LJFF <= 3) {
                            Long l2 = c1541080qCo.LJ;
                            if (jCurrentTimeMillis2 - (l2 != null ? l2.longValue() : jCurrentTimeMillis2) >= 15000 || !c1541080qCo.LJ()) {
                                if (c1541080qCo.LIZ.LIZ) {
                                    i--;
                                    c1541080qCo.LJII(EnumC1541150qCv.MEMORY_PRESSURE);
                                } else {
                                    int i3 = c1541080qCo.LJIILLIIL.LIZ.get();
                                    if (i3 >= 0 && ((i3 & 65280) >> 8) == 250 && this.LJIIIIZZ.LJI(c1541080qCo)) {
                                        i--;
                                        c1541080qCo.LJIIIZ(EnumC1541150qCv.MEMORY_PRESSURE);
                                    }
                                }
                            }
                        }
                        objLIZIZ = c1532390pyn.LIZIZ();
                    } else if ((abstractC1541140qCu instanceof C1541180qCy) && !abstractC1541140qCu.LJ()) {
                        i--;
                        this.LJIIJJI.LIZJ(c1540930qCZ, abstractC1541140qCu, EnumC1541150qCv.EXPIRED);
                    }
                    int i4 = this.LJII;
                    if ((i4 > 0 && i < i4) || abstractC1541140qCu.LIZLLL(System.currentTimeMillis()) >= 1000) {
                        break;
                    } else {
                        objLIZIZ = c1532390pyn.LIZIZ();
                    }
                } else {
                    objLIZIZ = c1532390pyn.LIZIZ();
                }
            }
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            int i5 = this.LJIIJJI.LJ;
            int i6 = i - i5;
            int i7 = this.LJII;
            if (i7 > 0) {
                int i8 = (i7 * 2) / 3;
                if (i8 < 10) {
                    i8 = 10;
                }
                this.LJII = i8;
            }
            if (i6 > 0 || i > 5) {
                InterfaceC1532860pzY.LIZ.getClass();
                InterfaceC1532860pzY interfaceC1532860pzY = C1532910pzd.LIZJ;
                if (interfaceC1532860pzY != null) {
                    JSONObject jSONObjectPut = new JSONObject().put("type", "loosely").put("service", this.LIZ);
                    JSONObject jSONObjectPut2 = new JSONObject().put("duration", jCurrentTimeMillis3 - jCurrentTimeMillis);
                    InterfaceC1532860pzY interfaceC1532860pzY2 = C1532910pzd.LIZJ;
                    interfaceC1532860pzY.LJIIJJI(jSONObjectPut, jSONObjectPut2.put("app_life_time", jCurrentTimeMillis - (interfaceC1532860pzY2 != null ? interfaceC1532860pzY2.getAppStartTime() : 0L)).put("before_size", i).put("after_size", i5).put("trim_size", i6));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [T, Y.ARunnableS92S0200000_23] */
    /* JADX WARN: Type inference failed for: r4v11, types: [T, Y.ARunnableS92S0200000_23] */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, Y.ARunnableS56S0300000_23] */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, Y.ARunnableS92S0200000_23] */
    public final void LIZLLL(C1541080qCo<Output> c1541080qCo) {
        boolean z;
        EnumC1529850puh enumC1529850puhLIZ;
        ConcurrentHashMap<C1540930qCZ, WeakReference<C1541080qCo<?>>> concurrentHashMap;
        C1541090qCp<Output> c1541090qCp = this.LJIIJJI;
        if (c1541090qCp.LJ >= c1541090qCp.LIZ) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.LJII > 0) {
                C1532960pzi.LJ(new AwS567S0100000_23(this, (C1541070qCn<Object, InterfaceC1541240qD4>) 142));
            }
            C1541020qCi c1541020qCi = c1541080qCo.LIZ.LJIIIZ;
            if (c1541020qCi != null) {
                c1541020qCi.LJI++;
            }
            c1541080qCo.LJIILJJIL(-6);
            C1532930pzf.LIZJ.LIZJ(new AwS211S0000000_23(0));
            this.LJIIIIZZ.LIZ(c1541080qCo, "cache pool already full");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Function1<? super Output, Unit> function1 = c1541080qCo.LJII;
        c1541080qCo.LJII = null;
        C1540930qCZ c1540930qCZ = c1541080qCo.LIZ;
        C1535940q4W c1535940q4W = c1540930qCZ.LIZJ;
        if (c1535940q4W == null) {
            return;
        }
        InterfaceC1541060qCm interfaceC1541060qCm = c1540930qCZ.LIZLLL;
        String string = interfaceC1541060qCm.toString();
        InterfaceC1531740pxk interfaceC1531740pxk = C1531760pxm.LIZ;
        if (interfaceC1531740pxk != null) {
            enumC1529850puhLIZ = interfaceC1531740pxk.LIZ();
        } else {
            enumC1529850puhLIZ = null;
        }
        if (enumC1529850puhLIZ == EnumC1529850puh.STRESSFUL) {
            C1541020qCi c1541020qCi2 = c1541080qCo.LIZ.LJIIIZ;
            if (c1541020qCi2 != null) {
                c1541020qCi2.LJI++;
            }
            c1541080qCo.LJIILJJIL(-5);
            C1532930pzf.LIZJ.LIZJ(new AwS107S1000000_23(string, 18));
            this.LJIIIIZZ.LIZ(c1541080qCo, "cpu is stressful");
            return;
        }
        C1540860qCS c1540860qCSLJIIJ = c1541080qCo.LJIIJ();
        if (c1540860qCSLJIIJ != null) {
            if (c1540860qCSLJIIJ.LJFF) {
                c1541080qCo.LJIILJJIL(-4);
                C1532930pzf.LIZJ.LIZJ(new AwS107S1000000_23(string, 21));
                this.LJIIIIZZ.LIZ(c1541080qCo, "prefetch group destroyed");
                return;
            } else {
                C1541020qCi c1541020qCi3 = c1541080qCo.LIZ.LJIIIZ;
                if (c1541020qCi3 != null) {
                    c1541020qCi3.LIZIZ++;
                }
            }
        } else {
            c1540860qCSLJIIJ = null;
        }
        C1532930pzf.LIZJ.LIZJ(new AwS107S1000000_23(string, 19));
        C259800zU c259800zU = new C259800zU();
        c1541080qCo.LJIIL.LJ(jCurrentTimeMillis, "executing");
        AbstractC1541130qCt abstractC1541130qCt = c1541080qCo.LJIIIZ;
        AbstractC1541130qCt abstractC1541130qCtLJIIIZ = abstractC1541130qCt;
        if (abstractC1541130qCt == null) {
            abstractC1541130qCtLJIIIZ = this.LJIIIIZZ.LJIIIZ(interfaceC1541060qCm, c1541080qCo, null);
        }
        c1541080qCo.LJIIIZ = abstractC1541130qCtLJIIIZ;
        abstractC1541130qCtLJIIIZ.LIZIZ = new AwS43S0600000_23((C1541080qCo) c1541080qCo, c1535940q4W, (C1535940q4W) c1540930qCZ, (C1540930qCZ) this, (Function1) function1, c259800zU, (C259800zU<Runnable>) 1);
        c1541080qCo.LJIIL.LIZJ("caching");
        while (true) {
            c259800zU.element = null;
            AbstractC1541140qCu<V> abstractC1541140qCuLIZIZ = this.LJIIJJI.LIZIZ(c1540930qCZ, c1541080qCo, c1535940q4W.LJFF, false);
            if (abstractC1541140qCuLIZIZ == C1541090qCp.LJFF) {
                if (this.LJII > 0) {
                    C1532960pzi.LJ(new AwS567S0100000_23(this, (C1541070qCn<Object, InterfaceC1541240qD4>) 143));
                }
                C1541020qCi c1541020qCi4 = c1541080qCo.LIZ.LJIIIZ;
                if (c1541020qCi4 != null) {
                    c1541020qCi4.LJI++;
                }
                c1541080qCo.LJIILJJIL(-6);
                C1532930pzf.LIZJ.LIZJ(new AwS211S0000000_23(1));
                this.LJIIIIZZ.LIZ(c1541080qCo, "cache pool already full");
                return;
            }
            if (abstractC1541140qCuLIZIZ != 0) {
                C1535940q4W c1535940q4W2 = c1540930qCZ.LJIIIIZZ;
                if (c1535940q4W2 == null) {
                    C1532760pzO.LIZJ(C1532930pzf.LIZJ, "PrefetchService", "prefetch", "cannot get matched config", null, null, 48);
                    return;
                }
                if (abstractC1541140qCuLIZIZ instanceof C1541180qCy) {
                    C1541180qCy c1541180qCy = (C1541180qCy) abstractC1541140qCuLIZIZ;
                    if (c1541180qCy.LJ() && (c1541180qCy.LJI.isSuccess() || !c1535940q4W2.LIZIZ)) {
                        c259800zU.element = new ARunnableS56S0300000_23(this, new WeakReference(c1541180qCy), c1535940q4W2, 14);
                        AbstractC1541130qCt<? extends AbstractC1541130qCt<?>> abstractC1541130qCt2 = c1541080qCo.LJIIIZ;
                        if (abstractC1541130qCt2 != null && abstractC1541130qCt2.LJFF(c1541180qCy.LJI)) {
                            c1541080qCo.LIZ.LJI = c1541180qCy.LIZ.LIZIZ;
                            c1541080qCo.LJIILIIL = 1;
                            return;
                        }
                    }
                    this.LJIIJJI.LIZJ(c1540930qCZ, abstractC1541140qCuLIZIZ, EnumC1541150qCv.EXPIRED);
                } else {
                    C1541080qCo c1541080qCo2 = (C1541080qCo) abstractC1541140qCuLIZIZ;
                    if (c1540860qCSLJIIJ != null) {
                        if (c1541080qCo2.LIZ.LIZ() == c1540860qCSLJIIJ) {
                            C1541020qCi c1541020qCi5 = c1541080qCo.LIZ.LJIIIZ;
                            if (c1541020qCi5 != null) {
                                c1541020qCi5.LJ++;
                            }
                            c1541080qCo.LJIILJJIL(-2);
                            this.LJIIIIZZ.LIZ(c1541080qCo, "a same task already executing");
                            return;
                        }
                        ConcurrentHashMap<C1540930qCZ, WeakReference<C1541080qCo<?>>> concurrentHashMap2 = c1540860qCSLJIIJ.LJ;
                        if (concurrentHashMap2 != null && concurrentHashMap2.containsKey(c1541080qCo.LIZ)) {
                            C1541020qCi c1541020qCi6 = c1541080qCo.LIZ.LJIIIZ;
                            if (c1541020qCi6 != null) {
                                c1541020qCi6.LJ++;
                            }
                            c1541080qCo.LJIILJJIL(-2);
                            this.LJIIIIZZ.LIZ(c1541080qCo, "a same task already executing");
                            return;
                        }
                    }
                    C1540930qCZ c1540930qCZ2 = c1541080qCo2.LIZ;
                    AtomicBoolean atomicBoolean = c1540930qCZ2.LJII;
                    if (atomicBoolean != null) {
                        if (atomicBoolean.get()) {
                            c1541080qCo2.LJIIIZ(EnumC1541150qCv.CONSUMED);
                        } else {
                            C1532930pzf.LIZJ.LIZJ(new AwS107S1000000_23(string, 20));
                            c1541080qCo.LJIILJJIL(-3);
                            this.LJIIIIZZ.LIZ(c1541080qCo, "cached request is only_once and not_used, rejected");
                            return;
                        }
                    } else {
                        if (this.LJII <= 0) {
                            if (this.LJIIIIZZ.LIZLLL(c1540930qCZ2.LIZLLL, interfaceC1541060qCm)) {
                                C1541020qCi c1541020qCi7 = c1541080qCo.LIZ.LJIIIZ;
                                if (c1541020qCi7 != null) {
                                    c1541020qCi7.LJ++;
                                }
                                c1541080qCo.LJIILJJIL(-2);
                                this.LJIIIIZZ.LIZ(c1541080qCo, "a same task already executing");
                                return;
                            }
                            c259800zU.element = new ARunnableS92S0200000_23(c1535940q4W2, new WeakReference(c1541080qCo2), 69);
                        } else if (!c1541080qCo2.LJ()) {
                            c1541080qCo2.LJIIIZ(EnumC1541150qCv.EXPIRED);
                            C1532930pzf.LIZJ.LIZJ(new AwS107S1000000_23(string, 16));
                        } else {
                            if (this.LJIIIIZZ.LIZLLL(c1541080qCo2.LIZ.LIZLLL, interfaceC1541060qCm)) {
                                C1541020qCi c1541020qCi8 = c1541080qCo.LIZ.LJIIIZ;
                                if (c1541020qCi8 != null) {
                                    c1541020qCi8.LJ++;
                                }
                                c1541080qCo.LJIILJJIL(-2);
                                this.LJIIIIZZ.LIZ(c1541080qCo, "a same task already executing");
                                return;
                            }
                            c259800zU.element = new ARunnableS92S0200000_23(c1535940q4W2, new WeakReference(c1541080qCo2), 70);
                        }
                        C1532930pzf c1532930pzf = C1532930pzf.LIZJ;
                        c1532930pzf.LIZJ(new AwS107S1000000_23(string, 17));
                        boolean zLJIIL = c1541080qCo2.LJIIL(c1541080qCo);
                        c1532930pzf.LIZJ(new AwS12S1010000_23(string, zLJIIL, 0));
                        if (!zLJIIL) {
                            c1541080qCo.LJIILIIL = null;
                            if (!this.LJI) {
                                c1541080qCo2.LJIIIZ(EnumC1541150qCv.CANCELLED_REUSE_FAILED);
                            }
                        } else {
                            return;
                        }
                    }
                }
            } else {
                if (c1540860qCSLJIIJ != null && !c1540860qCSLJIIJ.LJFF && (concurrentHashMap = c1540860qCSLJIIJ.LJ) != null && concurrentHashMap.putIfAbsent(c1541080qCo.LIZ, new WeakReference<>(c1541080qCo)) != null) {
                    C1535940q4W c1535940q4W3 = c1541080qCo.LIZ.LIZJ;
                    if (c1535940q4W3 != null) {
                        c1535940q4W3.LJ = EnumC1533170q03.REMOVE_ON_CONSUME;
                    }
                    if (c1541080qCo.LJIILLIIL.LIZ(0)) {
                        c1541080qCo.LJIIL.LIZ();
                        c1541080qCo.LJIIIIZZ.LJIIJJI.LIZJ(c1541080qCo.LIZ, c1541080qCo, EnumC1541150qCv.CANCELLED_RECORDED);
                        C1541020qCi c1541020qCi9 = c1541080qCo.LIZ.LJIIIZ;
                        if (c1541020qCi9 != null) {
                            c1541020qCi9.LJ++;
                        }
                        c1541080qCo.LJIILJJIL(-2);
                        this.LJIIIIZZ.LIZ(c1541080qCo, "a same task already executing");
                        return;
                    }
                }
                if (this.LJII > 0 && this.LJIIJJI.LJ > this.LJII) {
                    C1532960pzi.LJ(new AwS567S0100000_23(this, (C1541070qCn<Object, InterfaceC1541240qD4>) 140));
                }
                c259800zU.element = null;
                if (this.LJII <= 0) {
                    c259800zU.element = new ARunnableS92S0200000_23(c1535940q4W, new WeakReference(c1541080qCo), 71);
                }
                c1541080qCo.LJIILLIIL.LIZJ(1);
                c1541080qCo.LJIILIIL();
                return;
            }
        }
    }

    public final void LJIIIIZZ(boolean z) {
        Object c098200Yq;
        try {
            c098200Yq = Long.valueOf(this.LJIIL.get());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Long l = (Long) c098200Yq;
        if (l != null) {
            long jLongValue = l.longValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - jLongValue < 20000) {
                if (z && this.LJII > 0) {
                    C1532960pzi.LIZJ(80000L, new ARunnableS123S0100000_23(this, 113));
                    return;
                }
                return;
            }
            if (!this.LJIIL.compareAndSet(jLongValue, jCurrentTimeMillis)) {
                if (z && this.LJII > 0) {
                    C1532960pzi.LIZJ(80000L, new ARunnableS123S0100000_23(this, 109));
                    return;
                }
                return;
            }
            this.LJIIJJI.LIZ(new AwS637S0100000_23(this, 6));
            if (z && this.LJII > 0) {
                C1532960pzi.LIZJ(80000L, new ARunnableS123S0100000_23(this, 110));
                return;
            }
            return;
        }
        C1532760pzO.LIZJ(C1532930pzf.LIZJ, "PrefetchService", "trimStaleCache", "cannot get timestamp", null, null, 48);
    }

    public final C1541080qCo<Output> LIZJ(Input input, String str, C1535940q4W c1535940q4W, Function1<? super Output, Unit> function1) {
        C1535940q4W c1535940q4W2 = c1535940q4W;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1532930pzf c1532930pzf = C1532930pzf.LIZJ;
        c1532930pzf.LIZLLL(AFwS212S0000000_23.get$arr$(162));
        InterfaceC1541060qCm interfaceC1541060qCmLJ = this.LJIIIIZZ.LJ(input, true);
        if (interfaceC1541060qCmLJ == null) {
            c1532930pzf.LIZIZ("PrefetchService", "prefetch", "failed to generate identifier");
            return null;
        }
        C08AB c08ab = c1535940q4W2.LJI;
        C1535940q4W c1535940q4WLJFF = this.LJIIIIZZ.LJFF(input, interfaceC1541060qCmLJ, c1535940q4W2);
        if (c1535940q4WLJFF != null) {
            c1535940q4W2 = c1535940q4WLJFF;
        }
        c1535940q4W2.LJI = c08ab;
        C1541080qCo<Output> c1541080qCo = new C1541080qCo<>(Long.MAX_VALUE, function1, this, new C1540930qCZ(true, str, c1535940q4W2, interfaceC1541060qCmLJ, this));
        c1541080qCo.LJIIL.LJ(jCurrentTimeMillis, "preparing");
        c1541080qCo.LJIIL.LIZLLL();
        this.LJIIIIZZ.LJII(interfaceC1541060qCmLJ, c1541080qCo);
        return c1541080qCo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1541080qCo LJFF(Object obj, String str, C1535940q4W c1535940q4W, Function1 function1) {
        C1541080qCo<Output> c1541080qCoLIZJ = LIZJ(obj, str, c1535940q4W, function1);
        if (c1541080qCoLIZJ == null) {
            return null;
        }
        c1541080qCoLIZJ.execute();
        return c1541080qCoLIZJ;
    }

    public final C1541080qCo<Output> LIZ(Input input, String str, Long l, C1535940q4W c1535940q4W, Function1<? super Output, Unit> function1) {
        C1535940q4W c1535940q4W2 = c1535940q4W;
        C1532930pzf c1532930pzf = C1532930pzf.LIZJ;
        c1532930pzf.LIZLLL(AFwS212S0000000_23.get$arr$(161));
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC1541060qCm interfaceC1541060qCmLJ = this.LJIIIIZZ.LJ(input, false);
        C08AB c08ab = null;
        if (interfaceC1541060qCmLJ == null) {
            c1532930pzf.LIZIZ("PrefetchService", "createFetchTask", "failed to generate identifier");
            return null;
        }
        if (c1535940q4W2 != null) {
            c08ab = c1535940q4W2.LJI;
        }
        C1535940q4W c1535940q4WLJFF = this.LJIIIIZZ.LJFF(input, interfaceC1541060qCmLJ, c1535940q4W2);
        if (c1535940q4WLJFF == null) {
            if (c1535940q4W2 != null) {
            }
            C1541080qCo<Output> c1541080qCo = new C1541080qCo<>(l, function1, this, new C1540930qCZ(false, str, c1535940q4W2, interfaceC1541060qCmLJ, this));
            c1541080qCo.LJIIL.LJ(jCurrentTimeMillis, "preparing");
            c1541080qCo.LJIIL.LIZLLL();
            this.LJIIIIZZ.LJII(interfaceC1541060qCmLJ, c1541080qCo);
            return c1541080qCo;
        }
        c1535940q4W2 = c1535940q4WLJFF;
        c1535940q4W2.LJI = c08ab;
        C1541080qCo<Output> c1541080qCo2 = new C1541080qCo<>(l, function1, this, new C1540930qCZ(false, str, c1535940q4W2, interfaceC1541060qCmLJ, this));
        c1541080qCo2.LJIIL.LJ(jCurrentTimeMillis, "preparing");
        c1541080qCo2.LJIIL.LIZLLL();
        this.LJIIIIZZ.LJII(interfaceC1541060qCmLJ, c1541080qCo2);
        return c1541080qCo2;
    }

    public static /* synthetic */ C1541080qCo LIZIZ(C1541070qCn c1541070qCn, InterfaceC1541060qCm interfaceC1541060qCm, String str, C1535940q4W c1535940q4W, Function1 function1, int i) {
        C1535940q4W c1535940q4W2 = c1535940q4W;
        if ((i & 8) != 0) {
            c1535940q4W2 = null;
        }
        return c1541070qCn.LIZ(interfaceC1541060qCm, str, null, c1535940q4W2, function1);
    }

    public C1541070qCn(String str, boolean z, long j, long j2, EnumC1533170q03 enumC1533170q03, boolean z2, int i, int i2, InterfaceC1541110qCr interfaceC1541110qCr) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = false;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = enumC1533170q03;
        this.LJI = z2;
        this.LJII = i;
        this.LJIIIIZZ = interfaceC1541110qCr;
        this.LJIIIZ = i;
        this.LJIIJ = i2;
        this.LJIIJJI = new C1541090qCp<>(z2, i2, interfaceC1541110qCr);
        this.LJIIL = new AtomicLong(System.currentTimeMillis());
        if (this.LJII > 0) {
            C1532960pzi.LIZJ(80000L, new ARunnableS123S0100000_23(this, 108));
        }
    }

    public /* synthetic */ C1541070qCn(String str, boolean z, long j, long j2, EnumC1533170q03 enumC1533170q03, int i, int i2, InterfaceC1541110qCr interfaceC1541110qCr, int i3) {
        this(str, z, j, j2, enumC1533170q03, false, (i3 & 128) != 0 ? 35 : i, (i3 & 256) != 0 ? 80 : i2, interfaceC1541110qCr);
    }
}
