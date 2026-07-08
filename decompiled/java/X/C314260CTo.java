package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.goody_bag.GetGoodyBagLotteryResponse;

/* JADX INFO: renamed from: X.0CTo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.goodybag.presenter.GoodyBagPresenter$audienceOpenWinnerPage$2$1", f = "GoodyBagPresenter.kt", l = {}, m = "invokeSuspend")
public final class C314260CTo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1104590eqn LL;
    public final /* synthetic */ GetGoodyBagLotteryResponse.ResponseData LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314260CTo(C1104590eqn c1104590eqn, GetGoodyBagLotteryResponse.ResponseData responseData, InterfaceC1364105Vn<? super C314260CTo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1104590eqn;
        this.LLILLJJLI = responseData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314260CTo(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GoodyBagPresenter@6f83.audienceOpenWinnerPage$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1104610eqp interfaceC1104610eqp = this.LL.LIZIZ;
        if (interfaceC1104610eqp != null) {
            interfaceC1104610eqp.D0(this.LLILLJJLI);
        }
        this.LL.LJIIZILJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GoodyBagPresenter@6f83.audienceOpenWinnerPage$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
