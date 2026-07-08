package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKContainerController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wDP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKPageDataOperator$onRefreshFinish$1", f = "ECMMKDataOperator.kt", l = {}, m = "invokeSuspend")
public final class C1772090wDP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C1772620wEG LLILLJJLI;
    public final /* synthetic */ AbstractC1772230wDd LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1772090wDP(boolean z, C1772620wEG c1772620wEG, AbstractC1772230wDd abstractC1772230wDd, InterfaceC1364105Vn<? super C1772090wDP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c1772620wEG;
        this.LLILLL = abstractC1772230wDd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1772090wDP(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC606320NqI interfaceC606320NqI;
        C1C7U.LIZ("ECMMKPageDataOperator@9a61.onRefreshFinish$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC606320NqI interfaceC606320NqI2 = null;
        if (this.LL) {
            ECMMKContainerController eCMMKContainerController = this.LLILLJJLI.LIZIZ.LLILLL;
            if (eCMMKContainerController != null) {
                interfaceC606320NqI = eCMMKContainerController.LLILZIL;
            } else {
                interfaceC606320NqI = null;
            }
            C1772080wDO.LIZ(interfaceC606320NqI, this.LLILLL);
        }
        ECMMKContainerController eCMMKContainerController2 = this.LLILLJJLI.LIZIZ.LLILLL;
        if (eCMMKContainerController2 != null) {
            interfaceC606320NqI2 = eCMMKContainerController2.LLILZIL;
        }
        C1772080wDO.LIZIZ(interfaceC606320NqI2, this.LLILLL, this.LL, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECMMKPageDataOperator@9a61.onRefreshFinish$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
