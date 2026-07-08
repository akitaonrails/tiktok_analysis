package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS86S1200000_1;
import njp.a;

/* JADX INFO: renamed from: X.03L0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel$templateChangeCheck$2", f = "OrderSubmitAssemViewModel.kt", l = {}, m = "invokeSuspend")
public final class C03L0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILLJJLI;
    public final /* synthetic */ BillInfoData LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03L0(String str, OrderSubmitAssemViewModel orderSubmitAssemViewModel, BillInfoData billInfoData, InterfaceC1364105Vn<? super C03L0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = orderSubmitAssemViewModel;
        this.LLILLL = billInfoData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03L0(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderSubmitAssemViewModel@f79d.templateChangeCheck$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C04CK c04ck = new C04CK() { // from class: X.048Q
            @Override // X.AbstractC1748790vbp
            public final C1748850vbv LIZ() {
                return new C1748850vbv(new C1748840vbu("page_name", new C1747940vaS[0]), new C1748840vbu("region", new C1747940vaS[0]), new C1748840vbu("cache_template", new C1747940vaS[0]), new C1748840vbu("server_template", new C1747940vaS[0]), new C1748840vbu("page_biz_list", new C1747940vaS[0]));
            }
        };
        c04ck.LJIIIIZZ(new AwS86S1200000_1(this.LL, this.LLILLJJLI, this.LLILLL, 6));
        c04ck.LIZJ(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.templateChangeCheck$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
