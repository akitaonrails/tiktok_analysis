package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tools.AVApi;

/* JADX INFO: renamed from: X.0Luf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558070Luf {
    public static final String LIZIZ = ((AVApi) ServiceManager.get().getService(AVApi.class)).LIZ();
    public final C01GW LIZ = C452501pT.LIZIZ(new C558120Luk());

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<java.lang.String> r9, X.InterfaceC1364105Vn<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C558090Luh
            if (r0 == 0) goto L20
            r6 = r10
            X.0Luh r6 = (X.C558090Luh) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            goto L72
        L20:
            X.0Luh r6 = new X.0Luh
            r6.<init>(r8, r10)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.01GW r0 = r8.LIZ     // Catch: java.io.IOException -> L7a
            java.lang.Object r7 = r0.getValue()     // Catch: java.io.IOException -> L7a
            com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetApi r7 = (com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetApi) r7     // Catch: java.io.IOException -> L7a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.io.IOException -> L7a
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r9, r0)     // Catch: java.io.IOException -> L7a
            r3.<init>(r0)     // Catch: java.io.IOException -> L7a
            java.util.Iterator r2 = r9.iterator()     // Catch: java.io.IOException -> L7a
        L48:
            boolean r0 = r2.hasNext()     // Catch: java.io.IOException -> L7a
            if (r0 == 0) goto L5d
            java.lang.Object r1 = r2.next()     // Catch: java.io.IOException -> L7a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.io.IOException -> L7a
            com.ss.android.ugc.aweme.aigc.asynctask.net.TaskAction r0 = new com.ss.android.ugc.aweme.aigc.asynctask.net.TaskAction     // Catch: java.io.IOException -> L7a
            r0.<init>(r1, r4)     // Catch: java.io.IOException -> L7a
            r3.add(r0)     // Catch: java.io.IOException -> L7a
            goto L48
        L5d:
            com.ss.android.ugc.aweme.aigc.asynctask.net.UpdateAIGCTaskStatusBody r1 = new com.ss.android.ugc.aweme.aigc.asynctask.net.UpdateAIGCTaskStatusBody     // Catch: java.io.IOException -> L7a
            r1.<init>(r3)     // Catch: java.io.IOException -> L7a
            r6.LLILLL = r4     // Catch: java.io.IOException -> L7a
            X.0Lul r0 = com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetApi.LIZ     // Catch: java.io.IOException -> L7a
            r0.getClass()     // Catch: java.io.IOException -> L7a
            java.lang.String r0 = X.C558130Lul.LIZIZ     // Catch: java.io.IOException -> L7a
            java.lang.Object r0 = r7.updateAIGCTaskStatus(r0, r1, r6)     // Catch: java.io.IOException -> L7a
            if (r0 != r5) goto L75
            return r5
        L72:
            X.C155000ia.LIZIZ(r1)     // Catch: java.io.IOException -> L7a
        L75:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch: java.io.IOException -> L7a
            return r0
        L7a:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "cancelAGICTask: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C09JK.LIZIZ(r0)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C558070Luf.LIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.aigc.asynctask.net.CreateAIGCTaskBody r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.net.CreateAIGCTaskResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C558080Lug
            if (r0 == 0) goto L20
            r4 = r7
            X.0Lug r4 = (X.C558080Lug) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2a
            goto L26
        L20:
            X.0Lug r4 = new X.0Lug
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.io.IOException -> L4e
            return r1
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            X.01GW r0 = r5.LIZ     // Catch: java.io.IOException -> L4e
            java.lang.Object r1 = r0.getValue()     // Catch: java.io.IOException -> L4e
            com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetApi r1 = (com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetApi) r1     // Catch: java.io.IOException -> L4e
            r4.LLILLL = r2     // Catch: java.io.IOException -> L4e
            X.0Lul r0 = com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetApi.LIZ     // Catch: java.io.IOException -> L4e
            r0.getClass()     // Catch: java.io.IOException -> L4e
            java.lang.String r0 = X.C558130Lul.LIZIZ     // Catch: java.io.IOException -> L4e
            java.lang.Object r1 = r1.createAIGCTask(r0, r6, r4)     // Catch: java.io.IOException -> L4e
            if (r1 != r3) goto L4d
            return r3
        L4d:
            return r1
        L4e:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "createAIGCTask: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C09JK.LIZIZ(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C558070Luf.LIZIZ(com.ss.android.ugc.aweme.aigc.asynctask.net.CreateAIGCTaskBody, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.List<java.lang.String> r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.net.UpdateAIGCTaskStatusResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C558110Luj
            if (r0 == 0) goto L20
            r5 = r8
            X.0Luj r5 = (X.C558110Luj) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L2a
            goto L26
        L20:
            X.0Luj r5 = new X.0Luj
            r5.<init>(r6, r8)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.io.IOException -> L53
            return r1
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            X.01GW r0 = r6.LIZ     // Catch: java.io.IOException -> L53
            java.lang.Object r2 = r0.getValue()     // Catch: java.io.IOException -> L53
            com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetApi r2 = (com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetApi) r2     // Catch: java.io.IOException -> L53
            com.ss.android.ugc.aweme.aigc.asynctask.net.GetAIGCTaskDetailBody r1 = new com.ss.android.ugc.aweme.aigc.asynctask.net.GetAIGCTaskDetailBody     // Catch: java.io.IOException -> L53
            r1.<init>(r7)     // Catch: java.io.IOException -> L53
            r5.LLILLL = r3     // Catch: java.io.IOException -> L53
            X.0Lul r0 = com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetApi.LIZ     // Catch: java.io.IOException -> L53
            r0.getClass()     // Catch: java.io.IOException -> L53
            java.lang.String r0 = X.C558130Lul.LIZIZ     // Catch: java.io.IOException -> L53
            java.lang.Object r1 = r2.getAIGCTaskDetail(r0, r1, r5)     // Catch: java.io.IOException -> L53
            if (r1 != r4) goto L52
            return r4
        L52:
            return r1
        L53:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getAIGCTaskDetail: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C09JK.LIZIZ(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C558070Luf.LIZLLL(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r15, java.lang.String r16, java.lang.String r17, X.InterfaceC1364105Vn<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>> r18) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C558070Luf.LIZJ(java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
