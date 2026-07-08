package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: X.0VuJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ServiceConnectionC812650VuJ implements ServiceConnection {
    public boolean LL;
    public final BlockingQueue LLILLJJLI = new LinkedBlockingQueue();

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public final IBinder LIZ(TimeUnit timeUnit) throws TimeoutException {
        C0W3J.LJII("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.LL) {
            this.LL = true;
            IBinder iBinder = (IBinder) ((LinkedBlockingQueue) this.LLILLJJLI).poll(10000L, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/google/android/gms/common/BlockingServiceConnection", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz/cVtGgVoCE7Mqn5kl70nwjAhaa0G2FIdjb7Js5iVQ+w==", new String[]{"016a9"})));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        Object obj = iBinder;
        if (objArr != null) {
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            obj = iBinder;
            if (obj3 != null) {
                obj = obj3;
            }
        }
        this.LLILLJJLI.add(obj);
    }
}
