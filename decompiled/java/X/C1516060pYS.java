package X;

import com.ss.android.ugc.aweme.ecommerce.chunk.EcomParallelChunkPreferModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pYS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516060pYS {
    public final EcomParallelChunkPreferModel LIZ;
    public final EnumC1516210pYh LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1516060pYS)) {
            return false;
        }
        C1516060pYS c1516060pYS = (C1516060pYS) obj;
        return Intrinsics.LJFF(this.LIZ, c1516060pYS.LIZ) && this.LIZIZ == c1516060pYS.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1516060pYS.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatchRuleModel(rule=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ruleType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", ruleKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1516060pYS(EcomParallelChunkPreferModel ecomParallelChunkPreferModel, EnumC1516210pYh enumC1516210pYh, String str) {
        this.LIZ = ecomParallelChunkPreferModel;
        this.LIZIZ = enumC1516210pYh;
        this.LIZJ = str;
    }
}
