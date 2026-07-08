package X;

import android.net.Uri;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.util.ArrayList;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.07kC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1948607kC {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ(java.lang.String r4, java.util.Map<java.lang.String, ? extends java.lang.Object> r5) {
        /*
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r4)
            android.net.Uri$Builder r4 = r0.buildUpon()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = r5.size()
            r3.<init>(r0)
            java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L1b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto L47
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            java.lang.String r0 = X.C1189060h32.LJJIJ(r0)
            android.net.Uri$Builder r0 = r4.appendQueryParameter(r1, r0)
        L43:
            r3.add(r0)
            goto L1b
        L47:
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto L5a
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r2.toString()
            android.net.Uri$Builder r0 = r4.appendQueryParameter(r1, r0)
            goto L43
        L5a:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L71
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = X.C123100dR.LIZ(r2)
            if (r0 == 0) goto L71
            java.lang.Object r0 = r1.getKey()
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri$Builder r0 = r4.appendQueryParameter(r0, r2)
            goto L43
        L71:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            goto L43
        L74:
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1948607kC.LIZ(java.lang.String, java.util.Map):java.lang.String");
    }

    public static final void LIZIZ(String str, Map<String, ? extends Object> map) {
        if (u.LJJIIJZLJL(str, "http", false) || u.LJJIIJZLJL(str, "https", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://webview?url=");
            sbLIZ.append(Uri.encode(str));
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C1948707kD.LIZ().getApplicationContext(), str);
        smartRouteBuildRoute.withParam("use_spark", true);
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if (value instanceof Boolean) {
                    smartRouteBuildRoute.withParam(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Double) {
                    smartRouteBuildRoute.withParam(key, ((Number) value).doubleValue());
                } else if (value instanceof Integer) {
                    smartRouteBuildRoute.withParam(key, ((Number) value).intValue());
                } else if ((value instanceof String) && ((CharSequence) value).length() > 0) {
                    smartRouteBuildRoute.withParam(key, (String) value);
                }
            }
            arrayList.add(smartRouteBuildRoute);
        }
        smartRouteBuildRoute.open();
    }
}
