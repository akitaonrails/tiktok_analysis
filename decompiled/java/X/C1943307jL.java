package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07jL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1943307jL {
    public static final Uri LIZJ(String str) {
        Uri uri = null;
        if (str == null) {
            return null;
        }
        try {
            uri = UriProtector.parse(str);
            return uri;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return uri;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.net.Uri LIZ(android.net.Uri r4, java.lang.String r5) {
        /*
            java.lang.String r2 = r4.getScheme()
            if (r2 == 0) goto L21
            int r1 = r2.hashCode()
            r0 = -1377934078(0xffffffffadde6502, float:-2.5283334E-11)
            if (r1 == r0) goto L71
            r0 = 3213448(0x310888, float:4.503E-39)
            if (r1 == r0) goto L39
            r0 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r1 != r0) goto L21
            java.lang.String r0 = "https"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L42
        L21:
            r3 = 0
        L22:
            java.lang.String r2 = r4.getHost()
            r1 = 0
            if (r2 == 0) goto L36
            java.lang.String r0 = "echybrid"
            boolean r1 = kotlin.text.a0.LJJIIZI(r2, r0, r1)
            r0 = 1
            if (r1 != r0) goto L36
            android.net.Uri r3 = LIZIZ(r4, r5)
        L36:
            if (r3 == 0) goto L7e
            return r3
        L39:
            java.lang.String r0 = "http"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L42
            goto L21
        L42:
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            android.net.Uri$Builder r1 = r0.scheme(r5)
            java.lang.String r0 = "webview"
            android.net.Uri$Builder r2 = r1.authority(r0)
            java.lang.String r1 = r4.toString()
            java.lang.String r0 = "url"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            java.util.Set r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameterNames(r4)
            java.lang.String r1 = "use_spark"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L6c
            java.lang.String r0 = "1"
            r2.appendQueryParameter(r1, r0)
        L6c:
            android.net.Uri r3 = r2.build()
            goto L22
        L71:
            java.lang.String r0 = "bullet"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L21
            android.net.Uri r3 = LIZIZ(r4, r5)
            goto L22
        L7e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1943307jL.LIZ(android.net.Uri, java.lang.String):android.net.Uri");
    }

    public static final Uri LIZIZ(Uri uri, String str) {
        Uri uriLIZJ;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || (uriLIZJ = LIZJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) == null) {
            return null;
        }
        Uri.Builder builderScheme = new Uri.Builder().scheme(str);
        if (!Intrinsics.LJFF(uriLIZJ.getScheme(), "http") && !Intrinsics.LJFF(uriLIZJ.getScheme(), "https")) {
            builderScheme.authority(uriLIZJ.getScheme());
            builderScheme.encodedQuery(uriLIZJ.getEncodedQuery());
        } else {
            builderScheme.authority("webview");
            builderScheme.encodedQuery(uri.getEncodedQuery());
        }
        if (!UriProtector.getQueryParameterNames(uri).contains("use_spark")) {
            builderScheme.appendQueryParameter("use_spark", "1");
        }
        return builderScheme.build();
    }
}
