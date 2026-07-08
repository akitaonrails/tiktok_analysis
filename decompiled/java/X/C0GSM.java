package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0GSM, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GSM extends Drawable {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final Paint LJFF;
    public final C01GW LJI;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawColor(this.LIZ);
        this.LJFF.setShader((Shader) this.LJI.getValue());
        canvas.drawRect(0.0f, 0.0f, this.LIZJ, this.LIZLLL, this.LJFF);
    }

    public C0GSM(int i, int i2, int i3, int i4, int i5) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.LJFF = paint;
        this.LJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1248));
    }
}
