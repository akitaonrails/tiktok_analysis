package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aikit.api.common.AITaskService;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LOU, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.config.AIPortraitDraftDeleteHandler$processLocalDraftDeleted$2", f = "AIPortraitDraftDeleteHandler.kt", l = {LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT}, m = "invokeSuspend")
public final class C0LOU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AIPortraitGeneratingModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LOU(AIPortraitGeneratingModel aIPortraitGeneratingModel, InterfaceC1364105Vn<? super C0LOU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aIPortraitGeneratingModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0LOU c0lou = new C0LOU(this.LLILLL, interfaceC1364105Vn);
        c0lou.LLILLJJLI = obj;
        return c0lou;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("AIPortraitDraftDeleteHandler@f271.processLocalDraftDeleted$2");
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
                AIPortraitGeneratingModel aIPortraitGeneratingModel = this.LLILLL;
                C547860LeC.LIZ.getClass();
                AITaskService aITaskServiceLJII = C547860LeC.LJII();
                C0LOM c0lom = C0LOM.LIZ;
                String str = aIPortraitGeneratingModel.clientWorkflowId;
                String str2 = aIPortraitGeneratingModel.serverWorkflowId;
                this.LL = 1;
                if (aITaskServiceLJII.LIZLLL(c0lom, str, str2, this) == objLJFF) {
                    C1C7U.LIZIZ("AIPortraitDraftDeleteHandler@f271.processLocalDraftDeleted$2");
                    return objLJFF;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("AIPortraitDraftDeleteHandler@f271.processLocalDraftDeleted$2");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
