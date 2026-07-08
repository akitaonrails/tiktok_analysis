package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0K7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512320K7i {
    public static Pair LIZ(Throwable th) {
        int iIntValue = -1;
        C0K6E c0k6eLIZ = C09OK.LIZ(-1, th);
        Integer num = c0k6eLIZ.LIZ;
        if (num != null) {
            iIntValue = num.intValue();
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        String strLIZ = c0k6eLIZ.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        return new Pair(numValueOf, strLIZ);
    }
}
