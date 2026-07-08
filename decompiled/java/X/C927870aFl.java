package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0aFl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927870aFl {
    public static final void LIZ(String str, Map map) {
        boolean zLJJIIZI;
        if (str != null && str.length() != 0) {
            HashMap map2 = (HashMap) map;
            String str2 = (String) map2.get("enter_from");
            String str3 = (String) map2.get("invitee_list");
            if (str2 != null) {
                if (str3 != null) {
                    if (!a0.LJJIIZI(str2, "capsule", false) && !a0.LJJIIZI(str3, "capsule", false)) {
                        return;
                    }
                    map2.put("recommend_reason", str);
                }
                zLJJIIZI = a0.LJJIIZI(str2, "capsule", false);
            } else if (str3 == null) {
                return;
            } else {
                zLJJIIZI = a0.LJJIIZI(str3, "capsule", false);
            }
            if (!zLJJIIZI) {
                return;
            }
            map2.put("recommend_reason", str);
        }
    }
}
