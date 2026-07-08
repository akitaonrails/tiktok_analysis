package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.Map;

/* JADX INFO: renamed from: X.0zgZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1905490zgZ {
    public static final Map<String, Object> LIZ(String str) {
        if (str != null && str.length() != 0) {
            return (Map) GsonProtectorUtils.fromJson(C597040NbK.LIZ(), str, new AbstractC1905540zge<Map<String, ? extends Object>>() { // from class: X.0zgY
            }.getType());
        }
        return C2097608Jq.LJ();
    }
}
