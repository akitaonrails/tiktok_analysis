package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509290pNX {
    public static final /* synthetic */ int LIZ = 0;

    public static JSONObject LIZ(C1509310pNZ c1509310pNZ) throws JSONException {
        n nVar;
        String strLJIL;
        k kVarLJJIIZ;
        String str;
        String aid;
        JSONObject jSONObject = c1509310pNZ.LJIIIZ;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            c1509310pNZ.LJIIIZ = jSONObject;
        }
        Aweme awemeLIZ = C1511360pQs.LIZ(c1509310pNZ);
        if (awemeLIZ != null && (aid = awemeLIZ.getAid()) != null) {
            jSONObject.put("aid", aid);
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                try {
                    if (C2504209rc.LIZIZ == null && (str = C2504209rc.LIZ) != null) {
                        new p();
                        C2504209rc.LIZIZ = p.LIZJ(str).LJIILIIL();
                    }
                    nVar = C2504209rc.LIZIZ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJFF(e, "client_ai_crash");
                    nVar = C2504209rc.LIZIZ;
                }
                if (nVar != null && (kVarLJJIIZ = nVar.LJJIIZ(next)) != null) {
                    strLJIL = kVarLJJIIZ.LJIL();
                } else {
                    strLJIL = null;
                }
                if (strLJIL != null) {
                    jSONObject2.put(strLJIL, objOpt);
                }
            }
        }
        return jSONObject2;
    }

    public static void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
        if (c1510230pP3 != null && c1509310pNZ != null) {
            C1509170pNL c1509170pNL = C1509300pNY.LIZ;
            if (c1509170pNL == null) {
                c1509170pNL = C1509190pNN.LIZ;
            }
            c1509170pNL.LIZIZ(c1510230pP3, c1509310pNZ);
            Map<String, Object> map = c1509310pNZ.LJ;
            if (map != null) {
                map.isEmpty();
            }
        }
    }

    public static JSONObject LIZJ(String str, C1509310pNZ c1509310pNZ, String str2) {
        JSONObject jSONObjectLIZ = LIZ(c1509310pNZ);
        FeatureServiceManager.Companion.getClass();
        return C1510050pOl.LIZ().getFeatureSet(str, str2, jSONObjectLIZ);
    }
}
