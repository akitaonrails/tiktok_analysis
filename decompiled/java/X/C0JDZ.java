package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0JDZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JDZ {
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile long LIZLLL;
    public static volatile long LJ;
    public static volatile long LJFF;
    public static volatile boolean LJIIIIZZ;
    public static final C0JDZ LIZ = new C0JDZ();
    public static final AtomicInteger LJI = new AtomicInteger(0);
    public static final AtomicInteger LJII = new AtomicInteger(0);

    public static String LIZ() {
        StringBuilder sb = new StringBuilder();
        C089E c089e = new C089E(ThreadMethodProxy.getStackTrace(C786410Ut5.u3()));
        int i = 0;
        while (c089e.hasNext()) {
            StackTraceElement stackTraceElement = (StackTraceElement) c089e.next();
            String className = stackTraceElement.getClassName();
            if (!u.LJJIIJZLJL(className, "java.", false) && !u.LJJIIJZLJL(className, "dalvik.", false) && !u.LJJIIJZLJL(className, "kotlin.", false) && !a0.LJJIIZI(className, "LiveThreadManager", false) && !a0.LJJIIZI(className, "LiveEnterRoomRunnableRecorder", false) && (a0.LJJIIZI(className, "bytedance", false) || a0.LJJIIZI(className, "ss.android", false))) {
                if (i > 0) {
                    sb.append(" <- ");
                }
                sb.append(a0.LJJLJ('.', className, className));
                sb.append('.');
                sb.append(stackTraceElement.getMethodName());
                i++;
                if (i >= 3) {
                    break;
                }
            }
        }
        return sb.toString();
    }

    public static final void LIZJ() {
        if (LIZIZ) {
            LIZ.getClass();
            LJFF = System.currentTimeMillis() - LIZLLL;
            if (LJ <= 0 || LJFF <= 0) {
                return;
            }
            Math.max(LJ, LJFF);
        }
    }

    public static String LIZIZ(Object obj) {
        Object next;
        String name = obj.getClass().getName();
        Iterator it2 = C1697810uHb.LJIIJJI("$$Lambda", "$$ExternalSyntheticLambda", "$$InternalSyntheticLambda").iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (a0.LJJIIZI(name, (String) next, false)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        String str = (String) next;
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String strLJJZ = a0.LJJZ(name, str, name);
            sbLIZ.append(a0.LJJLJ('.', strLJJZ, strLJJZ));
            sbLIZ.append("#lambda");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() == 0) {
            return a0.LJJLJ('.', name, name);
        }
        return simpleName;
    }

    public static Object LIZLLL(Object obj, String str) {
        Object c098200Yq;
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            c098200Yq = declaredField.get(obj);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }

    public static final void LJ(Runnable runnable, String str, String str2) {
        Object c098200Yq;
        Object objLIZLLL;
        if (!LJIIIIZZ || !LIZIZ) {
            return;
        }
        if (str == null) {
            Object obj = null;
            try {
                LIZ.getClass();
                Object obj2 = runnable;
                int i = 0;
                do {
                    if (obj2 instanceof FutureTask) {
                        LIZ.getClass();
                        objLIZLLL = LIZLLL(obj2, "callable");
                    } else {
                        if (!Intrinsics.LJFF(obj2.getClass().getName(), "java.util.concurrent.Executors$RunnableAdapter")) {
                            break;
                        }
                        LIZ.getClass();
                        objLIZLLL = LIZLLL(obj2, "task");
                    }
                    if (objLIZLLL == null) {
                        break;
                    }
                    i++;
                    obj2 = objLIZLLL;
                } while (i < 4);
                c098200Yq = LIZIZ(obj2);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            str = (String) obj;
            if (str == null) {
                str = runnable.getClass().getSimpleName();
            }
        }
        if (str2 != null && str2.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" | ");
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        LJI.incrementAndGet();
    }
}
