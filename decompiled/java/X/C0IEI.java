package X;

import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0IEI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public class C0IEI implements Runnable {
    public Room LL;
    public final /* synthetic */ LivePlayFragment LLILLJJLI;

    public final void LIZ() {
        if (this.LLILLJJLI.xV()) {
            LivePlayFragment livePlayFragment = this.LLILLJJLI;
            if (livePlayFragment.LLLLLZL == null) {
                if (!((LiveRoomFragment) livePlayFragment.f307n2).cS(livePlayFragment)) {
                    this.LLILLJJLI.x0.removeCallbacks(this);
                    C786410Ut5.LJLIIL(20L, this.LLILLJJLI.x0, this);
                    return;
                }
                LivePlayFragment livePlayFragment2 = this.LLILLJJLI;
                livePlayFragment2.FV(false, livePlayFragment2.PR());
                Room room = this.LL;
                if (room != null) {
                    this.LLILLJJLI.UV(room);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LivePlayFragment$RoomSelectedRunnable@169d.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LivePlayFragment$RoomSelectedRunnable@169d.run");
    }

    public C0IEI(LivePlayFragment livePlayFragment) {
        this.LLILLJJLI = livePlayFragment;
    }
}
