package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.12eB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19804512eB extends AbstractC19810512f9 {
    public final ServiceConnectionC19808412eo LIZJ;
    public InterfaceC19802012dm LIZLLL;
    public volatile Boolean LJ;
    public final C19810812fC LJFF;
    public final C19785112b3 LJI;
    public final List<Runnable> LJII;
    public final C19811212fG LJIIIIZZ;

    @Override // X.AbstractC19810512f9
    public final boolean LJIILL() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0WlO] */
    public final void LJIL() {
        LJ();
        LJIIJJI();
        if (LJJI()) {
            return;
        }
        if (!LJJIII()) {
            if (this.LIZ.LJI.LJJI()) {
                return;
            }
            List<ResolveInfo> listQueryIntentServices = this.LIZ.LIZ.getPackageManager().queryIntentServices(new Intent().setClassName(this.LIZ.LIZ, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                LJIILJJIL().LJFF.LIZJ("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            Intent intent = new Intent("com.google.android.gms.measurement.START");
            intent.setComponent(new ComponentName(this.LIZ.LIZ, "com.google.android.gms.measurement.AppMeasurementService"));
            this.LIZJ.LIZ(intent);
            return;
        }
        final ServiceConnectionC19808412eo serviceConnectionC19808412eo = this.LIZJ;
        serviceConnectionC19808412eo.LLILLL.LJ();
        final Context context = serviceConnectionC19808412eo.LLILLL.LIZ.LIZ;
        synchronized (serviceConnectionC19808412eo) {
            try {
                if (serviceConnectionC19808412eo.LL) {
                    serviceConnectionC19808412eo.LLILLL.LJIILJJIL().LJIILIIL.LIZJ("Connection attempt already in progress");
                    return;
                }
                if (serviceConnectionC19808412eo.LLILLJJLI != null && (serviceConnectionC19808412eo.LLILLJJLI.isConnecting() || serviceConnectionC19808412eo.LLILLJJLI.isConnected())) {
                    serviceConnectionC19808412eo.LLILLL.LJIILJJIL().LJIILIIL.LIZJ("Already awaiting connection attempt");
                    return;
                }
                final Looper mainLooper = Looper.getMainLooper();
                serviceConnectionC19808412eo.LLILLJJLI = new AbstractC832390Wl3<InterfaceC19802012dm>(context, mainLooper, serviceConnectionC19808412eo, serviceConnectionC19808412eo) { // from class: X.0WlO
                    @Override // X.AbstractC832390Wl3, X.InterfaceC831160Wj4
                    public final int getMinApkVersion() {
                        return 12451000;
                    }

                    @Override // X.AbstractC832390Wl3
                    public final String getServiceDescriptor() {
                        return "com.google.android.gms.measurement.internal.IMeasurementService";
                    }

                    @Override // X.AbstractC832390Wl3
                    public final String getStartServiceAction() {
                        return "com.google.android.gms.measurement.START";
                    }

                    @Override // X.AbstractC832390Wl3
                    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        if (iInterfaceQueryLocalInterface instanceof InterfaceC19802012dm) {
                            return iInterfaceQueryLocalInterface;
                        }
                        return new C0WH5(iBinder);
                    }
                };
                serviceConnectionC19808412eo.LLILLL.LJIILJJIL().LJIILIIL.LIZJ("Connecting to remote service");
                serviceConnectionC19808412eo.LL = true;
                C0W3J.LJIIIIZZ(serviceConnectionC19808412eo.LLILLJJLI);
                serviceConnectionC19808412eo.LLILLJJLI.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJ() {
        LJ();
        LJIIJJI();
        ServiceConnectionC19808412eo serviceConnectionC19808412eo = this.LIZJ;
        if (serviceConnectionC19808412eo.LLILLJJLI != null && (serviceConnectionC19808412eo.LLILLJJLI.isConnected() || serviceConnectionC19808412eo.LLILLJJLI.isConnecting())) {
            serviceConnectionC19808412eo.LLILLJJLI.disconnect();
        }
        serviceConnectionC19808412eo.LLILLJJLI = null;
        try {
            C812630VuH.LIZIZ().LIZJ(this.LIZ.LIZ, this.LIZJ);
        } catch (IllegalArgumentException | IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LIZLLL = null;
    }

    public final boolean LJJI() {
        LJ();
        LJIIJJI();
        return this.LIZLLL != null;
    }

    public final boolean LJJIFFI() {
        LJ();
        LJIIJJI();
        return !LJJIII() || LIZJ().LJJLIIJ() >= C19817012gC.LJJLIIJ.LIZ(null).intValue();
    }

    public final boolean LJJII() {
        LJ();
        LJIIJJI();
        return !LJJIII() || LIZJ().LJJLIIJ() >= 241200;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4 A[PHI: r1 r3
      0x00e4: PHI (r1v6 boolean) = (r1v7 boolean), (r1v11 boolean) binds: [B:30:0x0092, B:38:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r3v3 boolean) = (r3v4 boolean), (r3v5 boolean) binds: [B:30:0x0092, B:38:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIII() {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19804512eB.LJJIII():boolean");
    }

    public final void LJJIIJ() {
        LJ();
        LJIILJJIL().LJIILIIL.LIZ(Integer.valueOf(((ArrayList) this.LJII).size()), "Processing queued up service tasks");
        Iterator it2 = ((ArrayList) this.LJII).iterator();
        while (it2.hasNext()) {
            try {
                ((Runnable) it2.next()).run();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILJJIL().LJFF.LIZ(e, "Task exception while flushing queue");
            }
        }
        ((ArrayList) this.LJII).clear();
        LIZ();
    }

    public final void LJJIIJZLJL() {
        LJ();
        C19785112b3 c19785112b3 = this.LJI;
        c19785112b3.LIZIZ = c19785112b3.LIZ.LIZ();
        LIZIZ(C19817012gC.LJJIJL.LIZ(null).longValue());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.12fC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.12fG] */
    public C19804512eB(final C19804712eD c19804712eD) {
        super(c19804712eD);
        this.LJII = new ArrayList();
        this.LJI = new C19785112b3(c19804712eD.LJIILIIL);
        this.LIZJ = new ServiceConnectionC19808412eo(this);
        this.LJFF = new AbstractC19809612f0(c19804712eD) { // from class: X.12fC
            @Override // X.AbstractC19809612f0
            public final void LIZJ() {
                C19804512eB c19804512eB = this.LJ;
                c19804512eB.LJ();
                if (c19804512eB.LJJI()) {
                    c19804512eB.LJIILJJIL().LJIILIIL.LIZJ("Inactivity, disconnecting from the service");
                    c19804512eB.LJJ();
                }
            }
        };
        this.LJIIIIZZ = new AbstractC19809612f0(c19804712eD) { // from class: X.12fG
            @Override // X.AbstractC19809612f0
            public final void LIZJ() {
                this.LJ.LJIILJJIL().LJIIIIZZ.LIZJ("Tasks have been queued for a long time");
            }
        };
    }

    public final void LJIILLIIL(final zzac zzacVar) {
        final boolean zLJIIZILJ;
        LJ();
        LJIIJJI();
        C19805312eJ c19805312eJLJI = LJI();
        c19805312eJLJI.LIZJ();
        byte[] bArrLJJJJLL = C19803112dx.LJJJJLL(zzacVar);
        if (bArrLJJJJLL.length > 131072) {
            c19805312eJLJI.LJIILJJIL().LJI.LIZJ("Conditional user property too long for local database. Sending directly to service");
            zLJIIZILJ = false;
        } else {
            zLJIIZILJ = c19805312eJLJI.LJIIZILJ(2, bArrLJJJJLL);
        }
        final zzac zzacVar2 = new zzac(zzacVar);
        final zzn zznVarLJJIIZ = LJJIIZ(true);
        LJIIZILJ(new Runnable(this, zznVarLJJIIZ, zLJIIZILJ, zzacVar2, zzacVar) { // from class: X.12di
            public final /* synthetic */ zzn LL;
            public final /* synthetic */ boolean LLILLJJLI;
            public final /* synthetic */ zzac LLILLL;
            public final /* synthetic */ C19804512eB LLILZ;

            public final void LIZ() throws Throwable {
                C19804512eB c19804512eB = this.LLILZ;
                InterfaceC19802012dm interfaceC19802012dm = c19804512eB.LIZLLL;
                if (interfaceC19802012dm == null) {
                    c19804512eB.LJIILJJIL().LJFF.LIZJ("Discarding data. Failed to send conditional user property to service");
                    return;
                }
                C0W3J.LJIIIIZZ(this.LL);
                this.LLILZ.LJIJJ(interfaceC19802012dm, this.LLILLJJLI ? null : this.LLILLL, this.LL);
                this.LLILZ.LJJIIJZLJL();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzls@3988.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzls@3988.run");
            }

            {
                this.LLILZ = this;
            }
        });
    }

    public final void LJIIZILJ(Runnable runnable) {
        LJ();
        if (LJJI()) {
            runnable.run();
        } else {
            if (((ArrayList) this.LJII).size() >= 1000) {
                LJIILJJIL().LJFF.LIZJ("Discarding data. Max runnable queue size reached");
                return;
            }
            ((ArrayList) this.LJII).add(runnable);
            LIZIZ(60000L);
            LJIL();
        }
    }

    public final void LJIJI(final AtomicReference<String> atomicReference) {
        LJ();
        LJIIJJI();
        final zzn zznVarLJJIIZ = LJJIIZ(false);
        LJIIZILJ(new Runnable(this) { // from class: X.12eW
            public final /* synthetic */ C19804512eB LLILLL;

            public final void LIZ() {
                synchronized (atomicReference) {
                    try {
                        try {
                            try {
                            } catch (RemoteException e) {
                                TryCatchGuardChecker.doCheck(e);
                                this.LLILLL.LJIILJJIL().LJFF.LIZ(e, "Failed to get app instance id");
                                atomicReference.notify();
                            }
                            if (!this.LLILLL.LIZIZ().LJIJJLI().LJIJI()) {
                                this.LLILLL.LJIILJJIL().LJIIJ.LIZJ("Analytics storage consent denied; will not get app instance id");
                                this.LLILLL.LJII().LJJJI(null);
                                this.LLILLL.LIZIZ().LJII.LIZIZ(null);
                                atomicReference.set(null);
                                atomicReference.notify();
                                return;
                            }
                            C19804512eB c19804512eB = this.LLILLL;
                            InterfaceC19802012dm interfaceC19802012dm = c19804512eB.LIZLLL;
                            if (interfaceC19802012dm == null) {
                                c19804512eB.LJIILJJIL().LJFF.LIZJ("Failed to get app instance id");
                                atomicReference.notify();
                                return;
                            }
                            C0W3J.LJIIIIZZ(zznVarLJJIIZ);
                            atomicReference.set(interfaceC19802012dm.n(zznVarLJJIIZ));
                            String str = (String) atomicReference.get();
                            if (str != null) {
                                this.LLILLL.LJII().LJJJI(str);
                                this.LLILLL.LIZIZ().LJII.LIZIZ(str);
                            }
                            this.LLILLL.LJJIIJZLJL();
                            atomicReference.notify();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            atomicReference.notify();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzli@397e.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzli@397e.run");
            }

            {
                this.LLILLL = this;
            }
        });
    }

    public final void LJIJJLI(boolean z) {
        LJ();
        LJIIJJI();
        C19820612gm.LIZ();
        if (!this.LIZ.LJI.LJIJI(null, C19817012gC.LLFII) && z) {
            LJI().LJIJI();
        }
        if (LJJIFFI()) {
            final zzn zznVarLJJIIZ = LJJIIZ(false);
            LJIIZILJ(new Runnable(this) { // from class: X.12dg
                public final /* synthetic */ C19804512eB LLILLJJLI;

                public final void LIZ() {
                    C19804512eB c19804512eB = this.LLILLJJLI;
                    InterfaceC19802012dm interfaceC19802012dm = c19804512eB.LIZLLL;
                    if (interfaceC19802012dm == null) {
                        c19804512eB.LJIILJJIL().LJFF.LIZJ("Failed to send consent settings to service");
                        return;
                    }
                    try {
                        C0W3J.LJIIIIZZ(zznVarLJJIIZ);
                        interfaceC19802012dm.B(zznVarLJJIIZ);
                        this.LLILLJJLI.LJJIIJZLJL();
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LLILLJJLI.LJIILJJIL().LJFF.LIZ(e, "Failed to send consent settings to the service");
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzlq@3986.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzlq@3986.run");
                }

                {
                    this.LLILLJJLI = this;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzn LJJIIZ(boolean r59) {
        /*
            Method dump skipped, instruction units count: 1003
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19804512eB.LJJIIZ(boolean):com.google.android.gms.measurement.internal.zzn");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x029a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[LOOP:1: B:8:0x0033->B:195:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(X.InterfaceC19802012dm r26, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r27, com.google.android.gms.measurement.internal.zzn r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19804512eB.LJIJJ(X.12dm, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable, com.google.android.gms.measurement.internal.zzn):void");
    }
}
