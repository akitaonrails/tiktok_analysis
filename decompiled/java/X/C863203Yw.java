package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Yw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel$refresh$2", f = "PaymentViewModel.kt", l = {1275}, m = "invokeSuspend")
public final class C863203Yw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PaymentViewModel LLILLL;
    public final /* synthetic */ ChangeInfo LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863203Yw(PaymentViewModel paymentViewModel, ChangeInfo changeInfo, InterfaceC1364105Vn<? super C863203Yw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = paymentViewModel;
        this.LLILZ = changeInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C863203Yw c863203Yw = new C863203Yw(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c863203Yw.LLILLJJLI = obj;
        return c863203Yw;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #1 {all -> 0x0058, blocks: (B:15:0x003c, B:16:0x003f, B:19:0x0045), top: B:34:0x003c }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "PaymentViewModel@e450.refresh$2"
            X.C1C7U.LIZ(r7)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r8.LL
            r6 = 2
            r2 = 1
            r5 = 0
            if (r0 == 0) goto L1f
            if (r0 != r2) goto L17
            java.lang.Object r4 = r8.LLILLJJLI
            X.01wk r4 = (X.InterfaceC497601wk) r4
            goto L3c
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1f:
            X.C155000ia.LIZIZ(r9)
            java.lang.Object r4 = r8.LLILLJJLI
            X.01wk r4 = (X.InterfaceC497601wk) r4
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r0 = r8.LLILLL     // Catch: java.lang.Throwable -> L5a
            kotlin.jvm.functions.Function2<? super com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo, ? super X.05Vn<? super X.03Qx>, ? extends java.lang.Object> r1 = r0.LLJJJJ     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L42
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo r0 = r8.LLILZ     // Catch: java.lang.Throwable -> L5a
            r8.LLILLJJLI = r4     // Catch: java.lang.Throwable -> L5a
            r8.LL = r2     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r9 = r1.invoke(r0, r8)     // Catch: java.lang.Throwable -> L5a
            if (r9 != r3) goto L3f
            X.C1C7U.LIZIZ(r7)
            return r3
        L3c:
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Throwable -> L58
        L3f:
            X.03Qx r9 = (X.C842503Qx) r9     // Catch: java.lang.Throwable -> L58
            goto L43
        L42:
            r9 = r5
        L43:
            if (r9 == 0) goto L7c
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r2 = r8.LLILLL     // Catch: java.lang.Throwable -> L58
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Throwable -> L58
            X.08pq r0 = X.C2107308Nj.LIZ     // Catch: java.lang.Throwable -> L58
            X.08pq r1 = r0.LLIILII()     // Catch: java.lang.Throwable -> L58
            X.03Yv r0 = new X.03Yv     // Catch: java.lang.Throwable -> L58
            r0.<init>(r9, r2, r9, r5)     // Catch: java.lang.Throwable -> L58
            X.C23250099c.LIZLLL(r4, r1, r5, r0, r6)     // Catch: java.lang.Throwable -> L58
            goto L7c
        L58:
            r0 = move-exception
            goto L5b
        L5a:
            r0 = move-exception
        L5b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L94
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Throwable -> L94
            X.08pq r3 = X.C2107308Nj.LIZ     // Catch: java.lang.Throwable -> L94
            X.08pq r2 = r3.LLIILII()     // Catch: java.lang.Throwable -> L94
            X.03Yx r1 = new X.03Yx     // Catch: java.lang.Throwable -> L94
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r0 = r8.LLILLL     // Catch: java.lang.Throwable -> L94
            r1.<init>(r0, r5)     // Catch: java.lang.Throwable -> L94
            X.C23250099c.LIZLLL(r4, r2, r5, r1, r6)     // Catch: java.lang.Throwable -> L94
            X.08pq r2 = r3.LLIILII()
            X.03Yy r1 = new X.03Yy
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r0 = r8.LLILLL
            r1.<init>(r0, r5)
            goto L8b
        L7c:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.08pq r2 = r0.LLIILII()
            X.03Yy r1 = new X.03Yy
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r0 = r8.LLILLL
            r1.<init>(r0, r5)
        L8b:
            X.C23250099c.LIZLLL(r4, r2, r5, r1, r6)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L94:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L94
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.08pq r2 = r0.LLIILII()
            X.03Yy r1 = new X.03Yy
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r0 = r8.LLILLL
            r1.<init>(r0, r5)
            X.C23250099c.LIZLLL(r4, r2, r5, r1, r6)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C863203Yw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
