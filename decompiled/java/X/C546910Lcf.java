package X;

import Y.AgS100S1100000_8;
import com.ss.android.ugc.aweme.aikit.api.create.AICreateService;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lcf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.creation.AIGCTaskHandleComponent$observeWorkflowState$1$1", f = "AIGCTaskHandleComponent.kt", l = {53, 54}, m = "invokeSuspend")
public final class C546910Lcf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C546940Lci LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ AIGCCreationModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546910Lcf(C546940Lci c546940Lci, String str, AIGCCreationModel aIGCCreationModel, InterfaceC1364105Vn<? super C546910Lcf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c546940Lci;
        this.LLILLL = str;
        this.LLILZ = aIGCCreationModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C546910Lcf(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCTaskHandleComponent@9d9c.observeWorkflowState$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AIGCTaskHandleComponent@9d9c.observeWorkflowState$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AICreateService aICreateServiceX1 = this.LLILLJJLI.X1();
            if (aICreateServiceX1 != null) {
                String str = this.LLILLL;
                AIGCCreationModel aIGCCreationModel = this.LLILZ;
                this.LL = 1;
                obj = aICreateServiceX1.jw(str, aIGCCreationModel, new C546660LcG(EnumC546990Lcn.GLOBAL_ASYNC_HANDLER));
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AIGCTaskHandleComponent@9d9c.observeWorkflowState$1$1");
                    return objLJFF;
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AIGCTaskHandleComponent@9d9c.observeWorkflowState$1$1");
            return unit2;
        }
        InterfaceC346201Wa interfaceC346201Wa = (InterfaceC346201Wa) obj;
        if (interfaceC346201Wa != null) {
            AgS100S1100000_8 agS100S1100000_8 = new AgS100S1100000_8(this.LLILLJJLI, this.LLILLL, 4);
            this.LL = 2;
            if (interfaceC346201Wa.collect(agS100S1100000_8, this) == objLJFF) {
                C1C7U.LIZIZ("AIGCTaskHandleComponent@9d9c.observeWorkflowState$1$1");
                return objLJFF;
            }
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("AIGCTaskHandleComponent@9d9c.observeWorkflowState$1$1");
            return unit3;
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("AIGCTaskHandleComponent@9d9c.observeWorkflowState$1$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
