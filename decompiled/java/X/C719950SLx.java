package X;

import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SLx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719950SLx implements InterfaceC1587906Jp {
    public final int LL;
    public final PhotoModeImageUrlModel LLILLJJLI;
    public final VideoItemParams LLILLL;
    public final C0SFT LLILZ;
    public final Boolean LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C719950SLx)) {
            return false;
        }
        C719950SLx c719950SLx = (C719950SLx) obj;
        return this.LL == c719950SLx.LL && Intrinsics.LJFF(this.LLILLJJLI, c719950SLx.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c719950SLx.LLILLL) && Intrinsics.LJFF(this.LLILZ, c719950SLx.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c719950SLx.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31;
        VideoItemParams videoItemParams = this.LLILLL;
        int iHashCode2 = (iHashCode + (videoItemParams == null ? 0 : videoItemParams.hashCode())) * 31;
        C0SFT c0sft = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (c0sft == null ? 0 : c0sft.hashCode())) * 31;
        Boolean bool = this.LLILZIL;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BindData(position=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", photoModel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", param=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", descriptionComponents=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isOriginal=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C719950SLx(int i, PhotoModeImageUrlModel photoModeImageUrlModel, VideoItemParams videoItemParams, C0SFT c0sft, Boolean bool) {
        this.LL = i;
        this.LLILLJJLI = photoModeImageUrlModel;
        this.LLILLL = videoItemParams;
        this.LLILZ = c0sft;
        this.LLILZIL = bool;
    }
}
