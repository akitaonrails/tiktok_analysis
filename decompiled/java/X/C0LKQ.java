package X;

import com.ss.android.ugc.aweme.aigc.asynctask.VideoUploadTosTaskOutput;

/* JADX INFO: renamed from: X.0LKQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LKQ extends C0LTN<C09JG, VideoUploadTosTaskOutput> {
    public final String LJIIIIZZ = "VideoUploadTask";
    public final String LJIIIZ = C0LMI.UPLOAD.getType();
    public final C054G LJIIJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final long LJIIJJI = C306660C0i.LIZ();

    @Override // X.C0LTN
    public final String LJIL() {
        return this.LJIIIZ;
    }

    @Override // X.C0LTN
    public final String LJJ() {
        return this.LJIIIIZZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJL(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.publish.model.AutoCutAgentAuthConfig> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C0LKU
            if (r0 == 0) goto L76
            r5 = r8
            X.0LKU r5 = (X.C0LKU) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 1
            if (r0 == 0) goto L27
            if (r0 != r4) goto L7c
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig r1 = (com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig) r1
            com.ss.android.ugc.aweme.publish.model.AutoCutAgentAuthConfig r0 = r1.autoCutAgentAuthConfig
            return r0
        L27:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = X.C297690Blf.LIZ()
            if (r0 == 0) goto L40
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0o1f r0 = r0.getAccountService()
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L40
            r0 = 0
            return r0
        L40:
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0niP r2 = r0.getNetworkService()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.tools.AVApi> r0 = com.ss.android.ugc.aweme.tools.AVApi.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.tools.AVApi r0 = (com.ss.android.ugc.aweme.tools.AVApi) r0
            java.lang.String r1 = r0.LIZ()
            java.lang.Class<com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService> r0 = com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService.class
            java.lang.Object r3 = r2.createRetrofit(r1, r4, r0)
            com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService r3 = (com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService) r3
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "purpose"
            java.lang.String r0 = "ai_remix"
            r2.<init>(r1, r0)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r2)
            r5.LLILLL = r4
            java.lang.Object r1 = r3.LIZ(r0, r5)
            if (r1 != r6) goto L22
            return r6
        L76:
            X.0LKU r5 = new X.0LKU
            r5.<init>(r7, r8)
            goto L12
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LKQ.LJJJJL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x036f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0253 A[Catch: Exception -> 0x0380, IOException -> 0x03bb, TryCatch #2 {IOException -> 0x03bb, Exception -> 0x0380, blocks: (B:71:0x023c, B:76:0x024f, B:78:0x0253, B:99:0x0345, B:81:0x026e, B:85:0x02a4, B:88:0x02ab, B:90:0x02d9, B:103:0x0356, B:94:0x02f5, B:107:0x0363, B:112:0x0377, B:75:0x024c, B:84:0x02a1, B:98:0x0342, B:102:0x0353, B:106:0x0360, B:111:0x0374), top: B:128:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026e A[Catch: Exception -> 0x0380, IOException -> 0x03bb, TryCatch #2 {IOException -> 0x03bb, Exception -> 0x0380, blocks: (B:71:0x023c, B:76:0x024f, B:78:0x0253, B:99:0x0345, B:81:0x026e, B:85:0x02a4, B:88:0x02ab, B:90:0x02d9, B:103:0x0356, B:94:0x02f5, B:107:0x0363, B:112:0x0377, B:75:0x024c, B:84:0x02a1, B:98:0x0342, B:102:0x0353, B:106:0x0360, B:111:0x0374), top: B:128:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d9 A[Catch: Exception -> 0x0380, IOException -> 0x03bb, TryCatch #2 {IOException -> 0x03bb, Exception -> 0x0380, blocks: (B:71:0x023c, B:76:0x024f, B:78:0x0253, B:99:0x0345, B:81:0x026e, B:85:0x02a4, B:88:0x02ab, B:90:0x02d9, B:103:0x0356, B:94:0x02f5, B:107:0x0363, B:112:0x0377, B:75:0x024c, B:84:0x02a1, B:98:0x0342, B:102:0x0353, B:106:0x0360, B:111:0x0374), top: B:128:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f5 A[Catch: Exception -> 0x0380, IOException -> 0x03bb, TryCatch #2 {IOException -> 0x03bb, Exception -> 0x0380, blocks: (B:71:0x023c, B:76:0x024f, B:78:0x0253, B:99:0x0345, B:81:0x026e, B:85:0x02a4, B:88:0x02ab, B:90:0x02d9, B:103:0x0356, B:94:0x02f5, B:107:0x0363, B:112:0x0377, B:75:0x024c, B:84:0x02a1, B:98:0x0342, B:102:0x0353, B:106:0x0360, B:111:0x0374), top: B:128:0x002d }] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult, com.ss.android.ugc.aweme.aigc.asynctask.Source, com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v3, types: [X.05Vn, X.099V, java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r49v0, types: [X.0LKQ, X.0LQl, X.0LTN] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.String] */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C09JG r50, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.VideoUploadTosTaskOutput> r51) {
        /*
            Method dump skipped, instruction units count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LKQ.LJFF(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.VideoUploadTaskInput r38, X.InterfaceC1364105Vn<? super kotlin.Unit> r39) {
        /*
            r37 = this;
            r3 = r39
            boolean r0 = r3 instanceof X.C0LKS
            r5 = r37
            if (r0 == 0) goto L7f
            r4 = r3
            X.0LKS r4 = (X.C0LKS) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7f
            int r2 = r2 - r1
            r4.LLILLL = r2
        L16:
            java.lang.Object r6 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L73
            if (r0 != r2) goto L85
            X.C155000ia.LIZIZ(r6)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r6)
            X.0LSZ r6 = r5.LIZLLL
            r7 = 0
            java.lang.String r11 = "STARTED"
            r14 = 0
            r0 = r38
            com.ss.android.ugc.aweme.aigc.asynctask.Source r0 = r0.source
            r26 = 0
            r36 = 268431343(0xfffefef, float:2.523736E-29)
            r8 = r7
            r9 = r7
            r10 = r7
            r12 = r7
            r13 = r7
            r15 = r7
            r16 = r7
            r17 = r7
            r18 = r14
            r19 = r0
            r20 = r7
            r21 = r7
            r22 = r14
            r23 = r7
            r24 = r7
            r25 = r7
            r28 = r7
            r29 = r26
            r31 = r7
            r32 = r7
            r33 = r7
            r34 = r14
            r35 = r7
            X.0LSZ r0 = X.C0LSZ.LIZ(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r31, r32, r33, r34, r35, r36)
            r4.LLILLL = r1
            java.lang.Object r0 = X.C0LTN.LJJJI(r5, r0, r4)
            if (r0 != r3) goto L76
            return r3
        L73:
            X.C155000ia.LIZIZ(r6)
        L76:
            r4.LLILLL = r2
            java.lang.Object r0 = X.C0LTN.LJJIJL(r5, r4)
            if (r0 != r3) goto L29
            return r3
        L7f:
            X.0LKS r4 = new X.0LKS
            r4.<init>(r5, r3)
            goto L16
        L85:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LKQ.LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.VideoUploadTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJLI(java.lang.String r8, com.ss.android.ugc.aweme.publish.model.AutoCutAgentAuthConfig r9, X.InterfaceC1364105Vn<? super X.C0LKV> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C0LKT
            if (r0 == 0) goto L68
            r6 = r10
            X.0LKT r6 = (X.C0LKT) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r2 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L33
            if (r0 != r3) goto L6e
            X.C155000ia.LIZIZ(r2)
        L23:
            if (r2 != 0) goto L32
            X.0LKV r2 = new X.0LKV
            r0 = 7018(0x1b6a, double:3.4674E-320)
            java.lang.Long r1 = X.C2286608xc.LJFF(r0)
            java.lang.String r0 = "upload timeout"
            r2.<init>(r4, r1, r0)
        L32:
            return r2
        L33:
            X.C155000ia.LIZIZ(r2)
            boolean r0 = X.C2354709Kn.LIZIZ(r8)
            if (r0 != 0) goto L58
            X.0LKV r3 = new X.0LKV
            r0 = 7015(0x1b67, double:3.466E-320)
            java.lang.Long r2 = X.C2286608xc.LJFF(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "upload video path is invalid: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r3.<init>(r4, r2, r0)
            return r3
        L58:
            long r1 = r7.LJIIJJI
            X.0LLg r0 = new X.0LLg
            r0.<init>(r8, r9, r7, r4)
            r6.LLILLL = r3
            java.lang.Object r2 = X.C099A.LIZJ(r1, r0, r6)
            if (r2 != r5) goto L23
            return r5
        L68:
            X.0LKT r6 = new X.0LKT
            r6.<init>(r7, r10)
            goto L12
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LKQ.LJJJJLI(java.lang.String, com.ss.android.ugc.aweme.publish.model.AutoCutAgentAuthConfig, X.05Vn):java.lang.Object");
    }
}
