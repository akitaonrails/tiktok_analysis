package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.03Kx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.utils.OspCreateOrderManager$handleCreateOrderResultForMini$8$1$1", f = "OspCreateOrderManager.kt", l = {}, m = "invokeSuspend")
public final class C826903Kx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MiniOspViewModel LL;
    public final /* synthetic */ CreateOrderData LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C826903Kx(MiniOspViewModel miniOspViewModel, CreateOrderData createOrderData, InterfaceC1364105Vn<? super C826903Kx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = miniOspViewModel;
        this.LLILLJJLI = createOrderData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C826903Kx(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OspCreateOrderManager@b17e.handleCreateOrderResultForMini$8$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(new AwS580S0100000_1(this.LLILLJJLI, 984));
        if (C897103ez.LIZ()) {
            this.LL.setState(AFwS228S0000000_1.get$arr$(898));
        } else {
            this.LL.setState(AFwS228S0000000_1.get$arr$(899));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OspCreateOrderManager@b17e.handleCreateOrderResultForMini$8$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
