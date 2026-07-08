package X;

import android.graphics.Point;
import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UrQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C785380UrQ {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public String LJII;
    public final PointF LJIIIIZZ;
    public Point LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C785380UrQ)) {
            return false;
        }
        C785380UrQ c785380UrQ = (C785380UrQ) obj;
        return Intrinsics.LJFF(this.LIZ, c785380UrQ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c785380UrQ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c785380UrQ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c785380UrQ.LIZLLL) && Intrinsics.LJFF(this.LJ, c785380UrQ.LJ) && Intrinsics.LJFF(this.LJFF, c785380UrQ.LJFF) && Intrinsics.LJFF(this.LJI, c785380UrQ.LJI) && Intrinsics.LJFF(this.LJII, c785380UrQ.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c785380UrQ.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c785380UrQ.LJIIIZ);
    }

    public final int hashCode() {
        return (((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ModelPicture(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", category=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", categoryKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", url=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", resID=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", scaleFactor=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", resultPath=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", pivot=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", tabSection=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C785380UrQ(String str, String str2, String str3, String str4, String str5, String str6, String str7, PointF pointF) {
        Point point = new Point(0, 0);
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = "";
        this.LJIIIIZZ = pointF;
        this.LJIIIZ = point;
    }
}
