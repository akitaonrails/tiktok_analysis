package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.017h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2819017h {
    public static final Uri LIZ(Uri uri, String str) {
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
}
