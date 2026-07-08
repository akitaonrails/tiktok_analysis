package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uwt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1723410uwt {
    public static final /* synthetic */ int LIZ = 0;

    public static C1723400uws LIZ(Object obj) {
        JSONObject jSONObject;
        if (!(obj instanceof JSONObject) || (jSONObject = (JSONObject) obj) == null) {
            return null;
        }
        return new C1723400uws(Boolean.valueOf(jSONObject.optBoolean("horizontal_content_overflow")), Integer.valueOf(jSONObject.optInt("view_width", 0)), Integer.valueOf(jSONObject.optInt("view_height", 0)), Boolean.valueOf(jSONObject.optBoolean("scrollable_horizontal_overflow")), jSONObject.optString("error"), jSONObject.optString("html"), Boolean.valueOf(jSONObject.optBoolean("valid_device_width_view_port")), jSONObject.optString("font_size"));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(java.lang.String r9) {
        /*
            com.ss.android.ugc.aweme.pipo.hybrid.settings.PipoContainerWebAnalysisSettingInfo r5 = X.C1723360uwo.LIZ()
            java.lang.Integer r0 = r5.sampleRate
            r3 = 0
            if (r0 == 0) goto L45
            int r4 = r0.intValue()
        Ld:
            X.0uus r0 = X.C1717770unn.LIZJ()
            java.lang.String r0 = r0.getDeviceId()
            if (r0 == 0) goto Lb1
            java.lang.Long r2 = X.C2095008Iq.LJIILIIL(r0)
            r6 = 1
            if (r2 == 0) goto Lb1
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "matchSampleRate, didInt: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", rate: "
            r1.append(r0)
            r1.append(r4)
            X.C2188811AlT.LIZIZ(r1)
            long r7 = r2.longValue()
            r0 = 100
            long r0 = (long) r0
            long r7 = r7 % r0
            long r1 = (long) r4
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto Lb1
            if (r9 == 0) goto L58
            goto L47
        L45:
            r4 = 0
            goto Ld
        L47:
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r9)     // Catch: java.lang.Exception -> L54
            if (r0 == 0) goto L58
            java.lang.String r4 = r0.getHost()     // Catch: java.lang.Exception -> L54
            if (r4 != 0) goto L5a
            goto L58
        L54:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L58:
            java.lang.String r4 = ""
        L5a:
            int r0 = r4.length()
            if (r0 != 0) goto L61
            return r3
        L61:
            java.util.List<java.lang.String> r0 = r5.allowList
            java.util.Objects.toString(r0)
            java.util.List<java.lang.String> r0 = r5.blockList
            java.util.Objects.toString(r0)
            int r1 = r5.state
            if (r1 == 0) goto L92
            if (r1 == r6) goto L93
            r0 = 2
            if (r1 != r0) goto L92
            java.util.List<java.lang.String> r0 = r5.blockList
            if (r0 == 0) goto L91
            java.util.Iterator r2 = r0.iterator()
        L7c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = kotlin.text.a0.LJJIIZI(r4, r0, r3)
            if (r0 == 0) goto L7c
            if (r1 != 0) goto L92
        L91:
            r3 = 1
        L92:
            return r3
        L93:
            java.util.List<java.lang.String> r0 = r5.allowList
            if (r0 == 0) goto L92
            java.util.Iterator r2 = r0.iterator()
        L9b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = kotlin.text.a0.LJJIIZI(r4, r0, r3)
            if (r0 == 0) goto L9b
            if (r1 == 0) goto L92
            goto L91
        Lb1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1723410uwt.LIZIZ(java.lang.String):boolean");
    }
}
