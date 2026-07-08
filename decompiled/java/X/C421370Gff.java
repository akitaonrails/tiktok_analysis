package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;

/* JADX INFO: renamed from: X.0Gff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421370Gff extends C1324720kZq {
    public AnimatedDrawable2 LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;

    public final void setAutoPlay(boolean z) {
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final int getAdjustSvMode() {
        return this.LLJILLL;
    }

    public final AnimatedDrawable2 getAnimatedDrawable2() {
        return this.LLJILJIL;
    }

    public final boolean getUseWrapContent() {
        return this.LLJILJILJ;
    }

    @Override // X.C1324720kZq, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setAdjustSvMode(int i) {
        this.LLJILLL = i;
    }

    public final void setAnimatedDrawable2(AnimatedDrawable2 animatedDrawable2) {
        this.LLJILJIL = animatedDrawable2;
    }

    public final void setUseWrapContent(boolean z) {
        this.LLJILJILJ = z;
    }

    public C421370Gff(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
