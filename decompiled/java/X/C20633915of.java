package X;

import Y.ARunnableS131S0100000_31;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.15of, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20633915of extends StaggeredGridLayoutManager {
    public final RecyclerView LLJJJJLIIL;

    public C20633915of(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        super(1, 0);
        this.LLJJJJLIIL = viewOnAttachStateChangeListenerC20604515jv;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(C21673919s1 c21673919s1) {
        super.onLayoutCompleted(c21673919s1);
        RecyclerView recyclerView = this.LLJJJJLIIL;
        if (recyclerView != null) {
            HandlerHook.viewPost(recyclerView, new ARunnableS131S0100000_31(this, 122));
        }
    }
}
