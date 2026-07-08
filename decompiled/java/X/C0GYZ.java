package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0GYZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GYZ extends C422820Gi0 {
    public final Path LLJJIII;

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C422820Gi0, X.C424620Gku, X.C424700Gl2, com.ss.android.ugc.aweme.base.ui.RemoteImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            canvas.save();
            canvas.clipPath(this.LLJJIII, Region.Op.DIFFERENCE);
            super.onDraw(canvas);
            canvas.restore();
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C0GYZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Path path = new Path();
        this.LLJJIII = path;
        float fLIZIZ = C418440Gaw.LIZIZ(9);
        float fLIZIZ2 = C418440Gaw.LIZIZ(16);
        float fLIZIZ3 = C418440Gaw.LIZIZ(12);
        float fLIZIZ4 = C418440Gaw.LIZIZ(28);
        if (C426750GoL.LIZLLL(context)) {
            path.addCircle((fLIZIZ4 - fLIZIZ2) - fLIZIZ, fLIZIZ3 + fLIZIZ, fLIZIZ, Path.Direction.CCW);
        } else {
            path.addCircle(fLIZIZ2 + fLIZIZ, fLIZIZ3 + fLIZIZ, fLIZIZ, Path.Direction.CCW);
        }
    }
}
