package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lVl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.repostfeed.detail.RepostFeedEntranceRepository$requestEntranceInfo$1", f = "RepostFeedEntranceRepository.kt", l = {130, 138}, m = "invokeSuspend")
public final class C1360630lVl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnumC1360550lVd LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1360630lVl(EnumC1360550lVd enumC1360550lVd, InterfaceC1364105Vn<? super C1360630lVl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enumC1360550lVd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1360630lVl(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r8 = "RepostFeedEntranceRepository@19c7.requestEntranceInfo$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r14.LL
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L20
            if (r0 == r2) goto L8a
            if (r0 != r6) goto L18
            X.C155000ia.LIZIZ(r15)     // Catch: java.lang.Throwable -> Lb5
            goto Lb9
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L20:
            X.C155000ia.LIZIZ(r15)
            boolean r0 = X.C298720BnK.LIZ()     // Catch: java.lang.Throwable -> Lb5
            r7 = 0
            if (r0 == 0) goto L37
            X.0lVq r0 = X.C1360680lVq.LIZ     // Catch: java.lang.Throwable -> Lb5
            r0.getClass()     // Catch: java.lang.Throwable -> Lb5
            boolean r0 = X.C1360680lVq.LIZLLL()     // Catch: java.lang.Throwable -> Lb5
            if (r0 != 0) goto L37
            r4 = 1
            goto L38
        L37:
            r4 = 0
        L38:
            X.0rZu r3 = X.C1593840rZu.LIZ     // Catch: java.lang.Throwable -> Lb5
            X.0lVp r1 = X.EnumC1360670lVp.NORMAL_FEED     // Catch: java.lang.Throwable -> Lb5
            X.0rph r0 = X.EnumC1603630rph.REFRESH     // Catch: java.lang.Throwable -> Lb5
            r3.getClass()     // Catch: java.lang.Throwable -> Lb5
            java.util.List r3 = X.C1593840rZu.LIZLLL(r1, r0)     // Catch: java.lang.Throwable -> Lb5
            com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService r0 = com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider.LJI()     // Catch: java.lang.Throwable -> Lb5
            boolean r0 = r0.LJIIJ(r7)     // Catch: java.lang.Throwable -> Lb5
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService r0 = com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider.LJI()     // Catch: java.lang.Throwable -> Lb5
            androidx.lifecycle.MutableLiveData r0 = r0.LJJIII()     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> Lb5
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> Lb5
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> Lb5
            if (r0 == 0) goto L67
            r0 = 1
            goto L68
        L67:
            r0 = 0
        L68:
            com.ss.android.ugc.aweme.repostfeed.repo.RepostFeedApi r9 = com.ss.android.ugc.aweme.repostfeed.repo.RepostFeedApi.LIZJ     // Catch: java.lang.Throwable -> Lb5
            if (r4 == 0) goto L6e
            r10 = 1
            goto L6f
        L6e:
            r10 = 0
        L6f:
            java.lang.String r11 = X.C08JS.LIZLLL(r3)     // Catch: java.lang.Throwable -> Lb5
            if (r0 == 0) goto L77
            r12 = 1
            goto L78
        L77:
            r12 = 0
        L78:
            X.0lVd r0 = r14.LLILLJJLI     // Catch: java.lang.Throwable -> Lb5
            int r13 = r0.getType()     // Catch: java.lang.Throwable -> Lb5
            r14.LL = r2     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r15 = r9.requestRepostFeedEntranceInfo(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> Lb5
            if (r15 != r5) goto L8d
            X.C1C7U.LIZIZ(r8)
            return r5
        L8a:
            X.C155000ia.LIZIZ(r15)     // Catch: java.lang.Throwable -> Lb5
        L8d:
            com.ss.android.ugc.aweme.repostfeed.model.RepostFeedEntranceResponse r15 = (com.ss.android.ugc.aweme.repostfeed.model.RepostFeedEntranceResponse) r15     // Catch: java.lang.Throwable -> Lb5
            kotlin.Pair r0 = X.C1360620lVk.LIZ(r15)     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r4 = r0.getFirst()     // Catch: java.lang.Throwable -> Lb5
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r3 = r0.getSecond()     // Catch: java.lang.Throwable -> Lb5
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> Lb5
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Throwable -> Lb5
            X.08pq r2 = X.C2107308Nj.LIZ     // Catch: java.lang.Throwable -> Lb5
            X.0lVm r1 = new X.0lVm     // Catch: java.lang.Throwable -> Lb5
            r0 = 0
            r1.<init>(r15, r4, r3, r0)     // Catch: java.lang.Throwable -> Lb5
            r14.LL = r6     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r0 = X.C23250099c.LJI(r14, r2, r1)     // Catch: java.lang.Throwable -> Lb5
            if (r0 != r5) goto Lb9
            X.C1C7U.LIZIZ(r8)
            return r5
        Lb5:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lb9:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1360630lVl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
