package Y;

import X.C1317220kNk;
import X.C1322200kVm;
import X.C1328130kfL;
import X.C1330590kjJ;
import X.C1C7U;
import X.C2187451AjH;
import X.C786410Ut5;
import android.opengl.GLES20;
import com.lynx.tasm.eventreport.LynxEventReporter;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS6S0001000_20 implements Runnable {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f286i0;

    public static final void run$1(ARunnableS6S0001000_20 aRunnableS6S0001000_20) {
        LynxEventReporter.lambda$removeGenericInfo$4(aRunnableS6S0001000_20.f286i0);
    }

    public static final void run$2(ARunnableS6S0001000_20 aRunnableS6S0001000_20) {
        LynxEventReporter.lambda$clearCache$7(aRunnableS6S0001000_20.f286i0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        int i = C2187451AjH.LIZ;
        Locale locale = Locale.ENGLISH;
        Class<?> cls = C1322200kVm.LIZ;
        C1330590kjJ.LIZJ("FrescoImageLoaderImpl", "trimDisk", C786410Ut5.k4(locale, "before trim, main-disk picture_count:%d, picture_size:%dkb, small-disk picture_count:%d, picture_size:%dkb", new Object[]{Long.valueOf(C1328130kfL.LJIILIIL().LJIILL().getCount()), Long.valueOf(C1328130kfL.LJIILIIL().LJIILL().getSize() / 1024), Long.valueOf(C1328130kfL.LJIILIIL().LJIJJ().getCount()), Long.valueOf(C1328130kfL.LJIILIIL().LJIJJ().getSize() / 1024)}));
        int i2 = this.f286i0;
        if (i2 == 1) {
            C1328130kfL.LJIILIIL().LJIILL().LJFF();
            C1328130kfL.LJIILIIL().LJIJJ().LJFF();
        } else if (i2 == 2) {
            C1328130kfL.LJIILIIL().LJIILL().LIZLLL();
            C1328130kfL.LJIILIIL().LJIJJ().LIZLLL();
        }
        C1330590kjJ.LIZJ("FrescoImageLoaderImpl", "trimDisk", C786410Ut5.k4(locale, "after trim, main-disk picture_count:%d, picture_size:%dkb, small-disk picture_count:%d, picture_size:%dkb", new Object[]{Long.valueOf(C1328130kfL.LJIILIIL().LJIILL().getCount()), Long.valueOf(C1328130kfL.LJIILIIL().LJIILL().getSize() / 1024), Long.valueOf(C1328130kfL.LJIILIIL().LJIJJ().getCount()), Long.valueOf(C1328130kfL.LJIILIIL().LJIJJ().getSize() / 1024)}));
    }

    public static final void run$0(ARunnableS6S0001000_20 aRunnableS6S0001000_20) {
        boolean zLIZ;
        C1C7U.LIZ("FrescoImageLoaderImpl@7681.trimDisk$1");
        try {
            aRunnableS6S0001000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FrescoImageLoaderImpl@7681.trimDisk$1");
    }

    public static final void run$3(ARunnableS6S0001000_20 aRunnableS6S0001000_20) {
        boolean zLIZ;
        C1C7U.LIZ("ClientImplNative$AuxStreamRenderContext@5a0f.release$1");
        try {
            GLES20.glDeleteTextures(1, new int[]{aRunnableS6S0001000_20.f286i0}, 0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientImplNative$AuxStreamRenderContext@5a0f.release$1");
    }

    public static final void run$4(ARunnableS6S0001000_20 aRunnableS6S0001000_20) {
        int i = aRunnableS6S0001000_20.f286i0;
        C1C7U.LIZ("SDUIDebounceMethod@ec91.handle$1L");
        C1317220kNk.LIZJ.remove(Integer.valueOf(i));
        C1C7U.LIZIZ("SDUIDebounceMethod@ec91.handle$1L");
    }

    public ARunnableS6S0001000_20(int i, int i2) {
        this.$t = i2;
        switch (i2) {
            case 0:
            case 3:
                this.f286i0 = i;
                break;
            case 1:
            case 2:
            default:
                this.f286i0 = i;
                break;
        }
    }
}
