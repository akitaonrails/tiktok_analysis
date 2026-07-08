package X;

import android.util.Size;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05WK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05WK {
    public final String LIZ;
    public final String LIZIZ;
    public final List<C05WE> LIZJ;
    public final Size LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C05WK)) {
            return false;
        }
        C05WK c05wk = (C05WK) obj;
        return Intrinsics.LJFF(this.LIZ, c05wk.LIZ) && Intrinsics.LJFF(this.LIZIZ, c05wk.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c05wk.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c05wk.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        Size size = this.LIZLLL;
        return iHashCode + (size == null ? 0 : size.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricStickerEffectDownloadResult(effectId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dep=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", recommendSize=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C05WK(String str, String str2, List<C05WE> list, Size size) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
        this.LIZLLL = size;
    }
}
