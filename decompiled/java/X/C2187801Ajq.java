package X;

import android.os.Process;
import com.bytedance.common.jato.JatoXL;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1Ajq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2187801Ajq {
    public static final Map<String, C1505630pHd> LIZ = new LinkedHashMap();
    public static final Map<String, Thread> LIZIZ = new LinkedHashMap();
    public static final Map<String, Integer> LIZJ = new LinkedHashMap();
    public static final ArrayList<String> LIZLLL = C1697810uHb.LJ("ChromiumNet", "NetNormal", "EventUpload");
    public static final Map<String, Thread> LJ = new LinkedHashMap();
    public static final Map<String, Thread> LJFF = new LinkedHashMap();
    public static final C01GW LJI = C452501pT.LIZIZ(new C0T5Y());
    public static boolean LJII;

    public static void LIZJ() {
        if (LJII) {
            return;
        }
        ThreadGroup threadGroup = C786410Ut5.u3().getThreadGroup();
        ThreadGroup threadGroup2 = threadGroup;
        while (threadGroup != null) {
            threadGroup2 = threadGroup;
            threadGroup = threadGroup.getParent();
        }
        if (threadGroup2 != null) {
            int iActiveCount = threadGroup2.activeCount() * 2;
            Thread[] threadArr = new Thread[iActiveCount];
            threadGroup2.enumerate(threadArr);
            for (int i = 0; i < iActiveCount; i++) {
                Thread thread = threadArr[i];
                if (thread != null) {
                    LIZIZ.put(thread.getName(), thread);
                    Iterator<String> it2 = LIZLLL.iterator();
                    while (it2.hasNext()) {
                        if (u.LJJIIJZLJL(thread.getName(), it2.next(), false)) {
                            LJ.put(thread.getName(), thread);
                            LIZJ.put(thread.getName(), Integer.valueOf(thread.getPriority()));
                        }
                    }
                }
            }
        }
        LJII = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ() {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2187801Ajq.LJ():void");
    }

    public static void LJFF() {
        if (!C2187821Ajs.LIZ()) {
            ThreadMethodProxy.setPriority(C786410Ut5.u3(), 5);
            return;
        }
        int iMyTid = Process.myTid();
        JatoXL.resetPriority(iMyTid);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append(" after reset tid:");
        sbLIZ.append(iMyTid);
        sbLIZ.append(" priority:");
        sbLIZ.append(Process.getThreadPriority(iMyTid));
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZLLL(String str) {
        Object obj = ((LinkedHashMap) LIZIZ).get(str);
        if (obj != null) {
            LJFF.put(str, (Thread) obj);
        }
    }

    public static void LJI(String str) {
        Thread thread = (Thread) ((LinkedHashMap) LIZIZ).get(str);
        if (thread != null) {
            ThreadMethodProxy.setPriority(thread, 7);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setThreadPriorityHighByName ");
            sbLIZ.append(str);
            sbLIZ.append(' ');
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LJII(String str) {
        Thread thread = (Thread) ((LinkedHashMap) LIZIZ).get(str);
        if (thread != null) {
            ThreadMethodProxy.setPriority(thread, 1);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setThreadPriorityMinByName ");
            sbLIZ.append(str);
            sbLIZ.append(' ');
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LJIIIIZZ(String str) {
        Thread thread = (Thread) ((LinkedHashMap) LIZIZ).get(str);
        if (thread != null) {
            ThreadMethodProxy.setPriority(thread, 5);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setThreadPriorityNormalByName ");
            sbLIZ.append(str);
            sbLIZ.append(' ');
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LJIIIZ(int i) {
        if (C2187821Ajs.LJFF()) {
            JatoXL.resetRenderThread();
        } else {
            Thread thread = (Thread) ((LinkedHashMap) LJFF).get("RenderThread");
            if (thread != null) {
                ThreadMethodProxy.setPriority(thread, 7);
            }
        }
        if (C2187821Ajs.LJ()) {
            JatoXL.resetPriority(i);
        } else {
            Thread thread2 = (Thread) ((LinkedHashMap) LJFF).get("main");
            if (thread2 != null) {
                ThreadMethodProxy.setPriority(thread2, 5);
            }
        }
        if (!C2187821Ajs.LIZIZ()) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) LJFF;
            Thread thread3 = (Thread) linkedHashMap.get("play_thread_0");
            if (thread3 != null) {
                ThreadMethodProxy.setPriority(thread3, 5);
            }
            Thread thread4 = (Thread) linkedHashMap.get("play_thread_1");
            if (thread4 != null) {
                ThreadMethodProxy.setPriority(thread4, 5);
            }
            Thread thread5 = (Thread) linkedHashMap.get("explay_thread_1");
            if (thread5 != null) {
                ThreadMethodProxy.setPriority(thread5, 5);
            }
        }
    }

    public static void LIZ(int i, int i2) {
        C104100aN.LIZ().LJIJ("JavaThreadPriorityHelp", new C2187791Ajp(i, i2));
    }

    public static void LIZIZ(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 <= -20) {
            JatoXL.setPriority(i, -20);
        } else if (i4 >= 19) {
            JatoXL.setPriority(i, 19);
        } else {
            JatoXL.setPriority(i, i4);
        }
    }
}
