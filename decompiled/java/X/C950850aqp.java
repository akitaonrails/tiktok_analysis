package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aqp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950850aqp {
    public final long LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final BizReplyParams LIZLLL;
    public final long LJ;
    public final Map<String, Object> LJFF;

    public C950850aqp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C950850aqp)) {
            return false;
        }
        C950850aqp c950850aqp = (C950850aqp) obj;
        return this.LIZ == c950850aqp.LIZ && this.LIZIZ == c950850aqp.LIZIZ && this.LIZJ == c950850aqp.LIZJ && Intrinsics.LJFF(this.LIZLLL, c950850aqp.LIZLLL) && this.LJ == c950850aqp.LJ && Intrinsics.LJFF(this.LJFF, c950850aqp.LJFF);
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ) * 31;
        BizReplyParams bizReplyParams = this.LIZLLL;
        int iHashCode = (((iY2 + (bizReplyParams == null ? 0 : bizReplyParams.hashCode())) * 31) + C786410Ut5.Y2(this.LJ)) * 31;
        Map<String, Object> map = this.LJFF;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReplyInviteParam(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", replyStatus=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bizReplyParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", inviteOperatorUid=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", cohostCustom=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C950850aqp(long j, long j2, int i, BizReplyParams bizReplyParams, long j3, int i2) {
        bizReplyParams = (i2 & 8) != 0 ? null : bizReplyParams;
        j3 = (i2 & 16) != 0 ? 0L : j3;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = i;
        this.LIZLLL = bizReplyParams;
        this.LJ = j3;
        this.LJFF = null;
    }
}
