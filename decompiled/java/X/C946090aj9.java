package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0aj9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946090aj9 extends C0DXR {
    public final int LL = 4;

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (this.LL <= 1) {
            super.LIZIZ(rect, view, recyclerView, c21673919s1);
        } else {
            rect.right = ((C497740JfY.LJIIZILJ() - (((int) C497740JfY.LIZIZ(32.0f)) * 2)) - (((int) C497740JfY.LIZIZ(64.0f)) * 4)) / (this.LL - 1);
        }
    }
}
