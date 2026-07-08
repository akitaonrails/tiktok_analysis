package X;

import defpackage.h;

/* JADX INFO: renamed from: X.0QwX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C686630QwX extends h {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r9, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r10, X.EnumC1063300dmC r11) {
        /*
            r8 = this;
            h$b r9 = (h.b) r9
            com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r0 = X.C0Q3E.LJFF()
            X.0PCY r0 = r0.uF()
            X.0sD9 r0 = r0.LIZJ()
            X.0PM7 r0 = (X.C0PM7) r0
            java.lang.String r5 = r0.LLILZ
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService> r0 = com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService r0 = (com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService) r0
            java.lang.String r4 = r0.LJIJ()
            int r0 = r4.length()
            if (r0 <= 0) goto L3d
            r0 = 1
        L29:
            r2 = 0
            if (r0 != 0) goto L2d
            r4 = r5
        L2d:
            java.lang.String r1 = r9.getAwemeId()
            int r0 = r1.length()
            if (r0 > 0) goto L38
            r1 = r2
        L38:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, kotlin.Pair<java.lang.Integer, java.lang.Integer>> r0 = X.C706870Ro5.LIZ
            if (r1 == 0) goto L62
            goto L3f
        L3d:
            r0 = 0
            goto L29
        L3f:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, kotlin.Pair<java.lang.Integer, java.lang.Integer>> r0 = X.C706870Ro5.LIZ     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L4b
            kotlin.Pair r1 = (kotlin.Pair) r1     // Catch: java.lang.Throwable -> L4b
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L4b
            goto L57
        L4b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L57:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L5e
            r1 = r2
        L5e:
            kotlin.Pair r1 = (kotlin.Pair) r1
            if (r1 != 0) goto L70
        L62:
            r0 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r3, r0)
        L70:
            java.lang.Object r0 = r1.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            java.lang.Object r0 = r1.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.lang.String r1 = "feed_count"
            java.lang.String r0 = java.lang.String.valueOf(r7)
            r3.put(r1, r0)
            java.lang.String r1 = "doc_rank"
            java.lang.String r0 = java.lang.String.valueOf(r6)
            r3.put(r1, r0)
            java.lang.String r0 = "last_feed_group_id"
            r3.put(r0, r5)
            java.lang.String r0 = "last_from_group_id"
            r3.put(r0, r4)
            java.lang.Class<h$c> r1 = h.c.class
            X.0OvC r0 = r8.IBridgeSdkContext
            if (r0 == 0) goto Laf
            java.lang.String r2 = r0.getContainerID()
        Laf:
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r1 = X.C1909107dp.LIZJ(r1, r2)
            h$c r1 = (h.c) r1
            r1.setNativeLogParams(r3)
            java.lang.String r0 = ""
            r10.onSuccess(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C686630QwX.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
