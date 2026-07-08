package X;

import com.ss.android.ugc.aweme.ad.comment.reviewtab.model.ConvertInfo;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.model.Review;
import java.util.List;

/* JADX INFO: renamed from: X.0y5N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1843990y5N extends AbstractC1843960y5K {
    public final List<Review> LIZ;
    public final boolean LIZIZ;
    public final ConvertInfo LIZJ;

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        ConvertInfo convertInfo = this.LIZJ;
        return iHashCode + (convertInfo == null ? 0 : convertInfo.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Reviews(reviews=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enablePublish=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", convertInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1843990y5N(List<Review> list, boolean z, ConvertInfo convertInfo) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = convertInfo;
    }
}
