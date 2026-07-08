package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dfa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1059200dfa {
    public static final C1059200dfa LIZ = new C1059200dfa();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f A[PHI: r4
      0x007f: PHI (r4v6 java.lang.String) = (r4v5 java.lang.String), (r4v9 java.lang.String) binds: [B:33:0x0075, B:36:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(com.bytedance.hybrid.spark.SparkContext r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1059200dfa.LIZ(com.bytedance.hybrid.spark.SparkContext, java.lang.String):boolean");
    }

    public static Uri LIZIZ(Uri uri, Map map, String str, C13BV c13bv) {
        String str2;
        String strLIZIZ;
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        boolean z = false;
        for (String str3 : queryParameterNames) {
            if (!c13bv.contains(str3)) {
                if (Intrinsics.LJFF(str3, "url")) {
                    strLIZIZ = str;
                    z = true;
                } else {
                    strLIZIZ = C1942307jB.LIZIZ(uri, str3);
                }
                builderClearQuery.appendQueryParameter(str3, strLIZIZ);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            if ((!queryParameterNames.contains(entry.getKey())) & (!c13bv.contains(entry.getKey()))) {
                String str4 = (String) entry.getKey();
                if (Intrinsics.LJFF(entry.getKey(), "url")) {
                    str2 = str;
                    z = true;
                } else {
                    str2 = (String) map.get(entry.getKey());
                }
                builderClearQuery.appendQueryParameter(str4, str2);
            }
        }
        if (!z && !c13bv.contains("url")) {
            builderClearQuery.appendQueryParameter("url", str);
        }
        return builderClearQuery.build();
    }
}
