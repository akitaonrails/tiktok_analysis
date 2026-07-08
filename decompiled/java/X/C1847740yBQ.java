package X;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yBQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847740yBQ {
    public volatile boolean LIZ;
    public String LIZIZ;
    public EnumC1848020yBs LIZJ;
    public boolean LJFF;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIL;
    public List<WeakReference<InterfaceC1848330yCN>> LJIILIIL;
    public C1847740yBQ LJIILJJIL;
    public boolean LJIILL;
    public WeakReference<View> LJIILLIIL;
    public List<WeakReference<View>> LJIIZILJ;
    public String LJIJI;
    public String LIZLLL = "normal";
    public C1848290yCJ LJ = new C1848290yCJ();
    public float LJI = 0.3f;
    public long LJII = 200;
    public String LJIIJ = "";
    public final String[] LJIIJJI = new String[6];
    public boolean LJIJ = true;
    public boolean LJIJJ = true;

    public final C1847740yBQ LIZ() {
        C1847740yBQ c1847740yBQ = new C1847740yBQ();
        c1847740yBQ.LIZIZ = this.LIZIZ;
        c1847740yBQ.LIZJ = this.LIZJ;
        c1847740yBQ.LIZLLL = this.LIZLLL;
        c1847740yBQ.LJIILIIL = this.LJIILIIL;
        c1847740yBQ.LJ = this.LJ;
        c1847740yBQ.LJIILL = this.LJIILL;
        c1847740yBQ.LJIILJJIL = this.LJIILJJIL;
        c1847740yBQ.LJIIIZ = this.LJIIIZ;
        c1847740yBQ.LJIIIIZZ = this.LJIIIIZZ;
        c1847740yBQ.LJIIJ = this.LJIIJ;
        c1847740yBQ.LJII = this.LJII;
        c1847740yBQ.LJI = this.LJI;
        c1847740yBQ.LJFF = this.LJFF;
        C13DL.LJ(this.LJIIJJI, c1847740yBQ.LJIIJJI, 0, 0, 14);
        c1847740yBQ.LJIIL = this.LJIIL;
        c1847740yBQ.LJIILLIIL = this.LJIILLIIL;
        c1847740yBQ.LJIIZILJ = this.LJIIZILJ;
        c1847740yBQ.LJIJ = this.LJIJ;
        c1847740yBQ.LJIJI = this.LJIJI;
        c1847740yBQ.LJIJJ = this.LJIJJ;
        return c1847740yBQ;
    }

    public final boolean LJFF() {
        EnumC1848020yBs enumC1848020yBs = this.LIZJ;
        return enumC1848020yBs == EnumC1848020yBs.PAGE || enumC1848020yBs == EnumC1848020yBs.SUBPAGE;
    }

    public final boolean LIZLLL() {
        return (!LJFF() || Intrinsics.LJFF(this.LIZLLL, "normal") || Intrinsics.LJFF(this.LIZLLL, "normal_btm")) ? false : true;
    }

    public final boolean LJ() {
        if (LJFF()) {
            return Intrinsics.LJFF(this.LIZLLL, "normal") || Intrinsics.LJFF(this.LIZLLL, "normal_btm");
        }
        return false;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DataEntity{oid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZIZ(EnumC1847910yBh enumC1847910yBh) {
        String value;
        EnumC1848020yBs enumC1848020yBs = this.LIZJ;
        if (enumC1848020yBs != null && (value = enumC1848020yBs.getValue()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("nxet_");
            sbLIZ.append(value);
            sbLIZ.append('_');
            sbLIZ.append(enumC1847910yBh.getValue());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String str = this.LJIIJJI[enumC1847910yBh.getIndex()];
            if (str != null) {
                return str;
            }
            return strLIZIZ;
        }
        return null;
    }

    public final boolean LIZJ(EnumC1847910yBh enumC1847910yBh) {
        if ((enumC1847910yBh.getFlag() & this.LJIIL) != 0) {
            return true;
        }
        return false;
    }

    public final void LJI(String str, boolean z) {
        this.LJIIIIZZ = str;
        this.LJIIIZ = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[seq_(0)][");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('_');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("][biz_");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(']');
        this.LJIIJ = C2188811AlT.LIZIZ(sbLIZ);
    }
}
