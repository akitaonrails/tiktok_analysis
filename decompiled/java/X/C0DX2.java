package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0DX2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DX2 extends C0DXR {
    public final int LL;
    public final int LLILLJJLI;

    public C0DX2(float f, Context context) {
        this.LL = (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
        this.LLILLJJLI = (int) ((16.0f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (childAdapterPosition == 0) {
                rect.left = this.LLILLJJLI;
                rect.right = this.LL / 2;
            } else if (childAdapterPosition == itemCount - 1) {
                int i = this.LL;
                rect.left = i / 2;
                rect.right = i;
            } else {
                int i2 = this.LL / 2;
                rect.left = i2;
                rect.right = i2;
            }
        }
    }
}
