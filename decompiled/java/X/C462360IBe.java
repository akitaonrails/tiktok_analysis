package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IBe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462360IBe {
    public final UrlModel LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C462360IBe)) {
            return false;
        }
        C462360IBe c462360IBe = (C462360IBe) obj;
        return Intrinsics.LJFF(this.LIZ, c462360IBe.LIZ) && Intrinsics.LJFF(this.LIZIZ, c462360IBe.LIZIZ) && this.LIZJ == c462360IBe.LIZJ && this.LIZLLL == c462360IBe.LIZLLL && this.LJ == c462360IBe.LJ;
    }

    public final int hashCode() {
        UrlModel urlModel = this.LIZ;
        return ((((((((urlModel == null ? 0 : urlModel.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareRepostTitleUIState(avatar=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", authorName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", textFont=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", bottomMargin=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C462360IBe(UrlModel urlModel, String str, int i, int i2, int i3) {
        this.LIZ = urlModel;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
    }
}
