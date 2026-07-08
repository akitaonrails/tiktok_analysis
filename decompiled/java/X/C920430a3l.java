package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCancelApplyParams;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a3l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920430a3l {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final BizCancelApplyParams LIZLLL;
    public final Map<String, Object> LJ;

    public C920430a3l() {
        this(null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C920430a3l)) {
            return false;
        }
        C920430a3l c920430a3l = (C920430a3l) obj;
        return this.LIZ == c920430a3l.LIZ && this.LIZIZ == c920430a3l.LIZIZ && Intrinsics.LJFF(this.LIZJ, c920430a3l.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c920430a3l.LIZLLL) && Intrinsics.LJFF(this.LJ, c920430a3l.LJ);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        BizCancelApplyParams bizCancelApplyParams = this.LIZLLL;
        int iHashCode2 = (iHashCode + (bizCancelApplyParams == null ? 0 : bizCancelApplyParams.hashCode())) * 31;
        Map<String, Object> map = this.LJ;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CancelApplyParam(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bizCancelApplyParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", custom=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C920430a3l(BizCancelApplyParams bizCancelApplyParams, int i) {
        long j;
        if ((i & 1) != 0) {
            j = -1;
        } else {
            j = 0;
        }
        long j2 = (i & 2) != 0 ? -1L : 0L;
        bizCancelApplyParams = (i & 8) != 0 ? null : bizCancelApplyParams;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = null;
        this.LIZLLL = bizCancelApplyParams;
        this.LJ = null;
    }
}
