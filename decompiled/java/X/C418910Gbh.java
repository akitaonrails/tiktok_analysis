package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0Gbh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418910Gbh extends C427870Gq9 {
    public static final /* synthetic */ int LLJJIJIL = 0;
    public final Paint LLJJI;
    public boolean LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C427870Gq9, com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255);
            super.onDraw(canvas);
            if (this.LLJJIII) {
                canvas.drawCircle(-this.LLJJIJI, getHeight() / 2.0f, this.LLJJIJIIJIL, this.LLJJI);
            }
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C418910Gbh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.LLJJI = paint;
        paint.reset();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
    }
}
