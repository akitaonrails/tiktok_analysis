package X;

import android.content.Context;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPreBindRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPreBindResponse;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.verify.IPipoVerifyCenterService;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03dJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper$requestPreBind$2", f = "PaymentBindHelper.kt", l = {347, 1113}, m = "invokeSuspend")
public final class C886703dJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ n LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Context LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C886703dJ(Context context, n nVar, String str, String str2, String str3, String str4, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = str;
        this.LLIZ = nVar;
        this.LLIZLLLIL = str2;
        this.LLJ = str3;
        this.LLJI = str4;
        this.LLJIJIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLILZLL;
        return new C886703dJ(this.LLJIJIL, this.LLIZ, str, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String str;
        String str2;
        String str3;
        PaymentParams paymentParams;
        String str4;
        final String str5;
        String lowerCase;
        String str6;
        C19EG c19egLIZIZ;
        Object objLIZ = obj;
        C1C7U.LIZ("PaymentBindHelper@f28b.requestPreBind$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZ);
                    C1C7U.LIZIZ("PaymentBindHelper@f28b.requestPreBind$2");
                    return objLIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLIZ);
        } else {
            C155000ia.LIZIZ(objLIZ);
            C914303hl.LIZ.getClass();
            Cashier cashier = C914303hl.LIZIZ;
            if (cashier != null) {
                str = cashier.merchantUserId;
            } else {
                str = null;
            }
            String str7 = this.LLILZLL;
            Cashier cashier2 = C914303hl.LIZIZ;
            if (cashier2 != null && (paymentParams = cashier2.paymentParams) != null) {
                str2 = paymentParams.currency;
            } else {
                str2 = null;
            }
            C1724390uyT c1724390uyT = C1724390uyT.LIZ;
            n nVar = this.LLIZ;
            String str8 = this.LLIZLLLIL;
            String str9 = "";
            if (str8 == null) {
                str8 = "";
            }
            c1724390uyT.getClass();
            JSONObject jSONObjectLIZ = C1724390uyT.LIZ(str8, nVar, null);
            String str10 = this.LLJ;
            String str11 = this.LLILZLL;
            String str12 = this.LLJI;
            Cashier cashier3 = C914303hl.LIZIZ;
            if (cashier3 != null && (str3 = cashier3.merchantUserId) != null) {
                jSONObjectLIZ.put("uid", str3);
            }
            PaymentBindHelper.LIZ.getClass();
            jSONObjectLIZ.put("scene_tag", PaymentBindHelper.LIZ(str10, str11, null));
            if (str12 != null) {
                str9 = str12;
            }
            jSONObjectLIZ.put("first_checkout_consultation_id", str9);
            PaymentPreBindRequest paymentPreBindRequest = new PaymentPreBindRequest(str, str7, str2, String.valueOf(jSONObjectLIZ), PaymentBindHelper.LIZ(this.LLJ, this.LLILZLL, null), null, 32, null);
            C877403bo c877403bo = PaymentApi.LIZ;
            this.LLILZIL = 1;
            c877403bo.getClass();
            objLIZ = ((PaymentApi) C877403bo.LIZIZ.create(PaymentApi.class)).LIZ(paymentPreBindRequest, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("PaymentBindHelper@f28b.requestPreBind$2");
                return objLJFF;
            }
        }
        Response response = (Response) objLIZ;
        PaymentPreBindResponse paymentPreBindResponse = (PaymentPreBindResponse) response.data;
        if (paymentPreBindResponse != null) {
            str4 = paymentPreBindResponse.decision;
            str5 = paymentPreBindResponse.orderId;
        } else {
            str4 = null;
            str5 = null;
        }
        if (C123100dR.LIZ(str5) && C123100dR.LIZ(this.LLILZLL)) {
            C03SJ c03sj = C03SF.LIZ;
            C03SF.LIZ.put(this.LLILZLL, str5);
        }
        Context context = this.LLJIJIL;
        final String str13 = this.LLILZLL;
        this.LL = str4;
        this.LLILLJJLI = str5;
        this.LLILLL = context;
        this.LLILZ = str13;
        this.LLILZIL = 2;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
        c2252611DEt.LJIJJ();
        if (str4 != null) {
            lowerCase = str4.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = null;
        }
        if (Intrinsics.LJFF(lowerCase, EnumC899603fO.PASS.getValue())) {
            c2252611DEt.LJJIFFI(null, true);
        } else if (Intrinsics.LJFF(lowerCase, EnumC899603fO.REVIEW.getValue())) {
            PaymentPreBindResponse paymentPreBindResponse2 = (PaymentPreBindResponse) response.data;
            if (paymentPreBindResponse2 != null) {
                str6 = paymentPreBindResponse2.riskVerifyInfo;
            } else {
                str6 = null;
            }
            C1713520ugw c1713520ugwLIZIZ = C897503f3.LIZIZ(null, str6);
            if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                IPipoVerifyCenterService iPipoVerifyCenterService = (IPipoVerifyCenterService) PluggableExtentionKt.pluggableSpi$default(IPipoVerifyCenterService.class, false, false, false, 14, null);
                if (iPipoVerifyCenterService != null) {
                    Boolean.valueOf(iPipoVerifyCenterService.LIZ(c19egLIZIZ, c1713520ugwLIZIZ, new InterfaceC1713650uh9() { // from class: X.03dK
                        @Override // X.InterfaceC1713650uh9
                        public final void LIZ(C1713690uhD c1713690uhD) {
                            if (Intrinsics.LJFF(c1713690uhD.LIZIZ, "PASS")) {
                                if (C123100dR.LIZ(str5) && C123100dR.LIZ(str13)) {
                                    C03SJ c03sj2 = C03SF.LIZ;
                                    C03SF.LIZ.put(str13, str5);
                                }
                                c2252611DEt.LJJIFFI(null, Boolean.TRUE);
                                return;
                            }
                            c2252611DEt.LJJIFFI(null, Boolean.FALSE);
                        }
                    }));
                } else {
                    c2252611DEt.LJJIFFI(null, false);
                }
            }
        } else if (Intrinsics.LJFF(lowerCase, EnumC899603fO.SLIDER_REVIEW.getValue())) {
            c2252611DEt.LJJIFFI(null, false);
        } else {
            c2252611DEt.LJJIFFI(null, false);
        }
        objLIZ = c2252611DEt.LJIJ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(this);
        }
        if (objLIZ == objLJFF) {
            C1C7U.LIZIZ("PaymentBindHelper@f28b.requestPreBind$2");
            return objLJFF;
        }
        C1C7U.LIZIZ("PaymentBindHelper@f28b.requestPreBind$2");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
