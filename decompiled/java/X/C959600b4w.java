package X;

import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* JADX INFO: renamed from: X.0b4w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C959600b4w {
    public final EnumC959690b55 LIZ;
    public long LIZJ;
    public long LIZLLL;
    public List<? extends ImageModel> LJ;
    public long LJFF;
    public int LJI;
    public boolean LJII;
    public int LJIIJ;
    public int LJIIJJI;
    public long LJIIL;
    public boolean LJIILIIL;
    public long LJIILJJIL;
    public int LJIILL;
    public long LJIILLIIL;
    public ImageModel LJIIZILJ;
    public Number LJIJI;
    public C950840aqo LJIJJ;
    public boolean LJIJJLI;
    public long LJIL;
    public boolean LJJ;
    public EnumC958840b3i LIZIZ = EnumC958840b3i.UNKNOWN;
    public boolean LJIIIIZZ = true;
    public boolean LJIIIZ = true;
    public String LJIJ = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C959600b4w) && this.LIZ == ((C959600b4w) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickCoHostModel(source=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C959600b4w(EnumC959690b55 enumC959690b55) {
        this.LIZ = enumC959690b55;
    }

    public final void LIZ(EnumC958840b3i enumC958840b3i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update quickCoHostType, prev = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" curr = ");
        sbLIZ.append(enumC958840b3i);
        C20441214yg.LJIIIZ("QuickCoHostModel", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ = enumC958840b3i;
    }
}
