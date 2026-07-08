package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0Wl9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ServiceConnectionC832450Wl9 implements ServiceConnection, InterfaceC812640VuI {
    public final Map LL = new HashMap();
    public int LLILLJJLI = 2;
    public boolean LLILLL;
    public IBinder LLILZ;
    public final C0W7T LLILZIL;
    public ComponentName LLILZLL;
    public final /* synthetic */ C832440Wl8 LLIZ;

    public final void LIZ(Executor executor) {
        this.LLILLJJLI = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            C832440Wl8 c832440Wl8 = this.LLIZ;
            C812630VuH c812630VuH = c832440Wl8.LJI;
            Context context = c832440Wl8.LJ;
            boolean zLIZLLL = c812630VuH.LIZLLL(context, this.LLILZIL.LIZ(context), this, this.LLILZIL.LIZJ, executor);
            this.LLILLL = zLIZLLL;
            if (zLIZLLL) {
                C786410Ut5.LJLJLJ(this.LLIZ.LJFF, this.LLIZ.LJFF.obtainMessage(1, this.LLILZIL), this.LLIZ.LJIIIIZZ);
            } else {
                this.LLILLJJLI = 2;
                try {
                    C832440Wl8 c832440Wl82 = this.LLIZ;
                    c832440Wl82.LJI.LIZJ(c832440Wl82.LJ, this);
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.LLIZ.LIZLLL) {
            try {
                this.LLIZ.LJFF.removeMessages(1, this.LLILZIL);
                this.LLILZ = null;
                this.LLILZLL = componentName;
                Iterator it2 = ((HashMap) this.LL).values().iterator();
                while (it2.hasNext()) {
                    ((ServiceConnection) it2.next()).onServiceDisconnected(componentName);
                }
                this.LLILLJJLI = 2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public ServiceConnectionC832450Wl9(C832440Wl8 c832440Wl8, C0W7T c0w7t) {
        this.LLIZ = c832440Wl8;
        this.LLILZIL = c0w7t;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
        ComponentName componentName2 = componentName;
        IBinder iBinder2 = iBinder;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/google/android/gms/common/internal/zzo", "onServiceConnected", this, new Object[]{componentName2, iBinder2}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz/cVtGgVoCOLFl82r4DBRtwtJQ", new String[]{"016a9"})));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                componentName2 = (ComponentName) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                iBinder2 = (IBinder) obj2;
            }
        }
        synchronized (this.LLIZ.LIZLLL) {
            try {
                this.LLIZ.LJFF.removeMessages(1, this.LLILZIL);
                this.LLILZ = iBinder2;
                this.LLILZLL = componentName2;
                Iterator it2 = ((HashMap) this.LL).values().iterator();
                while (it2.hasNext()) {
                    ((ServiceConnection) it2.next()).onServiceConnected(componentName2, iBinder2);
                }
                this.LLILLJJLI = 1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
