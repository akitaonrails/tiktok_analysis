package X;

import com.ss.android.ugc.aweme.im.sdk.resourcemanage.lego.DMDowngradeRejectionExecutionTaskConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PEP, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.resourcemanage.initializer.DMResourceChatPageRelatedInitializer$bindTaskOnceAfterColdStart$1$1", f = "DMResourceChatPageRelatedInitializer.kt", l = {30}, m = "invokeSuspend")
public final class C0PEP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0PES LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PEP(C0PES c0pes, InterfaceC1364105Vn<? super C0PEP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0pes;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PEP(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMResourceChatPageRelatedInitializer@4b57.bindTaskOnceAfterColdStart$1$1");
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
            long j = ((DMDowngradeRejectionExecutionTaskConfig) C207286169k.LIZIZ.getValue()).defaultRecoverDelayTime;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("DMResourceChatPageRelatedInitializer@4b57.bindTaskOnceAfterColdStart$1$1");
                return objLJFF;
            }
        }
        LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMResourceChatPageRelatedInitializer@4b57.bindTaskOnceAfterColdStart$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
