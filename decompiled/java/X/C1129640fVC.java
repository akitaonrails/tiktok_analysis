package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fVC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129640fVC {
    public static final Map<Long, C1129940fVg> LIZ = new LinkedHashMap();

    public static C1129940fVg LIZ(long j, String str) {
        C1129940fVg c1129940fVg = (C1129940fVg) ((LinkedHashMap) LIZ).get(Long.valueOf(j));
        if (c1129940fVg != null && C1533950q1J.LJ(str) && Intrinsics.LJFF(c1129940fVg.LIZ, str)) {
            return c1129940fVg;
        }
        return null;
    }
}
