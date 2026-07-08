package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lf3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.creation.generation.component.AITheaterGenerationDraftComponent$saveDraft$1$finalResult$1", f = "AITheaterGenerationDraftComponent.kt", l = {123}, m = "invokeSuspend")
public final class C548390Lf3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>>, Object> {
    public int LL;
    public final /* synthetic */ C548370Lf1 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C548390Lf3(C548370Lf1 c548370Lf1, InterfaceC1364105Vn<? super C548390Lf3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c548370Lf1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C548390Lf3(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objX1;
        C1C7U.LIZ("AITheaterGenerationDraftComponent@85c0.saveDraft$1$finalResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objX1 = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C548370Lf1 c548370Lf1 = this.LLILLJJLI;
            this.LL = 1;
            objX1 = c548370Lf1.X1(this);
            if (objX1 == objLJFF) {
                C1C7U.LIZIZ("AITheaterGenerationDraftComponent@85c0.saveDraft$1$finalResult$1");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objX1);
        C1C7U.LIZIZ("AITheaterGenerationDraftComponent@85c0.saveDraft$1$finalResult$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
