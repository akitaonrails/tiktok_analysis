package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yUA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859360yUA {
    public static String LJ;
    public static boolean LJFF;
    public static boolean LJII;
    public static final C1859360yUA LIZ = new C1859360yUA();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static final HashMap<String, C1859410yUF> LIZJ = new HashMap<>();
    public static final HashMap<String, C1556190qbB> LIZLLL = new HashMap<>();
    public static final RunnableC1859400yUE LJI = RunnableC1859400yUE.LL;

    public static C1556190qbB LIZ() {
        Object next;
        Iterator<T> it2 = LIZLLL.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((C1556190qbB) next).LIZIZ.invoke().booleanValue()) {
                break;
            }
        }
        return (C1556190qbB) next;
    }

    public static void LIZIZ() {
        Object c098200Yq;
        if (LJFF) {
            String str = LJ;
            if (str == null) {
                LJFF = false;
                return;
            }
            boolean z = LIZJ.get(str) == null;
            C1556190qbB c1556190qbB = LIZLLL.get(str);
            if (c1556190qbB != null) {
                try {
                    c098200Yq = Boolean.valueOf(c1556190qbB.LIZIZ.invoke().booleanValue() ? false : true);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Boolean bool = Boolean.TRUE;
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = bool;
                }
                zBooleanValue = ((Boolean) c098200Yq).booleanValue();
            }
            if (z || zBooleanValue) {
                LIZIZ.removeCallbacks(LJI);
                C1785140wYS.LJ(str, false);
                C1859410yUF c1859410yUF = LIZJ.get(str);
                if (c1859410yUF != null) {
                    c1859410yUF.LJI();
                }
                LJFF = false;
                LJ = null;
            }
        }
    }

    public static void LIZJ(String str) {
        LIZLLL.remove(str);
        if (C07IH.LIZ() && LJFF && Intrinsics.LJFF(str, LJ)) {
            LIZIZ.removeCallbacks(LJI);
            C1785140wYS.LJ(str, false);
            C1859410yUF c1859410yUF = LIZJ.get(str);
            if (c1859410yUF != null) {
                c1859410yUF.LJI();
            }
            LJFF = false;
            LJ = null;
        }
    }

    public static void LIZLLL(String str) {
        if (C07IH.LIZ() && LJFF && Intrinsics.LJFF(str, LJ)) {
            C1785140wYS.LJ(str, false);
            LIZIZ.removeCallbacks(LJI);
            LJFF = false;
            LJ = null;
        }
        LIZJ.remove(str);
    }
}
