package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;

/* JADX INFO: renamed from: X.0DUR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DUR implements InterfaceC340040DUs {
    public final FrameLayout LL;
    public final FrameLayout LLILLJJLI;
    public final RecyclerView LLILLL;
    public final TuxNavBar LLILZ;
    public final TuxTextView LLILZIL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C0DUR(FrameLayout frameLayout, FrameLayout frameLayout2, RecyclerView recyclerView, TuxNavBar tuxNavBar, TuxTextView tuxTextView) {
        this.LL = frameLayout;
        this.LLILLJJLI = frameLayout2;
        this.LLILLL = recyclerView;
        this.LLILZ = tuxNavBar;
        this.LLILZIL = tuxTextView;
    }
}
