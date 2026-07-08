package X;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;

/* JADX INFO: renamed from: X.1ASB, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ASB extends BroadcastReceiver {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat != null && intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            MediaControllerCompat mediaControllerCompat = mediaSessionCompat.LIZIZ;
            if (keyEvent != null) {
                mediaControllerCompat.LIZ.LIZ.dispatchMediaButtonEvent(keyEvent);
            } else {
                mediaControllerCompat.getClass();
                throw new IllegalArgumentException("KeyEvent may not be null");
            }
        }
    }

    public static PendingIntent LIZ(Context context, ComponentName componentName, long j) {
        int i;
        if (componentName == null) {
            return null;
        }
        int i2 = 0;
        if (j == 4) {
            i = 126;
        } else if (j == 2) {
            i = 127;
        } else if (j == 32) {
            i = 87;
        } else if (j == 16) {
            i = 88;
        } else if (j == 1) {
            i = 86;
        } else if (j == 64) {
            i = 90;
        } else if (j == 8) {
            i = 89;
        } else {
            if (j != 512) {
                return null;
            }
            i = 85;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
        intent.addFlags(268435456);
        if (Build.VERSION.SDK_INT >= 31) {
            i2 = 33554432;
        }
        return PendingIntent.getBroadcast(context, i, intent, i2);
    }
}
