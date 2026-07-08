package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0WY1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WY1 extends BinderC817800W6g {
    public final WeakReference LL;
    public final int LLILLJJLI;

    @Override // X.BinderC817800W6g, X.InterfaceC817790W6f
    public final void w(Status status) {
        int i;
        Activity activity = (Activity) this.LL.get();
        if (activity == null) {
            return;
        }
        PendingIntent pendingIntent = status.zzf;
        if (pendingIntent != null) {
            try {
                int i2 = this.LLILLJJLI;
                if (pendingIntent != null) {
                    C0W3J.LJIIIIZZ(pendingIntent);
                    activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, null, 0, 0, 0);
                    return;
                }
                return;
            } catch (IntentSender.SendIntentException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(this.LLILLJJLI, new Intent(), 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            return;
        }
        try {
            if (status.LJLZ()) {
                i = -1;
            } else {
                i = status.zzd;
            }
            pendingIntentCreatePendingResult.send(i);
        } catch (PendingIntent.CanceledException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public C0WY1(Activity activity, int i) {
        this.LL = new WeakReference(activity);
        this.LLILLJJLI = i;
    }
}
