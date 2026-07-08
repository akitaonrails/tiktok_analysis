package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.13Tm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class ServiceConnectionC20016413Tm<INTERFACE> implements ServiceConnection {
    public final MutableLiveData<INTERFACE> LL;
    public final InterfaceC20016613To<INTERFACE> LLILLJJLI;

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LL.setValue(null);
    }

    public ServiceConnectionC20016413Tm(MutableLiveData<INTERFACE> mutableLiveData, InterfaceC20016613To<INTERFACE> interfaceC20016613To) {
        this.LL = mutableLiveData;
        this.LLILLJJLI = interfaceC20016613To;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/ss/android/ugc/cut_ui/AbsServiceClient$Connection", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3ssaFgmb6SJYYz92SDNGWi3WmEKPSRd", null)));
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
        if (iBinder != null) {
            this.LL.setValue((INTERFACE) this.LLILLJJLI.LIZ(iBinder));
        }
    }
}
