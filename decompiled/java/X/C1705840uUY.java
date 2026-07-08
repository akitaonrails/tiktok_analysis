package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uUY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1705840uUY extends AbstractC1705790uUT<C1705860uUa> {
    /* JADX WARN: Type inference failed for: r3v3, types: [X.0uUa] */
    @Override // X.AbstractC1705790uUT
    public final C1705860uUa LJ(CategoryPageModel categoryPageModel) {
        String str;
        List<Effect> effects;
        if (categoryPageModel == null) {
            return null;
        }
        List<String> url_prefix = categoryPageModel.getUrl_prefix();
        if (url_prefix != null) {
            str = (String) C13LP.LJJJLL(url_prefix);
        } else {
            str = null;
            if (categoryPageModel == null) {
                return null;
            }
        }
        CategoryEffectModel categoryEffects = categoryPageModel.getCategoryEffects();
        if (categoryEffects == null || (effects = categoryEffects.getEffects()) == null) {
            return null;
        }
        Iterator<Effect> it2 = effects.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        Effect next = it2.next();
        String strLIZJ = AbstractC1705830uUX.LIZJ(AbstractC1705830uUX.LIZ(next), "modelpic");
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        String extra = next.getExtra();
        if (extra != null) {
            new JSONObject(extra).optString("scalefactor", "");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(strLIZJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        next.getName();
        return new Object(strLIZIZ, next.getUnzipPath(), next.getEffect_id(), next.getResource_id()) { // from class: X.0uUa
            public final String LIZ;
            public final String LIZIZ;
            public final String LIZJ;
            public final String LIZLLL;
            public String LJ = "";
            public String LJFF = "";

            {
                this.LIZ = strLIZIZ;
                this.LIZIZ = str;
                this.LIZJ = str;
                this.LIZLLL = str;
            }
        };
    }
}
