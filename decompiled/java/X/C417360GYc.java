package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0GYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417360GYc extends C1322110kVd {
    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Exception e) {
            try {
                TryCatchGuardChecker.doCheck(e);
            } catch (RuntimeException e2) {
                TryCatchGuardChecker.doCheck(e2);
                BitmapCrashChecker.doCheck(e2, this);
                throw e2;
            }
        }
    }

    public C417360GYc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
