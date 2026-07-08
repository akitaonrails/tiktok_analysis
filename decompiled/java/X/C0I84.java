package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I84, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I84 implements C0I8P {
    public final UrlModel LIZ;
    public final C0I8V LIZIZ;
    public final C0I8A LIZJ;
    public final C0I5A LIZLLL;
    public final C0I88 LJ;
    public final C0I8C LJFF;
    public final Pair<Integer, Integer> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I84)) {
            return false;
        }
        C0I84 c0i84 = (C0I84) obj;
        return Intrinsics.LJFF(this.LIZ, c0i84.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0i84.LIZIZ) && this.LIZJ == c0i84.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0i84.LIZLLL) && this.LJ == c0i84.LJ && this.LJFF == c0i84.LJFF && Intrinsics.LJFF(this.LJI, c0i84.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31;
        Pair<Integer, Integer> pair = this.LJI;
        return iHashCode + (pair == null ? 0 : pair.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Image(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", loader=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", style=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", size=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", button=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", scale=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", calculatedImageSize=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0I84(UrlModel urlModel, C0I8V c0i8v, C0I8A c0i8a, C0I5A c0i5a, C0I88 c0i88, C0I8C c0i8c, Pair<Integer, Integer> pair) {
        this.LIZ = urlModel;
        this.LIZIZ = c0i8v;
        this.LIZJ = c0i8a;
        this.LIZLLL = c0i5a;
        this.LJ = c0i88;
        this.LJFF = c0i8c;
        this.LJI = pair;
    }
}
