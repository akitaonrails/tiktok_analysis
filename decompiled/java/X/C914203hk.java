package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03hk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PayAuthHelper$startLoopInner$1", f = "PayAuthHelper.kt", l = {78}, m = "invokeSuspend")
public final class C914203hk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914203hk(String str, InterfaceC1364105Vn<? super C914203hk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C914203hk(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004f -> B:6:0x0013). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "PayAuthHelper@fb88.startLoopInner$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 1
            if (r0 == 0) goto L59
            if (r0 != r4) goto L63
            X.C155000ia.LIZIZ(r8)
        L13:
            X.03hl r1 = X.C914303hl.LIZ
            java.lang.String r0 = r7.LLILLJJLI
            r1.getClass()
            X.C914303hl.LJ(r0)
        L1d:
            X.03hl r0 = X.C914303hl.LIZ
            r0.getClass()
            java.util.concurrent.CopyOnWriteArraySet<java.lang.Integer> r0 = X.C914303hl.LIZJ
            int r0 = r0.size()
            if (r0 <= 0) goto L5d
            com.bytedance.ies.abmock.SettingsManager r3 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.core.ab.EcomPayAuthNonceRefreshSettings$PayAuthNonceRefreshConfig> r2 = com.ss.android.ugc.aweme.ecommerce.core.ab.EcomPayAuthNonceRefreshSettings.PayAuthNonceRefreshConfig.class
            com.ss.android.ugc.aweme.ecommerce.core.ab.EcomPayAuthNonceRefreshSettings$PayAuthNonceRefreshConfig r1 = com.ss.android.ugc.aweme.ecommerce.core.ab.EcomPayAuthNonceRefreshSettings.LIZ
            java.lang.String r0 = "ecom_pay_auth_nonce_refresh_config"
            java.lang.Object r0 = r3.LJIIIIZZ(r0, r2, r1)
            com.ss.android.ugc.aweme.ecommerce.core.ab.EcomPayAuthNonceRefreshSettings$PayAuthNonceRefreshConfig r0 = (com.ss.android.ugc.aweme.ecommerce.core.ab.EcomPayAuthNonceRefreshSettings.PayAuthNonceRefreshConfig) r0
            if (r0 == 0) goto L3d
            r1 = r0
        L3d:
            boolean r0 = r1.enable
            if (r0 == 0) goto L55
            int r0 = r1.refreshIntervalSeconds
            if (r0 <= 0) goto L55
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
        L49:
            r7.LL = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r7)
            if (r0 != r5) goto L13
            X.C1C7U.LIZIZ(r6)
            return r5
        L55:
            r2 = 300000(0x493e0, double:1.482197E-318)
            goto L49
        L59:
            X.C155000ia.LIZIZ(r8)
            goto L1d
        L5d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C914203hk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
