package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import java.util.HashMap;

/* JADX INFO: renamed from: X.06Er, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1575106Er implements Handler.Callback {
    public final C01GW LL = C452501pT.LIZIZ(new C1575206Es(this));
    public final HashMap<String, C1574906Ep> LLILLJJLI = new HashMap<>();

    public final void LIZIZ() {
        ((Handler) this.LL.getValue()).removeMessages(1);
        synchronized (this.LLILLJJLI) {
            try {
                this.LLILLJJLI.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object messageObj = HandlerHook.getMessageObj(message.obj);
        if (message.what == 1 && (messageObj instanceof String)) {
            synchronized (this.LLILLJJLI) {
                try {
                    C1574906Ep c1574906EpRemove = this.LLILLJJLI.remove(messageObj);
                    if (c1574906EpRemove == null) {
                        return true;
                    }
                    C1566606Bk.LIZ.LLLIILIL(c1574906EpRemove);
                    C1572806Du.LL.LLLIILIL(c1574906EpRemove);
                    return true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return false;
    }

    public final void LIZ(long j, int i, StreakData streakData) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append('_');
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        HashMap<String, C1574906Ep> map = this.LLILLJJLI;
        C1574906Ep c1574906Ep = map.get(strLIZIZ);
        if (c1574906Ep == null) {
            C786410Ut5.LJLJLJ((Handler) this.LL.getValue(), ((Handler) this.LL.getValue()).obtainMessage(1, strLIZIZ), j - jCurrentTimeMillis);
            c1574906Ep = new C1574906Ep(j, i);
            map.put(strLIZIZ, c1574906Ep);
        }
        c1574906Ep.LIZJ.add(C1566206Bg.LIZ(streakData));
    }
}
