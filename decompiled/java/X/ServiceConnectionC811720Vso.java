package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0Vso, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ServiceConnectionC811720Vso implements ServiceConnection {
    public final Context LL;
    public final Intent LLILLJJLI;
    public final ScheduledExecutorService LLILLL;
    public final Queue<C811740Vsq> LLILZ;
    public BinderC811710Vsn LLILZIL;
    public boolean LLILZLL;

    public final synchronized void LIZ() {
        while (!((ArrayDeque) this.LLILZ).isEmpty()) {
            BinderC811710Vsn binderC811710Vsn = this.LLILZIL;
            if (binderC811710Vsn == null || !binderC811710Vsn.isBinderAlive()) {
                LIZJ();
                return;
            } else {
                this.LLILZIL.LIZ((C811740Vsq) ((ArrayDeque) this.LLILZ).poll());
            }
        }
    }

    public final void LIZJ() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("binder is dead. start connection? ");
            sbLIZ.append(!this.LLILZLL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        try {
            if (C812630VuH.LIZIZ().LIZ(this.LL, this.LLILLJJLI, this, 65)) {
                return;
            }
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLILZLL = false;
        while (!((ArrayDeque) this.LLILZ).isEmpty()) {
            ((C811740Vsq) ((ArrayDeque) this.LLILZ).poll()).LIZIZ.LIZLLL(null);
        }
    }

    public ServiceConnectionC811720Vso(Context context) {
        C822660WOy c822660WOy = new C822660WOy(0, new C0VH4("Firebase-FirebaseInstanceIdServiceConnection"));
        this.LLILZ = new ArrayDeque();
        this.LLILZLL = false;
        Context contextN3 = C786410Ut5.N3(context);
        this.LL = contextN3;
        this.LLILLJJLI = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(contextN3.getPackageName());
        this.LLILLL = c822660WOy;
    }

    public final synchronized C835510Wq5 LIZIZ(Intent intent) {
        final C811740Vsq c811740Vsq;
        boolean z;
        long j;
        c811740Vsq = new C811740Vsq(intent);
        ScheduledExecutorService scheduledExecutorService = this.LLILLL;
        if ((c811740Vsq.LIZ.getFlags() & 268435456) != 0) {
            z = true;
        } else {
            z = false;
        }
        Runnable runnable = new Runnable() { // from class: X.0Vsp
            @Override // java.lang.Runnable
            public final void run() {
                C811740Vsq c811740Vsq2 = c811740Vsq;
                c811740Vsq2.getClass();
                C1C7U.LIZ("WithinAppServiceConnection$BindRequest@6b39.arrangeTimeout$1L");
                c811740Vsq2.LIZIZ.LIZLLL(null);
                C1C7U.LIZIZ("WithinAppServiceConnection$BindRequest@6b39.arrangeTimeout$1L");
            }
        };
        if (!z) {
            j = 9000;
        } else {
            j = C811610Vsd.LIZ;
        }
        final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        c811740Vsq.LIZIZ.LIZ.LIZJ(scheduledExecutorService, new InterfaceC834580Woa() { // from class: X.0Vss
            @Override // X.InterfaceC834580Woa
            public final void LIZ(AbstractC835450Wpz abstractC835450Wpz) {
                scheduledFutureSchedule.cancel(false);
            }
        });
        ((ArrayDeque) this.LLILZ).add(c811740Vsq);
        LIZ();
        return c811740Vsq.LIZIZ.LIZ;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        LIZ();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IBinder iBinder2 = iBinder;
        synchronized (this) {
            C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/google/firebase/messaging/WithinAppServiceConnection", "onServiceConnected", this, new Object[]{componentName, iBinder2}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgU1UM3QUBknTACBZOH3RnJ+RNEWrFftiFMy+bDoQ8+ms8CF4Iwpoa569pMBe+KI2ghE4r4=", new String[]{"01a8f"})));
            if (c0wsuLIZIZ.LIZ) {
                return;
            }
            Object[] objArr = c0wsuLIZIZ.LIZJ;
            if (objArr != null) {
                Object obj = objArr[0];
                if (obj != null) {
                }
                Object obj2 = objArr[1];
                if (obj2 != null) {
                    iBinder2 = (IBinder) obj2;
                }
            }
            this.LLILZLL = false;
            if (iBinder2 instanceof BinderC811710Vsn) {
                this.LLILZIL = (BinderC811710Vsn) iBinder2;
                LIZ();
            } else {
                while (!((ArrayDeque) this.LLILZ).isEmpty()) {
                    ((C811740Vsq) ((ArrayDeque) this.LLILZ).poll()).LIZIZ.LIZLLL(null);
                }
            }
        }
    }
}
