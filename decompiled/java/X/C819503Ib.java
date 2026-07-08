package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.03Ib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C819503Ib extends C0DXR {
    public final int LL;
    public final int LLILLJJLI;

    public C819503Ib(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            boolean zLIZLLL = C426750GoL.LIZLLL(view.getContext());
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (zLIZLLL) {
                if (childAdapterPosition + 1 == adapter.getItemCount()) {
                    rect.left = (int) C12ES.LIZJ(this.LL, view.getContext());
                }
                if (childAdapterPosition == 0) {
                    rect.right = (int) C12ES.LIZJ(this.LL, view.getContext());
                    return;
                } else {
                    rect.right = (int) C12ES.LIZJ(this.LLILLJJLI, view.getContext());
                    return;
                }
            }
            if (childAdapterPosition == 0) {
                rect.left = (int) C12ES.LIZJ(this.LL, view.getContext());
            }
            if (childAdapterPosition + 1 == adapter.getItemCount()) {
                rect.right = (int) C12ES.LIZJ(this.LL, view.getContext());
            } else {
                rect.right = (int) C12ES.LIZJ(this.LLILLJJLI, view.getContext());
            }
        }
    }
}
