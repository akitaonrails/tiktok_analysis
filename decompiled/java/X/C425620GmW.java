package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: renamed from: X.0GmW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425620GmW extends C0DXR {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public C425620GmW(int i, int i2, int i3) {
        i = (i3 & 1) != 0 ? 6 : i;
        i2 = (i3 & 2) != 0 ? 3 : i2;
        int i4 = (i3 & 4) == 0 ? 0 : 6;
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i4;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        C21681819tI c21681819tI;
        int childAdapterPosition;
        int iLJJIII;
        int i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = null;
        if (!(layoutParams instanceof C21681819tI) || (c21681819tI = (C21681819tI) layoutParams) == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) == -1) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        }
        if (staggeredGridLayoutManager != null) {
            iLJJIII = staggeredGridLayoutManager.LJJIII();
        } else {
            iLJJIII = 2;
        }
        int iLIZ = c21681819tI.LIZ();
        int i2 = iLJJIII - 1;
        if (i2 < 0) {
            i2 = 0;
        }
        int iLJ = C13LZ.LJ(iLIZ, 0, i2);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL)));
        if (c21681819tI.LLILLJJLI) {
            rect.left = iLIZIZ;
            rect.right = iLIZIZ;
        } else if (iLJJIII >= 2) {
            rect.left = iLIZIZ - ((iLJ * iLIZIZ) / iLJJIII);
            rect.right = ((iLJ + 1) * iLIZIZ) / iLJJIII;
        }
        if (childAdapterPosition < iLJJIII) {
            i = this.LL;
        } else {
            i = this.LLILLJJLI;
        }
        rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        rect.bottom = 0;
    }
}
