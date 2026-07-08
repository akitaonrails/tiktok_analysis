package X;

import X.C830490Whz;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zaq;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: X.0WkB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831850WkB implements InterfaceC832020WkS {
    public final Context LL;
    public final C831920WkI LLILLJJLI;
    public final Looper LLILLL;
    public final C831840WkA LLILZ;
    public final C831840WkA LLILZIL;
    public final Map<C832230Wkn<?>, C831840WkA> LLILZLL;
    public final InterfaceC831160Wj4 LLIZLLLIL;
    public Bundle LLJ;
    public final Lock LLJILJILJ;
    public final Set<InterfaceC832980Wm0> LLIZ = Collections.newSetFromMap(new WeakHashMap());
    public ConnectionResult LLJI = null;
    public ConnectionResult LLJIJIL = null;
    public boolean LLJILJIL = false;
    public int LLJILLL = 0;

    @Override // X.InterfaceC832020WkS
    public final void LIZLLL() {
        this.LLJILLL = 2;
        this.LLJILJIL = false;
        this.LLJIJIL = null;
        this.LLJI = null;
        this.LLILZ.LIZLLL();
        this.LLILZIL.LIZLLL();
    }

    @Override // X.InterfaceC832020WkS
    public final void LJFF() {
        this.LLJIJIL = null;
        this.LLJI = null;
        this.LLJILLL = 0;
        this.LLILZ.LJFF();
        this.LLILZIL.LJFF();
        LJIIIIZZ();
    }

    @Override // X.InterfaceC832020WkS
    public final void LJ() {
        this.LLJILJILJ.lock();
        try {
            boolean zLJIIJJI = LJIIJJI();
            this.LLILZIL.LJFF();
            this.LLJIJIL = new ConnectionResult(4);
            if (zLJIIJJI) {
                C786410Ut5.LJJZZIII(new zaq(this.LLILLL), new Runnable() { // from class: X.0WkV
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("zav@41a7.run");
                        try {
                            this.LL.LLJILJILJ.lock();
                            try {
                                C831850WkB.LJIIJ(this.LL);
                                this.LL.LLJILJILJ.unlock();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LL.LLJILJILJ.unlock();
                                throw th;
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("zav@41a7.run");
                    }
                });
            } else {
                LJIIIIZZ();
            }
            this.LLJILJILJ.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJILJILJ.unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    @Override // X.InterfaceC832020WkS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI() {
        /*
            r4 = this;
            java.util.concurrent.locks.Lock r0 = r4.LLJILJILJ
            r0.lock()
            X.0WkA r0 = r4.LLILZ     // Catch: java.lang.Throwable -> L2c
            X.0WkP r0 = r0.LLJIJIL     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0 instanceof X.C831860WkC     // Catch: java.lang.Throwable -> L2c
            r3 = 0
            if (r0 == 0) goto L26
            X.0WkA r0 = r4.LLILZIL     // Catch: java.lang.Throwable -> L2c
            X.0WkP r0 = r0.LLJIJIL     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0 instanceof X.C831860WkC     // Catch: java.lang.Throwable -> L2c
            r2 = 1
            if (r0 != 0) goto L25
            com.google.android.gms.common.ConnectionResult r0 = r4.LLJIJIL     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L21
            int r1 = r0.zzb     // Catch: java.lang.Throwable -> L2c
            r0 = 4
            if (r1 != r0) goto L21
            goto L25
        L21:
            int r0 = r4.LLJILLL     // Catch: java.lang.Throwable -> L2c
            if (r0 != r2) goto L26
        L25:
            r3 = 1
        L26:
            java.util.concurrent.locks.Lock r0 = r4.LLJILJILJ
            r0.unlock()
            return r3
        L2c:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.util.concurrent.locks.Lock r0 = r4.LLJILJILJ
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C831850WkB.LJI():boolean");
    }

    public final void LJIIIIZZ() {
        Iterator<InterfaceC832980Wm0> it2 = this.LLIZ.iterator();
        while (it2.hasNext()) {
            it2.next().onComplete();
        }
        this.LLIZ.clear();
    }

    public final boolean LJIIJJI() {
        this.LLJILJILJ.lock();
        try {
            boolean z = this.LLJILLL == 2;
            this.LLJILJILJ.unlock();
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJILJILJ.unlock();
            throw th;
        }
    }

    public static void LJIIJ(C831850WkB c831850WkB) {
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        ConnectionResult connectionResult3 = c831850WkB.LLJI;
        if (connectionResult3 != null && connectionResult3.LLFFF()) {
            ConnectionResult connectionResult4 = c831850WkB.LLJIJIL;
            if (connectionResult4 == null || !connectionResult4.LLFFF()) {
                ConnectionResult connectionResult5 = c831850WkB.LLJIJIL;
                if (connectionResult5 != null) {
                    if (connectionResult5.zzb != 4) {
                        if (c831850WkB.LLJILLL == 1) {
                            c831850WkB.LJIIIIZZ();
                            return;
                        } else {
                            c831850WkB.LJII(connectionResult5);
                            c831850WkB.LLILZ.LJFF();
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            int i = c831850WkB.LLJILLL;
            if (i != 1) {
                if (i != 2) {
                    Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                } else {
                    C831920WkI c831920WkI = c831850WkB.LLILLJJLI;
                    C0W3J.LJIIIIZZ(c831920WkI);
                    c831920WkI.LIZIZ(c831850WkB.LLJ);
                    c831850WkB.LJIIIIZZ();
                }
            } else {
                c831850WkB.LJIIIIZZ();
            }
            c831850WkB.LLJILLL = 0;
            return;
        }
        if (c831850WkB.LLJI != null && (connectionResult2 = c831850WkB.LLJIJIL) != null && connectionResult2.LLFFF()) {
            c831850WkB.LLILZIL.LJFF();
            ConnectionResult connectionResult6 = c831850WkB.LLJI;
            C0W3J.LJIIIIZZ(connectionResult6);
            c831850WkB.LJII(connectionResult6);
            return;
        }
        ConnectionResult connectionResult7 = c831850WkB.LLJI;
        if (connectionResult7 != null && (connectionResult = c831850WkB.LLJIJIL) != null) {
            if (c831850WkB.LLILZIL.LLJILJIL < c831850WkB.LLILZ.LLJILJIL) {
                connectionResult7 = connectionResult;
            }
            c831850WkB.LJII(connectionResult7);
        }
    }

    @Override // X.InterfaceC832020WkS
    public final <A, T extends AbstractC831980WkO<? extends InterfaceC832870Wlp, A>> T LIZ(T t) {
        PendingIntent activity;
        C831840WkA c831840WkA = this.LLILZLL.get(t.LJIILJJIL);
        C0W3J.LJIIIZ(c831840WkA, "GoogleApiClient is not configured to use the API required for this call.");
        if (c831840WkA.equals(this.LLILZIL)) {
            ConnectionResult connectionResult = this.LLJIJIL;
            if (connectionResult != null && connectionResult.zzb == 4) {
                if (this.LLIZLLLIL == null) {
                    activity = null;
                } else {
                    activity = PendingIntent.getActivity(this.LL, System.identityHashCode(this.LLILLJJLI), this.LLIZLLLIL.getSignInIntent(), C800310VaP.LIZ | 134217728);
                }
                t.LJIILJJIL(new Status(4, activity, null));
                return t;
            }
            C831840WkA c831840WkA2 = this.LLILZIL;
            c831840WkA2.getClass();
            t.LJIIJJI();
            return (T) c831840WkA2.LLJIJIL.LIZIZ(t);
        }
        C831840WkA c831840WkA3 = this.LLILZ;
        c831840WkA3.getClass();
        t.LJIIJJI();
        return (T) c831840WkA3.LLJIJIL.LIZIZ(t);
    }

    @Override // X.InterfaceC832020WkS
    public final boolean LIZJ(InterfaceC832980Wm0 interfaceC832980Wm0) {
        this.LLJILJILJ.lock();
        try {
            if ((LJIIJJI() || LJI()) && !(this.LLILZIL.LLJIJIL instanceof C831860WkC)) {
                this.LLIZ.add(interfaceC832980Wm0);
                if (this.LLJILLL == 0) {
                    this.LLJILLL = 1;
                }
                this.LLJIJIL = null;
                this.LLILZIL.LIZLLL();
                this.LLJILJILJ.unlock();
                return true;
            }
            this.LLJILJILJ.unlock();
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJILJILJ.unlock();
            throw th;
        }
    }

    public final void LJII(ConnectionResult connectionResult) {
        int i = this.LLJILLL;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
            } else {
                this.LLILLJJLI.LIZ(connectionResult);
                LJIIIIZZ();
            }
        } else {
            LJIIIIZZ();
        }
        this.LLJILLL = 0;
    }

    public static /* bridge */ /* synthetic */ void LJIIIZ(C831850WkB c831850WkB, int i) {
        c831850WkB.LLILLJJLI.LIZJ(i);
        c831850WkB.LLJIJIL = null;
        c831850WkB.LLJI = null;
    }

    @Override // X.InterfaceC832020WkS
    public final void LIZIZ(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.LLILZIL.LIZIZ(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.LLILZ.LIZIZ(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public C831850WkB(Context context, C831920WkI c831920WkI, Lock lock, Looper looper, GoogleApiAvailability googleApiAvailability, C830490Whz c830490Whz, C830490Whz c830490Whz2, C831470WjZ c831470WjZ, AbstractC831970WkN abstractC831970WkN, InterfaceC831160Wj4 interfaceC831160Wj4, ArrayList arrayList, ArrayList arrayList2, C830490Whz c830490Whz3, C830490Whz c830490Whz4) {
        this.LL = context;
        this.LLILLJJLI = c831920WkI;
        this.LLJILJILJ = lock;
        this.LLILLL = looper;
        this.LLIZLLLIL = interfaceC831160Wj4;
        this.LLILZ = new C831840WkA(context, c831920WkI, lock, looper, googleApiAvailability, c830490Whz2, null, c830490Whz4, null, arrayList2, new InterfaceC832210Wkl() { // from class: X.0WkG
            @Override // X.InterfaceC832210Wkl
            public final void LIZ(ConnectionResult connectionResult) {
                this.LIZ.LLJILJILJ.lock();
                try {
                    C831850WkB c831850WkB = this.LIZ;
                    c831850WkB.LLJI = connectionResult;
                    C831850WkB.LJIIJ(c831850WkB);
                    this.LIZ.LLJILJILJ.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZ.LLJILJILJ.unlock();
                    throw th;
                }
            }

            @Override // X.InterfaceC832210Wkl
            public final void LIZIZ(Bundle bundle) {
                this.LIZ.LLJILJILJ.lock();
                try {
                    C831850WkB c831850WkB = this.LIZ;
                    Bundle bundle2 = c831850WkB.LLJ;
                    if (bundle2 == null) {
                        c831850WkB.LLJ = bundle;
                    } else if (bundle != null) {
                        C786410Ut5.LJJIIJZLJL(bundle2, bundle);
                    }
                    C831850WkB c831850WkB2 = this.LIZ;
                    c831850WkB2.LLJI = ConnectionResult.RESULT_SUCCESS;
                    C831850WkB.LJIIJ(c831850WkB2);
                    this.LIZ.LLJILJILJ.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZ.LLJILJILJ.unlock();
                    throw th;
                }
            }

            @Override // X.InterfaceC832210Wkl
            public final void LIZJ(int i) {
                Lock lock2;
                ConnectionResult connectionResult;
                this.LIZ.LLJILJILJ.lock();
                try {
                    C831850WkB c831850WkB = this.LIZ;
                    if (!c831850WkB.LLJILJIL && (connectionResult = c831850WkB.LLJIJIL) != null && connectionResult.LLFFF()) {
                        C831850WkB c831850WkB2 = this.LIZ;
                        c831850WkB2.LLJILJIL = true;
                        c831850WkB2.LLILZIL.Js(i);
                        lock2 = this.LIZ.LLJILJILJ;
                    } else {
                        C831850WkB c831850WkB3 = this.LIZ;
                        c831850WkB3.LLJILJIL = false;
                        C831850WkB.LJIIIZ(c831850WkB3, i);
                        lock2 = this.LIZ.LLJILJILJ;
                    }
                    lock2.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZ.LLJILJILJ.unlock();
                    throw th;
                }
            }
        });
        this.LLILZIL = new C831840WkA(context, c831920WkI, lock, looper, googleApiAvailability, c830490Whz, c831470WjZ, c830490Whz3, abstractC831970WkN, arrayList, new InterfaceC832210Wkl() { // from class: X.0WkQ
            @Override // X.InterfaceC832210Wkl
            public final void LIZ(ConnectionResult connectionResult) {
                this.LIZ.LLJILJILJ.lock();
                try {
                    C831850WkB c831850WkB = this.LIZ;
                    c831850WkB.LLJIJIL = connectionResult;
                    C831850WkB.LJIIJ(c831850WkB);
                    this.LIZ.LLJILJILJ.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZ.LLJILJILJ.unlock();
                    throw th;
                }
            }

            @Override // X.InterfaceC832210Wkl
            public final void LIZIZ(Bundle bundle) {
                this.LIZ.LLJILJILJ.lock();
                try {
                    C831850WkB c831850WkB = this.LIZ;
                    c831850WkB.LLJIJIL = ConnectionResult.RESULT_SUCCESS;
                    C831850WkB.LJIIJ(c831850WkB);
                    this.LIZ.LLJILJILJ.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZ.LLJILJILJ.unlock();
                    throw th;
                }
            }

            @Override // X.InterfaceC832210Wkl
            public final void LIZJ(int i) {
                Lock lock2;
                this.LIZ.LLJILJILJ.lock();
                try {
                    C831850WkB c831850WkB = this.LIZ;
                    if (c831850WkB.LLJILJIL) {
                        c831850WkB.LLJILJIL = false;
                        C831850WkB.LJIIIZ(c831850WkB, i);
                        lock2 = this.LIZ.LLJILJILJ;
                    } else {
                        c831850WkB.LLJILJIL = true;
                        c831850WkB.LLILZ.Js(i);
                        lock2 = this.LIZ.LLJILJILJ;
                    }
                    lock2.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZ.LLJILJILJ.unlock();
                    throw th;
                }
            }
        });
        C830490Whz c830490Whz5 = new C830490Whz();
        Iterator it2 = ((C830490Whz.c) c830490Whz2.keySet()).iterator();
        while (it2.hasNext()) {
            c830490Whz5.put(it2.next(), this.LLILZ);
        }
        Iterator it3 = ((C830490Whz.c) c830490Whz.keySet()).iterator();
        while (it3.hasNext()) {
            c830490Whz5.put(it3.next(), this.LLILZIL);
        }
        this.LLILZLL = Collections.unmodifiableMap(c830490Whz5);
    }
}
