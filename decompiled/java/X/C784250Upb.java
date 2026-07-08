package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Upb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784250Upb extends RecyclerView {
    public boolean LL;
    public List<InterfaceC784370Upn> LLILLJJLI;
    public C20635915oz LLILLL;

    public final C20635915oz getSnapHelper() {
        return this.LLILLL;
    }

    public C784250Upb(Context context) {
        this(context, null, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onScrollStateChanged(int i) {
        View viewLJFF;
        int i2;
        List<InterfaceC784370Upn> list;
        super.onScrollStateChanged(i);
        if (i == 0 && this.LL) {
            this.LL = false;
            C20635915oz c20635915oz = this.LLILLL;
            if (c20635915oz != null && (viewLJFF = c20635915oz.LJFF(getLayoutManager())) != null) {
                int childLayoutPosition = getChildLayoutPosition(viewLJFF);
                RecyclerView.LayoutManager layoutManager = getLayoutManager();
                if (layoutManager != null) {
                    int itemCount = layoutManager.getItemCount();
                    if (childLayoutPosition == 0) {
                        RecyclerView.LayoutManager layoutManager2 = getLayoutManager();
                        if (layoutManager2 != null) {
                            layoutManager2.smoothScrollToPosition(this, new C21673919s1(), 1);
                            return;
                        }
                        return;
                    }
                    if (childLayoutPosition == itemCount - 1) {
                        i2 = itemCount - 2;
                        RecyclerView.LayoutManager layoutManager3 = getLayoutManager();
                        if (layoutManager3 != null) {
                            layoutManager3.smoothScrollToPosition(this, new C21673919s1(), i2);
                        }
                    } else {
                        i2 = childLayoutPosition;
                    }
                    if (i2 != childLayoutPosition || (list = this.LLILLJJLI) == null) {
                        return;
                    }
                    Iterator it2 = ((ArrayList) list).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC784370Upn) it2.next()).LJLJJI(i2 - 1);
                    }
                }
            }
        }
    }

    public final void setSnapHelper(C20635915oz c20635915oz) {
        this.LLILLL = c20635915oz;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onScrolled(int i, int i2) {
        super.onScrolled(i, i2);
        this.LL = true;
    }

    public C784250Upb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
