package X;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS52S1000000_1;
import njp.a;

/* JADX INFO: renamed from: X.03Z5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.payment.view.USCashierPaymentMethodView$showBind$1$2$1$2", f = "USCashierPaymentMethodView.kt", l = {281}, m = "invokeSuspend")
public final class C03Z5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C03Z4 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Uri.Builder LLILZIL;
    public final /* synthetic */ CommuteType LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03Z5(C03Z4 c03z4, String str, String str2, Uri.Builder builder, CommuteType commuteType, InterfaceC1364105Vn<? super C03Z5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c03z4;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = builder;
        this.LLILZLL = commuteType;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03Z5(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Boolean bool;
        String str2;
        String str3;
        n nVar;
        PaymentMethodsData paymentMethodsData;
        BindInfo bindInfo;
        String str4;
        InterfaceC497601wk viewModelScope;
        PaymentMethodsData paymentMethodsData2;
        EnterParams enterParams;
        Object objLJIIJ = obj;
        C1C7U.LIZ("USCashierPaymentMethodView@b904.showBind$1$2$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str5 = null;
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
            PaymentMethod paymentMethod = this.LLILLJJLI.getPaymentMethod();
            if (paymentMethod != null) {
                str = paymentMethod.id;
            } else {
                str = null;
            }
            PaymentMethod paymentMethod2 = this.LLILLJJLI.getPaymentMethod();
            if (paymentMethod2 != null && (bindInfo = paymentMethod2.bindInfo) != null) {
                bool = bindInfo.isNeedPrebindVerify;
            } else {
                bool = null;
            }
            PaymentViewModel paymentViewModel = this.LLILLJJLI.getPaymentViewModel();
            if (paymentViewModel != null && (paymentMethodsData = paymentViewModel.LLJJIJIL) != null) {
                str2 = paymentMethodsData.consultationId;
            } else {
                str2 = null;
            }
            PaymentViewModel paymentViewModel2 = this.LLILLJJLI.getPaymentViewModel();
            if (paymentViewModel2 != null) {
                str3 = paymentViewModel2.LLJJJ;
            } else {
                str3 = null;
            }
            PaymentViewModel paymentViewModel3 = this.LLILLJJLI.getPaymentViewModel();
            if (paymentViewModel3 != null) {
                nVar = paymentViewModel3.LLJJJJLIIL;
            } else {
                nVar = null;
            }
            this.LL = 1;
            objLJIIJ = paymentBindHelper.LJIIJ(context, str, bool, str2, null, str3, nVar, this);
            if (objLJIIJ == objLJFF) {
                C1C7U.LIZIZ("USCashierPaymentMethodView@b904.showBind$1$2$1$2");
                return objLJFF;
            }
        }
        if (((Boolean) objLJIIJ).booleanValue()) {
            PaymentBindHelper paymentBindHelper2 = PaymentBindHelper.LIZ;
            Context context2 = this.LLILLJJLI.getContext();
            String str6 = this.LLILLL;
            String str7 = this.LLILZ;
            String string = this.LLILZIL.toString();
            CommuteType commuteType = this.LLILZLL;
            String paySource = this.LLILLJJLI.getPaySource();
            PaymentMethod paymentMethod3 = this.LLILLJJLI.getPaymentMethod();
            if (paymentMethod3 != null) {
                str4 = paymentMethod3.id;
            } else {
                str4 = null;
            }
            String saleRegion = this.LLILLJJLI.getSaleRegion();
            PaymentMethod paymentMethod4 = this.LLILLJJLI.getPaymentMethod();
            PaymentViewModel paymentViewModel4 = this.LLILLJJLI.getPaymentViewModel();
            if (paymentViewModel4 != null) {
                viewModelScope = ViewModelKt.getViewModelScope(paymentViewModel4);
            } else {
                viewModelScope = null;
            }
            PaymentViewModel paymentViewModel5 = this.LLILLJJLI.getPaymentViewModel();
            if (paymentViewModel5 != null) {
                paymentMethodsData2 = paymentViewModel5.LLJJIJIL;
            } else {
                paymentMethodsData2 = null;
            }
            PaymentViewModel paymentViewModel6 = this.LLILLJJLI.getPaymentViewModel();
            if (paymentViewModel6 != null) {
                enterParams = paymentViewModel6.LLJ;
            } else {
                enterParams = null;
            }
            final C03Z4 c03z4 = this.LLILLJJLI;
            InterfaceC877803bs interfaceC877803bs = new InterfaceC877803bs() { // from class: X.03Zg
                @Override // X.InterfaceC877803bs
                public final void onDismiss() {
                    PaymentViewModel paymentViewModel7 = c03z4.getPaymentViewModel();
                    if (paymentViewModel7 != null) {
                        paymentViewModel7.setState(AFwS228S0000000_1.get$arr$(216));
                    }
                }

                @Override // X.InterfaceC877803bs
                public final void onShow() {
                    PaymentViewModel paymentViewModel7 = c03z4.getPaymentViewModel();
                    if (paymentViewModel7 != null) {
                        paymentViewModel7.setState(AFwS228S0000000_1.get$arr$(241));
                    }
                }

                @Override // X.InterfaceC877803bs
                public final void onFailed(String str8) {
                    PaymentViewModel paymentViewModel7;
                    if (str8 != null && (paymentViewModel7 = c03z4.getPaymentViewModel()) != null) {
                        paymentViewModel7.setState(new AwS52S1000000_1(str8, 14));
                    }
                }
            };
            PaymentMethod paymentMethod5 = c03z4.getPaymentMethod();
            if (paymentMethod5 != null) {
                str5 = paymentMethod5.displayName;
            }
            PaymentBindHelper.LJI(paymentBindHelper2, context2, str6, str7, string, commuteType, paySource, str4, saleRegion, paymentMethod4, viewModelScope, paymentMethodsData2, false, enterParams, interfaceC877803bs, str5, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("USCashierPaymentMethodView@b904.showBind$1$2$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
