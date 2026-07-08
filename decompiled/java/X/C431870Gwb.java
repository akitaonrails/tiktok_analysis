package X;

import android.graphics.Canvas;
import android.text.StaticLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Gwb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431870Gwb {
    public static final void LIZ(float f, float f2, Canvas canvas, StaticLayout staticLayout) {
        int iSave = canvas.save();
        canvas.translate(f, f2);
        try {
            staticLayout.draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            canvas.restoreToCount(iSave);
            throw th;
        }
    }
}
