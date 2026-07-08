package X;

import com.ss.android.ugc.aweme.compliance.business.fbv.FBVApi;
import com.ss.android.ugc.aweme.compliance.business.fbv.FBVCheckResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pcR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.business.fbv.FBVService$checkFBVStatus$2", f = "FBVService.kt", l = {BaseNotice.RECOMMEND_LIVE, BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C1518530pcR extends C09AX implements Function2<InterfaceC346701Wf<? super FBVCheckResponse>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1518520pcQ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1518530pcR(C1518520pcQ c1518520pcQ, InterfaceC1364105Vn<? super C1518530pcR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1518520pcQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1518530pcR c1518530pcR = new C1518530pcR(this.LLILLL, interfaceC1364105Vn);
        c1518530pcR.LLILLJJLI = obj;
        return c1518530pcR;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        C1C7U.LIZ("FBVService@c8e9.checkFBVStatus$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FBVService@c8e9.checkFBVStatus$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C201955140j.LIZIZ("FBVService", "checkFBVStatus api call is performed");
            FBVApi fBVApi = this.LLILLL.LIZ;
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            obj = fBVApi.consentAcceptance("effect_fbv_policy_US_IL", this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FBVService@c8e9.checkFBVStatus$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC346701Wf.emit(obj, this) == objLJFF) {
            C1C7U.LIZIZ("FBVService@c8e9.checkFBVStatus$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FBVService@c8e9.checkFBVStatus$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super FBVCheckResponse> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
