package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0GmM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425520GmM extends C0DXR {
    public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
    public final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof C21681819tI) && ((C21681819tI) layoutParams).LLILLJJLI) {
            rect.left = 0;
            rect.right = 0;
            rect.bottom = 0;
        } else {
            int i = this.LL;
            rect.left = i;
            rect.right = i;
            rect.bottom = this.LLILLJJLI;
        }
    }
}
