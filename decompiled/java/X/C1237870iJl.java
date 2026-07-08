package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.loginplatform.LoginMethodConfig;

/* JADX INFO: renamed from: X.0iJl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237870iJl {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Boolean LJ;
    public final LoginMethodConfig LJFF;

    public final boolean LIZIZ() {
        return !TextUtils.isEmpty(this.LIZLLL);
    }

    public final void LIZ(String str, String str2) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", this.LIZIZ);
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZLLL("platform", this.LIZ);
        c0xgr.LIZLLL("click_status", str);
        C20684815ws.LJIILLIIL("3p_no_support_popup_click", c0xgr.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1237870iJl(java.lang.String r8, boolean r9, java.lang.String r10, java.lang.String r11) {
        /*
            r7 = this;
            r7.<init>()
            r7.LIZ = r8
            r7.LIZIZ = r10
            r7.LIZJ = r11
            X.10hH r0 = X.C19314110hH.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.loginplatform.LoginPlatformConfig r0 = X.C19314110hH.LIZ()
            if (r9 == 0) goto L67
            com.ss.android.ugc.aweme.loginplatform.LoginSignupConfig r1 = r0.signupConfig
        L16:
            r6 = 0
            if (r1 == 0) goto L65
            X.0iLy r0 = X.EnumC1239210iLv.Companion
            r0.getClass()
            X.0iLv r5 = X.C1239240iLy.LIZ(r8)
            if (r5 == 0) goto L65
            java.util.List<com.ss.android.ugc.aweme.loginplatform.LoginMethodConfig> r0 = r1.platformConfigs
            if (r0 == 0) goto L65
            java.util.Iterator r4 = r0.iterator()
        L2c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.ss.android.ugc.aweme.loginplatform.LoginMethodConfig r2 = (com.ss.android.ugc.aweme.loginplatform.LoginMethodConfig) r2
            java.lang.String r0 = r2.platform
            if (r0 == 0) goto L2c
            int r0 = r0.length()
            if (r0 == 0) goto L2c
            X.0iLy r1 = X.EnumC1239210iLv.Companion
            java.lang.String r0 = r2.platform
            r1.getClass()
            X.0iLv r0 = X.C1239240iLy.LIZ(r0)
            if (r5 != r0) goto L2c
        L50:
            com.ss.android.ugc.aweme.loginplatform.LoginMethodConfig r3 = (com.ss.android.ugc.aweme.loginplatform.LoginMethodConfig) r3
        L52:
            r7.LJFF = r3
            if (r3 == 0) goto L61
            java.lang.String r0 = r3.fallbackUrl
        L58:
            r7.LIZLLL = r0
            if (r3 == 0) goto L5e
            java.lang.Boolean r6 = r3.needConfirm
        L5e:
            r7.LJ = r6
            return
        L61:
            r0 = r6
            goto L58
        L63:
            r3 = r6
            goto L50
        L65:
            r3 = r6
            goto L52
        L67:
            com.ss.android.ugc.aweme.loginplatform.LoginSignupConfig r1 = r0.loginConfig
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1237870iJl.<init>(java.lang.String, boolean, java.lang.String, java.lang.String):void");
    }
}
