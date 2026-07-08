package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.03Ic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C819603Ic extends C0DXR {
    public final int LL;

    public C819603Ic(int i) {
        this.LL = i;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (recyclerView.getAdapter() != null && recyclerView.getChildAdapterPosition(view) != 0) {
            rect.top = (int) C12ES.LIZJ(this.LL, view.getContext());
        }
    }
}
