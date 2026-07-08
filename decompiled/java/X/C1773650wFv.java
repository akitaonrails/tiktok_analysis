package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0wFv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773650wFv extends C1773640wFu {
    public boolean LLILZLL;

    @Override // X.C1773640wFu
    public final void LIZJ() {
        C1772650wEJ c1772650wEJLIZLLL;
        AbstractC1772270wDh abstractC1772270wDh;
        C18Z6 bodyList;
        InterfaceC1773310wFN controller = getController();
        if (controller == null || (c1772650wEJLIZLLL = controller.LIZLLL()) == null || (abstractC1772270wDh = c1772650wEJLIZLLL.LJ) == null || (bodyList = abstractC1772270wDh.getBodyList()) == null) {
            return;
        }
        bodyList.LJ(new AwS605S0100000_26(this, 797));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LLILZLL && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public C1773650wFv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setItemAnimator(null);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
