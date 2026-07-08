package X;

import com.ss.android.ugc.aweme.pipo.cashier.refund.cashier.RefundCashierViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uZn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.refund.cashier.RefundCashierViewModel$requestCashierBasicInfo$2$2", f = "RefundCashierViewModel.kt", l = {77, 104, 119, 136, 153}, m = "invokeSuspend")
public final class C1709090uZn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public RefundCashierViewModel LL;
    public C1709110uZp LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ RefundCashierViewModel LLILZ;
    public final /* synthetic */ C1709110uZp LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1709090uZn(RefundCashierViewModel refundCashierViewModel, C1709110uZp c1709110uZp, InterfaceC1364105Vn<? super C1709090uZn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = refundCashierViewModel;
        this.LLILZIL = c1709110uZp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1709090uZn(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0144 A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:60:0x01ab, B:51:0x0129, B:54:0x0144, B:57:0x0178), top: B:83:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cb  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1709090uZn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
