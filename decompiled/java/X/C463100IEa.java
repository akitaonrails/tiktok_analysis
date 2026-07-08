package X;

import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

/* JADX INFO: renamed from: X.0IEa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C463100IEa implements C0IG1 {
    public final /* synthetic */ LivePlayFragment LIZ;

    public C463100IEa(LivePlayFragment livePlayFragment) {
        this.LIZ = livePlayFragment;
    }

    public final boolean LIZ(long j) {
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        if (!this.LIZ.isAdded() || this.LIZ.isDetached()) {
            return false;
        }
        LivePlayFragment livePlayFragment = this.LIZ;
        if (livePlayFragment.mStatusDestroyed || livePlayFragment.getActivity() == null || (enterRoomConfig = this.LIZ.g1) == null || (roomsData = enterRoomConfig.mRoomsData) == null || roomsData.roomId != j) {
            return false;
        }
        return true;
    }
}
