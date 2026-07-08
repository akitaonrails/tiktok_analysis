package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0DXQ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DXQ extends C0DXR {
    public final float LL;
    public final float LLILLJJLI;
    public final float LLILLL;

    public C0DXQ(float f, float f2, float f3) {
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = f3;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        boolean z;
        if (recyclerView.getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            if (z) {
                rect.right = (int) C497740JfY.LIZIZ(this.LL);
            } else {
                rect.left = (int) C497740JfY.LIZIZ(this.LL);
            }
        } else if (z) {
            rect.right = (int) C497740JfY.LIZIZ(this.LLILLL);
        } else {
            rect.left = (int) C497740JfY.LIZIZ(this.LLILLL);
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null && childAdapterPosition == layoutManager.getItemCount() - 1) {
            if (z) {
                rect.left = (int) C497740JfY.LIZIZ(this.LLILLJJLI);
            } else {
                rect.right = (int) C497740JfY.LIZIZ(this.LLILLJJLI);
            }
        }
    }
}
