package X;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0kF3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class ViewOnAttachStateChangeListenerC1311830kF3 implements View.OnAttachStateChangeListener {
    public final WeakReference<C1311820kF2> LL;
    public final String LLILLJJLI;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C1311820kF2 c1311820kF2 = this.LL.get();
        if (c1311820kF2 != null) {
            c1311820kF2.LJII(this.LLILLJJLI);
        }
    }

    public ViewOnAttachStateChangeListenerC1311830kF3(C1311820kF2 c1311820kF2, String str) {
        this.LL = new WeakReference<>(c1311820kF2);
        this.LLILLJJLI = str;
    }
}
