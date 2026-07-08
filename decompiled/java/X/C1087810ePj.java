package X;

import android.content.Context;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ePj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087810ePj {
    public final long LIZ;
    public final ImageModel LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final Function1<Context, Unit> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1087810ePj)) {
            return false;
        }
        C1087810ePj c1087810ePj = (C1087810ePj) obj;
        return this.LIZ == c1087810ePj.LIZ && Intrinsics.LJFF(this.LIZIZ, c1087810ePj.LIZIZ) && this.LIZJ == c1087810ePj.LIZJ && this.LIZLLL == c1087810ePj.LIZLLL && this.LJ == c1087810ePj.LJ && this.LJFF == c1087810ePj.LJFF && Intrinsics.LJFF(this.LJI, c1087810ePj.LJI);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LIZ) * 31;
        ImageModel imageModel = this.LIZIZ;
        return ((((((((((iY2 + (imageModel == null ? 0 : imageModel.hashCode())) * 31) + this.LIZJ) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VirtualTicketCrossRoomIconAttachData(anchorId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cardImage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", countdownSec=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", expireAtSec=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", envelopeId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", targetRoomId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1087810ePj(long j, ImageModel imageModel, int i, long j2, long j3, long j4, C1104810er9 c1104810er9) {
        this.LIZ = j;
        this.LIZIZ = imageModel;
        this.LIZJ = i;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = j4;
        this.LJI = c1104810er9;
    }
}
