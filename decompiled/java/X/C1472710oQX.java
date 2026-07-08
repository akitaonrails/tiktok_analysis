package X;

/* JADX INFO: renamed from: X.0oQX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1472710oQX implements InterfaceC1467970oIt {
    public final /* synthetic */ C1472700oQW LIZ;

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ() {
        /*
            r6 = this;
            X.0oQW r0 = r6.LIZ
            java.lang.String r0 = r0.LLILLL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L88
            X.0oQW r0 = r6.LIZ
            java.lang.String r0 = r0.LLILLL
            X.0NKA r5 = X.C1475150oUT.LIZJ(r0)
            if (r5 == 0) goto L88
            X.0oQW r4 = r6.LIZ
            r4.getClass()
            java.lang.String r0 = r5.getCacheDir()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L88
            java.lang.String r0 = r4.LLILZ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L4d
            java.lang.String r0 = r4.LLILZ
        L2d:
            X.0VSJ r2 = new X.0VSJ
            java.lang.String r1 = r5.getCacheDir()
            r2.<init>(r0, r1)
            boolean r0 = r2.isDirectory()
            if (r0 != 0) goto L3f
            r2.delete()
        L3f:
            boolean r0 = r2.exists()
            if (r0 != 0) goto L48
            r2.mkdirs()
        L48:
            java.lang.String r0 = r2.getAbsolutePath()
            return r0
        L4d:
            android.app.Application r3 = X.C1475000oUE.LIZ
            if (r3 == 0) goto L86
            java.io.File r2 = X.C786410Ut5.w2(r3)
            boolean r0 = X.C1474810oTv.LLI()
            if (r0 == 0) goto L7d
            com.ss.android.ugc.playerkit.simapicommon.IAppConfig r0 = X.C1475000oUE.LIZIZ()
            boolean r0 = r0.isDebug()
            if (r0 == 0) goto L69
            java.io.File r2 = X.C2354809Ko.LIZLLL(r3)
        L69:
            com.ss.android.ugc.playerkit.simapicommon.IAppConfig r0 = X.C1475000oUE.LIZIZ()
            java.lang.String r1 = r0.getChannel()
            java.lang.String r0 = "playback_simulator_test"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L7d
            java.io.File r2 = X.C2354809Ko.LIZLLL(r3)
        L7d:
            if (r2 == 0) goto L86
            java.lang.String r0 = r2.getAbsolutePath()
            r4.LLILZ = r0
            goto L2d
        L86:
            r0 = 0
            goto L2d
        L88:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1472710oQX.LIZ():java.lang.String");
    }

    public C1472710oQX(C1472700oQW c1472700oQW) {
        this.LIZ = c1472700oQW;
    }
}
