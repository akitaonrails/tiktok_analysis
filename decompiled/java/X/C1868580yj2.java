package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yj2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868580yj2 extends AbstractC1868600yj4 {
    public final String LIZ;
    public final VideoPublishEditModel LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868580yj2)) {
            return false;
        }
        C1868580yj2 c1868580yj2 = (C1868580yj2) obj;
        return Intrinsics.LJFF(this.LIZ, c1868580yj2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1868580yj2.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        VideoPublishEditModel videoPublishEditModel = this.LIZIZ;
        return iHashCode + (videoPublishEditModel == null ? 0 : videoPublishEditModel.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LaunchPhotoModal(enterFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", model=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1868580yj2(VideoPublishEditModel videoPublishEditModel, String str) {
        this.LIZ = str;
        this.LIZIZ = videoPublishEditModel;
    }
}
