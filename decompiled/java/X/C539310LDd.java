package X;

import com.ss.android.ugc.aweme.aigc.asynctask.CompositionMediaItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LDd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C539310LDd extends C09JG {
    public final List<CompositionMediaItem> LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL = 2000;
    public final int LJ = 960;
    public final int LJFF = 540;
    public final int LJI = 1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C539310LDd)) {
            return false;
        }
        C539310LDd c539310LDd = (C539310LDd) obj;
        return Intrinsics.LJFF(this.LIZ, c539310LDd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c539310LDd.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c539310LDd.LIZJ) && this.LIZLLL == c539310LDd.LIZLLL && this.LJ == c539310LDd.LJ && this.LJFF == c539310LDd.LJFF && this.LJI == c539310LDd.LJI;
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SummaryCompositionTaskInput(mediaItems=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", outputDir=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", imageDurationMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", targetWidth=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", targetHeight=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", targetFps=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C539310LDd(List list, String str, String str2) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
