package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.12XK, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12XK extends RecyclerView {
    public boolean LL;

    public final void LIZLLL() {
        if (this.LL) {
            this.LL = false;
            stopScroll();
        }
    }

    public final void setRunning(boolean z) {
        this.LL = z;
    }

    public C12XK(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZJ(int i, int i2) {
        if (getLayoutManager() instanceof LinearLayoutManager) {
            ((LinearLayoutManager) getLayoutManager()).scrollToPositionWithOffset(i, i2);
            return;
        }
        throw new IllegalArgumentException("layoutManager must be a subclass of LinearLayoutManager");
    }

    public C12XK(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
