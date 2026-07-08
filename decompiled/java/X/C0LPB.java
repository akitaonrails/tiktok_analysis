package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LPB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.notify.route.AITheaterCastNotifyRouteProcessor$reconcileOnClick$1", f = "AITheaterCastNotifyRouteProcessor.kt", l = {66}, m = "invokeSuspend")
public final class C0LPB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LPB(String str, Boolean bool, InterfaceC1364105Vn<? super C0LPB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = bool;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0LPB c0lpb = new C0LPB(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0lpb.LLILLJJLI = obj;
        return c0lpb;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r5 = "AITheaterCastNotifyRouteProcessor@a969.reconcileOnClick$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r12.LL
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            if (r0 != r3) goto L12
            goto L33
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1a:
            X.C155000ia.LIZIZ(r13)
            java.lang.String r1 = r12.LLILLL
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r0 = X.C09BV.LIZ()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L31
            r12.LL = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r13 = r0.LIZJ(r1, r12)     // Catch: java.lang.Throwable -> L3c
            if (r13 != r4) goto L36
            X.C1C7U.LIZIZ(r5)
            return r4
        L31:
            r13 = r2
            goto L38
        L33:
            X.C155000ia.LIZIZ(r13)     // Catch: java.lang.Throwable -> L3c
        L36:
            X.0LSZ r13 = (X.C0LSZ) r13     // Catch: java.lang.Throwable -> L3c
        L38:
            X.C189200o6.m2constructorimpl(r13)     // Catch: java.lang.Throwable -> L3c
            goto L48
        L3c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r13 = new X.00Yq
            r13.<init>(r0)
            X.C189200o6.m2constructorimpl(r13)
        L48:
            boolean r0 = X.C189200o6.m7isFailureimpl(r13)
            if (r0 == 0) goto L4f
            r13 = r2
        L4f:
            X.0LSZ r13 = (X.C0LSZ) r13
            if (r13 == 0) goto L55
            java.lang.String r2 = r13.LJ
        L55:
            if (r2 != 0) goto L6a
            X.0LbE r10 = X.EnumC546020LbE.MISSING
        L59:
            X.0LQ4 r6 = X.C0LQ4.PUSH_CLICK
            java.lang.String r7 = r12.LLILLL
            java.lang.Boolean r8 = r12.LLILZ
            r9 = 0
            r11 = r9
            X.C546030LbF.LIZ(r6, r7, r8, r9, r10, r11)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L6a:
            java.lang.String r0 = "FINISHED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L75
            X.0LbE r10 = X.EnumC546020LbE.READY
            goto L59
        L75:
            java.lang.String r0 = "FAILED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L80
            X.0LbE r10 = X.EnumC546020LbE.FAILED
            goto L59
        L80:
            X.0LbE r10 = X.EnumC546020LbE.PROCESSING
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LPB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
