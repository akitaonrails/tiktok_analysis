package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentAppealHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03hX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentAppealHelper$handleAppealClick$1", f = "PaymentAppealHelper.kt", l = {252, 273}, m = "invokeSuspend")
public final class C912903hX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public SmartRoute LL;
    public int LLILLJJLI;
    public final /* synthetic */ PaymentMethod LLILLL;
    public final /* synthetic */ C05XL<Boolean> LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C05XL<Unit> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C912903hX(PaymentMethod paymentMethod, C05XL<Boolean> c05xl, Context context, String str, C05XL<Unit> c05xl2, String str2, String str3, String str4, InterfaceC1364105Vn<? super C912903hX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = paymentMethod;
        this.LLILZ = c05xl;
        this.LLILZIL = context;
        this.LLILZLL = str;
        this.LLIZ = c05xl2;
        this.LLIZLLLIL = str2;
        this.LLJ = str3;
        this.LLJI = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C912903hX(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC913203ha enumC913203ha;
        SmartRoute smartRouteBuildRoute;
        C1C7U.LIZ("PaymentAppealHelper@457b.handleAppealClick$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    smartRouteBuildRoute = this.LL;
                    C155000ia.LIZIZ(obj);
                    smartRouteBuildRoute.open();
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PaymentAppealHelper@457b.handleAppealClick$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (C123100dR.LIZ(this.LLILLL.token)) {
                enumC913203ha = EnumC913203ha.PAY_INSTRUMENT_ID;
            } else {
                enumC913203ha = EnumC913203ha.MERCHANT_ORDER_ID;
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C912803hW c912803hW = new C912803hW(this.LLIZLLLIL, this.LLILLL, this.LLJ, enumC913203ha, this.LLJI, null);
            this.LLILLJJLI = 1;
            obj = C23250099c.LJI(this, c1dfb, c912803hW);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PaymentAppealHelper@457b.handleAppealClick$1");
                return objLJFF;
            }
        }
        String str = (String) obj;
        if (str != null && str.length() != 0) {
            C05XL<Boolean> c05xl = this.LLILZ;
            if (c05xl != null) {
                Boolean.valueOf(c05xl.LJIIZILJ(true));
            }
            if (C123100dR.LIZ(str)) {
                Context context = this.LLILZIL;
                PaymentAppealHelper paymentAppealHelper = PaymentAppealHelper.LIZ;
                String str2 = this.LLILZLL;
                paymentAppealHelper.getClass();
                smartRouteBuildRoute = SmartRouter.buildRoute(context, PaymentAppealHelper.LIZ(str, str2));
                C05XL<Unit> c05xl2 = this.LLIZ;
                if (c05xl2 != null) {
                    this.LL = smartRouteBuildRoute;
                    this.LLILLJJLI = 2;
                    if (c05xl2.LJLIIIL(this) == objLJFF) {
                        C1C7U.LIZIZ("PaymentAppealHelper@457b.handleAppealClick$1");
                        return objLJFF;
                    }
                }
                smartRouteBuildRoute.open();
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("PaymentAppealHelper@457b.handleAppealClick$1");
            return unit2;
        }
        C05XL<Boolean> c05xl3 = this.LLILZ;
        if (c05xl3 != null) {
            Boolean.valueOf(c05xl3.LJIIZILJ(false));
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("PaymentAppealHelper@457b.handleAppealClick$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
