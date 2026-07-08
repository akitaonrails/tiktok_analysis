package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.03Zf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C864103Zf extends C0DXR {
    public final int LL;
    public final int LLILLJJLI;

    public C864103Zf(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (recyclerView.getAdapter() != null) {
            if (recyclerView.getChildLayoutPosition(view) == 0) {
                rect.left = this.LLILLJJLI;
                rect.right = this.LL / 2;
            } else if (recyclerView.getChildLayoutPosition(view) == r2.getItemCount() - 1) {
                rect.left = this.LL / 2;
                rect.right = this.LLILLJJLI;
            } else {
                int i = this.LL / 2;
                rect.left = i;
                rect.right = i;
            }
        }
    }
}
