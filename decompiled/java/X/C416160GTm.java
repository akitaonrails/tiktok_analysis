package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0GTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416160GTm extends AbstractC422350GhF {
    public final Context LJFF;
    public final C422330GhD LJI = new C422330GhD();
    public double LJII;
    public double LJIIIIZZ;
    public double LJIIIZ;
    public final Paint LJIIJ;

    public C416160GTm(Context context) {
        this.LJFF = context;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.LJIIJ = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Shader shaderLIZJ;
        C422330GhD c422330GhD;
        Paint paint = this.LJIIJ;
        if (getBounds().bottom > 0 && this.LJII > 0.0d && (c422330GhD = this.LJI) != null) {
            getBounds();
            shaderLIZJ = c422330GhD.LIZJ(this.LJIIIIZZ, this.LJIIIZ);
        } else {
            shaderLIZJ = null;
        }
        paint.setShader(shaderLIZJ);
        if (C426750GoL.LIZLLL(this.LJFF)) {
            canvas.drawPath(this.LIZLLL, this.LJIIJ);
            return;
        }
        int iSave = canvas.save();
        try {
            canvas.scale(-1.0f, 1.0f, getBounds().width() / 2.0f, getBounds().height() / 2.0f);
            canvas.drawPath(this.LIZLLL, this.LJIIJ);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            canvas.restoreToCount(iSave);
            throw th;
        }
    }
}
