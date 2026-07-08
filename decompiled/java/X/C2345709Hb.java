package X;

import com.ss.android.ugc.aweme.ecommerce.chunk.EcomParallelChunkPreferModel;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09Hb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2345709Hb {
    public final EcomParallelChunkPreferModel LIZ;
    public final String[] LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2345709Hb)) {
            return false;
        }
        C2345709Hb c2345709Hb = (C2345709Hb) obj;
        return Intrinsics.LJFF(this.LIZ, c2345709Hb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2345709Hb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2345709Hb.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + Arrays.hashCode(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreferRuleModel(rule=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pathSegments=");
        sbLIZ.append(Arrays.toString(this.LIZIZ));
        sbLIZ.append(", ruleKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2345709Hb(EcomParallelChunkPreferModel ecomParallelChunkPreferModel, String[] strArr, String str) {
        this.LIZ = ecomParallelChunkPreferModel;
        this.LIZIZ = strArr;
        this.LIZJ = str;
    }
}
