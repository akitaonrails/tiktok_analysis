package X;

import android.content.Context;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r98, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577240r98 {
    public static final void LIZ(Context context, long j, long j2, boolean z, String str) {
        Pair pair;
        C1573870r3h c1573870r3h = C1573870r3h.LIZ;
        Long lValueOf = Long.valueOf(j);
        Long lValueOf2 = Long.valueOf(j2);
        Boolean boolValueOf = Boolean.valueOf(z);
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("source_card", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("homepage_series_");
        sbLIZ.append(str);
        pairArr[1] = new Pair("series_enter_entrance", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(str, "trending_list")) {
            pair = new Pair("root_scene", "2");
        } else {
            pair = new Pair("root_scene", "1");
        }
        pairArr[2] = pair;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c1573870r3h.getClass();
        C1573870r3h.LIZ("homepage_series", lValueOf, lValueOf2, boolValueOf, mapLJIIIIZZ, false, "", false);
    }
}
