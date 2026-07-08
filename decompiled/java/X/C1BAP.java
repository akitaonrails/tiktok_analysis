package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: X.1BAP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BAP extends C1BAY {
    public final Context LJJIJL;
    public volatile int LJJIJLIJ;
    public volatile C1B9H LJJIL;
    public volatile C1B9J LJJIZ;
    public volatile ScheduledExecutorService LJJJ;

    @Override // X.C1BAY, X.AbstractC1795460wp6
    public final void LIZLLL() {
        synchronized (this) {
            LJJJLZIJ(27);
            try {
                if (this.LJJIZ != null && this.LJJIL != null) {
                    C2200451BAd.LJI("BillingClientTesting", "Unbinding from Billing Override Service.");
                    this.LJJIJL.unbindService(this.LJJIZ);
                    this.LJJIZ = new C1B9J(this);
                }
                this.LJJIL = null;
                if (this.LJJJ != null) {
                    this.LJJJ.shutdownNow();
                    this.LJJJ = null;
                }
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LJJIJLIJ = 3;
                throw th;
            }
            this.LJJIJLIJ = 3;
        }
        super.LIZLLL();
    }

    public final synchronized boolean LJJJJZI() {
        if (this.LJJIJLIJ == 2 && this.LJJIL != null) {
            if (this.LJJIZ != null) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C1BAY, X.AbstractC1795460wp6
    public final void LJIILIIL(InterfaceC2200341B9s interfaceC2200341B9s) throws Throwable {
        synchronized (this) {
            if (LJJJJZI()) {
                C2200451BAd.LJI("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                LJJJLZIJ(26);
            } else if (this.LJJIJLIJ != 1) {
                if (this.LJJIJLIJ == 3) {
                    LJJJLL(26, C2200541BAm.LIZ(-1, "Billing Override Service connection is disconnected."), C1BAX.BILLING_CLIENT_CLOSED);
                } else {
                    this.LJJIJLIJ = 1;
                    C2200451BAd.LJI("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.LJJIZ = new C1B9J(this);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    Context context = this.LJJIJL;
                    List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                    C1BAX c1bax = C1BAX.REASON_UNSPECIFIED;
                    if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = ((ResolveInfo) ListProtector.get(listQueryIntentServices, 0)).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") && str2 != null) {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (C2204961BRm.LJJJJ(context, intent2, this.LJJIZ, 1, new C0WZX("dzBzEgM0W9jTXFNvRxuIaqGa/t0aV0yLu9rODctw3qJB0Q==", new String[]{"01cc3"}))) {
                                    C2200451BAd.LJI("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    c1bax = C1BAX.BILLING_SERVICE_BLOCKED;
                                }
                            } else {
                                c1bax = C1BAX.BILLING_SERVICE_BLOCKED;
                            }
                        }
                    } else {
                        c1bax = C1BAX.INTENT_SERVICE_NOT_FOUND;
                    }
                    this.LJJIJLIJ = 0;
                    C2200451BAd.LJI("BillingClientTesting", "Billing Override Service unavailable on device.");
                    LJJJLL(26, C2200541BAm.LIZ(2, "Billing Override Service unavailable on device."), c1bax);
                }
            }
        }
        LJJIL(interfaceC2200341B9s, 0);
    }

    public final InterfaceFutureC1488980oqm LJJJLIIL(final int i) {
        if (!LJJJJZI()) {
            LJJJLL(28, C2200541BAm.LIZ(-1, "Billing Override Service connection is disconnected."), C1BAX.BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY);
            return new C199483133h(0);
        }
        return C199521134t.LIZ(new AnonymousClass1353() { // from class: X.1B9Y
            @Override // X.AnonymousClass1353
            public final Object LIZ(C199520134s c199520134s) {
                String str;
                C1BAP c1bap = this.LIZ;
                int i2 = i;
                try {
                    c1bap.LJJIL.getClass();
                    C1B9H c1b9h = c1bap.LJJIL;
                    String packageName = c1bap.LJJIJL.getPackageName();
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 != 5) {
                                    if (i2 == 6) {
                                        str = "START_CONNECTION";
                                    } else {
                                        str = "QUERY_PRODUCT_DETAILS_ASYNC";
                                    }
                                } else {
                                    str = "IS_FEATURE_SUPPORTED";
                                }
                            } else {
                                str = "CONSUME_ASYNC";
                            }
                        } else {
                            str = "ACKNOWLEDGE_PURCHASE";
                        }
                    } else {
                        str = "LAUNCH_BILLING_FLOW";
                    }
                    c1b9h.LLIIJLIL(packageName, str, new C1B9X(c199520134s));
                    return "billingOverrideService.getBillingOverride";
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c1bap.LJJJLL(28, C2200541BAm.LJJIIZ, C1BAX.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION);
                    c199520134s.LIZ(0);
                    return "billingOverrideService.getBillingOverride";
                }
            }
        });
    }

    public final void LJJJLZIJ(int i) {
        int i2 = C2200521BAk.LIZ;
        C2200671BAz c2200671BAzLIZJ = C2200521BAk.LIZJ(i, EnumC2200651BAx.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(c2200671BAzLIZJ, "ApiSuccess should not be null");
        C2200551BAn c2200551BAn = (C2200551BAn) this.LJII;
        c2200551BAn.getClass();
        try {
            c2200551BAn.LJII(c2200671BAzLIZJ, c2200551BAn.LIZIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C1BAP(Context context, C1797800wss c1797800wss) {
        super(context, c1797800wss);
        this.LJJIJL = context;
    }

    @Override // X.C1BAY, X.AbstractC1795460wp6
    public final void LIZ(final C1796110wq9 c1796110wq9, final InterfaceC2200251B9j interfaceC2200251B9j) {
        LJJJZ(3, new C092O() { // from class: X.1BAO
            @Override // X.C092O
            public final void accept(Object obj) {
                interfaceC2200251B9j.LIZIZ((C19885612rG) obj);
            }
        }, new Runnable() { // from class: X.0wsv
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzcs@8a48.run");
                try {
                    super/*X.1BAY*/.LIZ(c1796110wq9, interfaceC2200251B9j);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzcs@8a48.run");
            }
        });
    }

    @Override // X.C1BAY, X.AbstractC1795460wp6
    public final void LIZIZ(final C1796130wqB c1796130wqB, final C1BAM c1bam) {
        LJJJZ(4, new C092O() { // from class: X.1BAN
            @Override // X.C092O
            public final void accept(Object obj) {
                c1bam.LIZLLL((C19885612rG) obj, c1796130wqB.LIZ);
            }
        }, new Runnable() { // from class: X.0wsx
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzcp@8a4b.run");
                try {
                    super/*X.1BAY*/.LIZIZ(c1796130wqB, c1bam);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzcp@8a4b.run");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1BAY, X.AbstractC1795460wp6
    public final C19885612rG LJIIIZ(final Activity activity, final C1795840wpi c1795840wpi) {
        C092O c092o = new C092O() { // from class: X.1BAU
            @Override // X.C092O
            public final void accept(Object obj) {
                this.LIZ.LJJJJZ((C19885612rG) obj);
            }
        };
        Callable callable = new Callable() { // from class: X.1BAT
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("zzcu@8a46.call");
                C19885612rG c19885612rGLJIIIZ = super/*X.1BAY*/.LJIIIZ(activity, c1795840wpi);
                C1C7U.LIZIZ("zzcu@8a46.call");
                return c19885612rGLJIIIZ;
            }
        };
        try {
            int iIntValue = ((Integer) LJJJLIIL(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
            if (iIntValue > 0) {
                C19885612rG c19885612rGLIZ = C2200541BAm.LIZ(iIntValue, "Billing override value was set by a license tester.");
                LJJJLL(2, c19885612rGLIZ, C1BAX.LICENSE_TESTER_BILLING_OVERRIDE);
                c092o.accept(c19885612rGLIZ);
                return c19885612rGLIZ;
            }
        } catch (TimeoutException e) {
            TryCatchGuardChecker.doCheck(e);
            LJJJLL(28, C2200541BAm.LJJIIZ, C1BAX.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (e2 instanceof InterruptedException) {
                C786410Ut5.u3().interrupt();
            }
            LJJJLL(28, C2200541BAm.LJJIIZ, C1BAX.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION);
        }
        try {
            return (C19885612rG) callable.call();
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            C1BAX c1bax = C1BAX.BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR;
            C19885612rG c19885612rG = C2200541BAm.LJII;
            LJJJLL(2, c19885612rG, c1bax);
            return c19885612rG;
        }
    }

    @Override // X.C1BAY, X.AbstractC1795460wp6
    public final void LJIIJJI(final C1796050wq3 c1796050wq3, final InterfaceC1797860wsy interfaceC1797860wsy) {
        LJJJZ(7, new C092O() { // from class: X.0wsz
            @Override // X.C092O
            public final void accept(Object obj) {
                C1796230wqL c1796230wqL = new C1796230wqL(new ArrayList(), new ArrayList());
                interfaceC1797860wsy.LIZ((C19885612rG) obj, c1796230wqL);
            }
        }, new Runnable() { // from class: X.0wsw
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzcn@8a4d.run");
                try {
                    super/*X.1BAY*/.LJIIJJI(c1796050wq3, interfaceC1797860wsy);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzcn@8a4d.run");
            }
        });
    }

    public C1BAP(C1796240wqM c1796240wqM, Context context, C1797800wss c1797800wss) {
        super(c1796240wqM, context, c1797800wss);
        this.LJJIJL = context;
    }

    public final void LJJJLL(int i, C19885612rG c19885612rG, C1BAX c1bax) {
        int i2 = C2200521BAk.LIZ;
        C2200661BAy c2200661BAyLIZIZ = C2200521BAk.LIZIZ(c1bax, i, c19885612rG, null, EnumC2200651BAx.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(c2200661BAyLIZIZ, "ApiFailure should not be null");
        ((C2200551BAn) this.LJII).LIZ(c2200661BAyLIZIZ);
    }

    public final void LJJJZ(int i, C092O c092o, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        final InterfaceFutureC1488980oqm interfaceFutureC1488980oqmLJJJLIIL = LJJJLIIL(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            if (this.LJJJ == null) {
                this.LJJJ = C807400Vlq.LJ();
            }
            scheduledExecutorService = this.LJJJ;
        }
        if (!interfaceFutureC1488980oqmLJJJLIIL.isDone()) {
            final C199491133p c199491133p = new C199491133p(interfaceFutureC1488980oqmLJJJLIIL);
            Runnable runnable2 = new Runnable(c199491133p) { // from class: X.133n
                public C199491133p LL;

                {
                    this.LL = c199491133p;
                }

                /* JADX WARN: Removed duplicated region for block: B:46:0x00b9 A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #1 {all -> 0x00d8, blocks: (B:36:0x0062, B:44:0x00a9, B:46:0x00b9, B:51:0x00c4, B:53:0x00d4, B:54:0x00d7), top: B:61:0x0062 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        Method dump skipped, instruction units count: 225
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC199489133n.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzdg@8db8.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzdg@8db8.run");
                }
            };
            c199491133p.LLJ = scheduledExecutorService.schedule(runnable2, 28500L, timeUnit);
            interfaceFutureC1488980oqmLJJJLIIL.LJFF(runnable2, EnumC2272708vN.LL);
            interfaceFutureC1488980oqmLJJJLIIL = c199491133p;
        }
        final C1BAQ c1baq = new C1BAQ(this, i, c092o, runnable);
        interfaceFutureC1488980oqmLJJJLIIL.LJFF(new Runnable(interfaceFutureC1488980oqmLJJJLIIL, c1baq) { // from class: X.1BAR
            public final Future LL;
            public final C1BAW LLILLJJLI;

            {
                this.LL = interfaceFutureC1488980oqmLJJJLIIL;
                this.LLILLJJLI = c1baq;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void LIZ() {
                Object obj;
                Throwable thLIZ;
                Future future = this.LL;
                if ((future instanceof AbstractC199477133b) && (thLIZ = ((AbstractC199477133b) future).LIZ()) != null) {
                    ((C1BAQ) this.LLILLJJLI).LIZ(thLIZ);
                    return;
                }
                try {
                    if (!future.isDone()) {
                        throw new IllegalStateException(C08KP.LIZ("Future was expected to be done: %s", future));
                    }
                    boolean z = false;
                    while (true) {
                        try {
                            obj = future.get();
                            break;
                        } catch (InterruptedException e) {
                            TryCatchGuardChecker.doCheck(e);
                            z = true;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (z) {
                                C786410Ut5.u3().interrupt();
                            }
                            throw th;
                        }
                    }
                    if (z) {
                        C786410Ut5.u3().interrupt();
                    }
                    C1BAQ c1baq2 = (C1BAQ) this.LLILLJJLI;
                    c1baq2.getClass();
                    Integer num = (Integer) obj;
                    int iIntValue = num.intValue();
                    C1BAP c1bap = c1baq2.LIZJ;
                    if (iIntValue <= 0) {
                        c1baq2.LIZIZ.run();
                        return;
                    }
                    int i2 = c1baq2.LIZLLL;
                    int iIntValue2 = num.intValue();
                    c1bap.getClass();
                    C19885612rG c19885612rGLIZ = C2200541BAm.LIZ(iIntValue2, "Billing override value was set by a license tester.");
                    c1bap.LJJJLL(i2, c19885612rGLIZ, C1BAX.LICENSE_TESTER_BILLING_OVERRIDE);
                    c1baq2.LIZ.accept(c19885612rGLIZ);
                } catch (ExecutionException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    ((C1BAQ) this.LLILLJJLI).LIZ(e2.getCause());
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    ((C1BAQ) this.LLILLJJLI).LIZ(th2);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzcy@8dab.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzcy@8dab.run");
            }

            public final String toString() {
                C1BAS c1bas = new C1BAS(C1BAR.class.getSimpleName());
                C1BAW c1baw = this.LLILLJJLI;
                C1BAV c1bav = new C1BAV();
                c1bas.LIZJ.LIZIZ = c1bav;
                c1bas.LIZJ = c1bav;
                c1bav.LIZ = c1baw;
                return c1bas.toString();
            }
        }, LJIILLIIL());
    }

    public C1BAP(C1796240wqM c1796240wqM, Context context, InterfaceC1796100wq8 interfaceC1796100wq8, C1797800wss c1797800wss) {
        super(c1796240wqM, context, interfaceC1796100wq8, c1797800wss);
        this.LJJIJL = context;
    }
}
