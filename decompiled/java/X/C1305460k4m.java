package X;

import com.bytedance.android.starship.solaria.profile.IStarshipSolariaProfile;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k4m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305460k4m extends FeatureProducer {
    public static final C1305460k4m LIZIZ = new C1305460k4m();
    public static String LIZJ = "f_solaria_portrait";
    public static final Map<String, Object> LIZLLL = new LinkedHashMap();
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(64));

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LIZJ;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LIZJ = str;
    }

    public static JSONObject LIZ(String str, JSONObject jSONObject) throws JSONException {
        Integer numValueOf;
        JSONArray jSONArrayOptJSONArray;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getDictFeature in featureName:");
        sbLIZ.append(str);
        sbLIZ.append(" params.size:");
        JSONObject jSONObject2 = null;
        if (jSONObject != null) {
            numValueOf = Integer.valueOf(jSONObject.length());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("keys")) != null) {
            jSONObject2 = new JSONObject();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i);
                jSONObject2.put(strOptString, C1510700pPo.LIZ().LIZJ(strOptString));
            }
        }
        return jSONObject2;
    }

    public static Map LIZIZ(Object obj, String str) {
        JSONObject jSONObject;
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        Object objValueOf;
        try {
            if (!(obj instanceof String) || (jSONArrayOptJSONArray = (jSONObject = new JSONObject((String) obj)).optJSONArray("key")) == null || (jSONArrayOptJSONArray2 = jSONObject.optJSONArray("value")) == null) {
                return null;
            }
            int iMin = Math.min(jSONArrayOptJSONArray.length(), jSONArrayOptJSONArray2.length());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < iMin; i++) {
                Object objOpt = jSONArrayOptJSONArray.opt(i);
                if (objOpt instanceof Number) {
                    objValueOf = Integer.valueOf(((Number) objOpt).intValue());
                } else {
                    objValueOf = String.valueOf(objOpt);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('_');
                sbLIZ.append(objValueOf);
                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), Double.valueOf(jSONArrayOptJSONArray2.optDouble(i, 0.0d)));
            }
            LIZLLL.put(str, linkedHashMap);
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1337780kuu.LIZ(th, null, 6);
            LIZLLL.put(str, new LinkedHashMap());
            return null;
        }
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final Object getFeatureInternal(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) {
        String str3;
        String strLJ;
        Double dLJII;
        if (returnCode != null) {
            try {
                returnCode.code = 200;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (returnCode != null) {
                    returnCode.code = 3;
                }
                C1337780kuu.LIZ(th, null, 6);
                return null;
            }
        }
        if (Intrinsics.LJFF(str, "batch_feature")) {
            return LIZ(str, jSONObject);
        }
        if (Intrinsics.LJFF(str, "portrait_all")) {
            return C1510700pPo.LIZ().LJI();
        }
        if (jSONObject == null) {
            strLJ = C1510700pPo.LIZ().LIZJ(str);
            if (strLJ == null) {
                if (returnCode != null) {
                    returnCode.code = 1;
                }
                return null;
            }
        } else {
            Object objOpt = jSONObject.opt("portrait_group");
            if (objOpt instanceof String) {
                str3 = (String) objOpt;
            } else {
                str3 = null;
            }
            if (str3 == null) {
                if (returnCode != null) {
                    returnCode.code = 1;
                }
                return null;
            }
            IStarshipSolariaProfile iStarshipSolariaProfile = (IStarshipSolariaProfile) LJ.getValue();
            if (iStarshipSolariaProfile != null) {
                strLJ = iStarshipSolariaProfile.LJ(str3, str);
            } else {
                strLJ = null;
            }
        }
        if (strLJ != null && (dLJII = C2327809Ae.LJII(strLJ)) != null) {
            dLJII.doubleValue();
            return strLJ;
        }
        Object obj = ((LinkedHashMap) LIZLLL).get(str);
        if (obj == null) {
            Map mapLIZIZ = LIZIZ(strLJ, str);
            if (mapLIZIZ == null) {
                if (returnCode != null) {
                    returnCode.code = 1;
                }
                return null;
            }
            return mapLIZIZ;
        }
        return obj;
    }
}
