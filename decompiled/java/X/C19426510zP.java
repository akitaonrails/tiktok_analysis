package X;

import com.google.gson.Gson;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.navi.core.EffectDependencyLoader;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviFeatureInfo;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviFeatureInfoValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10zP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19426510zP {
    public final C19EG LIZ;
    public final InterfaceC2254081DKk LIZIZ;
    public final InterfaceC1635390sev LIZJ;
    public C111S LJ;
    public EffectDependencyLoader LJFF;
    public boolean LJI;
    public Function0<Unit> LJIIIIZZ;
    public C11JF LJIIIZ;
    public final Gson LIZLLL = new Gson();
    public final List<Pair<Integer, String>> LJII = new ArrayList();

    public C19426510zP(C19EG c19eg, InterfaceC2254081DKk interfaceC2254081DKk, InterfaceC1635390sev interfaceC1635390sev) {
        this.LIZ = c19eg;
        this.LIZIZ = interfaceC2254081DKk;
        this.LIZJ = interfaceC1635390sev;
    }

    public final void LIZ(Effect effect, List list, List list2) {
        String str;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Effect effect2 = (Effect) it2.next();
            arrayList.add(new Pair(effect2.getEffect_id(), effect2.getUnzipPath()));
        }
        Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList);
        EffectDependencyLoader effectDependencyLoader = new EffectDependencyLoader(this.LIZ, this.LIZIZ);
        this.LJFF = effectDependencyLoader;
        if (effect != null) {
            effectDependencyLoader.LIZIZ(66668, 1L, 0L, effect.getUnzipPath());
            ((ArrayList) this.LJII).add(new Pair(66668, effect.getUnzipPath()));
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ProfileNaviFeatureInfo profileNaviFeatureInfo = (ProfileNaviFeatureInfo) it3.next();
            String unzipPath = (String) mapLJIILLIIL.get(profileNaviFeatureInfo.effectId);
            if (unzipPath != null) {
                if (effect != null) {
                    EffectDependencyLoader effectDependencyLoader2 = this.LJFF;
                    if (effectDependencyLoader2 != null) {
                        effectDependencyLoader2.LIZ(66666, 1L, unzipPath, effect.getUnzipPath());
                    }
                } else {
                    EffectDependencyLoader effectDependencyLoader3 = this.LJFF;
                    if (effectDependencyLoader3 != null) {
                        effectDependencyLoader3.LIZIZ(66666, 1L, 0L, unzipPath);
                    }
                }
                ((ArrayList) this.LJII).add(new Pair(66666, unzipPath));
            }
            String str2 = null;
            if (unzipPath == null) {
                if (effect != null) {
                    unzipPath = effect.getUnzipPath();
                } else {
                    unzipPath = null;
                }
            }
            ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue = profileNaviFeatureInfo.colorPicker;
            if (profileNaviFeatureInfoValue != null) {
                str = profileNaviFeatureInfoValue.key;
            } else {
                str = null;
            }
            LIZIZ(1L, str, unzipPath);
            ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue2 = profileNaviFeatureInfo.flip;
            if (profileNaviFeatureInfoValue2 != null) {
                str2 = profileNaviFeatureInfoValue2.key;
            }
            LIZIZ(1L, str2, unzipPath);
            LIZIZ(1L, profileNaviFeatureInfo.inspirationKey, unzipPath);
            List<ProfileNaviFeatureInfoValue> list3 = profileNaviFeatureInfo.sliders;
            if (list3 != null) {
                for (ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue3 : list3) {
                    LIZIZ(profileNaviFeatureInfoValue3.value, profileNaviFeatureInfoValue3.key, unzipPath);
                }
            }
        }
    }

    public final void LIZIZ(Long l, String str, String str2) {
        EffectDependencyLoader effectDependencyLoader;
        if (str != null && l != null && (effectDependencyLoader = this.LJFF) != null) {
            effectDependencyLoader.LIZ(66667, l.longValue(), str, str2);
        }
    }
}
