package X;

import com.bytedance.android.live.liveinteract.api.InteractUnifiedStateChangeChannel;
import com.bytedance.android.live.liveinteract.api.event.LinkStateForH5Event;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0afK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C943720afK {
    public boolean LIZ;
    public final /* synthetic */ LinkControlWidget LIZIZ;

    public C943720afK(LinkControlWidget linkControlWidget) {
        this.LIZIZ = linkControlWidget;
    }

    public final void LIZ(boolean z) {
        if (this.LIZ == z) {
            return;
        }
        this.LIZ = z;
        String strM1 = this.LIZIZ.M1(1113);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("multi-guest state: ");
        sbLIZ.append(z);
        C1AZW.LJIIIIZZ(strM1, C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            this.LIZIZ.dataChannel.LC0(LinkStateForH5Event.class, new C782680Un4("multi_guest"));
            C914630ZuP.LIZ = "multi_guest";
        } else {
            this.LIZIZ.dataChannel.LC0(LinkStateForH5Event.class, new C782680Un4("normal"));
            C914630ZuP.LIZ = "normal";
        }
        DataChannel dataChannel = this.LIZIZ.dataChannel;
        if (dataChannel != null) {
            if (z) {
                dataChannel.zW(InteractUnifiedStateChangeChannel.class, new C974320bSg("guest", true, ""));
            } else {
                dataChannel.zW(InteractUnifiedStateChangeChannel.class, new C974320bSg("guest", false, ""));
            }
        }
    }
}
