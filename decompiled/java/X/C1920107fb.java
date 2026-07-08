package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07fb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1920107fb {
    public static final Regex LIZ = new Regex("serverCode=(-?\\d+)");

    public static final String LIZ(String str) {
        boolean z;
        int iIntValue;
        String string = a0.LJLIIIL(str).toString();
        if (u.LJJIIJZLJL(string, "{", false)) {
            return string;
        }
        Integer numValueOf = Integer.valueOf(a0.LJJJ(string, "serverMessage=", 0, false, 6));
        if (numValueOf.intValue() >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Integer numValueOf2 = Integer.valueOf(a0.LJJIZ(string, '{', numValueOf.intValue() + 14, false, 4));
            if (numValueOf2.intValue() >= 0 && (iIntValue = numValueOf2.intValue()) >= 0 && iIntValue < string.length() && string.charAt(iIntValue) == '{') {
                int length = string.length();
                boolean z2 = false;
                boolean z3 = false;
                int i = 0;
                for (int i2 = iIntValue; i2 < length; i2++) {
                    char cCharAt = string.charAt(i2);
                    if (z2) {
                        z2 = false;
                    } else if (z3) {
                        if (cCharAt != '\"') {
                            if (cCharAt == '\\') {
                                z2 = true;
                            }
                        } else {
                            z3 = false;
                        }
                    } else if (cCharAt != '\"') {
                        if (cCharAt != '{') {
                            if (cCharAt == '}' && i - 1 == 0) {
                                return string.substring(iIntValue, i2 + 1);
                            }
                        } else {
                            i++;
                        }
                    } else {
                        z3 = true;
                    }
                }
            }
        }
        return null;
    }

    public static final C1920207fc LIZIZ(String str) {
        Object c098200Yq;
        try {
            String strLIZ = LIZ(str);
            if (strLIZ == null) {
                c098200Yq = new C1920207fc(0);
            } else {
                JSONObject jSONObject = new JSONObject(strLIZ);
                c098200Yq = new C1920207fc(jSONObject.optString("input_moderation_status"), jSONObject.optString("input_violation_reasons"), jSONObject.optString("output_violation_reasons"), jSONObject.optString("output_moderation_status"), jSONObject.optString("output_moderation"));
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = new C1920207fc(0);
        }
        return (C1920207fc) c098200Yq;
    }
}
