package X;

import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.effectcreator.protocol.IAIEffectEntranceService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment$setupRecyclerView$2", f = "EffectTemplateCategoryFragment.kt", l = {723}, m = "invokeSuspend")
public final class C339720DTm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EffectTemplateCategoryFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C339720DTm(EffectTemplateCategoryFragment effectTemplateCategoryFragment, InterfaceC1364105Vn<? super C339720DTm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effectTemplateCategoryFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C339720DTm(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IAIEffectEntranceService iAIEffectEntranceServiceLJFF;
        C1C7U.LIZ("EffectTemplateCategoryFragment@9d8c.setupRecyclerView$2");
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
            IEffectCreatorService iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null);
            if (iEffectCreatorService != null && (iAIEffectEntranceServiceLJFF = iEffectCreatorService.LJFF()) != null) {
                this.LL = 1;
                obj = iAIEffectEntranceServiceLJFF.LIZIZ(false, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("EffectTemplateCategoryFragment@9d8c.setupRecyclerView$2");
                    return objLJFF;
                }
            }
            ((C1665620tRg) this.LLILLJJLI.LLJLLL.getValue()).LLILLJJLI = EnumC339730DTn.ONLY_CREATE_BTN;
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EffectTemplateCategoryFragment@9d8c.setupRecyclerView$2");
            return unit;
        }
        if (((Boolean) obj).booleanValue()) {
            ((C1665620tRg) this.LLILLJJLI.LLJLLL.getValue()).LLILLJJLI = EnumC339730DTn.CREATE_BTN_WITH_AI;
        } else {
            ((C1665620tRg) this.LLILLJJLI.LLJLLL.getValue()).LLILLJJLI = EnumC339730DTn.ONLY_CREATE_BTN;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EffectTemplateCategoryFragment@9d8c.setupRecyclerView$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
