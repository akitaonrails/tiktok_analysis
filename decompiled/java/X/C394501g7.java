package X;

import com.bytedance.android.livesdk.model.BoardItemLayout;

/* JADX INFO: renamed from: X.01g7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C394501g7 {
    public final EnumC389301fH LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public boolean LJIIJJI;
    public float LJIIL;
    public final float LJIILIIL;
    public float LJIILJJIL;
    public float LJIILL;
    public final float LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public float LJIJI;
    public float LJIJJ;
    public float LJIJJLI;
    public float LJIL;
    public float LJJ;
    public boolean LJJI;
    public String LJJIFFI;
    public BoardItemLayout LJJII;
    public boolean LJJIII;
    public final int LJJIIJ;
    public String LJJIIJZLJL;
    public float LJJIIZ;

    public C394501g7() {
        this(null, false, false, false, 0.0f, 1073741823);
    }

    public C394501g7(EnumC389301fH enumC389301fH, boolean z, boolean z2, boolean z3, float f, int i) {
        float f2;
        float fLIZIZ;
        float f3;
        enumC389301fH = (i & 1) != 0 ? EnumC389301fH.WIDGET : enumC389301fH;
        z = (i & 4) != 0 ? false : z;
        z2 = (i & 32) != 0 ? false : z2;
        z3 = (i & 64) != 0 ? false : z3;
        if ((i & 512) != 0) {
            f2 = 100.0f;
        } else {
            f2 = 0.0f;
        }
        float f4 = (i & 1024) == 0 ? 0.0f : 100.0f;
        f = (32768 & i) != 0 ? 0.0f : f;
        if ((65536 & i) != 0) {
            fLIZIZ = C418440Gaw.LIZIZ(160);
        } else {
            fLIZIZ = 0.0f;
        }
        if ((i & 8388608) != 0) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        this.LIZ = enumC389301fH;
        this.LIZIZ = 0;
        this.LIZJ = z;
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = z2;
        this.LJI = z3;
        this.LJII = 0.0f;
        this.LJIIIIZZ = 0.0f;
        this.LJIIIZ = f2;
        this.LJIIJ = f4;
        this.LJIIJJI = false;
        this.LJIIL = 0.0f;
        this.LJIILIIL = 0.0f;
        this.LJIILJJIL = 0.0f;
        this.LJIILL = f;
        this.LJIILLIIL = fLIZIZ;
        this.LJIIZILJ = 0;
        this.LJIJ = 0;
        this.LJIJI = 0.0f;
        this.LJIJJ = 0.0f;
        this.LJIJJLI = 0.0f;
        this.LJIL = 0.0f;
        this.LJJ = f3;
        this.LJJI = false;
        this.LJJIFFI = null;
        this.LJJII = null;
        this.LJJIII = false;
        this.LJJIIJ = 0;
        this.LJJIIJZLJL = null;
        this.LJJIIZ = 1.0f;
    }
}
