package X;

import com.bytedance.android.live.liveinteract.api.QuickStartRequestEvent;
import com.bytedance.android.live.liveinteract.match.model.BattleQuickStartRequest;
import com.bytedance.android.live.liveinteract.match.model.BattleQuickStartResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0b3l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958870b3l implements InterfaceC963680bBW {
    public final DataChannel LIZ;
    public final InterfaceC954310awP LIZIZ;

    @Override // X.InterfaceC963680bBW
    public final void LIZ(BattleQuickStartResponse.ResponseData responseData) {
    }

    @Override // X.InterfaceC963680bBW
    public final void onFailure(Throwable th) {
    }

    public C958870b3l(DataChannel dataChannel) {
        C0TW8 c0tw8 = C0TW8.LIZ;
        this.LIZ = dataChannel;
        this.LIZIZ = c0tw8;
    }

    @Override // X.InterfaceC963680bBW
    public final void LIZIZ(BattleQuickStartRequest battleQuickStartRequest) {
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null) {
            this.LIZIZ.e("QuickBattleQuickStartBroadcaster", "channel is null");
            return;
        }
        InterfaceC954310awP interfaceC954310awP = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Post event, battleId=");
        sbLIZ.append(battleQuickStartRequest.battleId);
        sbLIZ.append(", scene=");
        sbLIZ.append(battleQuickStartRequest.quickStartScene);
        interfaceC954310awP.d("QuickBattleQuickStartBroadcaster", C2188811AlT.LIZIZ(sbLIZ));
        dataChannel.LC0(QuickStartRequestEvent.class, new C975350bUL(battleQuickStartRequest.battleId, battleQuickStartRequest.quickStartScene));
    }
}
