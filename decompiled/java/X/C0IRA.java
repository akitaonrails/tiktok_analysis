package X;

import com.bytedance.android.livesdk.LiveRoomFragment;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0IRA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IRA {
    public final /* synthetic */ LiveRoomFragment LIZ;

    public final void finalize() throws Throwable {
        super.finalize();
        LiveRoomFragment liveRoomFragment = this.LIZ;
        if (liveRoomFragment.getActivity() == null || liveRoomFragment.isDetached() || liveRoomFragment.isRemoving()) {
            return;
        }
        C1163660gO4.LIZ.getClass();
        Long l = C1163660gO4.LIZJ.get("mem_java_max");
        Long l2 = C1163660gO4.LIZJ.get("mem_java_used");
        if (l == null || l2 == null || l.longValue() <= 0) {
            return;
        }
        if (l2.floatValue() / l.floatValue() > 0.75d) {
            liveRoomFragment.LLJZ.getClass();
            C1768280w7G c1768280w7G = new C1768280w7G();
            c1768280w7G.LIZJ = EnumC21267218Ko.LIVE_PLAY;
            C476250Ilz.LIZ.LJ(new C1768270w7F(c1768280w7G));
        }
        new WeakReference(new C0IRA(liveRoomFragment));
    }

    public C0IRA(LiveRoomFragment liveRoomFragment) {
        this.LIZ = liveRoomFragment;
    }
}
