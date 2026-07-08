package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility;
import com.ss.android.ugc.aweme.translation.ui.TranslationControlsAssem;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Rjx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.translation.ui.TranslationControlsAssem$setRollbackFromWeakenButton$1", f = "TranslationControlsAssem.kt", l = {}, m = "invokeSuspend")
public final class C704310Rjx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TranslationControlsAssem LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C704310Rjx(TranslationControlsAssem translationControlsAssem, boolean z, InterfaceC1364105Vn<? super C704310Rjx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = translationControlsAssem;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C704310Rjx(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TranslationControlsAssem@ee1.setRollbackFromWeakenButton$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C017O.LIZ()) {
            TranslationControlsAssem translationControlsAssem = this.LL;
            translationControlsAssem.LLLFF = this.LLILLJJLI;
            boolean z = false;
            C0S5G c0s5g = (C0S5G) ((AssemViewModel) translationControlsAssem.LLL.getValue(translationControlsAssem, TranslationControlsAssem.LLLFZ[0])).getState();
            TranslationControlsAssem translationControlsAssem2 = this.LL;
            if (translationControlsAssem2.LLLFF) {
                C0S5P c0s5p = c0s5g.LL;
                if (!c0s5g.LLILZLL && !(c0s5p instanceof C709290Rrz)) {
                    z = true;
                }
            }
            translationControlsAssem2.Ep(z);
            TranslationAbility translationAbility = (TranslationAbility) this.LL.LLJZ.getValue();
            if (translationAbility != null) {
                translationAbility.gh(this.LLILLJJLI);
            }
            InteractAreaCommonAbility interactAreaCommonAbilityBp = this.LL.Bp();
            if (interactAreaCommonAbilityBp != null) {
                this.LL.getClass();
                interactAreaCommonAbilityBp.CL("left_container_see_translation", this.LL, z);
            }
        } else {
            this.LL.Ep(this.LLILLJJLI);
            TranslationAbility translationAbility2 = (TranslationAbility) this.LL.LLJZ.getValue();
            if (translationAbility2 != null) {
                translationAbility2.gh(this.LLILLJJLI);
            }
            InteractAreaCommonAbility interactAreaCommonAbilityBp2 = this.LL.Bp();
            if (interactAreaCommonAbilityBp2 != null) {
                this.LL.getClass();
                interactAreaCommonAbilityBp2.CL("left_container_see_translation", this.LL, this.LLILLJJLI);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TranslationControlsAssem@ee1.setRollbackFromWeakenButton$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
