package X;

import android.text.TextUtils;
import android.util.Pair;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.08GM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08GM {
    public static Map<String, String> LIZ(List<Pair<String, String>> list) {
        if (list == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (Pair<String, String> pair : list) {
            if (!TextUtils.isEmpty((CharSequence) pair.first) && !TextUtils.isEmpty((CharSequence) pair.second)) {
                map.put(pair.first, pair.second);
            }
        }
        return map;
    }
}
