package X;

import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;

/* JADX INFO: renamed from: X.0sf9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1635530sf9 implements InterfaceC1635560sfC {
    public final InterfaceC1635390sev LIZ;

    public C1635530sf9(InterfaceC1635390sev interfaceC1635390sev) {
        this.LIZ = interfaceC1635390sev;
    }

    @Override // X.InterfaceC1635560sfC
    public final void LIZJ(EffectCategoryModel effectCategoryModel) {
        this.LIZ.lg(effectCategoryModel.getId(), effectCategoryModel.getTagsUpdateTime(), new IUpdateTagListener() { // from class: X.0sfA
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener
            public final void onFinally() {
            }
        });
    }

    @Override // X.InterfaceC1635560sfC
    public final void LIZLLL(Effect effect) {
        C1635550sfB c1635550sfB = new IUpdateTagListener() { // from class: X.0sfB
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener
            public final void onFinally() {
            }
        };
        if (effect != null) {
            this.LIZ.lg(effect.getId(), effect.getTagsUpdatedAt(), c1635550sfB);
        }
    }

    @Override // X.InterfaceC1635560sfC
    public final void LIZ(Effect effect, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        if (effect != null) {
            this.LIZ.mg(effect.getId(), effect.getTags(), effect.getTagsUpdatedAt(), iIsTagNeedUpdatedListener);
        }
    }

    @Override // X.InterfaceC1635560sfC
    public final void LIZIZ(EffectCategoryModel effectCategoryModel, C1635580sfE c1635580sfE) {
        if (effectCategoryModel != null) {
            this.LIZ.mg(effectCategoryModel.getId(), effectCategoryModel.getTags(), effectCategoryModel.getTagsUpdateTime(), c1635580sfE);
        }
    }
}
