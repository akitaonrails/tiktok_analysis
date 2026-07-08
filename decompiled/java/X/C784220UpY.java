package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;

/* JADX INFO: renamed from: X.0UpY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C784220UpY extends FrameLayout {
    public C784250Upb LL;
    public C784230UpZ LLILLJJLI;
    public C20635915oz LLILLL;
    public boolean LLILZ;

    public int getHalfScreenWidth() {
        return (int) (((getResources().getDisplayMetrics().widthPixels * 1.0f) / 4.0f) * 3.0f);
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        return C497740JfY.LJJ() ? 0.0f : 1.0f;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        return C497740JfY.LJJ() ? 1.0f : 0.0f;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LLILZ) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setAdapter(AbstractC21673619ry abstractC21673619ry) {
        C784250Upb c784250Upb = this.LL;
        if (c784250Upb == null) {
            return;
        }
        c784250Upb.setAdapter(new C0JAG(this, abstractC21673619ry));
    }

    public void setDisableScroll(boolean z) {
        this.LLILZ = z;
    }

    public C784220UpY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        this.LL = new C784250Upb(getContext());
        this.LLILLL = new C20635915oz();
        C784230UpZ c784230UpZ = new C784230UpZ(getContext());
        this.LLILLJJLI = c784230UpZ;
        this.LL.setLayoutManager(c784230UpZ);
        this.LLILLL.LIZIZ(this.LL);
        C784250Upb c784250Upb = this.LL;
        if (c784250Upb instanceof C784250Upb) {
            c784250Upb.setSnapHelper(this.LLILLL);
        }
        addView(this.LL, new FrameLayout.LayoutParams(-1, -1));
        setWillNotDraw(false);
    }
}
