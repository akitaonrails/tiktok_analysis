package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IPx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C466190IPx {
    public final BaseResponse<Room, EnterRoomExtra> LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C466190IPx)) {
            return false;
        }
        C466190IPx c466190IPx = (C466190IPx) obj;
        return Intrinsics.LJFF(this.LIZ, c466190IPx.LIZ) && this.LIZIZ == c466190IPx.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickReturnRoomCacheInfo(room=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cachedTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C466190IPx(long j, BaseResponse baseResponse) {
        this.LIZ = baseResponse;
        this.LIZIZ = j;
    }
}
