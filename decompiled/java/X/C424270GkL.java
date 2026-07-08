package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0GkL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424270GkL extends C0DXR {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public C424270GkL(int i, int i2, int i3) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view) % this.LL;
        if (recyclerView.getLayoutDirection() == 1) {
            rect.right = (childAdapterPosition * this.LLILLL) / this.LL;
        } else {
            rect.left = (childAdapterPosition * this.LLILLL) / this.LL;
        }
        rect.top = this.LLILLJJLI;
    }
}
