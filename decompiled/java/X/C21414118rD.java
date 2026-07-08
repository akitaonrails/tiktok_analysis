package X;

import android.graphics.Canvas;
import android.widget.ImageButton;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.18rD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21414118rD extends ImageButton {
    public int LL;

    public final int getUserSetVisibility() {
        return this.LL;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        LIZ(i, true);
    }

    public final void LIZ(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.LL = i;
        }
    }
}
