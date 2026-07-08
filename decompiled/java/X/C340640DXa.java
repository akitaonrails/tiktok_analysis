package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0DXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C340640DXa extends C0DXR {
    public final int LL;
    public int LLILLJJLI;
    public final boolean LLILLL;

    public C340640DXa(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
        C0I0B.LJFF.LIZJ();
        this.LLILLL = C444960Hcc.LIZJ(C894660Z7w.LIZ());
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        GridLayoutManager gridLayoutManager;
        int i;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
            int iLJFF = gridLayoutManager.LLIZ.LJFF(childAdapterPosition);
            int iLJ = gridLayoutManager.LLIZ.LJ(childAdapterPosition, this.LL);
            if (iLJFF == this.LL) {
                rect.top = (int) C12ES.LIZJ(8.0f, view.getContext());
                rect.bottom = (int) C12ES.LIZJ(8.0f, view.getContext());
            } else {
                rect.bottom = (int) C12ES.LIZJ(16.0f, view.getContext());
            }
            int i2 = this.LLILLJJLI;
            int i3 = this.LL;
            int i4 = (iLJ * i2) / i3;
            int i5 = i2 - (((iLJ + iLJFF) * i2) / i3);
            boolean z = this.LLILLL;
            if (z) {
                i = i5;
            } else {
                i = i4;
            }
            rect.left = i;
            if (!z) {
                i4 = i5;
            }
            rect.right = i4;
        }
    }
}
