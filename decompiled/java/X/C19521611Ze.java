package X;

import com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule;

/* JADX INFO: renamed from: X.11Ze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19521611Ze implements C11ZN {
    public final AICaptionNetworkModule LIZ = new AICaptionNetworkModule();

    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    @Override // X.C11ZN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(java.lang.String r6, java.util.List<java.lang.String> r7, X.InterfaceC1364105Vn<? super X.C11ZF> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C19521811Zg
            if (r0 == 0) goto L6e
            r4 = r8
            X.11Zg r4 = (X.C19521811Zg) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6e
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L60
            if (r0 != r1) goto L74
            X.C155000ia.LIZIZ(r3)
        L22:
            com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule$AICaptionResponse r3 = (com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule.AICaptionResponse) r3
            X.11ZF r1 = new X.11ZF
            r1.<init>()
            if (r3 == 0) goto L2f
            java.util.List<java.lang.String> r0 = r3.textList
            if (r0 != 0) goto L31
        L2f:
            X.13BV r0 = X.C13BV.INSTANCE
        L31:
            r1.LIZIZ = r0
            if (r3 == 0) goto L39
            java.util.List<java.lang.String> r0 = r3.descriptions
            if (r0 != 0) goto L3b
        L39:
            X.13BV r0 = X.C13BV.INSTANCE
        L3b:
            r1.LIZJ = r0
            if (r3 == 0) goto L5e
            int r0 = r3.statusCode
        L41:
            r1.LJI = r0
            if (r3 == 0) goto L49
            java.lang.String r0 = r3.statusMsg
            if (r0 != 0) goto L4b
        L49:
            java.lang.String r0 = "fetch unknown error"
        L4b:
            r1.LJII = r0
            if (r3 == 0) goto L59
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r3.logPb
            if (r0 == 0) goto L59
            java.lang.String r0 = r0.getImprId()
            if (r0 != 0) goto L5b
        L59:
            java.lang.String r0 = ""
        L5b:
            r1.LJIIIIZZ = r0
            return r1
        L5e:
            r0 = 0
            goto L41
        L60:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule r0 = r5.LIZ
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZIZ(r7, r6, r4)
            if (r3 != r2) goto L22
            return r2
        L6e:
            X.11Zg r4 = new X.11Zg
            r4.<init>(r5, r8)
            goto L12
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19521611Ze.LJIILL(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }
}
