package X;

import com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Xj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.helper.DraftAIGCRestoreHelper$updateAIGCShootingEffects$frameworkType$1", f = "DraftAIGCRestoreHelper.kt", l = {88}, m = "invokeSuspend")
public final class C2388109Xj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0LZU>, Object> {
    public int LL;
    public final /* synthetic */ AwemeDraft LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2388109Xj(AwemeDraft awemeDraft, InterfaceC1364105Vn<? super C2388109Xj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = awemeDraft;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2388109Xj(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftAIGCRestoreHelper@c321.updateAIGCShootingEffects$frameworkType$1");
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
            AIGCWorkflowCreationService aIGCWorkflowCreationServiceLIZ = C2387909Xh.LIZ();
            if (aIGCWorkflowCreationServiceLIZ != null) {
                String strLIZ = this.LLILLJJLI.LIZ();
                this.LL = 1;
                obj = aIGCWorkflowCreationServiceLIZ.LJIILIIL(strLIZ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("DraftAIGCRestoreHelper@c321.updateAIGCShootingEffects$frameworkType$1");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        C1C7U.LIZIZ("DraftAIGCRestoreHelper@c321.updateAIGCShootingEffects$frameworkType$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0LZU> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
