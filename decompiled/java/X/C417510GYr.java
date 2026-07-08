package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0GYr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417510GYr extends C731940SnQ {
    public final int LLJIJIL;

    @Override // X.C1303280k1G, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C731940SnQ
    public final void LJIIIZ(boolean z) {
        int i;
        if (z) {
            i = (int) (this.LLJIJIL * 1.4f);
        } else {
            i = this.LLJIJIL;
        }
        if (getLayoutParams().width != i && i > 0) {
            getLayoutParams().width = i;
            getLayoutParams().height = i;
            requestLayout();
        }
    }

    @Override // X.C731940SnQ, X.C1303280k1G, X.C1295960jpS, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C417510GYr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    }
}
