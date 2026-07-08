package X;

import com.ss.android.ugc.profile.business.effect.EffectProfileListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XqX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.effect.EffectProfileListViewModel$updateBannerState$1", f = "EffectProfileListViewModel.kt", l = {146}, m = "invokeSuspend")
public final class C861270XqX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EffectProfileListViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861270XqX(EffectProfileListViewModel effectProfileListViewModel, InterfaceC1364105Vn<? super C861270XqX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effectProfileListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861270XqX(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC861260XqW enumC861260XqW;
        C1C7U.LIZ("EffectProfileListViewModel@8e3d.updateBannerState$1");
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
            EffectProfileListViewModel effectProfileListViewModel = this.LLILLJJLI;
            if (effectProfileListViewModel.LLJILJILJ) {
                enumC861260XqW = EnumC861260XqW.EFFECT_CREATOR;
            } else {
                enumC861260XqW = EnumC861260XqW.GONE;
            }
            C2252321DDq c2252321DDq = effectProfileListViewModel.LLIZLLLIL;
            this.LL = 1;
            c2252321DDq.setValue(enumC861260XqW);
            if (Unit.LIZ == objLJFF) {
                C1C7U.LIZIZ("EffectProfileListViewModel@8e3d.updateBannerState$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectProfileListViewModel@8e3d.updateBannerState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
