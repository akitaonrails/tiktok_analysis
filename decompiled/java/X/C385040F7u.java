package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385040F7u {
    public String LIZ;
    public String LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public String LJI;
    public String LJII;
    public TextStyleModel LJIIIIZZ;
    public float LJIIIZ;
    public boolean LJIIJ;
    public List<Float> LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;

    public C385040F7u() {
        this(null, null, 16383);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C385040F7u)) {
            return false;
        }
        C385040F7u c385040F7u = (C385040F7u) obj;
        return Intrinsics.LJFF(this.LIZ, c385040F7u.LIZ) && Intrinsics.LJFF(this.LIZIZ, c385040F7u.LIZIZ) && this.LIZJ == c385040F7u.LIZJ && this.LIZLLL == c385040F7u.LIZLLL && this.LJ == c385040F7u.LJ && this.LJFF == c385040F7u.LJFF && Intrinsics.LJFF(this.LJI, c385040F7u.LJI) && Intrinsics.LJFF(this.LJII, c385040F7u.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c385040F7u.LJIIIIZZ) && Float.compare(this.LJIIIZ, c385040F7u.LJIIIZ) == 0 && this.LJIIJ == c385040F7u.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c385040F7u.LJIIJJI) && this.LJIIL == c385040F7u.LJIIL && this.LJIILIIL == c385040F7u.LJIILIIL;
    }

    public final String toString() {
        return "NleRestoredTextState(textStr=" + this.LIZ + ", textStrWithLineBreak=" + this.LIZIZ + ", mode=" + this.LIZJ + ", color=" + this.LIZLLL + ", align=" + this.LJ + ", fontSize=" + this.LJFF + ", fontUrs=" + this.LJI + ", fontPath=" + this.LJII + ", textStyle=" + this.LJIIIIZZ + ", lineSpacingExtra=" + this.LJIIIZ + ", autoAdaptCanvas=" + this.LJIIJ + ", canvasWHFixed=" + this.LJIIJJI + ", autoAdaptDpi=" + this.LJIIL + ", fixedFontSize=" + this.LJIILIIL + ')';
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31;
        TextStyleModel textStyleModel = this.LJIIIIZZ;
        int iHashCode2 = (((((iHashCode + (textStyleModel == null ? 0 : textStyleModel.hashCode())) * 31) + Float.floatToIntBits(this.LJIIIZ)) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31;
        List<Float> list = this.LJIIJJI;
        return ((((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIL)) * 31) + C786410Ut5.Z2(this.LJIILIIL);
    }

    public C385040F7u(String str, String str2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        String str3;
        float fLJIIIZ;
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        if ((i & 16) != 0) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        if ((i & 32) != 0) {
            i5 = 28;
        } else {
            i5 = 0;
        }
        if ((i & 64) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        String str4 = (i & 128) == 0 ? null : "";
        if ((i & 512) != 0) {
            fLJIIIZ = C1919207fS.LJIIIZ();
        } else {
            fLJIIIZ = 0.0f;
        }
        boolean z = (i & 8192) != 0;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
        this.LJFF = i5;
        this.LJI = str3;
        this.LJII = str4;
        this.LJIIIIZZ = null;
        this.LJIIIZ = fLJIIIZ;
        this.LJIIJ = false;
        this.LJIIJJI = null;
        this.LJIIL = false;
        this.LJIILIIL = z;
    }
}
