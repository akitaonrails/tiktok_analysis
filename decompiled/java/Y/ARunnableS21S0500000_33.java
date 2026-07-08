package Y;

import X.C1077050e8N;
import X.C1428470nHB;
import X.C1C7U;
import X.C21628919kl;
import X.C21664919qZ;
import X.C21665319qd;
import X.C21665419qe;
import X.C21665719qh;
import X.C21665819qi;
import X.C295760BiY;
import X.C389830FQf;
import X.EnumC375190EnN;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.ies.cutsame.util.Size;

/* JADX INFO: loaded from: classes34.dex */
public class ARunnableS21S0500000_33 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        float fFloatValue;
        ((C21665419qe) this.l0).LLLLLLL().setCropMode((EnumC375190EnN) this.l1);
        if (((C21665419qe) this.l0).LLLLLLL().getCropMode() == EnumC375190EnN.FREE || ((C21665419qe) this.l0).LLLLLLL().getCropMode() == EnumC375190EnN.ORIGIN) {
            C389830FQf c389830FQfLLLLLLL = ((C21665419qe) this.l0).LLLLLLL();
            Float f = (Float) this.l2;
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                int i = ((C21665419qe) this.l0).LLL.LIZLLL;
                fFloatValue = i == 0 ? 0.0f : r0.LIZJ / i;
            }
            c389830FQfLLLLLLL.setFreeModeCropRect(fFloatValue);
        }
        if (((Matrix) this.l3) == null) {
            ((C21665419qe) this.l0).LLLLLLLLLL().setImageMatrix(((C21665419qe) this.l0).LLL.LIZ);
            if (((Float) this.l2) != null) {
                C21665419qe c21665419qe = (C21665419qe) this.l0;
                C21665719qh c21665719qh = (C21665719qh) this.l4;
                RectF rectF = new RectF(c21665419qe.LLLLLLL().getRect());
                RectF rectFLIZ = C21628919kl.LIZ(c21665419qe.LLLLLLLLLL());
                Matrix matrix = new Matrix(c21665419qe.LLLLLLLLLL().getImageMatrix());
                Size size = c21665419qe.LLLLILI().LIZ.LIZJ;
                if (size != null) {
                    float fLIZ = C21664919qZ.LIZ(c21665719qh.LJII, rectF, rectFLIZ, size);
                    float f2 = c21665719qh.LJIIIIZZ;
                    float f3 = c21665719qh.LJIIIZ;
                    float fWidth = rectF.width();
                    float f4 = f2 * fWidth;
                    float f5 = f3 * (fWidth / (size.width / size.height));
                    matrix.postScale(c21665719qh.LJI ? -fLIZ : fLIZ, fLIZ, rectF.centerX(), rectF.centerY());
                    float f6 = 360;
                    matrix.postRotate(f6 - (c21665719qh.LJIIJ % f6), rectF.centerX(), rectF.centerY());
                    matrix.postTranslate(f4, f5);
                    c21665419qe.LLLLLLLLLL().setImageMatrix(matrix);
                }
            }
            ((C21665419qe) this.l0).LLLLLLZZ();
        }
    }

    public final void LIZ$1() {
        EnumC375190EnN enumC375190EnN;
        ((C21665319qd) this.l0).LLLLLLLZIL().setCropMode((EnumC375190EnN) this.l1);
        if (C295760BiY.LIZ() && ((Float) this.l2) == null && ((Matrix) this.l3) == null && (enumC375190EnN = (EnumC375190EnN) this.l1) != EnumC375190EnN.FREE && enumC375190EnN != EnumC375190EnN.ORIGIN) {
            ((C21665319qd) this.l0).LLLLLLLZIL().setOriginRatio(((C21665319qd) this.l0).LLLLLLLZIL().LIZJ((EnumC375190EnN) this.l1));
        }
        if (((C21665319qd) this.l0).LLLLLLLZIL().getCropMode() == EnumC375190EnN.FREE || ((C21665319qd) this.l0).LLLLLLLZIL().getCropMode() == EnumC375190EnN.ORIGIN) {
            C389830FQf c389830FQfLLLLLLLZIL = ((C21665319qd) this.l0).LLLLLLLZIL();
            Float f = (Float) this.l2;
            c389830FQfLLLLLLLZIL.setFreeModeCropRect(f != null ? f.floatValue() : ((C21665319qd) this.l0).LLLFZ.LIZ());
        }
        if (((Matrix) this.l3) == null) {
            ((C21665319qd) this.l0).LLLLLLZZ().setImageMatrix(((C21665319qd) this.l0).LLLFZ.LIZ);
            if (((Float) this.l2) != null && C1428470nHB.LJJZZI(((C21665319qd) this.l0).LLLLLZ())) {
                C21665319qd c21665319qd = (C21665319qd) this.l0;
                C21665819qi c21665819qi = (C21665819qi) this.l4;
                RectF rectF = new RectF(c21665319qd.LLLLLLLZIL().getRect());
                RectF rectFLIZ = C21628919kl.LIZ(c21665319qd.LLLLLLZZ());
                Matrix matrix = new Matrix(c21665319qd.LLLLLLZZ().getImageMatrix());
                Size size = c21665319qd.LLLLILI().LIZ.LIZLLL;
                if (size != null) {
                    float f2 = c21665819qi.LJII;
                    float f3 = 1.0f;
                    if (Float.isNaN(f2) || Float.isInfinite(f2) || f2 <= 0.0f) {
                        f2 = 1.0f;
                    }
                    float f4 = c21665819qi.LJIIIIZZ;
                    if (Float.isNaN(f4) || Float.isInfinite(f4)) {
                        f4 = 0.0f;
                    }
                    float f5 = c21665819qi.LJIIIZ;
                    if (Float.isNaN(f5) || Float.isInfinite(f5)) {
                        f5 = 0.0f;
                    }
                    float f6 = c21665819qi.LJIIJ;
                    if (Float.isNaN(f6) || Float.isInfinite(f6)) {
                        f6 = 0.0f;
                    }
                    float fLIZ = C21664919qZ.LIZ(f2, rectF, rectFLIZ, size);
                    if (!Float.isNaN(fLIZ) && !Float.isInfinite(fLIZ) && fLIZ > 0.0f) {
                        f3 = fLIZ;
                    }
                    float fWidth = rectF.width();
                    float f7 = f4 * fWidth;
                    float f8 = f5 * (fWidth / (size.width / size.height));
                    matrix.postScale(c21665819qi.LJI ? -f3 : f3, f3, rectF.centerX(), rectF.centerY());
                    float f9 = 360;
                    matrix.postRotate(f9 - (f6 % f9), rectF.centerX(), rectF.centerY());
                    matrix.postTranslate(f7, f8);
                    c21665319qd.LLLLLLZZ().setImageMatrix(matrix);
                }
            }
            ((C21665319qd) this.l0).LLLLZIL();
        }
        C1077050e8N c1077050e8N = ((C21665319qd) this.l0).LLLIIIIL;
        if (c1077050e8N != null) {
            c1077050e8N.LJIILIIL = false;
        }
    }

    public static final void run$0(ARunnableS21S0500000_33 aRunnableS21S0500000_33) {
        boolean zLIZ;
        C1C7U.LIZ("CommentImageCropScene@fd78.updateDataByCropInput$1$1$1");
        try {
            aRunnableS21S0500000_33.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentImageCropScene@fd78.updateDataByCropInput$1$1$1");
    }

    public static final void run$1(ARunnableS21S0500000_33 aRunnableS21S0500000_33) {
        boolean zLIZ;
        C1C7U.LIZ("CropScene@5e1.updateDataByCropInput$1$1$1");
        try {
            aRunnableS21S0500000_33.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CropScene@5e1.updateDataByCropInput$1$1$1");
    }

    public ARunnableS21S0500000_33(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj4;
        this.l2 = obj5;
        this.l3 = obj;
        this.l4 = obj3;
    }
}
