package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.AVApi;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0LuA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C557760LuA {
    public static final String LIZIZ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(54));

    static {
        String strLIZ;
        AVApi aVApi = (AVApi) PluggableExtentionKt.pluggableSpi$default(AVApi.class, false, false, false, 14, null);
        if (aVApi == null || (strLIZ = aVApi.LIZ()) == null) {
            strLIZ = "";
        }
        LIZIZ = strLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r7, X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C557790LuD
            if (r0 == 0) goto L22
            r5 = r8
            X.0LuD r5 = (X.C557790LuD) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            java.lang.String r3 = "cancelAGICTask: error: "
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L28
            goto L5a
        L22:
            X.0LuD r5 = new X.0LuD
            r5.<init>(r6, r8)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            int r0 = r7.length()     // Catch: com.google.gson.s -> L62 java.io.IOException -> L78 java.lang.ClassCastException -> L90
            if (r0 != 0) goto L3b
            r0 = 1
            goto L3c
        L3b:
            r0 = 0
        L3c:
            if (r0 == 0) goto L44
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: com.google.gson.s -> L62 java.io.IOException -> L78 java.lang.ClassCastException -> L90
            return r0
        L44:
            X.01GW r0 = r6.LIZ     // Catch: com.google.gson.s -> L62 java.io.IOException -> L78 java.lang.ClassCastException -> L90
            java.lang.Object r1 = r0.getValue()     // Catch: com.google.gson.s -> L62 java.io.IOException -> L78 java.lang.ClassCastException -> L90
            com.ss.android.ugc.aweme.aigc.graph.net.AIGCWorkflowNetApi r1 = (com.ss.android.ugc.aweme.aigc.graph.net.AIGCWorkflowNetApi) r1     // Catch: com.google.gson.s -> L62 java.io.IOException -> L78 java.lang.ClassCastException -> L90
            com.ss.android.ugc.aweme.aigc.graph.net.TaskDiscardBody r0 = new com.ss.android.ugc.aweme.aigc.graph.net.TaskDiscardBody     // Catch: com.google.gson.s -> L62 java.io.IOException -> L78 java.lang.ClassCastException -> L90
            r0.<init>(r7)     // Catch: com.google.gson.s -> L62 java.io.IOException -> L78 java.lang.ClassCastException -> L90
            r5.LLILLL = r2     // Catch: com.google.gson.s -> L62 java.io.IOException -> L78 java.lang.ClassCastException -> L90
            java.lang.Object r0 = X.C557820LuG.LIZ(r1, r0, r5)     // Catch: com.google.gson.s -> L62 java.io.IOException -> L78 java.lang.ClassCastException -> L90
            if (r0 != r4) goto L5d
            return r4
        L5a:
            X.C155000ia.LIZIZ(r1)     // Catch: com.google.gson.s -> L62 java.io.IOException -> L78 java.lang.ClassCastException -> L90
        L5d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: com.google.gson.s -> L62 java.io.IOException -> L78 java.lang.ClassCastException -> L90
            return r0
        L62:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            X.C557840LuI.LIZ(r0)
            goto La5
        L78:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "cancelAGICTask: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C557840LuI.LIZ(r0)
            goto La5
        L90:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            X.C557840LuI.LIZ(r0)
        La5:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C557760LuA.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.aigc.graph.net.CreateTaskBody r13, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.graph.net.CreateTaskResponse> r14) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C557760LuA.LIZIZ(com.ss.android.ugc.aweme.aigc.graph.net.CreateTaskBody, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.aigc.graph.net.GenerateTaskBody r13, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.graph.net.CreateTaskResponse> r14) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C557760LuA.LIZJ(com.ss.android.ugc.aweme.aigc.graph.net.GenerateTaskBody, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r9, java.lang.String r10, X.InterfaceC1364105Vn r11) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C557760LuA.LIZLLL(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.util.List<java.lang.String> r17, boolean r18, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.graph.net.TasksDetailResponse> r19) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C557760LuA.LJ(java.util.List, boolean, X.05Vn):java.lang.Object");
    }
}
