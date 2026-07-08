package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import com.ss.android.ugc.mediabox.bgplay.notification.BgPlayService;

/* JADX INFO: renamed from: X.1AS0, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AS0 {
    public static final /* synthetic */ int LIZ = 0;

    public static PendingIntent LIZ(int i, ComponentName componentName, BgPlayService bgPlayService) {
        int i2;
        Intent intent = new Intent();
        intent.setComponent(componentName);
        intent.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", i);
        if (Build.VERSION.SDK_INT >= 31) {
            i2 = 201326592;
        } else {
            i2 = 134217728;
        }
        return PendingIntent.getService(bgPlayService, i, intent, i2);
    }
}
