package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.business.fbv.FBVApi;
import com.ss.android.ugc.aweme.compliance.business.fbv.FBVCheckResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pcS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.business.fbv.FBVService$fetchFBVConsentStatus$2", f = "FBVService.kt", l = {55}, m = "invokeSuspend")
public final class C1518540pcS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super FBVCheckResponse>, Object> {
    public int LL;
    public final /* synthetic */ C1518520pcQ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1518540pcS(C1518520pcQ c1518520pcQ, InterfaceC1364105Vn<? super C1518540pcS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1518520pcQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1518540pcS(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        FBVCheckResponse fBVCheckResponse;
        C1C7U.LIZ("FBVService@c8e9.fetchFBVConsentStatus$2");
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
                FBVApi fBVApi = this.LLILLJJLI.LIZ;
                this.LL = 1;
                obj = fBVApi.consentAcceptance("effect_fbv_policy_US_IL", this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("FBVService@c8e9.fetchFBVConsentStatus$2");
                    return objLJFF;
                }
            }
            fBVCheckResponse = (FBVCheckResponse) obj;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            fBVCheckResponse = null;
        }
        C1C7U.LIZIZ("FBVService@c8e9.fetchFBVConsentStatus$2");
        return fBVCheckResponse;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super FBVCheckResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
