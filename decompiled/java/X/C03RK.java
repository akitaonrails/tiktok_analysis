package X;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.payment.USPaymentInfoCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import njp.a;

/* JADX INFO: renamed from: X.03RK, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.payment.USPaymentInfoCell$PaymentAdapter$bindPaymentViewHolder$1$4$1", f = "USPaymentInfoCell.kt", l = {1230}, m = "invokeSuspend")
public final class C03RK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C03ZC LLILLJJLI;
    public final /* synthetic */ PaymentMethod LLILLL;
    public final /* synthetic */ USPaymentInfoCell LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Uri.Builder LLILZLL;
    public final /* synthetic */ CommuteType LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03RK(C03ZC c03zc, PaymentMethod paymentMethod, USPaymentInfoCell uSPaymentInfoCell, String str, Uri.Builder builder, CommuteType commuteType, InterfaceC1364105Vn<? super C03RK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c03zc;
        this.LLILLL = paymentMethod;
        this.LLILZ = uSPaymentInfoCell;
        this.LLILZIL = str;
        this.LLILZLL = builder;
        this.LLIZ = commuteType;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03RK(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        n nVar;
        PaymentMethodsData paymentMethodsData;
        String str2;
        String str3;
        PaymentMethodsData paymentMethodsData2;
        Object objLJIIJ = obj;
        C1C7U.LIZ("USPaymentInfoCell$PaymentAdapter@a112.bindPaymentViewHolder$1$4$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        PaymentMethodsData paymentMethodsData3 = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIIJ);
            PaymentBindHelper paymentBindHelper = PaymentBindHelper.LIZ;
            Context context = this.LLILLJJLI.getContext();
            PaymentMethod paymentMethod = this.LLILLL;
            String str4 = paymentMethod.id;
            Boolean bool = paymentMethod.bindInfo.isNeedPrebindVerify;
            BillInfoData billInfoData = this.LLILZ.T5().LLJJI;
            if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
                str = paymentMethodsData.consultationId;
            } else {
                str = null;
            }
            String str5 = this.LLILZ.T5().c;
            BillInfoData billInfoData2 = this.LLILZ.T5().LLJJI;
            if (billInfoData2 != null) {
                nVar = billInfoData2.preRiskParam;
            } else {
                nVar = null;
            }
            this.LL = 1;
            objLJIIJ = paymentBindHelper.LJIIJ(context, str4, bool, str, str5, "order_submit", nVar, this);
            if (objLJIIJ == objLJFF) {
                C1C7U.LIZIZ("USPaymentInfoCell$PaymentAdapter@a112.bindPaymentViewHolder$1$4$1");
                return objLJFF;
            }
        }
        if (((Boolean) objLJIIJ).booleanValue()) {
            PaymentBindHelper paymentBindHelper2 = PaymentBindHelper.LIZ;
            Context context2 = this.LLILLJJLI.getContext();
            PaymentMethod paymentMethod2 = this.LLILLL;
            if (paymentMethod2 != null) {
                str2 = paymentMethod2.LJIILLIIL;
            } else {
                str2 = null;
            }
            String str6 = this.LLILZIL;
            String string = this.LLILZLL.toString();
            CommuteType commuteType = this.LLIZ;
            String str7 = this.LLILLL.id;
            BillInfoData billInfoData3 = this.LLILZ.T5().LLJJI;
            if (billInfoData3 != null && (paymentMethodsData2 = billInfoData3.paymentMethods) != null) {
                str3 = paymentMethodsData2.saleRegion;
            } else {
                str3 = null;
            }
            PaymentMethod paymentMethod3 = this.LLILLL;
            InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this.LLILZ.T5());
            BillInfoData billInfoData4 = this.LLILZ.T5().LLJJI;
            if (billInfoData4 != null) {
                paymentMethodsData3 = billInfoData4.paymentMethods;
            }
            final USPaymentInfoCell uSPaymentInfoCell = this.LLILZ;
            PaymentBindHelper.LJI(paymentBindHelper2, context2, str2, str6, string, commuteType, "ordersubmit", str7, str3, paymentMethod3, viewModelScope, paymentMethodsData3, false, null, new InterfaceC877803bs() { // from class: X.035Z
                @Override // X.InterfaceC877803bs
                public final void onDismiss() {
                    uSPaymentInfoCell.T5().setState(AFwS228S0000000_1.get$arr$(431));
                }

                @Override // X.InterfaceC877803bs
                public final void onShow() {
                    uSPaymentInfoCell.T5().setState(AFwS228S0000000_1.get$arr$(456));
                }

                @Override // X.InterfaceC877803bs
                public final void onFailed(String str8) {
                    if (str8 != null) {
                        uSPaymentInfoCell.T5().rT2(str8);
                    }
                }
            }, this.LLILLL.displayName, 6144);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("USPaymentInfoCell$PaymentAdapter@a112.bindPaymentViewHolder$1$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
