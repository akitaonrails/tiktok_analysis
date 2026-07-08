package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01jj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C416901jj {
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

    public static final Uri LIZJ(Uri uri, List<String> list) {
        if (!uri.isHierarchical()) {
            return uri;
        }
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (String str : UriProtector.getQueryParameterNames(uri)) {
            if (!list.contains(str)) {
                Iterator<String> it2 = UriProtector.getQueryParameters(uri, str).iterator();
                while (it2.hasNext()) {
                    builderClearQuery.appendQueryParameter(str, it2.next());
                }
            }
        }
        return builderClearQuery.build();
    }
}
