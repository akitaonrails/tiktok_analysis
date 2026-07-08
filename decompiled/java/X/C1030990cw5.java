package X;

import com.bytedance.ies.ugc.aweme.commercialize.splash.show.NormalSplashAdActivity;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0cw5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1030990cw5 implements InterfaceC2213131Bjb {
    public NormalSplashAdActivity LIZ;

    @Override // X.InterfaceC2213131Bjb
    public final void LIZJ() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        X.C1028420crw.LIZ(r6, r7, java.lang.Long.valueOf(r1), r10, r0);
     */
    @Override // X.InterfaceC2213131Bjb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C1031000cw6 r15) {
        /*
            r14 = this;
            com.bytedance.ies.ugc.aweme.commercialize.splash.show.NormalSplashAdActivity r6 = r14.LIZ
            if (r6 != 0) goto L5
            return
        L5:
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "click"
            X.C583480MuY.LIZIZ(r1, r0)
            java.lang.String r0 = "openSplashScheme: from = SplashAdActivity"
            X.C2344809Gs.LJ(r0)
            com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate r1 = com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate.INSTANCE
            java.lang.String r0 = "Click to open the screen and hang up"
            r1.ordinarySplashLog(r0)
            X.08Ql r0 = new X.08Ql
            r0.<init>()
            java.util.List<X.0cw7> r2 = r15.LIZLLL
            boolean r1 = X.C086I.LIZIZ(r2)
            if (r1 != 0) goto L8f
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r5 = r2.iterator()
        L2d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L8f
            java.lang.Object r1 = r5.next()
            X.0cw7 r1 = (X.C1031010cw7) r1
            if (r1 == 0) goto L2d
            java.lang.String r7 = r1.LIZ
            int r4 = r1.LIZIZ
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L2d
            long r1 = r15.LIZ
            java.lang.String r10 = r15.LIZIZ
            r3 = 1
            if (r4 == r3) goto Lbe
            r3 = 2
            if (r4 == r3) goto L9b
            boolean r3 = X.C2093608Ic.LJ(r7)
            if (r3 != 0) goto L93
            java.lang.String r4 = r7.toLowerCase()
            java.lang.String r3 = "http://"
            boolean r3 = r4.startsWith(r3)
            if (r3 != 0) goto L6d
            java.lang.String r4 = r7.toLowerCase()
            java.lang.String r3 = "https://"
            boolean r3 = r4.startsWith(r3)
            if (r3 == 0) goto L93
        L6d:
            java.lang.String r8 = r15.LIZJ
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            com.ss.android.ugc.aweme.utils.GsonProvider r1 = X.C7740030o.LIZ()
            com.google.gson.Gson r3 = r1.getGson()
            java.lang.String r2 = r15.LJFF
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig> r1 = com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig.class
            java.lang.Object r11 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r3, r2, r1)
            com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig r11 = (com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig) r11
            java.lang.String r12 = r15.LJI
            java.lang.String r13 = r15.LJII
            boolean r1 = X.C1028420crw.LIZIZ(r6, r7, r8, r9, r10, r11, r12, r13)
            if (r1 == 0) goto L2d
        L8f:
            r6.finish()
            return
        L93:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            X.C1028420crw.LIZ(r6, r7, r1, r10, r0)
            goto L8f
        L9b:
            java.lang.String r8 = r15.LIZJ
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            com.ss.android.ugc.aweme.utils.GsonProvider r1 = X.C7740030o.LIZ()
            com.google.gson.Gson r3 = r1.getGson()
            java.lang.String r2 = r15.LJFF
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig> r1 = com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig.class
            java.lang.Object r11 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r3, r2, r1)
            com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig r11 = (com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig) r11
            java.lang.String r12 = r15.LJI
            java.lang.String r13 = r15.LJII
            boolean r1 = X.C1028420crw.LIZIZ(r6, r7, r8, r9, r10, r11, r12, r13)
            if (r1 == 0) goto L2d
            goto L8f
        Lbe:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            X.C1028420crw.LIZ(r6, r7, r1, r10, r0)
            goto L8f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1030990cw5.LIZIZ(X.0cw6):void");
    }

    @Override // X.InterfaceC2213131Bjb
    public final void LIZLLL(C2213201Bji c2213201Bji) {
        C1440005kM.LIZ(new C2040907z5());
        NormalSplashAdActivity normalSplashAdActivity = this.LIZ;
        if (normalSplashAdActivity == null) {
            return;
        }
        NormalSplashAdActivity.LLILLL = c2213201Bji.LIZ;
        normalSplashAdActivity.finish();
        int i = NormalSplashAdActivity.LLILLL;
        if (i != 1 && i != 4) {
            if (i == 3) {
                C583480MuY.LIZIZ(System.currentTimeMillis(), "click");
                return;
            } else {
                C583480MuY.LIZIZ(System.currentTimeMillis(), "finish");
                return;
            }
        }
        C583480MuY.LIZIZ(System.currentTimeMillis(), "skip");
    }

    @Override // X.InterfaceC2213131Bjb
    public final void LIZ(long j, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis() - C1031100cwG.LIZ().LJIL();
        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("splash_ad", "first_view", String.valueOf(j), str, CardStruct.IStatusCode.DEFAULT);
        c1022820ciuLJ.LIZIZ(Long.valueOf(jCurrentTimeMillis), "launchduration");
        c1022820ciuLJ.LJII();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        C583480MuY.LIZ = jCurrentTimeMillis;
        C583480MuY.LJ = 2;
        C583480MuY.LIZIZ = jCurrentTimeMillis2;
    }
}
