package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Wd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.jsb.impl.PipoGetNonceMethod$handle$1", f = "PipoGetNonceMethod.kt", l = {28, 30, 41}, m = "invokeSuspend")
public final class C2384909Wd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ CompletionBlock<InterfaceC2384709Wb> LLILLL;
    public final /* synthetic */ C09WY LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2384909Wd(CompletionBlock<InterfaceC2384709Wb> completionBlock, C09WY c09wy, InterfaceC1364105Vn<? super C2384909Wd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = completionBlock;
        this.LLILZ = c09wy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2384909Wd c2384909Wd = new C2384909Wd(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c2384909Wd.LLILLJJLI = obj;
        return c2384909Wd;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "PipoGetNonceMethod@ac4a.handle$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r11.LL
            r3 = 3
            r8 = 2
            r9 = 0
            r5 = 1
            if (r0 == 0) goto L1f
            if (r0 == r5) goto L39
            if (r0 == r8) goto Lb9
            if (r0 == r3) goto Lb9
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1f:
            X.C155000ia.LIZIZ(r12)
            java.lang.Object r7 = r11.LLILLJJLI
            X.03hl r0 = X.C914303hl.LIZ
            r11.LLILLJJLI = r7
            r11.LL = r5
            r0.getClass()
            java.lang.String r0 = "pipo getNonce jsb"
            java.lang.Object r12 = X.C914303hl.LIZ(r0, r9, r11)
            if (r12 != r4) goto L3e
            X.C1C7U.LIZIZ(r10)
            return r4
        L39:
            java.lang.Object r7 = r11.LLILLJJLI
            X.C155000ia.LIZIZ(r12)
        L3e:
            com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData r12 = (com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData) r12
            r6 = 0
            if (r12 == 0) goto La0
            com.google.gson.n r2 = r12.cashier
            if (r2 == 0) goto La0
            com.google.gson.Gson r1 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L7e
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L7e
            r0.getClass()     // Catch: com.google.gson.s -> L7e
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L7e
            if (r0 == 0) goto L5b
            boolean r0 = r0.LJII     // Catch: com.google.gson.s -> L7e
            if (r0 != r5) goto L5b
            r9 = 1
        L5b:
            if (r9 == 0) goto L5e
            goto L68
        L5e:
            X.09Wf r0 = new X.09Wf     // Catch: com.google.gson.s -> L7e
            r0.<init>()     // Catch: com.google.gson.s -> L7e
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L7e
            goto L72
        L68:
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier> r0 = com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L7e
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L7e
        L72:
            java.lang.Object r5 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r2, r0)     // Catch: com.google.gson.s -> L7e
            boolean r0 = r5 instanceof com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier     // Catch: com.google.gson.s -> L7e
            if (r0 != 0) goto L7b
            r5 = r6
        L7b:
            com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier r5 = (com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier) r5     // Catch: com.google.gson.s -> L7e
            goto L83
        L7e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r5 = r6
        L83:
            if (r5 == 0) goto La0
            com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.09Wb> r3 = r11.LLILLL
            X.09WY r2 = r11.LLILZ
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.09Wc r0 = new X.09Wc
            r0.<init>(r3, r2, r5, r6)
            r11.LLILLJJLI = r7
            r11.LL = r8
            java.lang.Object r0 = X.C23250099c.LJI(r11, r1, r0)
            if (r0 != r4) goto Lbc
            X.C1C7U.LIZIZ(r10)
            return r4
        La0:
            com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.09Wb> r2 = r11.LLILLL
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.09We r0 = new X.09We
            r0.<init>(r2, r6)
            r11.LLILLJJLI = r6
            r11.LL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r11, r1, r0)
            if (r0 != r4) goto Lbc
            X.C1C7U.LIZIZ(r10)
            return r4
        Lb9:
            X.C155000ia.LIZIZ(r12)
        Lbc:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2384909Wd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
