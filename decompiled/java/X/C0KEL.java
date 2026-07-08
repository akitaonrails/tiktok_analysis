package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0KEL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KEL extends C0DXR {
    public final int LL;

    public C0KEL(int i) {
        this.LL = i;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (recyclerView.getChildAdapterPosition(view) > 0) {
            rect.top = this.LL;
        }
    }
}
