package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.widget.RadiusLayout;

/* JADX INFO: renamed from: X.0h9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193250h9n implements InterfaceC340040DUs {
    public final FrameLayout LL;
    public final View LLILLJJLI;
    public final LinearLayout LLILLL;
    public final RadiusLayout LLILZ;
    public final TuxNavBar LLILZIL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C1193250h9n(FrameLayout frameLayout, View view, LinearLayout linearLayout, RadiusLayout radiusLayout, TuxNavBar tuxNavBar) {
        this.LL = frameLayout;
        this.LLILLJJLI = view;
        this.LLILLL = linearLayout;
        this.LLILZ = radiusLayout;
        this.LLILZIL = tuxNavBar;
    }
}
