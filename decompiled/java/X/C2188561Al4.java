package X;

import Y.ARunnableS133S0100000_33;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.memrelief.gc.GCMonitor;
import com.bytedance.memrelief.pressure.MemoryPressureWatcher;
import com.bytedance.memrelief.watcher.GcWatcherNormal;
import com.bytedance.memrelief.watcher.GcWatcherQueue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: X.1Al4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2188561Al4 {
    public volatile boolean LIZ;
    public long LIZIZ;
    public boolean LIZLLL;
    public double LJ;
    public double LJFF;
    public long LJI;
    public final List<Integer> LJIIJJI;
    public WeakReference<Activity> LJIIL;
    public final C2188751AlN LJIILIIL;
    public long LJIILJJIL;
    public int LIZJ = 2;
    public long LJII = (long) (C2367709Pn.LJ() * 0.95d);
    public boolean LJIIIIZZ = true;
    public int LJIIIZ = C09Q3.UNKNOWN.ordinal();
    public boolean LJIIJ = false;

    /* JADX WARN: Type inference failed for: r0v10, types: [X.1AlN] */
    public C2188561Al4() {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{-100}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        this.LJIIJJI = new ArrayList(Collections.unmodifiableList(arrayList));
        this.LJIILIIL = new ComponentCallbacks2C2188761AlO() { // from class: X.1AlN
            @Override // android.content.ComponentCallbacks
            public final void onLowMemory() {
                this.LL.LJI(-100);
            }

            @Override // android.content.ComponentCallbacks2
            public final void onTrimMemory(int i) {
                this.LL.LJI(i);
            }
        };
        this.LJIILJJIL = 0L;
    }

    public static void LJII(InterfaceC2188711AlJ interfaceC2188711AlJ) {
        synchronized (C09QK.LIZ) {
            try {
                ((ArrayList) C09QK.LIZIZ).add(interfaceC2188711AlJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIIIIZZ(InterfaceC2188721AlK interfaceC2188721AlK) {
        synchronized (C2188651AlD.LIZ) {
            try {
                ((ArrayList) C2188651AlD.LIZIZ).add(interfaceC2188721AlK);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean LJIIJ(Context context) {
        return LJIIIZ(C2188421Akq.LIZLLL, context);
    }

    public final int LIZ(long j) {
        long j2 = this.LJII;
        if (j2 > 0 && j >= j2) {
            return 9;
        }
        return 8;
    }

    public final void LIZIZ(Application application) {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        this.LIZIZ = SystemClock.uptimeMillis();
        if (!this.LJIIJ) {
            int i = this.LIZJ;
            if (i == 1) {
                GcWatcherQueue.init(this.LIZLLL, new ARunnableS133S0100000_33(this, 82));
            } else if (i == 2) {
                GcWatcherNormal.init(this.LIZLLL, new ARunnableS133S0100000_33(this, 83));
            } else if (i == 3) {
                double d = this.LJ;
                double d2 = this.LJFF;
                C2188731AlL c2188731AlL = new C2188731AlL(this);
                GCMonitor gCMonitor = new GCMonitor();
                gCMonitor.LIZ();
                gCMonitor.LIZIZ(d, d2);
                gCMonitor.LIZIZ = c2188731AlL;
            }
        }
        if (this.LJIIJ || this.LJIIIZ > 0) {
            MemoryPressureWatcher.getInstance().registerMemoryLevelChangeListener(new InterfaceC1603810rpz() { // from class: X.1AlC
                @Override // X.InterfaceC1603810rpz
                public final void LIZ(C09Q3 c09q3) {
                    if (this.LIZ.LJIIIZ > 0) {
                        int iOrdinal = c09q3.ordinal();
                        C2188561Al4 c2188561Al4 = this.LIZ;
                        if (iOrdinal >= c2188561Al4.LJIIIZ) {
                            c2188561Al4.LJI(-100);
                        }
                    }
                }

                @Override // X.InterfaceC1603810rpz
                public final void LIZIZ(C09Q3 c09q3) {
                    if (!this.LIZ.LJIIJ) {
                        return;
                    }
                    if (c09q3.compareTo(C09Q3.EXTREME) >= 0) {
                        this.LIZ.LJFF(9, true);
                    } else {
                        if (c09q3.compareTo(C09Q3.HIGH) < 0) {
                            return;
                        }
                        this.LIZ.LJFF(8, true);
                    }
                }
            });
        }
        if (this.LJIIIIZZ) {
            application.registerComponentCallbacks(this.LJIILIIL);
        }
        application.registerActivityLifecycleCallbacks(new C09PC() { // from class: X.13pV
            @Override // X.C09PC, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                this.LL.LJIIL = new WeakReference<>(activity);
            }
        });
    }

    public final void LJ(C1768270w7F c1768270w7F) {
        if (c1768270w7F.LIZJ == null || LIZJ(SystemClock.uptimeMillis(), C2188421Akq.LIZIZ)) {
            return;
        }
        c1768270w7F.LIZIZ = C09QO.LOW_BIZ_MANUAL;
        c1768270w7F.LIZLLL = LIZ(C2367709Pn.LIZLLL());
        C2188611Al9.LIZ(c1768270w7F);
    }

    public final void LJI(int i) {
        if (LIZJ(SystemClock.uptimeMillis(), C2188421Akq.LIZ)) {
            return;
        }
        if (((ArrayList) this.LJIIJJI).contains(Integer.valueOf(i))) {
            C1768280w7G c1768280w7G = new C1768280w7G();
            c1768280w7G.LIZJ = EnumC21267218Ko.GLOBAL;
            c1768280w7G.LIZIZ = C09QO.LOW_PHYSICAL_MEM;
            c1768280w7G.LJ = i;
            c1768280w7G.LIZ = -1L;
            C2188611Al9.LIZ(new C1768270w7F(c1768280w7G));
        }
    }

    public static boolean LJIIIZ(int i, Context context) {
        int i2;
        if ((i & 1) != 0) {
            EnumC2188591Al7 enumC2188591Al7 = C2188421Akq.LJ;
            if (context != null && C2188571Al5.LIZJ(context, enumC2188591Al7)) {
                return true;
            }
        }
        if ((i & 2) != 0 && C2367709Pn.LJIIIZ()) {
            return true;
        }
        if ((i & 4) != 0 && (!Process.is64Bit())) {
            return true;
        }
        if ((i & 8) != 0) {
            try {
                if (C2188571Al5.LIZIZ == -1) {
                    boolean zIsLowRamDevice = ((ActivityManager) C786410Ut5.H2(C786410Ut5.N3(context), "activity")).isLowRamDevice();
                    if (zIsLowRamDevice) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    C2188571Al5.LIZIZ = i2;
                    if (zIsLowRamDevice) {
                        return true;
                    }
                } else if (C2188571Al5.LIZIZ == 1) {
                    return true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return false;
    }

    public final boolean LIZJ(long j, long j2) {
        if (j - this.LIZIZ > 30000 && j - C2188611Al9.LIZ > j2) {
            return false;
        }
        return true;
    }

    public final void LJFF(int i, boolean z) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (LIZJ(jUptimeMillis, C2188421Akq.LIZ)) {
            return;
        }
        if (!z && this.LIZLLL && this.LIZJ != 3) {
            long j = C2188421Akq.LIZJ;
            if (j > 0) {
                if (jUptimeMillis - this.LJIILJJIL < j) {
                    return;
                } else {
                    this.LJIILJJIL = jUptimeMillis;
                }
            }
            long jLIZLLL = C2367709Pn.LIZLLL();
            if (jLIZLLL < this.LJI) {
                return;
            } else {
                i = LIZ(jLIZLLL);
            }
        }
        if (i == -1) {
            i = LIZ(C2367709Pn.LIZLLL());
        }
        WeakReference<Activity> weakReference = this.LJIIL;
        if (weakReference != null) {
            weakReference.get();
        }
        C1768280w7G c1768280w7G = new C1768280w7G();
        c1768280w7G.LIZJ = EnumC21267218Ko.GLOBAL;
        c1768280w7G.LIZIZ = C09QO.LOW_JAVA_MEM;
        c1768280w7G.LIZLLL = i;
        C2188611Al9.LIZ(new C1768270w7F(c1768280w7G));
    }
}
