package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07uI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2011207uI {
    public static final String LIZ(Uri uri, String str) {
        if (!uri.isHierarchical()) {
            return null;
        }
        return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
    }

    public static final Uri LIZIZ(Uri uri, String str) {
        if (!uri.isHierarchical()) {
            return uri;
        }
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
            if (!Intrinsics.LJFF(str2, str)) {
                Iterator<String> it2 = UriProtector.getQueryParameters(uri, str2).iterator();
                while (it2.hasNext()) {
                    builderClearQuery.appendQueryParameter(str2, it2.next());
                }
            }
        }
        return builderClearQuery.build();
    }

    public static final String LIZJ(Uri uri, String str) {
        try {
            return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
