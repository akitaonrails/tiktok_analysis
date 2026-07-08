package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0DWa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C340380DWa extends C0DXR {
    public final int LL;
    public final Integer LLILLJJLI = null;

    public C340380DWa(int i) {
        this.LL = i;
    }

    @Override // X.C0DXR
    public void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int iIntValue;
        int i;
        Integer num = this.LLILLJJLI;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = this.LL * 2;
        }
        if (recyclerView.getChildLayoutPosition(view) == 0) {
            i = iIntValue;
        } else {
            i = this.LL;
        }
        rect.left = i;
        if (recyclerView.getChildLayoutPosition(view) != c21673919s1.LIZIZ() - 1) {
            iIntValue = this.LL;
        }
        rect.right = iIntValue;
    }
}
