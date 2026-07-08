package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.00xL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C246500xL {
    public static boolean LIZ(JSONObject jSONObject, JSONObject jSONObject2, String str, StringBuilder sb) {
        String strLIZIZ;
        HashSet<String> hashSet = new HashSet();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            hashSet.add(itKeys.next());
        }
        int size = hashSet.size();
        HashSet hashSet2 = new HashSet();
        Iterator<String> itKeys2 = jSONObject2.keys();
        while (itKeys2.hasNext()) {
            hashSet2.add(itKeys2.next());
        }
        int size2 = hashSet2.size();
        if (size != size2) {
            sb.append("key_count_mismatch@");
            sb.append(str);
            sb.append(": ");
            sb.append(size);
            sb.append(" vs ");
            sb.append(size2);
            return false;
        }
        for (String str2 : hashSet) {
            if (!hashSet2.contains(str2)) {
                sb.append("missing_key@");
                sb.append(str);
                sb.append(": ");
                sb.append(str2);
                return false;
            }
            if (str.isEmpty()) {
                strLIZIZ = str2;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(e3.d);
                sbLIZ.append(str2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (!LIZIZ(jSONObject.opt(str2), jSONObject2.opt(str2), strLIZIZ, sb)) {
                return false;
            }
        }
        return true;
    }

    public static boolean LIZIZ(Object obj, Object obj2, String str, StringBuilder sb) {
        if (obj == obj2) {
            return true;
        }
        Object obj3 = JSONObject.NULL;
        if (obj == obj3) {
            obj = null;
        }
        if (obj2 == obj3) {
            obj2 = null;
        }
        if (obj != null && obj2 != null) {
            if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                return LIZ((JSONObject) obj, (JSONObject) obj2, str, sb);
            }
            if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                JSONArray jSONArray = (JSONArray) obj;
                JSONArray jSONArray2 = (JSONArray) obj2;
                int length = jSONArray.length();
                int length2 = jSONArray2.length();
                if (length != length2) {
                    sb.append("array_len_mismatch@");
                    sb.append(str);
                    sb.append(": ");
                    sb.append(length);
                    sb.append(" vs ");
                    sb.append(length2);
                } else {
                    for (int i = 0; i < length; i++) {
                        if (LIZIZ(jSONArray.opt(i), jSONArray2.opt(i), C786410Ut5.k4(Locale.US, "%s[%d]", new Object[]{str, Integer.valueOf(i)}), sb)) {
                        }
                    }
                    return true;
                }
                return false;
            }
            if ((obj instanceof Number) && (obj2 instanceof Number)) {
                double dDoubleValue = ((Number) obj).doubleValue();
                double dDoubleValue2 = ((Number) obj2).doubleValue();
                if (Double.compare(dDoubleValue, dDoubleValue2) == 0) {
                    return true;
                }
                sb.append("number_mismatch@");
                sb.append(str);
                sb.append(": ");
                sb.append(dDoubleValue);
                sb.append(" vs ");
                sb.append(dDoubleValue2);
                return false;
            }
            if ((obj instanceof Boolean) && (obj2 instanceof Boolean)) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                if (zBooleanValue == zBooleanValue2) {
                    return true;
                }
                sb.append("bool_mismatch@");
                sb.append(str);
                sb.append(": ");
                sb.append(zBooleanValue);
                sb.append(" vs ");
                sb.append(zBooleanValue2);
                return false;
            }
            if ((obj instanceof String) && (obj2 instanceof String)) {
                String str2 = (String) obj;
                String str3 = (String) obj2;
                if (str2.equals(str3)) {
                    return true;
                }
                sb.append("string_mismatch@");
                sb.append(str);
                sb.append(": ");
                sb.append(str2);
                sb.append(" vs ");
                sb.append(str3);
                return false;
            }
            sb.append("type_mismatch@");
            sb.append(str);
            sb.append(": ");
            sb.append(obj.getClass().getSimpleName());
            sb.append(" vs ");
            sb.append(obj2.getClass().getSimpleName());
            return false;
        }
        sb.append("null_mismatch@");
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(" vs ");
        sb.append(obj2);
        return false;
    }
}
