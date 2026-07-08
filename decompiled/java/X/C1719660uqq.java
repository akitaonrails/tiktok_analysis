package X;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.result.IntentSenderRequest;

/* JADX INFO: renamed from: X.0uqq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1719660uqq {
    public final IntentSender LIZ;
    public Intent LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final IntentSenderRequest LIZ() {
        return new IntentSenderRequest(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    public C1719660uqq(PendingIntent pendingIntent) {
        this(pendingIntent.getIntentSender());
    }

    public C1719660uqq(IntentSender intentSender) {
        this.LIZ = intentSender;
    }
}
