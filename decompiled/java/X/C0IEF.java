package X;

import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LiveExitInnerFeedCardWidget;
import com.bytedance.android.livesdk.dataChannel.GoLiveCardShowing;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0IEF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IEF {
    public boolean LIZ;
    public final C463360IFa LIZIZ = new C1APY() { // from class: X.0IFa
        @Override // X.C1APY
        public final void isMute() {
        }

        @Override // X.C1APY
        public final boolean LIZ(boolean z) {
            return this.LIZ.LIZ;
        }
    };
    public final /* synthetic */ ILiveNewStyleCardWidget LIZJ;
    public final /* synthetic */ LivePlayFragment LIZLLL;

    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCardShow: fragment hs = ");
        sbLIZ.append(this.LIZLLL.hashCode());
        C827750WdZ.LIZJ("LivePlayFragment", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ = true;
        C0IEB c0ieb = this.LIZLLL.LLLFZ;
        if (c0ieb != null) {
            c0ieb.registerMuteFilter(this.LIZIZ);
            this.LIZLLL.LLLFZ.setMuteNew(true, "show extra card");
        }
        DataChannel dataChannel = this.LIZLLL.y;
        if (dataChannel != null) {
            dataChannel.zW(GoLiveCardShowing.class, Boolean.TRUE);
        }
        if (this.LIZJ instanceof LiveExitInnerFeedCardWidget) {
            this.LIZLLL.AU().bc();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0IFa] */
    public C0IEF(LivePlayFragment livePlayFragment, ILiveNewStyleCardWidget iLiveNewStyleCardWidget) {
        this.LIZLLL = livePlayFragment;
        this.LIZJ = iLiveNewStyleCardWidget;
    }
}
