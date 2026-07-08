package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0H3E, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H3E {
    public final C0H3B LIZ;

    public C0H3E(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        C0H3B c0h3b = new C0H3B();
        this.LIZ = c0h3b;
        recyclerView.setAdapter(c0h3b);
    }
}
