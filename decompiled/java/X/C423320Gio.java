package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0Gio, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423320Gio extends C0DXR {
    public final View LL;
    public final Function0<Integer> LLILLJJLI;
    public int LLILLL;

    public C423320Gio(View view, AwS562S0100000_18 awS562S0100000_18) {
        this.LL = view;
        this.LLILLJJLI = awS562S0100000_18;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int iLIZIZ;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iIntValue = this.LLILLJJLI.invoke().intValue();
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        if (childAdapterPosition == 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL)));
        } else {
            iLIZIZ = 0;
        }
        if (childAdapterPosition == iIntValue - 1) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL)));
        }
        if (C426750GoL.LJ(this.LL)) {
            rect.left = iLIZIZ2;
            rect.right = iLIZIZ;
        } else {
            rect.left = iLIZIZ;
            rect.right = iLIZIZ2;
        }
    }
}
