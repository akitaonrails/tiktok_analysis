package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PZ7, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PZ7 implements IEvent {
    public final LiveRoomStruct LIZ;
    public final ArrayList<LiveRoomStruct> LIZIZ;
    public final long LIZJ;
    public final EnterRoomConfig LIZLLL;
    public final Boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PZ7)) {
            return false;
        }
        C0PZ7 c0pz7 = (C0PZ7) obj;
        return Intrinsics.LJFF(this.LIZ, c0pz7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0pz7.LIZIZ) && this.LIZJ == c0pz7.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0pz7.LIZLLL) && Intrinsics.LJFF(this.LJ, c0pz7.LJ);
    }

    public final int hashCode() {
        LiveRoomStruct liveRoomStruct = this.LIZ;
        int iHashCode = (liveRoomStruct == null ? 0 : liveRoomStruct.hashCode()) * 31;
        ArrayList<LiveRoomStruct> arrayList = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31;
        EnterRoomConfig enterRoomConfig = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (enterRoomConfig == null ? 0 : enterRoomConfig.hashCode())) * 31;
        Boolean bool = this.LJ;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnterLiveRoomEvent(curRawData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rawDataList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", startCursor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", config=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0PZ7(LiveRoomStruct liveRoomStruct, ArrayList<LiveRoomStruct> arrayList, long j, EnterRoomConfig enterRoomConfig, Boolean bool) {
        this.LIZ = liveRoomStruct;
        this.LIZIZ = arrayList;
        this.LIZJ = j;
        this.LIZLLL = enterRoomConfig;
        this.LJ = bool;
    }
}
