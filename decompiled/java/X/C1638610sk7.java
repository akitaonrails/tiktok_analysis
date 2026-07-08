package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0sk7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1638610sk7 implements InterfaceC19882712qn<ProviderEffect, Effect> {
    public static Effect LIZ(ProviderEffect providerEffect) {
        Effect effect = new Effect();
        effect.setEffectId(providerEffect.getId());
        effect.setName(providerEffect.getTitle());
        effect.setUnzipPath(providerEffect.getPath());
        effect.setEffectType(10);
        if (providerEffect.isFromTenor()) {
            if (effect.getTags() != null) {
                effect.getTags().add("tenor");
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add("tenor");
                effect.setTags(arrayList);
                return effect;
            }
        }
        return effect;
    }

    @Override // X.InterfaceC19882712qn
    public final /* bridge */ /* synthetic */ Effect apply(ProviderEffect providerEffect) {
        return LIZ(providerEffect);
    }
}
