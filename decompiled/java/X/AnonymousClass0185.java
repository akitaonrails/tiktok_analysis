package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0185, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0185 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(android.net.Uri r3) {
        /*
            java.lang.String r2 = ""
            if (r3 == 0) goto L55
            boolean r0 = r3.isOpaque()
            if (r0 != 0) goto L55
            boolean r0 = r3.isOpaque()
            if (r0 != 0) goto L2b
            java.lang.String r0 = "surl"
            java.lang.String r1 = LJ(r3, r0)
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L2b
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L27
            goto L2c
        L27:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L2b:
            r1 = r2
        L2c:
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            if (r0 == 0) goto L54
            boolean r0 = r3.isOpaque()
            if (r0 != 0) goto L53
            java.lang.String r0 = "url"
            java.lang.String r1 = LJ(r3, r0)
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L53
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L4f
            return r2
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L53:
            return r2
        L54:
            return r1
        L55:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0185.LIZLLL(android.net.Uri):java.lang.String");
    }

    public static Uri LIZ(Uri uri, List list) {
        if (uri != null && !uri.isOpaque()) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (!a0.LJJJIL(LJ(uri, str))) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                return uri;
            }
            try {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                builderBuildUpon.clearQuery();
                for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                    if (!list.contains(str2)) {
                        Iterator<String> it3 = UriProtector.getQueryParameters(uri, str2).iterator();
                        while (it3.hasNext()) {
                            builderBuildUpon.appendQueryParameter(str2, it3.next());
                        }
                    }
                }
                return builderBuildUpon.build();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return uri;
    }

    public static Uri LIZJ(Uri uri, Map map) {
        if (uri != null && !uri.isOpaque()) {
            try {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                builderBuildUpon.clearQuery();
                Set setKeySet = map.keySet();
                for (String str : UriProtector.getQueryParameterNames(uri)) {
                    if (!setKeySet.contains(str)) {
                        Iterator<String> it2 = UriProtector.getQueryParameters(uri, str).iterator();
                        while (it2.hasNext()) {
                            builderBuildUpon.appendQueryParameter(str, it2.next());
                        }
                    }
                }
                for (Map.Entry entry : map.entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                return builderBuildUpon.build();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return uri;
    }

    public static String LJ(Uri uri, String str) {
        if (uri != null && !uri.isOpaque() && !a0.LJJJIL(str)) {
            try {
                return C123500dV.LIZIZ(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return "";
            }
        }
        return "";
    }

    public static Uri LIZIZ(Uri uri, String str, String str2) {
        if (uri != null && !uri.isOpaque()) {
            try {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str) != null) {
                    builderBuildUpon.clearQuery();
                    for (String str3 : UriProtector.getQueryParameterNames(uri)) {
                        if (!Intrinsics.LJFF(str3, str)) {
                            Iterator<String> it2 = UriProtector.getQueryParameters(uri, str3).iterator();
                            while (it2.hasNext()) {
                                builderBuildUpon.appendQueryParameter(str3, it2.next());
                            }
                        }
                    }
                }
                return builderBuildUpon.appendQueryParameter(str, str2).build();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return uri;
    }
}
