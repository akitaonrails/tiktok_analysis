package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VY8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VY8 {
    public static final Pattern LIZ;

    static {
        PatternProtector.compile("\\\\.");
        LIZ = PatternProtector.compile("[\\\\\"/\b\f\n\r\t]");
    }

    public static String LIZIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = LIZ.matcher(str);
            StringBuffer stringBuffer = null;
            while (matcher.find()) {
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                }
                char cCharAt = matcher.group().charAt(0);
                if (cCharAt != '\f') {
                    if (cCharAt != '\r') {
                        if (cCharAt != '\"') {
                            if (cCharAt != '/') {
                                if (cCharAt != '\\') {
                                    switch (cCharAt) {
                                        case '\b':
                                            matcher.appendReplacement(stringBuffer, "\\\\b");
                                            break;
                                        case BdTuring.TYPE_ECAF /* 9 */:
                                            matcher.appendReplacement(stringBuffer, "\\\\t");
                                            break;
                                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                            matcher.appendReplacement(stringBuffer, "\\\\n");
                                            break;
                                    }
                                } else {
                                    matcher.appendReplacement(stringBuffer, "\\\\\\\\");
                                }
                            } else {
                                matcher.appendReplacement(stringBuffer, "\\\\/");
                            }
                        } else {
                            matcher.appendReplacement(stringBuffer, "\\\\\\\"");
                        }
                    } else {
                        matcher.appendReplacement(stringBuffer, "\\\\r");
                    }
                } else {
                    matcher.appendReplacement(stringBuffer, "\\\\f");
                }
            }
            if (stringBuffer == null) {
                return str;
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        }
        return str;
    }

    public static boolean LIZ(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            JSONObject jSONObject2 = (JSONObject) obj2;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!jSONObject2.has(next)) {
                    return false;
                }
                try {
                    C0W3J.LJIIIIZZ(next);
                    if (!LIZ(jSONObject.get(next), jSONObject2.get(next))) {
                        return false;
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            }
            return true;
        }
        if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
            JSONArray jSONArray = (JSONArray) obj;
            JSONArray jSONArray2 = (JSONArray) obj2;
            if (jSONArray.length() != jSONArray2.length()) {
                return false;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    if (!LIZ(jSONArray.get(i), jSONArray2.get(i))) {
                        return false;
                    }
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return false;
                }
            }
            return true;
        }
        return obj.equals(obj2);
    }
}
