package X;

import com.bytedance.android.live.liveinteract.match.business.event.BattleIsInTeamPairing;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0azu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C956480azu implements InterfaceC957660b1o {
    public final DataChannel LIZ;

    @Override // X.InterfaceC957660b1o
    public final boolean LIZ() {
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null) {
            return false;
        }
        C20441214yg.LJIIIZ("MatchTeamPairStatusUpdaterImpl", "Set isInTeamPair to false");
        dataChannel.zW(BattleIsInTeamPairing.class, new C962900bAG(false, true, false));
        return true;
    }

    public C956480azu(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }
}
