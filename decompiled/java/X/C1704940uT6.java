package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* JADX INFO: renamed from: X.0uT6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1704940uT6 extends AbstractC1705790uUT<List<? extends Effect>> {
    @Override // X.AbstractC1705790uUT
    public final List<? extends Effect> LJ(CategoryPageModel categoryPageModel) {
        List<Effect> effects;
        if (categoryPageModel == null) {
            return C13BV.INSTANCE;
        }
        CategoryEffectModel categoryEffects = categoryPageModel.getCategoryEffects();
        if (categoryEffects != null && (effects = categoryEffects.getEffects()) != null) {
            return effects;
        }
        return C13BV.INSTANCE;
    }
}
