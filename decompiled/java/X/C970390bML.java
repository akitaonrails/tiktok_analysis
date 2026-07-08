package X;

import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bML, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970390bML {
    public final Function1<C970420bMO<BattleInfoResponse>, Unit> LIZ;
    public final LiveWidget LIZIZ;
    public final LinkMicBattleArmiesMessage LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ArmiesMessageEntranceParams(dispatchCallback=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ownerWidget=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C970390bML(AwS594S0100000_15 awS594S0100000_15, LiveWidget liveWidget, LinkMicBattleArmiesMessage linkMicBattleArmiesMessage) {
        this.LIZ = awS594S0100000_15;
        this.LIZIZ = liveWidget;
        this.LIZJ = linkMicBattleArmiesMessage;
    }
}
