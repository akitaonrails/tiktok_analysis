package X;

import Y.ARunnableS92S0000000_13;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VDq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C794240VDq {
    public static final CopyOnWriteArrayList<Runnable> LIZ = new CopyOnWriteArrayList<>();
    public static final List<String> LIZIZ = new ArrayList();
    public static final C822650WOx LIZJ = new C822650WOx(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new ThreadFactory() { // from class: X.0CL1
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i;
            BPEAThread bPEAThread = new BPEAThread(runnable, "TerminalMonitor");
            if (((Boolean) C0A7A.LIZ.getValue()).booleanValue()) {
                i = 1;
            } else {
                i = 10;
            }
            ThreadMethodProxy.setPriority(bPEAThread, i);
            return bPEAThread;
        }
    }, new ThreadPoolExecutor.DiscardOldestPolicy());

    public static void LIZ(C791940V4u c791940V4u) {
        C791880V4o.LIZIZ(c791940V4u.LIZ());
        synchronized (C794240VDq.class) {
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = LIZ;
            if (copyOnWriteArrayList != null) {
                Iterator<Runnable> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    LIZJ.submit(it2.next());
                }
                LIZ.clear();
            }
            LIZJ.submit(new ARunnableS92S0000000_13(51));
        }
    }

    public static synchronized void LJI(Runnable runnable) {
        if (C788700Uwm.LIZ.LLIZ && new Object() { // from class: X.0VDr
        } != null) {
            LIZJ.submit(runnable);
        } else {
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = LIZ;
            copyOnWriteArrayList.add(runnable);
            if (copyOnWriteArrayList.size() >= 200) {
                LIZJ.submit(new ARunnableS92S0000000_13(50));
            }
        }
    }

    public static void LIZJ(String str, JSONObject jSONObject) {
        if (((Boolean) C302820Btw.LIZJ.getValue()).booleanValue()) {
            LIZLLL(str, jSONObject, null, true);
        } else {
            LIZLLL(str, jSONObject, null, false);
        }
    }

    public static void LIZIZ(String str, String str2, JSONObject jSONObject) {
        if (((Boolean) C302820Btw.LIZJ.getValue()).booleanValue()) {
            LIZLLL(str, jSONObject, str2, true);
        } else {
            LIZLLL(str, jSONObject, str2, false);
        }
    }

    public static void LJ(String str, String str2, float f) {
        if (C302590BtZ.LIZ()) {
            C791900V4q.LIZIZ(str, str2, f);
        } else {
            LJI(new RunnableC791920V4s(str, str2, f));
        }
    }

    public static void LJFF(String str, String str2, float f) {
        if (C302590BtZ.LIZ()) {
            return;
        }
        LJI(new RunnableC2035307yB(str, str2, f));
    }

    public static void LIZLLL(String str, JSONObject jSONObject, String str2, boolean z) {
        String strJ3;
        JSONObject jSONObjectLJI = null;
        if (jSONObject == null) {
            if (C302590BtZ.LIZ()) {
                try {
                    C793770VBv.LJ(str, null);
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            LJI(new C057P(str));
            return;
        }
        if (C302590BtZ.LIZ()) {
            try {
                C793770VBv.LJ(str, jSONObject);
                return;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return;
            }
        }
        if (C0V6Y.LJFF(Boolean.FALSE, str, jSONObject)) {
            return;
        }
        if (z) {
            strJ3 = null;
            jSONObjectLJI = C0V3O.LJI(jSONObject);
        } else {
            strJ3 = C786410Ut5.J3(jSONObject);
        }
        LJI(new RunnableC2397209aM(jSONObjectLJI, z, strJ3, str2, str));
    }
}
