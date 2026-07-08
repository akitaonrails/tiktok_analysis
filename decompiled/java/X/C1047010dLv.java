package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.anchor.model.AnchorData;
import com.ss.android.ugc.aweme.commercialize.anchor.model.CommerceAnchorInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: renamed from: X.0dLv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1047010dLv {
    public static final C1047010dLv LIZ = new C1047010dLv();

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZIZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r9) {
        /*
            java.lang.String r0 = r9.getExtra()
            r9 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6a
            r1.<init>(r0)     // Catch: org.json.JSONException -> L6a
            java.lang.String r0 = "anchor_position"
            org.json.JSONArray r6 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONArray(r1, r0)     // Catch: org.json.JSONException -> L6a
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: org.json.JSONException -> L6a
            r5.<init>()     // Catch: org.json.JSONException -> L6a
            int r4 = r6.length()     // Catch: org.json.JSONException -> L6a
            r3 = 0
        L1a:
            if (r3 >= r4) goto L76
            java.lang.Object r0 = r6.get(r3)     // Catch: org.json.JSONException -> L6a
            java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch: org.json.JSONException -> L6a
            r2 = 0
            com.google.gson.Gson r7 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L5b org.json.JSONException -> L6a
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L5b org.json.JSONException -> L6a
            r0.getClass()     // Catch: com.google.gson.s -> L5b org.json.JSONException -> L6a
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L5b org.json.JSONException -> L6a
            if (r0 == 0) goto L3a
            boolean r1 = r0.LJII     // Catch: com.google.gson.s -> L5b org.json.JSONException -> L6a
            r0 = 1
            if (r1 != r0) goto L3a
            goto L3b
        L3a:
            r0 = 0
        L3b:
            if (r0 == 0) goto L3e
            goto L48
        L3e:
            X.0ctH r0 = new X.0ctH     // Catch: com.google.gson.s -> L5b org.json.JSONException -> L6a
            r0.<init>()     // Catch: com.google.gson.s -> L5b org.json.JSONException -> L6a
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L5b org.json.JSONException -> L6a
            goto L52
        L48:
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch: com.google.gson.s -> L5b org.json.JSONException -> L6a
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L5b org.json.JSONException -> L6a
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L5b org.json.JSONException -> L6a
        L52:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r7, r8, r0)     // Catch: com.google.gson.s -> L5b org.json.JSONException -> L6a
            boolean r0 = r1 instanceof java.lang.Integer     // Catch: com.google.gson.s -> L5b org.json.JSONException -> L6a
            if (r0 != 0) goto L61
            goto L60
        L5b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: org.json.JSONException -> L6a
            goto L62
        L60:
            r1 = r2
        L61:
            r2 = r1
        L62:
            if (r2 == 0) goto L67
            r5.add(r2)     // Catch: org.json.JSONException -> L6a
        L67:
            int r3 = r3 + 1
            goto L1a
        L6a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.util.List r5 = java.util.Collections.singletonList(r0)
        L76:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1047010dLv.LIZIZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct):java.util.List");
    }

    public static CommerceAnchorInfo LIZJ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            C1227904rF.LIZ.getClass();
            return (CommerceAnchorInfo) C1227904rF.LIZIZ(str, CommerceAnchorInfo.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LIZ(InterfaceC1044450dHn interfaceC1044450dHn, AnchorData anchorData, Map map) {
        Map<String, String> trackingData;
        AwemeCommerceStruct commerceVideoAuthInfo;
        Aweme aweme = interfaceC1044450dHn.getAweme();
        if ((aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || !commerceVideoAuthInfo.isPseudoAd()) && map != null && anchorData != null && (trackingData = anchorData.getTrackingData()) != null) {
            trackingData.putAll(map);
        }
    }
}
