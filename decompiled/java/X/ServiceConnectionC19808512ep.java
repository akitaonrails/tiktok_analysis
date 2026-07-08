package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12ep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class ServiceConnectionC19808512ep implements ServiceConnection {
    public final String LL;
    public final /* synthetic */ C12ZL LLILLJJLI;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LLILLJJLI.LIZ.LJIILJJIL().LJIILIIL.LIZJ("Install Referrer Service disconnected");
    }

    public ServiceConnectionC19808512ep(C12ZL c12zl, String str) {
        this.LLILLJJLI = c12zl;
        this.LL = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
        final C0WH2 c820570WGx;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/google/android/gms/measurement/internal/zzgt", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yzxe1dYm0ZJPLqwOID9zPVdd3eEmUDB28eI", new String[]{"016a9"})));
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
        if (iBinder == null) {
            this.LLILLJJLI.LIZ.LJIILJJIL().LJIIIIZZ.LIZJ("Install Referrer connection returned with null binder");
            return;
        }
        try {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (iInterfaceQueryLocalInterface instanceof C0WH2) {
                c820570WGx = (C0WH2) iInterfaceQueryLocalInterface;
                if (c820570WGx == null) {
                    this.LLILLJJLI.LIZ.LJIILJJIL().LJIIIIZZ.LIZJ("Install Referrer Service implementation was not found");
                    return;
                }
            } else {
                c820570WGx = new C820570WGx(iBinder);
            }
            this.LLILLJJLI.LIZ.LJIILJJIL().LJIILIIL.LIZJ("Install Referrer Service connected");
            this.LLILLJJLI.LIZ.LJIIL().LJIILL(new Runnable(this, c820570WGx, this) { // from class: X.12bT
                public final /* synthetic */ C0WH2 LL;
                public final /* synthetic */ ServiceConnectionC19808512ep LLILLJJLI;

                public final void LIZ() {
                    ServiceConnectionC19808512ep serviceConnectionC19808512ep = this.LLILLJJLI;
                    C12ZL c12zl = serviceConnectionC19808512ep.LLILLJJLI;
                    String str = serviceConnectionC19808512ep.LL;
                    C0WH2 c0wh2 = this.LL;
                    c12zl.LIZ.LJIIL().LJ();
                    if (c0wh2 != null) {
                        Bundle bundle = new Bundle();
                        C786410Ut5.LJJJI("package_name", str, bundle);
                        try {
                            if (c0wh2.LJJ(bundle) == null) {
                                c12zl.LIZ.LJIILJJIL().LJFF.LIZJ("Install Referrer Service returned a null response");
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            c12zl.LIZ.LJIILJJIL().LJFF.LIZ(e.getMessage(), "Exception occurred while retrieving the Install Referrer");
                        }
                    } else {
                        c12zl.LIZ.LJIILJJIL().LJIIIIZZ.LIZJ("Attempting to use Install Referrer Service while it is not initialized");
                    }
                    c12zl.LIZ.LJIIL().LJ();
                    c12zl.LIZ.getClass();
                    throw new IllegalStateException("Unexpected call on client side");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("zzgs@38ed.run");
                    try {
                        LIZ();
                        throw null;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                        C1C7U.LIZIZ("zzgs@38ed.run");
                    }
                }

                {
                    this.LLILLJJLI = this;
                }
            });
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.LIZ.LJIILJJIL().LJIIIIZZ.LIZ(e, "Exception occurred while calling Install Referrer API");
        }
    }
}
