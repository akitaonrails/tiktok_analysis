package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Gj7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423510Gj7 extends C0DXR {
    public final int LL;
    public final int LLILLJJLI;

    public C423510Gj7(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        if (recyclerView.getChildAdapterPosition(view) == 1) {
            rect.left = this.LLILLJJLI;
            rect.right = this.LL;
        } else {
            int i = this.LL;
            rect.left = i;
            rect.right = i;
        }
    }
}
