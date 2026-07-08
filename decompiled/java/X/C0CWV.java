package X;

import com.ss.android.ugc.aweme.minis.payment.qcpx.MinisCouponViewModel;

/* JADX INFO: renamed from: X.0CWV, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.payment.qcpx.MinisCouponViewModel", f = "MinisCouponViewModel.kt", l = {68}, m = "checkEnablementListInner")
public final class C0CWV extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MinisCouponViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CWV(MinisCouponViewModel minisCouponViewModel, InterfaceC1364105Vn<? super C0CWV> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = minisCouponViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisCouponViewModel@376a.checkEnablementListInner$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.vQ2(this);
        C1C7U.LIZIZ("MinisCouponViewModel@376a.checkEnablementListInner$1");
        return objVQ2;
    }
}
