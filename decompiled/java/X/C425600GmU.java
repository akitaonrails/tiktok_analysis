package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0GmU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425600GmU extends C0DXR {
    public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
    public final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d)));
    public final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7));

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int headerCount;
        C21681819tI c21681819tI;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = null;
        if (recyclerView instanceof ViewOnAttachStateChangeListenerC20604515jv) {
            viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) recyclerView;
        }
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            headerCount = viewOnAttachStateChangeListenerC20604515jv.getHeaderCount();
        } else {
            headerCount = 0;
        }
        if (recyclerView.getChildAdapterPosition(view) < headerCount) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof C21681819tI) && (c21681819tI = (C21681819tI) layoutParams) != null) {
            if (c21681819tI.LIZ() == 0) {
                rect.set(this.LL, 0, this.LLILLJJLI, this.LLILLL);
            } else {
                rect.set(this.LLILLJJLI, 0, this.LL, this.LLILLL);
            }
        }
    }
}
