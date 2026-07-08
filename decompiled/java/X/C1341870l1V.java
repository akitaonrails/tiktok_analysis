package X;

import Y.ARunnableS121S0100000_21;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0l1V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341870l1V extends C21674119s3 {
    public final RecyclerView LJIILL;
    public final int LJIILLIIL;
    public final boolean LJIIZILJ;
    public boolean LJIJ;

    @Override // X.C21674119s3
    public final int LJIILL() {
        return -1;
    }

    @Override // X.C21674119s3, X.AbstractC21674019s2
    public final void LJFF() {
        super.LJFF();
        if (this.LJIJ) {
            HandlerHook.viewPostDelay(this.LJIILL, new ARunnableS121S0100000_21(this, 169), 150L);
        }
    }

    @Override // X.C21674119s3
    public final int LJIIJ(int i, View view) {
        LinearLayoutManager linearLayoutManager;
        AbstractC21673619ry adapter;
        int iLJIIJ = super.LJIIJ(i, view);
        RecyclerView recyclerView = this.LJIILL;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        boolean z = false;
        if (linearLayoutManager != null && (adapter = recyclerView.getAdapter()) != null) {
            int itemCount = adapter.getItemCount();
            if (iLJIIJ == 0) {
                z = this.LJIIZILJ;
            } else if (iLJIIJ >= 0 || linearLayoutManager.findLastCompletelyVisibleItemPosition() <= itemCount - 1) {
                z = true;
            }
        }
        this.LJIJ = z;
        return iLJIIJ;
    }

    public C1341870l1V(int i, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, boolean z) {
        super(viewOnAttachStateChangeListenerC20604515jv.getContext());
        this.LJIILL = viewOnAttachStateChangeListenerC20604515jv;
        this.LJIILLIIL = i;
        this.LJIIZILJ = z;
        this.LJIJ = true;
    }
}
