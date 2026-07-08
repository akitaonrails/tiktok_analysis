package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: renamed from: X.0DDE, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DDE implements InterfaceC340040DUs {
    public final LinearLayout LL;
    public final FrameLayout LLILLJJLI;
    public final TuxIconView LLILLL;
    public final TuxIconView LLILZ;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C0DDE(LinearLayout linearLayout, FrameLayout frameLayout, TuxIconView tuxIconView, TuxIconView tuxIconView2) {
        this.LL = linearLayout;
        this.LLILLJJLI = frameLayout;
        this.LLILLL = tuxIconView;
        this.LLILZ = tuxIconView2;
    }
}
