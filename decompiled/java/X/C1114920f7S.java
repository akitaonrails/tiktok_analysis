package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0f7S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114920f7S extends C0DXR {
    public final int LL;
    public final int LLILLJJLI = 1;

    public C1114920f7S(int i) {
        this.LL = i;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childPosition = recyclerView.getChildPosition(view);
        int i = this.LLILLJJLI;
        if (i == 0) {
            if (childPosition != 0) {
                rect.left = this.LL;
            }
        } else {
            if (1 != i) {
                return;
            }
            rect.top = this.LL;
        }
    }
}
