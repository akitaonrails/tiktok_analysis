package X;

/* JADX INFO: renamed from: X.0Ll0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C552080Ll0<IN> implements InterfaceC551240Lje {
    public static final C552080Ll0<IN> LIZ = new C552080Ll0<>();

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    @Override // X.InterfaceC551240Lje
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.Map<java.lang.String, ? extends X.InterfaceC1406105et> r9, X.InterfaceC1364105Vn<? super X.C1173904iX> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C552210LlD
            if (r0 == 0) goto L63
            r6 = r10
            X.0LlD r6 = (X.C552210LlD) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L34
            if (r0 != r4) goto L69
            X.C155000ia.LIZIZ(r1)
        L23:
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L28
            r5 = r1
        L28:
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L2e
        L2c:
            X.13BV r5 = X.C13BV.INSTANCE
        L2e:
            X.04iX r0 = new X.04iX
            r0.<init>(r5)
            return r0
        L34:
            X.C155000ia.LIZIZ(r1)
            X.0Lld r0 = X.C552470Lld.INSTANCE
            r0.getClass()
            java.lang.String r0 = "file_list"
            java.lang.Object r3 = r9.get(r0)
            X.05et r3 = (X.InterfaceC1406105et) r3
            if (r3 == 0) goto L2c
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory> r1 = com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory.class
            r0 = 0
            java.lang.Object r1 = r2.getService(r1, r0, r0)
            com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory r1 = (com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory) r1
            X.0LlP r0 = new X.0LlP
            r0.<init>()
            java.lang.reflect.Type r0 = r0.LIZ
            r6.LLILLL = r4
            java.lang.Object r1 = r1.LIZIZ(r3, r0, r6)
            if (r1 != r7) goto L23
            return r7
        L63:
            X.0LlD r6 = new X.0LlD
            r6.<init>(r8, r10)
            goto L12
        L69:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C552080Ll0.LIZ(java.util.Map, X.05Vn):java.lang.Object");
    }
}
