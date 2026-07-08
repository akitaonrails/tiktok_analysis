package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0wx8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.personalized.trial.PersonalizedTrialHelperInternal$startHeartbeatTimeTracking$1", f = "PersonalizedTrialHelperInternal.kt", l = {285}, m = "invokeSuspend")
public final class C1800440wx8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1800440wx8(InterfaceC1364105Vn<? super C1800440wx8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1800440wx8(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0084 -> B:6:0x0015). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            java.lang.String r18 = "PersonalizedTrialHelperInternal@104a.startHeartbeatTimeTracking$1"
            X.C1C7U.LIZ(r18)
            java.lang.Object r11 = X.C099R.LJFF()
            r12 = r19
            int r1 = r12.LL
            r0 = 1
            if (r1 == 0) goto L90
            if (r1 != r0) goto L94
            X.C155000ia.LIZIZ(r20)
        L15:
            com.ss.android.ugc.aweme.personalized.trial.PersonalizedTrialHelperInternal r17 = com.ss.android.ugc.aweme.personalized.trial.PersonalizedTrialHelperInternal.LIZ
            r17.getClass()
            long r8 = java.lang.System.currentTimeMillis()
            java.util.concurrent.atomic.AtomicLong r14 = X.C1800450wx9.LIZ
            long r6 = r14.get()
            long r4 = r8 - r6
            X.10SI r16 = X.C10SI.LIZ
            java.lang.StringBuilder r15 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Update app usage time: "
            r15.append(r0)
            r15.append(r4)
            r0 = 61
            r15.append(r0)
            r15.append(r8)
            r0 = 45
            r15.append(r0)
            r15.append(r6)
            java.lang.String r0 = ", "
            r15.append(r0)
            r16.getClass()
            com.bytedance.keva.Keva r13 = X.C10SI.LIZLLL
            java.lang.String r10 = "trial_app_usage_passed_time_ms"
            r2 = 0
            long r0 = r13.getLong(r10, r2)
            r15.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r15)
            r16.getClass()
            X.C10SI.LJIILJJIL(r0)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L7b
            boolean r0 = r14.compareAndSet(r6, r8)
            if (r0 == 0) goto L8a
            r16.getClass()
            long r0 = r13.getLong(r10, r2)
            long r0 = r0 + r4
            r13.storeLong(r10, r0)
            r17.LJIIIIZZ()
        L7b:
            r0 = 1
        L7c:
            r12.LL = r0
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r12)
            if (r0 != r11) goto L15
            X.C1C7U.LIZIZ(r18)
            return r11
        L8a:
            java.lang.String r0 = "Update app usage time: concurrency"
            X.C10SI.LJIILJJIL(r0)
            goto L7b
        L90:
            X.C155000ia.LIZIZ(r20)
            goto L7c
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1800440wx8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1800440wx8(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
