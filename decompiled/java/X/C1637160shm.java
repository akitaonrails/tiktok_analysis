package X;

import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0shm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment$tryAMEPreload$1", f = "EffectTemplateCategoryFragment.kt", l = {}, m = "invokeSuspend")
public final class C1637160shm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EffectTemplateCategoryFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1637160shm(EffectTemplateCategoryFragment effectTemplateCategoryFragment, InterfaceC1364105Vn<? super C1637160shm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = effectTemplateCategoryFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1637160shm(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IEffectCreatorService iEffectCreatorService;
        InterfaceC1637170shn interfaceC1637170shnLIZ;
        C1C7U.LIZ("EffectTemplateCategoryFragment@9d8c.tryAMEPreload$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C1656550tD3.LIZ() && this.LL.getActivity() != null && (iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null)) != null) {
            InterfaceC1637200shq interfaceC1637200shqPreloadService = iEffectCreatorService.preloadService();
            if (interfaceC1637200shqPreloadService != null) {
                interfaceC1637200shqPreloadService.LIZJ();
            }
            InterfaceC1637200shq interfaceC1637200shqPreloadService2 = iEffectCreatorService.preloadService();
            if (interfaceC1637200shqPreloadService2 != null && (interfaceC1637170shnLIZ = interfaceC1637200shqPreloadService2.LIZ()) != null) {
                interfaceC1637170shnLIZ.LIZ(EnumC2274181Dzs.MAIN_TEMPLATE_CATEGORY_TAB);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectTemplateCategoryFragment@9d8c.tryAMEPreload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
