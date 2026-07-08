package X;

import Y.ARunnableS113S0100000_13;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.bytedance.common.utility.Logger;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0WKK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WKK implements C0WKB {
    public final Context LIZ;
    public Messenger LIZIZ;
    public C0WKL LIZLLL;
    public final /* synthetic */ C0WKI LJIIIZ;
    public final LinkedBlockingDeque<Intent> LIZJ = new LinkedBlockingDeque<>();
    public boolean LJ = false;
    public final Object LJFF = new Object();
    public final ARunnableS113S0100000_13 LJI = new ARunnableS113S0100000_13(this, 283);
    public final ARunnableS113S0100000_13 LJII = new ARunnableS113S0100000_13(this, 284);
    public final AtomicInteger LJIIIIZZ = new AtomicInteger(0);

    @Override // X.C0WKB
    public final void LIZ() {
        if (this.LIZJ.size() <= 0 || this.LIZIZ != null) {
            return;
        }
        synchronized (this.LJFF) {
            try {
                if (this.LIZJ.size() > 0 && this.LIZIZ == null) {
                    LIZJ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r5 = this;
        L0:
            java.util.concurrent.LinkedBlockingDeque<android.content.Intent> r0 = r5.LIZJ     // Catch: java.lang.Throwable -> L48
            java.lang.Object r0 = r0.peek()     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L29
            java.util.concurrent.LinkedBlockingDeque<android.content.Intent> r0 = r5.LIZJ     // Catch: java.lang.Throwable -> L48
            java.lang.Object r1 = r0.poll()     // Catch: java.lang.Throwable -> L48
            android.content.Intent r1 = (android.content.Intent) r1     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L13
            goto L1c
        L13:
            r5.LJI(r1)     // Catch: java.lang.Throwable -> L17 android.os.DeadObjectException -> L1d
            goto L0
        L17:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L48
            goto L0
        L1c:
            return
        L1d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L48
            r0 = 0
            r5.LIZIZ = r0     // Catch: java.lang.Throwable -> L48
            java.util.concurrent.LinkedBlockingDeque<android.content.Intent> r0 = r5.LIZJ     // Catch: java.lang.Throwable -> L48
            r0.offerFirst(r1)     // Catch: java.lang.Throwable -> L48
        L29:
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L48
            r5.LJFF()     // Catch: java.lang.Throwable -> L45
            X.0Vne r0 = X.C808520Vne.LIZ()     // Catch: java.lang.Throwable -> L45
            r0.getClass()     // Catch: java.lang.Throwable -> L45
            com.bytedance.common.utility.collection.WeakHandler r4 = X.C808520Vne.LLILLJJLI     // Catch: java.lang.Throwable -> L45
            Y.ARunnableS113S0100000_13 r3 = r5.LJII     // Catch: java.lang.Throwable -> L45
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L45
            r0 = 10
            long r0 = r2.toMillis(r0)     // Catch: java.lang.Throwable -> L45
            r4.postDelayed(r3, r0)     // Catch: java.lang.Throwable -> L45
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L48
            return
        L45:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L48
            throw r0     // Catch: java.lang.Throwable -> L48
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WKK.LIZLLL():void");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0WKL] */
    public final void LIZJ() {
        Logger.debug();
        try {
            C786410Ut5.s3(this.LIZ, new Intent(this.LIZ, this.LJIIIZ.LIZIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            this.LIZLLL = new ServiceConnection() { // from class: X.0WKL
                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
                    Logger.debug();
                    synchronized (this.LL.LJFF) {
                        try {
                            if (componentName == null) {
                                return;
                            }
                            C0WKK c0wkk = this.LL;
                            c0wkk.LIZIZ = null;
                            c0wkk.LIZLLL = null;
                            c0wkk.LJ = false;
                            c0wkk.LJFF();
                            this.LL.LJ();
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                }

                @Override // android.content.ServiceConnection
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
                    IBinder iBinder2 = iBinder;
                    C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/bytedance/common/wschannel/server/ClientMsgSender$OSender$MessengerServiceConnection", "onServiceConnected", this, new Object[]{componentName, iBinder2}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/bvZip/6gIBD6urZ0ODyQS8FPWQR+JYWoRnFQvWmXxo=", null)));
                    if (c0wsuLIZIZ.LIZ) {
                        return;
                    }
                    Object[] objArr = c0wsuLIZIZ.LIZJ;
                    Object obj = componentName;
                    if (objArr != null) {
                        Object obj2 = objArr[0];
                        Object obj3 = componentName;
                        if (obj2 != null) {
                            obj3 = obj2;
                        }
                        Object obj4 = objArr[1];
                        obj = obj3;
                        if (obj4 != null) {
                            iBinder2 = (IBinder) obj4;
                            obj = obj3;
                        }
                    }
                    Logger.debug();
                    synchronized (this.LL.LJFF) {
                        try {
                            this.LL.LJ();
                            if (obj != null && iBinder2 != null) {
                                try {
                                    this.LL.LIZIZ = new Messenger(iBinder2);
                                    this.LL.LIZLLL();
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                }
                                this.LL.LJ = false;
                            }
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            throw th3;
                        }
                    }
                }
            };
            C2204961BRm.LJJJJ(this.LIZ, new Intent(this.LIZ, this.LJIIIZ.LIZIZ), this.LIZLLL, 1, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/bvZip/6gIBD6urZ0ODyQS8FPWQR+JYWoRnFQvWmXxo=", null));
            LJ();
            C808520Vne.LIZ().getClass();
            C808520Vne.LLILLJJLI.postDelayed(this.LJI, TimeUnit.SECONDS.toMillis(7L));
            this.LJ = true;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            LJ();
            this.LJ = false;
        }
    }

    public final void LJ() {
        C808520Vne.LIZ().getClass();
        C808520Vne.LLILLJJLI.removeCallbacks(this.LJI);
    }

    public final void LJFF() {
        try {
            C808520Vne.LIZ().getClass();
            C808520Vne.LLILLJJLI.removeCallbacks(this.LJII);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C0WKB
    public final void LIZIZ(Intent intent) {
        boolean zLJI = MethodIDManager.LJI(137999);
        boolean zLJI2 = MethodIDManager.LJI(137893);
        if (Logger.debug()) {
            intent.putExtra("msg_count", this.LJIIIIZZ.addAndGet(1));
        }
        synchronized (this.LJFF) {
            try {
                LJFF();
                this.LIZJ.offer(intent);
                if (this.LIZIZ == null) {
                    if (this.LJ) {
                        if (zLJI2) {
                            MethodIDManager.LJ();
                        }
                        if (zLJI) {
                            MethodIDManager.LJ();
                            return;
                        }
                        return;
                    }
                    LIZJ();
                } else {
                    LIZLLL();
                }
                if (zLJI2) {
                    MethodIDManager.LJ();
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (zLJI2) {
                    MethodIDManager.LJ();
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                throw th;
            }
        }
    }

    public final void LJI(Intent intent) throws RemoteException {
        boolean zLJI = MethodIDManager.LJI(137721);
        Logger.debug();
        Messenger messenger = this.LIZIZ;
        Message message = new Message();
        message.what = 10123;
        C786410Ut5.LJJIJL(message.getData(), "DATA_INTENT", intent);
        if (messenger == null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            messenger.send(message);
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    public C0WKK(C0WKI c0wki, Context context) {
        this.LJIIIZ = c0wki;
        this.LIZ = context;
    }
}
