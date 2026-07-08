package X;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import com.android.billingclient.api.zzbq;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BAY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1BAY extends AbstractC1795460wp6 {
    public final String LIZJ;
    public final String LIZLLL;
    public volatile C2200591BAr LJFF;
    public Context LJI;
    public C1BBD LJII;
    public volatile InterfaceC2200631BAv LJIIIIZZ;
    public volatile C1BAZ LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public C1796240wqM LJJIIJZLJL;
    public boolean LJJIIZ;
    public boolean LJJIIZI;
    public volatile InterfaceC2200341B9s LJJIJ;
    public ExecutorService LJJIJIIJI;
    public final Long LJJIJIIJIL;
    public final C1BFT LJJIJIL;
    public final Object LIZ = new Object();
    public volatile int LIZIZ = 0;
    public final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());
    public int LJIIL = 0;

    public static String LJIJI() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void LJJI(C1BAY c1bay, int i) {
        c1bay.LJIIL = i;
        c1bay.LJJIIJ = i >= 27;
        c1bay.LJJIII = i >= 26;
        c1bay.LJJII = i >= 24;
        c1bay.LJJIFFI = i >= 23;
        c1bay.LJJI = i >= 21;
        c1bay.LJJ = i >= 20;
        c1bay.LJIL = i >= 19;
        c1bay.LJIJJLI = i >= 18;
        c1bay.LJIJJ = i >= 17;
        c1bay.LJIJI = i >= 16;
        c1bay.LJIJ = i >= 15;
        c1bay.LJIIZILJ = i >= 14;
        c1bay.LJIILLIIL = i >= 12;
        c1bay.LJIILL = i >= 9;
        c1bay.LJIILJJIL = i >= 8;
        c1bay.LJIILIIL = i >= 6;
    }

    public final synchronized ExecutorService LJIILLIIL() {
        if (this.LJJIJIIJI == null) {
            this.LJJIJIIJI = C786410Ut5.e4(C2200451BAd.LIZ, new ThreadFactory(this) { // from class: X.0VJs
                public final ThreadFactory LL;
                public final AtomicInteger LLILLJJLI;

                {
                    Objects.requireNonNull(this);
                    this.LL = Executors.defaultThreadFactory();
                    this.LLILLJJLI = new AtomicInteger(1);
                }

                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    AtomicInteger atomicInteger = this.LLILLJJLI;
                    Thread threadNewThread = this.LL.newThread(runnable);
                    int andIncrement = atomicInteger.getAndIncrement();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PlayBillingLibrary-");
                    sbLIZ.append(andIncrement);
                    ThreadMethodProxy.setName(threadNewThread, C2188811AlT.LIZIZ(sbLIZ));
                    return threadNewThread;
                }
            });
        }
        return this.LJJIJIIJI;
    }

    public final void LJIJ() {
        if (TextUtils.isEmpty(null)) {
            this.LJI.getPackageName();
        }
    }

    public final C19885612rG LJJIIZ() {
        int[] iArr = {0, 3};
        synchronized (this.LIZ) {
            int i = 0;
            do {
                try {
                    if (this.LIZIZ == iArr[i]) {
                        return C2200541BAm.LJIIIZ;
                    }
                    i++;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            } while (i < 2);
            return C2200541BAm.LJII;
        }
    }

    public final synchronized void LJJIJLIJ() {
        ExecutorService executorService = this.LJJIJIIJI;
        if (executorService != null) {
            executorService.shutdownNow();
            this.LJJIJIIJI = null;
        }
    }

    @Override // X.AbstractC1795460wp6
    public void LIZLLL() {
        try {
            int i = C2200521BAk.LIZ;
            LJJIJIIJIL(C2200521BAk.LIZJ(12, EnumC2200651BAx.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        synchronized (this.LIZ) {
            try {
                if (this.LJFF != null) {
                    C2200591BAr c2200591BAr = this.LJFF;
                    C2200461BAe c2200461BAe = c2200591BAr.LIZLLL;
                    Context context = c2200591BAr.LIZ;
                    c2200461BAe.LIZJ(context);
                    c2200591BAr.LJ.LIZJ(context);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            try {
                C2200451BAd.LJI("BillingClient", "Unbinding from service.");
                LJJIZ();
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
            try {
                LJJIJLIJ();
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
            }
            try {
                LJJIJL(3);
                this.LJJIJ = null;
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                throw th5;
            }
        }
    }

    @Override // X.AbstractC1795460wp6
    public final int LJFF() {
        int i;
        synchronized (this.LIZ) {
            try {
                i = this.LIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }

    @Override // X.AbstractC1795460wp6
    public final boolean LJIIIIZZ() {
        if (this.LJJIIZ) {
            return true;
        }
        return LJJJIL();
    }

    public final void LJJIZ() {
        synchronized (this.LIZ) {
            try {
                if (this.LJIIIZ != null) {
                    try {
                        this.LJI.unbindService(this.LJIIIZ);
                        this.LJIIIIZZ = null;
                        this.LJIIIZ = null;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LJIIIIZZ = null;
                        this.LJIIIZ = null;
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJJJ() {
        try {
            int i = ((C19885612rG) LJJIIZI(1).get(Build.VERSION.SDK_INT < 29 ? 0L : 3000L, TimeUnit.MILLISECONDS)).LIZ;
            if (i == 0) {
                C2200451BAd.LJI("BillingClient", "Reconnection succeeded with result: " + i);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (e instanceof InterruptedException) {
                C786410Ut5.u3().interrupt();
            }
        }
        return LJJJIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJJJI() {
        long jMax;
        C138Q c138q = new C138Q(this.LJJIJIL);
        c138q.LIZ();
        long jConvert = 30000;
        for (int i = 1; i <= 3; i++) {
            try {
                jMax = Math.max(0L, jConvert);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (e instanceof InterruptedException) {
                    C786410Ut5.u3().interrupt();
                }
            }
            if (jMax <= 0) {
                return LJJJIL();
            }
            int i2 = ((C19885612rG) LJJIIZI(i).get(jMax, TimeUnit.MILLISECONDS)).LIZ;
            if (i2 == 0) {
                C2200451BAd.LJI("BillingClient", "Reconnection succeeded with result: " + i2);
                return LJJJIL();
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long jLIZ = c138q.LIZIZ ? (c138q.LIZ.LIZ() - c138q.LIZLLL) + c138q.LIZJ : c138q.LIZJ;
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            jConvert = 30000 - timeUnit.convert(jLIZ, timeUnit2);
            long jPow = ((long) Math.pow(2.0d, i - 1)) * 1000;
            if (jConvert < jPow) {
                return LJJJIL();
            }
            if (i >= 3) {
                break;
            }
            if (jPow > 0) {
                try {
                    Thread.sleep(jPow);
                    jConvert = 30000 - timeUnit.convert(c138q.LIZIZ ? (c138q.LIZ.LIZ() - c138q.LIZLLL) + c138q.LIZJ : c138q.LIZJ, timeUnit2);
                } catch (InterruptedException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C786410Ut5.u3().interrupt();
                }
            }
        }
        return LJJJIL();
    }

    public final boolean LJJJIL() {
        boolean z;
        synchronized (this.LIZ) {
            try {
                z = false;
                if (this.LIZIZ == 2 && this.LJIIIIZZ != null && this.LJIIIZ != null) {
                    z = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final Handler LJJIII() {
        return Looper.myLooper() == null ? this.LJ : new BPEAHandler(Looper.myLooper());
    }

    public static /* bridge */ /* synthetic */ boolean LJJII(C1BAY c1bay) {
        boolean z;
        synchronized (c1bay.LIZ) {
            try {
                z = true;
                if (c1bay.LIZIZ != 1) {
                    z = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    @Override // X.AbstractC1795460wp6
    public final void LJ(final InterfaceC1796790wrF interfaceC1796790wrF) {
        if (LJIIZILJ(new Callable() { // from class: X.1BAl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC2200631BAv interfaceC2200631BAv;
                C1C7U.LIZ("zzat@8a85.call");
                C1BAY c1bay = this.LL;
                InterfaceC1796790wrF interfaceC1796790wrF2 = interfaceC1796790wrF;
                c1bay.getClass();
                try {
                    if (!c1bay.LJJJI()) {
                        C1BAX c1bax = C1BAX.SERVICE_CONNECTION_NOT_READY;
                        C19885612rG c19885612rG = C2200541BAm.LJIIIZ;
                        c1bay.LJJJJJ(13, c19885612rG, c1bax);
                        interfaceC1796790wrF2.LIZ(c19885612rG, null);
                    } else if (c1bay.LJIJJLI) {
                        synchronized (c1bay.LIZ) {
                            try {
                                interfaceC2200631BAv = c1bay.LJIIIIZZ;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        if (interfaceC2200631BAv == null) {
                            C19885612rG c19885612rG2 = C2200541BAm.LJIIIZ;
                            c1bay.LJJJJL(C1BAX.SERVICE_RESET_TO_NULL, 13, c19885612rG2, C2200521BAk.LIZ(null));
                            interfaceC1796790wrF2.LIZ(c19885612rG2, null);
                        } else {
                            String packageName = c1bay.LJI.getPackageName();
                            String str = c1bay.LIZJ;
                            String str2 = c1bay.LIZLLL;
                            long jLongValue = c1bay.LJJIJIIJIL.longValue();
                            Bundle bundle = new Bundle();
                            C2200451BAd.LIZIZ(jLongValue, str, str2, bundle);
                            interfaceC2200631BAv.R0(packageName, bundle, new C1B9W(interfaceC1796790wrF2, c1bay.LJII, c1bay.LJIIL));
                        }
                    } else {
                        C1BAX c1bax2 = C1BAX.GET_BILLING_CONFIG_NOT_SUPPORTED;
                        C19885612rG c19885612rG3 = C2200541BAm.LJJI;
                        c1bay.LJJJJJ(13, c19885612rG3, c1bax2);
                        interfaceC1796790wrF2.LIZ(c19885612rG3, null);
                    }
                } catch (DeadObjectException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19885612rG c19885612rG4 = C2200541BAm.LJIIIZ;
                    c1bay.LJJJJL(C1BAX.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, 13, c19885612rG4, C2200521BAk.LIZ(e));
                    interfaceC1796790wrF2.LIZ(c19885612rG4, null);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C19885612rG c19885612rG5 = C2200541BAm.LJII;
                    c1bay.LJJJJL(C1BAX.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, 13, c19885612rG5, C2200521BAk.LIZ(e2));
                    interfaceC1796790wrF2.LIZ(c19885612rG5, null);
                }
                C1C7U.LIZIZ("zzat@8a85.call");
                return null;
            }
        }, 30000L, new Runnable() { // from class: X.1B9e
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzau@8a84.run");
                try {
                    C1BAY c1bay = this.LL;
                    InterfaceC1796790wrF interfaceC1796790wrF2 = interfaceC1796790wrF;
                    C1BAX c1bax = C1BAX.EXECUTE_ASYNC_TIMEOUT;
                    C19885612rG c19885612rG = C2200541BAm.LJIIJ;
                    c1bay.LJJJJJ(13, c19885612rG, c1bax);
                    interfaceC1796790wrF2.LIZ(c19885612rG, null);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzau@8a84.run");
            }
        }, LJJIII(), LJIILLIIL()) == null) {
            C19885612rG c19885612rGLJJIIZ = LJJIIZ();
            LJJJJJ(13, c19885612rGLJJIIZ, C1BAX.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            interfaceC1796790wrF.LIZ(c19885612rGLJJIIZ, null);
        }
    }

    @Override // X.AbstractC1795460wp6
    public final void LJI(final InterfaceC2200191B9d interfaceC2200191B9d) {
        if (LJIIZILJ(new Callable() { // from class: X.1BAg
            public final /* synthetic */ int LLILLL = 1;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC2200631BAv interfaceC2200631BAv;
                C1C7U.LIZ("zzao@8a8a.call");
                C1BAY c1bay = this.LL;
                InterfaceC2200191B9d interfaceC2200191B9d2 = interfaceC2200191B9d;
                int i = this.LLILLL;
                c1bay.getClass();
                try {
                    if (!c1bay.LJJJI()) {
                        c1bay.LJIJJ(interfaceC2200191B9d2, i, C2200541BAm.LJIIIZ, C1BAX.SERVICE_CONNECTION_NOT_READY, null);
                    } else if (c1bay.LJJIIJ) {
                        synchronized (c1bay.LIZ) {
                            try {
                                interfaceC2200631BAv = c1bay.LJIIIIZZ;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        if (interfaceC2200631BAv == null) {
                            c1bay.LJIJJ(interfaceC2200191B9d2, i, C2200541BAm.LJIIIZ, C1BAX.SERVICE_RESET_TO_NULL, null);
                        } else {
                            String str = c1bay.LIZJ;
                            C199642139k c199642139kLIZ = C199643139l.LIZ(c1bay.LJI, str, "isIndirectBillingProgramAvailable");
                            C19913212vi c19913212viLJIJJ = C19913112vh.LJIJJ();
                            C19914112vr c19914112vrLJIJJ = C19914012vq.LJIJJ();
                            c19914112vrLJIJJ.LJFF(str);
                            c19913212viLJIJJ.LJFF((C19914012vq) c19914112vrLJIJJ.LIZIZ(), "PLAY_BILLING_LIBRARY_VERSION");
                            C19914112vr c19914112vrLJIJJ2 = C19914012vq.LJIJJ();
                            c19914112vrLJIJJ2.LJFF(c1bay.LJI.getPackageName());
                            c19913212viLJIJJ.LJFF((C19914012vq) c19914112vrLJIJJ2.LIZIZ(), "CALLING_PACKAGE");
                            C19914112vr c19914112vrLJIJJ3 = C19914012vq.LJIJJ();
                            c19914112vrLJIJJ3.LJFF(String.valueOf(i));
                            c19913212viLJIJJ.LJFF((C19914012vq) c19914112vrLJIJJ3.LIZIZ(), "BILLING_PROGRAM");
                            C19913112vh c19913112vh = (C19913112vh) c19913212viLJIJJ.LIZIZ();
                            Bundle bundle = new Bundle();
                            C786410Ut5.LJJIJ(bundle, "REQUEST_METADATA", c199642139kLIZ.LIZIZ());
                            C786410Ut5.LJJIJ(bundle, "REQUEST_PARAMS", c19913112vh.LIZIZ());
                            C1BBD c1bbd = c1bay.LJII;
                            int i2 = c1bay.LJIIL;
                            c1bay.LJJIII();
                            interfaceC2200631BAv.LLILZIL(bundle, new C1B9M(interfaceC2200191B9d2, i, c1bbd, i2, c1bay.LJIILLIIL()) { // from class: X.1B9c
                                public final InterfaceC2200191B9d LL;
                                public final int LLILLJJLI;
                                public final ExecutorService LLILLL;
                                public final C1BBD LLILZ;

                                @Override // X.C1B9O
                                public final void y0(Bundle bundle2) {
                                    if (bundle2 == null) {
                                        C1BBD c1bbd2 = this.LLILZ;
                                        C1BAX c1bax = C1BAX.NULL_BUNDLE_FROM_DELEGATE_TO_BACKEND_SERVICE_CALL;
                                        C19885612rG c19885612rG = C2200541BAm.LJII;
                                        C1B9Z.LIZ(c1bax, c19885612rG, c1bbd2, 33, this.LLILLJJLI);
                                        this.LL.LIZ(c19885612rG);
                                        return;
                                    }
                                    C19885612rG c19885612rGLIZ = C2200161B9a.LIZ(bundle2, 33, this.LLILZ, this.LLILLJJLI);
                                    InterfaceC2200191B9d interfaceC2200191B9d3 = this.LL;
                                    if (interfaceC2200191B9d3 == null) {
                                        C1B9Z.LIZ(C1BAX.NULL_LISTENER_IN_DELEGATE_TO_BACKEND_CALLBACK, c19885612rGLIZ, this.LLILZ, 33, this.LLILLJJLI);
                                    } else {
                                        interfaceC2200191B9d3.LIZ(c19885612rGLIZ);
                                    }
                                }

                                {
                                    interfaceC2200191B9d2.getClass();
                                    this.LL = interfaceC2200191B9d2;
                                    this.LLILZ = c1bbd;
                                    this.LLILLJJLI = i2;
                                    this.LLILLL = executorService;
                                }
                            });
                        }
                    } else {
                        c1bay.LJIJJ(interfaceC2200191B9d2, i, C2200541BAm.LJJIIZI, C1BAX.BILLING_PROGRAM_NOT_SUPPORTED, null);
                    }
                } catch (DeadObjectException e) {
                    TryCatchGuardChecker.doCheck(e);
                    c1bay.LJIJJ(interfaceC2200191B9d2, i, C2200541BAm.LJIIIZ, C1BAX.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    c1bay.LJIJJ(interfaceC2200191B9d2, i, C2200541BAm.LJII, C1BAX.SERVICE_CALL_EXCEPTION, e2);
                }
                C1C7U.LIZIZ("zzao@8a8a.call");
                return null;
            }
        }, 30000L, new Runnable() { // from class: X.1B9g
            public final /* synthetic */ int LLILLL = 1;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzap@8a89.run");
                try {
                    this.LL.LJIJJ(interfaceC2200191B9d, this.LLILLL, C2200541BAm.LJIIJ, C1BAX.EXECUTE_ASYNC_TIMEOUT, null);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzap@8a89.run");
            }
        }, LJJIII(), LJIILLIIL()) == null) {
            LJIJJ(interfaceC2200191B9d, 1, LJJIIZ(), C1BAX.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.AbstractC1795460wp6
    public final C19885612rG LJII(String str) {
        C19885612rG c19885612rG;
        C19885612rG c19885612rG2;
        C19885612rG c19885612rG3;
        C19885612rG c19885612rG4;
        C19885612rG c19885612rG5;
        C19885612rG c19885612rG6;
        C19885612rG c19885612rG7;
        C19885612rG c19885612rG8;
        C19885612rG c19885612rG9;
        C19885612rG c19885612rG10;
        C19885612rG c19885612rG11;
        C19885612rG c19885612rG12;
        C19885612rG c19885612rG13;
        C19885612rG c19885612rG14;
        C19885612rG c19885612rG15;
        C19885612rG c19885612rG16;
        C19885612rG c19885612rG17;
        if (!LJJJ()) {
            C19885612rG c19885612rG18 = C2200541BAm.LJIIIZ;
            C1BAX c1bax = C1BAX.SERVICE_CONNECTION_NOT_READY;
            if (c19885612rG18.LIZ != 0) {
                LJJJJJ(5, c19885612rG18, c1bax);
                return c19885612rG18;
            }
            try {
                int i = C2200521BAk.LIZ;
                LJJIJIIJIL(C2200521BAk.LIZJ(5, EnumC2200651BAx.BROADCAST_ACTION_UNSPECIFIED));
                return c19885612rG18;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return c19885612rG18;
            }
        }
        C19885612rG c19885612rG19 = C2200541BAm.LIZ;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    if (this.LJIIJJI) {
                        c19885612rG17 = C2200541BAm.LJIIIIZZ;
                    } else {
                        c19885612rG17 = C2200541BAm.LJIIL;
                    }
                    LJJJJIZL(3, c19885612rG17, C1BAX.SUBSCRIPTIONS_UPDATE_NOT_SUPPORTED);
                    return c19885612rG17;
                }
                break;
            case 96321:
                if (str.equals("aaa")) {
                    if (this.LJIJ) {
                        c19885612rG16 = C2200541BAm.LJIIIIZZ;
                    } else {
                        c19885612rG16 = C2200541BAm.LJIILJJIL;
                    }
                    LJJJJIZL(6, c19885612rG16, C1BAX.CROSS_APP_NOT_SUPPORTED);
                    return c19885612rG16;
                }
                break;
            case 97314:
                if (str.equals("bbb")) {
                    if (this.LJIILLIIL) {
                        c19885612rG15 = C2200541BAm.LJIIIIZZ;
                    } else {
                        c19885612rG15 = C2200541BAm.LJIJ;
                    }
                    LJJJJIZL(5, c19885612rG15, C1BAX.IN_APP_MESSAGE_NOT_SUPPORTED);
                    return c19885612rG15;
                }
                break;
            case 98307:
                if (str.equals("ccc")) {
                    if (this.LJIJI) {
                        c19885612rG14 = C2200541BAm.LJIIIIZZ;
                    } else {
                        c19885612rG14 = C2200541BAm.LJIILL;
                    }
                    LJJJJIZL(8, c19885612rG14, C1BAX.MULTI_ITEM_NOT_SUPPORTED);
                    return c19885612rG14;
                }
                break;
            case 99300:
                if (str.equals("ddd")) {
                    if (this.LJIIZILJ) {
                        c19885612rG13 = C2200541BAm.LJIIIIZZ;
                    } else {
                        c19885612rG13 = C2200541BAm.LJIILLIIL;
                    }
                    LJJJJIZL(7, c19885612rG13, C1BAX.OFFER_ID_TOKEN_NOT_SUPPORTED);
                    return c19885612rG13;
                }
                break;
            case 100293:
                if (str.equals("eee")) {
                    if (this.LJIJI) {
                        c19885612rG12 = C2200541BAm.LJIIIIZZ;
                    } else {
                        c19885612rG12 = C2200541BAm.LJIILL;
                    }
                    LJJJJIZL(9, c19885612rG12, C1BAX.PBL_FOR_PAYMENTS_GATEWAY_BUYFLOW_NOT_SUPPORTED);
                    return c19885612rG12;
                }
                break;
            case 101286:
                if (str.equals("fff")) {
                    if (this.LJIJJ) {
                        c19885612rG11 = C2200541BAm.LJIIIIZZ;
                    } else {
                        c19885612rG11 = C2200541BAm.LJIIZILJ;
                    }
                    LJJJJIZL(10, c19885612rG11, C1BAX.PRODUCT_DETAILS_NOT_SUPPORTED);
                    return c19885612rG11;
                }
                break;
            case 102279:
                if (str.equals("ggg")) {
                    if (this.LJIJJLI) {
                        c19885612rG10 = C2200541BAm.LJIIIIZZ;
                    } else {
                        c19885612rG10 = C2200541BAm.LJJI;
                    }
                    LJJJJIZL(11, c19885612rG10, C1BAX.GET_BILLING_CONFIG_NOT_SUPPORTED);
                    return c19885612rG10;
                }
                break;
            case 103272:
                if (str.equals("hhh")) {
                    if (this.LJIJJLI) {
                        c19885612rG9 = C2200541BAm.LJIIIIZZ;
                    } else {
                        c19885612rG9 = C2200541BAm.LJJIFFI;
                    }
                    LJJJJIZL(12, c19885612rG9, C1BAX.QUERY_PRODUCT_DETAILS_WITH_SERIALIZED_DOCID_NOT_SUPPORTED);
                    return c19885612rG9;
                }
                break;
            case 104265:
                if (str.equals("iii")) {
                    if (this.LJJ) {
                        c19885612rG8 = C2200541BAm.LJIIIIZZ;
                    } else {
                        c19885612rG8 = C2200541BAm.LJJIII;
                    }
                    LJJJJIZL(13, c19885612rG8, C1BAX.QUERY_PRODUCT_DETAILS_WITH_DEVELOPER_SPECIFIED_ACCOUNT_NOT_SUPPORTED);
                    return c19885612rG8;
                }
                break;
            case 105258:
                if (str.equals("jjj")) {
                    if (this.LJJI) {
                        c19885612rG7 = C2200541BAm.LJIIIIZZ;
                    } else {
                        c19885612rG7 = C2200541BAm.LJJIIJ;
                    }
                    LJJJJIZL(14, c19885612rG7, C1BAX.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED);
                    return c19885612rG7;
                }
                break;
            case 106251:
                if (str.equals("kkk")) {
                    if (this.LJJII) {
                        c19885612rG6 = C2200541BAm.LJIIIIZZ;
                    } else {
                        c19885612rG6 = C2200541BAm.LJIJI;
                    }
                    LJJJJIZL(18, c19885612rG6, C1BAX.EXTERNAL_OFFER_NOT_SUPPORTED);
                    return c19885612rG6;
                }
                break;
            case 107244:
                if (str.equals("lll")) {
                    if (this.LJJIFFI) {
                        c19885612rG5 = C2200541BAm.LJIIIIZZ;
                    } else {
                        c19885612rG5 = C2200541BAm.LJIJJ;
                    }
                    LJJJJIZL(19, c19885612rG5, C1BAX.MULTI_ITEM_WITH_SEASON_PASS_NOT_SUPPORTED);
                    return c19885612rG5;
                }
                break;
            case 108237:
                if (str.equals("mmm")) {
                    if (this.LJJII) {
                        c19885612rG4 = C2200541BAm.LJIIIIZZ;
                    } else {
                        c19885612rG4 = C2200541BAm.LJIJJLI;
                    }
                    LJJJJIZL(20, c19885612rG4, C1BAX.AUTO_PAY_NOT_SUPPORTED);
                    return c19885612rG4;
                }
                break;
            case 109230:
                if (str.equals("nnn")) {
                    if (this.LJJIII) {
                        c19885612rG3 = C2200541BAm.LJIIIIZZ;
                    } else {
                        c19885612rG3 = C2200541BAm.LJIL;
                    }
                    LJJJJIZL(21, c19885612rG3, C1BAX.INCLUDE_SUSPENDED_SUBSCRIPTIONS_NOT_SUPPORTED);
                    return c19885612rG3;
                }
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    if (this.LJIILJJIL) {
                        c19885612rG2 = C2200541BAm.LJIIIIZZ;
                    } else {
                        c19885612rG2 = C2200541BAm.LJIILIIL;
                    }
                    LJJJJIZL(4, c19885612rG2, C1BAX.PRICE_CHANGE_CONFIRMATION_NOT_SUPPORTED);
                    return c19885612rG2;
                }
                break;
            case 1987365622:
                if (str.equals("subscriptions")) {
                    if (this.LJIIJ) {
                        c19885612rG = C2200541BAm.LJIIIIZZ;
                    } else {
                        c19885612rG = C2200541BAm.LJIIJJI;
                    }
                    LJJJJIZL(2, c19885612rG, C1BAX.SUBSCRIPTIONS_NOT_SUPPORTED);
                    return c19885612rG;
                }
                break;
        }
        "Unsupported feature: ".concat(str);
        C19885612rG c19885612rG20 = C2200541BAm.LJJ;
        LJJJJIZL(1, c19885612rG20, C1BAX.UNKNOWN_FEATURE);
        return c19885612rG20;
    }

    @Override // X.AbstractC1795460wp6
    public void LJIILIIL(InterfaceC2200341B9s interfaceC2200341B9s) throws Throwable {
        LJJIL(interfaceC2200341B9s, 0);
    }

    public final C19885612rG LJJIIJZLJL(int i) {
        boolean z;
        C2200451BAd.LJI("BillingClient", "Service connection is valid. No need to re-initialize.");
        C1BBB c1bbbLJIJJLI = C2200671BAz.LJIJJLI();
        c1bbbLJIJJLI.LJFF(6);
        C1BB8 c1bb8LJIJJ = C1BB2.LJIJJ();
        c1bb8LJIJJ.LIZLLL();
        C1BB2.LJJII((C1BB2) c1bb8LJIJJ.LLILLJJLI);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        c1bb8LJIJJ.LJFF(z);
        c1bb8LJIJJ.LJI(i);
        c1bbbLJIJJLI.LIZLLL();
        C2200671BAz.LJJIII((C2200671BAz) c1bbbLJIJJLI.LLILLJJLI, (C1BB2) c1bb8LJIJJ.LIZIZ());
        LJJIJIIJIL((C2200671BAz) c1bbbLJIJJLI.LIZIZ());
        return C2200541BAm.LJIIIIZZ;
    }

    public final InterfaceFutureC1488980oqm LJJIIZI(final int i) {
        if (this.LJJIIZ && !LJJJIL()) {
            return C199521134t.LIZ(new AnonymousClass1353() { // from class: X.1B9r
                @Override // X.AnonymousClass1353
                public final Object LIZ(C199520134s c199520134s) throws Throwable {
                    C1BAY c1bay = this.LIZ;
                    c1bay.LJJIL(new C2200301B9o(c1bay, c199520134s), i);
                    return "reconnectIfNeeded";
                }
            });
        }
        C2200451BAd.LJI("BillingClient", "Already connected or not opted into auto reconnection.");
        return new C199483133h(C2200541BAm.LJIIIIZZ);
    }

    public final void LJJIJIIJI(C2200661BAy c2200661BAy) {
        try {
            ((C2200551BAn) this.LJII).LIZIZ(c2200661BAy, this.LJIIL);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJJIJIIJIL(C2200671BAz c2200671BAz) {
        try {
            C1BBD c1bbd = this.LJII;
            int i = this.LJIIL;
            C2200551BAn c2200551BAn = (C2200551BAn) c1bbd;
            c2200551BAn.getClass();
            try {
                C19914712vx c19914712vx = (C19914712vx) c2200551BAn.LIZIZ.LJIILIIL();
                c19914712vx.LIZLLL();
                C19914612vw.LJJIJIIJIL((C19914612vw) c19914712vx.LLILLJJLI, i);
                C19914612vw c19914612vw = (C19914612vw) c19914712vx.LIZIZ();
                c2200551BAn.LIZIZ = c19914612vw;
                try {
                    c2200551BAn.LJII(c2200671BAz, c19914612vw);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
    }

    public final void LJJIJL(int i) {
        String str;
        String str2;
        synchronized (this.LIZ) {
            try {
                if (this.LIZIZ == 3) {
                    return;
                }
                int i2 = this.LIZIZ;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            str = "CLOSED";
                        } else {
                            str = "CONNECTED";
                        }
                    } else {
                        str = "CONNECTING";
                    }
                } else {
                    str = "DISCONNECTED";
                }
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            str2 = "CLOSED";
                        } else {
                            str2 = "CONNECTED";
                        }
                    } else {
                        str2 = "CONNECTING";
                    }
                } else {
                    str2 = "DISCONNECTED";
                }
                C2200451BAd.LJI("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.LIZIZ = i;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJJJZ(final C19885612rG c19885612rG) {
        if (Thread.interrupted()) {
            return;
        }
        C786410Ut5.LJJZZIII(this.LJ, new Runnable() { // from class: X.0wsj
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzaq@8a88.run");
                try {
                    C1BAY c1bay = this.LL;
                    C19885612rG c19885612rG2 = c19885612rG;
                    if (c1bay.LJFF.LIZIZ != null) {
                        c1bay.LJFF.LIZIZ.LIZJ(c19885612rG2, null);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzaq@8a88.run");
            }
        });
    }

    public C1BAY(Context context, C1797800wss c1797800wss) {
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.LJJIJIIJIL = lValueOf;
        this.LJJIJIL = C1BFP.LIZ;
        this.LIZJ = C1527930prb.LIZ;
        String strLJIJI = LJIJI();
        this.LIZLLL = strLJIJI;
        this.LJI = C786410Ut5.N3(context);
        C19914712vx c19914712vxLJJIIZ = C19914612vw.LJJIIZ();
        c19914712vxLJJIIZ.LIZLLL();
        C19914612vw.LJJIIJ((C19914612vw) c19914712vxLJJIIZ.LLILLJJLI);
        if (strLJIJI != null) {
            c19914712vxLJJIIZ.LIZLLL();
            C19914612vw.LJJIIJZLJL((C19914612vw) c19914712vxLJJIIZ.LLILLJJLI, strLJIJI);
        }
        String packageName = this.LJI.getPackageName();
        c19914712vxLJJIIZ.LIZLLL();
        C19914612vw.LJIJJLI((C19914612vw) c19914712vxLJJIIZ.LLILLJJLI, packageName);
        long jLongValue = lValueOf.longValue();
        c19914712vxLJJIIZ.LIZLLL();
        C19914612vw.LJJIJIL((C19914612vw) c19914712vxLJJIIZ.LLILLJJLI, jLongValue);
        boolean z = c1797800wss.LJII;
        c19914712vxLJJIIZ.LIZLLL();
        C19914612vw.LJJIII((C19914612vw) c19914712vxLJJIIZ.LLILLJJLI, z);
        int i = Build.VERSION.SDK_INT;
        c19914712vxLJJIIZ.LIZLLL();
        C19914612vw.LJJIJ((C19914612vw) c19914712vxLJJIIZ.LLILLJJLI, i);
        c19914712vxLJJIIZ.LJFF();
        LJJJJ(c19914712vxLJJIIZ, context);
        try {
            int i2 = C786410Ut5.Y3(this.LJI.getPackageManager(), this.LJI.getPackageName(), 0).versionCode;
            c19914712vxLJJIIZ.LIZLLL();
            C19914612vw.LJJIJIIJI((C19914612vw) c19914712vxLJJIIZ.LLILLJJLI, i2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LJII = new C2200551BAn(this.LJI, (C19914612vw) c19914712vxLJJIIZ.LIZIZ());
        this.LJI.getPackageName();
        this.LJJIIZ = c1797800wss.LJII;
    }

    public static void LJIILJJIL(Activity activity, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEgM0W9jTXFNvRxuIaqGa/t0aV0yLu9rODctw5rHxfqxw3OibMeA+1s9ZiXM=", new String[]{"01cc3"}));
    }

    public static /* bridge */ /* synthetic */ void LJJIFFI(C1BAY c1bay, int i) {
        C2200591BAr c2200591BAr;
        if (i == 0) {
            synchronized (c1bay.LIZ) {
                try {
                    if (c1bay.LIZIZ == 3) {
                        return;
                    }
                    c1bay.LJJIJL(2);
                    if (c1bay.LJFF != null) {
                        c2200591BAr = c1bay.LJFF;
                    } else {
                        c2200591BAr = null;
                    }
                    if (c2200591BAr != null) {
                        c2200591BAr.LIZ(c1bay.LJJI);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        c1bay.LJJIJL(0);
    }

    public static final void LJJJJ(C19914712vx c19914712vx, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(context, "activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEgM0W9jTXFNvRxuIaqGa/t0aV0yLu9rODctw5rHxfqxw3OibMeA+1s9ZiXM=", new String[]{"01cc3"}));
                int i = (int) (memoryInfo.totalMem / 1048576);
                c19914712vx.LIZLLL();
                C19914612vw.LJJII((C19914612vw) c19914712vx.LLILLJJLI, i);
                String str = Build.BRAND;
                c19914712vx.LIZLLL();
                C19914612vw.LJIL((C19914612vw) c19914712vx.LLILLJJLI, str);
                String str2 = Build.MODEL;
                c19914712vx.LIZLLL();
                C19914612vw.LJJIFFI((C19914612vw) c19914712vx.LLILLJJLI, str2);
                String str3 = Build.MANUFACTURER;
                c19914712vx.LIZLLL();
                C19914612vw.LJJI((C19914612vw) c19914712vx.LLILLJJLI, str3);
                String str4 = Build.FINGERPRINT;
                c19914712vx.LIZLLL();
                C19914612vw.LJJ((C19914612vw) c19914712vx.LLILLJJLI, str4);
            }
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.AbstractC1795460wp6
    public void LIZ(final C1796110wq9 c1796110wq9, final InterfaceC2200251B9j interfaceC2200251B9j) {
        if (LJIIZILJ(new Callable() { // from class: X.1BAj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC2200631BAv interfaceC2200631BAv;
                C1C7U.LIZ("zzam@8a8c.call");
                C1BAY c1bay = this.LL;
                InterfaceC2200251B9j interfaceC2200251B9j2 = interfaceC2200251B9j;
                C1796110wq9 c1796110wq92 = c1796110wq9;
                c1bay.getClass();
                try {
                    if (!c1bay.LJJJI()) {
                        C1BAX c1bax = C1BAX.SERVICE_CONNECTION_NOT_READY;
                        C19885612rG c19885612rG = C2200541BAm.LJIIIZ;
                        c1bay.LJJJJJ(3, c19885612rG, c1bax);
                        interfaceC2200251B9j2.LIZIZ(c19885612rG);
                    } else if (TextUtils.isEmpty(c1796110wq92.LIZ)) {
                        C1BAX c1bax2 = C1BAX.EMPTY_PURCHASE_TOKEN;
                        C19885612rG c19885612rG2 = C2200541BAm.LJI;
                        c1bay.LJJJJJ(3, c19885612rG2, c1bax2);
                        interfaceC2200251B9j2.LIZIZ(c19885612rG2);
                    } else if (c1bay.LJIILL) {
                        synchronized (c1bay.LIZ) {
                            try {
                                interfaceC2200631BAv = c1bay.LJIIIIZZ;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        if (interfaceC2200631BAv == null) {
                            C19885612rG c19885612rG3 = C2200541BAm.LJIIIZ;
                            c1bay.LJJJJL(C1BAX.SERVICE_RESET_TO_NULL, 3, c19885612rG3, C2200521BAk.LIZ(null));
                            interfaceC2200251B9j2.LIZIZ(c19885612rG3);
                        } else {
                            String packageName = c1bay.LJI.getPackageName();
                            String str = c1796110wq92.LIZ;
                            String str2 = c1bay.LIZJ;
                            String str3 = c1bay.LIZLLL;
                            long jLongValue = c1bay.LJJIJIIJIL.longValue();
                            Bundle bundle = new Bundle();
                            C2200451BAd.LIZIZ(jLongValue, str2, str3, bundle);
                            Bundle bundleLLLLIIIILLL = interfaceC2200631BAv.LLLLIIIILLL(packageName, str, bundle);
                            interfaceC2200251B9j2.LIZIZ(C2200541BAm.LIZ(C2200451BAd.LIZ(bundleLLLLIIIILLL, "BillingClient"), C2200451BAd.LJFF(bundleLLLLIIIILLL, "BillingClient")));
                        }
                    } else {
                        C1BAX c1bax3 = C1BAX.API_VERSION_NOT_V9;
                        C19885612rG c19885612rG4 = C2200541BAm.LIZ;
                        c1bay.LJJJJJ(3, c19885612rG4, c1bax3);
                        interfaceC2200251B9j2.LIZIZ(c19885612rG4);
                    }
                } catch (DeadObjectException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19885612rG c19885612rG5 = C2200541BAm.LJIIIZ;
                    c1bay.LJJJJL(C1BAX.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, 3, c19885612rG5, C2200521BAk.LIZ(e));
                    interfaceC2200251B9j2.LIZIZ(c19885612rG5);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C19885612rG c19885612rG6 = C2200541BAm.LJII;
                    c1bay.LJJJJL(C1BAX.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, 3, c19885612rG6, C2200521BAk.LIZ(e2));
                    interfaceC2200251B9j2.LIZIZ(c19885612rG6);
                }
                C1C7U.LIZIZ("zzam@8a8c.call");
                return null;
            }
        }, 30000L, new Runnable() { // from class: X.1B9i
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzan@8a8b.run");
                try {
                    C1BAY c1bay = this.LL;
                    InterfaceC2200251B9j interfaceC2200251B9j2 = interfaceC2200251B9j;
                    C1BAX c1bax = C1BAX.EXECUTE_ASYNC_TIMEOUT;
                    C19885612rG c19885612rG = C2200541BAm.LJIIJ;
                    c1bay.LJJJJJ(3, c19885612rG, c1bax);
                    interfaceC2200251B9j2.LIZIZ(c19885612rG);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzan@8a8b.run");
            }
        }, LJJIII(), LJIILLIIL()) == null) {
            C19885612rG c19885612rGLJJIIZ = LJJIIZ();
            LJJJJJ(3, c19885612rGLJJIIZ, C1BAX.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            interfaceC2200251B9j.LIZIZ(c19885612rGLJJIIZ);
        }
    }

    @Override // X.AbstractC1795460wp6
    public void LIZIZ(final C1796130wqB c1796130wqB, final C1BAM c1bam) {
        if (LJIIZILJ(new Callable() { // from class: X.1BAi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC2200631BAv interfaceC2200631BAv;
                int iLJIJ;
                String strLJFF;
                C1C7U.LIZ("zzbd@8a76.call");
                C1BAY c1bay = this.LL;
                C1BAM c1bam2 = c1bam;
                C1796130wqB c1796130wqB2 = c1796130wqB;
                if (c1bay.LJJJI()) {
                    String str = c1796130wqB2.LIZ;
                    try {
                        C2200451BAd.LJI("BillingClient", "Consuming purchase with token: " + str);
                        synchronized (c1bay.LIZ) {
                            try {
                                interfaceC2200631BAv = c1bay.LJIIIIZZ;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        if (interfaceC2200631BAv == null) {
                            c1bay.LJIJJLI(c1bam2, str, C2200541BAm.LJIIIZ, C1BAX.SERVICE_RESET_TO_NULL, null);
                        } else {
                            if (c1bay.LJIILL) {
                                String packageName = c1bay.LJI.getPackageName();
                                boolean z = c1bay.LJIILL;
                                String str2 = c1bay.LIZJ;
                                String str3 = c1bay.LIZLLL;
                                long jLongValue = c1bay.LJJIJIIJIL.longValue();
                                Bundle bundle = new Bundle();
                                if (z) {
                                    C2200451BAd.LIZIZ(jLongValue, str2, str3, bundle);
                                }
                                Bundle bundleLLLLLILLIL = interfaceC2200631BAv.LLLLLILLIL(packageName, str, bundle);
                                iLJIJ = bundleLLLLLILLIL.getInt("RESPONSE_CODE");
                                strLJFF = C2200451BAd.LJFF(bundleLLLLLILLIL, "BillingClient");
                            } else {
                                iLJIJ = interfaceC2200631BAv.LJIJ(c1bay.LJI.getPackageName(), str);
                                strLJFF = "";
                            }
                            C19885612rG c19885612rGLIZ = C2200541BAm.LIZ(iLJIJ, strLJFF);
                            if (iLJIJ == 0) {
                                C2200451BAd.LJI("BillingClient", "Successfully consumed purchase.");
                                c1bam2.LIZLLL(c19885612rGLIZ, str);
                            } else {
                                c1bay.LJIJJLI(c1bam2, str, c19885612rGLIZ, C1BAX.BILLING_RESULT_RECEIVED_FROM_PHONESKY, null);
                            }
                        }
                    } catch (DeadObjectException e) {
                        TryCatchGuardChecker.doCheck(e);
                        c1bay.LJIJJLI(c1bam2, str, C2200541BAm.LJIIIZ, C1BAX.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, e);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        c1bay.LJIJJLI(c1bam2, str, C2200541BAm.LJII, C1BAX.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, e2);
                    }
                } else {
                    C1BAX c1bax = C1BAX.SERVICE_CONNECTION_NOT_READY;
                    C19885612rG c19885612rG = C2200541BAm.LJIIIZ;
                    c1bay.LJJJJJ(4, c19885612rG, c1bax);
                    c1bam2.LIZLLL(c19885612rG, c1796130wqB2.LIZ);
                }
                C1C7U.LIZIZ("zzbd@8a76.call");
                return null;
            }
        }, 30000L, new Runnable() { // from class: X.1BAL
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzbe@8a75.run");
                try {
                    C1BAY c1bay = this.LL;
                    C1BAM c1bam2 = c1bam;
                    C1796130wqB c1796130wqB2 = c1796130wqB;
                    C1BAX c1bax = C1BAX.EXECUTE_ASYNC_TIMEOUT;
                    C19885612rG c19885612rG = C2200541BAm.LJIIJ;
                    c1bay.LJJJJJ(4, c19885612rG, c1bax);
                    c1bam2.LIZLLL(c19885612rG, c1796130wqB2.LIZ);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzbe@8a75.run");
            }
        }, LJJIII(), LJIILLIIL()) == null) {
            C19885612rG c19885612rGLJJIIZ = LJJIIZ();
            LJJJJJ(4, c19885612rGLJJIIZ, C1BAX.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            c1bam.LIZLLL(c19885612rGLJJIIZ, c1796130wqB.LIZ);
        }
    }

    @Override // X.AbstractC1795460wp6
    public final void LIZJ(final InterfaceC1796450wqh interfaceC1796450wqh, final C1796120wqA c1796120wqA) {
        try {
            Callable callable = new Callable() { // from class: X.1BAf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC2200631BAv interfaceC2200631BAv;
                    C1C7U.LIZ("zzar@8a87.call");
                    C1BAY c1bay = this.LL;
                    InterfaceC1796450wqh interfaceC1796450wqh2 = interfaceC1796450wqh;
                    C1796120wqA c1796120wqA2 = c1796120wqA;
                    c1bay.getClass();
                    try {
                        if (!c1bay.LJJJI()) {
                            c1bay.LJIL(interfaceC1796450wqh2, C2200541BAm.LJIIIZ, C1BAX.SERVICE_CONNECTION_NOT_READY, null);
                        } else if (c1bay.LJJIIJ) {
                            synchronized (c1bay.LIZ) {
                                try {
                                    interfaceC2200631BAv = c1bay.LJIIIIZZ;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            if (interfaceC2200631BAv == null) {
                                c1bay.LJIL(interfaceC1796450wqh2, C2200541BAm.LJIIIZ, C1BAX.SERVICE_RESET_TO_NULL, null);
                            } else {
                                String str = c1bay.LIZJ;
                                C199642139k c199642139kLIZ = C199643139l.LIZ(c1bay.LJI, str, "createIndirectBillingReportingDetails");
                                C19913212vi c19913212viLJIJJ = C19913112vh.LJIJJ();
                                C19914112vr c19914112vrLJIJJ = C19914012vq.LJIJJ();
                                c19914112vrLJIJJ.LJFF(str);
                                c19913212viLJIJJ.LJFF((C19914012vq) c19914112vrLJIJJ.LIZIZ(), "PLAY_BILLING_LIBRARY_VERSION");
                                C19914112vr c19914112vrLJIJJ2 = C19914012vq.LJIJJ();
                                c19914112vrLJIJJ2.LJFF(c1bay.LJI.getPackageName());
                                c19913212viLJIJJ.LJFF((C19914012vq) c19914112vrLJIJJ2.LIZIZ(), "CALLING_PACKAGE");
                                C19914112vr c19914112vrLJIJJ3 = C19914012vq.LJIJJ();
                                c19914112vrLJIJJ3.LJFF(String.valueOf(c1796120wqA2.LIZ));
                                c19913212viLJIJJ.LJFF((C19914012vq) c19914112vrLJIJJ3.LIZIZ(), "BILLING_PROGRAM");
                                C19914112vr c19914112vrLJIJJ4 = C19914012vq.LJIJJ();
                                c19914112vrLJIJJ4.LJFF("RESPONSE_FORMAT_PROTO");
                                c19913212viLJIJJ.LJFF((C19914012vq) c19914112vrLJIJJ4.LIZIZ(), "RESPONSE_FORMAT");
                                if (c1796120wqA2.LIZ == 3) {
                                    C19914112vr c19914112vrLJIJJ5 = C19914012vq.LJIJJ();
                                    c19914112vrLJIJJ5.LJFF(String.valueOf(C786410Ut5.Y3(c1bay.LJI.getPackageManager(), c1bay.LJI.getPackageName(), 0).firstInstallTime));
                                    c19913212viLJIJJ.LJFF((C19914012vq) c19914112vrLJIJJ5.LIZIZ(), "APP_INSTALL_TIME_MILLIS");
                                }
                                C19913112vh c19913112vh = (C19913112vh) c19913212viLJIJJ.LIZIZ();
                                Bundle bundle = new Bundle();
                                C786410Ut5.LJJIJ(bundle, "REQUEST_METADATA", c199642139kLIZ.LIZIZ());
                                C786410Ut5.LJJIJ(bundle, "REQUEST_PARAMS", c19913112vh.LIZIZ());
                                int i = c1796120wqA2.LIZ;
                                C1BBD c1bbd = c1bay.LJII;
                                int i2 = c1bay.LJIIL;
                                c1bay.LJJIII();
                                interfaceC2200631BAv.LLILZIL(bundle, new C1B9M(interfaceC1796450wqh2, i, c1bbd, i2, c1bay.LJIILLIIL()) { // from class: X.1B9b
                                    public final InterfaceC1796450wqh LL;
                                    public final int LLILLJJLI;
                                    public final ExecutorService LLILLL;
                                    public final C1BBD LLILZ;

                                    @Override // X.C1B9O
                                    public final void y0(Bundle bundle2) {
                                        if (bundle2 == null) {
                                            C1BBD c1bbd2 = this.LLILZ;
                                            C1BAX c1bax = C1BAX.NULL_BUNDLE_FROM_DELEGATE_TO_BACKEND_SERVICE_CALL;
                                            C19885612rG c19885612rG = C2200541BAm.LJII;
                                            C1B9Z.LIZ(c1bax, c19885612rG, c1bbd2, 35, this.LLILLJJLI);
                                            this.LL.LIZ(c19885612rG, null);
                                            return;
                                        }
                                        C19885612rG c19885612rGLIZ = C2200161B9a.LIZ(bundle2, 35, this.LLILZ, this.LLILLJJLI);
                                        InterfaceC1796450wqh interfaceC1796450wqh3 = this.LL;
                                        if (interfaceC1796450wqh3 == null) {
                                            C1B9Z.LIZ(C1BAX.NULL_LISTENER_IN_DELEGATE_TO_BACKEND_CALLBACK, c19885612rGLIZ, this.LLILZ, 35, this.LLILLJJLI);
                                            return;
                                        }
                                        if (c19885612rGLIZ.LIZ != 0) {
                                            interfaceC1796450wqh3.LIZ(c19885612rGLIZ, null);
                                            return;
                                        }
                                        try {
                                            byte[] byteArray = bundle2.getByteArray("RESPONSE_DATA");
                                            if (byteArray != null) {
                                                this.LL.LIZ(c19885612rGLIZ, new C1796410wqd(C13A8.LJIJJLI(byteArray).LJIL().zze));
                                                return;
                                            }
                                            throw new Exception("Response data is null");
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            C1BBD c1bbd3 = this.LLILZ;
                                            C1BAX c1bax2 = C1BAX.ERROR_DECODING_DELEGATE_TO_BACKEND_RESPONSE_DATA;
                                            C19885612rG c19885612rG2 = C2200541BAm.LJII;
                                            C2200551BAn c2200551BAn = (C2200551BAn) c1bbd3;
                                            c2200551BAn.LIZIZ(C2200521BAk.LIZIZ(c1bax2, 35, c19885612rG2, C2200521BAk.LIZ(e), EnumC2200651BAx.BROADCAST_ACTION_UNSPECIFIED), this.LLILLJJLI);
                                            this.LL.LIZ(c19885612rG2, null);
                                        }
                                    }

                                    {
                                        interfaceC1796450wqh2.getClass();
                                        this.LL = interfaceC1796450wqh2;
                                        this.LLILZ = c1bbd;
                                        this.LLILLJJLI = i2;
                                        this.LLILLL = executorService;
                                    }
                                });
                            }
                        } else {
                            c1bay.LJIL(interfaceC1796450wqh2, C2200541BAm.LJJIIZI, C1BAX.BILLING_PROGRAM_NOT_SUPPORTED, null);
                        }
                    } catch (DeadObjectException e) {
                        TryCatchGuardChecker.doCheck(e);
                        c1bay.LJIL(interfaceC1796450wqh2, C2200541BAm.LJIIIZ, C1BAX.SERVICE_CALL_EXCEPTION, e);
                    } catch (RuntimeException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        c1bay.LJIL(interfaceC1796450wqh2, C2200541BAm.LJII, C1BAX.SERVICE_CALL_EXCEPTION, e2);
                    }
                    C1C7U.LIZIZ("zzar@8a87.call");
                    return null;
                }
            };
            Runnable runnable = new Runnable() { // from class: X.1B9h
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzas@8a86.run");
                    try {
                        this.LL.LJIL(interfaceC1796450wqh, C2200541BAm.LJIIJ, C1BAX.EXECUTE_ASYNC_TIMEOUT, null);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzas@8a86.run");
                }
            };
            try {
                C786410Ut5.LJLIIL(28500L, LJJIII(), new C0N81(LJIILLIIL().submit(callable), runnable));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            LJIL(interfaceC1796450wqh, LJJIIZ(), C1BAX.MISSING_RESULT_FROM_EXECUTE_ASYNC, e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:213:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cc  */
    @Override // X.AbstractC1795460wp6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C19885612rG LJIIIZ(android.app.Activity r24, final X.C1795840wpi r25) {
        /*
            Method dump skipped, instruction units count: 1775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BAY.LJIIIZ(android.app.Activity, X.0wpi):X.12rG");
    }

    @Override // X.AbstractC1795460wp6
    public void LJIIJJI(final C1796050wq3 c1796050wq3, final InterfaceC1797860wsy interfaceC1797860wsy) {
        if (LJIIZILJ(new Callable() { // from class: X.1BAa
            /* JADX WARN: Type inference failed for: r12v6, types: [X.0uKO, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1BBK c1bbk;
                InterfaceC2200631BAv interfaceC2200631BAv;
                C1C7U.LIZ("zzbi@8a71.call");
                C1BAY c1bay = this.LL;
                InterfaceC1797860wsy interfaceC1797860wsy2 = interfaceC1797860wsy;
                C1796050wq3 c1796050wq32 = c1796050wq3;
                Exception exc = null;
                if (!c1bay.LJJJI()) {
                    C1BAX c1bax = C1BAX.SERVICE_CONNECTION_NOT_READY;
                    C19885612rG c19885612rG = C2200541BAm.LJIIIZ;
                    c1bay.LJJJJJ(7, c19885612rG, c1bax);
                    interfaceC1797860wsy2.LIZ(c19885612rG, new C1796230wqL(AbstractC19884912r9.zzk(), AbstractC19884912r9.zzk()));
                } else if (c1bay.LJIJJ) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    String str = ((C1795970wpv) c1796050wq32.LIZ.get(0)).LIZIZ;
                    AbstractC19884912r9 abstractC19884912r9 = c1796050wq32.LIZ;
                    int size = abstractC19884912r9.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            c1bbk = new C1BBK(0, "", arrayList, arrayList2);
                            break;
                        }
                        int i2 = i + 20;
                        ArrayList<C1795970wpv> arrayList3 = new ArrayList(abstractC19884912r9.subList(i, i2 > size ? size : i2));
                        ArrayList arrayList4 = new ArrayList();
                        int size2 = arrayList3.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList4.add(((C1795970wpv) ListProtector.get(arrayList3, i3)).LIZ);
                        }
                        Bundle bundle = new Bundle();
                        C786410Ut5.LJJJIL(bundle, "ITEM_ID_LIST", arrayList4);
                        String str2 = c1bay.LIZJ;
                        C786410Ut5.LJJJI("playBillingLibraryVersion", str2, bundle);
                        try {
                            synchronized (c1bay.LIZ) {
                                try {
                                    interfaceC2200631BAv = c1bay.LJIIIIZZ;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            if (interfaceC2200631BAv == null) {
                                c1bbk = c1bay.LJJIIJ(C2200541BAm.LJIIIZ, C1BAX.SERVICE_RESET_TO_NULL, exc);
                                break;
                            }
                            if (c1bay.LJIL) {
                                c1bay.LJJIIJZLJL.getClass();
                            }
                            c1bay.LJIJ();
                            c1bay.LJIJ();
                            c1bay.LJIJ();
                            c1bay.LJIJ();
                            Bundle bundleG0 = interfaceC2200631BAv.G0(true != c1bay.LJJ ? 17 : 20, c1bay.LJI.getPackageName(), str, bundle, C2200451BAd.LIZLLL(str2, c1bay.LIZLLL, arrayList3, new C1BBP(), c1bay.LJJIJIIJIL.longValue()));
                            if (bundleG0 == null) {
                                c1bbk = c1bay.LJJIIJ(C2200541BAm.LJJII, C1BAX.NULL_BUNDLE_FROM_GET_SKU_DETAILS_SERVICE_CALL, null);
                                break;
                            }
                            if (bundleG0.containsKey("DETAILS_LIST")) {
                                ArrayList<String> stringArrayList = bundleG0.getStringArrayList("DETAILS_LIST");
                                if (stringArrayList == null) {
                                    c1bbk = c1bay.LJJIIJ(C2200541BAm.LJJII, C1BAX.NULL_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, null);
                                    break;
                                }
                                ArrayList arrayList5 = new ArrayList();
                                int size3 = stringArrayList.size();
                                for (int i4 = 0; i4 < size3; i4++) {
                                    try {
                                        C1792740wki c1792740wki = new C1792740wki((String) ListProtector.get(stringArrayList, i4));
                                        C2200451BAd.LJI("BillingClient", "Got product details: ".concat(c1792740wki.toString()));
                                        arrayList5.add(c1792740wki);
                                    } catch (JSONException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c1bbk = c1bay.LJJIIJ(C2200541BAm.LIZ(6, "Error trying to decode SkuDetails."), C1BAX.ERROR_DECODING_SKU_DETAILS, e);
                                    }
                                }
                                ArrayList<String> stringArrayList2 = bundleG0.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                                new ArrayList();
                                try {
                                    ArrayList arrayList6 = new ArrayList();
                                    if (stringArrayList2 == null) {
                                        for (C1795970wpv c1795970wpv : arrayList3) {
                                            Iterator it2 = arrayList5.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    arrayList6.add(new Object(C786410Ut5.J3(new JSONObject().put("productId", c1795970wpv.LIZ).put("type", c1795970wpv.LIZIZ).put("statusCode", 0))) { // from class: X.0uKO
                                                        public final String LIZ;
                                                        public final String LIZIZ;
                                                        public final String LIZJ;
                                                        public final int LIZLLL;

                                                        public final int hashCode() {
                                                            return this.LIZ.hashCode();
                                                        }

                                                        public final String toString() {
                                                            return "UnfetchedProduct{productId='" + this.LIZIZ + "', productType='" + this.LIZJ + "', statusCode=" + this.LIZLLL + "}";
                                                        }

                                                        {
                                                            int iOptInt;
                                                            this.LIZ = str;
                                                            JSONObject jSONObject = new JSONObject(str);
                                                            this.LIZIZ = jSONObject.optString("productId");
                                                            String strOptString = jSONObject.optString("type");
                                                            this.LIZJ = strOptString;
                                                            if (jSONObject.has("statusCode")) {
                                                                iOptInt = jSONObject.optInt("statusCode");
                                                            } else {
                                                                iOptInt = 0;
                                                            }
                                                            this.LIZLLL = iOptInt;
                                                            if (!TextUtils.isEmpty(strOptString)) {
                                                                jSONObject.optString("serializedDocid");
                                                                return;
                                                            }
                                                            throw new IllegalArgumentException("Product type cannot be empty.");
                                                        }

                                                        public final boolean equals(Object obj) {
                                                            if (this == obj) {
                                                                return true;
                                                            }
                                                            if (!(obj instanceof C1699540uKO)) {
                                                                return false;
                                                            }
                                                            return TextUtils.equals(this.LIZ, ((C1699540uKO) obj).LIZ);
                                                        }
                                                    });
                                                    break;
                                                }
                                                C1792740wki c1792740wki2 = (C1792740wki) it2.next();
                                                if (!c1795970wpv.LIZ.equals(c1792740wki2.LIZJ) || !c1795970wpv.LIZIZ.equals(c1792740wki2.LIZLLL)) {
                                                }
                                            }
                                        }
                                    } else {
                                        Iterator<String> it3 = stringArrayList2.iterator();
                                        while (it3.hasNext()) {
                                            ?? r12 = new Object(it3.next()) { // from class: X.0uKO
                                                public final String LIZ;
                                                public final String LIZIZ;
                                                public final String LIZJ;
                                                public final int LIZLLL;

                                                public final int hashCode() {
                                                    return this.LIZ.hashCode();
                                                }

                                                public final String toString() {
                                                    return "UnfetchedProduct{productId='" + this.LIZIZ + "', productType='" + this.LIZJ + "', statusCode=" + this.LIZLLL + "}";
                                                }

                                                {
                                                    int iOptInt;
                                                    this.LIZ = str;
                                                    JSONObject jSONObject = new JSONObject(str);
                                                    this.LIZIZ = jSONObject.optString("productId");
                                                    String strOptString = jSONObject.optString("type");
                                                    this.LIZJ = strOptString;
                                                    if (jSONObject.has("statusCode")) {
                                                        iOptInt = jSONObject.optInt("statusCode");
                                                    } else {
                                                        iOptInt = 0;
                                                    }
                                                    this.LIZLLL = iOptInt;
                                                    if (!TextUtils.isEmpty(strOptString)) {
                                                        jSONObject.optString("serializedDocid");
                                                        return;
                                                    }
                                                    throw new IllegalArgumentException("Product type cannot be empty.");
                                                }

                                                public final boolean equals(Object obj) {
                                                    if (this == obj) {
                                                        return true;
                                                    }
                                                    if (!(obj instanceof C1699540uKO)) {
                                                        return false;
                                                    }
                                                    return TextUtils.equals(this.LIZ, ((C1699540uKO) obj).LIZ);
                                                }
                                            };
                                            C2200451BAd.LJI("BillingClient", "Got unfetchedProduct: ".concat(r12.toString()));
                                            arrayList6.add(r12);
                                        }
                                    }
                                    arrayList.addAll(arrayList5);
                                    arrayList2.addAll(arrayList6);
                                    i = i2;
                                    exc = null;
                                } catch (JSONException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    c1bbk = c1bay.LJJIIJ(C2200541BAm.LIZ(6, "Error trying to decode SkuDetails."), C1BAX.ERROR_DECODING_SKU_DETAILS, e2);
                                }
                            } else {
                                int iLIZ = C2200451BAd.LIZ(bundleG0, "BillingClient");
                                String strLJFF = C2200451BAd.LJFF(bundleG0, "BillingClient");
                                if (iLIZ != 0) {
                                    C19885612rG c19885612rGLIZ = C2200541BAm.LIZ(iLIZ, strLJFF);
                                    C1BAX c1bax2 = C1BAX.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("getSkuDetails() failed for queryProductDetailsAsync. Response code: ");
                                    sbLIZ.append(iLIZ);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                    c1bbk = c1bay.LJJIIJ(c19885612rGLIZ, c1bax2, null);
                                } else {
                                    c1bbk = c1bay.LJJIIJ(C2200541BAm.LIZ(6, strLJFF), C1BAX.MISSING_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, null);
                                }
                            }
                        } catch (DeadObjectException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            c1bbk = c1bay.LJJIIJ(C2200541BAm.LJIIIZ, C1BAX.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, e3);
                        } catch (Exception e4) {
                            TryCatchGuardChecker.doCheck(e4);
                            c1bbk = c1bay.LJJIIJ(C2200541BAm.LJII, C1BAX.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, e4);
                        }
                    }
                    interfaceC1797860wsy2.LIZ(C2200541BAm.LIZ(c1bbk.LIZJ, c1bbk.LIZLLL), new C1796230wqL(c1bbk.LIZ, c1bbk.LIZIZ));
                } else {
                    C1BAX c1bax3 = C1BAX.PRODUCT_DETAILS_NOT_SUPPORTED;
                    C19885612rG c19885612rG2 = C2200541BAm.LJIIZILJ;
                    c1bay.LJJJJJ(7, c19885612rG2, c1bax3);
                    interfaceC1797860wsy2.LIZ(c19885612rG2, new C1796230wqL(AbstractC19884912r9.zzk(), AbstractC19884912r9.zzk()));
                }
                C1C7U.LIZIZ("zzbi@8a71.call");
                return null;
            }
        }, 30000L, new Runnable() { // from class: X.1BAs
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzbj@8a70.run");
                try {
                    C1BAY c1bay = this.LL;
                    InterfaceC1797860wsy interfaceC1797860wsy2 = interfaceC1797860wsy;
                    C1BAX c1bax = C1BAX.EXECUTE_ASYNC_TIMEOUT;
                    C19885612rG c19885612rG = C2200541BAm.LJIIJ;
                    c1bay.LJJJJJ(7, c19885612rG, c1bax);
                    interfaceC1797860wsy2.LIZ(c19885612rG, new C1796230wqL(AbstractC19884912r9.zzk(), AbstractC19884912r9.zzk()));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzbj@8a70.run");
            }
        }, LJJIII(), LJIILLIIL()) == null) {
            C19885612rG c19885612rGLJJIIZ = LJJIIZ();
            LJJJJJ(7, c19885612rGLJJIIZ, C1BAX.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            interfaceC1797860wsy.LIZ(c19885612rGLJJIIZ, new C1796230wqL(AbstractC19884912r9.zzk(), AbstractC19884912r9.zzk()));
        }
    }

    @Override // X.AbstractC1795460wp6
    public final void LJIIL(C1795120woY c1795120woY, final InterfaceC1796090wq7 interfaceC1796090wq7) {
        final String str = c1795120woY.LIZ;
        final boolean z = c1795120woY.LIZIZ;
        if (LJIIZILJ(new Callable(this) { // from class: X.1BAc
            public final /* synthetic */ C1BAY LLILZ;

            /* JADX WARN: Removed duplicated region for block: B:101:0x0119 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instruction units count: 602
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.CallableC2200441BAc.call():java.lang.Object");
            }

            {
                Objects.requireNonNull(this);
                this.LLILZ = this;
            }
        }, 30000L, new Runnable() { // from class: X.1BAu
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzbm@8a6d.run");
                try {
                    C1BAY c1bay = this.LL;
                    InterfaceC1796090wq7 interfaceC1796090wq72 = interfaceC1796090wq7;
                    C1BAX c1bax = C1BAX.EXECUTE_ASYNC_TIMEOUT;
                    C19885612rG c19885612rG = C2200541BAm.LJIIJ;
                    c1bay.LJJJJJ(9, c19885612rG, c1bax);
                    interfaceC1796090wq72.LJFF(c19885612rG, AbstractC19884912r9.zzk());
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzbm@8a6d.run");
            }
        }, LJJIII(), LJIILLIIL()) == null) {
            C19885612rG c19885612rGLJJIIZ = LJJIIZ();
            LJJJJJ(9, c19885612rGLJJIIZ, C1BAX.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            interfaceC1796090wq7.LJFF(c19885612rGLJJIIZ, AbstractC19884912r9.zzk());
        }
    }

    public final void LJJIL(InterfaceC2200341B9s interfaceC2200341B9s, int i) throws Throwable {
        C1BAX c1bax;
        C19885612rG c19885612rGLJJIIJZLJL;
        boolean zLJJJJ;
        synchronized (this.LIZ) {
            try {
                if (LJJJIL()) {
                    c19885612rGLJJIIJZLJL = LJJIIJZLJL(i);
                } else if (this.LIZIZ == 1) {
                    C1BAX c1bax2 = C1BAX.BILLING_CLIENT_CONNECTING;
                    c19885612rGLJJIIJZLJL = C2200541BAm.LIZLLL;
                    LJJIJIL(i, c19885612rGLJJIIJZLJL, c1bax2);
                } else if (this.LIZIZ == 3) {
                    C1BAX c1bax3 = C1BAX.BILLING_CLIENT_CLOSED;
                    c19885612rGLJJIIJZLJL = C2200541BAm.LJIIIZ;
                    LJJIJIL(i, c19885612rGLJJIIJZLJL, c1bax3);
                } else {
                    LJJIJL(1);
                    if (i == 0) {
                        this.LJJIJ = interfaceC2200341B9s;
                        i = 0;
                    }
                    LJJIZ();
                    C2200451BAd.LJI("BillingClient", "Starting in-app billing setup.");
                    this.LJIIIZ = new C1BAZ(this, interfaceC2200341B9s, i);
                    this.LJIIIZ.LIZ();
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> listQueryIntentServices = this.LJI.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = ((ResolveInfo) ListProtector.get(listQueryIntentServices, 0)).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (Objects.equals(str, "com.android.vending") && str2 != null) {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.LIZJ);
                                synchronized (this.LIZ) {
                                    try {
                                        if (this.LIZIZ == 2) {
                                            c19885612rGLJJIIJZLJL = LJJIIJZLJL(i);
                                        } else if (this.LIZIZ != 1) {
                                            C1BAX c1bax4 = C1BAX.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                            c19885612rGLJJIIJZLJL = C2200541BAm.LJIIIZ;
                                            LJJIJIL(i, c19885612rGLJJIIJZLJL, c1bax4);
                                        } else {
                                            C1BAZ c1baz = this.LJIIIZ;
                                            if (i > 0 && Build.VERSION.SDK_INT >= 29) {
                                                zLJJJJ = C2204961BRm.LJJJIL(this.LJI, intent2, 1, LJIILLIIL(), c1baz, new C0WZX("dzBzEgM0W9jTXFNvRxuIaqGa/t0aV0yLu9rODctw5rHxfqxw3OibMeA+1s9ZiXM=", new String[]{"01cc3"}));
                                            } else {
                                                zLJJJJ = C2204961BRm.LJJJJ(this.LJI, intent2, c1baz, 1, new C0WZX("dzBzEgM0W9jTXFNvRxuIaqGa/t0aV0yLu9rODctw5rHxfqxw3OibMeA+1s9ZiXM=", new String[]{"01cc3"}));
                                            }
                                            if (zLJJJJ) {
                                                C2200451BAd.LJI("BillingClient", "Service was bonded successfully.");
                                                return;
                                            }
                                            c1bax = C1BAX.BILLING_SERVICE_BLOCKED;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                c1bax = C1BAX.INVALID_PHONESKY_PACKAGE;
                            }
                        } else {
                            c1bax = C1BAX.INVALID_PHONESKY_PACKAGE;
                        }
                    } else {
                        c1bax = C1BAX.INTENT_SERVICE_NOT_FOUND;
                    }
                    LJJIJL(0);
                    C2200451BAd.LJI("BillingClient", "Billing service unavailable on device.");
                    c19885612rGLJJIIJZLJL = C2200541BAm.LIZIZ;
                    LJJIJIL(i, c19885612rGLJJIIJZLJL, c1bax);
                }
            } finally {
            }
        }
        if (c19885612rGLJJIIJZLJL != null) {
            interfaceC2200341B9s.LJ(c19885612rGLJJIIJZLJL);
        }
    }

    public C1BAY(C1796240wqM c1796240wqM, Context context, C1797800wss c1797800wss) {
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.LJJIJIIJIL = lValueOf;
        this.LJJIJIL = C1BFP.LIZ;
        this.LIZJ = C1527930prb.LIZ;
        String strLJIJI = LJIJI();
        this.LIZLLL = strLJIJI;
        this.LJI = C786410Ut5.N3(context);
        C19914712vx c19914712vxLJJIIZ = C19914612vw.LJJIIZ();
        c19914712vxLJJIIZ.LIZLLL();
        C19914612vw.LJJIIJ((C19914612vw) c19914712vxLJJIIZ.LLILLJJLI);
        if (strLJIJI != null) {
            c19914712vxLJJIIZ.LIZLLL();
            C19914612vw.LJJIIJZLJL((C19914612vw) c19914712vxLJJIIZ.LLILLJJLI, strLJIJI);
        }
        String packageName = this.LJI.getPackageName();
        c19914712vxLJJIIZ.LIZLLL();
        C19914612vw.LJIJJLI((C19914612vw) c19914712vxLJJIIZ.LLILLJJLI, packageName);
        long jLongValue = lValueOf.longValue();
        c19914712vxLJJIIZ.LIZLLL();
        C19914612vw.LJJIJIL((C19914612vw) c19914712vxLJJIIZ.LLILLJJLI, jLongValue);
        boolean z = c1797800wss.LJII;
        c19914712vxLJJIIZ.LIZLLL();
        C19914612vw.LJJIII((C19914612vw) c19914712vxLJJIIZ.LLILLJJLI, z);
        int i = Build.VERSION.SDK_INT;
        c19914712vxLJJIIZ.LIZLLL();
        C19914612vw.LJJIJ((C19914612vw) c19914712vxLJJIIZ.LLILLJJLI, i);
        c19914712vxLJJIIZ.LJFF();
        LJJJJ(c19914712vxLJJIIZ, context);
        try {
            int i2 = C786410Ut5.Y3(this.LJI.getPackageManager(), this.LJI.getPackageName(), 0).versionCode;
            c19914712vxLJJIIZ.LIZLLL();
            C19914612vw.LJJIJIIJI((C19914612vw) c19914712vxLJJIIZ.LLILLJJLI, i2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C2200551BAn c2200551BAn = new C2200551BAn(this.LJI, (C19914612vw) c19914712vxLJJIIZ.LIZIZ());
        this.LJII = c2200551BAn;
        this.LJFF = new C2200591BAr(this.LJI, null, c2200551BAn);
        this.LJJIIJZLJL = c1796240wqM;
        this.LJI.getPackageName();
        this.LJJIIZ = c1797800wss.LJII;
    }

    @Override // X.AbstractC1795460wp6
    public final void LJIIJ(final Activity activity, final C1795310wor c1795310wor, final C1B9T c1b9t) {
        if (activity != null) {
            try {
                Callable callable = new Callable() { // from class: X.1BAh
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        InterfaceC2200631BAv interfaceC2200631BAv;
                        C1C7U.LIZ("zzav@8a83.call");
                        C1BAY c1bay = this.LL;
                        C1B9T c1b9t2 = c1b9t;
                        C1795310wor c1795310wor2 = c1795310wor;
                        Activity activity2 = activity;
                        try {
                            if (!c1bay.LJJJI()) {
                                c1bay.LJJ(c1b9t2, C2200541BAm.LJIIIZ, C1BAX.SERVICE_CONNECTION_NOT_READY, null);
                            } else if (c1bay.LJJIIJ) {
                                synchronized (c1bay.LIZ) {
                                    try {
                                        interfaceC2200631BAv = c1bay.LJIIIIZZ;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                                if (interfaceC2200631BAv == null) {
                                    c1bay.LJJ(c1b9t2, C2200541BAm.LJIIIZ, C1BAX.SERVICE_RESET_TO_NULL, null);
                                } else {
                                    String packageName = c1bay.LJI.getPackageName();
                                    String str = c1bay.LIZJ;
                                    String str2 = c1bay.LIZLLL;
                                    long jLongValue = c1bay.LJJIJIIJIL.longValue();
                                    Bundle bundle = new Bundle();
                                    C2200451BAd.LIZIZ(jLongValue, str, str2, bundle);
                                    C19913212vi c19913212viLJIJJ = C19913112vh.LJIJJ();
                                    C19914112vr c19914112vrLJIJJ = C19914012vq.LJIJJ();
                                    c19914112vrLJIJJ.LJFF(c1795310wor2.LIZ.toString());
                                    c19913212viLJIJJ.LJFF((C19914012vq) c19914112vrLJIJJ.LIZIZ(), "externalOfferUri");
                                    C19914112vr c19914112vrLJIJJ2 = C19914012vq.LJIJJ();
                                    c19914112vrLJIJJ2.LJFF(String.valueOf(c1795310wor2.LIZIZ));
                                    c19913212viLJIJJ.LJFF((C19914012vq) c19914112vrLJIJJ2.LIZIZ(), "externalOfferLaunchMode");
                                    C19914112vr c19914112vrLJIJJ3 = C19914012vq.LJIJJ();
                                    c19914112vrLJIJJ3.LJFF(String.valueOf(c1795310wor2.LIZJ));
                                    c19913212viLJIJJ.LJFF((C19914012vq) c19914112vrLJIJJ3.LIZIZ(), "externalOfferLinkType");
                                    C19914112vr c19914112vrLJIJJ4 = C19914012vq.LJIJJ();
                                    c19914112vrLJIJJ4.LJFF(String.valueOf(c1795310wor2.LIZLLL));
                                    c19913212viLJIJJ.LJFF((C19914012vq) c19914112vrLJIJJ4.LIZIZ(), "externalOfferBillingProgram");
                                    C786410Ut5.LJJIJ(bundle, "REQUEST_PARAMS", ((C19913112vh) c19913212viLJIJJ.LIZIZ()).LIZIZ());
                                    interfaceC2200631BAv.h1(packageName, bundle, new C1B9S(c1bay, new WeakReference(activity2), c1b9t2));
                                }
                            } else {
                                c1bay.LJJ(c1b9t2, C2200541BAm.LJJIJ, C1BAX.LAUNCH_EXTERNAL_LINK_NOT_SUPPORTED, null);
                            }
                        } catch (RuntimeException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c1bay.LJJ(c1b9t2, C2200541BAm.LJII, C1BAX.SERVICE_CALL_EXCEPTION, e);
                        }
                        C1C7U.LIZIZ("zzav@8a83.call");
                        return null;
                    }
                };
                Runnable runnable = new Runnable() { // from class: X.1B9f
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("zzaw@8a82.run");
                        try {
                            this.LL.LJJ(c1b9t, C2200541BAm.LJIIJ, C1BAX.EXECUTE_ASYNC_TIMEOUT, null);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("zzaw@8a82.run");
                    }
                };
                try {
                    C786410Ut5.LJLIIL(28500L, LJJIII(), new C0N81(LJIILLIIL().submit(callable), runnable));
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                LJJ(c1b9t, LJJIIZ(), C1BAX.SERVICE_CALL_EXCEPTION, e2);
                return;
            }
        }
        throw new IllegalArgumentException("Please provide a valid activity.");
    }

    public final C19885612rG LJIILL(final Activity activity, C1795950wpt c1795950wpt, C1796140wqC c1796140wqC) {
        if (!LJJJ()) {
            return C2200541BAm.LJIIIZ;
        }
        if (!this.LJIILLIIL) {
            return C2200541BAm.LJIJ;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        C786410Ut5.LJJIIZ(bundle, windowToken, "KEY_WINDOW_TOKEN");
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        C786410Ut5.LJJJI("playBillingLibraryVersion", this.LIZJ, bundle);
        String str = this.LIZLLL;
        if (str != null) {
            C786410Ut5.LJJJI("playBillingLibraryWrapperVersion", str, bundle);
        }
        C786410Ut5.LJJIJIL(bundle, "KEY_CATEGORY_IDS", c1795950wpt.LIZ);
        BPEAHandler bPEAHandler = this.LJ;
        final zzbq zzbqVar = new zzbq(this, bPEAHandler, c1796140wqC);
        LJIIZILJ(new Callable() { // from class: X.1BAq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC2200631BAv interfaceC2200631BAv;
                C1C7U.LIZ("zzbk@8a6f.call");
                C1BAY c1bay = this.LL;
                Bundle bundle2 = bundle;
                Activity activity2 = activity;
                ResultReceiver resultReceiver = zzbqVar;
                c1bay.getClass();
                try {
                    synchronized (c1bay.LIZ) {
                        try {
                            interfaceC2200631BAv = c1bay.LJIIIIZZ;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    if (interfaceC2200631BAv == null) {
                        c1bay.LJJIJ(-1, C1BAX.SERVICE_RESET_TO_NULL, null);
                    } else {
                        interfaceC2200631BAv.J0(c1bay.LJI.getPackageName(), bundle2, new C1B9N(new WeakReference(activity2), resultReceiver));
                    }
                } catch (DeadObjectException e) {
                    TryCatchGuardChecker.doCheck(e);
                    c1bay.LJJIJ(-1, C1BAX.SERVICE_CALL_EXCEPTION, e);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    c1bay.LJJIJ(6, C1BAX.SERVICE_CALL_EXCEPTION, e2);
                }
                C1C7U.LIZIZ("zzbk@8a6f.call");
                return null;
            }
        }, Mp4ScreenVideoLoadTimeout.CONTROL, null, bPEAHandler, LJIILLIIL());
        return C2200541BAm.LJIIIIZZ;
    }

    public final C1BBK LJJIIJ(C19885612rG c19885612rG, C1BAX c1bax, Exception exc) {
        LJJJJL(c1bax, 7, c19885612rG, C2200521BAk.LIZ(exc));
        return new C1BBK(c19885612rG.LIZ, c19885612rG.LIZJ, new ArrayList(), new ArrayList());
    }

    public final void LJJIJ(int i, C1BAX c1bax, Exception exc) {
        C2200661BAy c2200661BAy;
        C1BBD c1bbd = this.LJII;
        String strLIZ = C2200521BAk.LIZ(exc);
        try {
            C1BB7 c1bb7LJIJJLI = C1BB1.LJIJJLI();
            c1bb7LJIJJLI.LJI(i);
            if (c1bax != null) {
                c1bb7LJIJJLI.LJFF(c1bax);
            }
            if (strLIZ != null) {
                c1bb7LJIJJLI.LIZLLL();
                C1BB1.LJJ((C1BB1) c1bb7LJIJJLI.LLILLJJLI, strLIZ);
            }
            C2200641BAw c2200641BAwLJJ = C2200661BAy.LJJ();
            c2200641BAwLJJ.LJFF(c1bb7LJIJJLI);
            c2200641BAwLJJ.LJII(30);
            c2200661BAy = (C2200661BAy) c2200641BAwLJJ.LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2200661BAy = null;
        }
        ((C2200551BAn) c1bbd).LIZ(c2200661BAy);
    }

    public final void LJJIJIL(int i, C19885612rG c19885612rG, C1BAX c1bax) {
        boolean z;
        try {
            int i2 = C2200521BAk.LIZ;
            C2200641BAw c2200641BAw = (C2200641BAw) C2200521BAk.LIZIZ(c1bax, 6, c19885612rG, null, EnumC2200651BAx.BROADCAST_ACTION_UNSPECIFIED).LJIILIIL();
            C1BB8 c1bb8LJIJJ = C1BB2.LJIJJ();
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            c1bb8LJIJJ.LJFF(z);
            c1bb8LJIJJ.LJI(i);
            c2200641BAw.LJI(c1bb8LJIJJ);
            LJJIJIIJI((C2200661BAy) c2200641BAw.LIZIZ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final C1BBN LJJJJI(C19885612rG c19885612rG, C1BAX c1bax, Exception exc) {
        LJJJJL(c1bax, 9, c19885612rG, C2200521BAk.LIZ(exc));
        return new C1BBN(c19885612rG, null);
    }

    public final void LJJJJIZL(int i, C19885612rG c19885612rG, C1BAX c1bax) {
        C2200671BAz c2200671BAz = null;
        C2200661BAy c2200661BAy = null;
        if (c19885612rG.LIZ != 0) {
            int i2 = C2200521BAk.LIZ;
            try {
                C2200641BAw c2200641BAwLJJ = C2200661BAy.LJJ();
                C1BB7 c1bb7LJIJJLI = C1BB1.LJIJJLI();
                c1bb7LJIJJLI.LJI(c19885612rG.LIZ);
                String str = c19885612rG.LIZJ;
                c1bb7LJIJJLI.LIZLLL();
                C1BB1.LJJI((C1BB1) c1bb7LJIJJLI.LLILLJJLI, str);
                c1bb7LJIJJLI.LJFF(c1bax);
                c2200641BAwLJJ.LJFF(c1bb7LJIJJLI);
                c2200641BAwLJJ.LJII(5);
                C1BBH c1bbhLJIJJ = C1BB5.LJIJJ();
                c1bbhLJIJJ.LIZLLL();
                C1BB5.LJIL((C1BB5) c1bbhLJIJJ.LLILLJJLI, i);
                C1BB5 c1bb5 = (C1BB5) c1bbhLJIJJ.LIZIZ();
                c2200641BAwLJJ.LIZLLL();
                C2200661BAy.LJJIIJZLJL((C2200661BAy) c2200641BAwLJJ.LLILLJJLI, c1bb5);
                c2200661BAy = (C2200661BAy) c2200641BAwLJJ.LIZIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LJJIJIIJI(c2200661BAy);
            return;
        }
        int i3 = C2200521BAk.LIZ;
        try {
            C1BBB c1bbbLJIJJLI = C2200671BAz.LJIJJLI();
            c1bbbLJIJJLI.LJFF(5);
            C1BBH c1bbhLJIJJ2 = C1BB5.LJIJJ();
            c1bbhLJIJJ2.LIZLLL();
            C1BB5.LJIL((C1BB5) c1bbhLJIJJ2.LLILLJJLI, i);
            C1BB5 c1bb52 = (C1BB5) c1bbhLJIJJ2.LIZIZ();
            c1bbbLJIJJLI.LIZLLL();
            C2200671BAz.LJJIFFI((C2200671BAz) c1bbbLJIJJLI.LLILLJJLI, c1bb52);
            c2200671BAz = (C2200671BAz) c1bbbLJIJJLI.LIZIZ();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LJJIJIIJIL(c2200671BAz);
    }

    public final void LJJJJJ(int i, C19885612rG c19885612rG, C1BAX c1bax) {
        try {
            int i2 = C2200521BAk.LIZ;
            LJJIJIIJI(C2200521BAk.LIZIZ(c1bax, i, c19885612rG, null, EnumC2200651BAx.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJJJJJL(C1BAX c1bax, C19885612rG c19885612rG, long j) {
        try {
            int i = C2200521BAk.LIZ;
            C2200661BAy c2200661BAyLIZIZ = C2200521BAk.LIZIZ(c1bax, 2, c19885612rG, null, EnumC2200651BAx.BROADCAST_ACTION_UNSPECIFIED);
            try {
                ((C2200551BAn) this.LJII).LIZJ(c2200661BAyLIZIZ, this.LJIIL, j);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public C1BAY(C1796240wqM c1796240wqM, Context context, InterfaceC1796100wq8 interfaceC1796100wq8, C1797800wss c1797800wss) {
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.LJJIJIIJIL = lValueOf;
        this.LJJIJIL = C1BFP.LIZ;
        this.LIZJ = C1527930prb.LIZ;
        String strLJIJI = LJIJI();
        this.LIZLLL = strLJIJI;
        this.LJI = C786410Ut5.N3(context);
        C19914712vx c19914712vxLJJIIZ = C19914612vw.LJJIIZ();
        c19914712vxLJJIIZ.LIZLLL();
        C19914612vw.LJJIIJ((C19914612vw) c19914712vxLJJIIZ.LLILLJJLI);
        if (strLJIJI != null) {
            c19914712vxLJJIIZ.LIZLLL();
            C19914612vw.LJJIIJZLJL((C19914612vw) c19914712vxLJJIIZ.LLILLJJLI, strLJIJI);
        }
        String packageName = this.LJI.getPackageName();
        c19914712vxLJJIIZ.LIZLLL();
        C19914612vw.LJIJJLI((C19914612vw) c19914712vxLJJIIZ.LLILLJJLI, packageName);
        long jLongValue = lValueOf.longValue();
        c19914712vxLJJIIZ.LIZLLL();
        C19914612vw.LJJIJIL((C19914612vw) c19914712vxLJJIIZ.LLILLJJLI, jLongValue);
        boolean z = c1797800wss.LJII;
        c19914712vxLJJIIZ.LIZLLL();
        C19914612vw.LJJIII((C19914612vw) c19914712vxLJJIIZ.LLILLJJLI, z);
        int i = Build.VERSION.SDK_INT;
        c19914712vxLJJIIZ.LIZLLL();
        C19914612vw.LJJIJ((C19914612vw) c19914712vxLJJIIZ.LLILLJJLI, i);
        c19914712vxLJJIIZ.LJFF();
        LJJJJ(c19914712vxLJJIIZ, context);
        try {
            int i2 = C786410Ut5.Y3(this.LJI.getPackageManager(), this.LJI.getPackageName(), 0).versionCode;
            c19914712vxLJJIIZ.LIZLLL();
            C19914612vw.LJJIJIIJI((C19914612vw) c19914712vxLJJIIZ.LLILLJJLI, i2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C2200551BAn c2200551BAn = new C2200551BAn(this.LJI, (C19914612vw) c19914712vxLJJIIZ.LIZIZ());
        this.LJII = c2200551BAn;
        this.LJFF = new C2200591BAr(this.LJI, interfaceC1796100wq8, c2200551BAn);
        this.LJJIIJZLJL = c1796240wqM;
        this.LJJIIZI = false;
        this.LJI.getPackageName();
        this.LJJIIZ = c1797800wss.LJII;
    }

    public final void LJIL(InterfaceC1796450wqh interfaceC1796450wqh, C19885612rG c19885612rG, C1BAX c1bax, Exception exc) {
        LJJJJL(c1bax, 35, c19885612rG, C2200521BAk.LIZ(exc));
        interfaceC1796450wqh.LIZ(c19885612rG, null);
    }

    public final void LJJ(C1B9T c1b9t, C19885612rG c19885612rG, C1BAX c1bax, Exception exc) {
        LJJJJL(c1bax, 37, c19885612rG, C2200521BAk.LIZ(exc));
        c1b9t.LIZ(c19885612rG);
    }

    public final void LJJJJL(C1BAX c1bax, int i, C19885612rG c19885612rG, String str) {
        try {
            int i2 = C2200521BAk.LIZ;
            LJJIJIIJI(C2200521BAk.LIZIZ(c1bax, i, c19885612rG, str, EnumC2200651BAx.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJJJJLI(C1BAX c1bax, C19885612rG c19885612rG, long j, boolean z) {
        try {
            int i = C2200521BAk.LIZ;
            C2200661BAy c2200661BAyLIZIZ = C2200521BAk.LIZIZ(c1bax, 2, c19885612rG, null, EnumC2200651BAx.BROADCAST_ACTION_UNSPECIFIED);
            try {
                ((C2200551BAn) this.LJII).LJ(c2200661BAyLIZIZ, this.LJIIL, j, z);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static Future LJIIZILJ(Callable callable, long j, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future futureSubmit = executorService.submit(callable);
            C786410Ut5.LJLIIL((long) (j * 0.95d), handler, new Runnable() { // from class: X.0N80
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzbc@8a77.run");
                    try {
                        Future future = futureSubmit;
                        if (!future.isDone() && !future.isCancelled()) {
                            Runnable runnable2 = runnable;
                            future.cancel(true);
                            if (runnable2 != null) {
                                runnable2.run();
                            }
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzbc@8a77.run");
                }
            });
            return futureSubmit;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LJIJJ(InterfaceC2200191B9d interfaceC2200191B9d, int i, C19885612rG c19885612rG, C1BAX c1bax, Exception exc) {
        LJJJJL(c1bax, 33, c19885612rG, C2200521BAk.LIZ(exc));
        interfaceC2200191B9d.LIZ(c19885612rG);
    }

    public final void LJIJJLI(C1BAM c1bam, String str, C19885612rG c19885612rG, C1BAX c1bax, Exception exc) {
        LJJJJL(c1bax, 4, c19885612rG, C2200521BAk.LIZ(exc));
        c1bam.LIZLLL(c19885612rG, str);
    }

    public final void LJJJJLL(C1BAX c1bax, C19885612rG c19885612rG, String str, long j, boolean z) {
        try {
            int i = C2200521BAk.LIZ;
            C2200661BAy c2200661BAyLIZIZ = C2200521BAk.LIZIZ(c1bax, 2, c19885612rG, str, EnumC2200651BAx.BROADCAST_ACTION_UNSPECIFIED);
            try {
                ((C2200551BAn) this.LJII).LJ(c2200661BAyLIZIZ, this.LJIIL, j, z);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }
}
