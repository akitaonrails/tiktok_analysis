package X;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: X.088F, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C088F implements Handler.Callback {
    public static final C088F LLILZ = new C088F();
    public final List<C088I> LL = new ArrayList();
    public Handler.Callback LLILLJJLI;
    public boolean LLILLL;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.arg2 == 1000089) {
            Handler.Callback callback = this.LLILLJJLI;
            if (callback == null) {
                return false;
            }
            return callback.handleMessage(message);
        }
        if (C088G.LIZIZ(message) && C088B.LIZIZ().LLILLL) {
            C088B c088bLIZIZ = C088B.LIZIZ();
            c088bLIZIZ.getClass();
            Message messageObtain = Message.obtain(message);
            Message messageObtain2 = Message.obtain(c088bLIZIZ.LL);
            messageObtain2.obj = messageObtain;
            C786410Ut5.LJLJL(c088bLIZIZ.LL, messageObtain2, message.getWhen());
            return true;
        }
        if (message.getTarget() == C1966607n6.LIZJ()) {
            if (((HashSet) C088G.LIZIZ).contains(Integer.valueOf(message.what))) {
                C786410Ut5.a3(Message.obtain(message));
                return true;
            }
        }
        Handler.Callback callback2 = this.LLILLJJLI;
        if (callback2 == null) {
            return false;
        }
        return callback2.handleMessage(message);
    }
}
