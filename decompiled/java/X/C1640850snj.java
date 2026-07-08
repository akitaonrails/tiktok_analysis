package X;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0snj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1640850snj implements MessageQueue.IdleHandler {
    public final /* synthetic */ C1640830snh LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        C1640830snh c1640830snh = this.LL;
        if (c1640830snh.LJIILJJIL) {
            return false;
        }
        C1640590snJ c1640590snJ = C1640590snJ.LIZ;
        Context context = c1640830snh.LIZ.getContext();
        boolean z = this.LL.LJ;
        c1640590snJ.getClass();
        Pair pairLIZJ = C1640590snJ.LIZJ(context, z);
        Object first = pairLIZJ.getFirst();
        Object second = pairLIZJ.getSecond();
        ((ArrayList) C1640590snJ.LIZIZ).add(new Pair(first, second));
        C1640830snh c1640830snh2 = this.LL;
        int i = this.LLILLJJLI + 1;
        int i2 = this.LLILLL;
        c1640830snh2.getClass();
        if (i < i2) {
            C786410Ut5.f3(new C1640850snj(c1640830snh2, i, i2), Looper.myQueue());
        }
        return false;
    }

    public C1640850snj(C1640830snh c1640830snh, int i, int i2) {
        this.LL = c1640830snh;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }
}
