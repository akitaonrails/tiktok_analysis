package X;

import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0US4, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0US4 {
    public final C470590Icr<RoomCreateInfo> LIZ;
    public final C470590Icr<LivePermissionApplyResponse> LIZIZ;
    public final C470590Icr<BroadcastSettingResponse> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0US4)) {
            return false;
        }
        C0US4 c0us4 = (C0US4) obj;
        return Intrinsics.LJFF(this.LIZ, c0us4.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0us4.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0us4.LIZJ);
    }

    public final int hashCode() {
        C470590Icr<RoomCreateInfo> c470590Icr = this.LIZ;
        int iHashCode = (c470590Icr == null ? 0 : c470590Icr.hashCode()) * 31;
        C470590Icr<LivePermissionApplyResponse> c470590Icr2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c470590Icr2 == null ? 0 : c470590Icr2.hashCode())) * 31;
        C470590Icr<BroadcastSettingResponse> c470590Icr3 = this.LIZJ;
        return iHashCode2 + (c470590Icr3 != null ? c470590Icr3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ZippedResponse(roomCreateInfoRsp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", livePermissionApplyRsp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", broadcastSettingRsp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0US4(C470590Icr<RoomCreateInfo> c470590Icr, C470590Icr<LivePermissionApplyResponse> c470590Icr2, C470590Icr<BroadcastSettingResponse> c470590Icr3) {
        this.LIZ = c470590Icr;
        this.LIZIZ = c470590Icr2;
        this.LIZJ = c470590Icr3;
    }
}
