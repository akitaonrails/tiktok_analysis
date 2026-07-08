package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V7v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792730V7v {
    public static List LIZ(String str, JSONObject jSONObject) {
        boolean z;
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            int length = jSONArrayOptJSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                String string = JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray, i);
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(string);
                }
            }
            return arrayList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static List LIZJ(String str, JSONObject jSONObject) {
        if (TextUtils.equals("api_block_list", str) && C302820Btw.LIZIZ()) {
            ArrayList arrayList = (ArrayList) LIZ(str, jSONObject);
            if (!arrayList.contains("/monitor/collect/")) {
                arrayList.add("/monitor/collect/");
            }
            return arrayList;
        }
        return LIZ(str, jSONObject);
    }

    public static List LIZLLL(String str, JSONObject jSONObject) {
        if (TextUtils.equals("api_allow_list", str) && C302820Btw.LIZIZ()) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
                if (!C0V3O.LIZJ(jSONObjectOptJSONObject)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (jSONObjectOptJSONObject.optInt(next) == 1 && (C1972707o5.LIZ.contains(next) || ((((Boolean) C259740AFw.LIZ.getValue()).booleanValue() && C1972707o5.LIZJ.matcher(next).matches()) || !C1972707o5.LIZ(next)))) {
                            arrayList.add(next);
                        }
                    }
                    return arrayList;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            try {
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(str);
                if (!C792450V6t.LIZJ(jSONObjectOptJSONObject2)) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        if (jSONObjectOptJSONObject2.optInt(next2) == 1) {
                            arrayList2.add(next2);
                        }
                    }
                    return arrayList2;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return null;
    }

    public static boolean LIZIZ(String str, List<String> list, List<Pattern> list2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!C08GN.LIZIZ(list)) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (str.contains(it2.next())) {
                    return true;
                }
            }
        }
        try {
            String path = new URI(str).getPath();
            if (!C08GN.LIZIZ(list2)) {
                Iterator<Pattern> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (it3.next().matcher(path).matches()) {
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }
}
