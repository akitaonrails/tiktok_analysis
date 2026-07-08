package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.p;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import java.io.IOException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nkw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446920nkw {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(String str, CommonMobParamModel commonMobParamModel) {
        String strLJII = null;
        if (!C2471909mP.LIZ(C2471909mP.LJIJJ(str, null))) {
            return 0;
        }
        try {
            C2259261Dbo c2259261DboLJIILLIIL = C2471909mP.LJIILLIIL(str);
            if (c2259261DboLJIILLIIL != null) {
                strLJII = c2259261DboLJIILLIIL.LJII("UserComment");
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AIGCManager -> getAIGCLabelTypeForImage -> path = ");
            sbLIZ.append(str);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("AIGCManager -> getAIGCLabelTypeForImage -> userComment = ");
            sbLIZ2.append(strLJII);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("getAIGCInfoFromMetadata failed: ");
            sbLIZ3.append(Log.getStackTraceString(e));
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ3));
        }
        if (strLJII == null || strLJII.length() == 0) {
            return 0;
        }
        new p();
        if (p.LIZJ(strLJII).LJIILIIL().LJJIIZ("aigc_info").toString().length() == 0) {
            return 0;
        }
        new p();
        JSONObject jSONObject = new JSONObject(p.LIZJ(strLJII).LJIILIIL().LJJIIZ("aigc_info").toString());
        if (C2283608x8.LIZ("meta_contain_auto_aigc") && jSONObject.has("aigc_label_type") && jSONObject.optInt("aigc_label_type") == 2) {
            if (!commonMobParamModel.aigcCreationSource.contains("meta_contain_auto_aigc")) {
                commonMobParamModel.aigcCreationSource.add("meta_contain_auto_aigc");
            }
            return 2;
        }
        if (C2283608x8.LIZ("extern_share") && jSONObject.has("source_info") && C123100dR.LIZ(jSONObject.optString("source_info")) && C2283508x7.LIZ(jSONObject.optString("source_info"))) {
            if (!commonMobParamModel.aigcCreationSource.contains("extern_share")) {
                commonMobParamModel.aigcCreationSource.add("extern_share");
            }
            return 2;
        }
        return 0;
    }

    public static void LIZIZ(int i, String str) {
        if (i == 2 && str != null && str.length() != 0 && C2471909mP.LIZ(C2471909mP.LJIJJ(str, null))) {
            JSONObject jSONObjectPut = new JSONObject().put("aigc_label_type", i);
            C2259261Dbo c2259261DboLJIILLIIL = C2471909mP.LJIILLIIL(str);
            if (c2259261DboLJIILLIIL != null) {
                c2259261DboLJIILLIIL.LJJIJIL(C786410Ut5.J3(new JSONObject().put("aigc_info", jSONObjectPut)));
                c2259261DboLJIILLIIL.LJJIIZI();
            }
        }
    }

    public static void LIZJ(String str, String str2) {
        String strLJII = null;
        if (C2471909mP.LIZ(C2471909mP.LJIJJ(str, null)) && C2471909mP.LIZ(C2471909mP.LJIJJ(str2, null))) {
            C2259261Dbo c2259261DboLJIILLIIL = C2471909mP.LJIILLIIL(str);
            if (c2259261DboLJIILLIIL != null) {
                strLJII = c2259261DboLJIILLIIL.LJII("UserComment");
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AIGCManager -> userComment = ");
            sbLIZ.append(strLJII);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            C2259261Dbo c2259261DboLJIILLIIL2 = C2471909mP.LJIILLIIL(str2);
            if (c2259261DboLJIILLIIL2 != null) {
                c2259261DboLJIILLIIL2.LJJIJIL(strLJII);
                if (C297370Bl9.LIZ()) {
                    try {
                        c2259261DboLJIILLIIL2.LJJIIZI();
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("AIGCManager -> saveAttributes failed = ");
                        sbLIZ2.append(C13SZ.LIZIZ(e));
                        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            }
        }
    }
}
