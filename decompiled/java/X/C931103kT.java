package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03kT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C931103kT {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public List<C930103kJ> LJII = new ArrayList();
    public Map<String, C930103kJ> LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public String LJIILIIL;
    public List<C931103kT> LJIILJJIL;

    public final List<C931103kT> LIZ() {
        ArrayList arrayList = new ArrayList();
        List<C931103kT> list = this.LJIILJJIL;
        if (list != null) {
            Iterator<C931103kT> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.addAll(it2.next().LIZ());
            }
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{mPaymentMethodId='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mPaymentMethod='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mIconUrl='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mDarkModeIconUrl='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", mPaymentMethodType='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mDisplayName='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append(", mStarlingKey='");
        sbLIZ.append(this.LJI);
        sbLIZ.append('\'');
        sbLIZ.append(", mElements=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", mElementMap=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", mMaxLimitedAmount='");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mMinLimitedAmount='");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mCurrency='");
        sbLIZ.append((String) null);
        sbLIZ.append('\'');
        sbLIZ.append(", mIsPciSensitive=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", mIsSaveAble=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", mPackageName='");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append('\'');
        sbLIZ.append(", mSubPaymentMethods='");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C931103kT(JSONObject jSONObject) {
        this.LJIIIIZZ = new HashMap();
        this.LIZ = jSONObject.optString("payment_method_id");
        this.LIZIZ = jSONObject.optString("payment_method");
        this.LIZJ = jSONObject.optString("icon_url");
        this.LIZLLL = jSONObject.optString("dark_mode_icon_url");
        this.LJ = jSONObject.optString("payment_method_type");
        this.LJFF = jSONObject.optString("display_name");
        this.LJI = jSONObject.optString("starling_key");
        this.LJIIIZ = jSONObject.optString("max_limited_amount");
        this.LJIIJ = jSONObject.optString("min_limited_amount");
        this.LJIIJJI = jSONObject.optBoolean("pci_sensitive");
        this.LJIIL = jSONObject.optBoolean("saveable");
        this.LJIILIIL = jSONObject.optString("package_name");
        this.LJIIIIZZ = new HashMap();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("elements");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                try {
                    C930103kJ c930103kJ = new C930103kJ((JSONObject) jSONArrayOptJSONArray.get(i));
                    ((ArrayList) this.LJII).add(c930103kJ);
                    ((ArrayList) this.LJII).addAll(c930103kJ.LJIIIIZZ);
                    for (C930103kJ c930103kJ2 : (ArrayList) c930103kJ.LJIIIIZZ) {
                        ((HashMap) this.LJIIIIZZ).put(c930103kJ2.LIZ, c930103kJ2);
                    }
                    ((HashMap) this.LJIIIIZZ).put(c930103kJ.LIZ, c930103kJ);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        this.LJIILJJIL = new ArrayList();
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("sub_payment_methods");
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                try {
                    ((ArrayList) this.LJIILJJIL).add(new C931103kT((JSONObject) jSONArrayOptJSONArray2.get(i2)));
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        ((ArrayList) this.LJIILJJIL).addAll(LIZ());
    }
}
