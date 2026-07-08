package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01BH, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01BH {
    public final long LIZ;
    public final long LIZIZ;
    public final ImageModel LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C01BH)) {
            return false;
        }
        C01BH c01bh = (C01BH) obj;
        return this.LIZ == c01bh.LIZ && this.LIZIZ == c01bh.LIZIZ && Intrinsics.LJFF(this.LIZJ, c01bh.LIZJ);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        ImageModel imageModel = this.LIZJ;
        return iY2 + (imageModel == null ? 0 : imageModel.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionContributor(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", score=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", avatarUrls=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C01BH(long j, long j2, ImageModel imageModel) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = imageModel;
    }
}
