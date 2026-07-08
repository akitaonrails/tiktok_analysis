package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0chg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022060chg {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(X.C1022820ciu r5, java.lang.String r6) {
        /*
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r1 = X.C844470XAv.LIZ()
            boolean r0 = X.C2093608Ic.LJ(r6)
            r4 = 0
            r3 = 1
            if (r0 != 0) goto L44
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            android.content.pm.PackageInfo r0 = X.C786410Ut5.Y3(r1, r6, r0)     // Catch: java.lang.Exception -> L1e android.content.pm.PackageManager.NameNotFoundException -> L40
            if (r0 == 0) goto L44
            goto L46
        L1e:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isInstalledApp(context, "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ") exception"
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "AdProbeUtil"
            X.C1720106oR.LIZIZ(r0, r1, r2)
            r2 = -1
            goto L47
        L40:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L44:
            r2 = 0
            goto L47
        L46:
            r2 = 1
        L47:
            if (r5 == 0) goto L52
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = "sys_check_status"
            r5.LIZIZ(r1, r0)
        L52:
            if (r2 != r3) goto L55
            r4 = 1
        L55:
            if (r5 == 0) goto L60
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "is_installed"
            r5.LIZIZ(r1, r0)
        L60:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1022060chg.LIZ(X.0ciu, java.lang.String):boolean");
    }

    public static final void LIZIZ(C1022820ciu c1022820ciu, AwemeRawAd awemeRawAd) {
        boolean z;
        if (awemeRawAd != null) {
            z = true;
        } else {
            z = false;
        }
        c1022820ciu.LIZIZ(Boolean.valueOf(z), "has_raw_ad_data");
        if (awemeRawAd == null) {
            return;
        }
        c1022820ciu.LIZIZ(awemeRawAd.getType(), "pack_content_type");
        c1022820ciu.LIZIZ(Integer.valueOf(awemeRawAd.isHideIfExists() ? 1 : 0), "hide_if_exist");
        String packageName = awemeRawAd.getPackageName();
        c1022820ciu.LIZIZ(packageName, "package_name");
        if (packageName != null && packageName.length() != 0) {
            LIZ(c1022820ciu, packageName);
        }
    }
}
