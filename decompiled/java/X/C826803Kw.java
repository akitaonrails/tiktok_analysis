package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.03Kw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.utils.OspCreateOrderManager$handleCreateOrderResultForHalf$10$1$1", f = "OspCreateOrderManager.kt", l = {}, m = "invokeSuspend")
public final class C826803Kw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ OrderSubmitAssemViewModel LL;
    public final /* synthetic */ CreateOrderData LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C826803Kw(OrderSubmitAssemViewModel orderSubmitAssemViewModel, CreateOrderData createOrderData, InterfaceC1364105Vn<? super C826803Kw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = orderSubmitAssemViewModel;
        this.LLILLJJLI = createOrderData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C826803Kw(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OspCreateOrderManager@b17e.handleCreateOrderResultForHalf$10$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(new AwS580S0100000_1(this.LLILLJJLI, 981));
        if (C897103ez.LIZ()) {
            this.LL.setState(AFwS228S0000000_1.get$arr$(882));
        } else {
            this.LL.setState(AFwS228S0000000_1.get$arr$(883));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OspCreateOrderManager@b17e.handleCreateOrderResultForHalf$10$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
