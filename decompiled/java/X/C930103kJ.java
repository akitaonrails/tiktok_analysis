package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03kJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C930103kJ {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public List<C2282121EUg> LIZLLL;
    public final String LJ;
    public final String LJFF;
    public String LJI;
    public final String LJII;
    public final List<C930103kJ> LJIIIIZZ;
    public Object LJIIIZ;

    public final List<C930103kJ> LIZ() {
        ArrayList arrayList = new ArrayList();
        List<C930103kJ> list = this.LJIIIIZZ;
        if (list != null) {
            Iterator<C930103kJ> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.addAll(it2.next().LIZ());
            }
        }
        return arrayList;
    }

    public final boolean LIZIZ() {
        return TextUtils.equals(this.LJ, "R");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{mElement='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mIconUrl='");
        sbLIZ.append((String) null);
        sbLIZ.append('\'');
        sbLIZ.append(", mDarkIconUrl='");
        sbLIZ.append((String) null);
        sbLIZ.append('\'');
        sbLIZ.append(", mStartlingKey='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mStyleType='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mFrontendRuleJsonArray=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", mFrontendRuleList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mDisplayTag='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mParamName='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append(", mParamValue='");
        sbLIZ.append(this.LJI);
        sbLIZ.append('\'');
        sbLIZ.append(", mOptions=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", mPlaceHolder='");
        sbLIZ.append((String) null);
        sbLIZ.append('\'');
        sbLIZ.append(", mDisplayOrder='");
        sbLIZ.append(this.LJII);
        sbLIZ.append('\'');
        sbLIZ.append(", mSubElementList=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C930103kJ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.LIZ = jSONObject.optString("element");
        this.LIZIZ = jSONObject.optString("starling_key");
        this.LIZJ = jSONObject.optString("style_type");
        this.LJ = jSONObject.optString("display_tag");
        this.LJFF = jSONObject.optString("param_name");
        this.LJII = jSONObject.optString("display_order");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("sub_element_list");
        this.LJIIIIZZ = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                try {
                    this.LJIIIIZZ.add(new C930103kJ((JSONObject) jSONArrayOptJSONArray.get(i)));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        this.LJIIIIZZ.addAll(LIZ());
    }
}
