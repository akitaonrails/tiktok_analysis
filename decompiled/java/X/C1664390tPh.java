package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS674S0100000_25;

/* JADX INFO: renamed from: X.0tPh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664390tPh implements InterfaceC1664140tPI {
    @Override // X.InterfaceC1664140tPI
    public final void onDestroy() {
        C2296208zA.LIZ().getClass();
        C2299808zk.LJFF.getValue().LIZ.LJIIIZ(1);
    }

    @Override // X.InterfaceC1664140tPI
    public final void LIZ(InterfaceC1631620sYq<? super List<? extends Effect>, ? super Integer, ? super String, Unit> interfaceC1631620sYq) {
        final AwS674S0100000_25 awS674S0100000_25 = (AwS674S0100000_25) interfaceC1631620sYq;
        C2296208zA.LIZ().LIZIZ(new InterfaceC2247808rM() { // from class: X.0tPg
            @Override // X.InterfaceC2247808rM
            public final void LIZJ() {
            }

            @Override // X.InterfaceC2247808rM
            public final void LIZLLL(List<? extends List<? extends Effect>> list) {
            }

            @Override // X.InterfaceC2247808rM
            public final void LIZ(CategoryPageModel categoryPageModel) {
                List<Effect> effects;
                boolean z;
                CategoryEffectModel categoryEffects;
                List<Effect> effects2;
                CategoryEffectModel categoryEffects2;
                InterfaceC1631620sYq<List<? extends Effect>, Integer, String, Unit> interfaceC1631620sYq2 = awS674S0100000_25;
                if (categoryPageModel != null && (categoryEffects2 = categoryPageModel.getCategoryEffects()) != null) {
                    effects = categoryEffects2.getEffects();
                } else {
                    effects = null;
                }
                interfaceC1631620sYq2.invoke(effects, null, null);
                if (categoryPageModel != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null && (effects2 = categoryEffects.getEffects()) != null && !effects2.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C2281251EQx.LIZ.LJII("changer_voice", "", "", true);
                } else {
                    C2281251EQx.LIZ.LJII("changer_voice", "", "", false);
                }
            }

            @Override // X.InterfaceC2247808rM
            public final void LIZIZ(int i, String str) {
                C2281251EQx.LIZ.LJII("changer_voice", "", "", false);
                awS674S0100000_25.invoke(null, Integer.valueOf(i), str);
            }
        });
    }

    @Override // X.InterfaceC1664140tPI
    public final void LIZIZ(InterfaceC1631620sYq<? super List<? extends Effect>, ? super Integer, ? super String, Unit> interfaceC1631620sYq) {
        List<Effect> effects;
        CategoryEffectModel categoryEffects = C1446160nji.LIZ().getCategoryEffects();
        if (categoryEffects != null) {
            effects = categoryEffects.getEffects();
        } else {
            effects = null;
        }
        ((AwS674S0100000_25) interfaceC1631620sYq).invoke(effects, null, null);
    }
}
