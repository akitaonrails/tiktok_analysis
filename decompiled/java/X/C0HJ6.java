package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: renamed from: X.0HJ6, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0HJ6 extends RecyclerView {
    public final boolean LIZJ() {
        if (getLayoutManager() instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) getLayoutManager()).LLIZLLLIL;
        }
        if (getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) getLayoutManager()).getReverseLayout();
        }
        return false;
    }

    public int getEndItemIndex() {
        if (LIZJ()) {
            return 0;
        }
        return getAdapter().getItemCount() - 1;
    }

    public int getFirstPosition() {
        if (getChildCount() < 1) {
            return -1;
        }
        return getChildAdapterPosition(getChildAt(0));
    }

    public int getLastPosition() {
        if (getChildCount() < 1) {
            return -1;
        }
        return getChildAdapterPosition(getChildAt(getChildCount() - 1));
    }

    public int getStartItemIndex() {
        if (LIZJ()) {
            return getAdapter().getItemCount() - 1;
        }
        return 0;
    }

    public C0HJ6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C0HJ6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
