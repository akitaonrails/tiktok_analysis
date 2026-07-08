package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS674S0100000_25;

/* JADX INFO: renamed from: X.0tOu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1663900tOu implements InterfaceC1664140tPI {
    public List<String> LIZ;

    @Override // X.InterfaceC1664140tPI
    public final void onDestroy() {
    }

    @Override // X.InterfaceC1664140tPI
    public final void LIZ(final InterfaceC1631620sYq<? super List<? extends Effect>, ? super Integer, ? super String, Unit> interfaceC1631620sYq) {
        C1663790tOj.LIZ().LIZ(new C120V() { // from class: X.0tOt
            @Override // X.C120V
            public final void LIZJ() {
            }

            @Override // X.C120V
            public final void LIZ(CategoryPageModel categoryPageModel) {
                List<String> url_prefix;
                List<Effect> effects;
                CategoryEffectModel categoryEffects;
                List<Effect> effects2;
                CategoryEffectModel categoryEffects2;
                C1663900tOu c1663900tOu = this.LIZ;
                if (categoryPageModel != null) {
                    url_prefix = categoryPageModel.getUrl_prefix();
                } else {
                    url_prefix = null;
                }
                c1663900tOu.LIZ = url_prefix;
                InterfaceC1631620sYq<List<? extends Effect>, Integer, String, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                if (categoryPageModel != null && (categoryEffects2 = categoryPageModel.getCategoryEffects()) != null) {
                    effects = categoryEffects2.getEffects();
                } else {
                    effects = null;
                }
                interfaceC1631620sYq2.invoke(effects, null, null);
                if (categoryPageModel != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null && (effects2 = categoryEffects.getEffects()) != null) {
                    effects2.isEmpty();
                }
            }

            @Override // X.C120V
            public final void LIZIZ(int i, String str) {
                interfaceC1631620sYq.invoke(null, Integer.valueOf(i), str);
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
