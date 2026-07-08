package X;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0cqd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1027610cqd {
    public static final C1027610cqd LIZ = new C1027610cqd();

    public static final String LIZJ(C1051660dTQ c1051660dTQ) {
        C1027660cqi c1027660cqi;
        BaseBundle baseBundle;
        String string;
        Long lValueOf = null;
        if (c1051660dTQ != null) {
            InterfaceC1028200cra interfaceC1028200cra = (InterfaceC1028200cra) c1051660dTQ.LIZIZ(InterfaceC1028200cra.class);
            if (interfaceC1028200cra != null) {
                c1027660cqi = (C1027660cqi) interfaceC1028200cra.LIZIZ(C1027660cqi.class);
            } else {
                c1027660cqi = null;
            }
            if (c1051660dTQ != null) {
                baseBundle = (BaseBundle) c1051660dTQ.LIZIZ(Bundle.class);
            } else {
                baseBundle = null;
            }
            if (c1027660cqi == null || (string = Long.valueOf(c1027660cqi.LIZJ()).toString()) == null) {
                if (baseBundle != null) {
                    lValueOf = Long.valueOf(baseBundle.getLong("ad_id"));
                }
            } else {
                return string;
            }
        }
        return String.valueOf(lValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            X.0cqd r0 = X.C1027610cqd.LIZ
            r0.getClass()
            X.07dM r1 = X.C1906207dM.LIZ
            r4 = 0
            if (r5 == 0) goto L2a
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 == 0) goto L2a
            int r0 = r0.getRit()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r0.toString()
        L1c:
            r1.getClass()
            java.lang.String r3 = "001"
            boolean r0 = X.C1906207dM.LIZ(r0, r3)
            if (r0 != 0) goto L60
            if (r5 == 0) goto L59
            goto L2c
        L2a:
            r0 = r4
            goto L1c
        L2c:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L59
            java.lang.String r0 = r0.getLogExtra()     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L59
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L63
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = "rit"
            java.lang.String r2 = r2.optString(r1)     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L5a
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = "isLogExtraRitInFYP() current rit = "
            r1.append(r0)     // Catch: java.lang.Throwable -> L63
            r1.append(r2)     // Catch: java.lang.Throwable -> L63
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L63
            boolean r0 = X.C1906207dM.LIZ(r2, r3)     // Catch: java.lang.Throwable -> L63
            goto L5e
        L59:
            r0 = r4
        L5a:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L63
            goto L6f
        L5e:
            if (r0 == 0) goto L88
        L60:
            java.lang.String r0 = "homepage_hot"
            return r0
        L63:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L6f:
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r2 == 0) goto L88
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isLogExtraRitInFYP() onFailure() cause = "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
        L88:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1027610cqd.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    public static String LIZIZ(String str, String str2) {
        int iLJJIZ;
        if (str == null || str2 == null || a0.LJJJIL(str2)) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        if (!TextUtils.isEmpty(str2) && (iLJJIZ = a0.LJJIZ(str2, '?', 0, false, 6)) != -1) {
            str2 = str2.substring(0, iLJJIZ);
        }
        sbLIZ.append(C08HM.LIZJ(str2).substring(8, 24));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LJ(Context context, Aweme aweme, String str, String str2) {
        String strLIZIZ;
        IEcUgVSAService iEcUgVSAService = (IEcUgVSAService) PluggableExtentionKt.pluggableSpi$default(IEcUgVSAService.class, false, false, false, 14, null);
        if (iEcUgVSAService != null && (strLIZIZ = iEcUgVSAService.LIZIZ(context, aweme, str2, str)) != null && strLIZIZ.length() > 0) {
            return strLIZIZ;
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:281:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x05b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1027480cqQ LIZ(java.lang.String r13, java.lang.String r14, int r15, int r16, int r17, int r18, org.json.JSONObject r19, X.C1027660cqi r20, X.C1027760cqs r21, android.os.Bundle r22, java.lang.String r23, int r24, java.lang.Integer r25, int r26, int r27, int r28, java.lang.Boolean r29, kotlin.jvm.internal.AwS595S0100000_16 r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, com.ss.android.ugc.aweme.feed.model.AwemeRawAd r34, int r35) {
        /*
            Method dump skipped, instruction units count: 1536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1027610cqd.LIZ(java.lang.String, java.lang.String, int, int, int, int, org.json.JSONObject, X.0cqi, X.0cqs, android.os.Bundle, java.lang.String, int, java.lang.Integer, int, int, int, java.lang.Boolean, kotlin.jvm.internal.AwS595S0100000_16, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.AwemeRawAd, int):X.0cqQ");
    }
}
