package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Ghl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422670Ghl extends C0DXR {
    public final float LL = 2.0f;
    public final boolean LLILLJJLI = true;
    public final boolean LLILLL = false;

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int iLIZIZ = (int) C11VU.LIZIZ(this.LL, view.getContext());
        if (!this.LLILLJJLI) {
            rect.bottom = iLIZIZ;
        } else if (this.LLILLL) {
            iLIZIZ = (int) C11VU.LIZIZ(8.0f, view.getContext());
        }
        int i = iLIZIZ / 2;
        rect.left = i;
        rect.right = i;
    }
}
