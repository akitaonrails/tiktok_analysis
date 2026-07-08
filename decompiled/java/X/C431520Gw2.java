package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gw2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431520Gw2 {
    public final int LIZ = 2131848135;
    public final String LIZIZ;
    public final UrlModel LIZJ;
    public final Integer LIZLLL;
    public final Long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C431520Gw2)) {
            return false;
        }
        C431520Gw2 c431520Gw2 = (C431520Gw2) obj;
        return this.LIZ == c431520Gw2.LIZ && Intrinsics.LJFF(this.LIZIZ, c431520Gw2.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c431520Gw2.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c431520Gw2.LIZLLL) && Intrinsics.LJFF(this.LJ, c431520Gw2.LJ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        UrlModel urlModel = this.LIZJ;
        int iHashCode2 = (iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.LJ;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesVipHeaderUiState(titleRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", badge=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", backgroundImg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", statusTextRes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", statusTimeSec=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C431520Gw2(String str, UrlModel urlModel, Integer num, Long l) {
        this.LIZIZ = str;
        this.LIZJ = urlModel;
        this.LIZLLL = num;
        this.LJ = l;
    }
}
