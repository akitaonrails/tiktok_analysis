package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bvi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220641Bvi extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220641Bvi(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "truncateSync", "truncateSync(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2220181Buy invoke(org.json.JSONObject r8, java.lang.Integer r9) {
        /*
            r7 = this;
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            java.lang.Number r9 = (java.lang.Number) r9
            int r4 = r9.intValue()
            java.lang.Object r6 = r7.receiver
            X.1BvD r6 = (X.C2220331BvD) r6
            r6.getClass()
            java.lang.String r0 = "filePath"
            java.util.List r0 = java.util.Collections.singletonList(r0)
            kotlin.Pair r1 = X.C2220331BvD.LJIILIIL(r0, r8)
            java.lang.Object r0 = r1.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.Object r5 = r1.getSecond()
            java.lang.String r5 = (java.lang.String) r5
            r3 = 0
            if (r0 == 0) goto L7b
            if (r5 == 0) goto L7b
            kotlin.Pair r2 = X.C2220331BvD.LJJII(r8)
            java.lang.Object r0 = r2.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            java.lang.Object r0 = r2.getSecond()
            java.lang.Long r0 = (java.lang.Long) r0
            if (r1 == 0) goto L4b
            if (r0 != 0) goto L4b
            X.1Buy r0 = r6.LJIIIZ(r4, r3)
            return r0
        L4b:
            r1 = 0
            if (r0 == 0) goto L6a
            long r3 = r0.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6c
        L57:
            X.1BvJ r0 = r6.LIZ
            X.1Bvo r0 = r0.LIZ
            X.1Bv2 r3 = r0.LIZ(r5)
            X.1Bv3 r0 = r3.LIZIZ
            boolean r0 = r0.LIZ
            if (r0 != 0) goto L6e
            X.1Buy r0 = r3.LIZ()
            return r0
        L6a:
            r3 = 0
        L6c:
            r1 = r3
            goto L57
        L6e:
            X.1BvJ r0 = r6.LIZ
            X.1Bvo r0 = r0.LIZ
            X.1Bv2 r0 = r0.LJJJJ(r1, r5)
            X.1Buy r0 = r0.LIZ()
            return r0
        L7b:
            X.1Buy r0 = r6.LJIIIZ(r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2220641Bvi.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
