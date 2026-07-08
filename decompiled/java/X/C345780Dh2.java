package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Dh2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C345780Dh2 extends C0DXR {
    public final int LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;

    public C345780Dh2(int i, int i2, boolean z) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = z;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter instanceof AbstractC683560Qra) {
            if (((AbstractC683560Qra) adapter).LL != null) {
                if (childAdapterPosition == 0) {
                    return;
                } else {
                    childAdapterPosition++;
                }
            }
        } else if (adapter instanceof C473800Ii2) {
            adapter.getClass();
            throw null;
        }
        int i = this.LL;
        int i2 = childAdapterPosition % i;
        if (this.LLILLL) {
            int i3 = this.LLILLJJLI;
            rect.left = i3 - ((i2 * i3) / i);
            rect.right = ((i2 + 1) * i3) / i;
            if (childAdapterPosition < i) {
                rect.top = i3;
            }
            rect.bottom = i3;
            return;
        }
        int i4 = this.LLILLJJLI;
        rect.left = (i2 * i4) / i;
        rect.right = i4 - (((i2 + 1) * i4) / i);
        if (childAdapterPosition < i) {
            return;
        }
        rect.top = i4;
    }
}
