package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: X.0FGP, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FGP {
    public static final List<C0FGZ> LIZ(EffectChannelResponse effectChannelResponse) {
        List<EffectCategoryResponse> categoryResponseList = effectChannelResponse.getCategoryResponseList();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(categoryResponseList, 10));
        for (EffectCategoryResponse effectCategoryResponse : categoryResponseList) {
            arrayList.add(new C0FGZ(effectCategoryResponse.getKey(), effectCategoryResponse.getName(), effectCategoryResponse.getExtra()));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((C0FGZ) obj).LIZ)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final List<C0FGS> LIZIZ(EffectChannelResponse effectChannelResponse) {
        ArrayList arrayList = new ArrayList();
        for (EffectCategoryResponse effectCategoryResponse : effectChannelResponse.getCategoryResponseList()) {
            ArrayList arrayList2 = new ArrayList();
            for (Effect effect : effectCategoryResponse.getTotalEffects()) {
                arrayList2.add(new C0FGT(effect, effect.getPanel(), false, EnumC1641420soe.NOT_DOWNLOAD, 0, null));
            }
            arrayList.add(new C0FGS(arrayList2, effectCategoryResponse.getKey(), effectCategoryResponse.getName(), effectCategoryResponse.getExtra()));
        }
        return arrayList;
    }
}
