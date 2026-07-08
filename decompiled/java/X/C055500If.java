package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinResult;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: renamed from: X.00If, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C055500If {
    public final EnumC925940aCe LIZ;
    public final Long LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final List<SpotInfo> LJ;
    public final PerceptionMessage LJFF;
    public final PerceptionMessage LJI;
    public final ApplyResult LJII;
    public final DirectJoinResult LJIIIIZZ;

    public C055500If() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C055500If)) {
            return false;
        }
        C055500If c055500If = (C055500If) obj;
        return this.LIZ == c055500If.LIZ && Intrinsics.LJFF(this.LIZIZ, c055500If.LIZIZ) && this.LIZJ == c055500If.LIZJ && this.LIZLLL == c055500If.LIZLLL && Intrinsics.LJFF(this.LJ, c055500If.LJ) && Intrinsics.LJFF(this.LJFF, c055500If.LJFF) && Intrinsics.LJFF(this.LJI, c055500If.LJI) && Intrinsics.LJFF(this.LJII, c055500If.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c055500If.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Long l = this.LIZIZ;
        int iHashCode2 = (((((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        List<SpotInfo> list = this.LJ;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        PerceptionMessage perceptionMessage = this.LJFF;
        int iHashCode4 = (iHashCode3 + (perceptionMessage == null ? 0 : perceptionMessage.hashCode())) * 31;
        PerceptionMessage perceptionMessage2 = this.LJI;
        int iHashCode5 = (iHashCode4 + (perceptionMessage2 == null ? 0 : perceptionMessage2.hashCode())) * 31;
        ApplyResult applyResult = this.LJII;
        int iHashCode6 = (iHashCode5 + (applyResult == null ? 0 : applyResult.hashCode())) * 31;
        DirectJoinResult directJoinResult = this.LJIIIIZZ;
        return iHashCode6 + (directJoinResult != null ? directJoinResult.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JoinResult(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", linkTypePermission=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", layoutTypeAction=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fixMicNumAction=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", spotList=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", perceptionInfo=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", hostPerceptionInfo=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", rawApply=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", rawDirectJoin=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C055500If(EnumC925940aCe enumC925940aCe, Long l, int i, int i2, List list, PerceptionMessage perceptionMessage, PerceptionMessage perceptionMessage2, ApplyResult applyResult, DirectJoinResult directJoinResult, int i3) {
        l = (i3 & 2) != 0 ? null : l;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        list = (i3 & 16) != 0 ? null : list;
        perceptionMessage = (i3 & 32) != 0 ? null : perceptionMessage;
        perceptionMessage2 = (i3 & 64) != 0 ? null : perceptionMessage2;
        applyResult = (i3 & 128) != 0 ? null : applyResult;
        directJoinResult = (i3 & 256) != 0 ? null : directJoinResult;
        this.LIZ = enumC925940aCe;
        this.LIZIZ = l;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = list;
        this.LJFF = perceptionMessage;
        this.LJI = perceptionMessage2;
        this.LJII = applyResult;
        this.LJIIIIZZ = directJoinResult;
    }
}
