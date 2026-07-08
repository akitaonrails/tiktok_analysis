package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GTk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416140GTk extends AbstractC422350GhF {
    public final Context LJFF;
    public final Paint LJI;

    public C416140GTk(Context context) {
        int iIntValue;
        this.LJFF = context;
        Paint paint = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        paint.setColor(iIntValue);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.LJI = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (C426750GoL.LIZLLL(this.LJFF)) {
            int iSave = canvas.save();
            try {
                canvas.scale(-1.0f, 1.0f, getBounds().width() / 2.0f, getBounds().height() / 2.0f);
                canvas.drawPath(this.LIZLLL, this.LJI);
                canvas.restoreToCount(iSave);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        canvas.drawPath(this.LIZLLL, this.LJI);
    }
}
