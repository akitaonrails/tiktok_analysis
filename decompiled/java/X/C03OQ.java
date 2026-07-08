package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;

/* JADX INFO: renamed from: X.03OQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel", f = "MiniOspViewModel.kt", l = {3448}, m = "queryBillInfoSuspendForPaymentPage")
public final class C03OQ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MiniOspViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03OQ(MiniOspViewModel miniOspViewModel, InterfaceC1364105Vn<? super C03OQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = miniOspViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MiniOspViewModel@8f4.queryBillInfoSuspendForPaymentPage$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objFR2 = this.LLILLJJLI.fR2(null, this);
        C1C7U.LIZIZ("MiniOspViewModel@8f4.queryBillInfoSuspendForPaymentPage$1");
        return objFR2;
    }
}
