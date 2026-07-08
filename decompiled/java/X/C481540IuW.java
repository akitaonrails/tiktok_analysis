package X;

import com.ss.android.ugc.aweme.hangout.component.interact.model.MultiTopLiveRoomMatchScene;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IuW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481540IuW extends AbstractC481570IuZ {
    public final MultiTopLiveRoomMatchScene.DownLinkRoomMatchData LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C481540IuW) && Intrinsics.LJFF(this.LIZ, ((C481540IuW) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RandomMatchFromMsgSuccess(downLinkRoomMatchData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C481540IuW(MultiTopLiveRoomMatchScene.DownLinkRoomMatchData downLinkRoomMatchData) {
        this.LIZ = downLinkRoomMatchData;
    }
}
