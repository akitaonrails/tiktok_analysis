package X;

import android.util.LruCache;

/* JADX INFO: renamed from: X.0obB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1479310obB {
    public static final LruCache<String, C1479510obV> LIZ = new LruCache<>(2);

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1479510obV LIZ(X.C1479530obX r7) {
        /*
            X.01GW r0 = X.C1474810oTv.a1
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r6 = 0
            if (r0 != 0) goto L10
            return r6
        L10:
            if (r7 == 0) goto L52
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideo r0 = r7.LIZLLL
            if (r0 == 0) goto L52
            java.lang.String r5 = r0.getSourceId()
            if (r5 == 0) goto L52
            int r0 = r5.length()
            if (r0 == 0) goto L52
            android.util.LruCache<java.lang.String, X.0obV> r4 = X.C1479310obB.LIZ
            java.lang.Object r3 = r4.get(r5)
            X.0obV r3 = (X.C1479510obV) r3
            if (r3 != 0) goto L2d
            return r6
        L2d:
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideo r0 = r7.LIZLLL
            if (r0 == 0) goto L4c
            boolean r1 = r0.hasVideoModel()
            X.0oQz r0 = r3.LJJJLZIJ
            if (r0 == 0) goto L4a
            r0 = 1
        L3a:
            if (r1 != r0) goto L4c
            r2 = 1
        L3d:
            java.lang.String r1 = "homepage_hot"
            java.lang.String r0 = r7.LJLJJL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4e
            if (r2 == 0) goto L4e
            return r3
        L4a:
            r0 = 0
            goto L3a
        L4c:
            r2 = 0
            goto L3d
        L4e:
            r4.remove(r5)
            return r6
        L52:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1479310obB.LIZ(X.0obX):X.0obV");
    }

    public static void LIZIZ(C1479510obV c1479510obV, String str) {
        if (str != null && str.length() != 0 && c1479510obV != null && ((Boolean) C1474810oTv.a1.getValue()).booleanValue()) {
            LIZ.put(str, c1479510obV);
        }
    }
}
