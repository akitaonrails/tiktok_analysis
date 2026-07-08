package X;

import Y.ARunnableS118S0100000_18;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0gP8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1164320gP8 extends ViewOnAttachStateChangeListenerC20604515jv {
    public C1164320gP8(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1164320gP8(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    @Override // X.ViewOnAttachStateChangeListenerC20604515jv, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LinearLayoutManager linearLayoutManager;
        super.onLayout(z, i, i2, i3, i4);
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null || linearLayoutManager.getItemCount() == 0) {
            return;
        }
        if (linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0 && linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1) {
            if (!linearLayoutManager.mStackFromEnd) {
                linearLayoutManager.setStackFromEnd(true);
                HandlerHook.viewPost(this, new ARunnableS118S0100000_18(this, 20));
                return;
            }
            return;
        }
        if (!linearLayoutManager.mStackFromEnd) {
            return;
        }
        linearLayoutManager.setStackFromEnd(false);
        HandlerHook.viewPost(this, new ARunnableS118S0100000_18(this, 21));
    }
}
