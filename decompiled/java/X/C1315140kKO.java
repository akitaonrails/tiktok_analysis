package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SweepGradient;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableArray;

/* JADX INFO: renamed from: X.0kKO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315140kKO extends AbstractC1315160kKQ {
    public final double LLIZLLLIL;
    public final C1313840kII LLJ;
    public final C1313840kII LLJI;

    public C1315140kKO(ReadableArray readableArray) {
        if (readableArray == null) {
            LynxLog.e("ConicGradient", "native parse error array is null");
            return;
        }
        if (readableArray.size() < 4) {
            LynxLog.e("ConicGradient", "native parse error, array.size must be 4  ");
            return;
        }
        this.LLIZLLLIL = readableArray.getDouble(0);
        ReadableArray array = readableArray.getArray(1);
        this.LLJ = new C1313840kII(array.getDynamic(0), array.getInt(1));
        this.LLJI = new C1313840kII(array.getDynamic(2), array.getInt(3));
        LJIIJ(readableArray.getArray(2), readableArray.getArray(3));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        this.LLILLL = Math.max(rect.width(), 1);
        this.LLILZ = Math.max(rect.height(), 1);
        int[] iArr = this.LLILZLL;
        if (iArr != null && iArr.length >= 2) {
            float[] fArr = this.LLIZ;
            if (fArr != null && fArr.length != iArr.length) {
                this.LLILLJJLI = null;
            } else {
                float fLIZIZ = this.LLJ.LIZIZ(this.LLILLL);
                float fLIZIZ2 = this.LLJI.LIZIZ(this.LLILZ);
                this.LLILLJJLI = new SweepGradient(fLIZIZ, fLIZIZ2, this.LLILZLL, this.LLIZ);
                double d = this.LLIZLLLIL - 90.0d;
                if (d != 0.0d) {
                    Matrix matrix = new Matrix();
                    matrix.preRotate((float) d, fLIZIZ, fLIZIZ2);
                    this.LLILLJJLI.setLocalMatrix(matrix);
                }
            }
        } else {
            this.LLILLJJLI = null;
        }
        super.setBounds(rect);
    }
}
