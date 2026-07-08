package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Size;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FBF, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FBF implements C0FBW {
    public boolean LIZ;
    public C0EO0 LIZIZ;
    public final float LIZJ = C0EGK.LIZIZ() * 1.5f;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1311));

    @Override // X.C0FBW
    public final int LIZIZ() {
        return 1;
    }

    @Override // X.C0FBW
    public final void LIZ(Canvas canvas, Size size, C0FEW c0few) {
        C0EO0 c0eo0;
        if (!this.LIZ || (c0eo0 = this.LIZIZ) == null) {
            return;
        }
        float f = c0eo0.LJ;
        float f2 = c0eo0.LIZJ;
        float f3 = c0eo0.LIZLLL;
        int iSave = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            float f4 = this.LIZJ / 2.0f;
            float f5 = c0eo0.LIZJ;
            float f6 = c0eo0.LIZ / 2.0f;
            float f7 = c0eo0.LIZLLL;
            float f8 = c0eo0.LIZIZ / 2.0f;
            canvas.drawRoundRect(new RectF((f5 - f6) + f4, (f7 - f8) + f4, (f5 + f6) - f4, (f7 + f8) - f4), 0.0f, 0.0f, (Paint) this.LIZLLL.getValue());
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            canvas.restoreToCount(iSave);
            throw th;
        }
    }
}
