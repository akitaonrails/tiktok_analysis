package X;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: X.0f1I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractViewOnLongClickListenerC1111100f1I implements View.OnLongClickListener {
    public final boolean LL = true;

    public abstract void LIZ();

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ViewParent parent;
        if (this.LL && view != null && (parent = view.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        LIZ();
        return true;
    }
}
