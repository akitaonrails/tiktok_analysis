package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0Vtb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C812210Vtb {
    public static final long LJIIL = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService LJIILIIL = null;
    public static final Object LJIILJJIL = new Object();
    public final Object LIZ;
    public final PowerManager.WakeLock LIZIZ;
    public int LIZJ;
    public Future<?> LIZLLL;
    public long LJ;
    public final Set<C2289341EjE> LJFF;
    public boolean LJI;
    public C812270Vth LJII;
    public final C833180WmK LJIIIIZZ;
    public final Map<String, C812280Vti> LJIIIZ;
    public final AtomicInteger LJIIJ;
    public final ScheduledExecutorService LJIIJJI;

    static {
        new Object() { // from class: X.0Vtj
        };
    }

    public final boolean LIZIZ() {
        boolean z;
        synchronized (this.LIZ) {
            try {
                z = this.LIZJ > 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final void LIZJ() {
        C812280Vti c812280Vti;
        this.LJIIJ.decrementAndGet();
        synchronized (this.LIZ) {
            try {
                if (this.LJI) {
                    TextUtils.isEmpty(null);
                }
                if (((HashMap) this.LJIIIZ).containsKey(null) && (c812280Vti = (C812280Vti) ((HashMap) this.LJIIIZ).get(null)) != null) {
                    int i = c812280Vti.LIZ - 1;
                    c812280Vti.LIZ = i;
                    if (i == 0) {
                        ((HashMap) this.LJIIIZ).remove(null);
                    }
                }
                LJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL() {
        if (((HashSet) this.LJFF).isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.LJFF);
        ((HashSet) this.LJFF).clear();
        if (arrayList.size() <= 0) {
            return;
        }
        ListProtector.get(arrayList, 0);
        throw null;
    }

    public final void LJ() {
        synchronized (this.LIZ) {
            try {
                if (LIZIZ()) {
                    if (this.LJI) {
                        int i = this.LIZJ - 1;
                        this.LIZJ = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.LIZJ = 0;
                    }
                    LIZLLL();
                    Iterator it2 = ((HashMap) this.LJIIIZ).values().iterator();
                    while (it2.hasNext()) {
                        ((C812280Vti) it2.next()).LIZ = 0;
                    }
                    ((HashMap) this.LJIIIZ).clear();
                    Future<?> future = this.LIZLLL;
                    if (future != null) {
                        future.cancel(false);
                        this.LIZLLL = null;
                        this.LJ = 0L;
                    }
                    try {
                        if (this.LIZIZ.isHeld()) {
                            try {
                                this.LIZIZ.release();
                                if (this.LJII != null) {
                                    this.LJII = null;
                                }
                            } catch (RuntimeException e) {
                                TryCatchGuardChecker.doCheck(e);
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                if (this.LJII != null) {
                                    this.LJII = null;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (this.LJII != null) {
                            this.LJII = null;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public C812210Vtb(Context context) throws Throwable {
        ScheduledExecutorService scheduledExecutorServiceF4;
        String packageName = context.getPackageName();
        this.LIZ = new Object();
        this.LIZJ = 0;
        this.LJFF = new HashSet();
        this.LJI = true;
        this.LJIIIIZZ = C833180WmK.LIZ;
        this.LJIIIZ = new HashMap();
        this.LJIIJ = new AtomicInteger(0);
        C0W3J.LJFF("WakeLock: wakeLockName must not be empty", "wake:com.google.firebase.iid.WakeLockHolder");
        C786410Ut5.N3(context);
        this.LJII = null;
        if (!"com.google.android.gms".equals(context.getPackageName()) && "wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
            "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
        }
        PowerManager powerManager = (PowerManager) C786410Ut5.H2(context, "power");
        if (powerManager != null) {
            this.LIZIZ = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            Method method = C812220Vtc.LIZ;
            if (context.getPackageManager() != null) {
                if (C812450Vtz.LIZ(context).LIZ.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0) {
                    packageName = C812240Vte.LIZ(packageName) ? context.getPackageName() : packageName;
                    if (context.getPackageManager() != null && packageName != null) {
                        try {
                            ApplicationInfo applicationInfoLIZ = C812450Vtz.LIZ(context).LIZ(0, packageName);
                            if (applicationInfoLIZ != null) {
                                int i = applicationInfoLIZ.uid;
                                WorkSource workSource = new WorkSource();
                                Method method2 = C812220Vtc.LIZIZ;
                                if (method2 != null) {
                                    try {
                                        C2204961BRm.a0(method2, workSource, new Object[]{Integer.valueOf(i), packageName}, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz/cVtGgVoCJKvAiqb6z7BIHRrfrPYGJp7oQg==", new String[]{"016a9"}));
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                                    }
                                } else {
                                    Method method3 = C812220Vtc.LIZ;
                                    if (method3 != null) {
                                        try {
                                            C2204961BRm.a0(method3, workSource, new Object[]{Integer.valueOf(i)}, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz/cVtGgVoCJKvAiqb6z7BIHRrfrPYGJp7oQg==", new String[]{"016a9"}));
                                        } catch (Exception e2) {
                                            TryCatchGuardChecker.doCheck(e2);
                                            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                                        }
                                    }
                                }
                                try {
                                    this.LIZIZ.setWorkSource(workSource);
                                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                    Log.wtf("WakeLock", e3.toString());
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e4) {
                        }
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = LJIILIIL;
            if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                synchronized (LJIILJJIL) {
                    try {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = LJIILIIL;
                        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                            if (C0WP5.LIZJ()) {
                                scheduledExecutorServiceF4 = new C822660WOy(1);
                            } else {
                                scheduledExecutorServiceF4 = C786410Ut5.f4(1);
                            }
                            scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceF4);
                            LJIILIIL = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(e4);
                    }
                }
            }
            this.LJIIJJI = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new C812250Vtf(sb.toString());
    }

    public final void LIZ(long j) {
        this.LJIIJ.incrementAndGet();
        long j2 = Long.MAX_VALUE;
        long jMax = Math.max(Math.min(Long.MAX_VALUE, LJIIL), 1L);
        if (j > 0) {
            jMax = Math.min(j, jMax);
        }
        synchronized (this.LIZ) {
            try {
                if (!LIZIZ()) {
                    this.LJII = C812270Vth.LL;
                    this.LIZIZ.acquire();
                    this.LJIIIIZZ.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.LIZJ++;
                if (this.LJI) {
                    TextUtils.isEmpty(null);
                }
                C812280Vti c812280Vti = (C812280Vti) ((HashMap) this.LJIIIZ).get(null);
                if (c812280Vti == null) {
                    c812280Vti = new C812280Vti(0);
                    ((HashMap) this.LJIIIZ).put(null, c812280Vti);
                }
                c812280Vti.LIZ++;
                this.LJIIIIZZ.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - jElapsedRealtime > jMax) {
                    j2 = jElapsedRealtime + jMax;
                }
                if (j2 > this.LJ) {
                    this.LJ = j2;
                    Future<?> future = this.LIZLLL;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.LIZLLL = this.LJIIJJI.schedule(new Runnable() { // from class: X.0Vtd
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("zza@a0a0.run");
                            try {
                                C812210Vtb c812210Vtb = this.LL;
                                synchronized (c812210Vtb.LIZ) {
                                    try {
                                        if (c812210Vtb.LIZIZ()) {
                                            c812210Vtb.LIZLLL();
                                            if (c812210Vtb.LIZIZ()) {
                                                c812210Vtb.LIZJ = 1;
                                                c812210Vtb.LJ();
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("zza@a0a0.run");
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
