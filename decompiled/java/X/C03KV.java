package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS10S1210000_1;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.03KV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel$changePaymentMethod$1", f = "MiniOspViewModel.kt", l = {1887}, m = "invokeSuspend")
public final class C03KV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public PaymentInfo LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public final /* synthetic */ MiniOspViewModel LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ PaymentInfo LLIZLLLIL;
    public final /* synthetic */ PaymentInfo LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03KV(MiniOspViewModel miniOspViewModel, boolean z, PaymentInfo paymentInfo, PaymentInfo paymentInfo2, String str, InterfaceC1364105Vn<? super C03KV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = miniOspViewModel;
        this.LLIZ = z;
        this.LLIZLLLIL = paymentInfo;
        this.LLJ = paymentInfo2;
        this.LLJI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03KV(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        PaymentInfo paymentInfoSQ2;
        String str;
        PaymentMethod paymentMethod;
        String str2;
        boolean zBooleanValue;
        String str3;
        List list;
        PaymentMethod paymentMethod2;
        PaymentMethod paymentMethod3;
        PaymentMethod paymentMethod4;
        C1C7U.LIZ("MiniOspViewModel@8f4.changePaymentMethod$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        if (i != 0) {
            if (i == 1) {
                zBooleanValue = this.LLILZ;
                list = (List) this.LLILLL;
                str3 = (String) this.LLILLJJLI;
                paymentInfoSQ2 = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILZLL.LLJJ = Boolean.valueOf(this.LLIZ);
            paymentInfoSQ2 = this.LLILZLL.SQ2(this.LLIZLLLIL, this.LLIZ, this.LLJ);
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("realPaymentInfo id:");
            PaymentMethodsData paymentMethodsData = null;
            if (paymentInfoSQ2 != null && (paymentMethod4 = paymentInfoSQ2.paymentMethod) != null) {
                str = paymentMethod4.id;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            sbLIZ.append(", creditInfo: ");
            if (paymentInfoSQ2 != null) {
                paymentMethod = paymentInfoSQ2.LIZ;
            } else {
                paymentMethod = null;
            }
            sbLIZ.append(paymentMethod);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
            String str4 = this.LLJI;
            if (str4 != null && str4.length() != 0) {
                C19719612Di.LJJIIJ(this.LLILZLL.LLJILLL, new AwS52S1000000_1(this.LLJI, 25), true);
            }
            PaymentInfo paymentInfo = this.LLIZLLLIL;
            if (paymentInfo != null && (paymentMethod3 = paymentInfo.paymentMethod) != null) {
                str2 = paymentMethod3.id;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str2, "pm_pi_ins_pipobnpl_c_d")) {
                C03SE c03se = C03PI.LJIJI;
                PaymentMethod paymentMethod5 = this.LLIZLLLIL.paymentMethod;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("osp change payment method, ");
                sbLIZ2.append(this.LLIZ);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c03se.getClass();
                C03SE.LIZJ(paymentMethod5, strLIZIZ2);
            }
            this.LLILZLL.QQ2(paymentInfoSQ2);
            C03SE c03se2 = C03PI.LJIJI;
            BillInfoData billInfoData = this.LLILZLL.LLIZ;
            if (billInfoData != null) {
                paymentMethodsData = billInfoData.paymentMethods;
            }
            c03se2.getClass();
            C443120HZe c443120HZeLJJJIL = C03SE.LJJJIL(paymentInfoSQ2, paymentMethodsData, true, true);
            zBooleanValue = ((Boolean) c443120HZeLJJJIL.getFirst()).booleanValue();
            str3 = (String) c443120HZeLJJJIL.getSecond();
            list = (List) c443120HZeLJJJIL.getThird();
            if (this.LLIZ) {
                MiniOspViewModel miniOspViewModel = this.LLILZLL;
                miniOspViewModel.setState(new AwS10S1210000_1(miniOspViewModel, (MiniOspViewModel) str3, (String) zBooleanValue, (boolean) list, (List<String>) 4));
                MiniOspViewModel.kR2(this.LLILZLL, paymentInfoSQ2, false, "change_payment_method from osp", 6);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MiniOspViewModel@8f4.changePaymentMethod$1");
                return unit;
            }
            this.LLILZLL.getClass();
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "ec_osp_disable_reload_bill_info", true, false) || (paymentInfoSQ2 != null && (paymentMethod2 = paymentInfoSQ2.paymentMethod) != null && Intrinsics.LJFF(paymentMethod2.shouldReloadBillInfo, true))) {
                C099F c099fER2 = MiniOspViewModel.eR2(this.LLILZLL, true, false, false, new ChangeInfo(C03DI.ADD_NEW_PAYMENT.getValue(), null, null, null), null, 92);
                this.LL = paymentInfoSQ2;
                this.LLILLJJLI = str3;
                this.LLILLL = list;
                this.LLILZ = zBooleanValue;
                this.LLILZIL = 1;
                if (c099fER2.LJLIIIL(this) == objLJFF) {
                    C1C7U.LIZIZ("MiniOspViewModel@8f4.changePaymentMethod$1");
                    return objLJFF;
                }
            }
        }
        MiniOspViewModel miniOspViewModel2 = this.LLILZLL;
        miniOspViewModel2.setState(new AwS10S1210000_1(miniOspViewModel2, (MiniOspViewModel) str3, (String) zBooleanValue, (boolean) list, (List<String>) 5));
        MiniOspViewModel.kR2(this.LLILZLL, paymentInfoSQ2, false, "change_payment_method not from osp", 6);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MiniOspViewModel@8f4.changePaymentMethod$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
