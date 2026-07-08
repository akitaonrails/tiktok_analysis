package X;

import android.util.LruCache;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07fJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1918307fJ {
    public static final LruCache<String, Integer> LIZ = new LruCache<>(500);
    public static final LruCache<String, Boolean> LIZIZ = new LruCache<>(500);

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        sbLIZ.append(curUserId);
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Integer LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        return LIZ.get(LIZ(str));
    }

    public static boolean LIZJ(String str, boolean z, boolean z2) {
        LruCache<String, Boolean> lruCache = LIZIZ;
        Boolean bool = lruCache.get(LIZ(str));
        if (z2 || !Intrinsics.LJFF(Boolean.valueOf(z), bool)) {
            lruCache.put(LIZ(str), Boolean.valueOf(z));
        }
        if (bool != null && !Intrinsics.LJFF(Boolean.valueOf(z), bool)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(int r6, java.lang.String r7, boolean r8) {
        /*
            android.util.LruCache<java.lang.String, java.lang.Integer> r5 = X.C1918307fJ.LIZ
            java.lang.String r0 = LIZ(r7)
            java.lang.Object r4 = r5.get(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r3 = 0
            r1 = 1
            if (r4 == 0) goto L16
            int r0 = r4.intValue()
            if (r0 == r1) goto L2d
        L16:
            if (r6 == r1) goto L35
            if (r4 != 0) goto L2d
        L1a:
            r2 = 0
        L1b:
            if (r8 != 0) goto L1f
            if (r2 == 0) goto L37
        L1f:
            java.lang.String r1 = LIZ(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r5.put(r1, r0)
            if (r8 == 0) goto L37
            return r2
        L2d:
            int r0 = r4.intValue()
            if (r0 != r1) goto L1a
            if (r6 == r1) goto L1a
        L35:
            r2 = 1
            goto L1b
        L37:
            if (r4 == 0) goto L3d
            if (r2 == 0) goto L3d
            r3 = 1
            return r3
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1918307fJ.LIZLLL(int, java.lang.String, boolean):boolean");
    }
}
