package X;

import Y.ARunnableS113S0100000_13;
import android.app.Activity;
import android.os.Build;
import android.os.Looper;
import android.util.Printer;
import android.view.Choreographer;
import android.view.Window;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.thread.ThreadWithBlockingQueue;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0V2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791390V2r implements InterfaceC792710V7t {
    public static final C791390V2r LJJIII = new C791390V2r();
    public static boolean LJJIIJ;
    public static AbstractC791320V2k LJJIIJZLJL;
    public volatile boolean LIZ;
    public Object LJII;
    public Object[] LJIIIIZZ;
    public long[] LJIIIZ;
    public Method LJIIJ;
    public Choreographer LJIIJJI;
    public ARunnableS113S0100000_13 LJIILJJIL;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public boolean LJIL;
    public C791380V2q LJJI;
    public boolean LJJIFFI;
    public Window LJJII;
    public final C791410V2t LIZIZ = new C791410V2t();
    public final long[] LIZJ = new long[4];
    public final List<AbstractC791320V2k> LIZLLL = new CopyOnWriteArrayList();
    public boolean LJ = false;
    public boolean LJFF = false;
    public boolean LJI = false;
    public boolean LJIIL = false;
    public final ThreadWithBlockingQueue LJIILIIL = new ThreadWithBlockingQueue("looper_monitor");
    public final C0V3G LJIILL = new C0V3G("looper_monitor");
    public final HashMap<Window, Window.OnFrameMetricsAvailableListener> LJIILLIIL = new HashMap<>();
    public final HashMap<Window, Window.OnFrameMetricsAvailableListener> LJIIZILJ = new HashMap<>();
    public long LJIJJLI = 0;
    public long LJJ = -1;

    public final synchronized void LJIIL() {
        if (C792400V6o.LJIIJ()) {
            if (!this.LJJIFFI) {
                throw new RuntimeException("never init!");
            }
            if (!this.LIZ) {
                this.LIZ = true;
            }
            if (this.LJ && Build.VERSION.SDK_INT < 24) {
                LIZIZ(this.LJIILJJIL);
            }
        }
    }

    @Override // X.InterfaceC792710V7t
    public final void onBackground() {
    }

    public final void LJFF() {
        Window window;
        if (this.LJIJI && (window = this.LJJII) != null && this.LJIILLIIL.containsKey(window) && !this.LJIIZILJ.containsKey(this.LJJII)) {
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    Window window2 = this.LJJII;
                    window2.addOnFrameMetricsAvailableListener(this.LJIILLIIL.get(window2), this.LJIILL.LIZLLL);
                    HashMap<Window, Window.OnFrameMetricsAvailableListener> map = this.LJIIZILJ;
                    Window window3 = this.LJJII;
                    map.put(window3, this.LJIILLIIL.get(window3));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public final void LJII() {
        C0V3S c0v3s;
        C0V35 c0v35LIZIZ;
        boolean z = this.LJFF;
        ?? r4 = 0;
        if (this.LJ && Build.VERSION.SDK_INT < 24 && z) {
            LIZIZ(this.LJIILJJIL);
            this.LJFF = false;
            final long j = AbstractC791470V2z.LIZIZ;
            final long j2 = this.LJJ;
            if (this.LJIIIZ != null) {
                C0V3R c0v3r = C791560V3i.LIZLLL().LJIIIIZZ;
                if (c0v3r != null && c0v3r.LJ != null) {
                    C0V3R c0v3r2 = C791560V3i.LIZLLL().LJIIIIZZ;
                    C791450V2x c791450V2x = c0v3r2 != null ? c0v3r2.LJ : null;
                    long[] jArr = this.LJIIIZ;
                    C0V3R c0v3r3 = c791450V2x.LIZ;
                    if (c0v3r3.LJIJ && (c0v3s = c0v3r3.LJIIIZ) != null && (c0v35LIZIZ = c0v3s.LIZIZ()) != null && c0v35LIZIZ.LIZLLL == 8) {
                        C791400V2s c791400V2s = new C791400V2s();
                        if (jArr != null) {
                            c791400V2s.LIZ = jArr[1];
                            c791400V2s.LIZIZ = jArr[5];
                            c791400V2s.LIZJ = jArr[6];
                            c791400V2s.LIZLLL = jArr[7];
                            c791400V2s.LJ = jArr[8];
                        }
                        c0v35LIZIZ.LJIILIIL = c791400V2s;
                    }
                }
                if (C791440V2w.LIZ == null) {
                    synchronized (C791440V2w.class) {
                        try {
                            if (C791440V2w.LIZ == null) {
                                C791440V2w.LIZ = new C791440V2w();
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                C791440V2w.LIZ.getClass();
            }
            if (Build.VERSION.SDK_INT < 24 && !((CopyOnWriteArrayList) this.LIZLLL).isEmpty()) {
                this.LJIILIIL.LIZ(new Runnable() { // from class: X.0V2j
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("MainThreadMonitor@898e.dispatchEnd$1");
                        try {
                            for (AbstractC791320V2k abstractC791320V2k : (CopyOnWriteArrayList) this.LLILLL.LIZLLL) {
                                if (abstractC791320V2k != null) {
                                    abstractC791320V2k.LJIILLIIL(j2, j, ActivityLifeObserver.getInstance().getTopActivityClassName());
                                }
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("MainThreadMonitor@898e.dispatchEnd$1");
                    }
                });
            }
        }
        long[] jArr2 = this.LIZJ;
        jArr2[1] = AbstractC791470V2z.LIZIZ;
        char c = 3;
        jArr2[3] = AbstractC791470V2z.LIZJ;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.LIZLLL;
        int size = copyOnWriteArrayList.size();
        int i = 0;
        while (i < size) {
            AbstractC791320V2k abstractC791320V2k = (AbstractC791320V2k) ListProtector.get(copyOnWriteArrayList, i);
            if (abstractC791320V2k != null && abstractC791320V2k.LL) {
                long[] jArr3 = this.LIZJ;
                abstractC791320V2k.LJIILL(jArr3[r4], jArr3[2], jArr3[1], jArr3[c], z);
            }
            i++;
            r4 = 0;
            c = 3;
        }
        long[] jArr4 = this.LIZIZ.LIZ;
        jArr4[r4] = 0;
        jArr4[1] = 0;
        jArr4[2] = Long.MAX_VALUE;
        jArr4[3] = 0;
        this.LJI = r4;
    }

    public final int LJIIJ() {
        int size = ((CopyOnWriteArrayList) this.LIZLLL).size();
        return (!LJJIIJ || C790620Uzs.LIZJ("block_monitor")) ? size : size - 1;
    }

    public final void LJIIJJI() {
        if (this.LJJIFFI) {
            return;
        }
        if (C786410Ut5.u3() != Looper.getMainLooper().getThread()) {
            throw new AssertionError("must be init in main thread!");
        }
        ActivityLifeObserver.getInstance().register(this);
        C0V30.LIZLLL();
        C0V30.LJ = new AbstractC791470V2z() { // from class: X.0V2m
            @Override // X.AbstractC791470V2z
            public final void LIZ() {
                this.LIZ = false;
                C791390V2r c791390V2r = this.LIZLLL;
                c791390V2r.getClass();
                if (!((Boolean) C1228504rL.LIZLLL.getValue()).booleanValue()) {
                    c791390V2r.LJII();
                    return;
                }
                C791330V2l.LIZ = false;
                C791330V2l.LIZIZ = true;
                c791390V2r.LJII();
                C791330V2l.LIZIZ = false;
                C791330V2l.LIZ();
            }

            @Override // X.AbstractC791470V2z
            public final boolean LIZJ() {
                return this.LIZLLL.LIZ;
            }

            @Override // X.AbstractC791470V2z
            public final void LIZIZ(String str) {
                this.LIZ = true;
                C791390V2r c791390V2r = this.LIZLLL;
                c791390V2r.getClass();
                if (!((Boolean) C1228504rL.LIZLLL.getValue()).booleanValue()) {
                    c791390V2r.LJI(str);
                    return;
                }
                C791330V2l.LIZ = true;
                C791330V2l.LIZIZ = false;
                c791390V2r.LJI(str);
                C791330V2l.LIZ = false;
                C791330V2l.LIZ();
            }
        };
        this.LJJIFFI = true;
    }

    @Override // X.InterfaceC792710V7t
    public final void LIZ(Activity activity) {
        try {
            Window window = activity.getWindow();
            this.LJJII = window;
            try {
                window.setCallback(new C791420V2u(this, window.getCallback(), window));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LIZJ(activity.getWindow(), activity.getClass().getName());
            if (C0V30.LIZ && !C0V30.LJIIJ) {
                C791390V2r c791390V2r = LJJIII;
                if (c791390V2r.LJIJ) {
                    int iLJIIJ = c791390V2r.LJIIJ();
                    if (C0V30.LIZLLL.isEmpty() && iLJIIJ == 0) {
                        C0V30.LIZ();
                    }
                }
            }
            if (this.LJIJJ) {
                ((CopyOnWriteArrayList) this.LIZLLL).size();
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public final synchronized void LIZIZ(Runnable runnable) {
        if (!this.LIZ) {
            return;
        }
        if (this.LJIIL) {
            return;
        }
        try {
            synchronized (this.LJII) {
                try {
                    Method method = this.LJIIJ;
                    if (method != null) {
                        method.invoke(this.LJIIIIZZ[0], -1L, runnable, null);
                        this.LJIIL = true;
                    }
                } finally {
                }
            }
        } catch (Exception th) {
        }
    }

    @Override // X.InterfaceC792710V7t
    public final void LIZLLL(Activity activity) {
        if (this.LJIIJJI != null) {
            return;
        }
        try {
            this.LJJII = activity.getWindow();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (this.LJ && Build.VERSION.SDK_INT < 24) {
            try {
                this.LJIIJJI = C786410Ut5.v2();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C787900UvU.LIZ.LIZJ(new ARunnableS113S0100000_13(this, 192));
        }
    }

    public final void LJ(AbstractC791320V2k abstractC791320V2k) {
        if (abstractC791320V2k == null) {
            return;
        }
        if (!this.LIZ) {
            LJIIL();
        }
        if (!((CopyOnWriteArrayList) this.LIZLLL).contains(abstractC791320V2k)) {
            ((CopyOnWriteArrayList) this.LIZLLL).add(abstractC791320V2k);
            if (this.LJIJ) {
                C0V30.LJII();
            }
        }
    }

    public final void LJI(String str) {
        this.LJI = true;
        long[] jArr = this.LIZJ;
        jArr[0] = AbstractC791470V2z.LIZIZ;
        jArr[2] = AbstractC791470V2z.LIZJ;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.LIZLLL;
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC791320V2k abstractC791320V2k = (AbstractC791320V2k) ListProtector.get(copyOnWriteArrayList, i);
            if (abstractC791320V2k != null && !abstractC791320V2k.LL) {
                abstractC791320V2k.LJIILJJIL(str);
            }
        }
    }

    public final void LJIIIIZZ(AbstractC791320V2k abstractC791320V2k) {
        ((CopyOnWriteArrayList) this.LIZLLL).remove(abstractC791320V2k);
        if (this.LJIJ) {
            if (LJIIJ() == 0 && C0V30.LIZLLL.size() == 0) {
                C0V30.LIZ();
                return;
            }
            return;
        }
        if (!((CopyOnWriteArrayList) this.LIZLLL).isEmpty()) {
            return;
        }
        synchronized (this) {
            if (!C792400V6o.LJIIIZ()) {
                return;
            }
            if (this.LJJIFFI) {
                if (this.LIZ) {
                    this.LIZ = false;
                }
                return;
            }
            throw new RuntimeException("MainThreadMonitor is never init!");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJIIIZ(android.view.FrameMetrics r17) {
        /*
            r16 = this;
            r2 = 0
            r7 = r17
            if (r7 != 0) goto L7
            return r2
        L7:
            r13 = r16
            boolean r0 = r13.LJIL
            r4 = 1000000(0xf4240, double:4.940656E-318)
            r6 = 5
            r8 = 4
            r9 = 3
            r10 = 2
            r11 = 1
            r12 = 0
            if (r0 != 0) goto L35
            long r2 = r7.getMetric(r12)
            long r0 = r7.getMetric(r11)
            long r2 = r2 + r0
            long r0 = r7.getMetric(r10)
            long r2 = r2 + r0
            long r0 = r7.getMetric(r9)
            long r2 = r2 + r0
            long r0 = r7.getMetric(r8)
            long r2 = r2 + r0
            long r0 = r7.getMetric(r6)
            long r2 = r2 + r0
            long r2 = r2 / r4
            return r2
        L35:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L72
            r0 = 10
            long r14 = r7.getMetric(r0)
            r0 = 11
            long r2 = r7.getMetric(r0)
            long r4 = r7.getMetric(r12)
            long r0 = r7.getMetric(r11)
            long r4 = r4 + r0
            long r0 = r7.getMetric(r10)
            long r4 = r4 + r0
            long r0 = r7.getMetric(r9)
            long r4 = r4 + r0
            long r0 = r7.getMetric(r8)
            long r4 = r4 + r0
            long r0 = r7.getMetric(r6)
            long r4 = r4 + r0
            long r4 = r4 + r14
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 >= 0) goto L95
            long r2 = r13.LJIJJLI
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 >= 0) goto L95
            long r2 = r2 - r14
        L70:
            r13.LJIJJLI = r4
        L72:
            long r4 = r7.getMetric(r12)
            long r0 = r7.getMetric(r11)
            long r4 = r4 + r0
            long r0 = r7.getMetric(r10)
            long r4 = r4 + r0
            long r0 = r7.getMetric(r9)
            long r4 = r4 + r0
            long r0 = r7.getMetric(r8)
            long r4 = r4 + r0
            long r0 = r7.getMetric(r6)
            long r4 = r4 + r0
            long r4 = r4 - r2
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 / r0
            return r4
        L95:
            r2 = 0
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C791390V2r.LJIIIZ(android.view.FrameMetrics):long");
    }

    public final void LJIILLIIL(final AbstractC791320V2k abstractC791320V2k) {
        if (!((Boolean) C1228504rL.LIZLLL.getValue()).booleanValue()) {
            LJIIIIZZ(abstractC791320V2k);
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (!C791330V2l.LIZ && !C791330V2l.LIZIZ) {
                LJIIIIZZ(abstractC791320V2k);
                return;
            }
            ((LinkedList) C791330V2l.LIZJ).add(abstractC791320V2k);
            if (C791330V2l.LIZ) {
                C791330V2l.LIZIZ("Call MainThreadMonitor#removeObserver in dispatchBegin.");
                return;
            } else {
                C791330V2l.LIZIZ("Call MainThreadMonitor#removeObserver in dispatchEnd.");
                return;
            }
        }
        C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new Runnable(abstractC791320V2k) { // from class: X.0V2Z
            public final AbstractC791320V2k LL;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MainThreadMonitorBugfixLancet$RemoveObserverRunnable@38ed.run");
                try {
                    C791390V2r.LJJIII.LJIILLIIL(this.LL);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MainThreadMonitorBugfixLancet$RemoveObserverRunnable@38ed.run");
            }

            {
                this.LL = abstractC791320V2k;
            }
        });
        C791330V2l.LIZIZ("Call MainThreadMonitor#removeObserver not in main thread.");
    }

    @Override // X.InterfaceC792710V7t
    public final void onActivityDestroyed(Activity activity) {
        try {
            this.LJJII = null;
            if (Build.VERSION.SDK_INT >= 24) {
                Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListenerRemove = this.LJIILLIIL.remove(activity.getWindow());
                this.LJIIZILJ.remove(activity.getWindow());
                if (onFrameMetricsAvailableListenerRemove != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListenerRemove);
                }
                if (this.LJIJJ) {
                    int size = ((CopyOnWriteArrayList) this.LIZLLL).size();
                    int size2 = ((ArrayList) C2097408Jo.LIZ()).size();
                    if (size2 > 0) {
                        StackTraceElement[] stackTraceElementArr = new StackTraceElement[((CopyOnWriteArrayList) this.LIZLLL).size() + ((ArrayList) C2097408Jo.LIZ()).size() + 1];
                        for (int i = 0; i < size; i++) {
                            stackTraceElementArr[i] = new StackTraceElement(((AbstractC791320V2k) ((CopyOnWriteArrayList) this.LIZLLL).get(i)).getClass().getName(), "addObserver", activity.getLocalClassName(), 0);
                        }
                        List<Printer> listLIZ = C2097408Jo.LIZ();
                        int i2 = 0;
                        do {
                            stackTraceElementArr[i2 + size] = new StackTraceElement(((Printer) ((ArrayList) listLIZ).get(i2)).getClass().getName(), "addPrinter", activity.getLocalClassName(), 0);
                            i2++;
                        } while (i2 < size2);
                        C1AF0.LJFF(new C791430V2v("Looper Opt", stackTraceElementArr), "Looper Opt");
                        C0V30.LJI();
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC792710V7t
    public final void onActivityResumed(Activity activity) {
        try {
            this.LJJII = activity.getWindow();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static Method LJIILIIL(Class cls, Class... clsArr) {
        try {
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, "output", clsArr);
            method.setAccessible(true);
            return method;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Object LJIILJJIL(Object obj, String str) {
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(obj.getClass(), str);
            field.setAccessible(true);
            return field.get(obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Object LJIILL(Object obj, String str) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LIZJ(Window window, String str) {
        if (C791460V2y.LIZ && C0C64.LJIILLIIL().LJIJ(31744, 0, "start_shoot_disable_unuse_watch_exp", true) > 0) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 24) {
                return;
            }
            this.LJJII = window;
            if (this.LJIILL.LIZLLL == null) {
                return;
            }
            WindowOnFrameMetricsAvailableListenerC791360V2o windowOnFrameMetricsAvailableListenerC791360V2o = new WindowOnFrameMetricsAvailableListenerC791360V2o(this, str);
            this.LJIILLIIL.put(window, windowOnFrameMetricsAvailableListenerC791360V2o);
            if (this.LJIJI) {
                return;
            }
            window.addOnFrameMetricsAvailableListener(windowOnFrameMetricsAvailableListenerC791360V2o, this.LJIILL.LIZLLL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
