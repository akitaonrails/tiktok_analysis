package X;

import Y.ARunnableS72S0200000_3;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.feed.Feed0VVManager;
import com.ss.android.ugc.aweme.feed.ghouse.ReachBottomCacheAbility;

/* JADX INFO: renamed from: X.0rlm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class RunnableC1601200rlm implements Runnable {
    public final /* synthetic */ int LL;
    public final /* synthetic */ Handler LLILLJJLI;
    public final /* synthetic */ Message LLILLL;
    public final /* synthetic */ boolean LLILZ;

    public final void LIZ() {
        C19EG c19eg;
        Fragment fragmentKi;
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        ReachBottomCacheAbility reachBottomCacheAbility;
        int i = this.LL;
        final Handler handler = this.LLILLJJLI;
        final Message message = this.LLILLL;
        C01GW c01gw = C269550AhN.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 1) {
            if (2 == i) {
                C786410Ut5.LJLJJLL(handler, message);
                return;
            }
        } else if (((Number) c01gw.getValue()).intValue() == 2) {
            if (2 == i) {
                Activity activityLIZ = C2421209eE.LIZ();
                if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (fragmentKi = Hox.LLJILJIL.LIZ(c19eg).Ki("For You")) != null && (interfaceC665370Q7zLJ = C1578630rBN.LJ(fragmentKi)) != null && (reachBottomCacheAbility = (ReachBottomCacheAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, ReachBottomCacheAbility.class, null)) != null && reachBottomCacheAbility.r32()) {
                    C786410Ut5.LJLJJLL(handler, message);
                    return;
                }
            }
        } else if (((Number) c01gw.getValue()).intValue() == 3 && 2 == i) {
            C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.0Utj
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    C786410Ut5.LJLJJL(handler, message);
                    return false;
                }
            }, Looper.getMainLooper().getQueue());
            return;
        }
        if (!this.LLILZ) {
            C786410Ut5.LJLJJL(this.LLILLJJLI, this.LLILLL);
            return;
        }
        Feed0VVManager.LJIIIIZZ = true;
        if (!C0COD.LJ()) {
            boolean z = (C0COD.LIZLLL() & 8) == 8;
            if (!C104100aN.LIZ().LJIILIIL() && z) {
                C786410Ut5.LJLJJL(this.LLILLJJLI, this.LLILLL);
                return;
            }
        }
        if (C0COD.LJ()) {
            C0COD.LIZIZ(C0CME.FIRST_VIDEO_SHOW, new ARunnableS72S0200000_3(this.LLILLJJLI, this.LLILLL, 38));
        } else if (C0COD.LJFF()) {
            C0COD.LIZIZ(C0CME.FIRST_VIDEO_WILL_LEAVE, new ARunnableS72S0200000_3(this.LLILLJJLI, this.LLILLL, 39));
        } else {
            C786410Ut5.LJLJJLL(this.LLILLJJLI, this.LLILLL);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("Feed0VVManager@569f.notifyFeedCallback$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Feed0VVManager@569f.notifyFeedCallback$1");
    }

    public RunnableC1601200rlm(int i, Handler handler, Message message, boolean z) {
        this.LL = i;
        this.LLILLJJLI = handler;
        this.LLILLL = message;
        this.LLILZ = z;
    }
}
