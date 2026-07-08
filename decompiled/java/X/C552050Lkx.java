package X;

/* JADX INFO: renamed from: X.0Lkx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C552050Lkx<IN> implements InterfaceC551240Lje {
    public static final C552050Lkx<IN> LIZ = new C552050Lkx<>();

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    @Override // X.InterfaceC551240Lje
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.Map<java.lang.String, ? extends X.InterfaceC1406105et> r9, X.InterfaceC1364105Vn<? super X.C1166704hN> r10) throws X.C555610Lqh {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C552200LlC
            if (r0 == 0) goto L60
            r6 = r10
            X.0LlC r6 = (X.C552200LlC) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L31
            if (r0 != r4) goto L66
            X.C155000ia.LIZIZ(r1)
        L22:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 != 0) goto L27
            r1 = 0
        L27:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L6e
            X.04hN r0 = new X.04hN
            r0.<init>(r1)
            return r0
        L31:
            X.C155000ia.LIZIZ(r1)
            X.0Llu r0 = X.C552640Llu.INSTANCE
            r0.getClass()
            java.lang.String r0 = "server_task_id"
            java.lang.Object r3 = r9.get(r0)
            X.05et r3 = (X.InterfaceC1406105et) r3
            if (r3 == 0) goto L6e
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory> r1 = com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory.class
            r0 = 0
            java.lang.Object r1 = r2.getService(r1, r0, r0)
            com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory r1 = (com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory) r1
            X.0LlV r0 = new X.0LlV
            r0.<init>()
            java.lang.reflect.Type r0 = r0.LIZ
            r6.LLILLL = r4
            java.lang.Object r1 = r1.LIZIZ(r3, r0, r6)
            if (r1 != r5) goto L22
            return r5
        L60:
            X.0LlC r6 = new X.0LlC
            r6.<init>(r8, r10)
            goto L12
        L66:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L6e:
            X.0LkV r0 = X.EnumC551770LkV.POLLING_NO_INPUT
            r1 = 0
            r6 = 31
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r7 = r1
            X.0Lqh r0 = X.EnumC551770LkV.toException$default(r0, r1, r2, r3, r4, r5, r6, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C552050Lkx.LIZ(java.util.Map, X.05Vn):java.lang.Object");
    }
}
