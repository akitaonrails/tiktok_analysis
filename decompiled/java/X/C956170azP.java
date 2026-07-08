package X;

import com.bytedance.android.live.liveinteract.match.business.event.BattleIsInTeamPairing;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0azP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C956170azP {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(DataChannel dataChannel) {
        C962900bAG c962900bAG;
        if (dataChannel == null || (c962900bAG = (C962900bAG) dataChannel.gg0(BattleIsInTeamPairing.class)) == null || !c962900bAG.LIZ || !c962900bAG.LIZJ) {
            return false;
        }
        return true;
    }
}
