package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0DXp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C340790DXp extends C0DXR {
    public final int LL = 5;
    public final int LLILLJJLI;
    public final int LLILLL;

    public C340790DXp(int i, int i2) {
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int itemCount;
        int i;
        int i2;
        int i3;
        int i4;
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        int i5 = 0;
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = 0;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        int i6 = this.LL;
        int i7 = childAdapterPosition % i6;
        int i8 = childAdapterPosition / i6;
        if (itemCount == 0) {
            i = 0;
        } else {
            i = (itemCount - 1) / i6;
        }
        if (i7 == 0) {
            i2 = 0;
        } else {
            i2 = this.LLILLJJLI / 2;
        }
        rect.left = i2;
        if (i7 == i6 - 1) {
            i3 = 0;
        } else {
            i3 = this.LLILLJJLI / 2;
        }
        rect.right = i3;
        if (i8 == 0) {
            i4 = 0;
        } else {
            i4 = this.LLILLL / 2;
        }
        rect.top = i4;
        if (i8 != i) {
            i5 = this.LLILLL / 2;
        }
        rect.bottom = i5;
    }
}
