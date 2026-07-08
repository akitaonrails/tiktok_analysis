package X;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.06U2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06U2 implements InterfaceC340040DUs {
    public final LinearLayout LL;
    public final C1749280vcc LLILLJJLI;
    public final RecyclerView LLILLL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C06U2(LinearLayout linearLayout, C1749280vcc c1749280vcc, RecyclerView recyclerView) {
        this.LL = linearLayout;
        this.LLILLJJLI = c1749280vcc;
        this.LLILLL = recyclerView;
    }
}
