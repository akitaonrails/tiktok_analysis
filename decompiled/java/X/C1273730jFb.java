package X;

import Y.ARunnableS120S0100000_20;
import android.os.Process;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jFb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273730jFb {
    public static JSONObject LJFF;
    public static final List<SafeHandlerThread> LIZ = new ArrayList();
    public static boolean LIZIZ = false;
    public static boolean LIZJ = false;
    public static boolean LIZLLL = true;
    public static long LJ = 0;
    public static final AtomicInteger LJI = new AtomicInteger(0);

    public static void LIZLLL(SafeHandlerThread safeHandlerThread) {
        if (safeHandlerThread == null) {
            return;
        }
        if (LIZIZ && !LIZJ) {
            if (safeHandlerThread.isThreadAlive()) {
                safeHandlerThread.post(new ARunnableS120S0100000_20(safeHandlerThread, 122));
                return;
            } else {
                C1274080jGA.LIZ.LIZ("SafeHandlerThreadPoolExecutor.unlockThread", new AndroidRuntimeException("BUG, thread has been dead."));
                return;
            }
        }
        safeHandlerThread.release();
    }

    public static GLThread LIZ(int i, String str) {
        if (LIZIZ && !LIZJ) {
            return (GLThread) LIZJ(i, str, true);
        }
        return new GLThread(str, C143900gn.LIZ(i, str));
    }

    public static SafeHandlerThread LIZIZ(int i, String str) {
        if (LIZIZ && !LIZJ) {
            return LIZJ(i, str, false);
        }
        return new SafeHandlerThread(str, C143900gn.LIZ(i, str));
    }

    public static SafeHandlerThread LIZJ(final int i, final String str, boolean z) {
        SafeHandlerThread safeHandlerThread;
        JSONArray jSONArrayOptJSONArray;
        List<SafeHandlerThread> list = LIZ;
        synchronized (list) {
            try {
                Iterator it2 = ((ArrayList) list).iterator();
                safeHandlerThread = null;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    SafeHandlerThread safeHandlerThread2 = (SafeHandlerThread) it2.next();
                    if (safeHandlerThread2 != null) {
                        if (z) {
                            if (safeHandlerThread2 instanceof GLThread) {
                                if (!safeHandlerThread2.isLocked() && safeHandlerThread2.isAlive() && (safeHandlerThread = safeHandlerThread2.lock()) != null) {
                                    safeHandlerThread.setThreadName(str);
                                    C1283100jUi.LIZIZ(safeHandlerThread2.mHandler, new Runnable() { // from class: X.0jFU
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            String str2 = str;
                                            int i2 = i;
                                            C1C7U.LIZ("SafeHandlerThreadPoolExecutor@816c.lockThread$1L");
                                            Process.setThreadPriority(C143900gn.LIZ(i2, str2));
                                            C1C7U.LIZIZ("SafeHandlerThreadPoolExecutor@816c.lockThread$1L");
                                        }
                                    });
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("Get Thread from ThreadPool, name:");
                                    sbLIZ.append(str);
                                    sbLIZ.append(", isGL:");
                                    sbLIZ.append(z);
                                    AVLog.ioi("SafeHandlerThreadPoolExecutor", C2188811AlT.LIZIZ(sbLIZ));
                                    break;
                                }
                            }
                        } else if (safeHandlerThread2 instanceof GLThread) {
                            continue;
                        } else if (!safeHandlerThread2.isLocked()) {
                            continue;
                        }
                    }
                }
            } finally {
            }
        }
        if (safeHandlerThread == null) {
            int iLIZ = C143900gn.LIZ(i, str);
            if (z) {
                safeHandlerThread = new GLThread(str, iLIZ);
            } else {
                safeHandlerThread = new SafeHandlerThread(str, iLIZ);
            }
            safeHandlerThread.start();
            safeHandlerThread.setAliveTimeMs(LJ);
            safeHandlerThread.lock();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Create new Thread, name:");
            sbLIZ2.append(str);
            sbLIZ2.append(", isGL:");
            sbLIZ2.append(z);
            AVLog.ioi("SafeHandlerThreadPoolExecutor", C2188811AlT.LIZIZ(sbLIZ2));
            List<SafeHandlerThread> list2 = LIZ;
            synchronized (list2) {
                try {
                    ((ArrayList) list2).add(safeHandlerThread);
                } finally {
                }
            }
        }
        int iIncrementAndGet = LJI.incrementAndGet();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("lock thread with refCnt:");
        sbLIZ3.append(iIncrementAndGet);
        AVLog.ioi("SafeHandlerThreadPoolExecutor", C2188811AlT.LIZIZ(sbLIZ3));
        JSONObject jSONObject = LJFF;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(str)) != null) {
            safeHandlerThread.enableSafeMode(new C1273740jFc(jSONArrayOptJSONArray));
        }
        return safeHandlerThread;
    }
}
