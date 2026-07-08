package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MiniOspPayResultMsg;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Lt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.pollorder.SeaMiniOSPPollController$onPaymentResultCallback$4", f = "SeaMiniOSPPollController.kt", l = {}, m = "invokeSuspend")
public final class C829103Lt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C829203Lu LL;
    public final /* synthetic */ MiniOspPayResultMsg LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C829103Lt(C829203Lu c829203Lu, MiniOspPayResultMsg miniOspPayResultMsg, InterfaceC1364105Vn<? super C829103Lt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c829203Lu;
        this.LLILLJJLI = miniOspPayResultMsg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C829103Lt(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("SeaMiniOSPPollController@f9d9.onPaymentResultCallback$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C829203Lu c829203Lu = this.LL;
        MiniOspPayResultMsg miniOspPayResultMsg = this.LLILLJJLI;
        if (miniOspPayResultMsg != null) {
            str = miniOspPayResultMsg.errorMessage;
        } else {
            str = null;
        }
        C829203Lu.LJIIJJI(c829203Lu, 3, str, false, 4);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaMiniOSPPollController@f9d9.onPaymentResultCallback$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
