package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PiPoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PipoRequestWrapper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentAppealHelper;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03hU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentAssuranceHelperKt$showPaymentAssuranceLearnMore$1$appealLink$1", f = "PaymentAssuranceHelper.kt", l = {369}, m = "invokeSuspend")
public final class C912603hU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Cashier LLILLL;
    public final /* synthetic */ PipoRequestWrapper LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C912603hU(Cashier cashier, PipoRequestWrapper pipoRequestWrapper, InterfaceC1364105Vn<? super C912603hU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = cashier;
        this.LLILZ = pipoRequestWrapper;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C912603hU c912603hU = new C912603hU(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c912603hU.LLILLJJLI = obj;
        return c912603hU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        String str;
        PaymentAppealHelper.AppealResponse appealResponse;
        List<PaymentAppealHelper.AppealInfo> list;
        PaymentAppealHelper.AppealInfo appealInfo;
        Type type;
        C1C7U.LIZ("PaymentAssuranceHelperKt@af38.showPaymentAssuranceLearnMore$1$appealLink$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                Cashier cashier = this.LLILLL;
                PipoRequestWrapper pipoRequestWrapper = this.LLILZ;
                C877403bo c877403bo = PaymentApi.LIZ;
                String str2 = cashier.pipoHost;
                this.LL = 1;
                c877403bo.getClass();
                obj = C877403bo.LIZIZ(str2, pipoRequestWrapper, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PaymentAssuranceHelperKt@af38.showPaymentAssuranceLearnMore$1$appealLink$1");
                    return objLJFF;
                }
            }
            c098200Yq = (PiPoResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str3 = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        PiPoResponse piPoResponse = (PiPoResponse) c098200Yq;
        if (piPoResponse != null && (str = piPoResponse.response) != null) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                    z = false;
                }
                if (!z) {
                    type = new TypeToken<PaymentAppealHelper.AppealResponse>() { // from class: X.03he
                    }.getType();
                } else {
                    type = C2371409Qy.LIZJ(C13LE.LJII(PaymentAppealHelper.AppealResponse.class));
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
                if (!(objFromJson instanceof PaymentAppealHelper.AppealResponse)) {
                    objFromJson = null;
                }
                appealResponse = (PaymentAppealHelper.AppealResponse) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                appealResponse = null;
            }
            if (appealResponse != null && (list = appealResponse.appealInfoList) != null && (appealInfo = (PaymentAppealHelper.AppealInfo) C13LP.LJJJLL(list)) != null) {
                str3 = appealInfo.appealLink;
            }
        }
        C1C7U.LIZIZ("PaymentAssuranceHelperKt@af38.showPaymentAssuranceLearnMore$1$appealLink$1");
        return str3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
