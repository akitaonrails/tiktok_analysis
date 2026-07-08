package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07jK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1943207jK {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri LIZ(android.net.Uri r5) {
        /*
            java.lang.String r2 = r5.getScheme()
            java.lang.String r3 = "aweme"
            if (r2 == 0) goto L23
            int r1 = r2.hashCode()
            r0 = -1377934078(0xffffffffadde6502, float:-2.5283334E-11)
            if (r1 == r0) goto L73
            r0 = 3213448(0x310888, float:4.503E-39)
            if (r1 == r0) goto L3b
            r0 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r1 != r0) goto L23
            java.lang.String r0 = "https"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L44
        L23:
            r4 = 0
        L24:
            java.lang.String r2 = r5.getHost()
            r1 = 0
            if (r2 == 0) goto L38
            java.lang.String r0 = "echybrid"
            boolean r1 = kotlin.text.a0.LJJIIZI(r2, r0, r1)
            r0 = 1
            if (r1 != r0) goto L38
            android.net.Uri r4 = LIZIZ(r5, r3)
        L38:
            if (r4 == 0) goto L80
            return r4
        L3b:
            java.lang.String r0 = "http"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L44
            goto L23
        L44:
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            android.net.Uri$Builder r1 = r0.scheme(r3)
            java.lang.String r0 = "webview"
            android.net.Uri$Builder r2 = r1.authority(r0)
            java.lang.String r1 = r5.toString()
            java.lang.String r0 = "url"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            java.util.Set r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameterNames(r5)
            java.lang.String r1 = "use_spark"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L6e
            java.lang.String r0 = "1"
            r2.appendQueryParameter(r1, r0)
        L6e:
            android.net.Uri r4 = r2.build()
            goto L24
        L73:
            java.lang.String r0 = "bullet"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L23
            android.net.Uri r4 = LIZIZ(r5, r3)
            goto L24
        L80:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1943207jK.LIZ(android.net.Uri):android.net.Uri");
    }

    public static final Uri LIZIZ(Uri uri, String str) {
        Uri uri2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            return null;
        }
        try {
            uri2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            uri2 = null;
        }
        if (uri2 == null) {
            return null;
        }
        Uri.Builder builderScheme = new Uri.Builder().scheme(str);
        if (!Intrinsics.LJFF(uri2.getScheme(), "http") && !Intrinsics.LJFF(uri2.getScheme(), "https")) {
            builderScheme.authority(uri2.getScheme());
            builderScheme.encodedQuery(uri2.getEncodedQuery());
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
