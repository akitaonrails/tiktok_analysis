package X;

import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0HcQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444840HcQ {
    public Layout.Alignment LJI;
    public TextDirectionHeuristic LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public Typeface LJIIZILJ;
    public CharSequence LIZ = null;
    public int LIZIZ = Integer.MAX_VALUE;
    public int LIZJ = 0;
    public int LIZLLL = 0;
    public int LJ = Integer.MAX_VALUE;
    public int LJFF = 0;
    public TextUtils.TruncateAt LJII = null;
    public int LJIIIIZZ = 0;
    public float LJIIL = 0.0f;
    public float LJIILIIL = 0.0f;
    public float LJIILJJIL = 0.0f;
    public int LJIILL = 0;
    public float LJIILLIIL = 0.0f;
    public int LJIJ = -1;
    public int LJIJI = 0;

    public final int hashCode() {
        CharSequence charSequence = this.LIZ;
        int iHashCode = (((((((((((((((((((charSequence == null ? 0 : charSequence.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI.hashCode()) * 31) + Float.floatToIntBits(1.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + C786410Ut5.Z2(true)) * 31;
        TextUtils.TruncateAt truncateAt = this.LJII;
        int iHashCode2 = (((((((((((((((((((((iHashCode + (truncateAt == null ? 0 : truncateAt.hashCode())) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ.hashCode()) * 31 * 31 * 31 * 31) + C786410Ut5.Z2(false)) * 31) + this.LJIIJ) * 31) + this.LJIIJJI) * 31) + Float.floatToIntBits(this.LJIIL)) * 31) + Float.floatToIntBits(this.LJIILIIL)) * 31) + Float.floatToIntBits(this.LJIILJJIL)) * 31) + this.LJIILL) * 31) + Float.floatToIntBits(this.LJIILLIIL)) * 31;
        Typeface typeface = this.LJIIZILJ;
        return ((((iHashCode2 + (typeface != null ? typeface.hashCode() : 0)) * 31) + this.LJIJ) * 31) + this.LJIJI;
    }

    public C444840HcQ(Layout.Alignment alignment, TextDirectionHeuristic textDirectionHeuristic, int i, int i2, Typeface typeface) {
        this.LJI = alignment;
        this.LJIIIZ = textDirectionHeuristic;
        this.LJIIJ = i;
        this.LJIIJJI = i2;
        this.LJIIZILJ = typeface;
    }
}
