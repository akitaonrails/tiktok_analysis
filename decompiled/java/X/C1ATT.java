package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: renamed from: X.1ATT, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ATT {
    public final IntentFilter LIZ;
    public final BroadcastReceiver LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.LIZIZ);
        sb.append(" filter=");
        sb.append(this.LIZ);
        if (this.LIZLLL) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }

    public C1ATT(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.LIZ = intentFilter;
        this.LIZIZ = broadcastReceiver;
    }
}
