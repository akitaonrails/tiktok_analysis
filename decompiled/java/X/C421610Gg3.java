package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gg3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421610Gg3 extends C1295960jpS {
    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelAnimation();
        C20597815iq.LIZ(this);
    }

    @Override // X.C1295960jpS, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C421610Gg3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C421610Gg3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setAnimation(R.raw.dots_loading_lottie);
        setRepeatCount(-1);
    }
}
