package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0VuH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C812630VuH {
    public static final Object LIZIZ = new Object();
    public static volatile C812630VuH LIZJ;
    public final ConcurrentHashMap LIZ = new ConcurrentHashMap();

    public static C812630VuH LIZIZ() {
        if (LIZJ == null) {
            synchronized (LIZIZ) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C812630VuH();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C812630VuH c812630VuH = LIZJ;
        C0W3J.LJIIIIZZ(c812630VuH);
        return c812630VuH;
    }

    public final void LIZJ(Context context, ServiceConnection serviceConnection) {
        if ((!(serviceConnection instanceof InterfaceC812640VuI)) && this.LIZ.containsKey(serviceConnection)) {
            try {
                try {
                    context.unbindService((ServiceConnection) this.LIZ.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                this.LIZ.remove(serviceConnection);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZ.remove(serviceConnection);
                throw th;
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public final boolean LIZ(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        context.getClass();
        return LIZLLL(context, intent, serviceConnection, i, null);
    }

    public static final boolean LJ(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        } else {
            z = false;
        }
        if (z && executor != null) {
            return C2204961BRm.LJJJIL(context, intent, i, executor, serviceConnection, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz/cVtGgVoCIqvF3k/NWGnG3ATgprKrIDY156z+6VE=", new String[]{"016a9"}));
        }
        return C2204961BRm.LJJJJ(context, intent, serviceConnection, i, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz/cVtGgVoCIqvF3k/NWGnG3ATgprKrIDY156z+6VE=", new String[]{"016a9"}));
    }

    public final boolean LIZLLL(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) throws Throwable {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String strLJJIJIL = C2204961BRm.LJJIJIL(component, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz/cVtGgVoCIqvF3k/NWGnG3ATgprKrIDY156z+6VE=", new String[]{"016a9"}));
            "com.google.android.gms".equals(strLJJIJIL);
            try {
                if ((C812450Vtz.LIZ(context).LIZ(0, strLJJIJIL).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (!(serviceConnection instanceof InterfaceC812640VuI)) {
            Object objPutIfAbsent = this.LIZ.putIfAbsent(serviceConnection, serviceConnection);
            if (objPutIfAbsent != null && serviceConnection != objPutIfAbsent) {
                intent.getAction();
            }
            try {
                boolean zLJ = LJ(context, intent, serviceConnection, i, executor);
                if (!zLJ) {
                    this.LIZ.remove(serviceConnection, serviceConnection);
                    return false;
                }
                return zLJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZ.remove(serviceConnection, serviceConnection);
                throw th;
            }
        }
        return LJ(context, intent, serviceConnection, i, executor);
    }
}
