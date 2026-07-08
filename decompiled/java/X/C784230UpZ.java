package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0UpZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C784230UpZ extends LinearLayoutManager {
    public boolean LL;

    public C784230UpZ(Context context) {
        super(context, 0, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        C1144200fsg c1144200fsg = new C1144200fsg(recyclerView.getContext());
        c1144200fsg.LJIILL = this.LL;
        c1144200fsg.LIZ = i;
        startSmoothScroll(c1144200fsg);
    }
}
