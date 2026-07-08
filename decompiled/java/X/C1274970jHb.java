package X;

import android.content.Context;
import android.opengl.EGLContext;
import android.os.Handler;

/* JADX INFO: renamed from: X.0jHb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1274970jHb {
    public Handler LIZ;
    public Context LIZIZ;
    public EGLContext LIZJ;
    public boolean LJIILLIIL;
    public boolean LJIJ;
    public int LJIJJLI;
    public int LJIL;
    public C1274930jHX LJJI;
    public boolean LJJIIJ;
    public boolean LJJIJ;
    public int LJJIJIIJIL;
    public String LIZLLL = "{}";
    public final String LJ = "";
    public String LJFF = "";
    public String LJI = "";
    public String LJII = "";
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public final String LJIIJ = "";
    public EnumC1275310jI9 LJIIJJI = EnumC1275310jI9.VIDEO;
    public EnumC1274430jGj LJIIL = EnumC1274430jGj.GUEST;
    public final EnumC1275500jIS LJIILIIL = EnumC1275500jIS.SURFACE_VIEW;
    public C1275560jIY LJIILJJIL = C1275560jIY.LJI;
    public EnumC1277290jLL LJIILL = EnumC1277290jLL.NORMAL;
    public final boolean LJIIZILJ = true;
    public boolean LJIJI = true;
    public EnumC1276410jJv LJIJJ = EnumC1276410jJv.UNKNOWN;
    public int LJJ = 5;
    public EnumC1275210jHz LJJIFFI = EnumC1275210jHz.NONE;
    public final boolean LJJII = true;
    public final boolean LJJIII = true;
    public boolean LJJIIJZLJL = true;
    public String LJJIIZ = "";
    public EnumC1275490jIR LJJIIZI = EnumC1275490jIR.NO_USE;
    public boolean LJJIJIIJI = true;

    public final C1274930jHX LIZ() {
        if (this.LJJI == null) {
            this.LJJI = new C1274930jHX();
        }
        return this.LJJI;
    }

    public final void LIZIZ(C1275560jIY c1275560jIY) {
        int i;
        int i2 = c1275560jIY.LIZ;
        boolean z = this.LJIJI;
        int i3 = 16;
        if (z) {
            i = 16;
        } else {
            i = 2;
        }
        int i4 = (((i2 + i) - 1) / i) * i;
        int i5 = c1275560jIY.LIZIZ;
        if (!z) {
            i3 = 2;
        }
        this.LJIILJJIL = new C1275560jIY(i4, (((i5 + i3) - 1) / i3) * i3, c1275560jIY.LJ, c1275560jIY.LJFF);
    }
}
