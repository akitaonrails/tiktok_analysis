package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13mI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20109613mI {
    public static final JSONObject LIZIZ(Map<String, String> map) throws JSONException {
        if (map != null) {
            JSONObject jSONObject = new JSONObject();
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            return jSONObject;
        }
        return new JSONObject();
    }

    public static final List<String> LIZJ(JSONArray jSONArray) {
        if (jSONArray == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(JSONArrayProtectorUtils.getString(jSONArray, i));
        }
        return arrayList;
    }

    public static final SortedMap<String, String> LIZLLL(JSONObject jSONObject) {
        TreeMap treeMap = new TreeMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            treeMap.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
        }
        return treeMap;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final SortedMap<String, AbstractC20111713md> LJ(JSONObject jSONObject) {
        TreeMap treeMap = new TreeMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, next);
            final String string = JSONObjectProtectorUtils.getString(jSONObject2, "value");
            String lowerCase = JSONObjectProtectorUtils.getString(jSONObject2, "type").toLowerCase(Locale.ROOT);
            switch (lowerCase.hashCode()) {
                case -1249586564:
                    if (lowerCase.equals("variable")) {
                        treeMap.put(next, new AbstractC20111713md(string) { // from class: X.13mh
                        });
                    }
                    break;
                case -892481938:
                    if (lowerCase.equals("static")) {
                        treeMap.put(next, new AbstractC20111713md(string) { // from class: X.13me
                        });
                    }
                    break;
                case -362445944:
                    if (lowerCase.equals("pathparam")) {
                        treeMap.put(next, new AbstractC20111713md(string) { // from class: X.13mi
                        });
                    }
                    break;
                case 107944136:
                    if (lowerCase.equals("query")) {
                        treeMap.put(next, new AbstractC20111713md(string) { // from class: X.13mg
                        });
                    }
                    break;
            }
        }
        return treeMap;
    }

    public static final String LIZ(String str, Map<String, String> map) {
        Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        return builderBuildUpon.toString();
    }
}
