package X;

import android.graphics.Bitmap;
import com.ss.android.vesdk.VESize;
import java.util.Objects;

/* JADX INFO: renamed from: X.1DLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254411DLr {
    public boolean LJFF;
    public C1AO8 LIZ = C1AO8.NORMAL_GET_FRAME_MODE;
    public VESize LIZIZ = new VESize(576, 1024);
    public final VESize LIZJ = new VESize(360, 640);
    public boolean LIZLLL = false;
    public EnumC578750Mmv LJ = EnumC578750Mmv.NO_EFFECT;
    public EnumC1780180wQS LJI = EnumC1780180wQS.CENTER_CROP;
    public C1AO7 LJII = null;
    public EnumC1780170wQR LJIIIIZZ = EnumC1780170wQR.NO_MIRROR;
    public boolean LJIIIZ = true;
    public int LJIIJ = 0;
    public boolean LJIIJJI = false;
    public final String LJIIL = "";
    public EnumC578800Mn0 LJIILIIL = EnumC578800Mn0.RGBA_ARRAY;
    public String LJIILJJIL = null;
    public String LJIILL = "";
    public final String LJIILLIIL = "";
    public final int LJIIZILJ = -1;
    public Bitmap LJIJ = null;
    public final int LJIJI = -1;
    public boolean LJIJJ = false;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2254411DLr)) {
            return false;
        }
        C2254411DLr c2254411DLr = (C2254411DLr) obj;
        if (this.LIZ != c2254411DLr.LIZ || this.LJ != c2254411DLr.LJ || this.LJFF != c2254411DLr.LJFF || this.LJI != c2254411DLr.LJI || !this.LIZIZ.equals(c2254411DLr.LIZIZ) || !this.LIZJ.equals(c2254411DLr.LIZJ) || this.LJI != c2254411DLr.LJI || this.LJIIIIZZ != c2254411DLr.LJIIIIZZ || this.LJIIIZ != c2254411DLr.LJIIIZ || this.LJIIJ != c2254411DLr.LJIIJ || this.LJIIJJI != c2254411DLr.LJIIJJI || !this.LJIIL.equals(c2254411DLr.LJIIL) || this.LJIILIIL != c2254411DLr.LJIILIIL || !this.LJIILL.equals(c2254411DLr.LJIILL) || !this.LJIILLIIL.equals(c2254411DLr.LJIILLIIL) || this.LJIIZILJ != c2254411DLr.LJIIZILJ || this.LJIJ != c2254411DLr.LJIJ || this.LJIJI != c2254411DLr.LJIJI || this.LJIJJ != c2254411DLr.LJIJJ || !Objects.equals(this.LJIILJJIL, c2254411DLr.LJIILJJIL)) {
            return false;
        }
        return true;
    }
}
