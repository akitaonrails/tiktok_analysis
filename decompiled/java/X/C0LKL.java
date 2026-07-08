package X;

import com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput;

/* JADX INFO: renamed from: X.0LKL, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LKL extends C0LTN<C09JG, FrameUploadTaskOutput> {
    public final String LJIIIIZZ = "AutoPickFrameUploadTask";
    public final String LJIIIZ = C0LMI.UPLOAD.getType();
    public final C054G LJIIJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public String LJIIJJI;
    public String LJIIL;
    public int LJIILIIL;
    public volatile boolean LJIILJJIL;

    @Override // X.C0LTN
    public final String LJIL() {
        return this.LJIIIZ;
    }

    @Override // X.C0LTN
    public final String LJJ() {
        return this.LJIIIIZZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJLI(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.publish.model.UploadImageConfig> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C0LKO
            if (r0 == 0) goto L21
            r6 = r9
            X.0LKO r6 = (X.C0LKO) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L2f
            if (r0 != r5) goto L27
            goto L7d
        L21:
            X.0LKO r6 = new X.0LKO
            r6.<init>(r8, r9)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = X.C297690Blf.LIZ()
            if (r0 == 0) goto L47
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0o1f r0 = r0.getAccountService()
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L47
            return r4
        L47:
            X.1Ds4 r0 = X.C0CHQ.LIZ()     // Catch: java.lang.Exception -> L85
            X.0niP r2 = r0.getNetworkService()     // Catch: java.lang.Exception -> L85
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Exception -> L85
            java.lang.Class<com.ss.android.ugc.aweme.tools.AVApi> r0 = com.ss.android.ugc.aweme.tools.AVApi.class
            java.lang.Object r0 = r1.getService(r0)     // Catch: java.lang.Exception -> L85
            com.ss.android.ugc.aweme.tools.AVApi r0 = (com.ss.android.ugc.aweme.tools.AVApi) r0     // Catch: java.lang.Exception -> L85
            java.lang.String r1 = r0.LIZ()     // Catch: java.lang.Exception -> L85
            java.lang.Class<com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService> r0 = com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService.class
            java.lang.Object r3 = r2.createRetrofit(r1, r5, r0)     // Catch: java.lang.Exception -> L85
            com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService r3 = (com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService) r3     // Catch: java.lang.Exception -> L85
            java.lang.String r2 = "purpose"
            java.lang.String r1 = "aigc_avatar"
            kotlin.Pair r0 = new kotlin.Pair     // Catch: java.lang.Exception -> L85
            r0.<init>(r2, r1)     // Catch: java.lang.Exception -> L85
            java.util.Map r0 = X.C2097908Jt.LIZJ(r0)     // Catch: java.lang.Exception -> L85
            r6.LLILLL = r5     // Catch: java.lang.Exception -> L85
            java.lang.Object r1 = r3.LIZ(r0, r6)     // Catch: java.lang.Exception -> L85
            if (r1 != r7) goto L80
            return r7
        L7d:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L85
        L80:
            com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig r1 = (com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig) r1     // Catch: java.lang.Exception -> L85
            com.ss.android.ugc.aweme.publish.model.UploadImageConfig r4 = r1.frameUploadConfig     // Catch: java.lang.Exception -> L85
            return r4
        L85:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getUploadAuthKey error: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "AutoPickFrameUpload"
            X.C201955140j.LJFF(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LKL.LJJJJLI(X.05Vn):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x0019
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LJJJJLL(android.graphics.Bitmap r4, X.C0VSJ r5) throws java.lang.Throwable {
        /*
            X.0VSV r3 = new X.0VSV     // Catch: java.lang.Exception -> L21
            r3.<init>(r5)     // Catch: java.lang.Exception -> L21
            r2 = 0
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L11
            r0 = 85
            r4.compress(r1, r0, r3)     // Catch: java.lang.Throwable -> L11
            X.C2107108Nh.LIZ(r3, r2)     // Catch: java.lang.Exception -> L21
            return
        L11:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L19
            throw r1     // Catch: java.lang.Throwable -> L16
        L16:
            r0 = move-exception
            r2 = r1
            goto L1a
        L19:
            r0 = move-exception
        L1a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L19
            X.C2107108Nh.LIZ(r3, r2)     // Catch: java.lang.Exception -> L21
            throw r0     // Catch: java.lang.Exception -> L21
        L21:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "saveBitmapToFile error: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "AutoPickFrameUpload"
            X.C201955140j.LJFF(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LKL.LJJJJLL(android.graphics.Bitmap, X.0VSJ):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x032d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0349 A[Catch: all -> 0x05c8, Exception -> 0x05cb, TryCatch #6 {Exception -> 0x05cb, all -> 0x05c8, blocks: (B:138:0x0445, B:140:0x044a, B:148:0x04ab, B:150:0x04b3, B:155:0x04be, B:163:0x053c, B:110:0x032e, B:112:0x033e, B:117:0x0349, B:125:0x03a9, B:127:0x03c0, B:135:0x0420), top: B:195:0x032e }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03a9 A[Catch: all -> 0x05c8, Exception -> 0x05cb, TRY_ENTER, TryCatch #6 {Exception -> 0x05cb, all -> 0x05c8, blocks: (B:138:0x0445, B:140:0x044a, B:148:0x04ab, B:150:0x04b3, B:155:0x04be, B:163:0x053c, B:110:0x032e, B:112:0x033e, B:117:0x0349, B:125:0x03a9, B:127:0x03c0, B:135:0x0420), top: B:195:0x032e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01de  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:90:0x0290
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C09JG r46, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskOutput> r47) {
        /*
            Method dump skipped, instruction units count: 1682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LKL.LJFF(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskInput r39, X.InterfaceC1364105Vn<? super kotlin.Unit> r40) {
        /*
            r38 = this;
            r3 = r40
            boolean r0 = r3 instanceof X.C0LKK
            r6 = r38
            if (r0 == 0) goto L82
            r5 = r3
            X.0LKK r5 = (X.C0LKK) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r5.LLILLL = r2
        L16:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 == r2) goto L76
            if (r0 != r3) goto L88
            X.C155000ia.LIZIZ(r1)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r1)
            X.0LSZ r7 = r6.LIZLLL
            r0 = r39
            com.ss.android.ugc.aweme.aigc.asynctask.Source r1 = r0.source
            java.lang.String r0 = r0.creationId
            r8 = 0
            java.lang.String r12 = "STARTED"
            r15 = 0
            r27 = 0
            r37 = 268430319(0xfffebef, float:2.523582E-29)
            r9 = r8
            r10 = r8
            r11 = r8
            r13 = r8
            r14 = r8
            r16 = r8
            r17 = r8
            r18 = r0
            r19 = r15
            r20 = r1
            r21 = r8
            r22 = r8
            r23 = r15
            r24 = r8
            r25 = r8
            r26 = r8
            r29 = r8
            r30 = r27
            r32 = r8
            r33 = r8
            r34 = r8
            r35 = r15
            r36 = r8
            X.0LSZ r0 = X.C0LSZ.LIZ(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r32, r33, r34, r35, r36, r37)
            r5.LLILLL = r2
            java.lang.Object r0 = X.C0LTN.LJJJI(r6, r0, r5)
            if (r0 != r4) goto L79
            return r4
        L76:
            X.C155000ia.LIZIZ(r1)
        L79:
            r5.LLILLL = r3
            java.lang.Object r0 = X.C0LTN.LJJIJL(r6, r5)
            if (r0 != r4) goto L29
            return r4
        L82:
            X.0LKK r5 = new X.0LKK
            r5.<init>(r6, r3)
            goto L16
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LKL.LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.FrameUploadTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJL(java.util.List<com.ss.android.ugc.aweme.aigc.asynctask.CompositionMediaItem> r13, X.InterfaceC1364105Vn<? super java.lang.String> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LKL.LJJJJL(java.util.List, X.05Vn):java.lang.Object");
    }
}
