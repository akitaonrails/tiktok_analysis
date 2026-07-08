package X;

import Y.ARunnableS98S0200000_29;
import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.125O, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C125O extends HorizontalScrollView {
    public C125O(Context context) {
        super(context, null);
        setOverScrollMode(2);
    }

    public final void LIZ(View view) {
        if (getWidth() == 0) {
            HandlerHook.viewPostDelay(this, new ARunnableS98S0200000_29(this, view, 8), 100L);
        } else {
            smoothScrollTo(((view.getLeft() + view.getRight()) / 2) - (getWidth() / 2), 0);
        }
    }
}
