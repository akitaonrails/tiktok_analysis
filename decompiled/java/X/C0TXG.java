package X;

import defpackage.q;

/* JADX INFO: renamed from: X.0TXG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TXG extends q {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:3:0x0004, B:5:0x000a, B:6:0x000e, B:8:0x0017, B:14:0x0028, B:16:0x002e, B:18:0x0034, B:19:0x003c, B:22:0x0044, B:26:0x0056, B:27:0x005e, B:35:0x0085, B:37:0x008f, B:38:0x0093, B:29:0x0064, B:33:0x0079, B:34:0x0081), top: B:44:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r7, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r8, X.EnumC1063300dmC r9) {
        /*
            r6 = this;
            q$b r7 = (q.b) r7
            r3 = 0
            r2 = 0
            X.0puk r1 = com.bytedance.hybrid.spark.SparkContext.Companion     // Catch: java.lang.Throwable -> La2
            X.0OvC r0 = r6.IBridgeSdkContext     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L20
            java.lang.String r0 = r0.getContainerID()     // Catch: java.lang.Throwable -> La2
        Le:
            r1.getClass()     // Catch: java.lang.Throwable -> La2
            X.0q70 r1 = X.C1529880puk.LIZIZ(r0)     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L25
            java.lang.Class<X.0TXA> r0 = X.C0TXA.class
            java.lang.Object r5 = r1.LJFF(r0)     // Catch: java.lang.Throwable -> La2
            X.0TXA r5 = (X.C0TXA) r5     // Catch: java.lang.Throwable -> La2
            goto L22
        L20:
            r0 = r3
            goto Le
        L22:
            if (r5 == 0) goto L26
            goto L28
        L25:
            r5 = r3
        L26:
            r1 = r3
            goto L3c
        L28:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAweme()     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L26
            com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo r0 = r0.getCardInsertInfo()     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L26
            int r0 = r0.getCardType()     // Catch: java.lang.Throwable -> La2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> La2
        L3c:
            boolean r0 = r7.isPositive()     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L62
            if (r1 == 0) goto L50
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> La2
            X.15b9 r0 = X.C20550115b9.LIZ     // Catch: java.lang.Throwable -> La2
            r0.getClass()     // Catch: java.lang.Throwable -> La2
            X.C20550115b9.LJIILIIL(r1)     // Catch: java.lang.Throwable -> La2
        L50:
            if (r5 == 0) goto L53
            goto L56
        L53:
            r1 = r3
            r0 = r3
            goto L5e
        L56:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.getAweme()     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = r5.getEventType()     // Catch: java.lang.Throwable -> La2
        L5e:
            X.C20552315bV.LIZJ(r1, r0, r2)     // Catch: java.lang.Throwable -> La2
            goto L85
        L62:
            if (r1 == 0) goto L73
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> La2
            X.15b9 r0 = X.C20550115b9.LIZ     // Catch: java.lang.Throwable -> La2
            r0.getClass()     // Catch: java.lang.Throwable -> La2
            X.C20550115b9.LIZ(r1)     // Catch: java.lang.Throwable -> La2
            X.C20550115b9.LJIILIIL(r1)     // Catch: java.lang.Throwable -> La2
        L73:
            if (r5 == 0) goto L76
            goto L79
        L76:
            r4 = r3
            r1 = r3
            goto L81
        L79:
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r5.getAweme()     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = r5.getEventType()     // Catch: java.lang.Throwable -> La2
        L81:
            r0 = 1
            X.C20552315bV.LIZJ(r4, r1, r0)     // Catch: java.lang.Throwable -> La2
        L85:
            java.lang.Class<q$c> r0 = q.c.class
            X.12Dl r1 = X.C13LE.LIZ(r0)     // Catch: java.lang.Throwable -> La2
            X.0OvC r0 = r6.IBridgeSdkContext     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L9f
            java.lang.String r0 = r0.getContainerID()     // Catch: java.lang.Throwable -> La2
        L93:
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r1 = X.C1549500qQO.LIZJ(r0, r1)     // Catch: java.lang.Throwable -> La2
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r1 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r1     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = "success"
            r8.onSuccess(r1, r0)     // Catch: java.lang.Throwable -> La2
            goto La1
        L9f:
            r0 = r3
            goto L93
        La1:
            return
        La2:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r1 = "failed"
            r0 = 4
            X.C2382909Vj.LIZ(r8, r2, r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0TXG.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
