package X;

import android.net.Uri;
import com.bytedance.keva.Keva;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0QVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671410QVf {
    public static String LIZ(boolean z) {
        String str;
        if (z) {
            str = "ec_search_middle_feedback_products";
        } else {
            str = "ec_search_middle_feedback_words";
        }
        Keva repo = Keva.getRepo("ecommerce_search_repo");
        JSONArray jSONArray = new JSONArray();
        for (String str2 : repo.getStringArray(str, new String[0])) {
            str2.toString();
            jSONArray.put(str2);
        }
        return Uri.encode(jSONArray.toString());
    }
}
