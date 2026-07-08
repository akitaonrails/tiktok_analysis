package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Dcj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343110Dcj extends C0DXR {
    public final int LL;

    public C343110Dcj(int i) {
        this.LL = i;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        int iLIZIZ = c21673919s1.LIZIZ();
        int i = (int) (this.LL * recyclerView.getContext().getResources().getDisplayMetrics().density);
        if (childLayoutPosition != 0) {
            rect.top = i;
        }
        if (childLayoutPosition == iLIZIZ - 1) {
            rect.bottom = i;
        }
    }
}
