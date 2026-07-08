package X;

import android.view.Window;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.liveroom.RoomListener;
import com.bytedance.android.livesdkapi.host.user.IHostPad;

/* JADX INFO: renamed from: X.0IJl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464510IJl implements InterfaceC463830IGv {
    public final /* synthetic */ RoomListener LIZ;

    public C464510IJl(RoomListener roomListener) {
        this.LIZ = roomListener;
    }

    public final void LIZ(boolean z) {
        C19EG activity;
        Window window;
        LiveRoomFragment liveRoomFragment = this.LIZ.fragment;
        if (liveRoomFragment == null || (activity = liveRoomFragment.getActivity()) == null || (window = activity.getWindow()) == null) {
            return;
        }
        if (!z && !((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
            activity.getWindow().setFlags(1024, 1024);
        } else {
            if (!C2075608Be.LIZJ(activity)) {
                return;
            }
            window.clearFlags(1024);
        }
    }
}
