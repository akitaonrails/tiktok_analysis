package X;

import java.util.List;

/* JADX INFO: renamed from: X.0JBR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JBR {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("list_item_id", "search_third_item_id");

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r0, "1") != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r4, java.util.Map r5) {
        /*
            if (r4 == 0) goto L5f
            java.util.HashMap r2 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.getSearchExtraParams(r4)
            r0 = 0
            if (r2 == 0) goto L5c
            java.lang.String r1 = "is_search_video"
            java.lang.Object r1 = r2.get(r1)
        Lf:
            java.lang.String r2 = "1"
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
            if (r1 != 0) goto L29
            java.util.HashMap r1 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.getSearchExtraParams(r4)
            if (r1 == 0) goto L23
            java.lang.String r0 = "is_search_video_inner"
            java.lang.Object r0 = r1.get(r0)
        L23:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 == 0) goto L5f
        L29:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L36:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r1 = r2.getKey()
            java.util.List<java.lang.String> r0 = X.C0JBR.LIZ
            boolean r0 = r0.contains(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L36
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r0 = r2.getValue()
            r4.put(r1, r0)
            goto L36
        L5c:
            r1 = r0
            goto Lf
        L5e:
            return r4
        L5f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JBR.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.util.Map):java.util.Map");
    }
}
