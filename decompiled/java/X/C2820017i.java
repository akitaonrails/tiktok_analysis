package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.017i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2820017i {
    public static final Uri LIZ(Uri uri, List<String> list) {
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

    public static final Uri LIZIZ(Uri uri, List<String> list) {
        if (!uri.isHierarchical()) {
            return uri;
        }
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (String str : UriProtector.getQueryParameterNames(uri)) {
            if (list.contains(str)) {
                Iterator<String> it2 = UriProtector.getQueryParameters(uri, str).iterator();
                while (it2.hasNext()) {
                    builderClearQuery.appendQueryParameter(str, it2.next());
                }
            }
        }
        return builderClearQuery.build();
    }
}
