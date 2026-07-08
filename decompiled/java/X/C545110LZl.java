package X;

import com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService;

/* JADX INFO: renamed from: X.0LZl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C545110LZl {
    public static final C545110LZl LIZ = new C545110LZl();
    public static final AIGCWorkflowCreationService LIZIZ = C2387909Xh.LIZ();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<java.lang.String> r10, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, X.C539070LCf>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C545230LZx
            if (r0 == 0) goto L75
            r8 = r11
            X.0LZx r8 = (X.C545230LZx) r8
            int r2 = r8.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r8.LLILZLL = r2
        L12:
            java.lang.Object r7 = r8.LLILZ
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILZLL
            r5 = 1
            if (r0 == 0) goto L5d
            if (r0 != r5) goto L80
            java.lang.Object r2 = r8.LLILLL
            java.lang.Object r4 = r8.LLILLJJLI
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r3 = r8.LL
            java.util.Collection r3 = (java.util.Collection) r3
            X.C155000ia.LIZIZ(r7)
        L2c:
            X.0LCf r7 = (X.C539070LCf) r7
            if (r7 == 0) goto L3e
            X.0LaT r1 = r7.LIZJ
            X.0LaT r0 = X.EnumC545550LaT.NONE
            if (r1 == r0) goto L3e
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r7)
            r3.add(r0)
        L3e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r2 = r4.next()
            java.lang.String r2 = (java.lang.String) r2
            com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService r0 = X.C545110LZl.LIZIZ
            if (r0 == 0) goto L3e
            r8.LL = r3
            r8.LLILLJJLI = r4
            r8.LLILLL = r2
            r8.LLILZLL = r5
            java.lang.Object r7 = r0.LJIJ(r2, r8)
            if (r7 != r6) goto L2c
            return r6
        L5d:
            X.C155000ia.LIZIZ(r7)
            boolean r0 = X.C545300La4.LIZ()
            if (r0 != 0) goto L6b
            java.util.Map r0 = X.C2097608Jq.LJ()
            return r0
        L6b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r10.iterator()
            goto L3e
        L75:
            X.0LZx r8 = new X.0LZx
            r8.<init>(r9, r11)
            goto L12
        L7b:
            java.util.Map r0 = X.C2097608Jq.LJIILLIIL(r3)
            return r0
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545110LZl.LIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(androidx.lifecycle.LifecycleOwner r8, java.lang.String r9, X.InterfaceC1364105Vn r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C545270La1
            if (r0 == 0) goto L59
            r6 = r10
            X.0La1 r6 = (X.C545270La1) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 != r4) goto L5f
            X.C155000ia.LIZIZ(r1)
        L22:
            if (r1 == 0) goto L67
            return r1
        L25:
            X.C155000ia.LIZIZ(r1)
            if (r8 != 0) goto L42
            X.0LX3 r2 = X.C0LX3.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "observeUpdate: lifecycleOwner is null, skip flow for creationId="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJIJI(r2, r0)
            X.05wz r0 = X.C1518305wz.LL
            return r0
        L42:
            com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService r3 = X.C545110LZl.LIZIZ
            if (r3 == 0) goto L67
            X.0LaR r2 = new X.0LaR
            androidx.lifecycle.Lifecycle r1 = r8.getLifecycle()
            r0 = 0
            r2.<init>(r1, r4, r0)
            r6.LLILLL = r4
            java.lang.Object r1 = r3.LJII(r9, r2, r6)
            if (r1 != r5) goto L22
            return r5
        L59:
            X.0La1 r6 = new X.0La1
            r6.<init>(r7, r10)
            goto L12
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L67:
            X.05wz r0 = X.C1518305wz.LL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545110LZl.LIZJ(androidx.lifecycle.LifecycleOwner, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.util.List<java.lang.String> r11, androidx.lifecycle.LifecycleOwner r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545110LZl.LJ(java.util.List, androidx.lifecycle.LifecycleOwner, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0242 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0291  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0243 -> B:78:0x0245). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r18, java.util.List<X.C552940LmO> r19, androidx.lifecycle.LifecycleOwner r20, X.InterfaceC1364105Vn<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545110LZl.LIZIZ(java.lang.String, java.util.List, androidx.lifecycle.LifecycleOwner, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e4  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [X.0Eys, com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager, com.ss.android.ugc.aweme.aigc.asynctask.models.ParentTaskInput] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.ss.android.ugc.aweme.aigc.asynctask.models.PublicInputType] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.ss.android.ugc.aweme.aigc.asynctask.models.ChildTaskOutput] */
    /* JADX WARN: Type inference failed for: r22v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService r24, X.C552940LmO r25, java.lang.String r26, java.lang.String r27, X.InterfaceC1364105Vn<? super kotlin.Unit> r28) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545110LZl.LIZLLL(com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService, X.0LmO, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
