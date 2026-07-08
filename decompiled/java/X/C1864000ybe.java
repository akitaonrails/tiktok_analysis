package X;

import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse;

/* JADX INFO: renamed from: X.0ybe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1864000ybe {
    public static final SharedPreferences LIZ = C810670Vr7.LIZJ(C1857750yRZ.LIZ, 0, "xbridge-storage");
    public static SearchLandingPageResponse LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse LIZ(java.lang.String r6) {
        /*
            r5 = 0
            if (r6 != 0) goto L4
            return r5
        L4:
            android.content.SharedPreferences r1 = X.C1864000ybe.LIZ
            if (r1 == 0) goto L1a
            boolean r0 = r1.contains(r6)
            if (r0 == 0) goto L1a
            java.lang.String r0 = ""
            java.lang.String r1 = r1.getString(r6, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L1b
        L1a:
            r1 = r5
        L1b:
            java.util.Map r1 = X.C1905490zgZ.LIZ(r1)
            java.lang.String r0 = "value"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r0 = r3.length()
            if (r0 != 0) goto L30
            return r5
        L30:
            java.util.Map r1 = X.C1905490zgZ.LIZ(r3)
            if (r1 == 0) goto L52
            java.lang.String r0 = "inspireAdvicePageDetail"
            java.lang.Object r2 = r1.get(r0)
        L3c:
            boolean r0 = r2 instanceof java.util.Map
            if (r0 != 0) goto L41
            r2 = r5
        L41:
            java.util.Map r1 = X.C1905490zgZ.LIZ(r3)
            if (r1 == 0) goto L50
            java.lang.String r0 = "searchId"
            java.lang.Object r4 = r1.get(r0)
        L4d:
            if (r2 != 0) goto L54
            return r5
        L50:
            r4 = r5
            goto L4d
        L52:
            r2 = r5
            goto L3c
        L54:
            com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse r3 = new com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "inspire_advice_page"
            r1.<init>(r0, r2)
            java.util.Map r2 = X.C2097908Jt.LIZJ(r1)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "page_detail"
            r1.<init>(r0, r2)
            java.util.Map r2 = X.C2097908Jt.LIZJ(r1)
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r3.<init>(r2, r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1864000ybe.LIZ(java.lang.String):com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse");
    }
}
