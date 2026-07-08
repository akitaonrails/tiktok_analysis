package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0EJC, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EJC extends C0DXR {
    public final boolean LL;
    public int LLILLJJLI;
    public int LLILLL;

    public C0EJC(int i, boolean z) {
        this.LL = z;
        this.LLILLJJLI = C390810FTz.LIZ(i);
        this.LLILLL = i;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int i;
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            if (this.LL) {
                i = this.LLILLJJLI;
            } else {
                i = 0;
            }
            rect.left = i;
            rect.right = this.LLILLJJLI / 2;
            return;
        }
        if (recyclerView.getAdapter() != null && childAdapterPosition == r0.getItemCount() - 1) {
            int i2 = this.LLILLJJLI;
            rect.left = i2 / 2;
            rect.right = i2;
        } else {
            int i3 = this.LLILLJJLI / 2;
            rect.left = i3;
            rect.right = i3;
        }
    }
}
