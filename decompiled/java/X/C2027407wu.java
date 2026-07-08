package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.config.PlaceholderInfoModel;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07wu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2027407wu {
    public static final C2027407wu LIZ = new C2027407wu();

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r4, com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.config.PlaceholderInfoModel r5, java.util.Map r6) {
        /*
            if (r6 == 0) goto L3c
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L3c
            java.lang.String r0 = r5.url
            if (r0 == 0) goto L40
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            if (r0 == 0) goto L40
            android.net.Uri$Builder r3 = r0.buildUpon()
            if (r3 == 0) goto L40
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L20:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.appendQueryParameter(r1, r0)
            goto L20
        L3c:
            java.lang.String r2 = r5.url
            if (r2 != 0) goto L4f
        L40:
            java.lang.String r2 = ""
            goto L4f
        L43:
            android.net.Uri r0 = r3.build()
            if (r0 == 0) goto L40
            java.lang.String r2 = r0.toString()
            if (r2 == 0) goto L40
        L4f:
            java.lang.String r0 = "aweme://webview/"
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            android.net.Uri$Builder r1 = r0.buildUpon()
            java.lang.String r0 = "url"
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r0, r2)
            android.net.Uri r0 = r0.build()
            java.lang.String r0 = r0.toString()
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r4, r0)
            r0.open()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2027407wu.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.config.PlaceholderInfoModel, java.util.Map):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CharSequence LIZ(C2027407wu c2027407wu, Context context, String str, Map map, Typeface typeface, Integer num) {
        c2027407wu.getClass();
        C2027507wv c2027507wv = new C2027507wv(context, typeface, num, null);
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('{');
            sbLIZ.append(str2);
            sbLIZ.append('}');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (a0.LJJIIZI(str, strLIZIZ, false)) {
                strLIZIZ.toString();
                int iLJJJ = a0.LJJJ(str, strLIZIZ, 0, false, 6);
                str = (CharSequence) c2027507wv.invoke(entry.getValue(), new SpannableStringBuilder(str).replace(iLJJJ, strLIZIZ.length() + iLJJJ, (CharSequence) ((PlaceholderInfoModel) entry.getValue()).transValue));
            }
        }
        return str;
    }
}
