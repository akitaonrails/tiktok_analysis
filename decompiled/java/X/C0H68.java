package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0H68, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H68 extends C0DXR {
    public final int LL;

    public C0H68(int i) {
        this.LL = i;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            if (!C0H4W.LIZ()) {
                rect.left = 0;
                return;
            } else {
                rect.right = 0;
                return;
            }
        }
        if (!C0H4W.LIZ()) {
            rect.left = this.LL;
        } else {
            rect.right = this.LL;
        }
    }
}
