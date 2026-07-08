package X;

import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: renamed from: X.0uDQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695220uDQ extends C1685400txa {
    public final long LIZJ;
    public final int LIZLLL;

    public final int hashCode() {
        return (C1685910tyP.LJIIJ(this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BlendModeColorFilter(color=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LIZJ));
        sbLIZ.append(", blendMode=");
        int i = this.LIZLLL;
        sbLIZ.append((Object) (i == 0 ? "Clear" : i == 1 ? "Src" : i == 2 ? "Dst" : i == 3 ? "SrcOver" : i == 4 ? "DstOver" : i == 5 ? "SrcIn" : i == 6 ? "DstIn" : i == 7 ? "SrcOut" : i == 8 ? "DstOut" : i == 9 ? "SrcAtop" : i == 10 ? "DstAtop" : i == 11 ? "Xor" : i == 12 ? "Plus" : i == 13 ? "Modulate" : i == 14 ? "Screen" : i == 15 ? "Overlay" : i == 16 ? "Darken" : i == 17 ? "Lighten" : i == 18 ? "ColorDodge" : i == 19 ? "ColorBurn" : i == 20 ? "HardLight" : i == 21 ? "Softlight" : i == 22 ? "Difference" : i == 23 ? "Exclusion" : i == 24 ? "Multiply" : i == 25 ? "Hue" : i == 26 ? "Saturation" : i == 27 ? "Color" : i == 28 ? "Luminosity" : "Unknown"));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1695220uDQ)) {
            return false;
        }
        C1695220uDQ c1695220uDQ = (C1695220uDQ) obj;
        if (C1685910tyP.LJ(this.LIZJ, c1695220uDQ.LIZJ) && this.LIZLLL == c1695220uDQ.LIZLLL) {
            return true;
        }
        return false;
    }

    public C1695220uDQ(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            porterDuffColorFilter = new BlendModeColorFilter(C1685850tyJ.LJIIIZ(j), C418890Gbf.LIZ(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(C1685850tyJ.LJIIIZ(j), C418890Gbf.LIZIZ(i));
        }
        super(porterDuffColorFilter);
        this.LIZJ = j;
        this.LIZLLL = i;
    }
}
