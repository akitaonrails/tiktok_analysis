package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: X.0WXz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825010WXz extends C0W4V {
    public PendingIntent getResolution() {
        return getStatus().zzf;
    }

    public C825010WXz(Status status) {
        super(status);
    }

    public void startResolutionForResult(Activity activity, int i) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent = getStatus().zzf;
        if (pendingIntent != null) {
            C0W3J.LJIIIIZZ(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
        }
    }
}
