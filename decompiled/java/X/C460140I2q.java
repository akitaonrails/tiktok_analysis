package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: X.0I2q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460140I2q extends FrameLayout {
    public final C460100I2m LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final RecyclerView LLILZ;

    public final RecyclerView getRecyclerView() {
        return this.LLILZ;
    }

    public C460140I2q(Context context) {
        super(context);
        C460100I2m c460100I2m = new C460100I2m(context);
        this.LL = c460100I2m;
        this.LLILLJJLI = 8;
        this.LLILLL = 16;
        RecyclerView recyclerView = new RecyclerView(context);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(c460100I2m);
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new C0IDF(this, 4));
        this.LLILZ = recyclerView;
        addView(recyclerView, new FrameLayout.LayoutParams(-1, -2));
    }

    public final void setChips(Iterable<C460110I2n> iterable) {
        C460100I2m c460100I2m = this.LL;
        c460100I2m.getClass();
        c460100I2m.LLILLJJLI = C13LP.LLIIIJ(iterable);
        c460100I2m.LLILLL = new LinkedHashSet();
        c460100I2m.notifyDataSetChanged();
    }

    public final void setOnReselectedListener(InterfaceC460130I2p interfaceC460130I2p) {
        this.LL.LLILZIL = interfaceC460130I2p;
    }

    public final void setOnSelectedChangeListener(InterfaceC460160I2s interfaceC460160I2s) {
        this.LL.LLILZ = interfaceC460160I2s;
    }

    public static void LIZ(C460140I2q c460140I2q, int i, boolean z) {
        C1203200hPq c1203200hPq = C1203200hPq.LIZ;
        C460100I2m c460100I2m = c460140I2q.LL;
        c460100I2m.LLLFZ(i);
        c460100I2m.LLLII(i, z, c1203200hPq);
    }
}
