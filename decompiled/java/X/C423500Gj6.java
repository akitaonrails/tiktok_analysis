package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Gj6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423500Gj6 extends C0DXR {
    public final int LL;

    public C423500Gj6(int i) {
        this.LL = i;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (recyclerView.getLayoutDirection() == 1) {
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.right = this.LL;
            }
            rect.left = this.LL;
        } else {
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.left = this.LL;
            }
            rect.right = this.LL;
        }
    }
}
