package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: renamed from: X.1B9J, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B9J implements ServiceConnection {
    public final /* synthetic */ C1BAP LL;

    public /* synthetic */ C1B9J(C1BAP c1bap) {
        Objects.requireNonNull(c1bap);
        this.LL = c1bap;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1BAP c1bap = this.LL;
        c1bap.LJJIL = null;
        c1bap.LJJIJLIJ = 0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
        C1B9H c1b9g;
        IBinder iBinder2 = iBinder;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/android/billingclient/api/zzcx", "onServiceConnected", this, new Object[]{componentName, iBinder2}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgM0W9jTXFNvRxuIaqGa/t0aV0yLu9rODctw3qJB0w==", new String[]{"01cc3"})));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            if (obj2 != null) {
                iBinder2 = (IBinder) obj2;
            }
        }
        C2200451BAd.LJI("BillingClientTesting", "Billing Override Service connected.");
        C1BAP c1bap = this.LL;
        if (iBinder2 == null) {
            c1b9g = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
            if (iInterfaceQueryLocalInterface instanceof C1B9H) {
                c1b9g = (C1B9H) iInterfaceQueryLocalInterface;
            } else {
                c1b9g = new C1B9G(iBinder2);
            }
        }
        c1bap.LJJIL = c1b9g;
        c1bap.LJJIJLIJ = 2;
        c1bap.LJJJLZIJ(26);
    }
}
