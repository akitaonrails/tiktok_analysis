package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ViewFlipper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.navigation.TuxNavBar;

/* JADX INFO: renamed from: X.0h9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193230h9l implements InterfaceC340040DUs {
    public final FrameLayout LL;
    public final TuxIconView LLILLJJLI;
    public final ViewFlipper LLILLL;
    public final ConstraintLayout LLILZ;
    public final View LLILZIL;
    public final FrameLayout LLILZLL;
    public final TuxNavBar LLIZ;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C1193230h9l(FrameLayout frameLayout, TuxIconView tuxIconView, ViewFlipper viewFlipper, ConstraintLayout constraintLayout, View view, FrameLayout frameLayout2, TuxNavBar tuxNavBar) {
        this.LL = frameLayout;
        this.LLILLJJLI = tuxIconView;
        this.LLILLL = viewFlipper;
        this.LLILZ = constraintLayout;
        this.LLILZIL = view;
        this.LLILZLL = frameLayout2;
        this.LLIZ = tuxNavBar;
    }
}
