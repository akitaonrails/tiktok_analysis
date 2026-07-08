package X;

import com.ss.android.ugc.aweme.minis.payment.qcpx.MinisCouponViewModel;

/* JADX INFO: renamed from: X.0CWW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.payment.qcpx.MinisCouponViewModel", f = "MinisCouponViewModel.kt", l = {92, 95}, m = "checkQCPX")
public final class C0CWW extends AbstractC23140094w {
    public C1233160iCA LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MinisCouponViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CWW(MinisCouponViewModel minisCouponViewModel, InterfaceC1364105Vn<? super C0CWW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = minisCouponViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisCouponViewModel@376a.checkQCPX$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLL.wQ2(this);
        C1C7U.LIZIZ("MinisCouponViewModel@376a.checkQCPX$1");
        return objWQ2;
    }
}
