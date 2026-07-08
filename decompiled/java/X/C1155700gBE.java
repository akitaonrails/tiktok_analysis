package X;

import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.Material;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155700gBE {
    public final int LIZ;
    public final Material LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155700gBE)) {
            return false;
        }
        C1155700gBE c1155700gBE = (C1155700gBE) obj;
        return this.LIZ == c1155700gBE.LIZ && Intrinsics.LJFF(this.LIZIZ, c1155700gBE.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IndexedMaterial(originalIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", material=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155700gBE(int i, Material material) {
        this.LIZ = i;
        this.LIZIZ = material;
    }
}
