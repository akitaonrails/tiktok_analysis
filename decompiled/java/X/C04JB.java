package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.04JB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JB extends C0DXR {
    public final int $t;
    public Object l0;

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, rect, view, recyclerView, c21673919s1);
                break;
            case 1:
                LIZIZ$1(this, rect, view, recyclerView, c21673919s1);
                break;
            default:
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                break;
        }
    }

    public C04JB(Context context, int i) {
        this.$t = i;
        this.l0 = context;
    }

    public static final void LIZIZ$0(C04JB c04jb, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (recyclerView.getChildAdapterPosition(view) != 0) {
            if (!C426750GoL.LIZLLL((Context) c04jb.l0)) {
                rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            } else {
                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            }
        }
    }

    public static final void LIZIZ$1(C04JB c04jb, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = childAdapterPosition % 3;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((i * 12) / 3)));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(12 - (((i + 1) * 12) / 3))));
        if (C426750GoL.LIZLLL((Context) c04jb.l0)) {
            rect.left = iLIZIZ2;
            rect.right = iLIZIZ;
        } else {
            rect.left = iLIZIZ;
            rect.right = iLIZIZ2;
        }
        if (childAdapterPosition >= 3) {
            rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
    }
}
