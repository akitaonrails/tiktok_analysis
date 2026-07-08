package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;

/* JADX INFO: renamed from: X.03OB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel", f = "OrderSubmitAssemViewModel.kt", l = {2942, 2991}, m = "updateBillInfoData")
public final class C03OB extends AbstractC23140094w {
    public BillInfoData LL;
    public BillInfoRequest LLILLJJLI;
    public ChangeInfo LLILLL;
    public BillInfoData LLILZ;
    public C259800zU LLILZIL;
    public C752702wn LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public /* synthetic */ Object LLJJ;
    public final /* synthetic */ OrderSubmitAssemViewModel LLJJI;
    public int LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03OB(OrderSubmitAssemViewModel orderSubmitAssemViewModel, InterfaceC1364105Vn<? super C03OB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJJI = orderSubmitAssemViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderSubmitAssemViewModel@f79d.updateBillInfoData$1");
        this.LLJJ = obj;
        this.LLJJIII |= Integer.MIN_VALUE;
        Object objXT2 = this.LLJJI.xT2(null, null, false, false, false, null, false, this);
        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.updateBillInfoData$1");
        return objXT2;
    }
}
