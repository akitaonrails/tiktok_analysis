package X;

import com.ss.android.ugc.effectmanager.effect.model.Asset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419590n2r {
    public final Asset LIZ;
    public final boolean LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1419590n2r)) {
            return false;
        }
        C1419590n2r c1419590n2r = (C1419590n2r) obj;
        return Intrinsics.LJFF(this.LIZ, c1419590n2r.LIZ) && this.LIZIZ == c1419590n2r.LIZIZ && this.LIZJ == c1419590n2r.LIZJ && this.LIZLLL == c1419590n2r.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixAsset(asset=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fromCache=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1419590n2r(Asset asset, boolean z, int i, int i2) {
        this.LIZ = asset;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
