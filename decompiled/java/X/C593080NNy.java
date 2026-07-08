package X;

import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: renamed from: X.0NNy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C593080NNy {
    public AnonymousClass0956 LIZLLL;
    public AnonymousClass0956 LJ;
    public int LJII;
    public final PriorityQueue<C1001510cAX> LIZ = new PriorityQueue<>();
    public final C603820NmG<String, C1001510cAX> LIZIZ = new C603820NmG<>(100);
    public final C1DEV LIZJ = C2191201ApK.LIZ();
    public final C054G LJFF = C2296808zG.LIZ(C0PEM.LIZ);
    public final AtomicBoolean LJI = new AtomicBoolean(false);
    public final AtomicInteger LJIIIIZZ = new AtomicInteger(0);
    public final AwS588S0100000_9 LJIIIZ = new AwS588S0100000_9(this, 635);
    public final AtomicBoolean LJIIJ = new AtomicBoolean(false);
    public final C0NO4 LJIIJJI = new C0NO4();
    public final C1006690cIt LJIIL = new C1006690cIt(C1001430cAP.LIZ().featureConfig, C1001430cAP.LIZ().maxFeatureScore);
    public final long LJIILIIL = C1001430cAP.LIZ().idleCheckPollingInterval;
    public final int LJIILJJIL = C1001430cAP.LIZ().idleCheckPollingSuccessRounds;
    public final long LJIILL = C1001430cAP.LIZ().stopDelayTimeAfterCompleteJob;
    public final AwS588S0100000_9 LJIILLIIL = new AwS588S0100000_9(this, 634);

    public final void LIZLLL() {
        this.LJIIJ.set(false);
        C0NO4 c0no4 = this.LJIIJJI;
        C1BC6 c1bc6 = c0no4.LIZ.get(String.valueOf(hashCode()));
        if (c1bc6 != null) {
            C1BCA.LJJIJIIJIL(c1bc6);
        }
        this.LJII = 0;
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LIZLLL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
    }

    public final void LJ() {
        if (!this.LJIIJ.getAndSet(true)) {
            C0NO4 c0no4 = this.LJIIJJI;
            final AwS588S0100000_9 awS588S0100000_9 = this.LJIILLIIL;
            String strValueOf = String.valueOf(hashCode());
            c0no4.getClass();
            C1BC6 c1bc6 = new C1BC6() { // from class: X.0NO1
                @Override // X.InterfaceC1006670cIr
                public final void LJIIJ(C1514210pVT c1514210pVT, C1514210pVT c1514210pVT2) {
                    C1514210pVT c1514210pVT3 = c1514210pVT2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("executeOnMainThreadStateChange isIdle = ");
                    sbLIZ.append(c1514210pVT3.LIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    awS588S0100000_9.invoke(Boolean.valueOf(c1514210pVT3.LIZ));
                }
            };
            c0no4.LIZ.put(strValueOf, c1bc6);
            C1BCA.LJIL(c1bc6);
        }
        AtomicBoolean atomicBoolean = this.LJI;
        this.LJIIJJI.getClass();
        atomicBoolean.set(true ^ C1BCA.LJII().LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try Start Listen MainThread State Change , hasRegisterListener = ");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(" shouldPauseTaskProcessing = ");
        sbLIZ.append(this.LJI);
        sbLIZ.append(" module = ");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startIdleCheckPolling idleCheckJob?.isActive = ");
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        sbLIZ.append(anonymousClass0956 != null ? Boolean.valueOf(anonymousClass0956.isActive()) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        AnonymousClass0956 anonymousClass09562 = this.LJ;
        if (anonymousClass09562 == null || !anonymousClass09562.isActive()) {
            this.LJII = 0;
            AnonymousClass0956 anonymousClass09563 = this.LJ;
            if (anonymousClass09563 != null) {
                anonymousClass09563.LIZIZ(null);
            }
            this.LJ = C23250099c.LIZLLL(this.LJFF, null, null, new C593060NNw(this, null), 3);
        }
    }

    public final void LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryToProcessTask shouldPauseTaskProcessing = ");
        sbLIZ.append(this.LJI.get());
        sbLIZ.append(" processTaskJob?.isCompleted = ");
        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
        sbLIZ.append(anonymousClass0956 != null ? Boolean.valueOf(anonymousClass0956.isCompleted()) : null);
        sbLIZ.append("  taskRunningQueue.size= ");
        sbLIZ.append(this.LIZ.size());
        sbLIZ.append(" currentModule = ");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LJI.get()) {
            return;
        }
        AnonymousClass0956 anonymousClass09562 = this.LIZLLL;
        if ((anonymousClass09562 == null || anonymousClass09562.isCompleted()) && (!this.LIZ.isEmpty())) {
            AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(this.LJFF, null, null, new C593030NNt(this, null), 3);
            anonymousClass0956LIZLLL.LJII(new AwS588S0100000_9(this, 636));
            this.LIZLLL = anonymousClass0956LIZLLL;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C593070NNx
            if (r0 == 0) goto L26
            r6 = r8
            X.0NNx r6 = (X.C593070NNx) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.1DEV r3 = r6.LL
            X.C155000ia.LIZIZ(r5)
            goto L44
        L26:
            X.0NNx r6 = new X.0NNx
            r6.<init>(r7, r8)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r5)
            X.1DEV r3 = r7.LIZJ
            r6.LL = r3
            r6.LLILZ = r1
            java.lang.Object r0 = r3.LIZLLL(r4, r6)
            if (r0 != r2) goto L44
            return r2
        L44:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.LJI     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r0.getAndSet(r1)     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L67
            java.util.PriorityQueue<X.0cAX> r0 = r7.LIZ     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L6d
        L52:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L67
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L6d
            X.0cAX r1 = (X.C1001510cAX) r1     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L52
            int r0 = r1.LLILLL     // Catch: java.lang.Throwable -> L6d
            int r0 = r0 + 1
            r1.LLILLL = r0     // Catch: java.lang.Throwable -> L6d
            goto L52
        L67:
            r3.LIZIZ(r4)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6d
            r3.LIZIZ(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C593080NNy.LIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:12))(0)|7|(1:(1:(8:11|57|43|44|45|46|51|52)(2:13|14))(1:15))(2:16|(1:18))|59|19|(5:22|(2:24|26)(1:25)|(3:63|28|66)(1:65)|64|20)|62|29|(2:31|(4:33|(1:35)(1:37)|36|(1:39)(6:40|44|45|46|51|52))(5:41|45|46|51|52))(4:42|46|51|52)|(2:(0)|(1:61))) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011d, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C593080NNy.LIZIZ(X.05Vn):java.lang.Object");
    }
}
