package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05Dz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1318505Dz {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final Bitmap LIZJ;
    public final Bitmap LIZLLL;
    public final String LJ;
    public final UrlModel LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1318505Dz)) {
            return false;
        }
        C1318505Dz c1318505Dz = (C1318505Dz) obj;
        return Intrinsics.LJFF(this.LIZ, c1318505Dz.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1318505Dz.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1318505Dz.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1318505Dz.LIZLLL) && Intrinsics.LJFF(this.LJ, c1318505Dz.LJ) && Intrinsics.LJFF(this.LJFF, c1318505Dz.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UrlModel urlModel = this.LJFF;
        return iHashCode2 + (urlModel != null ? urlModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TryOnParam(query=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tagList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", selectedPictBitmap=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bigPictBitmap=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", detailPictUri=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", detailPictUrl=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1318505Dz(String str, List<String> list, Bitmap bitmap, Bitmap bitmap2, String str2, UrlModel urlModel) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = bitmap;
        this.LIZLLL = bitmap2;
        this.LJ = str2;
        this.LJFF = urlModel;
        if (str.length() > 0) {
            if (!list.isEmpty()) {
                return;
            }
            "TryOnParam.tagList must not be empty".toString();
            throw new IllegalArgumentException("TryOnParam.tagList must not be empty");
        }
        "TryOnParam.query must not be empty".toString();
        throw new IllegalArgumentException("TryOnParam.query must not be empty");
    }
}
