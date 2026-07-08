package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03fh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess$payResultProcess$deferred$1", f = "PaymentResultProcess.kt", l = {2733}, m = "invokeSuspend")
public final class C901503fh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super n>, Object> {
    public int LL;
    public final /* synthetic */ C897703f5 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C901503fh(C897703f5 c897703f5, InterfaceC1364105Vn<? super C901503fh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c897703f5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C901503fh(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentResultProcess@6ad4.payResultProcess$deferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C877403bo c877403bo = PaymentApi.LIZ;
            C897703f5 c897703f5 = this.LLILLJJLI;
            this.LL = 1;
            obj = c877403bo.LJFF(c897703f5, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PaymentResultProcess@6ad4.payResultProcess$deferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PaymentResultProcess@6ad4.payResultProcess$deferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super n> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
