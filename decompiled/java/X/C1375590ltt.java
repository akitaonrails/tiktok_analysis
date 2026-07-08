package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* JADX INFO: renamed from: X.0ltt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375590ltt {
    public static void LIZ(SharePackage sharePackage) {
        Bundle bundle;
        Bundle bundle2;
        String string;
        Bundle bundle3;
        C1376010luZ c1376010luZ = C1376010luZ.LIZ;
        Bundle bundle4 = new Bundle();
        c1376010luZ.getClass();
        C1376010luZ.LJJIFFI = bundle4;
        String string2 = null;
        if (sharePackage != null && (bundle3 = sharePackage.extras) != null) {
            string2 = bundle3.getString("download_method");
        }
        String str = "";
        if (string2 == null) {
            string2 = "";
        }
        C786410Ut5.LJJJI("download_method", string2, bundle4);
        Bundle bundle5 = C1376010luZ.LJJIFFI;
        if (bundle5 != null) {
            if (sharePackage != null && (bundle2 = sharePackage.extras) != null && (string = bundle2.getString("explore_from_group_id")) != null) {
                str = string;
            }
            C786410Ut5.LJJJI("explore_from_group_id", str, bundle5);
        }
        C1376270luz c1376270luz = C1376270luz.LIZ;
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            bundle.getString("download_method");
        }
        c1376270luz.getClass();
    }
}
