package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MiniOspPayResultMsg;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Lp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.pollorder.USMiniOSPPollController$onPaymentResultCallback$3", f = "USMiniOSPPollController.kt", l = {}, m = "invokeSuspend")
public final class C828703Lp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C828803Lq LL;
    public final /* synthetic */ MiniOspPayResultMsg LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C828703Lp(C828803Lq c828803Lq, MiniOspPayResultMsg miniOspPayResultMsg, InterfaceC1364105Vn<? super C828703Lp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c828803Lq;
        this.LLILLJJLI = miniOspPayResultMsg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C828703Lp(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r6 = "USMiniOSPPollController@17d9.onPaymentResultCallback$3"
            X.C1C7U.LIZ(r6)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r14)
            X.03Lq r2 = r13.LL
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MiniOspPayResultMsg r4 = r13.LLILLJJLI
            r2.LIZIZ()
            boolean r0 = X.C034S.LIZ()
            r5 = 0
            if (r0 == 0) goto La3
            X.04Zw r0 = X.C1120604Zw.LIZ
            r0.LIZ()
            long r7 = android.os.SystemClock.elapsedRealtime()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService> r0 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class
            java.lang.Object r1 = r1.getService(r0)
            com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService r1 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r1
            if (r1 == 0) goto La1
            r12 = 1
        L31:
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService> r0 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class
            java.lang.String r10 = r0.getName()
            r9 = 1
            if (r1 == 0) goto L9f
            java.lang.Class r0 = r1.getClass()
            java.lang.String r11 = r0.getName()
        L42:
            X.C1AQS.LIZJ(r7, r9, r10, r11, r12)
        L45:
            com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService r1 = (com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService) r1
            X.03hK r0 = r1.getRootPageMonitor()
            if (r0 == 0) goto L99
            X.03jz r0 = r0.LIZJ()
            if (r0 == 0) goto L99
            android.content.Context r0 = r0.LIZ
            if (r0 == 0) goto L99
            android.app.Activity r1 = X.C1388190mED.LIZ(r0)
            if (r1 == 0) goto L99
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspActivity
            if (r0 == 0) goto L99
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L99
            X.0mTM r3 = new X.0mTM
            r3.<init>(r1)
            r3.LJII = r5
            if (r4 == 0) goto L7b
            java.lang.String r0 = r4.errorTitle
            if (r0 == 0) goto L77
            r3.LJI(r0)
        L77:
            java.lang.String r0 = r4.errorMessage
            if (r0 != 0) goto L82
        L7b:
            r0 = 2131832545(0x7f112ee1, float:1.9298147E38)
            java.lang.String r0 = r1.getString(r0)
        L82:
            r3.LIZIZ(r0)
            kotlin.jvm.internal.AwS580S0100000_1 r1 = new kotlin.jvm.internal.AwS580S0100000_1
            r0 = 861(0x35d, float:1.207E-42)
            r1.<init>(r2, r0)
            X.C1238130iKB.LIZ(r3, r1)
            X.0mTF r0 = new X.0mTF
            r0.<init>(r3)
            r2.LJIIIZ = r0
            r0.LIZLLL()
        L99:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L9f:
            r11 = 0
            goto L42
        La1:
            r12 = 0
            goto L31
        La3:
            X.04Zw r0 = X.C1120604Zw.LIZ
            r0.LIZ()
            X.04aq r1 = X.C1120604Zw.LIZJ
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService> r0 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class
            X.0317 r1 = r1.LIZLLL(r0)
            com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService r1 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r1
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C828703Lp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
