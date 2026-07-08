package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;

/* JADX INFO: renamed from: X.15xz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20691715xz extends ViewOnAttachStateChangeListenerC20604515jv {
    public boolean LLILZ;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ModuleManager.LJJJJZ = System.currentTimeMillis();
        super.dispatchDraw(canvas);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LLILZ) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setInPreview(boolean z) {
        this.LLILZ = z;
    }

    public C20691715xz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C20691715xz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
