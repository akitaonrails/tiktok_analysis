package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0U3W, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U3W implements C0U3X<LiveEffect> {
    @Override // X.C0U3X
    public final List<C0U74<LiveEffect>> LJI(EffectChannelResponse effectChannelResponse) {
        ArrayList arrayList;
        List<Effect> allCategoryEffects;
        if (effectChannelResponse != null && (allCategoryEffects = effectChannelResponse.getAllCategoryEffects()) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(allCategoryEffects, 10));
            Iterator<Effect> it2 = allCategoryEffects.iterator();
            while (it2.hasNext()) {
                arrayList.add(C0UEO.LIZLLL(it2.next()));
            }
        } else {
            arrayList = new ArrayList();
        }
        C770170UJb.LIZJ("VoiceEffect");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("perform voice's convert. effects size: ");
        sbLIZ.append(arrayList.size());
        C2188811AlT.LIZIZ(sbLIZ);
        C770170UJb.LIZLLL = "";
        if (arrayList.isEmpty()) {
            return C13BV.INSTANCE;
        }
        return Collections.singletonList(new C0U74("livesoundeffect", "livesoundeffect", null, null, null, arrayList, null, 248));
    }
}
