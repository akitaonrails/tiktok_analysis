package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0DXI, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DXI extends C0DXR {
    public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
    public final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int headerCount;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        if ((recyclerView instanceof ViewOnAttachStateChangeListenerC20604515jv) && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) recyclerView) != null) {
            headerCount = viewOnAttachStateChangeListenerC20604515jv.getHeaderCount();
        } else {
            headerCount = 0;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition < headerCount) {
            return;
        }
        if ((childAdapterPosition - headerCount) % 2 == 0) {
            rect.left = this.LL;
            rect.right = this.LLILLJJLI;
            rect.bottom = this.LLILLL;
        } else {
            rect.right = this.LL;
            rect.left = this.LLILLJJLI;
            rect.bottom = this.LLILLL;
        }
    }
}
