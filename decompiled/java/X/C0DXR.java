package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0DXR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public abstract class C0DXR {
    public void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
    }

    public void LIZLLL(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
    }

    public void LIZ(int i, Rect rect) {
        rect.set(0, 0, 0, 0);
    }

    public void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        LIZ(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), rect);
    }
}
