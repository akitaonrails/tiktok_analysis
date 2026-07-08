package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CRa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C313600CRa {
    public final Map<String, Object> LIZ;

    public C313600CRa(Map<String, Object> map) {
        this.LIZ = map;
    }

    public final void LIZ(Object obj, String str, String str2) {
        EnumC313620CRc enumC313620CRc;
        if (this.LIZ.get(str2) == null) {
            this.LIZ.put(str2, obj);
            return;
        }
        C2232408os c2232408os = C341050DYp.LIZ;
        Map map = (Map) ((LinkedHashMap) C341050DYp.LIZJ).get(str);
        if (map == null || (enumC313620CRc = (EnumC313620CRc) map.get(str2)) == null) {
            return;
        }
        int i = C313610CRb.LIZ[enumC313620CRc.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                Object obj2 = this.LIZ.get(str2);
                if ((obj instanceof Integer) && (obj2 instanceof Integer)) {
                    this.LIZ.put(str2, Integer.valueOf(((Number) obj2).intValue() + ((Number) obj).intValue()));
                    return;
                } else {
                    if (!(obj instanceof Long) || !(obj2 instanceof Long)) {
                        return;
                    }
                    this.LIZ.put(str2, Long.valueOf(((Number) obj2).longValue() + ((Number) obj).longValue()));
                    return;
                }
            }
            if (!Intrinsics.LJFF(obj, Boolean.TRUE) && !Intrinsics.LJFF(obj, "1")) {
                return;
            }
            this.LIZ.put(str2, obj);
            return;
        }
        this.LIZ.put(str2, obj);
    }
}
