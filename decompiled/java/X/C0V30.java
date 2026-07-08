package X;

import Y.ARunnableS18S0100100_13;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0V30, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V30 {
    public static volatile boolean LIZ;
    public static C0V31 LIZIZ;
    public static C0V32 LIZJ;
    public static AbstractC791470V2z LJ;
    public static volatile C0V34 LJFF;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static Printer LJIIL;
    public static final CopyOnWriteArrayList<AbstractC791470V2z> LIZLLL = new CopyOnWriteArrayList<>();
    public static volatile boolean LJI = false;
    public static long LJII = 0;
    public static int LJIIIIZZ = 0;
    public static final C0V37 LJIIIZ = new Runnable() { // from class: X.0V37
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("LooperMonitor@2587.<field>$1");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("LooperMonitor@2587.<field>$1");
        }

        public static void LIZ() {
            try {
                StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(Looper.getMainLooper().getThread());
                if (C792400V6o.LJIIIIZZ() && stackTrace != null) {
                    new TimeoutException("main thread task execute more than 100 ms").setStackTrace(stackTrace);
                }
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("\tat ");
                    sbLIZ.append(stackTraceElement.getClassName());
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                    sb.append(e3.d);
                    sb.append(stackTraceElement.getMethodName());
                    sb.append(e3.h);
                    sb.append(stackTraceElement.getFileName());
                    sb.append(":");
                    sb.append(stackTraceElement.getLineNumber());
                    sb.append(")\n");
                }
                new IllegalStateException(sb.toString()).getStackTrace();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C0V38.LIZ.LIZIZ(th, "block_deal_exception");
            }
        }
    };

    public static void LIZ() {
        if (!LIZ || LJIIJ) {
            if (LJIIJJI || !LJIIJ) {
                return;
            }
            LIZIZ();
            return;
        }
        if (C790620Uzs.LIZJ("block_monitor") || Build.VERSION.SDK_INT < 24) {
            return;
        }
        LIZIZ();
        if (LJ()) {
            Context context = C792400V6o.LIZ;
            C0V32 c0v32 = LIZJ;
            C20665087r c20665087r = C20664087q.LJII;
            if (c20665087r != null) {
                c20665087r.removeMessageObserver(c0v32);
            }
        } else {
            C2097408Jo.LIZJ(LIZIZ);
        }
        LJIIJ = true;
    }

    public static void LIZIZ() {
        int size;
        Printer printer;
        if (LIZ && !LJIIJJI && C0V36.LIZJ) {
            if (LJ()) {
                List<InterfaceC20666087s> listLIZ = C20664087q.LIZ();
                if (listLIZ != null && listLIZ.size() == 1 && ListProtector.get(listLIZ, 0) == LIZJ) {
                    if (C20664087q.LIZ && C20664087q.LJII != null) {
                        try {
                            Method methodLIZJ = C20664087q.LIZJ(Looper.class, "setObserver", Class.forName("android.os.Looper$Observer"));
                            Object obj = C20664087q.LIZJ;
                            if (obj == null) {
                                C2204961BRm.a0(methodLIZJ, null, new Object[]{null}, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++d6h9wTkZBo2LmKdUvRk4PLc5FANnBi/ABhs", null));
                            } else {
                                C2204961BRm.a0(methodLIZJ, null, new Object[]{obj}, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++d6h9wTkZBo2LmKdUvRk4PLc5FANnBi/ABhs", null));
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    LJIIJJI = true;
                }
            } else {
                List<Printer> listLIZ2 = C2097408Jo.LIZ();
                if (listLIZ2 != null && ((ArrayList) listLIZ2).size() == 1 && ListProtector.get(listLIZ2, 0) == LIZIZ) {
                    try {
                        Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
                        declaredField.setAccessible(true);
                        printer = (Printer) declaredField.get(Looper.getMainLooper());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        printer = null;
                    }
                    LJIIL = printer;
                    if (printer != null) {
                        C786410Ut5.LJIIZILJ(Looper.getMainLooper(), null);
                        LJIIJJI = true;
                    }
                } else if (C791390V2r.LJJIII.LJIJJ && (size = ((ArrayList) C2097408Jo.LIZ()).size()) > 0) {
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[((ArrayList) C2097408Jo.LIZ()).size() + 1];
                    List<Printer> listLIZ3 = C2097408Jo.LIZ();
                    int i = 0;
                    do {
                        stackTraceElementArr[i] = new StackTraceElement(ListProtector.get(listLIZ3, i).getClass().getName(), "HasPrinter", "Looper", 0);
                        i++;
                    } while (i < size);
                    C1AF0.LJFF(new C791430V2v("Looper Opt Last", stackTraceElementArr), "Looper Opt Last");
                }
            }
            Context context = C792400V6o.LIZ;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0V31] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0V32] */
    public static void LIZLLL() {
        if (C0V36.LIZ || LIZ) {
            return;
        }
        LIZ = true;
        LIZIZ = new Printer() { // from class: X.0V31
            @Override // android.util.Printer
            public final void println(String str) {
                int i = C0V36.LIZLLL;
                if (i == 1) {
                    return;
                }
                if (i == 2) {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (str.charAt(0) == '>') {
                        C0V3G c0v3g = C791390V2r.LJJIII.LJIILL;
                        c0v3g.LIZIZ(Message.obtain(c0v3g.LIZLLL, C0V30.LJIIIZ), 100L);
                        return;
                    } else {
                        if (str.charAt(0) != '<') {
                            return;
                        }
                        C791390V2r.LJJIII.LJIILL.LIZ(C0V30.LJIIIZ);
                        return;
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    if (C0V36.LIZIZ) {
                        C20665087r c20665087r = C20664087q.LJII;
                        if (c20665087r != null) {
                            c20665087r.messageDispatchStarting(str);
                            return;
                        }
                        return;
                    }
                    C0V30.LIZJ(true, str, null);
                    return;
                }
                if (str.charAt(0) != '<') {
                    return;
                }
                if (C0V36.LIZIZ) {
                    C20665087r c20665087r2 = C20664087q.LJII;
                    if (c20665087r2 == null) {
                        return;
                    }
                    c20665087r2.messageDispatched(str, null);
                    return;
                }
                C0V30.LIZJ(false, str, null);
            }
        };
        LIZJ = new InterfaceC20666087s() { // from class: X.0V32
            @Override // X.InterfaceC20666087s
            public final void messageDispatchStarting(String str) {
                C0V30.LIZJ(true, str, null);
            }

            @Override // X.InterfaceC20666087s
            public final void messageDispatched(String str, Message message) {
                C0V30.LIZJ(false, str, message);
            }
        };
        if (!C0V36.LIZIZ || !C20664087q.LIZIZ()) {
            if (C0V36.LIZIZ && C20664087q.LIZIZ()) {
                return;
            }
            C2097408Jo.LIZIZ();
            C786410Ut5.G3(LIZIZ);
            return;
        }
        Context context = C792400V6o.LIZ;
        if (C20664087q.LIZIZ) {
            C2097408Jo.LIZIZ();
            C786410Ut5.G3(LIZIZ);
        }
        C0V32 c0v32 = LIZJ;
        C20665087r c20665087r = C20664087q.LJII;
        if (c20665087r != null) {
            c20665087r.addMessageObserver(c0v32);
        }
    }

    public static boolean LJ() {
        return C0V36.LIZIZ && C20664087q.LIZIZ() && !C20664087q.LIZIZ;
    }

    public static void LJI() {
        CopyOnWriteArrayList<AbstractC791470V2z> copyOnWriteArrayList = LIZLLL;
        if (copyOnWriteArrayList.size() == 0) {
            return;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[copyOnWriteArrayList.size() + 1];
        int i = 0;
        while (true) {
            CopyOnWriteArrayList<AbstractC791470V2z> copyOnWriteArrayList2 = LIZLLL;
            if (i >= copyOnWriteArrayList2.size()) {
                C1AF0.LJFF(new C791430V2v("Looper Opt", stackTraceElementArr), "Looper Opt");
                return;
            } else {
                stackTraceElementArr[i] = new StackTraceElement(copyOnWriteArrayList2.get(i).getClass().getName(), "registerListener", "activity", 0);
                i++;
            }
        }
    }

    public static void LJII() {
        if (LIZ && LJIIJ) {
            LJIIIIZZ(false);
            if (LJ()) {
                Context context = C792400V6o.LIZ;
                C0V32 c0v32 = LIZJ;
                C20665087r c20665087r = C20664087q.LJII;
                if (c20665087r != null) {
                    c20665087r.addMessageObserver(c0v32);
                }
            } else {
                C2097408Jo.LIZIZ();
                C786410Ut5.G3(LIZIZ);
            }
            LJIIJ = false;
        }
    }

    public static void LJFF(AbstractC791470V2z abstractC791470V2z) {
        if (!LIZ) {
            LIZLLL();
        }
        CopyOnWriteArrayList<AbstractC791470V2z> copyOnWriteArrayList = LIZLLL;
        synchronized (copyOnWriteArrayList) {
            if (abstractC791470V2z != null) {
                try {
                    if (!copyOnWriteArrayList.contains(abstractC791470V2z)) {
                        copyOnWriteArrayList.add(abstractC791470V2z);
                        if (C791390V2r.LJJIII.LJIJ) {
                            LJII();
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static void LJIIIIZZ(boolean z) {
        if (LIZ && LJIIJJI && C0V36.LIZJ) {
            if (LJ() && z) {
                return;
            }
            if (LJ()) {
                if (C20664087q.LIZ && C20664087q.LJII != null) {
                    try {
                        C2204961BRm.a0(C20664087q.LIZJ(Looper.class, "setObserver", Class.forName("android.os.Looper$Observer")), null, new Object[]{C20664087q.LJII}, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++d6h9wTkZBo2LmKdUvRk4PLc5FANnBi/ABhs", null));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } else if (LJIIL != null) {
                C786410Ut5.LJIIZILJ(Looper.getMainLooper(), LJIIL);
            }
            Context context = C792400V6o.LIZ;
            LJIIJJI = false;
        }
    }

    public static void LIZJ(boolean z, String str, Message message) {
        AbstractC791470V2z abstractC791470V2z;
        AbstractC791470V2z abstractC791470V2z2;
        long jNanoTime = System.nanoTime();
        AbstractC791470V2z.LIZIZ = jNanoTime / 1000000;
        AbstractC791470V2z.LIZJ = SystemClock.currentThreadTimeMillis();
        if (z && (abstractC791470V2z2 = LJ) != null && abstractC791470V2z2.LIZJ()) {
            LJ.LIZIZ(str);
        }
        try {
            for (AbstractC791470V2z abstractC791470V2z3 : LIZLLL) {
                if (abstractC791470V2z3 != null && abstractC791470V2z3.LIZJ()) {
                    if (z) {
                        if (!abstractC791470V2z3.LIZ) {
                            abstractC791470V2z3.LIZIZ(str);
                        }
                    } else if (abstractC791470V2z3.LIZ) {
                        abstractC791470V2z3.LIZ();
                    }
                } else if (!z && abstractC791470V2z3.LIZ) {
                    abstractC791470V2z3.LIZ();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!z && (abstractC791470V2z = LJ) != null && abstractC791470V2z.LIZJ()) {
            LJ.LIZ();
        }
        if (LJI) {
            LJII += System.nanoTime() - jNanoTime;
            int i = LJIIIIZZ;
            LJIIIIZZ = i + 1;
            if (i >= 1000) {
                if (LJFF != null) {
                    C0V34 c0v34 = LJFF;
                    long j = LJII;
                    C0V33 c0v33 = (C0V33) c0v34;
                    c0v33.getClass();
                    C787900UvU.LIZ.LIZJ(new ARunnableS18S0100100_13(j, c0v33, 3));
                }
                LJIIIIZZ = 0;
                LJII = 0L;
                LJI = false;
            }
        }
    }
}
