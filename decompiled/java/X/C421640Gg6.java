package X;

import Y.ALAdapterS3S0100000_6;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0Gg6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C421640Gg6 extends C1295960jpS {
    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelAnimation();
        C20597815iq.LIZ(this);
    }

    private void setImageFolder(String str) {
        setImageAssetsFolder(str);
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

    public C421640Gg6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setImageFolder("images");
        addAnimatorListener(new ALAdapterS3S0100000_6(this, 40));
    }
}
