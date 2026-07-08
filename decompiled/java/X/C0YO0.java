package X;

/* JADX INFO: renamed from: X.0YO0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YO0 {
    public final C0YH7 LIZ;
    public final C0YHF LIZIZ;
    public final int LIZJ = C0YMR.GET_MEDIA_UPLOAD_CONFIG.getValue();
    public final C868780Y6i LIZLLL;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.util.List<com.bytedance.im.core.proto.MediaUploadConfig>>> r16) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YO0.LIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.util.List<com.bytedance.im.core.proto.MediaUploadConfig>>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C0YO2
            if (r0 == 0) goto L85
            r4 = r8
            X.0YO2 r4 = (X.C0YO2) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L85
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L79
            if (r1 != r0) goto L8c
            X.C155000ia.LIZIZ(r3)
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r4 = r3.m10unboximpl()
        L28:
            X.13BV r1 = X.C13BV.INSTANCE
            boolean r0 = X.C189200o6.m7isFailureimpl(r4)
            if (r0 != 0) goto L31
            r1 = r4
        L31:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r6 = r1.iterator()
        L37:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r5 = r6.next()
            com.bytedance.im.core.proto.MediaUploadConfig r5 = (com.bytedance.im.core.proto.MediaUploadConfig) r5
            X.0Y6i r3 = r7.LIZLLL
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "cache config "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            r1 = 4
            java.lang.String r0 = "GetMediaUploadConfigUseCase"
            X.C868780Y6i.LJIILJJIL(r3, r0, r2, r1)
            X.0YHF r1 = r7.LIZIZ
            X.0YDu r0 = r5.type
            int r0 = r0.getValue()
            java.lang.String r2 = r1.LIZIZ(r0)
            X.01GW r0 = r1.LIZIZ
            java.lang.Object r1 = r0.getValue()
            X.0YEV r1 = (X.C0YEV) r1
            com.google.gson.Gson r0 = X.C09EF.LIZ
            java.lang.String r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r0, r5)
            r1.putString(r2, r0)
            goto L37
        L79:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            java.lang.Object r4 = r7.LIZ(r4)
            if (r4 != r2) goto L28
            return r2
        L85:
            X.0YO2 r4 = new X.0YO2
            r4.<init>(r7, r8)
            goto L12
        L8b:
            return r4
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YO0.LIZIZ(X.05Vn):java.lang.Object");
    }

    public C0YO0(C0YH7 c0yh7, C0YHF c0yhf) {
        this.LIZ = c0yh7;
        this.LIZIZ = c0yhf;
        this.LIZLLL = c0yh7.LIZLLL();
    }
}
