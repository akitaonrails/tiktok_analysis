package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizPermitParams;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a3j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920410a3j {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final BizPermitParams LJFF;
    public final Map<String, Object> LJI;

    public C920410a3j() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C920410a3j)) {
            return false;
        }
        C920410a3j c920410a3j = (C920410a3j) obj;
        return this.LIZ == c920410a3j.LIZ && this.LIZIZ == c920410a3j.LIZIZ && Intrinsics.LJFF(this.LIZJ, c920410a3j.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c920410a3j.LIZLLL) && this.LJ == c920410a3j.LJ && Intrinsics.LJFF(this.LJFF, c920410a3j.LJFF) && Intrinsics.LJFF(this.LJI, c920410a3j.LJI);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        int iHashCode = (((((iY2 + (str == null ? 0 : str.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ) * 31;
        BizPermitParams bizPermitParams = this.LJFF;
        int iHashCode2 = (iHashCode + (bizPermitParams == null ? 0 : bizPermitParams.hashCode())) * 31;
        Map<String, Object> map = this.LJI;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PermitApplyParam(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", layoutId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", linkMicId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", permitStatus=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", bizPermitParams=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", custom=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C920410a3j(long j, long j2, String str, String str2, int i, BizPermitParams bizPermitParams, int i2) {
        str = (i2 & 4) != 0 ? null : str;
        str2 = (i2 & 8) != 0 ? "" : str2;
        bizPermitParams = (i2 & 32) != 0 ? null : bizPermitParams;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = i;
        this.LJFF = bizPermitParams;
        this.LJI = null;
    }
}
