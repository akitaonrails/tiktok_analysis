package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01WO, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.AbsECLiveExplanationCardWidget$onMessage$3", f = "AbsECLiveExplanationCardWidget.kt", l = {}, m = "invokeSuspend")
public final class C01WO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC21194217wq LL;
    public final /* synthetic */ IMessage LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01WO(AbstractC21194217wq abstractC21194217wq, IMessage iMessage, InterfaceC1364105Vn<? super C01WO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC21194217wq;
        this.LLILLJJLI = iMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01WO(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbsECLiveExplanationCardWidget@7dc4.onMessage$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC21194217wq abstractC21194217wq = this.LL;
        ECommerceMessage eCommerceMessage = (ECommerceMessage) this.LLILLJJLI;
        AbstractC21194217wq.LJJL(abstractC21194217wq, false, eCommerceMessage, false, C2286608xc.LJ(eCommerceMessage.cardType), 4);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsECLiveExplanationCardWidget@7dc4.onMessage$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
