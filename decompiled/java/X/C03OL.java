package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;

/* JADX INFO: renamed from: X.03OL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel", f = "MiniOspViewModel.kt", l = {985}, m = "checkAndUpdateBillInfoDataNormal")
public final class C03OL extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MiniOspViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03OL(MiniOspViewModel miniOspViewModel, InterfaceC1364105Vn<? super C03OL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = miniOspViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MiniOspViewModel@8f4.checkAndUpdateBillInfoDataNormal$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILLJJLI.BQ2(null, null, false, null, this);
        C1C7U.LIZIZ("MiniOspViewModel@8f4.checkAndUpdateBillInfoDataNormal$1");
        return objBQ2;
    }
}
