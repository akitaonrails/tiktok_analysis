package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yiD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868070yiD extends AbstractC1868060yiC {
    public final VideoPublishEditModel LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1868070yiD) && Intrinsics.LJFF(this.LIZ, ((C1868070yiD) obj).LIZ);
    }

    public final int hashCode() {
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        if (videoPublishEditModel == null) {
            return 0;
        }
        return videoPublishEditModel.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishModel(videoPublishModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1868070yiD(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
    }
}
