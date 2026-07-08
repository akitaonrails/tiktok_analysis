package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Hna, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451760Hna extends ViewOnAttachStateChangeListenerC20604515jv {
    public int LLILZ;

    private final LinearLayoutManager getLm() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    public final int getLastPos() {
        return this.LLILZ;
    }

    public final void setLastPos(int i) {
        this.LLILZ = i;
    }

    public C451760Hna(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C451760Hna(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
