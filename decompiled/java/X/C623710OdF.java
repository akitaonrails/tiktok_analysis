package X;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OdF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623710OdF {
    public final WeakReference<InterfaceC1334290kpH> LIZ;
    public final String LIZIZ;
    public final EnumC1334360kpO LIZJ;
    public final C1331730kl9 LIZLLL;
    public final Bitmap.Config LJ;
    public final boolean LJFF;
    public final String LJI;
    public final long LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C623710OdF)) {
            return false;
        }
        C623710OdF c623710OdF = (C623710OdF) obj;
        return Intrinsics.LJFF(this.LIZ, c623710OdF.LIZ) && Intrinsics.LJFF(this.LIZIZ, c623710OdF.LIZIZ) && this.LIZJ == c623710OdF.LIZJ && Intrinsics.LJFF(this.LIZLLL, c623710OdF.LIZLLL) && this.LJ == c623710OdF.LJ && this.LJFF == c623710OdF.LJFF && Intrinsics.LJFF(this.LJI, c623710OdF.LJI) && this.LJII == c623710OdF.LJII;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        C1331730kl9 c1331730kl9 = this.LIZLLL;
        int iHashCode2 = (iHashCode + (c1331730kl9 == null ? 0 : c1331730kl9.hashCode())) * 31;
        Bitmap.Config config = this.LJ;
        return ((((((iHashCode2 + (config != null ? config.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31) + C786410Ut5.Y2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingTask(viewRef=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bizTag=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", circleOptions=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", bitmapConfig=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", autoPlayAnimations=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", imageId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", loadStartTime=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C623710OdF(WeakReference<InterfaceC1334290kpH> weakReference, String str, EnumC1334360kpO enumC1334360kpO, C1331730kl9 c1331730kl9, Bitmap.Config config, boolean z, String str2, long j) {
        this.LIZ = weakReference;
        this.LIZIZ = str;
        this.LIZJ = enumC1334360kpO;
        this.LIZLLL = c1331730kl9;
        this.LJ = config;
        this.LJFF = z;
        this.LJI = str2;
        this.LJII = j;
    }
}
