package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0rFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1581410rFr extends C0DXR {
    public static final int LL;
    public static final int LLILLJJLI;
    public static final int LLILLL;

    static {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        LL = iLIZIZ;
        LLILLJJLI = iLIZIZ / 2;
        LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (recyclerView.getChildAdapterPosition(view) <= 1) {
            int i = LLILLJJLI;
            rect.set(i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), i, 0);
        } else {
            int i2 = LLILLJJLI;
            rect.set(i2, LLILLL, i2, 0);
        }
    }
}
