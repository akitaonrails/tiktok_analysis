package X;

import j27.s;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0DYC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DYC {
    public static final Object LIZ(s sVar, String str) {
        Map<String, Object> map = sVar.LLJL;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public static final void LIZIZ(s sVar, String str, Object obj) {
        Map<String, Object> map = sVar.LLJL;
        if (map == null) {
            sVar.LLJL = C2097608Jq.LJI(new Pair(str, obj));
        } else {
            map.put(str, obj);
        }
    }
}
