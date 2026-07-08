package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Ku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.checker.us.combinedsku.UsCombinedSkuSnsPeriodChecker$check$1", f = "UsCombinedSkuSnsPeriodChecker.kt", l = {}, m = "invokeSuspend")
public final class C826603Ku extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C03IS LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C826603Ku(C03IS c03is, String str, String str2, InterfaceC1364105Vn<? super C826603Ku> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c03is;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C826603Ku(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UsCombinedSkuSnsPeriodChecker@5dcc.check$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LL.LIZ;
        orderSubmitAssemViewModel.c0 = true;
        OrderSubmitAssemViewModel.YS2(orderSubmitAssemViewModel, "sns_module", null, null, 12);
        C03O0 c03o0 = C03O0.LIZ;
        String str = this.LLILLJJLI;
        C03IS c03is = this.LL;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = c03is.LIZ;
        String str2 = this.LLILLL;
        OspBottomViewModel ospBottomViewModel = c03is.LIZIZ;
        c03o0.getClass();
        C03O0.LLFZ(str, orderSubmitAssemViewModel2, str2, ospBottomViewModel, null, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UsCombinedSkuSnsPeriodChecker@5dcc.check$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
