package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I86, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I86 implements C0I8O {
    public final UrlModel LIZ;
    public final C0I8U LIZIZ;
    public final C0I8B LIZJ;
    public final C0I8S LIZLLL;
    public final C0I89 LJ;
    public final C0I8D LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I86)) {
            return false;
        }
        C0I86 c0i86 = (C0I86) obj;
        return Intrinsics.LJFF(this.LIZ, c0i86.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0i86.LIZIZ) && this.LIZJ == c0i86.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0i86.LIZLLL) && this.LJ == c0i86.LJ && this.LJFF == c0i86.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
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
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0I86(UrlModel urlModel, C0I8U c0i8u, C0I8B c0i8b, C0I8S c0i8s, C0I89 c0i89, C0I8D c0i8d, int i) {
        c0i8u = (i & 2) != 0 ? new C0I8G(null) : c0i8u;
        c0i8b = (i & 4) != 0 ? C0I8B.ROUNDED_CORNER : c0i8b;
        c0i8s = (i & 8) != 0 ? C0I8Y.LIZ : c0i8s;
        c0i89 = (i & 16) != 0 ? C0I89.NONE : c0i89;
        c0i8d = (i & 32) != 0 ? C0I8D.FIT_XY : c0i8d;
        this.LIZ = urlModel;
        this.LIZIZ = c0i8u;
        this.LIZJ = c0i8b;
        this.LIZLLL = c0i8s;
        this.LJ = c0i89;
        this.LJFF = c0i8d;
    }
}
