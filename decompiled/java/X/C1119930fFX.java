package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS82S0200000_13;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: X.0fFX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119930fFX extends C214906198m {
    public boolean LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ ViewGroup LLILLL;

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        if (this.LL) {
            return;
        }
        this.LL = true;
        getContentView().animate().scaleX(0.3f).scaleY(0.3f).alpha(0.0f).setDuration(180L).setInterpolator(new LinearInterpolator()).withEndAction(new ARunnableS113S0100000_13(this, 208)).start();
        this.LLILLJJLI.animate().alpha(0.0f).setDuration(180L).withEndAction(new ARunnableS82S0200000_13(this.LLILLJJLI, this.LLILLL, 65)).start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1119930fFX(ViewGroup viewGroup, int i, int i2, View view, ViewGroup viewGroup2) {
        super((View) viewGroup, i, i2, true);
        this.LLILLJJLI = view;
        this.LLILLL = viewGroup2;
    }
}
