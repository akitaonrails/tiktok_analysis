package X;

import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SMi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720060SMi {
    public final List<PhotoModeImage> LIZ;
    public final PhotoModeImage LIZIZ;
    public final PhotoModeImage LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C720060SMi)) {
            return false;
        }
        C720060SMi c720060SMi = (C720060SMi) obj;
        return Intrinsics.LJFF(this.LIZ, c720060SMi.LIZ) && Intrinsics.LJFF(this.LIZIZ, c720060SMi.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c720060SMi.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageInfo(images=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", minAspectRatioImage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", maxAspectRatioImage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C720060SMi(List<PhotoModeImage> list, PhotoModeImage photoModeImage, PhotoModeImage photoModeImage2) {
        this.LIZ = list;
        this.LIZIZ = photoModeImage;
        this.LIZJ = photoModeImage2;
    }
}
