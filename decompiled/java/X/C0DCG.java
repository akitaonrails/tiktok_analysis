package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: renamed from: X.0DCG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DCG implements InterfaceC340040DUs {
    public final ConstraintLayout LL;
    public final TuxIconView LLILLJJLI;
    public final C0DDL LLILLL;
    public final RecyclerView LLILZ;
    public final ConstraintLayout LLILZIL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C0DCG(ConstraintLayout constraintLayout, TuxIconView tuxIconView, C0DDL c0ddl, RecyclerView recyclerView, ConstraintLayout constraintLayout2) {
        this.LL = constraintLayout;
        this.LLILLJJLI = tuxIconView;
        this.LLILLL = c0ddl;
        this.LLILZ = recyclerView;
        this.LLILZIL = constraintLayout2;
    }
}
