package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1A9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class ViewTreeObserverOnWindowFocusChangeListenerC2174801A9m implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ View LL;
    public final /* synthetic */ View LLILLJJLI;

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            new C1A6Q(this.LLILLJJLI).LIZ();
            this.LL.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
            this.LL.setTag(R.id.yzq, null);
        }
    }

    public ViewTreeObserverOnWindowFocusChangeListenerC2174801A9m(View view, View view2) {
        this.LL = view;
        this.LLILLJJLI = view2;
    }
}
