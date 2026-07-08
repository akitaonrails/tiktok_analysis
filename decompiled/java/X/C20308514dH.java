package X;

/* JADX INFO: renamed from: X.14dH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20308514dH implements InterfaceC2385309Wh {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            default:
                return null;
        }
    }

    public static final Object then$0(C20308514dH c20308514dH, C15O7 c15o7) {
        C14E5 c14e5 = (C14E5) c20308514dH.l1;
        String str = c20308514dH.s0;
        C1C7U.LIZ("LocalVideoPlayerManager@f6a7.tryUseLocalVideo$2L");
        if (c15o7.LJIILL()) {
            c14e5.onFailed();
        } else {
            c14e5.onSuccess(str);
        }
        C1C7U.LIZIZ("LocalVideoPlayerManager@f6a7.tryUseLocalVideo$2L");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$1(X.C20308514dH r11, X.C15O7 r12) {
        /*
            java.lang.String r10 = "I18nVideoUploadFeature@80ea.uploadVideo$1"
            X.C1C7U.LIZ(r10)
            java.lang.String r7 = "uploadFailed"
            r6 = 0
            if (r12 == 0) goto Lab
            boolean r0 = r12.LJIILL()
            if (r0 != 0) goto L83
            java.lang.Object r0 = r12.LJIIL()
            com.ss.android.ugc.aweme.base.api.BaseResponse r0 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r0
            int r0 = r0.status_code
            if (r0 != 0) goto L83
            java.lang.Object r0 = r12.LJIIL()
            com.ss.android.ugc.aweme.fe.method.upload.config.I18nUploadAuthConfig r0 = (com.ss.android.ugc.aweme.fe.method.upload.config.I18nUploadAuthConfig) r0
            com.ss.android.ugc.aweme.fe.method.upload.config.UploadConfig r9 = r0.getUploadConfig()
            if (r9 == 0) goto L3a
            java.lang.Object r5 = r11.l1
            X.14W0 r5 = (X.C14W0) r5
            java.lang.String r8 = r11.s0
            com.ss.android.ugc.aweme.fe.method.upload.config.UploadConfig r1 = r5.LLJ
            if (r1 == 0) goto L3f
            java.lang.String r0 = r9.getVideoHostName()
            r1.setVideoHostName(r0)
            r5.LJI(r8)
        L3a:
            X.C1C7U.LIZIZ(r10)
            r0 = 0
            return r0
        L3f:
            java.lang.ref.WeakReference<android.app.Activity> r0 = r5.LLILZLL
            java.lang.Object r1 = r0.get()
            android.content.Context r1 = (android.content.Context) r1
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r8)
            long r3 = X.C2400409as.LJII(r1, r0)
            int r0 = r9.getMaxFileSize()
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L72
            X.0iBy r1 = new X.0iBy
            java.lang.ref.WeakReference<android.app.Activity> r0 = r5.LLILZLL
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            r1.<init>(r0)
            r0 = 2131858156(0x7f1192ec, float:1.9350092E38)
            r1.LIZIZ(r0)
            r1.LIZLLL()
            r5.LIZLLL(r6, r7)
            goto L3a
        L72:
            r5.LJII(r8, r3, r9)
            X.14Vz r1 = r5.LLIZ
            java.lang.ref.WeakReference<android.app.Activity> r0 = r5.LLILZLL
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            r1.LIZJ(r0, r5)
            goto L3a
        L83:
            boolean r0 = r12.LJIILL()
            if (r0 != 0) goto Lab
            java.lang.Object r0 = r12.LJIIL()
            com.ss.android.ugc.aweme.base.api.BaseResponse r0 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r0
            int r0 = r0.status_code
            if (r0 == 0) goto Lb2
            java.lang.Object r2 = r11.l1
            X.14W0 r2 = (X.C14W0) r2
            java.lang.Object r0 = r12.LJIIL()
            com.ss.android.ugc.aweme.base.api.BaseResponse r0 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r0
            int r1 = r0.status_code
            java.lang.Object r0 = r12.LJIIL()
            com.ss.android.ugc.aweme.base.api.BaseResponse r0 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r0
            java.lang.String r0 = r0.message
            r2.LIZLLL(r1, r0)
            goto Lb2
        Lab:
            java.lang.Object r0 = r11.l1
            X.14W0 r0 = (X.C14W0) r0
            r0.LIZLLL(r6, r7)
        Lb2:
            java.lang.Object r0 = r11.l1     // Catch: java.lang.Exception -> Lbf
            X.14W0 r0 = (X.C14W0) r0     // Catch: java.lang.Exception -> Lbf
            com.ss.bduploader.BDVideoUploader r0 = r0.LIZJ()     // Catch: java.lang.Exception -> Lbf
            r0.close()     // Catch: java.lang.Exception -> Lbf
            goto L3a
        Lbf:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20308514dH.then$1(X.14dH, X.15O7):java.lang.Object");
    }

    public C20308514dH(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
