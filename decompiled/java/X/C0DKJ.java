package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0DKJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DKJ extends C0DXR {
    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        RecyclerView.LayoutManager layoutManager;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int height = recyclerView.getHeight();
        RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
        if (layoutManager2 != null && Integer.valueOf(layoutManager2.getItemCount() - 1) != null && (layoutManager = recyclerView.getLayoutManager()) != null && childAdapterPosition == layoutManager.getItemCount() - 1) {
            rect.bottom = height - view.getHeight();
        }
    }
}
