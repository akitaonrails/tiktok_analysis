package X;

import android.content.SharedPreferences;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.account.TTAccountInit;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0XNy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847880XNy {
    public static final SharedPreferences LIZ;
    public static final Gson LIZIZ;
    public static final String LIZJ;

    static {
        TTAccountInit.LIZ();
        LIZ = C810670Vr7.LIZJ(C848000XOk.LIZ(), 0, "multi_account_prefs");
        LIZIZ = new Gson();
        LIZJ = "multi_accounts";
    }

    public static Map LIZ() {
        String string = LIZ.getString(LIZJ, null);
        if (string == null) {
            return new LinkedHashMap();
        }
        Map map = (Map) GsonProtectorUtils.fromJson(LIZIZ, string, new TypeToken<Map<String, C0XOG>>() { // from class: X.0XNz
        }.getType());
        return map == null ? new LinkedHashMap() : map;
    }
}
