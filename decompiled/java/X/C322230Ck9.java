package X;

import Y.AgS97S1100000_4;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.aigc.asynctask.workflowapi.AIGCArchWorkflowManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ck9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailViewModel$loadDraft$1$2$1", f = "EffectDraftDetailViewModel.kt", l = {54}, m = "invokeSuspend")
public final class C322230Ck9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EffectDraftDetailViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C322230Ck9(EffectDraftDetailViewModel effectDraftDetailViewModel, String str, InterfaceC1364105Vn<? super C322230Ck9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effectDraftDetailViewModel;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C322230Ck9(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objCollect;
        InterfaceC346201Wa interfaceC346201WaB1;
        C1C7U.LIZ("EffectDraftDetailViewModel@6005.loadDraft$1$2$1");
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
            EffectDraftDetailViewModel effectDraftDetailViewModel = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            effectDraftDetailViewModel.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("observeTaskStatusIfNeed, workflowTaskId: ");
            sbLIZ.append(str);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("EffectDraftDetailViewModel", C2188811AlT.LIZIZ(sbLIZ));
            AIGCArchWorkflowManager aIGCArchWorkflowManager = (AIGCArchWorkflowManager) PluggableExtentionKt.pluggableSpi$default(AIGCArchWorkflowManager.class, false, false, false, 14, null);
            if (aIGCArchWorkflowManager == null || (interfaceC346201WaB1 = aIGCArchWorkflowManager.B1(str, C0LUE.LIZ)) == null || (objCollect = interfaceC346201WaB1.collect(new AgS97S1100000_4(effectDraftDetailViewModel, str, 1), this)) != C099R.LJFF()) {
                objCollect = Unit.LIZ;
            }
            if (objCollect == objLJFF) {
                C1C7U.LIZIZ("EffectDraftDetailViewModel@6005.loadDraft$1$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectDraftDetailViewModel@6005.loadDraft$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
