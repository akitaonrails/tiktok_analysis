package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0PxJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661630PxJ {
    public static final Map<String, C661720PxS> LIZ = new HashMap();

    public static C661720PxS LIZ(String str) {
        C661720PxS c661720PxS = (C661720PxS) ((HashMap) LIZ).get(str);
        if (c661720PxS == null) {
            return C661810Pxb.LIZ;
        }
        return c661720PxS;
    }
}
