package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: renamed from: X.03Ua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C850603Ua extends LinearLayoutManager {
    public boolean LL;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return this.LL && super.canScrollHorizontally();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return this.LL && super.canScrollVertically();
    }

    public C850603Ua(Context context, int i, boolean z) {
        super(context, i, z);
        this.LL = true;
    }
}
