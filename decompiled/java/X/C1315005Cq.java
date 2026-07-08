package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Cq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.landing.LandMallProtocol$Companion$onMallNodeHide$1", f = "LandMallProtocol.kt", l = {171, 172}, m = "invokeSuspend")
public final class C1315005Cq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1315005Cq(InterfaceC1364105Vn<? super C1315005Cq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1315005Cq(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "LandMallProtocol$Companion@47b7.onMallNodeHide$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r11.LL
            r8 = 2
            r6 = 0
            r9 = 1
            if (r0 == 0) goto L1f
            if (r0 == r9) goto L44
            if (r0 != r8) goto L5d
            X.C155000ia.LIZIZ(r12)
        L17:
            com.ss.android.ugc.aweme.ecommerce.ug.landing.LandMallProtocol.LLILZ = r6
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L1f:
            X.C155000ia.LIZIZ(r12)
            com.ss.android.ugc.aweme.ecommerce.ug.landing.EcMallDefaultLandingShopTabAB$Config r0 = com.ss.android.ugc.aweme.ecommerce.ug.landing.EcMallDefaultLandingShopTabAB.LIZIZ
            int r0 = r0.leaveThreshold
            long r4 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = com.ss.android.ugc.aweme.ecommerce.ug.landing.LandMallProtocol.LLILZIL
            long r2 = r2 - r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L17
            X.05H2 r1 = com.ss.android.ugc.aweme.ecommerce.ug.landing.LandMallProtocol.LL
            r11.LL = r9
            r0 = 3
            java.lang.Object r0 = r1.LIZIZ(r0, r11)
            if (r0 != r7) goto L47
            X.C1C7U.LIZIZ(r10)
            return r7
        L44:
            X.C155000ia.LIZIZ(r12)
        L47:
            X.0956 r0 = com.ss.android.ugc.aweme.ecommerce.ug.landing.LandMallProtocol.LLILZLL
            if (r0 == 0) goto L4f
            r0.LIZIZ(r6)
            goto L17
        L4f:
            X.05H2 r0 = com.ss.android.ugc.aweme.ecommerce.ug.landing.LandMallProtocol.LL
            r11.LL = r8
            java.lang.Object r0 = r0.LIZ(r11)
            if (r0 != r7) goto L17
            X.C1C7U.LIZIZ(r10)
            return r7
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1315005Cq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1315005Cq(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
