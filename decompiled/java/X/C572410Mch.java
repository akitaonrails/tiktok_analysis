package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Mch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572410Mch {
    public final String LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final CreativeInfo LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C572410Mch)) {
            return false;
        }
        C572410Mch c572410Mch = (C572410Mch) obj;
        return Intrinsics.LJFF(this.LIZ, c572410Mch.LIZ) && Intrinsics.LJFF(this.LIZIZ, c572410Mch.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c572410Mch.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c572410Mch.LIZLLL) && Intrinsics.LJFF(this.LJ, c572410Mch.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SynthesisResult(filePath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", editModel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", creativeInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hintByAi=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", textByAi=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        String str = this.LJ;
        return !(str == null || a0.LJJJIL(str));
    }

    public C572410Mch(String str, VideoPublishEditModel videoPublishEditModel, CreativeInfo creativeInfo, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = creativeInfo;
        this.LIZLLL = str2;
        this.LJ = str3;
    }
}
