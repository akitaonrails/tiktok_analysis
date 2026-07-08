package X;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.08AF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08AF implements Handler.Callback {
    public final Handler.Callback LL;
    public final List<Handler.Callback> LLILLJJLI = new ArrayList();

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message == null) {
            Handler.Callback callback = this.LL;
            if (callback == null) {
                return false;
            }
            return callback.handleMessage(message);
        }
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            if (((Handler.Callback) it2.next()).handleMessage(message)) {
                return true;
            }
        }
        Handler.Callback callback2 = this.LL;
        if (callback2 == null) {
            return false;
        }
        return callback2.handleMessage(message);
    }

    public C08AF(Handler handler, Handler.Callback callback) {
        this.LL = callback;
    }
}
