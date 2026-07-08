package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0HsA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454600HsA extends C0DXR {
    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        boolean zEquals;
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            if (C497740JfY.LJII() == null) {
                zEquals = false;
            } else {
                zEquals = "ar".equals(C786410Ut5.t2(C497740JfY.LJII().getResources().getConfiguration().locale));
            }
            if (zEquals) {
                rect.set(0, 0, (int) C497740JfY.LIZIZ(6.0f), 0);
                return;
            } else {
                rect.set((int) C497740JfY.LIZIZ(6.0f), 0, 0, 0);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }
}
