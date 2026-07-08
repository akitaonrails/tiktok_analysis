package X;

import Y.AsS33S0200000_19;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0iXp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246590iXp {
    public static final void LIZ(RecyclerView recyclerView, C481090Itn c481090Itn) {
        if (recyclerView != null && c481090Itn != null) {
            recyclerView.setOverScrollMode(0);
            recyclerView.addOnScrollListener(new AsS33S0200000_19(recyclerView, c481090Itn, 1));
        }
    }
}
