package X;

import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SLw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719940SLw {
    public final int LIZ;
    public final PhotoModeImageUrlModel LIZIZ;
    public final VideoItemParams LIZJ;
    public final C0SM0 LIZLLL;
    public final int LJ;
    public final Boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C719940SLw)) {
            return false;
        }
        C719940SLw c719940SLw = (C719940SLw) obj;
        return this.LIZ == c719940SLw.LIZ && Intrinsics.LJFF(this.LIZIZ, c719940SLw.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c719940SLw.LIZJ) && this.LIZLLL == c719940SLw.LIZLLL && this.LJ == c719940SLw.LJ && Intrinsics.LJFF(this.LJFF, c719940SLw.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31;
        VideoItemParams videoItemParams = this.LIZJ;
        int iHashCode2 = (((((iHashCode + (videoItemParams == null ? 0 : videoItemParams.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ) * 31;
        Boolean bool = this.LJFF;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageLoadParam(position=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", photoModel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", itemParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", photoModePlaceholderType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", blurHashHeight=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isOriginal=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C719940SLw(int i, PhotoModeImageUrlModel photoModeImageUrlModel, VideoItemParams videoItemParams, C0SM0 c0sm0, int i2, Boolean bool) {
        this.LIZ = i;
        this.LIZIZ = photoModeImageUrlModel;
        this.LIZJ = videoItemParams;
        this.LIZLLL = c0sm0;
        this.LJ = i2;
        this.LJFF = bool;
    }
}
