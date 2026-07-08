package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0DQh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338890DQh extends C0DXR {
    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.set(0, (int) C12ES.LIZJ(8.0f, view.getContext()), 0, 0);
        }
    }
}
