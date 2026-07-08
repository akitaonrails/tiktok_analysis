package X;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cwZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1031290cwZ extends AbstractC1891907b3 {
    public final int LIZ;
    public final View LIZIZ;
    public final Function0<Long> LIZJ;
    public final Function0<Long> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1031290cwZ)) {
            return false;
        }
        C1031290cwZ c1031290cwZ = (C1031290cwZ) obj;
        return this.LIZ == c1031290cwZ.LIZ && Intrinsics.LJFF(this.LIZIZ, c1031290cwZ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1031290cwZ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1031290cwZ.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrackStart(loop=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", adView=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", getVideoDuration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", getVideoCurrentPosition=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1031290cwZ(int i, View view, AwS560S0100000_16 awS560S0100000_16, AwS560S0100000_16 awS560S0100000_162) {
        this.LIZ = i;
        this.LIZIZ = view;
        this.LIZJ = awS560S0100000_16;
        this.LIZLLL = awS560S0100000_162;
    }
}
