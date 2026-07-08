package X;

import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08uI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2266008uI extends AbstractC1921407fo {
    public final String LIZ;
    public final long LIZIZ = 0;
    public final long LIZJ;
    public final ExtractFramesModel LIZLLL;
    public final List<String> LJ;
    public final List<String> LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2266008uI)) {
            return false;
        }
        C2266008uI c2266008uI = (C2266008uI) obj;
        return Intrinsics.LJFF(this.LIZ, c2266008uI.LIZ) && this.LIZIZ == c2266008uI.LIZIZ && this.LIZJ == c2266008uI.LIZJ && Intrinsics.LJFF(this.LIZLLL, c2266008uI.LIZLLL) && Intrinsics.LJFF(this.LJ, c2266008uI.LJ) && Intrinsics.LJFF(this.LJFF, c2266008uI.LJFF) && this.LJI == c2266008uI.LJI;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31;
        ExtractFramesModel extractFramesModel = this.LIZLLL;
        return ((((((iHashCode + (extractFramesModel == null ? 0 : extractFramesModel.hashCode())) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutModeUploadFrameTaskParam(videoPath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extractFramesModel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", videoPathList=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", imagePathList=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", videoDurationMs=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1921407fo
    public final boolean LIZ(AbstractC1921407fo abstractC1921407fo) {
        List<FrameItem> allFrames;
        if (Intrinsics.LJFF(abstractC1921407fo, this)) {
            return true;
        }
        if (!(abstractC1921407fo instanceof C2266008uI)) {
            return false;
        }
        C2266008uI c2266008uI = (C2266008uI) abstractC1921407fo;
        if (!Intrinsics.LJFF(this.LIZ, c2266008uI.LIZ) || this.LIZIZ != c2266008uI.LIZIZ) {
            return false;
        }
        ExtractFramesModel extractFramesModel = this.LIZLLL;
        List<FrameItem> allFrames2 = null;
        if (extractFramesModel != null) {
            allFrames = extractFramesModel.getAllFrames();
        } else {
            allFrames = null;
        }
        ExtractFramesModel extractFramesModel2 = c2266008uI.LIZLLL;
        if (extractFramesModel2 != null) {
            allFrames2 = extractFramesModel2.getAllFrames();
        }
        if (Intrinsics.LJFF(allFrames, allFrames2) && Intrinsics.LJFF(this.LJ, c2266008uI.LJ) && Intrinsics.LJFF(this.LJFF, c2266008uI.LJFF) && this.LJI == c2266008uI.LJI) {
            return true;
        }
        return false;
    }

    public C2266008uI(String str, long j, ExtractFramesModel extractFramesModel, List list, List list2, long j2) {
        this.LIZ = str;
        this.LIZJ = j;
        this.LIZLLL = extractFramesModel;
        this.LJ = list;
        this.LJFF = list2;
        this.LJI = j2;
    }
}
