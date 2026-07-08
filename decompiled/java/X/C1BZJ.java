package X;

import android.os.HandlerThread;
import android.os.Process;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHEnableThreadPrioritySettings;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayThreadPrioritySettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BZJ implements InterfaceC479850Irn {
    public static final C1BZJ LIZ = new C1BZJ();
    public static final List<C1BZP> LIZIZ;
    public static volatile WeakReference<Object> LIZJ;
    public static final EnumC479890Irr LIZLLL;

    @Override // X.InterfaceC479850Irn
    public final void LIZ() {
    }

    @Override // X.InterfaceC479850Irn
    public final void LIZLLL() {
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1BZP() { // from class: X.1BZL
            public volatile boolean LIZ;
            public volatile int LIZIZ;
            public int LIZJ;

            @Override // X.C1BZP
            public final void LIZ(boolean z) {
                if (this.LIZ != z && C0V19.LIZJ().isAlive()) {
                    this.LIZ = z;
                    try {
                        boolean zEnable = TTLHEnableThreadPrioritySettings.INSTANCE.enable();
                        if (z) {
                            this.LIZIZ = C0V19.LIZJ().getThreadId();
                            this.LIZJ = Process.getThreadPriority(this.LIZIZ);
                            if (!zEnable || this.LIZIZ > 0) {
                                Process.setThreadPriority(this.LIZIZ, LivePlayThreadPrioritySettings.INSTANCE.getThreadPriority(C1BZM.ENABLE_DOWN_TEA));
                                return;
                            }
                            return;
                        }
                        if (!zEnable || this.LIZIZ > 0) {
                            Process.setThreadPriority(this.LIZIZ, this.LIZJ);
                        }
                    } catch (IllegalArgumentException e) {
                        TryCatchGuardChecker.doCheck(e);
                    } catch (SecurityException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            }
        });
        LIZIZ = arrayList;
        LIZLLL = EnumC479890Irr.LIVE_PLAY;
    }

    public static final HandlerThread LJFF() {
        int i = C479900Irs.LIZ[LIZLLL.ordinal()];
        boolean zIsEnabled = true;
        if (i == 1) {
            zIsEnabled = LivePlayThreadPrioritySettings.INSTANCE.isEnabled(C1BZM.ENABLE_DOWN_LOGGER);
        } else if (i != 2) {
            throw new C1954807lC();
        }
        return zIsEnabled ? new HandlerThread("live_logger", LivePlayThreadPrioritySettings.INSTANCE.getThreadPriority(C1BZM.ENABLE_DOWN_LOGGER)) : new HandlerThread("live_logger");
    }

    public static final HandlerThread LJI() {
        LivePlayThreadPrioritySettings livePlayThreadPrioritySettings = LivePlayThreadPrioritySettings.INSTANCE;
        C1BZM c1bzm = C1BZM.ENABLE_UP_CTL;
        return livePlayThreadPrioritySettings.isEnabled(c1bzm) ? new HandlerThread("single-live-player-thread", livePlayThreadPrioritySettings.getThreadPriority(c1bzm)) : new HandlerThread("single-live-player-thread", 10);
    }

    public static final void LJII(Object obj) {
        Object obj2;
        if (!LivePlayThreadPrioritySettings.INSTANCE.isEnabled(C1BZM.ENABLE_DOWN_VLM_EXE)) {
            return;
        }
        C089E c089e = new C089E(obj.getClass().getDeclaredFields());
        while (c089e.hasNext()) {
            Field field = (Field) c089e.next();
            boolean zIsAccessible = field.isAccessible();
            if (!zIsAccessible) {
                field.setAccessible(true);
            }
            try {
                try {
                    obj2 = field.get(obj);
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (!zIsAccessible) {
                    }
                }
                if (obj2 != null && ExecutorService.class.isAssignableFrom(obj2.getClass())) {
                    ExecutorService executorService = (ExecutorService) obj2;
                    if (executorService instanceof ThreadPoolExecutor) {
                        final ThreadFactory threadFactory = ((ThreadPoolExecutor) executorService).getThreadFactory();
                        if (!(threadFactory instanceof C1BZO)) {
                            ((ThreadPoolExecutor) executorService).setThreadFactory(new ThreadFactory(threadFactory) { // from class: X.1BZO
                                public final ThreadFactory LL;

                                {
                                    this.LL = threadFactory;
                                }

                                @Override // java.util.concurrent.ThreadFactory
                                public final Thread newThread(Runnable runnable) {
                                    return this.LL.newThread(new Runnable(runnable) { // from class: X.1BZK
                                        public final Runnable LL;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean zLIZ;
                                            C1C7U.LIZ("LiveThreadPriorityPromoteUtils$PriorityDowngradeRunnable@837a.run");
                                            try {
                                                int threadPriority = LivePlayThreadPrioritySettings.INSTANCE.getThreadPriority(C1BZM.ENABLE_DOWN_VLM_EXE);
                                                if (Process.getThreadPriority(Process.myTid()) != threadPriority) {
                                                    Process.setThreadPriority(Process.myTid(), threadPriority);
                                                }
                                                this.LL.run();
                                            } finally {
                                                if (!zLIZ) {
                                                }
                                            }
                                            C1C7U.LIZIZ("LiveThreadPriorityPromoteUtils$PriorityDowngradeRunnable@837a.run");
                                        }

                                        {
                                            this.LL = runnable;
                                        }
                                    });
                                }
                            });
                        }
                    }
                    if (!zIsAccessible) {
                        field.setAccessible(false);
                        return;
                    }
                    return;
                }
                if (!zIsAccessible) {
                    field.setAccessible(false);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!zIsAccessible) {
                    field.setAccessible(false);
                }
                throw th;
            }
        }
    }

    public static void LJ(boolean z, EnumC479890Irr enumC479890Irr) {
        int i = C479900Irs.LIZ[enumC479890Irr.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
        } else if (!LivePlayThreadPrioritySettings.INSTANCE.isEnabled(C1BZM.ENABLE_DOWN_TEA)) {
            return;
        }
        Iterator it2 = ((ArrayList) LIZIZ).iterator();
        while (it2.hasNext()) {
            ((C1BZP) it2.next()).LIZ(z);
        }
    }

    @Override // X.InterfaceC479850Irn
    public final void LIZIZ(WeakReference<Object> weakReference, EnumC479890Irr enumC479890Irr) {
        Object obj;
        WeakReference<Object> weakReference2 = LIZJ;
        if (weakReference2 != null) {
            obj = weakReference2.get();
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(obj, weakReference.get())) {
            LJ(false, enumC479890Irr);
            LIZJ = null;
        }
    }

    @Override // X.InterfaceC479850Irn
    public final void LIZJ(WeakReference<Object> weakReference, EnumC479890Irr enumC479890Irr) {
        LIZJ = weakReference;
        LJ(true, enumC479890Irr);
    }
}
