package X;

import Y.ARunnableS103S0100000_3;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07zU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2043407zU {
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static volatile boolean LJFF;
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public static final RunnableC2043507zV LIZIZ = RunnableC2043507zV.LL;
    public static final Object LIZJ = new Object();
    public static final HashSet<String> LJI = new HashSet<>();
    public static final ArrayList<Function0<Unit>> LJII = new ArrayList<>();

    public static void LIZ() {
        synchronized (LIZJ) {
            try {
                LIZLLL = true;
                LJ = false;
                LJFF = false;
                LJI.clear();
                LJII.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LIZ.removeCallbacks(LIZIZ);
    }

    public static void LIZIZ() {
        ArrayList arrayList;
        BPEAHandler bPEAHandler = LIZ;
        bPEAHandler.removeCallbacks(LIZIZ);
        synchronized (LIZJ) {
            try {
                ArrayList<Function0<Unit>> arrayList2 = LJII;
                arrayList = new ArrayList(arrayList2);
                arrayList2.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS103S0100000_3(arrayList, 133));
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Function0) it2.next()).invoke();
        }
    }

    public static void LIZJ(long j, Function0 function0) {
        boolean z;
        synchronized (LIZJ) {
            try {
                if (LIZLLL && !LJ) {
                    LJII.add(function0);
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            function0.invoke();
            return;
        }
        BPEAHandler bPEAHandler = LIZ;
        RunnableC2043507zV runnableC2043507zV = LIZIZ;
        bPEAHandler.removeCallbacks(runnableC2043507zV);
        C786410Ut5.LJLIIL(j, bPEAHandler, runnableC2043507zV);
    }
}
