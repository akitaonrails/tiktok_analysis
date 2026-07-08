package X;

import com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetApiV2;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tools.AVApi;

/* JADX INFO: renamed from: X.0LuK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C557860LuK {
    public static final String LIZIZ = ((AVApi) ServiceManager.get().getService(AVApi.class)).LIZ();
    public final C01GW LIZ = C452501pT.LIZIZ(new C558010LuZ());

    public final AIGCTaskNetApiV2 LJI() {
        return (AIGCTaskNetApiV2) this.LIZ.getValue();
    }

    public C557860LuK() {
        C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r7, X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C557940LuS
            if (r0 == 0) goto L22
            r5 = r8
            X.0LuS r5 = (X.C557940LuS) r5
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
            goto L56
        L22:
            X.0LuS r5 = new X.0LuS
            r5.<init>(r6, r8)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            int r0 = r7.length()     // Catch: com.google.gson.s -> L5e java.io.IOException -> L74 java.lang.ClassCastException -> L8c
            if (r0 != 0) goto L3b
            r0 = 1
            goto L3c
        L3b:
            r0 = 0
        L3c:
            if (r0 == 0) goto L44
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: com.google.gson.s -> L5e java.io.IOException -> L74 java.lang.ClassCastException -> L8c
            return r0
        L44:
            com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetApiV2 r1 = r6.LJI()     // Catch: com.google.gson.s -> L5e java.io.IOException -> L74 java.lang.ClassCastException -> L8c
            com.ss.android.ugc.aweme.aigc.asynctask.net.TaskDiscardBody r0 = new com.ss.android.ugc.aweme.aigc.asynctask.net.TaskDiscardBody     // Catch: com.google.gson.s -> L5e java.io.IOException -> L74 java.lang.ClassCastException -> L8c
            r0.<init>(r7)     // Catch: com.google.gson.s -> L5e java.io.IOException -> L74 java.lang.ClassCastException -> L8c
            r5.LLILLL = r2     // Catch: com.google.gson.s -> L5e java.io.IOException -> L74 java.lang.ClassCastException -> L8c
            java.lang.Object r0 = X.C557870LuL.LIZ(r1, r0, r5)     // Catch: com.google.gson.s -> L5e java.io.IOException -> L74 java.lang.ClassCastException -> L8c
            if (r0 != r4) goto L59
            return r4
        L56:
            X.C155000ia.LIZIZ(r1)     // Catch: com.google.gson.s -> L5e java.io.IOException -> L74 java.lang.ClassCastException -> L8c
        L59:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: com.google.gson.s -> L5e java.io.IOException -> L74 java.lang.ClassCastException -> L8c
            return r0
        L5e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            X.C09JK.LIZIZ(r0)
            goto La1
        L74:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "cancelAGICTask: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C09JK.LIZIZ(r0)
            goto La1
        L8c:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            X.C09JK.LIZIZ(r0)
        La1:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C557860LuK.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.aigc.asynctask.net.CreateTaskBody r14, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.net.CreateTaskResponse> r15) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C557860LuK.LIZIZ(com.ss.android.ugc.aweme.aigc.asynctask.net.CreateTaskBody, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.aigc.asynctask.net.CreateTaskBody r14, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.net.CreateTaskResponse> r15) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C557860LuK.LIZJ(com.ss.android.ugc.aweme.aigc.asynctask.net.CreateTaskBody, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(com.ss.android.ugc.aweme.aigc.asynctask.net.QuotaRefreshBody r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.base.api.BaseResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C557920LuQ
            if (r0 == 0) goto L20
            r4 = r7
            X.0LuQ r4 = (X.C557920LuQ) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            goto L26
        L20:
            X.0LuQ r4 = new X.0LuQ
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r3)     // Catch: java.io.IOException -> L43 X.C0XIR -> L5b
            return r3
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetApiV2 r0 = r5.LJI()     // Catch: java.io.IOException -> L43 X.C0XIR -> L5b
            r4.LLILLL = r1     // Catch: java.io.IOException -> L43 X.C0XIR -> L5b
            java.lang.Object r3 = r0.notifyQuotaRefresh(r6, r4)     // Catch: java.io.IOException -> L43 X.C0XIR -> L5b
            if (r3 != r2) goto L42
            return r2
        L42:
            return r3
        L43:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "notifyQuotaRefresh "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C09JK.LIZIZ(r0)
            goto L6e
        L5b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0LMx r2 = X.C541850LMx.LIZIZ
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "notifyQuotaRefresh error: "
            X.C201955140j.LIZLLL(r2, r0, r1)
        L6e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C557860LuK.LJIIIIZZ(com.ss.android.ugc.aweme.aigc.asynctask.net.QuotaRefreshBody, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(com.ss.android.ugc.aweme.aigc.asynctask.net.ReportTaskBody r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.base.api.BaseResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C557930LuR
            if (r0 == 0) goto L20
            r4 = r7
            X.0LuR r4 = (X.C557930LuR) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            goto L26
        L20:
            X.0LuR r4 = new X.0LuR
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r3)     // Catch: java.io.IOException -> L43 X.C0XIR -> L5b
            return r3
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetApiV2 r0 = r5.LJI()     // Catch: java.io.IOException -> L43 X.C0XIR -> L5b
            r4.LLILLL = r1     // Catch: java.io.IOException -> L43 X.C0XIR -> L5b
            java.lang.Object r3 = r0.submitAIGCReport(r6, r4)     // Catch: java.io.IOException -> L43 X.C0XIR -> L5b
            if (r3 != r2) goto L42
            return r2
        L42:
            return r3
        L43:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "submitAIGCReport "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C09JK.LIZIZ(r0)
            goto L6e
        L5b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0LMx r2 = X.C541850LMx.LIZIZ
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "submit report error: "
            X.C201955140j.LIZLLL(r2, r0, r1)
        L6e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C557860LuK.LJIIJ(com.ss.android.ugc.aweme.aigc.asynctask.net.ReportTaskBody, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.EnumC1987107qP r13, java.util.List<java.lang.String> r14, X.InterfaceC1364105Vn<? super X.C382360Eyw> r15) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C557860LuK.LIZLLL(X.07qP, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.util.List<java.lang.String> r17, boolean r18, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.net.TasksDetailResponse> r19) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C557860LuK.LJFF(java.util.List, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(int r8, java.util.List<com.ss.android.ugc.aweme.aigc.asynctask.net.ImageInfo> r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.net.SuggestPromptsWithImageResponse> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C557970LuV
            if (r0 == 0) goto L20
            r6 = r10
            X.0LuV r6 = (X.C557970LuV) r6
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
            if (r0 == 0) goto L32
            if (r0 != r4) goto L2a
            goto L26
        L20:
            X.0LuV r6 = new X.0LuV
            r6.<init>(r7, r10)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L5e
            return r1
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.aigc.asynctask.net.Scope r3 = new com.ss.android.ugc.aweme.aigc.asynctask.net.Scope     // Catch: java.lang.Exception -> L5e
            java.lang.String r2 = "ic"
            X.0LuW r0 = X.EnumC557980LuW.EDITOR_PRO     // Catch: java.lang.Exception -> L5e
            int r0 = r0.getValue()     // Catch: java.lang.Exception -> L5e
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Exception -> L5e
            java.lang.Integer r0 = X.C2286608xc.LJ(r8)     // Catch: java.lang.Exception -> L5e
            r3.<init>(r2, r1, r0)     // Catch: java.lang.Exception -> L5e
            com.ss.android.ugc.aweme.aigc.asynctask.net.SuggestPromptsWithImageBody r1 = new com.ss.android.ugc.aweme.aigc.asynctask.net.SuggestPromptsWithImageBody     // Catch: java.lang.Exception -> L5e
            r0 = 0
            r1.<init>(r3, r0, r9)     // Catch: java.lang.Exception -> L5e
            com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetApiV2 r0 = r7.LJI()     // Catch: java.lang.Exception -> L5e
            r6.LLILLL = r4     // Catch: java.lang.Exception -> L5e
            java.lang.Object r1 = r0.requestSuggestPromptsWithImage(r1, r6)     // Catch: java.lang.Exception -> L5e
            if (r1 != r5) goto L5d
            return r5
        L5d:
            return r1
        L5e:
            r4 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getSuggestPrompts: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C09JK.LIZIZ(r0)
            com.ss.android.ugc.aweme.aigc.asynctask.net.SuggestPromptsWithImageResponse r3 = new com.ss.android.ugc.aweme.aigc.asynctask.net.SuggestPromptsWithImageResponse
            r0 = 500201(0x7a1e9, float:7.00931E-40)
            java.lang.Integer r2 = X.C2286608xc.LJ(r0)
            java.lang.String r1 = r4.getMessage()
            r0 = 0
            r3.<init>(r0, r2, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C557860LuK.LJIIIZ(int, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.util.List<java.lang.Long> r11, java.lang.String r12, java.lang.String r13, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult> r14) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C557860LuK.LJ(java.util.List, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(int r10, int r11, java.lang.String r12, java.lang.Integer r13, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.net.SuggestPromptsResponse> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof X.C557890LuN
            if (r0 == 0) goto L20
            r8 = r14
            X.0LuN r8 = (X.C557890LuN) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r8.LLILLL = r2
        L12:
            java.lang.Object r3 = r8.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r8.LLILLL
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 != r0) goto L2a
            goto L26
        L20:
            X.0LuN r8 = new X.0LuN
            r8.<init>(r9, r14)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L47
            return r3
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetApiV2 r3 = r9.LJI()     // Catch: java.lang.Exception -> L47
            r8.LLILLL = r0     // Catch: java.lang.Exception -> L47
            r7 = r13
            r6 = r12
            r5 = r11
            r4 = r10
            java.lang.Object r3 = r3.getSuggestPrompts(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L47
            if (r3 != r2) goto L46
            return r2
        L46:
            return r3
        L47:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getSuggestPrompts: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C09JK.LIZIZ(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C557860LuK.LJII(int, int, java.lang.String, java.lang.Integer, X.05Vn):java.lang.Object");
    }
}
