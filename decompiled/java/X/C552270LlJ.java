package X;

/* JADX INFO: renamed from: X.0LlJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C552270LlJ<IN> implements InterfaceC551240Lje {
    public static final C552270LlJ<IN> LIZ = new C552270LlJ<>();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    @Override // X.InterfaceC551240Lje
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.Map<java.lang.String, ? extends X.InterfaceC1406105et> r11, X.InterfaceC1364105Vn<? super X.C552260LlI> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C552280LlK
            if (r0 == 0) goto Lac
            r7 = r12
            X.0LlK r7 = (X.C552280LlK) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lac
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r0 = r7.LLILLJJLI
            java.lang.Object r8 = X.C099R.LJFF()
            int r1 = r7.LLILZ
            java.lang.String r6 = ""
            r5 = 2
            r3 = 1
            r9 = 0
            r4 = 0
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L6d
            if (r1 != r5) goto Lb3
            java.lang.Object r3 = r7.LL
            java.lang.String r3 = (java.lang.String) r3
            X.C155000ia.LIZIZ(r0)
        L2d:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L32
            r4 = r0
        L32:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L37
            r6 = r4
        L37:
            X.0LlI r0 = new X.0LlI
            r0.<init>(r3, r6)
            return r0
        L3d:
            X.C155000ia.LIZIZ(r0)
            X.0Llm r0 = X.C552560Llm.INSTANCE
            r0.getClass()
            java.lang.String r0 = "job_type"
            java.lang.Object r2 = r11.get(r0)
            X.05et r2 = (X.InterfaceC1406105et) r2
            if (r2 == 0) goto L7e
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory> r0 = com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory.class
            java.lang.Object r1 = r1.getService(r0, r9, r9)
            com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory r1 = (com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory) r1
            X.0LlW r0 = new X.0LlW
            r0.<init>()
            java.lang.reflect.Type r0 = r0.LIZ
            r7.LL = r11
            r7.LLILZ = r3
            java.lang.Object r0 = r1.LIZIZ(r2, r0, r7)
            if (r0 != r8) goto L74
            return r8
        L6d:
            java.lang.Object r11 = r7.LL
            java.util.Map r11 = (java.util.Map) r11
            X.C155000ia.LIZIZ(r0)
        L74:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L79
            r0 = r4
        L79:
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L7f
        L7e:
            r3 = r6
        L7f:
            X.0Lll r0 = X.C552550Lll.INSTANCE
            r0.getClass()
            java.lang.String r0 = "business_scene"
            java.lang.Object r2 = r11.get(r0)
            X.05et r2 = (X.InterfaceC1406105et) r2
            if (r2 == 0) goto L37
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory> r0 = com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory.class
            java.lang.Object r1 = r1.getService(r0, r9, r9)
            com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory r1 = (com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory) r1
            X.0LlX r0 = new X.0LlX
            r0.<init>()
            java.lang.reflect.Type r0 = r0.LIZ
            r7.LL = r3
            r7.LLILZ = r5
            java.lang.Object r0 = r1.LIZIZ(r2, r0, r7)
            if (r0 != r8) goto L2d
            return r8
        Lac:
            X.0LlK r7 = new X.0LlK
            r7.<init>(r10, r12)
            goto L12
        Lb3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C552270LlJ.LIZ(java.util.Map, X.05Vn):java.lang.Object");
    }
}
