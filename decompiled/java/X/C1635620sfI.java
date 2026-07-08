package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0sfI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1635620sfI extends C2217421BqW implements Function2<EffectCategoryModel, Integer, Unit> {
    public C1635620sfI(Object obj) {
        super(2, obj, AbstractC1635610sfH.class, "onTabClicked", "onTabClicked(Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryModel;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(EffectCategoryModel effectCategoryModel, Integer num) {
        int iIntValue = num.intValue();
        ((AbstractC1635610sfH) this.receiver).LJ(iIntValue, effectCategoryModel);
        return Unit.LIZ;
    }
}
