package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.AbsABValueOptimizer;
import com.ss.android.ugc.aweme.keva.KevaInfo;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CAe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C309220CAe {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static C309250CAh LIZIZ;
    public static Thread LIZJ;

    public static final boolean LIZLLL() {
        return LIZ.get();
    }

    public static final void LIZIZ(EnumC309240CAg enumC309240CAg, String str) {
        if (!LIZLLL()) {
            return;
        }
        int i = C309230CAf.LIZ[enumC309240CAg.ordinal()];
        C309250CAh c309250CAh = null;
        if (i != 1) {
            if (i == 2) {
                C309250CAh c309250CAh2 = LIZIZ;
                if (c309250CAh2 != null) {
                    c309250CAh = c309250CAh2;
                }
                AbstractC309290CAl abstractC309290CAl = c309250CAh.LIZIZ.get(str);
                if (abstractC309290CAl != null) {
                    abstractC309290CAl.LIZ();
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        C309250CAh c309250CAh3 = LIZIZ;
        if (c309250CAh3 != null) {
            c309250CAh = c309250CAh3;
        }
        AbsABValueOptimizer absABValueOptimizer = c309250CAh.LIZ.get(str);
        if (absABValueOptimizer == null) {
            return;
        }
        absABValueOptimizer.LIZIZ = false;
    }

    public static final void LIZJ(EnumC309240CAg enumC309240CAg, String str) {
        if (!LIZLLL()) {
            return;
        }
        int i = C309230CAf.LIZ[enumC309240CAg.ordinal()];
        C309250CAh c309250CAh = null;
        if (i != 1) {
            if (i == 2) {
                C309250CAh c309250CAh2 = LIZIZ;
                if (c309250CAh2 != null) {
                    c309250CAh = c309250CAh2;
                }
                AbstractC309290CAl abstractC309290CAl = c309250CAh.LIZIZ.get(str);
                if (abstractC309290CAl != null) {
                    if (!abstractC309290CAl.LIZLLL() || ((Boolean) C07OS.LIZ.getValue()).booleanValue()) {
                        abstractC309290CAl.LIZIZ();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        C309250CAh c309250CAh3 = LIZIZ;
        if (c309250CAh3 != null) {
            c309250CAh = c309250CAh3;
        }
        AbsABValueOptimizer absABValueOptimizer = c309250CAh.LIZ.get(str);
        if (absABValueOptimizer == null) {
            return;
        }
        if (absABValueOptimizer.LIZJ() && !((Boolean) C07OS.LIZ.getValue()).booleanValue()) {
            return;
        }
        absABValueOptimizer.LIZIZ = true;
    }

    public static final void LJ(EnumC309240CAg enumC309240CAg, String str) {
        if (!LIZLLL()) {
            return;
        }
        int i = C309230CAf.LIZ[enumC309240CAg.ordinal()];
        C309250CAh c309250CAh = null;
        if (i != 1) {
            if (i == 2) {
                C309250CAh c309250CAh2 = LIZIZ;
                if (c309250CAh2 != null) {
                    c309250CAh = c309250CAh2;
                }
                AbstractC309290CAl abstractC309290CAl = c309250CAh.LIZIZ.get(str);
                if (abstractC309290CAl != null && abstractC309290CAl.LJ.compareAndSet(false, true)) {
                    AbstractC309290CAl.LJI(new C309270CAj(abstractC309290CAl));
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        C309250CAh c309250CAh3 = LIZIZ;
        if (c309250CAh3 != null) {
            c309250CAh = c309250CAh3;
        }
        AbsABValueOptimizer absABValueOptimizer = c309250CAh.LIZ.get(str);
        if (absABValueOptimizer == null || !absABValueOptimizer.LJI.compareAndSet(false, true)) {
            return;
        }
        AbsABValueOptimizer.LJ(new C0CAZ(absABValueOptimizer));
    }

    public static final void LJFF(EnumC309240CAg enumC309240CAg, String str) {
        if (!LIZLLL()) {
            return;
        }
        int i = C309230CAf.LIZ[enumC309240CAg.ordinal()];
        C309250CAh c309250CAh = null;
        if (i != 1) {
            if (i == 2) {
                C309250CAh c309250CAh2 = LIZIZ;
                if (c309250CAh2 != null) {
                    c309250CAh = c309250CAh2;
                }
                AbstractC309290CAl abstractC309290CAl = c309250CAh.LIZIZ.get(str);
                if (abstractC309290CAl != null && abstractC309290CAl.LIZJ.compareAndSet(false, true)) {
                    AbstractC309290CAl.LJI(new C309280CAk(abstractC309290CAl));
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        C309250CAh c309250CAh3 = LIZIZ;
        if (c309250CAh3 != null) {
            c309250CAh = c309250CAh3;
        }
        AbsABValueOptimizer absABValueOptimizer = c309250CAh.LIZ.get(str);
        if (absABValueOptimizer == null || !absABValueOptimizer.LJFF.compareAndSet(false, true)) {
            return;
        }
        AbsABValueOptimizer.LJ(new C309210CAd(absABValueOptimizer));
    }

    public static final void LJI(int i, String str) {
        Object c098200Yq;
        if (!LIZLLL()) {
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = LIZJ;
        if (thread == null) {
            thread = null;
        }
        if (!Intrinsics.LJFF(threadCurrentThread, thread)) {
            return;
        }
        try {
            C309250CAh c309250CAh = LIZIZ;
            if (c309250CAh == null) {
                c309250CAh = null;
            }
            Map<String, AbstractC309290CAl> map = c309250CAh.LIZIZ;
            if (!map.isEmpty()) {
                try {
                    Iterator<Map.Entry<String, AbstractC309290CAl>> it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        AbstractC309290CAl value = it2.next().getValue();
                        if (value.LIZIZ && !value.LIZJ.get()) {
                            value.LIZLLL.add(new KevaInfo(str, i, true));
                        }
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LIZ(Object obj, Object obj2, String str, boolean z) {
        Object c098200Yq;
        if (!LIZLLL()) {
            return;
        }
        Thread thread = null;
        if (C281630B2b.LIZ) {
            C309250CAh c309250CAh = LIZIZ;
            if (c309250CAh == null) {
                c309250CAh = null;
            }
            Map<String, AbsABValueOptimizer> map = c309250CAh.LIZ;
            if (map.isEmpty()) {
                return;
            }
            if (((Boolean) C274300Ap2.LIZIZ.getValue()).booleanValue()) {
                Thread threadCurrentThread = Thread.currentThread();
                Thread thread2 = LIZJ;
                if (thread2 != null) {
                    thread = thread2;
                }
                if (!Intrinsics.LJFF(threadCurrentThread, thread)) {
                    return;
                }
            }
            try {
                Iterator<Map.Entry<String, AbsABValueOptimizer>> it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    it2.next().getValue().LJI(obj, obj2, str, z);
                }
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (((Boolean) C274300Ap2.LIZIZ.getValue()).booleanValue()) {
            Thread threadCurrentThread2 = Thread.currentThread();
            Thread thread3 = LIZJ;
            if (thread3 == null) {
                thread3 = null;
            }
            if (!Intrinsics.LJFF(threadCurrentThread2, thread3)) {
                return;
            }
        }
        try {
            C309250CAh c309250CAh2 = LIZIZ;
            if (c309250CAh2 == null) {
                c309250CAh2 = null;
            }
            Map<String, AbsABValueOptimizer> map2 = c309250CAh2.LIZ;
            if (!map2.isEmpty()) {
                try {
                    Iterator<Map.Entry<String, AbsABValueOptimizer>> it3 = map2.entrySet().iterator();
                    while (it3.hasNext()) {
                        it3.next().getValue().LJI(obj, obj2, str, z);
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
