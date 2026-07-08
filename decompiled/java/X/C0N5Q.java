package X;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: X.0N5Q, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N5Q implements C08IT {
    public C0N5X LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1409705fT());

    @Override // X.C08IT
    public final boolean LIZ(Handler handler, Message message, long j) {
        C0N5X c0n5x;
        if (handler == null || message == null || message.getCallback() == null || (c0n5x = this.LIZ) == null) {
            return false;
        }
        c0n5x.LIZJ(j);
        return ((C0N5U) this.LIZIZ.getValue()).LIZ(message, j);
    }
}
