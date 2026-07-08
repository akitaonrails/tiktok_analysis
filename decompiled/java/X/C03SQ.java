package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03SQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.PaymentPricingHelper$getPaymentDiscountAndServiceFeePromotionLink$4$1", f = "PaymentPricingHelper.kt", l = {1619}, m = "invokeSuspend")
public final class C03SQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C914303hl LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<String, Unit> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C259800zU<String> LLIZ;
    public final /* synthetic */ List<Object> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C03SQ(String str, Function1<? super String, Unit> function1, String str2, String str3, C259800zU<String> c259800zU, List<Object> list, InterfaceC1364105Vn<? super C03SQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = function1;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = c259800zU;
        this.LLIZLLLIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03SQ(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C914303hl c914303hl;
        n nVar;
        Type type;
        C1C7U.LIZ("PaymentPricingHelper@c559.getPaymentDiscountAndServiceFeePromotionLink$4$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        boolean z = false;
        if (i != 0) {
            if (i == 1) {
                c914303hl = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c914303hl = C914303hl.LIZ;
            String str = this.LLILLL;
            this.LL = c914303hl;
            this.LLILLJJLI = 1;
            c914303hl.getClass();
            obj = C914303hl.LIZ(str, false, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PaymentPricingHelper@c559.getPaymentDiscountAndServiceFeePromotionLink$4$1");
                return objLJFF;
            }
        }
        PaymentData paymentData = (PaymentData) obj;
        Cashier cashier = null;
        if (paymentData != null && (nVar = paymentData.cashier) != null) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    z = true;
                }
                if (!z) {
                    type = new TypeToken<Cashier>() { // from class: X.03SR
                    }.getType();
                } else {
                    type = C2371409Qy.LIZJ(C13LE.LJII(Cashier.class));
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, nVar, type);
                if (!(objFromJson instanceof Cashier)) {
                    objFromJson = null;
                }
                cashier = (Cashier) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        c914303hl.getClass();
        C914303hl.LIZIZ = cashier;
        Function1<String, Unit> function1 = this.LLILZ;
        if (function1 != null) {
            C902403fq c902403fq = C902403fq.LIZ;
            String str2 = this.LLILZIL;
            String str3 = this.LLILZLL;
            C914303hl.LIZ.getClass();
            Cashier cashier2 = C914303hl.LIZIZ;
            String str4 = this.LLIZ.element;
            String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(this.LLIZLLLIL);
            c902403fq.getClass();
            function1.invoke(C902403fq.LIZ(str2, str3, cashier2, str4, 0, strLJIIIIZZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentPricingHelper@c559.getPaymentDiscountAndServiceFeePromotionLink$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
