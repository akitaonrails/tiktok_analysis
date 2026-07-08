package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0DX8, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DX8 extends C0DXR {
    public final int LL;
    public final int LLILLJJLI;

    public /* synthetic */ C0DX8() {
        this(14, 2);
    }

    public C0DX8(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (C426750GoL.LIZLLL(view.getContext())) {
            int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
            if (childLayoutPosition == 0) {
                rect.left = 0;
                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LL)));
                return;
            } else if (childLayoutPosition == c21673919s1.LIZIZ() - 1) {
                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLJJLI)));
                rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LL)));
                return;
            } else {
                rect.left = 0;
                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLJJLI)));
                return;
            }
        }
        int childLayoutPosition2 = recyclerView.getChildLayoutPosition(view);
        if (childLayoutPosition2 == 0) {
            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LL)));
            rect.right = 0;
        } else if (childLayoutPosition2 == c21673919s1.LIZIZ() - 1) {
            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLJJLI)));
            rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LL)));
        } else {
            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLJJLI)));
            rect.right = 0;
        }
    }
}
