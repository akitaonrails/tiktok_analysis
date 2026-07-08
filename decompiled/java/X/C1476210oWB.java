package X;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0oWB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476210oWB {
    public final ConcurrentHashMap<String, C1475790oVV> LIZ = new ConcurrentHashMap<>();

    public final C1475790oVV LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("MediaTaskCenter", "[preload] get, param is invalid key is null");
            return null;
        }
        return this.LIZ.get(str);
    }

    public final void LIZJ(String str) {
        if (TextUtils.isEmpty(str)) {
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("MediaTaskCenter", "[preload] remove, param is invalid key is null");
        } else {
            this.LIZ.remove(str);
        }
    }

    public final void LIZIZ(String str, C1475790oVV c1475790oVV) {
        if (!TextUtils.isEmpty(str)) {
            this.LIZ.put(str, c1475790oVV);
        } else {
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("MediaTaskCenter", "[preload] param is invalid");
        }
    }
}
