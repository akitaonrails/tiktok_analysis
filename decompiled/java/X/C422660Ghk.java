package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Ghk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422660Ghk extends C0DXR {
    public final int LL = 2;
    public final int LLILLJJLI;

    public C422660Ghk(int i) {
        this.LLILLJJLI = i;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (recyclerView.getChildAdapterPosition(view) < this.LL) {
            rect.top = this.LLILLJJLI;
        }
        if (recyclerView.getChildAdapterPosition(view) % this.LL == 0) {
            int i = this.LLILLJJLI;
            rect.left = i;
            rect.right = i / 2;
        } else {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int i2 = this.LL;
            if (childAdapterPosition % i2 == i2 - 1) {
                int i3 = this.LLILLJJLI;
                rect.left = i3 / 2;
                rect.right = i3;
            } else {
                int i4 = this.LLILLJJLI / 2;
                rect.left = i4;
                rect.right = i4;
            }
        }
        rect.bottom = this.LLILLJJLI;
    }
}
