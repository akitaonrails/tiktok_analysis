package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.actionhandler.LiveAiAnalysisApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor_data.TriggerAuthorizedCapabilitiesDataContainer;

/* JADX INFO: renamed from: X.01Lc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.actionhandler.schema.handler.LiveAiAnalysisPendingToastSchemaHandler$triggerAuthorizedCapabilities$1", f = "LiveAiAnalysisPendingToastSchemaHandler.kt", l = {44}, m = "invokeSuspend")
public final class C317801Lc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C317801Lc(InterfaceC1364105Vn<? super C317801Lc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C317801Lc c317801Lc = new C317801Lc(interfaceC1364105Vn);
        c317801Lc.LLILLJJLI = obj;
        return c317801Lc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Boolean boolValueOf;
        TriggerAuthorizedCapabilitiesDataContainer triggerAuthorizedCapabilitiesDataContainer;
        C1C7U.LIZ("LiveAiAnalysisPendingToastSchemaHandler@a2bc.triggerAuthorizedCapabilities$1");
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
                C480460Ism.LIZ().getClass();
                LiveAiAnalysisApi liveAiAnalysisApi = (LiveAiAnalysisApi) C480460Ism.LIZLLL(LiveAiAnalysisApi.class);
                this.LL = 1;
                obj = liveAiAnalysisApi.triggerAuthorizedCapabilities(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveAiAnalysisPendingToastSchemaHandler@a2bc.triggerAuthorizedCapabilities$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C470590Icr) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            BaseResponse baseResponse = (BaseResponse) c098200Yq;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("triggerAuthorizedCapabilities success: acceptRes=");
            if (baseResponse != null && (triggerAuthorizedCapabilitiesDataContainer = (TriggerAuthorizedCapabilitiesDataContainer) baseResponse.data) != null) {
                boolValueOf = Boolean.valueOf(triggerAuthorizedCapabilitiesDataContainer.acceptRes);
            } else {
                boolValueOf = null;
            }
            sbLIZ.append(boolValueOf);
            C20441214yg.LJIIIZ("LiveAiAnalysisPendingToastSchemaHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("triggerAuthorizedCapabilities failed: ");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C20441214yg.LJ("LiveAiAnalysisPendingToastSchemaHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveAiAnalysisPendingToastSchemaHandler@a2bc.triggerAuthorizedCapabilities$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
