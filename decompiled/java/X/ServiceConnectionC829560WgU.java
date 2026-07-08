package X;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: X.0WgU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ServiceConnectionC829560WgU implements InterfaceC831160Wj4, ServiceConnection {
    @Override // X.InterfaceC831160Wj4
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // X.InterfaceC831160Wj4
    public final Feature[] getAvailableFeatures() {
        return new Feature[0];
    }

    @Override // X.InterfaceC831160Wj4
    public final String getEndpointPackageName() {
        C0W3J.LJIIIIZZ(null);
        throw null;
    }

    @Override // X.InterfaceC831160Wj4
    public final String getLastDisconnectMessage() {
        return null;
    }

    @Override // X.InterfaceC831160Wj4
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // X.InterfaceC831160Wj4
    public final void getRemoteService(InterfaceC828880WfO interfaceC828880WfO, Set<Scope> set) {
    }

    @Override // X.InterfaceC831160Wj4
    public final void onUserSignOut(InterfaceC829570WgV interfaceC829570WgV) {
    }

    @Override // X.InterfaceC831160Wj4
    public final boolean providesSignIn() {
        return false;
    }

    @Override // X.InterfaceC831160Wj4
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // X.InterfaceC831160Wj4
    public final boolean requiresSignIn() {
        return false;
    }

    @Override // X.InterfaceC831160Wj4
    public final Intent getSignInIntent() {
        return new Intent();
    }

    @Override // X.InterfaceC831160Wj4
    public final void disconnect() {
        C786410Ut5.u3();
        throw null;
    }

    @Override // X.InterfaceC831160Wj4
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    @Override // X.InterfaceC831160Wj4
    public final boolean isConnected() {
        C786410Ut5.u3();
        throw null;
    }

    @Override // X.InterfaceC831160Wj4
    public final boolean isConnecting() {
        C786410Ut5.u3();
        throw null;
    }

    @Override // X.InterfaceC831160Wj4
    public final void connect(InterfaceC832240Wko interfaceC832240Wko) {
        C786410Ut5.u3();
        throw null;
    }

    @Override // X.InterfaceC831160Wj4
    public final void disconnect(String str) {
        C786410Ut5.u3();
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C786410Ut5.LJJZZIII(null, new Runnable() { // from class: X.0GUe
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("zacf@eb5.run");
                try {
                    ServiceConnectionC829560WgU serviceConnectionC829560WgU = this.LL;
                    serviceConnectionC829560WgU.getClass();
                    serviceConnectionC829560WgU.getClass();
                    throw null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                    C1C7U.LIZIZ("zacf@eb5.run");
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/google/android/gms/common/api/internal/NonGmsServiceBrokerClient", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz/cVtGgVoCMK+rT3RoHNE+Hqt0G+56bM8dRpfPjDLLvyChNiddLAfsiLD6mxg=", new String[]{"016a9"})));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            if (obj2 != null) {
                iBinder = (IBinder) obj2;
            }
        }
        C786410Ut5.LJJZZIII(null, new Runnable() { // from class: X.0Gif
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("zacg@eb4.run");
                try {
                    ServiceConnectionC829560WgU serviceConnectionC829560WgU = this.LL;
                    IBinder iBinder2 = iBinder;
                    serviceConnectionC829560WgU.getClass();
                    serviceConnectionC829560WgU.getClass();
                    String.valueOf(iBinder2);
                    new Bundle();
                    throw null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                    C1C7U.LIZIZ("zacg@eb4.run");
                }
            }
        });
    }
}
