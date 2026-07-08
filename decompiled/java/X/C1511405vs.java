package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.edm.EdmConsentAgreementResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05vs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.utils.EmailAuthorizationTextUtils$getEmailAuthorizationText$result$1", f = "EmailAuthorizationTextUtils.kt", l = {48}, m = "invokeSuspend")
public final class C1511405vs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super EdmConsentAgreementResponse>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1511405vs(String str, String str2, InterfaceC1364105Vn<? super C1511405vs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1511405vs(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EmailAuthorizationTextUtils@dc15.getEmailAuthorizationText$result$1");
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
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            this.LL = 1;
            obj = ComplianceServiceProvider.LJIJ().getEmailConsentAgreementInfo(str, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EmailAuthorizationTextUtils@dc15.getEmailAuthorizationText$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EmailAuthorizationTextUtils@dc15.getEmailAuthorizationText$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super EdmConsentAgreementResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
