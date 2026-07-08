package X;

import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowArchConfig;
import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig;
import java.util.Map;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Lrp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC556310Lrp {
    public final C556430Ls1 LIZ = new C556430Ls1();

    public abstract void LJI(String str, String str2, Map<String, String> map);

    public static void LJFF(String str) {
        C201955140j.LJIILL(C0LX3.LIZIZ, "AIGCWorkflowBaseTracker", str);
    }

    public static String LJII(Map map) {
        return C13LP.LJJLIIIJ(map.entrySet(), ", ", null, null, 0, null, AFwS229S0000000_2.get$arr$(869), 30);
    }

    public static String LJIIIIZZ(String str, AIGCWorkflowConfig aIGCWorkflowConfig) {
        AIGCWorkflowArchConfig aIGCWorkflowArchConfig;
        String str2;
        if (aIGCWorkflowConfig != null && (aIGCWorkflowArchConfig = aIGCWorkflowConfig.archConfig) != null && (str2 = aIGCWorkflowArchConfig.customTraceId) != null && (!a0.LJJJIL(str2))) {
            return str2;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C2217908mX r22, X.C556090LrT r23) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC556310Lrp.LIZLLL(X.08mX, X.0LrT):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r9, java.util.Map<java.lang.String, ? extends X.InterfaceC1406105et> r10, X.InterfaceC1364105Vn<? super java.lang.String> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C556410Lrz
            if (r0 == 0) goto L54
            r7 = r11
            X.0Lrz r7 = (X.C556410Lrz) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            java.lang.String r5 = ""
            r4 = 1
            if (r0 == 0) goto L2b
            if (r0 != r4) goto L5b
            X.C155000ia.LIZIZ(r1)
        L24:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L5a
            if (r1 == 0) goto L5a
            return r1
        L2b:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r10.get(r9)
            X.05et r3 = (X.InterfaceC1406105et) r3
            if (r3 != 0) goto L37
            return r5
        L37:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory> r1 = com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory.class
            r0 = 0
            java.lang.Object r1 = r2.getService(r1, r0, r0)
            com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory r1 = (com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory) r1
            X.0Ls9 r0 = new X.0Ls9
            r0.<init>()
            java.lang.reflect.Type r0 = r0.LIZ
            r7.LLILLL = r4
            java.lang.Object r1 = r1.LIZIZ(r3, r0, r7)
            if (r1 != r6) goto L24
            return r6
        L54:
            X.0Lrz r7 = new X.0Lrz
            r7.<init>(r8, r11)
            goto L12
        L5a:
            return r5
        L5b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC556310Lrp.LIZJ(java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0169 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r18, com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig r19, java.util.Map<java.lang.String, ? extends X.InterfaceC1406105et> r20, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, java.lang.String>> r21) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC556310Lrp.LIZ(java.lang.String, com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r9, java.lang.String r10, X.InterfaceC1406105et r11, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, java.lang.String>> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof X.C556400Lry
            if (r0 == 0) goto La6
            r6 = r12
            X.0Lry r6 = (X.C556400Lry) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La6
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r3 = r6.LLILLL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r5 = 0
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L7f
            if (r0 != r2) goto Lad
            int r9 = r6.LL
            java.lang.Object r10 = r6.LLILLJJLI
            X.C155000ia.LIZIZ(r3)
        L28:
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.aigc.graph.nodes.node.BuiltinNodeErrorCustomContext
            if (r0 != 0) goto L2d
            r3 = r4
        L2d:
            com.ss.android.ugc.aweme.aigc.graph.nodes.node.BuiltinNodeErrorCustomContext r3 = (com.ss.android.ugc.aweme.aigc.graph.nodes.node.BuiltinNodeErrorCustomContext) r3
        L2f:
            X.13DA r2 = new X.13DA
            r2.<init>()
            if (r3 == 0) goto L7d
            int r0 = r3.legacyCode
        L38:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "error_code"
            r2.put(r0, r1)
            java.lang.String r1 = "error_code_unified"
            java.lang.String r0 = java.lang.String.valueOf(r9)
            r2.put(r1, r0)
            if (r3 == 0) goto L51
            java.lang.String r0 = r3.legacyMessage
            if (r0 == 0) goto L51
            r10 = r0
        L51:
            java.lang.String r0 = "error_message"
            r2.put(r0, r10)
            if (r3 == 0) goto L78
            java.lang.Integer r0 = r3.serverCode
            if (r0 == 0) goto L69
            int r0 = r0.intValue()
            java.lang.String r1 = "server_code"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.put(r1, r0)
        L69:
            java.lang.String r1 = r3.serverMessage
            if (r1 == 0) goto L78
            int r0 = r1.length()
            if (r0 <= 0) goto L78
            java.lang.String r0 = "server_message"
            r2.put(r0, r1)
        L78:
            java.util.Map r0 = r2.build()
            return r0
        L7d:
            r0 = r9
            goto L38
        L7f:
            X.C155000ia.LIZIZ(r3)
            if (r11 == 0) goto La4
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory> r0 = com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory.class
            java.lang.Object r1 = r1.getService(r0, r5, r5)
            com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory r1 = (com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory) r1
            X.0LsA r0 = new X.0LsA
            r0.<init>()
            java.lang.reflect.Type r0 = r0.LIZ
            r6.LLILLJJLI = r10
            r6.LL = r9
            r6.LLILZIL = r2
            java.lang.Object r3 = r1.LIZIZ(r11, r0, r6)
            if (r3 != r7) goto L28
            return r7
        La4:
            r3 = r4
            goto L2f
        La6:
            X.0Lry r6 = new X.0Lry
            r6.<init>(r8, r12)
            goto L12
        Lad:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC556310Lrp.LIZIZ(int, java.lang.String, X.05et, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C07ZG r26, com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig r27, java.util.Map<java.lang.String, ? extends X.InterfaceC1406105et> r28, X.InterfaceC1364105Vn<? super kotlin.Unit> r29) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC556310Lrp.LJ(X.07ZG, com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(java.lang.String r6, com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig r7, java.util.Map<java.lang.String, ? extends X.InterfaceC1406105et> r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C556390Lrx
            if (r0 == 0) goto L5d
            r4 = r9
            X.0Lrx r4 = (X.C556390Lrx) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZIL
            r0 = 1
            if (r1 == 0) goto L4d
            if (r1 != r0) goto L63
            com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig r7 = r4.LLILLJJLI
            java.lang.Object r6 = r4.LL
            java.lang.String r6 = (java.lang.String) r6
            X.C155000ia.LIZIZ(r3)
        L28:
            java.util.Map r3 = (java.util.Map) r3
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ai_task_start | "
            r1.append(r0)
            java.lang.String r0 = LJII(r3)
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            LJFF(r0)
            java.lang.String r1 = LJIIIIZZ(r6, r7)
            java.lang.String r0 = "ai_task_start"
            r5.LJI(r1, r0, r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4d:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r6
            r4.LLILLJJLI = r7
            r4.LLILZIL = r0
            java.lang.Object r3 = r5.LIZ(r6, r7, r8, r4)
            if (r3 != r2) goto L28
            return r2
        L5d:
            X.0Lrx r4 = new X.0Lrx
            r4.<init>(r5, r9)
            goto L12
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC556310Lrp.LJIILJJIL(java.lang.String, com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(java.lang.String r8, X.C556010LrL r9, com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig r10, java.util.Map<java.lang.String, ? extends X.InterfaceC1406105et> r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof X.C556370Lrv
            if (r0 == 0) goto Lb7
            r4 = r12
            X.0Lrv r4 = (X.C556370Lrv) r4
            int r2 = r4.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb7
            int r2 = r2 - r1
            r4.LLILZLL = r2
        L12:
            java.lang.Object r6 = r4.LLILZ
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZLL
            r3 = 1
            if (r0 == 0) goto L60
            if (r0 != r3) goto Lbe
            com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig r10 = r4.LLILLL
            X.0LrL r9 = r4.LLILLJJLI
            java.lang.Object r8 = r4.LL
            java.lang.String r8 = (java.lang.String) r8
            X.C155000ia.LIZIZ(r6)
        L2a:
            java.util.Map r6 = (java.util.Map) r6
            java.lang.String r2 = r9.LIZJ
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "task_type"
            r1.<init>(r0, r2)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r1)
            java.util.Map r2 = X.C2097608Jq.LJIIL(r6, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ai_subtask_start | "
            r1.append(r0)
            java.lang.String r0 = LJII(r2)
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            LJFF(r0)
            java.lang.String r1 = LJIIIIZZ(r8, r10)
            java.lang.String r0 = "ai_subtask_start"
            r7.LJI(r1, r0, r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L60:
            X.C155000ia.LIZIZ(r6)
            X.0LX3 r2 = X.C0LX3.LIZIZ
            java.lang.StringBuilder r6 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "trackSubtaskStart called: workflowId="
            r6.append(r0)
            r6.append(r8)
            java.lang.String r0 = ", nodeId="
            r6.append(r0)
            java.lang.String r0 = r9.LIZ
            r6.append(r0)
            java.lang.String r0 = ", trackerHash="
            r6.append(r0)
            int r0 = java.lang.System.identityHashCode(r7)
            r6.append(r0)
            java.lang.String r0 = ", alreadyCached="
            r6.append(r0)
            X.0Ls1 r1 = r7.LIZ
            java.lang.String r0 = r9.LIZ
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Long> r1 = r1.LIZ
            java.lang.String r0 = X.C556430Ls1.LIZ(r8, r0)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            boolean r0 = r1.containsKey(r0)
            r6.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r6)
            java.lang.String r0 = "lydiaTest"
            X.C201955140j.LJIILL(r2, r0, r1)
            r4.LL = r8
            r4.LLILLJJLI = r9
            r4.LLILLL = r10
            r4.LLILZLL = r3
            java.lang.Object r6 = r7.LIZ(r8, r10, r11, r4)
            if (r6 != r5) goto L2a
            return r5
        Lb7:
            X.0Lrv r4 = new X.0Lrv
            r4.<init>(r7, r12)
            goto L12
        Lbe:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC556310Lrp.LJIIJJI(java.lang.String, X.0LrL, com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(java.lang.String r7, long r8, com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig r10, java.util.Map<java.lang.String, ? extends X.InterfaceC1406105et> r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r6 = this;
            boolean r0 = r12 instanceof X.C556380Lrw
            if (r0 == 0) goto L8f
            r3 = r12
            X.0Lrw r3 = (X.C556380Lrw) r3
            int r2 = r3.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8f
            int r2 = r2 - r1
            r3.LLILZLL = r2
        L12:
            java.lang.Object r5 = r3.LLILZ
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILZLL
            r2 = 1
            if (r0 == 0) goto L62
            if (r0 != r2) goto L96
            long r8 = r3.LLILLL
            com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig r10 = r3.LLILLJJLI
            java.lang.Object r7 = r3.LL
            java.lang.String r7 = (java.lang.String) r7
            X.C155000ia.LIZIZ(r5)
        L2a:
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r2 = java.lang.String.valueOf(r8)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "duration_ms"
            r1.<init>(r0, r2)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r1)
            java.util.Map r2 = X.C2097608Jq.LJIIL(r5, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ai_task_cancel | "
            r1.append(r0)
            java.lang.String r0 = LJII(r2)
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            LJFF(r0)
            java.lang.String r1 = LJIIIIZZ(r7, r10)
            java.lang.String r0 = "ai_task_cancel"
            r6.LJI(r1, r0, r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L62:
            X.C155000ia.LIZIZ(r5)
            X.0Ls1 r0 = r6.LIZ
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Long> r1 = r0.LIZ
            r0 = 0
            java.lang.String r0 = X.C556430Ls1.LIZ(r7, r0)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r0 = r1.remove(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L8c
            long r0 = r0.longValue()
            long r8 = r8 - r0
        L7d:
            r3.LL = r7
            r3.LLILLJJLI = r10
            r3.LLILLL = r8
            r3.LLILZLL = r2
            java.lang.Object r5 = r6.LIZ(r7, r10, r11, r3)
            if (r5 != r4) goto L2a
            return r4
        L8c:
            r8 = -1
            goto L7d
        L8f:
            X.0Lrw r3 = new X.0Lrw
            r3.<init>(r6, r12)
            goto L12
        L96:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC556310Lrp.LJIIL(java.lang.String, long, com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.lang.String r7, X.C556010LrL r8, long r9, com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig r11, java.util.Map<java.lang.String, ? extends X.InterfaceC1406105et> r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            r6 = this;
            boolean r0 = r13 instanceof X.C556350Lrt
            if (r0 == 0) goto La5
            r3 = r13
            X.0Lrt r3 = (X.C556350Lrt) r3
            int r2 = r3.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La5
            int r2 = r2 - r1
            r3.LLIZ = r2
        L12:
            java.lang.Object r5 = r3.LLILZIL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLIZ
            r2 = 1
            if (r0 == 0) goto L75
            if (r0 != r2) goto Lac
            long r9 = r3.LLILZ
            com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig r11 = r3.LLILLL
            X.0LrL r8 = r3.LLILLJJLI
            java.lang.Object r7 = r3.LL
            java.lang.String r7 = (java.lang.String) r7
            X.C155000ia.LIZIZ(r5)
        L2c:
            java.util.Map r5 = (java.util.Map) r5
            r0 = 2
            kotlin.Pair[] r4 = new kotlin.Pair[r0]
            java.lang.String r3 = r8.LIZJ
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "task_type"
            r1.<init>(r0, r3)
            r0 = 0
            r4[r0] = r1
            java.lang.String r3 = java.lang.String.valueOf(r9)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "duration_ms"
            r1.<init>(r0, r3)
            r4[r2] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r4)
            java.util.Map r2 = X.C2097608Jq.LJIIL(r5, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ai_subtask_cancel | "
            r1.append(r0)
            java.lang.String r0 = LJII(r2)
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            LJFF(r0)
            java.lang.String r1 = LJIIIIZZ(r7, r11)
            java.lang.String r0 = "ai_subtask_cancel"
            r6.LJI(r1, r0, r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L75:
            X.C155000ia.LIZIZ(r5)
            java.lang.String r5 = r8.LIZ
            X.0Ls1 r0 = r6.LIZ
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Long> r1 = r0.LIZ
            java.lang.String r0 = X.C556430Ls1.LIZ(r7, r5)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r0 = r1.remove(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto La2
            long r0 = r0.longValue()
            long r9 = r9 - r0
        L91:
            r3.LL = r7
            r3.LLILLJJLI = r8
            r3.LLILLL = r11
            r3.LLILZ = r9
            r3.LLIZ = r2
            java.lang.Object r5 = r6.LIZ(r7, r11, r12, r3)
            if (r5 != r4) goto L2c
            return r4
        La2:
            r9 = -1
            goto L91
        La5:
            X.0Lrt r3 = new X.0Lrt
            r3.<init>(r6, r13)
            goto L12
        Lac:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC556310Lrp.LJIIIZ(java.lang.String, X.0LrL, long, com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(java.lang.String r20, int r21, int r22, java.lang.String r23, X.InterfaceC1406105et r24, long r25, com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig r27, java.util.Map<java.lang.String, ? extends X.InterfaceC1406105et> r28, X.InterfaceC1364105Vn<? super kotlin.Unit> r29) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC556310Lrp.LJIILIIL(java.lang.String, int, int, java.lang.String, X.05et, long, com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(java.lang.String r20, X.C556010LrL r21, int r22, int r23, java.lang.String r24, X.InterfaceC1406105et r25, long r26, com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig r28, java.util.Map<java.lang.String, ? extends X.InterfaceC1406105et> r29, X.InterfaceC1364105Vn<? super kotlin.Unit> r30) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC556310Lrp.LJIIJ(java.lang.String, X.0LrL, int, int, java.lang.String, X.05et, long, com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig, java.util.Map, X.05Vn):java.lang.Object");
    }
}
