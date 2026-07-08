package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CeP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment$observeBottomBtn$1", f = "EffectTemplateCategoryFragment.kt", l = {915}, m = "invokeSuspend")
public final class C318670CeP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EffectTemplateCategoryFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318670CeP(EffectTemplateCategoryFragment effectTemplateCategoryFragment, InterfaceC1364105Vn<? super C318670CeP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effectTemplateCategoryFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318670CeP(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectTemplateCategoryFragment@9d8c.observeBottomBtn$1");
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
            EffectTemplateCategoryFragment effectTemplateCategoryFragment = this.LLILLJJLI;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C318680CeQ c318680CeQ = new C318680CeQ(effectTemplateCategoryFragment, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(effectTemplateCategoryFragment, state, c318680CeQ, this) == objLJFF) {
                C1C7U.LIZIZ("EffectTemplateCategoryFragment@9d8c.observeBottomBtn$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectTemplateCategoryFragment@9d8c.observeBottomBtn$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
