package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0UyT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC789750UyT implements Runnable {
    public static final Object LLILZLL = new Object();
    public static Boolean LLIZ = null;
    public static Boolean LLIZLLLIL = null;
    public final Context LL;
    public final C812200Vta LLILLJJLI;
    public final PowerManager.WakeLock LLILLL;
    public final C810910VrV LLILZ;
    public final long LLILZIL;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean LIZLLL() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r1 = r2.LL     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = X.C786410Ut5.H2(r1, r0)     // Catch: java.lang.Throwable -> L1f
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1a
            android.net.NetworkInfo r0 = X.C786410Ut5.LJIJ(r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1a
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1a
            goto L1c
        L1a:
            r0 = 0
            goto L1d
        L1c:
            r0 = 1
        L1d:
            monitor-exit(r2)
            return r0
        L1f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC789750UyT.LIZLLL():boolean");
    }

    public final void LIZ() {
        PowerManager.WakeLock wakeLock;
        if (LIZJ(this.LL)) {
            this.LLILLL.acquire(C789760UyU.LIZ);
        }
        try {
            try {
                try {
                    C810910VrV c810910VrV = this.LLILZ;
                    synchronized (c810910VrV) {
                        c810910VrV.LJI = true;
                    }
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                this.LLILZ.LJ(false);
                if (!LIZJ(this.LL)) {
                    return;
                } else {
                    wakeLock = this.LLILLL;
                }
            }
            if (!this.LLILLJJLI.LIZLLL()) {
                this.LLILZ.LJ(false);
                if (LIZJ(this.LL)) {
                    try {
                        this.LLILLL.release();
                        return;
                    } catch (RuntimeException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        return;
                    }
                }
                return;
            }
            if (!LIZIZ(this.LL) || LIZLLL()) {
                if (this.LLILZ.LJFF()) {
                    this.LLILZ.LJ(false);
                } else {
                    this.LLILZ.LJI(this.LLILZIL);
                }
                if (LIZJ(this.LL)) {
                    wakeLock = this.LLILLL;
                    wakeLock.release();
                    return;
                }
                return;
            }
            C786410Ut5.LJIJJ(this.LL, new BroadcastReceiver(this, this) { // from class: X.0Uuo
                public RunnableC789750UyT LIZ;

                @Override // android.content.BroadcastReceiver
                public final synchronized void onReceive(Context context, Intent intent) {
                    LIZIZ(this, context, intent);
                }

                public final synchronized void LIZ(Context context) {
                    RunnableC789750UyT runnableC789750UyT = this.LIZ;
                    if (runnableC789750UyT == null) {
                        return;
                    }
                    if (!runnableC789750UyT.LIZLLL()) {
                        return;
                    }
                    RunnableC789750UyT runnableC789750UyT2 = this.LIZ;
                    runnableC789750UyT2.LLILZ.LJFF.schedule(runnableC789750UyT2, 0L, TimeUnit.SECONDS);
                    C786410Ut5.LJJIFFI(context, this);
                    this.LIZ = null;
                }

                {
                    this.LIZ = this;
                }

                public static void LIZIZ(C787480Uuo c787480Uuo, Context context, Intent intent) {
                    if (!C2214201BlK.LJIIJJI && intent != null) {
                        if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                            C2188191AkT.LIZIZ();
                        }
                    }
                    if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        c787480Uuo.LIZ(context);
                    } else {
                        C2408409cA.LIZ();
                        c787480Uuo.LIZ(context);
                    }
                }
            }, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            if (LIZJ(this.LL)) {
                try {
                    this.LLILLL.release();
                } catch (RuntimeException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (LIZJ(this.LL)) {
                try {
                    this.LLILLL.release();
                    throw th;
                } catch (RuntimeException e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    throw th;
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("TopicsSyncTask@9299.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TopicsSyncTask@9299.run");
    }

    public static boolean LIZIZ(Context context) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        synchronized (LLILZLL) {
            try {
                Boolean bool = LLIZLLLIL;
                if (bool == null) {
                    if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                        zBooleanValue = true;
                    } else {
                        zBooleanValue = false;
                    }
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                LLIZLLLIL = boolValueOf;
                zBooleanValue2 = boolValueOf.booleanValue();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zBooleanValue2;
    }

    public static boolean LIZJ(Context context) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        synchronized (LLILZLL) {
            try {
                Boolean bool = LLIZ;
                if (bool == null) {
                    if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                        zBooleanValue = true;
                    } else {
                        zBooleanValue = false;
                    }
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                LLIZ = boolValueOf;
                zBooleanValue2 = boolValueOf.booleanValue();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zBooleanValue2;
    }

    public RunnableC789750UyT(C810910VrV c810910VrV, Context context, C812200Vta c812200Vta, long j) {
        this.LLILZ = c810910VrV;
        this.LL = context;
        this.LLILZIL = j;
        this.LLILLJJLI = c812200Vta;
        this.LLILLL = ((PowerManager) C786410Ut5.H2(context, "power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }
}
