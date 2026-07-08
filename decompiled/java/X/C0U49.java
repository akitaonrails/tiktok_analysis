package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.p;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0U49, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U49 implements C0U3X<LiveEffect> {
    @Override // X.C0U3X
    public final List<C0U74<LiveEffect>> LJI(EffectChannelResponse effectChannelResponse) {
        ArrayList arrayList;
        String panel;
        List<Effect> allCategoryEffects;
        boolean zLJ;
        if (effectChannelResponse != null && (allCategoryEffects = effectChannelResponse.getAllCategoryEffects()) != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(allCategoryEffects, 10));
            int i = 0;
            for (Effect effect : allCategoryEffects) {
                int i2 = i + 1;
                if (i >= 0) {
                    Effect effect2 = effect;
                    LiveEffect liveEffectLIZLLL = C0UEO.LIZLLL(effect2);
                    C767250U7v.LIZIZ(2, liveEffectLIZLLL);
                    liveEffectLIZLLL.LLIIIILZ(effect2.getResourceId());
                    liveEffectLIZLLL.LJZ(Integer.valueOf(i));
                    liveEffectLIZLLL.LLJLIL(effectChannelResponse.getPanel());
                    liveEffectLIZLLL.LJIIJJI(effectChannelResponse.getPanel());
                    if (effect2.getExtra() != null) {
                        try {
                            new p();
                            k kVarLJJIIZ = p.LIZJ(effect2.getExtra()).LJIILIIL().LJJIIZ("is_none");
                            if (kVarLJJIIZ != null) {
                                zLJ = kVarLJJIIZ.LJ();
                            } else {
                                zLJ = false;
                            }
                            liveEffectLIZLLL.LJJLL(zLJ);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    arrayList2.add(liveEffectLIZLLL);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("perform composer's convert, effect size: ");
        sbLIZ.append(arrayList.size());
        sbLIZ.append('.');
        C2188811AlT.LIZIZ(sbLIZ);
        String str = "";
        C770170UJb.LIZLLL = "";
        if (arrayList.isEmpty()) {
            return C13BV.INSTANCE;
        }
        if (effectChannelResponse != null && (panel = effectChannelResponse.getPanel()) != null) {
            str = panel;
        }
        return Collections.singletonList(new C0U74(str, str, null, null, null, arrayList, null, 248));
    }
}
