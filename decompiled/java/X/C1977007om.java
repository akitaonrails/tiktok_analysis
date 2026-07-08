package X;

import com.bef.effectsdk.EffectABConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07om, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1977007om {
    public static final JSONArray LIZ(String str) {
        String[] strArr = EffectABConfig.abDefaultInfo;
        if (strArr != null && strArr.length != 0) {
            CharSequence[] charSequenceArr = (CharSequence[]) Arrays.copyOf(strArr, strArr.length);
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            if (charSequenceArr.length > 0) {
                sb.append(charSequenceArr[0]);
                for (int i = 1; i < charSequenceArr.length; i++) {
                    sb.append((CharSequence) "");
                    sb.append(charSequenceArr[i]);
                }
            }
            String string = sb.toString();
            if (str != null) {
                if (str.length() != 0) {
                    z = false;
                }
                if (!z) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        JSONArray jSONArray2 = new JSONArray(string);
                        int length = jSONArray2.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            JSONObject jSONObject = (JSONObject) jSONArray2.get(i2);
                            if (jSONObject != null) {
                                String strOptString = jSONObject.optString("key");
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("effect_config_");
                                sbLIZ.append(str);
                                sbLIZ.append('_');
                                sbLIZ.append(strOptString);
                                jSONObject.put("license_key", C2188811AlT.LIZIZ(sbLIZ));
                                jSONArray.put(jSONObject);
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    return jSONArray;
                }
            }
            return new JSONArray(string);
        }
        return null;
    }
}
