package X;

import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qg6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559240qg6 {
    public final List<C1573150r2X> LIZ;
    public final List<C1573150r2X> LIZIZ;
    public final SeriesCenterCenterScene LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1559240qg6)) {
            return false;
        }
        C1559240qg6 c1559240qg6 = (C1559240qg6) obj;
        return Intrinsics.LJFF(this.LIZ, c1559240qg6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1559240qg6.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1559240qg6.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        SeriesCenterCenterScene seriesCenterCenterScene = this.LIZJ;
        return iHashCode + (seriesCenterCenterScene == null ? 0 : seriesCenterCenterScene.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProcessedSeriesCenterResult(items=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", safeItems=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1559240qg6(List<C1573150r2X> list, List<C1573150r2X> list2, SeriesCenterCenterScene seriesCenterCenterScene) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = seriesCenterCenterScene;
    }
}
