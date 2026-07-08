package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: X.12eo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class ServiceConnectionC19808412eo implements ServiceConnection, InterfaceC832770Wlf, InterfaceC832830Wll {
    public volatile boolean LL;
    public volatile C832600WlO LLILLJJLI;
    public final /* synthetic */ C19804512eB LLILLL;

    public ServiceConnectionC19808412eo(C19804512eB c19804512eB) {
        this.LLILLL = c19804512eB;
    }

    @Override // X.InterfaceC832770Wlf
    public final void Js(int i) {
        C0W3J.LJ("MeasurementServiceConnection.onConnectionSuspended");
        this.LLILLL.LJIILJJIL().LJIIL.LIZJ("Service connection suspended");
        this.LLILLL.LJIIL().LJIILL(new Runnable() { // from class: X.12ek
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzma@3995.run");
                try {
                    C19804512eB c19804512eB = this.LL.LLILLL;
                    ComponentName componentName = new ComponentName(this.LL.LLILLL.LIZ.LIZ, "com.google.android.gms.measurement.AppMeasurementService");
                    c19804512eB.LJ();
                    if (c19804512eB.LIZLLL != null) {
                        c19804512eB.LIZLLL = null;
                        c19804512eB.LJIILJJIL().LJIILIIL.LIZ(componentName, "Disconnected from device MeasurementService");
                        c19804512eB.LJ();
                        c19804512eB.LJIL();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzma@3995.run");
            }
        });
    }

    public final void LIZ(Intent intent) {
        this.LLILLL.LJ();
        Context context = this.LLILLL.LIZ.LIZ;
        C812630VuH c812630VuHLIZIZ = C812630VuH.LIZIZ();
        synchronized (this) {
            try {
                if (this.LL) {
                    this.LLILLL.LJIILJJIL().LJIILIIL.LIZJ("Connection attempt already in progress");
                    return;
                }
                this.LLILLL.LJIILJJIL().LJIILIIL.LIZJ("Using local app measurement service");
                this.LL = true;
                c812630VuHLIZIZ.LIZ(context, intent, this.LLILLL.LIZJ, 129);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC832830Wll
    public final void LJJJZ(ConnectionResult connectionResult) {
        C0W3J.LJ("MeasurementServiceConnection.onConnectionFailed");
        C19806212eS c19806212eS = this.LLILLL.LIZ.LJIIIIZZ;
        if (c19806212eS != null && c19806212eS.LIZIZ) {
            c19806212eS.LJIIIIZZ.LIZ(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            try {
                this.LL = false;
                this.LLILLJJLI = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLILLL.LJIIL().LJIILL(new Runnable() { // from class: X.12fA
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzmd@3998.run");
                try {
                    C19804512eB c19804512eB = this.LL.LLILLL;
                    c19804512eB.LIZLLL = null;
                    c19804512eB.LJJIIJ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzmd@3998.run");
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(final ComponentName componentName) {
        C0W3J.LJ("MeasurementServiceConnection.onServiceDisconnected");
        this.LLILLL.LJIILJJIL().LJIIL.LIZJ("Service disconnected");
        this.LLILLL.LJIIL().LJIILL(new Runnable(this) { // from class: X.12eu
            public final /* synthetic */ ServiceConnectionC19808412eo LLILLJJLI;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzly@398e.run");
                try {
                    C19804512eB c19804512eB = this.LLILLJJLI.LLILLL;
                    ComponentName componentName2 = componentName;
                    c19804512eB.LJ();
                    if (c19804512eB.LIZLLL != null) {
                        c19804512eB.LIZLLL = null;
                        c19804512eB.LJIILJJIL().LJIILIIL.LIZ(componentName2, "Disconnected from device MeasurementService");
                        c19804512eB.LJ();
                        c19804512eB.LJIL();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzly@398e.run");
            }

            {
                this.LLILLJJLI = this;
            }
        });
    }

    @Override // X.InterfaceC832770Wlf
    public final void zk(Bundle bundle) {
        C0W3J.LJ("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                try {
                    C0W3J.LJIIIIZZ(this.LLILLJJLI);
                    final InterfaceC19802012dm service = getService();
                    this.LLILLL.LJIIL().LJIILL(new Runnable(this) { // from class: X.12en
                        public final /* synthetic */ ServiceConnectionC19808412eo LLILLJJLI;

                        public final void LIZ() {
                            synchronized (this.LLILLJJLI) {
                                try {
                                    this.LLILLJJLI.LL = false;
                                    if (!this.LLILLJJLI.LLILLL.LJJI()) {
                                        this.LLILLJJLI.LLILLL.LJIILJJIL().LJIIL.LIZJ("Connected to remote service");
                                        C19804512eB c19804512eB = this.LLILLJJLI.LLILLL;
                                        InterfaceC19802012dm interfaceC19802012dm = service;
                                        c19804512eB.LJ();
                                        C0W3J.LJIIIIZZ(interfaceC19802012dm);
                                        c19804512eB.LIZLLL = interfaceC19802012dm;
                                        c19804512eB.LJJIIJZLJL();
                                        c19804512eB.LJJIIJ();
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("zzmb@3996.run");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("zzmb@3996.run");
                        }

                        {
                            this.LLILLJJLI = this;
                        }
                    });
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            } catch (DeadObjectException | IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILLJJLI = null;
                this.LL = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
        String interfaceDescriptor;
        InterfaceC19802012dm c0wh5;
        IBinder iBinder2 = iBinder;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/google/android/gms/measurement/internal/zzlw", "onServiceConnected", this, new Object[]{componentName, iBinder2}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yzxe1dYm0ZJPLqwOID9zPVdd3eEmUDB28yL", new String[]{"016a9"})));
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
        C0W3J.LJ("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            try {
                if (iBinder2 == null) {
                    this.LL = false;
                    this.LLILLL.LJIILJJIL().LJFF.LIZJ("Service connected with null binder");
                    return;
                }
                final InterfaceC19802012dm interfaceC19802012dm = null;
                try {
                    interfaceDescriptor = iBinder2.getInterfaceDescriptor();
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LLILLL.LJIILJJIL().LJFF.LIZJ("Service connect failed to get IMeasurementService");
                }
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (iInterfaceQueryLocalInterface instanceof InterfaceC19802012dm) {
                        c0wh5 = (InterfaceC19802012dm) iInterfaceQueryLocalInterface;
                    } else {
                        c0wh5 = new C0WH5(iBinder2);
                    }
                    interfaceC19802012dm = c0wh5;
                    this.LLILLL.LJIILJJIL().LJIILIIL.LIZJ("Bound to IMeasurementService interface");
                    if (interfaceC19802012dm == null) {
                        this.LL = false;
                        try {
                            C812630VuH c812630VuHLIZIZ = C812630VuH.LIZIZ();
                            C19804512eB c19804512eB = this.LLILLL;
                            c812630VuHLIZIZ.LIZJ(c19804512eB.LIZ.LIZ, c19804512eB.LIZJ);
                        } catch (IllegalArgumentException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    } else {
                        this.LLILLL.LJIIL().LJIILL(new Runnable(this) { // from class: X.12eq
                            public final /* synthetic */ ServiceConnectionC19808412eo LLILLJJLI;

                            public final void LIZ() {
                                synchronized (this.LLILLJJLI) {
                                    try {
                                        this.LLILLJJLI.LL = false;
                                        if (!this.LLILLJJLI.LLILLL.LJJI()) {
                                            this.LLILLJJLI.LLILLL.LJIILJJIL().LJIILIIL.LIZJ("Connected to service");
                                            C19804512eB c19804512eB2 = this.LLILLJJLI.LLILLL;
                                            InterfaceC19802012dm interfaceC19802012dm2 = interfaceC19802012dm;
                                            c19804512eB2.LJ();
                                            C0W3J.LJIIIIZZ(interfaceC19802012dm2);
                                            c19804512eB2.LIZLLL = interfaceC19802012dm2;
                                            c19804512eB2.LJJIIJZLJL();
                                            c19804512eB2.LJJIIJ();
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("zzlz@398f.run");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("zzlz@398f.run");
                            }

                            {
                                this.LLILLJJLI = this;
                            }
                        });
                    }
                }
                this.LLILLL.LJIILJJIL().LJFF.LIZ(interfaceDescriptor, "Got binder with a wrong descriptor");
                this.LL = false;
                C812630VuH c812630VuHLIZIZ2 = C812630VuH.LIZIZ();
                C19804512eB c19804512eB2 = this.LLILLL;
                c812630VuHLIZIZ2.LIZJ(c19804512eB2.LIZ.LIZ, c19804512eB2.LIZJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
