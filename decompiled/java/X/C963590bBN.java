package X;

import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bBN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963590bBN {
    public final LinkMicBattleMessage LIZ;
    public final BattleInfoResponse LIZIZ;

    public C963590bBN() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C963590bBN)) {
            return false;
        }
        C963590bBN c963590bBN = (C963590bBN) obj;
        return Intrinsics.LJFF(this.LIZ, c963590bBN.LIZ) && Intrinsics.LJFF(this.LIZIZ, c963590bBN.LIZIZ);
    }

    public final int hashCode() {
        LinkMicBattleMessage linkMicBattleMessage = this.LIZ;
        int iHashCode = (linkMicBattleMessage == null ? 0 : linkMicBattleMessage.hashCode()) * 31;
        BattleInfoResponse battleInfoResponse = this.LIZIZ;
        return iHashCode + (battleInfoResponse != null ? battleInfoResponse.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxMatchSourcePayload(triggerMessage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", triggerBattleInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C963590bBN(LinkMicBattleMessage linkMicBattleMessage, BattleInfoResponse battleInfoResponse) {
        this.LIZ = linkMicBattleMessage;
        this.LIZIZ = battleInfoResponse;
    }
}
