package X;

import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0Ol9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C628610Ol9 {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(408));

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r10, boolean r11, X.InterfaceC1364105Vn r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.C628600Ol8
            if (r0 == 0) goto L2a
            r7 = r12
            X.0Ol8 r7 = (X.C628600Ol8) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r2 = r7.LL
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r6 = 4
            r5 = 3
            r4 = 2
            r3 = 1
            r1 = 0
            if (r0 == 0) goto L38
            if (r0 == r3) goto L6c
            if (r0 == r4) goto L7b
            if (r0 == r5) goto L8c
            if (r0 != r6) goto L30
            goto L9b
        L2a:
            X.0Ol8 r7 = new X.0Ol8
            r7.<init>(r9, r12)
            goto L12
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            X.C155000ia.LIZIZ(r2)
            boolean r0 = X.C289070BUr.LIZ()     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto L5b
            com.ss.android.ugc.aweme.template.net.TemplateFavoriteRequestBody r2 = new com.ss.android.ugc.aweme.template.net.TemplateFavoriteRequestBody     // Catch: java.lang.Exception -> Lab
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r10)     // Catch: java.lang.Exception -> Lab
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> Lab
        L4a:
            X.01GW r0 = r9.LIZ     // Catch: java.lang.Exception -> Lab
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> Lab
            com.ss.android.ugc.aweme.template.net.TemplateFavoriteApi r1 = (com.ss.android.ugc.aweme.template.net.TemplateFavoriteApi) r1     // Catch: java.lang.Exception -> Lab
            if (r1 == 0) goto La3
            boolean r0 = X.C289070BUr.LIZ()     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto L81
            goto L61
        L5b:
            com.ss.android.ugc.aweme.template.net.TemplateFavoriteRequestBody r2 = new com.ss.android.ugc.aweme.template.net.TemplateFavoriteRequestBody     // Catch: java.lang.Exception -> Lab
            r2.<init>(r10, r1)     // Catch: java.lang.Exception -> Lab
            goto L4a
        L61:
            if (r11 == 0) goto L72
            r7.LLILLL = r3     // Catch: java.lang.Exception -> Lab
            java.lang.Object r2 = r1.templateAddToFavoriteV2(r2, r7)     // Catch: java.lang.Exception -> Lab
            if (r2 != r8) goto L6f
            return r8
        L6c:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> Lab
        L6f:
            com.ss.android.ugc.aweme.template.net.TemplateFavoriteResponse r2 = (com.ss.android.ugc.aweme.template.net.TemplateFavoriteResponse) r2     // Catch: java.lang.Exception -> Lab
            goto La0
        L72:
            r7.LLILLL = r4     // Catch: java.lang.Exception -> Lab
            java.lang.Object r2 = r1.templateRemoveFromFavoriteV2(r2, r7)     // Catch: java.lang.Exception -> Lab
            if (r2 != r8) goto L7e
            return r8
        L7b:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> Lab
        L7e:
            com.ss.android.ugc.aweme.template.net.TemplateFavoriteResponse r2 = (com.ss.android.ugc.aweme.template.net.TemplateFavoriteResponse) r2     // Catch: java.lang.Exception -> Lab
            goto La0
        L81:
            if (r11 == 0) goto L92
            r7.LLILLL = r5     // Catch: java.lang.Exception -> Lab
            java.lang.Object r2 = r1.templateAddToFavorite(r2, r7)     // Catch: java.lang.Exception -> Lab
            if (r2 != r8) goto L8f
            return r8
        L8c:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> Lab
        L8f:
            com.ss.android.ugc.aweme.template.net.TemplateFavoriteResponse r2 = (com.ss.android.ugc.aweme.template.net.TemplateFavoriteResponse) r2     // Catch: java.lang.Exception -> Lab
            goto La0
        L92:
            r7.LLILLL = r6     // Catch: java.lang.Exception -> Lab
            java.lang.Object r2 = r1.templateRemoveFromFavorite(r2, r7)     // Catch: java.lang.Exception -> Lab
            if (r2 != r8) goto L9e
            return r8
        L9b:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> Lab
        L9e:
            com.ss.android.ugc.aweme.template.net.TemplateFavoriteResponse r2 = (com.ss.android.ugc.aweme.template.net.TemplateFavoriteResponse) r2     // Catch: java.lang.Exception -> Lab
        La0:
            if (r2 == 0) goto La3
            return r2
        La3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> Lab
            java.lang.String r0 = "api is null"
            r1.<init>(r0)     // Catch: java.lang.Exception -> Lab
            throw r1     // Catch: java.lang.Exception -> Lab
        Lab:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.template.net.TemplateFavoriteResponse r2 = new com.ss.android.ugc.aweme.template.net.TemplateFavoriteResponse
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C628610Ol9.LIZ(java.lang.String, boolean, X.05Vn):java.lang.Object");
    }
}
