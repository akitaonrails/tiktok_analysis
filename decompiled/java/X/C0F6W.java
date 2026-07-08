package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0F6W, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F6W extends C0DXR {
    public final int LL;
    public final int LLILLJJLI;

    public C0F6W(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        RecyclerView.LayoutManager layoutManager;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            rect.top = this.LL;
        }
        RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
        if (layoutManager2 != null && Integer.valueOf(layoutManager2.getItemCount() - 1) != null && (layoutManager = recyclerView.getLayoutManager()) != null && childAdapterPosition == layoutManager.getItemCount() - 1) {
            rect.bottom = this.LLILLJJLI;
        }
    }
}
