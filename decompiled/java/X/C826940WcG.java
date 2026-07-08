package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0WcG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826940WcG {
    public static volatile boolean LIZ;
    public static final CopyOnWriteArraySet<String> LIZIZ = new CopyOnWriteArraySet<>();
    public static final CopyOnWriteArraySet<String> LIZJ = new CopyOnWriteArraySet<>();

    public static Set<String> LIZ(List<String> list) {
        CopyOnWriteArraySet<String> copyOnWriteArraySet = LIZIZ;
        if (!copyOnWriteArraySet.isEmpty() && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (String str : copyOnWriteArraySet) {
                for (String str2 : list) {
                    if (str2 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append("=");
                        if (str2.contains(C2188811AlT.LIZIZ(sbLIZ))) {
                            hashSet.add(str);
                        }
                    }
                }
            }
            if (hashSet.size() > 0) {
                return hashSet;
            }
            return null;
        }
        return null;
    }

    public static Set<String> LIZIZ(C0X1V c0x1v) {
        CopyOnWriteArraySet<String> copyOnWriteArraySet = LIZJ;
        if (!copyOnWriteArraySet.isEmpty() && c0x1v != null && c0x1v.LIZ.length / 2 != 0) {
            HashSet hashSet = new HashSet();
            for (String str : copyOnWriteArraySet) {
                if (c0x1v.LIZLLL(str) != null) {
                    hashSet.add(str);
                }
            }
            if (hashSet.size() > 0) {
                return hashSet;
            }
        }
        return null;
    }

    public static void LIZJ(JSONArray jSONArray, CopyOnWriteArraySet<String> copyOnWriteArraySet) {
        if (jSONArray != null && copyOnWriteArraySet != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String string = JSONArrayProtectorUtils.getString(jSONArray, i);
                    if (!TextUtils.isEmpty(string)) {
                        copyOnWriteArraySet.add(string);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
        }
    }
}
