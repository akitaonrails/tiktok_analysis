package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0GlF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424830GlF extends C0DXR {
    public final int LL;
    public final int LLILLJJLI;
    public final InterfaceC424850GlH LLILLL;

    public C424830GlF(int i, int i2) {
        InterfaceC424850GlH interfaceC424850GlH = new InterfaceC424850GlH() { // from class: X.0GlG
            @Override // X.InterfaceC424850GlH
            public final void LIZ() {
            }
        };
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = interfaceC424850GlH;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        boolean z;
        int itemCount;
        int i;
        int i2;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        this.LLILLL.LIZ();
        int i3 = this.LL;
        int i4 = childAdapterPosition % i3;
        boolean z2 = true;
        if (childAdapterPosition / i3 == 0) {
            z = true;
        } else {
            z = false;
        }
        int i5 = i3 - 1;
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = 0;
        }
        if (i4 != Math.min(i5, itemCount - 1)) {
            z2 = false;
        }
        if (z) {
            i = 0;
        } else {
            i = this.LLILLJJLI;
        }
        rect.top = i;
        if (z2) {
            i2 = 0;
        } else {
            i2 = this.LLILLJJLI;
        }
        rect.right = i2;
        rect.bottom = 0;
        rect.left = 0;
    }
}
