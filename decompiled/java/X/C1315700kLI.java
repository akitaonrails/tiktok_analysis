package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: X.0kLI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315700kLI {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final Bitmap.Config LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final Map<String, String> LJIIIIZZ;
    public final Integer LJIIIZ = null;
    public final boolean LJIIJ;
    public final List<InterfaceC1291890jit> LJIIJJI;
    public final Object LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public final boolean LJIJ;
    public final float LJIJI;
    public final Rect LJIJJ;
    public final boolean LJIJJLI;

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        Bitmap.Config config = this.LJ;
        int iHashCode2 = (((((((((iHashCode + (config != null ? config.hashCode() : 0)) * 31) + (this.LJFF ? 1 : 0)) * 31) + (this.LJI ? 1 : 0)) * 31) + (this.LJII ? 1 : 0)) * 31) + (this.LJIIJ ? 1 : 0)) * 31;
        List<InterfaceC1291890jit> list = this.LJIIJJI;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Rect rect = this.LJIJJ;
        return iHashCode3 + (rect != null ? rect.hashCode() : 0);
    }

    public C1315700kLI(C1315860kLY c1315860kLY) {
        this.LJII = true;
        this.LJIJJLI = true;
        this.LIZ = c1315860kLY.LIZ;
        this.LIZIZ = c1315860kLY.LIZIZ;
        this.LJIIJ = c1315860kLY.LJIIIIZZ;
        this.LIZJ = c1315860kLY.LIZJ;
        this.LIZLLL = c1315860kLY.LIZLLL;
        this.LJ = c1315860kLY.LJ;
        this.LJI = c1315860kLY.LJFF;
        this.LJIIIIZZ = c1315860kLY.LJI;
        this.LJIIJJI = c1315860kLY.LJII;
        this.LJFF = c1315860kLY.LJIIJJI;
        this.LJII = c1315860kLY.LJIIJ;
        this.LJIIL = c1315860kLY.LJIIL;
        this.LJIILIIL = c1315860kLY.LJIIIZ;
        this.LJIILJJIL = c1315860kLY.LJIILIIL;
        this.LJIJJLI = c1315860kLY.LJIILJJIL;
        this.LJIILL = c1315860kLY.LJIILL;
        this.LJIILLIIL = c1315860kLY.LJIILLIIL;
        this.LJIIZILJ = c1315860kLY.LJIIZILJ;
        this.LJIJ = c1315860kLY.LJIJ;
        this.LJIJI = c1315860kLY.LJIJI;
        this.LJIJJ = c1315860kLY.LJIJJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1315700kLI.class != obj.getClass()) {
            return false;
        }
        C1315700kLI c1315700kLI = (C1315700kLI) obj;
        if (this.LIZIZ != c1315700kLI.LIZIZ || this.LIZJ != c1315700kLI.LIZJ || this.LJFF != c1315700kLI.LJFF || this.LJI != c1315700kLI.LJI || this.LJII != c1315700kLI.LJII || this.LJIIJ != c1315700kLI.LJIIJ || !Objects.equals(this.LIZ, c1315700kLI.LIZ) || this.LJ != c1315700kLI.LJ || !Objects.equals(this.LJIJJ, c1315700kLI.LJIJJ)) {
            return false;
        }
        return Objects.equals(this.LJIIJJI, c1315700kLI.LJIIJJI);
    }
}
