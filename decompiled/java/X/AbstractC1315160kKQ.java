package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableArray;

/* JADX INFO: renamed from: X.0kKQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1315160kKQ extends AbstractC1313950kIT {
    public Shader LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final Paint LLILZIL = new Paint(1);
    public int[] LLILZLL = null;
    public float[] LLIZ = null;

    @Override // X.AbstractC1313950kIT
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.AbstractC1313950kIT
    public final void LIZLLL() {
    }

    @Override // X.AbstractC1313950kIT
    public final void LJ() {
    }

    @Override // X.AbstractC1313950kIT
    public final void LJI(int i, int i2) {
    }

    @Override // X.AbstractC1313950kIT
    public final int LIZ() {
        return this.LLILZ;
    }

    @Override // X.AbstractC1313950kIT
    public final int LIZIZ() {
        return this.LLILLL;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.LLILLJJLI == null) {
            LynxLog.e("gradient", "BackgroundGradientLayer.draw() must be called after setBounds()");
        }
        this.LLILZIL.setShader(this.LLILLJJLI);
        Path path = this.LL;
        if (path != null) {
            canvas.drawPath(path, this.LLILZIL);
        } else {
            canvas.drawRect(getBounds(), this.LLILZIL);
        }
    }

    public final void LJIIJ(ReadableArray readableArray, ReadableArray readableArray2) {
        if (readableArray2.size() != 0 && readableArray.size() != readableArray2.size()) {
            LynxLog.e("Gradient", "native parser error, color and stop must have same size");
            return;
        }
        this.LLILZLL = new int[readableArray.size()];
        if (readableArray2.size() == readableArray.size()) {
            this.LLIZ = new float[readableArray2.size()];
        }
        int i = 0;
        while (true) {
            int[] iArr = this.LLILZLL;
            if (i < iArr.length) {
                iArr[i] = (int) readableArray.getLong(i);
                float[] fArr = this.LLIZ;
                if (fArr != null) {
                    fArr[i] = ((float) readableArray2.getDouble(i)) / 100.0f;
                }
                i++;
            } else {
                return;
            }
        }
    }
}
