package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: renamed from: X.06U3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06U3 implements InterfaceC340040DUs {
    public final ConstraintLayout LL;
    public final TuxIconView LLILLJJLI;
    public final TuxIconView LLILLL;
    public final RecyclerView LLILZ;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C06U3(ConstraintLayout constraintLayout, TuxIconView tuxIconView, TuxIconView tuxIconView2, RecyclerView recyclerView) {
        this.LL = constraintLayout;
        this.LLILLJJLI = tuxIconView;
        this.LLILLL = tuxIconView2;
        this.LLILZ = recyclerView;
    }
}
