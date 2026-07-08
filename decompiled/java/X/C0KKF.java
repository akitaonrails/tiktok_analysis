package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KKF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.payment.v2.implement.productfetch.SubscribeProductFetchStrategy$fetchProduct$1$1", f = "SubscribeProductFetchStrategy.kt", l = {BaseNotice.RECOMMEND_LIVE, 52}, m = "invokeSuspend")
public final class C0KKF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0KJX LLILLJJLI;
    public final /* synthetic */ C0KKD LLILLL;
    public final /* synthetic */ InterfaceC509200Jy2 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KKF(C0KJX c0kjx, C0KKD c0kkd, InterfaceC509200Jy2 interfaceC509200Jy2, InterfaceC1364105Vn<? super C0KKF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0kjx;
        this.LLILLL = c0kkd;
        this.LLILZ = interfaceC509200Jy2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0KKF(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r5 = "SubscribeProductFetchStrategy@a4a2.fetchProduct$1$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 0
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 == r1) goto L5e
            if (r0 != r2) goto L6f
            X.C155000ia.LIZIZ(r7)
        L17:
            java.lang.String r7 = (java.lang.String) r7
            int r0 = r7.length()
            if (r0 != 0) goto L24
            java.lang.String r0 = "Failed to get valid currency_code for tpl_list api"
            X.C20441214yg.LIZ(r0)
        L24:
            X.0KJX r0 = r6.LLILLJJLI
            r0.LJIIJJI = r7
            X.0KKD r1 = r6.LLILLL
            X.0Jy2 r0 = r6.LLILZ
            X.C0KKD.LJI(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L35:
            X.C155000ia.LIZIZ(r7)
            X.0KJX r0 = r6.LLILLJJLI
            boolean r0 = r0.LJI
            if (r0 == 0) goto L61
            X.0KKD r0 = r6.LLILLL
            r6.LL = r1
            r0.getClass()
            X.1DFB r1 = X.C0PEM.LIZJ
            X.0KKX r0 = new X.0KKX
            r0.<init>(r3)
            java.lang.Object r1 = X.C23250099c.LJI(r6, r1, r0)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L58
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L58:
            if (r1 != r4) goto L61
            X.C1C7U.LIZIZ(r5)
            return r4
        L5e:
            X.C155000ia.LIZIZ(r7)
        L61:
            X.0KKY r0 = X.C0KKY.LIZ
            r6.LL = r2
            java.lang.Object r7 = r0.LIZIZ(r6, r3)
            if (r7 != r4) goto L17
            X.C1C7U.LIZIZ(r5)
            return r4
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KKF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
