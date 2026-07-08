package X;

import Y.ALAdapterS12S0200000_17;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0g0w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149320g0w extends C423520Gj8 {
    public C1149320g0w() {
        this.LLILZ = 250L;
    }

    @Override // X.C423520Gj8, X.AbstractC21674919sB
    public final boolean LJJI(RecyclerView.ViewHolder viewHolder) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = viewHolder.itemView.animate();
        C786410Ut5.T4(viewHolder.itemView, 0.0f);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(350L).setListener(new ALAdapterS12S0200000_17(this, viewHolder, 37)).start();
        return true;
    }

    @Override // X.C423520Gj8, X.AbstractC21674919sB
    public final boolean LJJIII(RecyclerView.ViewHolder viewHolder) {
        super.LJJIII(viewHolder);
        return true;
    }

    @Override // X.AbstractC21674919sB, X.AbstractC21673719rz
    public final boolean LIZLLL(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, C21676319sP c21676319sP, C21676319sP c21676319sP2) {
        return super.LIZLLL(viewHolder, viewHolder2, c21676319sP, c21676319sP2);
    }
}
