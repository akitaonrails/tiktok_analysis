package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H6B, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H6B extends C0DXR {
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
                rect.right = C497740JfY.LJIIIZ(R.dimen.amq);
            } else {
                rect.left = C497740JfY.LJIIIZ(R.dimen.amq);
            }
        } else if (z) {
            rect.right = C497740JfY.LJIIIZ(R.dimen.amp);
        } else {
            rect.left = C497740JfY.LJIIIZ(R.dimen.amp);
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null && childAdapterPosition == layoutManager.getItemCount() - 1) {
            if (z) {
                rect.left = C497740JfY.LJIIIZ(R.dimen.amq);
            } else {
                rect.right = C497740JfY.LJIIIZ(R.dimen.amq);
            }
        }
    }
}
