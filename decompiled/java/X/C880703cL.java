package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MembershipPreCheckPaymentRiskRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MembershipPreCheckPaymentRiskResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03cL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MembershipCashierHelper$preCheckPaymentRisk$response$1$1", f = "MembershipCashierHelper.kt", l = {268}, m = "invokeSuspend")
public final class C880703cL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Response<MembershipPreCheckPaymentRiskResponse>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C880703cL(String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C880703cL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C880703cL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MembershipCashierHelper@3530.preCheckPaymentRisk$response$1$1");
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
            MembershipPreCheckPaymentRiskRequest membershipPreCheckPaymentRiskRequest = new MembershipPreCheckPaymentRiskRequest(this.LLILLJJLI, this.LLILLL, this.LLILZ, UUID.randomUUID().toString(), this.LLILZIL);
            this.LL = 1;
            c877403bo.getClass();
            obj = ((PaymentApi) C877403bo.LIZIZ.create(PaymentApi.class)).LJIIL(membershipPreCheckPaymentRiskRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MembershipCashierHelper@3530.preCheckPaymentRisk$response$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MembershipCashierHelper@3530.preCheckPaymentRisk$response$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Response<MembershipPreCheckPaymentRiskResponse>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
