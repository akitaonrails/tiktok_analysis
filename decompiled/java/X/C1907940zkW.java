package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;

/* JADX INFO: renamed from: X.0zkW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907940zkW {
    public static final Set<String> LIZJ(Uri uri) {
        if (!uri.isHierarchical()) {
            return C08CX.INSTANCE;
        }
        try {
            return UriProtector.getQueryParameterNames(uri);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C08CX.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.net.Uri LIZLLL(java.lang.String r4) {
        /*
            r3 = 0
            if (r4 == 0) goto Le
            int r0 = r4.length()
            if (r0 == 0) goto Le
            r0 = 0
        La:
            r2 = 0
            if (r0 == 0) goto L10
            return r2
        Le:
            r0 = 1
            goto La
        L10:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r4)     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r1.isHierarchical()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L2e
            java.lang.String r0 = r1.getScheme()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L26
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L27
        L26:
            r3 = 1
        L27:
            if (r3 != 0) goto L2e
            return r1
        L2a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L2e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1907940zkW.LIZLLL(java.lang.String):android.net.Uri");
    }

    public static final boolean LIZ(Uri uri, String str) {
        boolean booleanQueryParameter = false;
        if (!uri.isHierarchical()) {
            return false;
        }
        try {
            booleanQueryParameter = uri.getBooleanQueryParameter(str, false);
            return booleanQueryParameter;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return booleanQueryParameter;
        }
    }

    public static final String LIZIZ(Uri uri, String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        if (!uri.isHierarchical()) {
            return null;
        }
        try {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
            return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        }
    }
}
