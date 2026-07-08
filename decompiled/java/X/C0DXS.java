package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0DXS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DXS extends C0DXR {
    public static final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        RecyclerView.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof RecyclerView.LayoutParams) && (layoutParams = (RecyclerView.LayoutParams) layoutParams2) != null && layoutParams.getViewLayoutPosition() == 0) {
            rect.top = LL;
        } else {
            rect.top = 0;
        }
    }
}
