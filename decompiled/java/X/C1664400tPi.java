package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0tPi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664400tPi implements InterfaceC1664140tPI {
    @Override // X.InterfaceC1664140tPI
    public final void LIZ(InterfaceC1631620sYq<? super List<? extends Effect>, ? super Integer, ? super String, Unit> interfaceC1631620sYq) {
    }

    @Override // X.InterfaceC1664140tPI
    public final void onDestroy() {
        C2296208zA.LIZ().getClass();
        C2299808zk.LJFF.getValue().LIZ.LJIIIZ(1);
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
        interfaceC1631620sYq.invoke(effects, null, null);
    }
}
