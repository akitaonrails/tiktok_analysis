package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qdL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557530qdL extends AbstractC1557520qdK {
    public final GiftMode LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557530qdL)) {
            return false;
        }
        C1557530qdL c1557530qdL = (C1557530qdL) obj;
        return Intrinsics.LJFF(this.LIZ, c1557530qdL.LIZ) && this.LIZIZ == c1557530qdL.LIZIZ && this.LIZJ == c1557530qdL.LIZJ && this.LIZLLL == c1557530qdL.LIZLLL && Intrinsics.LJFF(this.LJ, c1557530qdL.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftItem(gift=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isCommunitySection=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enabled=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", stableIndex=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557530qdL(GiftMode giftMode, boolean z, boolean z2, int i, String str) {
        this.LIZ = giftMode;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = i;
        this.LJ = str;
    }
}
