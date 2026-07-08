package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.SetPrimaryPIRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.SetPrimaryVerifyResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS11S2000000_1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.03cB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel$setPrimaryCard$1$2", f = "PaymentViewModel.kt", l = {3723}, m = "invokeSuspend")
public final class C879703cB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SetPrimaryPIRequest LLILLJJLI;
    public final /* synthetic */ PaymentViewModel LLILLL;
    public final /* synthetic */ C887503dR LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C879703cB(SetPrimaryPIRequest setPrimaryPIRequest, PaymentViewModel paymentViewModel, C887503dR c887503dR, InterfaceC1364105Vn<? super C879703cB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = setPrimaryPIRequest;
        this.LLILLL = paymentViewModel;
        this.LLILZ = c887503dR;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C879703cB(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        T t;
        String lowerCase;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C1C7U.LIZ("PaymentViewModel@e450.setPrimaryCard$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C877403bo c877403bo = PaymentApi.LIZ;
                SetPrimaryPIRequest setPrimaryPIRequest = this.LLILLJJLI;
                this.LL = 1;
                c877403bo.getClass();
                obj = ((PaymentApi) C877403bo.LIZIZ.create(PaymentApi.class)).LIZLLL(setPrimaryPIRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PaymentViewModel@e450.setPrimaryCard$1$2");
                    return objLJFF;
                }
            }
            Response response = (Response) obj;
            if (response.isCodeOK() && (t = response.data) != 0) {
                String str7 = "";
                if (!Intrinsics.LJFF(((SetPrimaryVerifyResponse) t).errorCode, CardStruct.IStatusCode.DEFAULT)) {
                    SetPrimaryVerifyResponse setPrimaryVerifyResponse = (SetPrimaryVerifyResponse) response.data;
                    if (setPrimaryVerifyResponse != null) {
                        str5 = setPrimaryVerifyResponse.errorCode;
                    } else {
                        str5 = null;
                    }
                    if (!Intrinsics.LJFF(str5, "")) {
                        PaymentViewModel paymentViewModel = this.LLILLL;
                        SetPrimaryVerifyResponse setPrimaryVerifyResponse2 = (SetPrimaryVerifyResponse) response.data;
                        if (setPrimaryVerifyResponse2 != null) {
                            str6 = setPrimaryVerifyResponse2.errorMsg;
                        } else {
                            str6 = null;
                        }
                        PaymentViewModel.TR2(paymentViewModel, str6, 2);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("PaymentViewModel@e450.setPrimaryCard$1$2");
                        return unit;
                    }
                }
                C888603dc c888603dc = C888603dc.LIZ;
                C887503dR c887503dR = this.LLILZ;
                String str8 = this.LLILLL.LLJLIL;
                c888603dc.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (str8 != null) {
                    str7 = str8;
                }
                linkedHashMap.put("verify_id", str7);
                C888603dc.LJIIIIZZ("request_save_payment", c887503dR, "error", linkedHashMap);
                SetPrimaryVerifyResponse setPrimaryVerifyResponse3 = (SetPrimaryVerifyResponse) response.data;
                if (setPrimaryVerifyResponse3 != null && (str4 = setPrimaryVerifyResponse3.decision) != null) {
                    lowerCase = str4.toLowerCase(Locale.ROOT);
                } else {
                    lowerCase = null;
                }
                if (!Intrinsics.LJFF(lowerCase, EnumC899603fO.PASS.getValue()) && lowerCase != null) {
                    if (Intrinsics.LJFF(lowerCase, EnumC899603fO.REVIEW.getValue())) {
                        PaymentViewModel paymentViewModel2 = this.LLILLL;
                        T t2 = response.data;
                        SetPrimaryVerifyResponse setPrimaryVerifyResponse4 = (SetPrimaryVerifyResponse) t2;
                        if (setPrimaryVerifyResponse4 != null) {
                            str2 = setPrimaryVerifyResponse4.riskVerifyInfo;
                        } else {
                            str2 = null;
                        }
                        paymentViewModel2.LLJL = str2;
                        SetPrimaryVerifyResponse setPrimaryVerifyResponse5 = (SetPrimaryVerifyResponse) t2;
                        if (setPrimaryVerifyResponse5 != null) {
                            str3 = setPrimaryVerifyResponse5.verifyId;
                        } else {
                            str3 = null;
                        }
                        paymentViewModel2.LLJLIL = str3;
                        paymentViewModel2.setState(AFwS228S0000000_1.get$arr$(232));
                    } else {
                        PaymentViewModel.TR2(this.LLILLL, null, 3);
                    }
                } else {
                    PaymentViewModel paymentViewModel3 = this.LLILLL;
                    paymentViewModel3.LLJLIL = null;
                    paymentViewModel3.setState(AFwS228S0000000_1.get$arr$(231));
                }
            } else {
                PaymentViewModel paymentViewModel4 = this.LLILLL;
                SetPrimaryVerifyResponse setPrimaryVerifyResponse6 = (SetPrimaryVerifyResponse) response.data;
                if (setPrimaryVerifyResponse6 != null) {
                    str = setPrimaryVerifyResponse6.pipoErrorAction;
                } else {
                    str = null;
                }
                paymentViewModel4.LLJLIL = null;
                paymentViewModel4.LLJLL = null;
                paymentViewModel4.setState(new AwS11S2000000_1(null, str, 1));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "sns_set_primary_failed");
            PaymentViewModel.TR2(this.LLILLL, null, 3);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PaymentViewModel@e450.setPrimaryCard$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
