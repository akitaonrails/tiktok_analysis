package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0aei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C943340aei extends C0DXR {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public C943340aei(int i, int i2, int i3) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        boolean z;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iLIZIZ = c21673919s1.LIZIZ();
        if (childAdapterPosition != -1 && iLIZIZ != 0) {
            if (recyclerView.getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            int i = this.LL / 2;
            if (z) {
                if (childAdapterPosition == 0) {
                    rect.left = i;
                    rect.right = this.LLILLJJLI;
                    return;
                } else if (childAdapterPosition == iLIZIZ - 1) {
                    rect.left = this.LLILLL;
                    rect.right = i;
                    return;
                } else {
                    rect.left = i;
                    rect.right = i;
                    return;
                }
            }
            if (childAdapterPosition == 0) {
                rect.left = this.LLILLJJLI;
                rect.right = i;
            } else if (childAdapterPosition == iLIZIZ - 1) {
                rect.left = i;
                rect.right = this.LLILLL;
            } else {
                rect.left = i;
                rect.right = i;
            }
        }
    }
}
