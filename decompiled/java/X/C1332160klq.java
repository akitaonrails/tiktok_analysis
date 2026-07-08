package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.0klq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1332160klq {
    public static volatile C1332160klq LIZJ;
    public final boolean LIZ;
    public final C1333260knc LIZIZ;

    public static C1332160klq LJIIIZ() {
        if (LIZJ == null) {
            synchronized (C1332160klq.class) {
                try {
                    LIZJ = new C1332160klq();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final boolean LIZ() {
        return this.LIZIZ.LJJIJIL.LIZ() != null && ((Boolean) this.LIZIZ.LJJIJIL.LIZ()).booleanValue();
    }

    public final boolean LIZIZ() {
        return this.LIZIZ.LJJJI.LIZ() != null && ((Boolean) this.LIZIZ.LJJJI.LIZ()).booleanValue();
    }

    public final boolean LIZJ() {
        return this.LIZIZ.LJJJJ.LIZ() != null && ((Boolean) this.LIZIZ.LJJJJ.LIZ()).booleanValue();
    }

    public final Bitmap.Config LIZLLL() {
        return (Bitmap.Config) this.LIZIZ.LIZIZ.LIZ();
    }

    public final InterfaceC1335580krM LJ() {
        return (InterfaceC1335580krM) this.LIZIZ.LJJI.LIZ();
    }

    public final Context LJFF() {
        return (Context) this.LIZIZ.LIZ.LIZ();
    }

    public final AbstractC1334330kpL LJI() {
        return (AbstractC1334330kpL) this.LIZIZ.LJIJI.LIZ();
    }

    public final File LJII() {
        return (File) this.LIZIZ.LJ.LIZ();
    }

    public final InterfaceC1334020koq LJIIIIZZ() {
        return (InterfaceC1334020koq) this.LIZIZ.LIZLLL.LIZ();
    }

    public final long LJIIJ() {
        if (this.LIZIZ.LJFF.LIZ() == null) {
            return 0L;
        }
        return ((Long) this.LIZIZ.LJFF.LIZ()).longValue();
    }

    public final int LJIIJJI() {
        if (this.LIZIZ.LIZJ.LIZ() == null) {
            return 0;
        }
        return ((Integer) this.LIZIZ.LIZJ.LIZ()).intValue();
    }

    public final InterfaceC1332280km2 LJIIL() {
        return (InterfaceC1332280km2) this.LIZIZ.LJJIJLIJ.LIZ();
    }

    public final boolean LJIILIIL() {
        return ((Boolean) this.LIZIZ.LJJIIZI.LIZ()).booleanValue();
    }

    public final boolean LJIILJJIL() {
        return this.LIZIZ.LJJII.LIZ() != null && ((Boolean) this.LIZIZ.LJJII.LIZ()).booleanValue();
    }

    public final boolean LJIILL() {
        return this.LIZIZ.LJIL.LIZ() != null && ((Boolean) this.LIZIZ.LJIL.LIZ()).booleanValue();
    }

    public C1332160klq() {
        this.LIZIZ = new C1333260knc();
    }

    public C1332160klq(C1332170klr c1332170klr) {
        C1333260knc c1333260knc = new C1333260knc();
        this.LIZIZ = c1333260knc;
        c1333260knc.LIZ.LIZIZ(c1332170klr.LIZ);
        c1333260knc.LIZLLL.LIZIZ(c1332170klr.LIZIZ);
        c1333260knc.LJ.LIZIZ(c1332170klr.LIZJ);
        c1333260knc.LJIIJJI.LIZIZ(Long.valueOf(c1332170klr.LIZLLL));
        c1333260knc.LJFF.LIZIZ(Long.valueOf(c1332170klr.LJ));
        c1333260knc.LJI.LIZIZ(0L);
        c1333260knc.LJIIL.LIZIZ(0L);
        c1333260knc.LJIILIIL.LIZIZ(Integer.valueOf(c1332170klr.LJFF));
        c1333260knc.LJIJI.LIZIZ(c1332170klr.LJI);
        c1333260knc.LIZIZ.LIZIZ(c1332170klr.LJII);
        c1333260knc.LIZJ.LIZIZ(Integer.valueOf(c1332170klr.LJIIIIZZ));
        c1333260knc.LJIJJ.LIZIZ(Boolean.valueOf(c1332170klr.LJIIIZ));
        c1333260knc.LJIL.LIZIZ(Boolean.valueOf(c1332170klr.LJIIJJI));
        c1333260knc.LJJ.LIZIZ(c1332170klr.LJIIL);
        c1333260knc.LJIILJJIL.LIZIZ(Boolean.valueOf(c1332170klr.LJIILJJIL));
        c1333260knc.LJIJJLI.LIZIZ(Boolean.valueOf(c1332170klr.LJIIJ));
        c1333260knc.LJJIFFI.LIZIZ(c1332170klr.LJIJI);
        c1333260knc.LJJII.LIZIZ(Boolean.valueOf(c1332170klr.LJIJJ));
        c1333260knc.LJIJ.LIZIZ(Boolean.valueOf(c1332170klr.LJIJ));
        c1333260knc.LJIILL.LIZIZ(Boolean.valueOf(c1332170klr.LJIILL));
        c1333260knc.LJIILLIIL.LIZIZ(Boolean.valueOf(c1332170klr.LJIILLIIL));
        c1333260knc.LJIIZILJ.LIZIZ(c1332170klr.LJIIZILJ);
        c1333260knc.LJJIII.LIZIZ(null);
        c1333260knc.LJJI.LIZIZ(c1332170klr.LJIILIIL);
        c1333260knc.LJJIIJ.LIZIZ(Boolean.valueOf(c1332170klr.LJIJJLI));
        c1333260knc.LJJIJIIJI.LIZIZ(c1332170klr.LJJ);
        c1333260knc.LJJIJIIJIL.LIZIZ(Boolean.valueOf(c1332170klr.LJIL));
        Boolean bool = Boolean.FALSE;
        c1333260knc.LJJIJIL.LIZIZ(bool);
        c1333260knc.LJJIJLIJ.LIZIZ(null);
        c1333260knc.LJJIJL.LIZIZ(bool);
        c1333260knc.LJJIZ.LIZIZ(bool);
        c1333260knc.LJJIL.LIZIZ(bool);
        c1333260knc.LJJJ.LIZIZ(bool);
        c1333260knc.LJJJI.LIZIZ(bool);
        c1333260knc.LJJJJLI.LIZIZ(c1332170klr.LJJIFFI);
        this.LIZ = c1332170klr.LJJI;
    }
}
