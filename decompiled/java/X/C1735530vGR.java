package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vGR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.AbsUsECLiveExplanationCardWidget$onMessage$2", f = "AbsUsECLiveExplanationCardWidget.kt", l = {}, m = "invokeSuspend")
public final class C1735530vGR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC21194117wp LL;
    public final /* synthetic */ IMessage LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1735530vGR(AbstractC21194117wp abstractC21194117wp, IMessage iMessage, InterfaceC1364105Vn<? super C1735530vGR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC21194117wp;
        this.LLILLJJLI = iMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1735530vGR(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbsUsECLiveExplanationCardWidget@dce0.onMessage$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC21194117wp abstractC21194117wp = this.LL;
        ECommerceMessage eCommerceMessage = (ECommerceMessage) this.LLILLJJLI;
        AbstractC21194117wp.LJJLI(abstractC21194117wp, false, eCommerceMessage, null, false, C2286608xc.LJ(eCommerceMessage.cardType), 12);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsUsECLiveExplanationCardWidget@dce0.onMessage$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
