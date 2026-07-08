package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: renamed from: X.0DC7, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DC7 implements InterfaceC340040DUs {
    public final ConstraintLayout LL;
    public final FrameLayout LLILLJJLI;
    public final C0DDL LLILLL;
    public final RecyclerView LLILZ;
    public final TuxIconView LLILZIL;
    public final C0DCL LLILZLL;
    public final C0DCT LLIZ;
    public final ConstraintLayout LLIZLLLIL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C0DC7(ConstraintLayout constraintLayout, FrameLayout frameLayout, C0DDL c0ddl, RecyclerView recyclerView, TuxIconView tuxIconView, C0DCL c0dcl, C0DCT c0dct, ConstraintLayout constraintLayout2) {
        this.LL = constraintLayout;
        this.LLILLJJLI = frameLayout;
        this.LLILLL = c0ddl;
        this.LLILZ = recyclerView;
        this.LLILZIL = tuxIconView;
        this.LLILZLL = c0dcl;
        this.LLIZ = c0dct;
        this.LLIZLLLIL = constraintLayout2;
    }
}
