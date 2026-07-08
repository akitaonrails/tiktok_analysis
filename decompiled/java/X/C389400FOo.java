package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0FOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389400FOo {
    public static final C01GW<C389400FOo> LJFF = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(59));
    public final Map<String, Effect> LIZ = new LinkedHashMap();
    public final Map<String, Effect> LIZIZ = new LinkedHashMap();
    public final Map<String, EffectChannelResponse> LIZJ = new LinkedHashMap();
    public final Map<String, List<CategoryEffectModel>> LIZLLL = new LinkedHashMap();
    public final Map<String, String> LJ = new LinkedHashMap();

    public final void LIZ(String str, CategoryEffectModel categoryEffectModel) {
        if (!this.LIZLLL.containsKey(str)) {
            this.LIZLLL.put(str, new ArrayList());
        }
        List list = (List) ((LinkedHashMap) this.LIZLLL).get(str);
        if (list != null) {
            list.add(categoryEffectModel);
        }
    }

    public final Effect LIZIZ(String str, String str2) {
        Map<String, Effect> map = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('-');
        sbLIZ.append(str2);
        return (Effect) ((LinkedHashMap) map).get(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZJ(Effect effect, String str, String str2) {
        Map<String, Effect> map = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('-');
        sbLIZ.append(str2);
        map.put(C2188811AlT.LIZIZ(sbLIZ), effect);
        String effectId = effect.getEffectId();
        if (!a0.LJJJIL(effectId)) {
            this.LIZIZ.put(effectId, effect);
        }
    }
}
