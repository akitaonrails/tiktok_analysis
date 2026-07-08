package X;

import com.ss.android.ugc.aweme.aikit.api.create.generation.AICreateBusinessExtra;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LcP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546750LcP {
    public final InterfaceC546090LbL LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final AIGCCreationModel LIZLLL;
    public final AICreateBusinessExtra LJ;
    public final Map<String, String> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C546750LcP)) {
            return false;
        }
        C546750LcP c546750LcP = (C546750LcP) obj;
        return Intrinsics.LJFF(this.LIZ, c546750LcP.LIZ) && Intrinsics.LJFF(this.LIZIZ, c546750LcP.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c546750LcP.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c546750LcP.LIZLLL) && Intrinsics.LJFF(this.LJ, c546750LcP.LJ) && Intrinsics.LJFF(this.LJFF, c546750LcP.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        AICreateBusinessExtra aICreateBusinessExtra = this.LJ;
        int iHashCode2 = (iHashCode + (aICreateBusinessExtra == null ? 0 : aICreateBusinessExtra.hashCode())) * 31;
        Map<String, String> map = this.LJFF;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCCreateParam(aigcBusinessKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", jobType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", aigcCreationModel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", businessExtra=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", bizExtra=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C546750LcP(InterfaceC546090LbL interfaceC546090LbL, String str, String str2, AITheaterCreationModel aITheaterCreationModel, AICreateBusinessExtra aICreateBusinessExtra, Map map) {
        this.LIZ = interfaceC546090LbL;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = aITheaterCreationModel;
        this.LJ = aICreateBusinessExtra;
        this.LJFF = map;
    }
}
