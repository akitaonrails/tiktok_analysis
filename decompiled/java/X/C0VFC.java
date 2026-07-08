package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0VFC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VFC {
    public static boolean LIZ(Context context, Intent intent) {
        PackageManager packageManager;
        List<ResolveInfo> listQueryBroadcastReceivers;
        if (context == null || (packageManager = context.getPackageManager()) == null || (listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0)) == null || listQueryBroadcastReceivers.size() <= 0) {
            return false;
        }
        return true;
    }
}
