package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.16nn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C20883316nn extends AbstractC21144517op {
    @Override // X.AbstractC21144517op
    public final View LJIILIIL(final Context context, final AttributeSet attributeSet) {
        return new LinearLayout(context, attributeSet) { // from class: X.0lY0
            public ViewOnAttachStateChangeListenerC20604515jv LL;
            public boolean LLILLJJLI;

            public final boolean getNeedIntercept() {
                return this.LLILLJJLI;
            }

            public final ViewOnAttachStateChangeListenerC20604515jv getRecyclerView() {
                return this.LL;
            }

            @Override // android.view.ViewGroup
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
                if (!this.LLILLJJLI) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                if (motionEvent.getActionMasked() != 0 || (viewOnAttachStateChangeListenerC20604515jv = this.LL) == null || !C14P7.LJ(motionEvent.getRawX(), motionEvent.getRawY(), viewOnAttachStateChangeListenerC20604515jv) || viewOnAttachStateChangeListenerC20604515jv.findChildViewUnder(motionEvent.getX() - viewOnAttachStateChangeListenerC20604515jv.getLeft(), motionEvent.getY() - viewOnAttachStateChangeListenerC20604515jv.getTop()) != null) {
                    return false;
                }
                return true;
            }

            public final void setNeedIntercept(boolean z) {
                this.LLILLJJLI = z;
            }

            public final void setRecyclerView(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
                this.LL = viewOnAttachStateChangeListenerC20604515jv;
            }
        };
    }
}
