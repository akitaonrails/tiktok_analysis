package X;

import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03hm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PayAuthHelper$initMerchantUserId$1", f = "PayAuthHelper.kt", l = {96, 97}, m = "invokeSuspend")
public final class C914403hm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914403hm(String str, InterfaceC1364105Vn<? super C914403hm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C914403hm(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PayAuthHelper@fb88.initMerchantUserId$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PayAuthHelper@fb88.initMerchantUserId$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C914303hl c914303hl = C914303hl.LIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            c914303hl.getClass();
            obj = C914303hl.LIZ(str, false, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PayAuthHelper@fb88.initMerchantUserId$1");
                return objLJFF;
            }
        }
        PaymentData paymentData = (PaymentData) obj;
        if (paymentData != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C914503hn c914503hn = new C914503hn(paymentData, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c914503hn) == objLJFF) {
                C1C7U.LIZIZ("PayAuthHelper@fb88.initMerchantUserId$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PayAuthHelper@fb88.initMerchantUserId$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
