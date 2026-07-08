package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;

/* JADX INFO: renamed from: X.0RSF, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0RSF extends FrameLayout {
    public C0R5M LL;
    public boolean LLILLJJLI;

    @Override // android.view.ViewGroup
    public final void clearDisappearingChildren() {
        this.LLILLJJLI = false;
        super.clearDisappearingChildren();
    }

    public void setOnPivotChangeListener(C0R78 c0r78) {
    }

    public void setOnScaleChangeListener(C0R79 c0r79) {
    }

    public void setOnTranslationChangeListener(C0RAT c0rat) {
    }

    public C0RSF(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C0R5M c0r5m = this.LL;
        if (c0r5m != null && !this.LLILLJJLI) {
            VideoViewCell videoViewCell = ((C690060R4y) c0r5m).LIZ;
            if (!videoViewCell.f366k0) {
                videoViewCell.LLILLIZIL(0, 0);
            } else {
                videoViewCell.f366k0 = false;
            }
            this.LLILLJJLI = true;
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        getPivotX();
        super.setPivotX(f);
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        getPivotY();
        super.setPivotY(f);
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        getScaleX();
        super.setScaleX(f);
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        getScaleY();
        super.setScaleY(f);
    }

    public void setSurfaceListener(C0R5M c0r5m) {
        this.LL = c0r5m;
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        getTranslationX();
        super.setTranslationX(f);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        getTranslationY();
        super.setTranslationY(f);
    }

    public C0RSF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
