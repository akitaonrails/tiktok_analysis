package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lcg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.creation.AIGCTaskHandleComponent$observeWorkflowState$1", f = "AIGCTaskHandleComponent.kt", l = {51}, m = "invokeSuspend")
public final class C546920Lcg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C546940Lci LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ AIGCCreationModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546920Lcg(C546940Lci c546940Lci, String str, AIGCCreationModel aIGCCreationModel, InterfaceC1364105Vn<? super C546920Lcg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c546940Lci;
        this.LLILLL = str;
        this.LLILZ = aIGCCreationModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C546920Lcg(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCTaskHandleComponent@9d9c.observeWorkflowState$1");
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
            C546940Lci c546940Lci = this.LLILLJJLI;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C546910Lcf c546910Lcf = new C546910Lcf(c546940Lci, this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(c546940Lci, state, c546910Lcf, this) == objLJFF) {
                C1C7U.LIZIZ("AIGCTaskHandleComponent@9d9c.observeWorkflowState$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCTaskHandleComponent@9d9c.observeWorkflowState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
