package X;

import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0ddS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057880ddS {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        String str2;
        try {
            if (C0FEA.LIZ()) {
                Application applicationLIZ = C1BWL.LIZ();
                if (applicationLIZ != null) {
                    Object[] objArr = new Object[1];
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    objArr[0] = str2;
                    str = applicationLIZ.getString(2131834565, objArr);
                    if (str == null) {
                        return "";
                    }
                }
                return "";
            }
            if (str == null) {
                return "";
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (str == null) {
                return "";
            }
        }
        return str;
    }

    public static boolean LIZJ(Aweme aweme) {
        if (aweme != null) {
            if ((!aweme.isCanPlay() || AwemeExtKt.isDelete(aweme)) && !C0OAD.LIZIZ(aweme)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r4, com.ss.android.ugc.aweme.profile.model.User r5, com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            r3 = 1
            boolean r0 = X.C1019620cdk.LIZ(r6, r3)
            r1 = 0
            if (r0 == 0) goto L97
            r0 = 3
            boolean r0 = X.C1019620cdk.LIZIZ(r0, r6)
            if (r0 == 0) goto L97
            if (r6 == 0) goto L97
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r6.getAwemeRawAd()
            if (r0 == 0) goto L97
            com.ss.android.ugc.aweme.commercialize.model.OmVast r0 = r0.getOmVast()
            if (r0 == 0) goto L97
            X.0dJ7 r0 = r0.vast
            if (r0 == 0) goto L97
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r6.getAwemeRawAd()
            if (r0 == 0) goto L95
            com.ss.android.ugc.aweme.commercialize.model.OmVast r0 = r0.getOmVast()
            if (r0 == 0) goto L95
            X.0dJ7 r0 = r0.vast
            if (r0 == 0) goto L95
            java.lang.String r0 = r0.adTitle
        L33:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L97
            r2 = 1
        L3a:
            boolean r0 = LIZJ(r6)
            if (r5 != 0) goto L46
            if (r6 == 0) goto L93
            com.ss.android.ugc.aweme.profile.model.User r5 = r6.getAuthor()
        L46:
            java.lang.String r1 = ""
            if (r2 == 0) goto L66
            if (r6 == 0) goto L61
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r6.getAwemeRawAd()
            if (r0 == 0) goto L61
            com.ss.android.ugc.aweme.commercialize.model.OmVast r0 = r0.getOmVast()
            if (r0 == 0) goto L61
            X.0dJ7 r0 = r0.vast
            if (r0 == 0) goto L61
            java.lang.String r0 = r0.adTitle
            if (r0 == 0) goto L61
            r1 = r0
        L61:
            java.lang.String r1 = LIZ(r1)
        L65:
            return r1
        L66:
            if (r5 == 0) goto L65
            if (r0 == 0) goto L65
            boolean r0 = r5.isAdFake()
            if (r0 == 0) goto L89
            if (r4 == 0) goto L89
            int r0 = r4.length()
            if (r0 == 0) goto L89
            if (r6 == 0) goto L89
            boolean r0 = r6.isAd()
            if (r0 != 0) goto L89
            java.lang.String r0 = r5.getNickname()
        L84:
            java.lang.String r1 = LIZ(r0)
            return r1
        L89:
            X.0iSQ r0 = X.C1243240iSQ.LIZ
            r0.getClass()
            java.lang.String r0 = X.C1243240iSQ.LIZ(r5, r3)
            goto L84
        L93:
            r5 = r1
            goto L46
        L95:
            r0 = r1
            goto L33
        L97:
            r2 = 0
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1057880ddS.LIZIZ(java.lang.String, com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }
}
