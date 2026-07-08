package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0VzI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C815740VzI {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Context context, Uri uri) throws Throwable {
        if (context != null && uri != null && !C1035990d49.LJI(uri.getScheme())) {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            List listLJJJJZ = C2204961BRm.LJJJJZ(packageManager, intent, 65536, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP2tYdHMySFxIagbfKO5DnilnEWc8HtaxjveSA==", null));
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJZ, 10));
            Iterator it2 = listLJJJJZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ResolveInfo) it2.next()).activityInfo.packageName);
            }
            return !arrayList.isEmpty();
        }
        return false;
    }
}
