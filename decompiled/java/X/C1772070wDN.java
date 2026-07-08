package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKContainerController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wDN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKPageDataOperator$onChunkRefreshFinish$1", f = "ECMMKDataOperator.kt", l = {}, m = "invokeSuspend")
public final class C1772070wDN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1772620wEG LL;
    public final /* synthetic */ AbstractC1772230wDd LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1772070wDN(C1772620wEG c1772620wEG, AbstractC1772230wDd abstractC1772230wDd, InterfaceC1364105Vn<? super C1772070wDN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1772620wEG;
        this.LLILLJJLI = abstractC1772230wDd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1772070wDN(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC606320NqI interfaceC606320NqI;
        C1C7U.LIZ("ECMMKPageDataOperator@9a61.onChunkRefreshFinish$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ECMMKContainerController eCMMKContainerController = this.LL.LIZIZ.LLILLL;
        InterfaceC606320NqI interfaceC606320NqI2 = null;
        if (eCMMKContainerController != null) {
            interfaceC606320NqI = eCMMKContainerController.LLILZIL;
        } else {
            interfaceC606320NqI = null;
        }
        C1772080wDO.LIZ(interfaceC606320NqI, this.LLILLJJLI);
        ECMMKContainerController eCMMKContainerController2 = this.LL.LIZIZ.LLILLL;
        if (eCMMKContainerController2 != null) {
            interfaceC606320NqI2 = eCMMKContainerController2.LLILZIL;
        }
        C1772080wDO.LIZIZ(interfaceC606320NqI2, this.LLILLJJLI, false, true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECMMKPageDataOperator@9a61.onChunkRefreshFinish$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
