package X;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0LqM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555400LqM implements InterfaceC340040DUs {
    public final FrameLayout LL;
    public final TuxIconView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final FrameLayout LLILZ;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public C555400LqM(FrameLayout frameLayout, TuxIconView tuxIconView, TuxTextView tuxTextView, FrameLayout frameLayout2) {
        this.LL = frameLayout;
        this.LLILLJJLI = tuxIconView;
        this.LLILLL = tuxTextView;
        this.LLILZ = frameLayout2;
    }
}
