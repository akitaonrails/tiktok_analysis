package X;

/* JADX INFO: renamed from: X.0LsC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C556540LsC {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.C555910LrB r8, X.InterfaceC1364105Vn<? super java.lang.String> r9) {
        /*
            boolean r0 = r9 instanceof X.C556720LsU
            if (r0 == 0) goto L54
            r7 = r9
            X.0LsU r7 = (X.C556720LsU) r7
            int r2 = r7.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r7.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L28
            if (r0 != r4) goto L5a
            X.C155000ia.LIZIZ(r1)
        L23:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L62
            return r1
        L28:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r1 = "creation_id"
            java.util.Map<java.lang.String, X.09Eo> r0 = r8.LIZ
            java.lang.Object r3 = r0.get(r1)
            X.09Eo r3 = (X.C2339209Eo) r3
            if (r3 == 0) goto L62
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory> r1 = com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory.class
            r0 = 0
            java.lang.Object r1 = r2.getService(r1, r0, r0)
            com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory r1 = (com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory) r1
            X.0LsB r0 = new X.0LsB
            r0.<init>()
            java.lang.reflect.Type r0 = r0.LIZ
            r7.LLILLJJLI = r4
            java.lang.Object r1 = r1.LIZIZ(r3, r0, r7)
            if (r1 != r6) goto L23
            return r6
        L54:
            X.0LsU r7 = new X.0LsU
            r7.<init>(r9)
            goto L12
        L5a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L62:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C556540LsC.LIZ(X.0LrB, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ(java.util.Map<java.lang.String, ? extends X.InterfaceC1406105et> r8, X.InterfaceC1364105Vn<? super java.lang.String> r9) {
        /*
            boolean r0 = r9 instanceof X.C556730LsV
            if (r0 == 0) goto L52
            r7 = r9
            X.0LsV r7 = (X.C556730LsV) r7
            int r2 = r7.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r7.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L28
            if (r0 != r4) goto L58
            X.C155000ia.LIZIZ(r1)
        L23:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L60
            return r1
        L28:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r0 = "creation_id"
            java.lang.Object r3 = r8.get(r0)
            X.05et r3 = (X.InterfaceC1406105et) r3
            if (r3 == 0) goto L60
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory> r1 = com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory.class
            r0 = 0
            java.lang.Object r1 = r2.getService(r1, r0, r0)
            com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory r1 = (com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory) r1
            X.0LsX r0 = new X.0LsX
            r0.<init>()
            java.lang.reflect.Type r0 = r0.LIZ
            r7.LLILLJJLI = r4
            java.lang.Object r1 = r1.LIZIZ(r3, r0, r7)
            if (r1 != r6) goto L23
            return r6
        L52:
            X.0LsV r7 = new X.0LsV
            r7.<init>(r9)
            goto L12
        L58:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L60:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C556540LsC.LIZIZ(java.util.Map, X.05Vn):java.lang.Object");
    }
}
