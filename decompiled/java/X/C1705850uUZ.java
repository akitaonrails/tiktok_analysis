package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* JADX INFO: renamed from: X.0uUZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1705850uUZ extends AbstractC1705790uUT<Effect> {
    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Object] */
    @Override // X.AbstractC1705790uUT
    public final Effect LJ(CategoryPageModel categoryPageModel) {
        CategoryEffectModel categoryEffects;
        List<Effect> effects;
        if (categoryPageModel != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null) {
            return C13LP.LJJJLL(effects);
        }
        return null;
    }
}
