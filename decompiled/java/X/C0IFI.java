package X;

import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.ies.sdk.widgets.scatter.LiveExitRoomRunnableScatter;

/* JADX INFO: renamed from: X.0IFI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public class C0IFI implements C0IJS {
    public final /* synthetic */ LivePlayFragment LIZ;

    public C0IFI(LivePlayFragment livePlayFragment) {
        this.LIZ = livePlayFragment;
    }

    @Override // X.C0IJS
    public final void LIZ(boolean z) {
        LiveExitRoomRunnableScatter liveExitRoomRunnableScatter = this.LIZ.P1;
        if (liveExitRoomRunnableScatter != null) {
            liveExitRoomRunnableScatter.onCoreMsgSent(z);
        }
    }
}
