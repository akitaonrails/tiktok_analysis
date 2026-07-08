package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: renamed from: X.0hVc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206780hVc {
    public static final void LIZ(String str) {
        C2276411E8h.LIZIZ.LIZJ("favorite", 6, "fav_trace", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(java.lang.String r9, java.lang.Throwable r10) {
        /*
            boolean r0 = r10 instanceof X.C614080O6s
            if (r0 == 0) goto La
            X.0O6s r10 = (X.C614080O6s) r10
            java.lang.Throwable r10 = r10.getE()
        La:
            boolean r1 = r10 instanceof X.C0XIR
            java.lang.String r8 = "net"
            r7 = 0
            java.lang.String r6 = " from "
            java.lang.String r0 = "failed request api "
            java.lang.String r5 = "fav_trace"
            r4 = 6
            java.lang.String r3 = "favorite"
            if (r1 == 0) goto L6f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            r1.append(r9)
            r1.append(r6)
            r1.append(r8)
            java.lang.String r0 = ", resp is "
            r1.append(r0)
            X.0XIR r10 = (X.C0XIR) r10
            java.lang.String r0 = r10.getResponse()
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            X.1E8h r0 = X.C2276411E8h.LIZIZ
            r0.LIZJ(r3, r4, r5, r2)
            java.text.DateFormat r1 = java.text.SimpleDateFormat.getInstance()
            boolean r0 = r1 instanceof java.text.SimpleDateFormat
            if (r0 == 0) goto L6c
            java.text.SimpleDateFormat r1 = (java.text.SimpleDateFormat) r1
            if (r1 == 0) goto L6c
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
            r1.applyPattern(r0)
            java.lang.String r0 = "GMT"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            r1.setTimeZone(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r1 = r1.format(r0)
            if (r1 == 0) goto L6c
        L66:
            X.0NmG<java.lang.String, java.lang.String> r0 = X.C614440O8c.LIZJ
            r0.LIZLLL(r1, r2)
            return
        L6c:
            java.lang.String r1 = ""
            goto L66
        L6f:
            X.1E8h r2 = X.C2276411E8h.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            r1.append(r9)
            r1.append(r6)
            r1.append(r8)
            java.lang.String r0 = ", reason is "
            r1.append(r0)
            if (r10 == 0) goto L8c
            java.lang.String r7 = X.C13SZ.LIZIZ(r10)
        L8c:
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.LIZJ(r3, r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1206780hVc.LIZIZ(java.lang.String, java.lang.Throwable):void");
    }

    public static final void LIZJ(String str, String str2, BaseResponse baseResponse) {
        Integer numValueOf;
        String str3;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("success request api ");
        sbLIZ.append(str);
        sbLIZ.append(" from ");
        sbLIZ.append(str2);
        sbLIZ.append(", status code is ");
        String str4 = null;
        if (baseResponse != null) {
            numValueOf = Integer.valueOf(baseResponse.status_code);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", status msg is ");
        if (baseResponse != null) {
            str3 = baseResponse.status_msg;
        } else {
            str3 = null;
        }
        sbLIZ.append(str3);
        sbLIZ.append(", log id is ");
        if (baseResponse != null && (serverTimeExtra = baseResponse.extra) != null) {
            str4 = serverTimeExtra.logid;
        }
        sbLIZ.append(str4);
        c2276411E8h.LIZJ("favorite", 6, "fav_trace", C2188811AlT.LIZIZ(sbLIZ));
    }
}
