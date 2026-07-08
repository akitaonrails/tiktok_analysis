package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h7P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191770h7P {
    public final int LIZ;
    public final UrlModel LIZIZ;
    public final UrlModel LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1191770h7P)) {
            return false;
        }
        C1191770h7P c1191770h7P = (C1191770h7P) obj;
        return this.LIZ == c1191770h7P.LIZ && Intrinsics.LJFF(this.LIZIZ, c1191770h7P.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1191770h7P.LIZJ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        UrlModel urlModel = this.LIZIZ;
        int iHashCode = (i + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        UrlModel urlModel2 = this.LIZJ;
        return iHashCode + (urlModel2 != null ? urlModel2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LevelSpec(level=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", smallIcon=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fallbackIcon=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1191770h7P(int i, UrlModel urlModel, UrlModel urlModel2) {
        this.LIZ = i;
        this.LIZIZ = urlModel;
        this.LIZJ = urlModel2;
    }
}
