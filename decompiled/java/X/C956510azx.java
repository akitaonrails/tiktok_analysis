package X;

import com.bytedance.android.live.liveinteract.match.business.event.BattleIsInTeamPairing;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0azx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C956510azx implements InterfaceC957650b1n {
    public final DataChannel LIZ;

    @Override // X.InterfaceC957650b1n
    public final boolean LIZ() {
        C962900bAG c962900bAG;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null || (c962900bAG = (C962900bAG) dataChannel.gg0(BattleIsInTeamPairing.class)) == null) {
            return false;
        }
        return c962900bAG.LIZ;
    }

    public C956510azx(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }
}
