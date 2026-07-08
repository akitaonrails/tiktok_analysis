package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0GmN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425530GmN extends C0DXR {
    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int iLIZIZ;
        if (view.getVisibility() == 0) {
            iLIZIZ = (int) C497740JfY.LIZIZ(3.0f);
        } else {
            iLIZIZ = 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if ((layoutParams instanceof C21681819tI) && ((C21681819tI) layoutParams).LLILLJJLI) {
            iLIZIZ = (int) C497740JfY.LIZIZ(3.0f);
        }
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(1.5f);
        rect.set(iLIZIZ2, iLIZIZ, iLIZIZ2, 0);
    }
}
