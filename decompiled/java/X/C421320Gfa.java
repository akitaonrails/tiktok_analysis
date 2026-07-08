package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Gfa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421320Gfa extends C1324720kZq {
    public boolean LLJILJIL;
    public final C01GW LLJILJILJ;

    public C421320Gfa(Context context) {
        this(context, null, 6, 0);
    }

    public C421320Gfa(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    private final Drawable getAnchorMarkedDrawable() {
        return (Drawable) this.LLJILJILJ.getValue();
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final boolean getDrawAnchorMark() {
        return this.LLJILJIL;
    }

    @Override // X.C1324720kZq, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable anchorMarkedDrawable;
        try {
            super.onDraw(canvas);
            if (this.LLJILJIL && (anchorMarkedDrawable = getAnchorMarkedDrawable()) != null) {
                float fLIZIZ = C497740JfY.LIZIZ(13);
                canvas.save();
                if (C497740JfY.LJJ()) {
                    canvas.translate(0.0f, getHeight() - fLIZIZ);
                } else {
                    canvas.translate(getWidth() - fLIZIZ, getHeight() - fLIZIZ);
                }
                int i = (int) fLIZIZ;
                anchorMarkedDrawable.setBounds(0, 0, i, i);
                anchorMarkedDrawable.draw(canvas);
                canvas.restore();
            }
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setDrawAnchorMark(boolean z) {
        if (this.LLJILJIL != z) {
            this.LLJILJIL = z;
            invalidate();
        }
    }

    public C421320Gfa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS550S0100000_6(context, 16));
    }

    public /* synthetic */ C421320Gfa(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
