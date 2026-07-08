package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.07eq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1915407eq {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(java.lang.String r6) {
        /*
            r5 = 0
            if (r6 == 0) goto L3d
            char[] r4 = r6.toCharArray()
            int r0 = r4.length
            if (r0 <= 0) goto L3d
            int r1 = r4.length
            r0 = 255(0xff, float:3.57E-43)
            if (r1 > r0) goto L3d
            int r3 = r4.length
            r2 = 0
        L11:
            if (r2 >= r3) goto L3b
            char r1 = r4[r2]
            r0 = 65
            if (r1 < r0) goto L26
            r0 = 90
            if (r1 <= r0) goto L38
            r0 = 97
            if (r1 < r0) goto L26
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 <= r0) goto L38
            return r5
        L26:
            r0 = 48
            if (r1 < r0) goto L2f
            r0 = 57
            if (r1 <= r0) goto L38
            return r5
        L2f:
            r0 = 46
            if (r1 == r0) goto L38
            r0 = 45
            if (r1 == r0) goto L38
            return r5
        L38:
            int r2 = r2 + 1
            goto L11
        L3b:
            r0 = 1
            return r0
        L3d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1915407eq.LIZ(java.lang.String):boolean");
    }

    public static String LIZIZ(List<String> list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            if (i < ((ArrayList) list).size()) {
                sb.append((String) ListProtector.get(list, i));
                if (i != r1.size() - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }
}
