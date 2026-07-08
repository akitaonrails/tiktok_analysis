package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.pusher.core.utils.AVLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0jFZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273710jFZ {
    public static volatile C1273710jFZ LIZIZ;
    public static boolean LIZJ;
    public final List<C1273870jFp> LIZ = new ArrayList();

    public static void LIZ() {
        if (LIZJ) {
            synchronized (C1273710jFZ.class) {
                try {
                    Iterator it2 = ((ArrayList) LIZIZ().LIZ).iterator();
                    while (it2.hasNext()) {
                        AVLog.ioe("GLTracer", ((C1273870jFp) it2.next()).toString());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static C1273710jFZ LIZIZ() {
        if (LIZIZ == null) {
            LIZIZ = new C1273710jFZ();
        }
        return LIZIZ;
    }

    public static void LIZJ() {
        if (LIZJ) {
            synchronized (C1273710jFZ.class) {
                try {
                    synchronized (C1273710jFZ.class) {
                        try {
                            Iterator it2 = ((ArrayList) LIZIZ().LIZ).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                C1273870jFp c1273870jFp = (C1273870jFp) it2.next();
                                if (c1273870jFp.LIZ == C786410Ut5.u3()) {
                                    ((ArrayList) LIZIZ().LIZ).remove(c1273870jFp);
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("RemoveTrackStack remain ");
                                    sbLIZ.append(((ArrayList) LIZIZ().LIZ).size());
                                    AVLog.iow("GLTracer", C2188811AlT.LIZIZ(sbLIZ));
                                    break;
                                }
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static int LIZLLL() {
        int size;
        if (!LIZJ) {
            return 0;
        }
        synchronized (C1273710jFZ.class) {
            try {
                size = ((ArrayList) LIZIZ().LIZ).size();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return size;
    }

    public static void LJ(Thread thread) {
        if (LIZJ) {
            synchronized (C1273710jFZ.class) {
                try {
                    ((ArrayList) LIZIZ().LIZ).add(new C1273870jFp(thread, ThreadMethodProxy.getStackTrace(C786410Ut5.u3())));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("AddTrackStack with threadName[");
                    sbLIZ.append(thread.getName());
                    sbLIZ.append("] current size ");
                    sbLIZ.append(((ArrayList) LIZIZ().LIZ).size());
                    AVLog.iow("GLTracer", C2188811AlT.LIZIZ(sbLIZ));
                    int iLIZLLL = LIZLLL();
                    if (iLIZLLL > 12) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Too more GL thread with ");
                        sbLIZ2.append(iLIZLLL);
                        sbLIZ2.append(" VS ");
                        sbLIZ2.append(12);
                        AVLog.ioe("GLTracer", C2188811AlT.LIZIZ(sbLIZ2));
                        LIZ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
