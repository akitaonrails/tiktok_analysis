package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.friendstab.ui.FixedLinearlayoutManager;

/* JADX INFO: renamed from: X.0e3T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1074010e3T extends ViewOnAttachStateChangeListenerC20604515jv {
    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        LinearLayoutManager linearLayoutManager;
        boolean z;
        if (C319860CgK.LIZ()) {
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            if (linearLayoutManager == null) {
                return false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("canScrollVertically:super.canScrollVertically(direction),layoutManager.findFirstVisibleItemPosition() == 0:");
            if (linearLayoutManager.findFirstVisibleItemPosition() == 0) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            sbLIZ.append(",layoutManager.findFirstVisibleItemPosition() :");
            sbLIZ.append(linearLayoutManager.findFirstVisibleItemPosition());
            C2188811AlT.LIZIZ(sbLIZ);
            if (linearLayoutManager.findFirstVisibleItemPosition() <= 1) {
                return false;
            }
            return true;
        }
        return super.canScrollVertically(i);
    }

    public final void setMode(C0N07 c0n07) {
        if (c0n07 == C0N07.LAST_ITEM) {
            setNestedScrollingEnabled(false);
        }
        AbstractC21673619ry adapter = getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.0e3U
                @Override // X.AbstractC471570IeR
                public final void LIZLLL(int i, int i2) {
                    if (i == 2) {
                        this.LIZ.smoothScrollToPosition(0);
                    }
                }
            });
        }
    }

    public C1074010e3T(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1074010e3T(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new FixedLinearlayoutManager(context));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
