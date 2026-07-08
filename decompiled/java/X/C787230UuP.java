package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* JADX INFO: renamed from: X.0UuP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C787230UuP {
    public static Context LIZ;

    public static Intent LIZ(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C786410Ut5.LJJ(context, broadcastReceiver, intentFilter, null, null, 4);
        }
        return C786410Ut5.LJIL(context, broadcastReceiver, intentFilter, null, null);
    }
}
