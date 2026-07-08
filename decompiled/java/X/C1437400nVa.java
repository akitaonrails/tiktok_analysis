package X;

import com.ss.android.ugc.aweme.creative.compileconfig.CompileConfigLevelStruct;
import java.util.List;

/* JADX INFO: renamed from: X.0nVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1437400nVa {
    public C1437340nVU LIZ = null;
    public C1437420nVc LIZIZ = null;
    public C1437430nVd LIZJ = null;
    public C1437360nVW LIZLLL = null;
    public C1437410nVb LJ = new C1437410nVb();
    public C1440140na0 LJFF = new C1440140na0();

    public final List<AbstractC1439960nZi> LIZIZ() {
        C1437430nVd c1437430nVd = this.LIZJ;
        if (c1437430nVd != null) {
            return c1437430nVd.LIZ;
        }
        return null;
    }

    public final int[] LIZ(boolean z) {
        Integer numValueOf;
        CompileConfigLevelStruct<int[]> compileConfigLevelStruct;
        int[] iArr;
        CompileConfigLevelStruct<int[]> compileConfigLevelStruct2;
        int[] iArr2;
        C1424160nAE c1424160nAE = C1424160nAE.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("settingResult.highQualityCompileSize = [");
        int[] iArr3 = this.LJ.LJ;
        Integer numValueOf2 = null;
        if (iArr3 != null) {
            numValueOf = Integer.valueOf(iArr3[0]);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", ");
        int[] iArr4 = this.LJ.LJ;
        if (iArr4 != null) {
            numValueOf2 = Integer.valueOf(iArr4[1]);
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append(']');
        C201955140j.LIZJ(c1424160nAE, C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C1437420nVc c1437420nVc = this.LIZIZ;
            if (c1437420nVc == null || (compileConfigLevelStruct2 = c1437420nVc.LIZLLL) == null || (iArr2 = compileConfigLevelStruct2.hd) == null) {
                return this.LJ.LJ;
            }
            return iArr2;
        }
        C1437420nVc c1437420nVc2 = this.LIZIZ;
        if (c1437420nVc2 != null && (compileConfigLevelStruct = c1437420nVc2.LIZLLL) != null && (iArr = compileConfigLevelStruct.f53default) != null) {
            return iArr;
        }
        return this.LJ.LIZLLL;
    }
}
