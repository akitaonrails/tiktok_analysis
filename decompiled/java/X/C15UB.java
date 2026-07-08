package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.15UB, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15UB extends C0DXR {
    public static final int LLILZ;
    public static final int LLILZIL;
    public static final int LLILZLL;
    public final boolean LL = C1583440rJ8.LIZ();
    public final int LLILLJJLI = LLILZ / 2;
    public final int LLILLL = LLILZLL;

    static {
        Double dValueOf = Double.valueOf(4.0d);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf));
        LLILZ = iLIZIZ;
        LLILZIL = iLIZIZ / 2;
        LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf));
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (this.LL) {
            if (recyclerView.getChildAdapterPosition(view) <= 1 && C07MS.LIZ()) {
                int i = LLILZIL;
                rect.set(i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), i, 0);
                return;
            } else {
                int i2 = LLILZIL;
                rect.set(i2, LLILZLL, i2, 0);
                return;
            }
        }
        int i3 = this.LLILLJJLI;
        rect.set(i3, 0, i3, this.LLILLL);
    }
}
