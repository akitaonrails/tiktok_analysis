package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;

/* JADX INFO: renamed from: X.19sA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21674819sA implements InterfaceC21677119sX {
    public final /* synthetic */ RecyclerView LIZ;

    public final int LIZ() {
        return this.LIZ.getChildCount();
    }

    public C21674819sA(RecyclerView recyclerView) {
        this.LIZ = recyclerView;
    }

    public final void LIZIZ(int i) {
        View childAt = this.LIZ.getChildAt(i);
        if (childAt != null) {
            this.LIZ.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        RecyclerView recyclerView = this.LIZ;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(recyclerView, null);
        recyclerView.removeViewAt(i);
    }
}
