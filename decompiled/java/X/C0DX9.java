package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0DX9, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DX9 extends C0DXR {
    public final int LL;

    public C0DX9(int i) {
        this.LL = i;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        GridLayoutManager gridLayoutManager;
        C21681919tJ c21681919tJ;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof C21681919tJ) && (c21681919tJ = (C21681919tJ) layoutParams) != null) {
                int i = gridLayoutManager.LLILLJJLI;
                if (1 == c21681919tJ.LLILLJJLI) {
                    int i2 = c21681919tJ.LL;
                    int i3 = this.LL;
                    rect.left = (i2 * i3) / i;
                    rect.right = i3 - (((i2 + 1) * i3) / i);
                    rect.top = i3;
                }
            }
        }
    }
}
