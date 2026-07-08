package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import com.bytedance.sdui.render.bridge.ReadableArray;

/* JADX INFO: renamed from: X.0kJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1314890kJz extends AbstractC1314220kIu {
    public Shader LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final Paint LJ = new Paint(1);
    public int[] LJFF = null;
    public float[] LJI = null;

    @Override // X.AbstractC1314220kIu
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.AbstractC1314220kIu
    public final void LIZLLL() {
    }

    @Override // X.AbstractC1314220kIu
    public final void LJ() {
    }

    @Override // X.AbstractC1314220kIu
    public final void LJFF() {
    }

    @Override // X.AbstractC1314220kIu
    public final int LIZ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC1314220kIu
    public final int LIZIZ() {
        return this.LIZJ;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.LJ.setShader(this.LIZIZ);
        Path path = this.LIZ;
        if (path != null) {
            canvas.drawPath(path, this.LJ);
        } else {
            canvas.drawRect(getBounds(), this.LJ);
        }
    }

    public final void LJII(ReadableArray readableArray, ReadableArray readableArray2) {
        if (readableArray2.size() != 0 && readableArray.size() != readableArray2.size()) {
            return;
        }
        this.LJFF = new int[readableArray.size()];
        if (readableArray2.size() == readableArray.size()) {
            this.LJI = new float[readableArray2.size()];
        }
        int i = 0;
        while (true) {
            int[] iArr = this.LJFF;
            if (i < iArr.length) {
                iArr[i] = readableArray.getInt(i);
                float[] fArr = this.LJI;
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
