package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.00Hc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C052600Hc {
    public static final /* synthetic */ int LIZ = 0;

    public static Pair LIZ(int i, long j, Integer num, String str, boolean z) {
        long j2;
        if (Math.random() < 0.001f) {
            Pair[] pairArr = new Pair[5];
            pairArr[0] = new Pair("operation_type", str);
            pairArr[1] = new Pair("business_type", String.valueOf(num));
            pairArr[2] = new Pair("operation_count", String.valueOf(i));
            if (z) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            pairArr[3] = new Pair("is_success", String.valueOf(j2));
            pairArr[4] = new Pair("db_operation_cost", String.valueOf(j));
            return new Pair("dm_search_db_operation", C2097608Jq.LJIIJ(pairArr));
        }
        return null;
    }
}
