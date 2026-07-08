package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Shader;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableArray;

/* JADX INFO: renamed from: X.0kKP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315150kKP extends AbstractC1315160kKQ {
    public final double LLIZLLLIL;
    public final int LLJ;
    public boolean LLJI;

    public C1315150kKP(ReadableArray readableArray) {
        int i;
        if (readableArray == null) {
            LynxLog.e("LinearGradient", "native parse error array is null");
            return;
        }
        if (readableArray.size() < 3) {
            LynxLog.e("LinearGradient", "native parse error, array.size must be 4  ");
            return;
        }
        this.LLIZLLLIL = readableArray.getDouble(0);
        LJIIJ(readableArray.getArray(1), readableArray.getArray(2));
        if (readableArray.size() == 4) {
            i = readableArray.getInt(3);
        } else {
            i = 9;
        }
        this.LLJ = i;
    }

    @Override // X.AbstractC1313950kIT
    public final void LJIIIIZZ(boolean z) {
        this.LLJI = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0145  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setBounds(android.graphics.Rect r20) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1315150kKP.setBounds(android.graphics.Rect):void");
    }

    public static void LJIIL(int[] iArr, float[] fArr, int i, int[] iArr2) {
        C1315170kKR c1315170kKR = new C1315170kKR();
        c1315170kKR.LIZ(iArr[0]);
        C1315170kKR c1315170kKR2 = new C1315170kKR();
        int i2 = 1;
        c1315170kKR2.LIZ(iArr[1]);
        float f = fArr[0];
        float f2 = fArr[1] - f;
        for (int i3 = 0; i3 < i; i3++) {
            float f3 = i3 / (i - 1.0f);
            float f4 = fArr[i2];
            if (f3 > f4) {
                c1315170kKR.LIZLLL = c1315170kKR2.LIZLLL;
                c1315170kKR.LIZ = c1315170kKR2.LIZ;
                c1315170kKR.LIZIZ = c1315170kKR2.LIZIZ;
                c1315170kKR.LIZJ = c1315170kKR2.LIZJ;
                i2++;
                c1315170kKR2.LIZ(iArr[i2]);
                f2 = fArr[i2] - f4;
                f = f4;
            }
            float f5 = (f3 - f) / f2;
            float f6 = 1.0f - f5;
            iArr2[i3] = (((int) (((c1315170kKR.LIZLLL * f6) + (c1315170kKR2.LIZLLL * f5)) * 255.0f)) << 24) | (((int) (((c1315170kKR.LIZ * f6) + (c1315170kKR2.LIZ * f5)) * 255.0f)) << 16) | (((int) (((c1315170kKR.LIZIZ * f6) + (c1315170kKR2.LIZIZ * f5)) * 255.0f)) << 8) | ((int) (((c1315170kKR.LIZJ * f6) + (c1315170kKR2.LIZJ * f5)) * 255.0f));
        }
    }

    public final void LJIIJJI(PointF pointF, PointF pointF2, int[] iArr, float[] fArr, float f) {
        int i;
        int i2;
        float[] fArr2 = fArr;
        int length = (int) PointF.length(pointF2.x - pointF.x, pointF2.y - pointF.y);
        if (length <= 0) {
            this.LLILLJJLI = null;
            return;
        }
        int[] iArr2 = new int[length];
        if (fArr2 == null) {
            fArr2 = new float[iArr.length];
            if (iArr.length == 2) {
                fArr2[0] = 0.0f;
                fArr2[1] = 1.0f;
            } else if (iArr.length > 2) {
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    fArr2[i3] = i3 / (iArr.length - 1);
                }
            }
        }
        if (fArr2[0] != 0.0f) {
            i = 1;
        } else {
            i = 0;
        }
        if (fArr2[fArr2.length - 1] != 1.0f) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int length2 = fArr2.length + i + i2;
        if (length2 != fArr2.length) {
            int[] iArr3 = new int[length2];
            float[] fArr3 = new float[length2];
            if (i != 0) {
                iArr3[0] = iArr[0];
                fArr3[0] = 0.0f;
            }
            System.arraycopy(iArr, 0, iArr3, i, iArr.length);
            System.arraycopy(fArr2, 0, fArr3, i, fArr2.length);
            if (i2 != 0) {
                int i4 = length2 - 1;
                iArr3[i4] = iArr[iArr.length - 1];
                fArr3[i4] = 1.0f;
            }
            LJIIL(iArr3, fArr3, length, iArr2);
        } else {
            LJIIL(iArr, fArr2, length, iArr2);
        }
        this.LLILLJJLI = new BitmapShader(Bitmap.createBitmap(iArr2, length, 1, Bitmap.Config.ARGB_8888), Shader.TileMode.CLAMP, Shader.TileMode.REPEAT);
        Matrix matrix = new Matrix();
        matrix.postRotate(f + 270.0f);
        matrix.postTranslate(pointF.x, pointF.y);
        this.LLILLJJLI.setLocalMatrix(matrix);
    }
}
