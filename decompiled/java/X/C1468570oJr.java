package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468570oJr {
    public static void LIZ(C1468170oJD c1468170oJD) {
        long j = c1468170oJD.LLLLIL;
        if (j > 0) {
            double d = j / 1024.0f;
            int i = c1468170oJD.LLLZZ;
            if (i == 4) {
                if (d > 80.0d) {
                    c1468170oJD.B2 = 4.139d - (Math.exp(d * (-0.02755d)) * 2.856d);
                    return;
                } else {
                    c1468170oJD.B2 = 3.213d - (Math.exp(d * (-0.03197d)) * 2.058d);
                    return;
                }
            }
            if (i == 28) {
                if (d > 80.0d) {
                    c1468170oJD.B2 = 2.799d - (Math.exp(d * (-0.02233d)) * 1.601d);
                    return;
                } else {
                    c1468170oJD.B2 = 2.870739d - (Math.exp(d * (-0.036627d)) * 1.276269d);
                    return;
                }
            }
            if (d > 80.0d) {
                c1468170oJD.B2 = 4.696198d - (Math.exp(d * (-0.02749d)) * 3.643856d);
            } else {
                c1468170oJD.B2 = 2.880051d - (Math.exp(d * (-0.032915d)) * 1.865473d);
            }
        }
    }

    public static HashMap<String, Object> LIZIZ(String str, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        HashMap<String, Object> map = new HashMap<>();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!z) {
                    str2 = "audio_meta_ladder";
                } else {
                    str2 = "audio_meta_origin";
                }
                String strOptString = jSONObject.optString(str2);
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObject2 = new JSONObject(strOptString);
                    if (!z) {
                        String strOptString2 = jSONObject2.optString("Normal");
                        if (!TextUtils.isEmpty(strOptString2)) {
                            jSONObject2 = new JSONObject(strOptString2);
                        }
                    }
                    if (jSONObject2.has("TACM")) {
                        ArrayList<Float> arrayListLJIILLIIL = C795730VJj.LJIILLIIL(JSONObjectProtectorUtils.getJSONArray(jSONObject2, "TACM"));
                        if (z) {
                            str13 = "a_tacm";
                        } else {
                            str13 = "g_a_tacm";
                        }
                        C799510VXx.LJFF(str13, arrayListLJIILLIIL, map);
                    }
                    if (jSONObject2.has("RCD")) {
                        ArrayList<Float> arrayListLJIILLIIL2 = C795730VJj.LJIILLIIL(JSONObjectProtectorUtils.getJSONArray(jSONObject2, "RCD"));
                        if (z) {
                            str12 = "a_rcd";
                        } else {
                            str12 = "g_a_rcd";
                        }
                        C799510VXx.LJFF(str12, arrayListLJIILLIIL2, map);
                    }
                    if (jSONObject2.has("BE")) {
                        ArrayList<Float> arrayListLJIILLIIL3 = C795730VJj.LJIILLIIL(JSONObjectProtectorUtils.getJSONArray(jSONObject2, "BE"));
                        if (z) {
                            str11 = "a_be";
                        } else {
                            str11 = "g_a_be";
                        }
                        C799510VXx.LJFF(str11, arrayListLJIILLIIL3, map);
                    }
                    if (jSONObject2.has("OCF")) {
                        ArrayList<Float> arrayListLJIILLIIL4 = C795730VJj.LJIILLIIL(JSONObjectProtectorUtils.getJSONArray(jSONObject2, "OCF"));
                        if (z) {
                            str10 = "a_ocf";
                        } else {
                            str10 = "g_a_ocf";
                        }
                        C799510VXx.LJFF(str10, arrayListLJIILLIIL4, map);
                    }
                    if (jSONObject2.has("TRS")) {
                        ArrayList<Float> arrayListLJIILLIIL5 = C795730VJj.LJIILLIIL(JSONObjectProtectorUtils.getJSONArray(jSONObject2, "TRS"));
                        if (z) {
                            str9 = "a_trs";
                        } else {
                            str9 = "g_a_trs";
                        }
                        C799510VXx.LJFF(str9, arrayListLJIILLIIL5, map);
                    }
                    if (jSONObject2.has("TS")) {
                        JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject2, "TS");
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            try {
                                arrayList.add(JSONArrayProtectorUtils.getString(jSONArray, i));
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        if (!z) {
                            str8 = "g_a_ts";
                        } else {
                            str8 = "a_ts";
                        }
                        C799510VXx.LJFF(str8, arrayList, map);
                    }
                    if (jSONObject2.has("DRR")) {
                        float fOptDouble = (float) jSONObject2.optDouble("DRR");
                        if (z) {
                            str7 = "a_drr";
                        } else {
                            str7 = "g_a_drr";
                        }
                        C799510VXx.LIZLLL(str7, fOptDouble, map);
                    }
                    if (jSONObject2.has("MP")) {
                        float fOptDouble2 = (float) jSONObject2.optDouble("MP");
                        if (z) {
                            str6 = "a_mp";
                        } else {
                            str6 = "g_a_mp";
                        }
                        C799510VXx.LIZLLL(str6, fOptDouble2, map);
                    }
                    if (jSONObject2.has("DO")) {
                        float fOptDouble3 = (float) jSONObject2.optDouble("DO");
                        if (z) {
                            str5 = "a_do";
                        } else {
                            str5 = "g_a_do";
                        }
                        C799510VXx.LIZLLL(str5, fOptDouble3, map);
                    }
                    if (jSONObject2.has("CTPS")) {
                        float fOptDouble4 = (float) jSONObject2.optDouble("CTPS");
                        if (z) {
                            str4 = "a_ctps";
                        } else {
                            str4 = "g_a_ctps";
                        }
                        C799510VXx.LIZLLL(str4, fOptDouble4, map);
                    }
                    if (jSONObject2.has("IL")) {
                        float fOptDouble5 = (float) jSONObject2.optDouble("IL");
                        if (z) {
                            str3 = "a_il";
                        } else {
                            str3 = "g_a_il";
                        }
                        C799510VXx.LIZLLL(str3, fOptDouble5, map);
                        return map;
                    }
                }
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return map;
    }
}
