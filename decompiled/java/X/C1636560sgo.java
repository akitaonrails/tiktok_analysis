package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.guidesubmit.b;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.EffectPublishedExtraData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sgo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment$activityResult$1$1", f = "EffectTemplateCategoryFragment.kt", l = {207}, m = "invokeSuspend")
public final class C1636560sgo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EffectTemplateCategoryFragment LLILLJJLI;
    public final /* synthetic */ EffectPublishedExtraData LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1636560sgo(EffectTemplateCategoryFragment effectTemplateCategoryFragment, EffectPublishedExtraData effectPublishedExtraData, String str, InterfaceC1364105Vn<? super C1636560sgo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effectTemplateCategoryFragment;
        this.LLILLL = effectPublishedExtraData;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1636560sgo(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZJ;
        C1C7U.LIZ("EffectTemplateCategoryFragment@9d8c.activityResult$1$1");
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
            EffectPublishedExtraData effectPublishedExtraData = this.LLILLL;
            this.LL = 1;
            effectTemplateCategoryFragment.getClass();
            if (!C1656550tD3.LIZ()) {
                objLIZJ = Unit.LIZ;
            } else {
                ShortVideoContext shortVideoContext = effectTemplateCategoryFragment.LL;
                if (shortVideoContext == null) {
                    shortVideoContext = null;
                }
                b bVar = effectTemplateCategoryFragment.LLILZLL;
                InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(effectTemplateCategoryFragment.bS());
                InterfaceC1623190sLF interfaceC1623190sLF = effectTemplateCategoryFragment.LLILZ;
                int i2 = effectTemplateCategoryFragment.LLJILJIL;
                MyEffectsViewModel myEffectsViewModelZR = effectTemplateCategoryFragment.ZR();
                C1630880sXe c1630880sXe = effectTemplateCategoryFragment.LLJJ;
                if (c1630880sXe == null) {
                    c1630880sXe = null;
                }
                objLIZJ = C1636790shB.LIZJ(effectPublishedExtraData, shortVideoContext, bVar, viewModelScope, interfaceC1623190sLF, i2, myEffectsViewModelZR, c1630880sXe.LIZIZ, effectTemplateCategoryFragment.getViewLifecycleOwner(), this);
                if (objLIZJ != C099R.LJFF()) {
                    objLIZJ = Unit.LIZ;
                }
            }
            if (objLIZJ == objLJFF) {
                C1C7U.LIZIZ("EffectTemplateCategoryFragment@9d8c.activityResult$1$1");
                return objLJFF;
            }
        }
        EffectTemplateCategoryFragment.dS(this.LLILLJJLI, this.LLILZ, null, false, 6);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectTemplateCategoryFragment@9d8c.activityResult$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
