package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.1BAZ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BAZ implements ServiceConnection {
    public final InterfaceC2200341B9s LL;
    public final C138Q LLILLJJLI;
    public final C138Q LLILLL;
    public final int LLILZ;
    public final /* synthetic */ C1BAY LLILZIL;

    public final void LIZ() {
        synchronized (this.LLILZIL.LIZ) {
            try {
                C138Q c138q = this.LLILLJJLI;
                c138q.LIZJ = 0L;
                c138q.LIZIZ = false;
                c138q.LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final Long LIZIZ(boolean z) {
        try {
            if (z) {
                synchronized (this.LLILZIL.LIZ) {
                    try {
                        C138Q c138q = this.LLILLJJLI;
                        if (!c138q.LIZIZ) {
                            return null;
                        }
                        long jLIZ = c138q.LIZ.LIZ();
                        if (c138q.LIZIZ) {
                            c138q.LIZIZ = false;
                            long j = c138q.LIZJ + (jLIZ - c138q.LIZLLL);
                            c138q.LIZJ = j;
                            return Long.valueOf(TimeUnit.MILLISECONDS.convert(j, TimeUnit.NANOSECONDS));
                        }
                        throw new IllegalStateException("This stopwatch is already stopped.");
                    } finally {
                    }
                }
            }
            synchronized (this.LLILZIL.LIZ) {
                try {
                    C138Q c138q2 = this.LLILLL;
                    if (!c138q2.LIZIZ) {
                        return null;
                    }
                    long jLIZ2 = c138q2.LIZ.LIZ();
                    if (c138q2.LIZIZ) {
                        c138q2.LIZIZ = false;
                        long j2 = c138q2.LIZJ + (jLIZ2 - c138q2.LIZLLL);
                        c138q2.LIZJ = j2;
                        return Long.valueOf(TimeUnit.MILLISECONDS.convert(j2, TimeUnit.NANOSECONDS));
                    }
                    throw new IllegalStateException("This stopwatch is already stopped.");
                } finally {
                }
            }
        } catch (Throwable th) {
            return null;
        }
        return null;
    }

    public final void LIZLLL(C19885612rG c19885612rG) {
        C1BAY c1bay = this.LLILZIL;
        synchronized (c1bay.LIZ) {
            try {
                if (c1bay.LIZIZ == 3) {
                    return;
                }
                try {
                    this.LL.LJ(c19885612rG);
                } catch (Throwable th) {
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z;
        try {
            C1BAY c1bay = this.LLILZIL;
            if (C1BAY.LJJII(c1bay)) {
                C1BBD c1bbd = c1bay.LJII;
                C2200641BAw c2200641BAwLJJ = C2200661BAy.LJJ();
                c2200641BAwLJJ.LJII(6);
                C1BB7 c1bb7LJIJJLI = C1BB1.LJIJJLI();
                c1bb7LJIJJLI.LJFF(C1BAX.BINDING_DIED);
                c2200641BAwLJJ.LJFF(c1bb7LJIJJLI);
                C1BB8 c1bb8LJIJJ = C1BB2.LJIJJ();
                int i = this.LLILZ;
                if (i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                c1bb8LJIJJ.LJFF(z);
                c1bb8LJIJJ.LJI(i);
                c2200641BAwLJJ.LJI(c1bb8LJIJJ);
                ((C2200551BAn) c1bbd).LIZ((C2200661BAy) c2200641BAwLJJ.LIZIZ());
            } else {
                C1BBD c1bbd2 = c1bay.LJII;
                C1BB9 c1bb9LJIJJLI = C1BB9.LJIJJLI();
                C2200551BAn c2200551BAn = (C2200551BAn) c1bbd2;
                c2200551BAn.getClass();
                try {
                    C1BBA c1bbaLJIJJLI = C1BB0.LJIJJLI();
                    c1bbaLJIJJLI.LJFF(c2200551BAn.LIZIZ);
                    c1bbaLJIJJLI.LIZLLL();
                    C1BB0.LJJIFFI((C1BB0) c1bbaLJIJJLI.LLILLJJLI, c1bb9LJIJJLI);
                    c2200551BAn.LIZJ.LIZ((C1BB0) c1bbaLJIJJLI.LIZIZ());
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        C1BAY c1bay2 = this.LLILZIL;
        synchronized (c1bay2.LIZ) {
            try {
                if (c1bay2.LIZIZ != 3 && c1bay2.LIZIZ != 0) {
                    c1bay2.LJJIJL(0);
                    c1bay2.LJJIZ();
                    try {
                        this.LL.LIZ();
                    } catch (Throwable th3) {
                    }
                }
            } finally {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z;
        try {
            C1BAY c1bay = this.LLILZIL;
            if (C1BAY.LJJII(c1bay)) {
                C1BBD c1bbd = c1bay.LJII;
                C2200641BAw c2200641BAwLJJ = C2200661BAy.LJJ();
                c2200641BAwLJJ.LJII(6);
                C1BB7 c1bb7LJIJJLI = C1BB1.LJIJJLI();
                c1bb7LJIJJLI.LJFF(C1BAX.SERVICE_DISCONNECTED);
                c2200641BAwLJJ.LJFF(c1bb7LJIJJLI);
                C1BB8 c1bb8LJIJJ = C1BB2.LJIJJ();
                int i = this.LLILZ;
                if (i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                c1bb8LJIJJ.LJFF(z);
                c1bb8LJIJJ.LJI(i);
                c2200641BAwLJJ.LJI(c1bb8LJIJJ);
                ((C2200551BAn) c1bbd).LIZ((C2200661BAy) c2200641BAwLJJ.LIZIZ());
            } else {
                C1BBD c1bbd2 = c1bay.LJII;
                C1BB6 c1bb6LJIJJLI = C1BB6.LJIJJLI();
                C2200551BAn c2200551BAn = (C2200551BAn) c1bbd2;
                c2200551BAn.getClass();
                if (c1bb6LJIJJLI != null) {
                    try {
                        C1BBA c1bbaLJIJJLI = C1BB0.LJIJJLI();
                        c1bbaLJIJJLI.LJFF(c2200551BAn.LIZIZ);
                        c1bbaLJIJJLI.LIZLLL();
                        C1BB0.LJIJJ((C1BB0) c1bbaLJIJJLI.LLILLJJLI, c1bb6LJIJJLI);
                        c2200551BAn.LIZJ.LIZ((C1BB0) c1bbaLJIJJLI.LIZIZ());
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        C1BAY c1bay2 = this.LLILZIL;
        synchronized (c1bay2.LIZ) {
            try {
                C138Q c138q = this.LLILLL;
                c138q.LIZJ = 0L;
                c138q.LIZIZ = false;
                c138q.LIZ();
                if (c1bay2.LIZIZ == 3) {
                    return;
                }
                c1bay2.LJJIJL(0);
                try {
                    this.LL.LIZ();
                } catch (Throwable th3) {
                }
            } finally {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
        InterfaceC2200631BAv c1b9i;
        IBinder iBinder2 = iBinder;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/android/billingclient/api/zzbz", "onServiceConnected", this, new Object[]{componentName, iBinder2}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgM0W9jTXFNvRxuIaqGa/t0aV0yLu9rODctw3qJA0Q==", new String[]{"01cc3"})));
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
        C2200451BAd.LJI("BillingClient", "Billing service connected.");
        C1BAY c1bay = this.LLILZIL;
        synchronized (c1bay.LIZ) {
            try {
                if (c1bay.LIZIZ == 3) {
                    return;
                }
                if (iBinder2 == null) {
                    c1b9i = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    if (iInterfaceQueryLocalInterface instanceof InterfaceC2200631BAv) {
                        c1b9i = (InterfaceC2200631BAv) iInterfaceQueryLocalInterface;
                    } else {
                        c1b9i = new C1B9I(iBinder2);
                    }
                }
                c1bay.LJIIIIZZ = c1b9i;
                if (C1BAY.LJIIZILJ(new Callable() { // from class: X.1BAb
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle bundle;
                        InterfaceC2200631BAv interfaceC2200631BAv;
                        boolean z;
                        int iLLLLIILLL;
                        C1C7U.LIZ("zzbx@8a62.call");
                        C1BAZ c1baz = this.LL;
                        C1BAY c1bay2 = c1baz.LLILZIL;
                        synchronized (c1bay2.LIZ) {
                            try {
                                if (c1bay2.LIZIZ != 3) {
                                    boolean z2 = c1bay2.LIZIZ == 1;
                                    if (TextUtils.isEmpty(null)) {
                                        bundle = null;
                                    } else {
                                        bundle = new Bundle();
                                        C786410Ut5.LJJJI("accountName", null, bundle);
                                        C2200451BAd.LIZIZ(c1bay2.LJJIJIIJIL.longValue(), c1bay2.LIZJ, c1bay2.LIZLLL, bundle);
                                    }
                                    C1BAX c1bax = C1BAX.REASON_UNSPECIFIED;
                                    synchronized (c1bay2.LIZ) {
                                        try {
                                            interfaceC2200631BAv = c1bay2.LJIIIIZZ;
                                        } finally {
                                        }
                                    }
                                    if (interfaceC2200631BAv == null) {
                                        C1BAY c1bay3 = c1baz.LLILZIL;
                                        c1bay3.LJJIJL(0);
                                        int i = c1baz.LLILZ;
                                        C1BAX c1bax2 = C1BAX.SERVICE_RESET_TO_NULL;
                                        C19885612rG c19885612rG = C2200541BAm.LJIIIZ;
                                        c1bay3.LJJIJIL(i, c19885612rG, c1bax2);
                                        c1baz.LIZLLL(c19885612rG);
                                    } else {
                                        C1BAY c1bay4 = c1baz.LLILZIL;
                                        String packageName = c1bay4.LJI.getPackageName();
                                        int i2 = 27;
                                        while (true) {
                                            try {
                                                C2200451BAd.LJI("BillingClient", "trying subs apiVersion: " + i2);
                                                if ((bundle == null ? interfaceC2200631BAv.LLLLIILLL(i2, packageName, "subs") : interfaceC2200631BAv.LJLLLL(i2, packageName, "subs", bundle)) == 0) {
                                                    C2200451BAd.LJI("BillingClient", "highestLevelSupportedForSubs: " + i2);
                                                    z = i2 >= 5;
                                                } else {
                                                    i2--;
                                                    if (i2 < 3) {
                                                        i2 = 0;
                                                        break;
                                                    }
                                                }
                                            } catch (Exception e) {
                                                TryCatchGuardChecker.doCheck(e);
                                                boolean z3 = e instanceof DeadObjectException;
                                                C1BAX c1bax3 = z3 ? C1BAX.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION : e instanceof RemoteException ? C1BAX.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION : e instanceof SecurityException ? C1BAX.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION : C1BAX.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
                                                String strLIZ = c1bax3.equals(C1BAX.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION) ? C2200521BAk.LIZ(e) : null;
                                                c1baz.LLILZIL.LJJIJL(0);
                                                c1baz.LIZJ(z3 ? C2200541BAm.LJIIIZ : C2200541BAm.LJII, c1bax3, strLIZ, z2);
                                                c1baz.LIZLLL(z3 ? C2200541BAm.LJIIIZ : C2200541BAm.LJII);
                                            }
                                        }
                                        c1bay4.LJIIJJI = z;
                                        c1bay4.LJIIJ = i2 >= 3;
                                        if (i2 < 3) {
                                            c1bax = C1BAX.SUBSCRIPTIONS_NOT_SUPPORTED;
                                            C2200451BAd.LJI("BillingClient", "In-app billing API does not support subscription on this device.");
                                        }
                                        int i3 = 27;
                                        while (true) {
                                            C2200451BAd.LJI("BillingClient", "trying inapp apiVersion: " + i3);
                                            iLLLLIILLL = bundle == null ? interfaceC2200631BAv.LLLLIILLL(i3, packageName, "inapp") : interfaceC2200631BAv.LJLLLL(i3, packageName, "inapp", bundle);
                                            if (iLLLLIILLL != 0) {
                                                i3--;
                                                if (i3 < 3) {
                                                    break;
                                                }
                                            } else {
                                                c1bay4.LJIIL = i3;
                                                C2200451BAd.LJI("BillingClient", "mHighestLevelSupportedForInApp: " + i3);
                                                break;
                                            }
                                        }
                                        C1BAY.LJJI(c1bay4, c1bay4.LJIIL);
                                        if (c1bay4.LJIIL < 3) {
                                            c1bax = C1BAX.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                                        }
                                        C1BAY.LJJIFFI(c1bay4, iLLLLIILLL);
                                        if (iLLLLIILLL != 0) {
                                            C19885612rG c19885612rG2 = C2200541BAm.LIZIZ;
                                            c1baz.LIZJ(c19885612rG2, c1bax, null, z2);
                                            c1baz.LIZLLL(c19885612rG2);
                                        } else {
                                            try {
                                                Long lLIZIZ = c1baz.LIZIZ(z2);
                                                if (z2) {
                                                    C1BBB c1bbbLJIJJLI = C2200671BAz.LJIJJLI();
                                                    c1bbbLJIJJLI.LJFF(6);
                                                    C1BB8 c1bb8LJIJJ = C1BB2.LJIJJ();
                                                    int i4 = c1baz.LLILZ;
                                                    c1bb8LJIJJ.LJFF(i4 > 0);
                                                    c1bb8LJIJJ.LJI(i4);
                                                    c1bb8LJIJJ.LIZLLL();
                                                    C1BB2.LJJIFFI((C1BB2) c1bb8LJIJJ.LLILLJJLI);
                                                    if (lLIZIZ != null) {
                                                        long jLongValue = lLIZIZ.longValue();
                                                        c1bb8LJIJJ.LIZLLL();
                                                        C1BB2.LJJI((C1BB2) c1bb8LJIJJ.LLILLJJLI, jLongValue);
                                                    }
                                                    C1BAY c1bay5 = c1baz.LLILZIL;
                                                    c1bbbLJIJJLI.LIZLLL();
                                                    C2200671BAz.LJJIII((C2200671BAz) c1bbbLJIJJLI.LLILLJJLI, (C1BB2) c1bb8LJIJJ.LIZIZ());
                                                    c1bay5.LJJIJIIJIL((C2200671BAz) c1bbbLJIJJLI.LIZIZ());
                                                } else {
                                                    C1BBE c1bbeLJIJJ = C1BB3.LJIJJ();
                                                    C1BB7 c1bb7LJIJJLI = C1BB1.LJIJJLI();
                                                    c1bb7LJIJJLI.LJI(0);
                                                    c1bb7LJIJJLI.LIZLLL();
                                                    C1BB1.LJJIFFI((C1BB1) c1bb7LJIJJLI.LLILLJJLI);
                                                    c1bbeLJIJJ.LIZLLL();
                                                    C1BB3.LJIL((C1BB3) c1bbeLJIJJ.LLILLJJLI, (C1BB1) c1bb7LJIJJLI.LIZIZ());
                                                    if (lLIZIZ != null) {
                                                        long jLongValue2 = lLIZIZ.longValue();
                                                        c1bbeLJIJJ.LIZLLL();
                                                        C1BB3.LJJ((C1BB3) c1bbeLJIJJ.LLILLJJLI, jLongValue2);
                                                    }
                                                    ((C2200551BAn) c1baz.LLILZIL.LJII).LJFF((C1BB3) c1bbeLJIJJ.LIZIZ());
                                                }
                                            } catch (Throwable th) {
                                            }
                                            c1baz.LIZLLL(C2200541BAm.LJIIIIZZ);
                                        }
                                    }
                                }
                            } finally {
                            }
                        }
                        C1C7U.LIZIZ("zzbx@8a62.call");
                        return null;
                    }
                }, 30000L, new Runnable() { // from class: X.1BAt
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("zzby@8a61.run");
                        try {
                            C1BAZ c1baz = this.LL;
                            C1BAY c1bay2 = c1baz.LLILZIL;
                            c1bay2.LJJIJL(0);
                            C1BAX c1bax = C1BAX.EXECUTE_ASYNC_TIMEOUT;
                            C19885612rG c19885612rG = C2200541BAm.LJIIJ;
                            c1bay2.LJJIJIL(c1baz.LLILZ, c19885612rG, c1bax);
                            c1baz.LIZLLL(c19885612rG);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("zzby@8a61.run");
                    }
                }, c1bay.LJJIII(), c1bay.LJIILLIIL()) == null) {
                    int i = this.LLILZ;
                    C19885612rG c19885612rGLJJIIZ = c1bay.LJJIIZ();
                    c1bay.LJJIJIL(i, c19885612rGLJJIIZ, C1BAX.MISSING_RESULT_FROM_EXECUTE_ASYNC);
                    LIZLLL(c19885612rGLJJIIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1BAZ(C1BAY c1bay, InterfaceC2200341B9s interfaceC2200341B9s, int i) {
        Objects.requireNonNull(c1bay);
        this.LLILZIL = c1bay;
        this.LLILLJJLI = new C138Q(c1bay.LJJIJIL);
        this.LLILLL = new C138Q(c1bay.LJJIJIL);
        this.LL = interfaceC2200341B9s;
        this.LLILZ = i;
    }

    public final void LIZJ(C19885612rG c19885612rG, C1BAX c1bax, String str, boolean z) {
        boolean z2;
        try {
            C1BB7 c1bb7LJIJJLI = C1BB1.LJIJJLI();
            c1bb7LJIJJLI.LJI(c19885612rG.LIZ);
            String str2 = c19885612rG.LIZJ;
            c1bb7LJIJJLI.LIZLLL();
            C1BB1.LJJI((C1BB1) c1bb7LJIJJLI.LLILLJJLI, str2);
            c1bb7LJIJJLI.LJFF(c1bax);
            c1bb7LJIJJLI.LIZLLL();
            C1BB1.LJJIFFI((C1BB1) c1bb7LJIJJLI.LLILLJJLI);
            if (str != null) {
                c1bb7LJIJJLI.LIZLLL();
                C1BB1.LJJ((C1BB1) c1bb7LJIJJLI.LLILLJJLI, str);
            }
            Long lLIZIZ = LIZIZ(z);
            if (z) {
                C1BB8 c1bb8LJIJJ = C1BB2.LJIJJ();
                int i = this.LLILZ;
                if (i > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c1bb8LJIJJ.LJFF(z2);
                c1bb8LJIJJ.LJI(i);
                c1bb8LJIJJ.LIZLLL();
                C1BB2.LJJIFFI((C1BB2) c1bb8LJIJJ.LLILLJJLI);
                if (lLIZIZ != null) {
                    long jLongValue = lLIZIZ.longValue();
                    c1bb8LJIJJ.LIZLLL();
                    C1BB2.LJJI((C1BB2) c1bb8LJIJJ.LLILLJJLI, jLongValue);
                }
                C1BAY c1bay = this.LLILZIL;
                C2200641BAw c2200641BAwLJJ = C2200661BAy.LJJ();
                c2200641BAwLJJ.LJFF(c1bb7LJIJJLI);
                c2200641BAwLJJ.LJII(6);
                c2200641BAwLJJ.LJI(c1bb8LJIJJ);
                c1bay.LJJIJIIJI((C2200661BAy) c2200641BAwLJJ.LIZIZ());
                return;
            }
            C1BBE c1bbeLJIJJ = C1BB3.LJIJJ();
            c1bbeLJIJJ.LIZLLL();
            C1BB3.LJIL((C1BB3) c1bbeLJIJJ.LLILLJJLI, (C1BB1) c1bb7LJIJJLI.LIZIZ());
            if (lLIZIZ != null) {
                long jLongValue2 = lLIZIZ.longValue();
                c1bbeLJIJJ.LIZLLL();
                C1BB3.LJJ((C1BB3) c1bbeLJIJJ.LLILLJJLI, jLongValue2);
            }
            ((C2200551BAn) this.LLILZIL.LJII).LJFF((C1BB3) c1bbeLJIJJ.LIZIZ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
