package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0ycW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864540ycW extends C0DXR {
    public final int $t;

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, rect, view, recyclerView, c21673919s1);
                break;
            case 1:
                LIZIZ$1(this, rect, view, recyclerView, c21673919s1);
                break;
            case 2:
                LIZIZ$2(this, rect, view, recyclerView, c21673919s1);
                break;
            default:
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                break;
        }
    }

    public C1864540ycW(int i) {
        this.$t = i;
    }

    public static final void LIZIZ$0(C1864540ycW c1864540ycW, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int i;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iLIZIZ = c21673919s1.LIZIZ();
        C1163410gNf.LIZ.getClass();
        if (C1163410gNf.LIZJ()) {
            i = 6;
        } else if (childAdapterPosition == iLIZIZ - 1) {
            i = 12;
        } else {
            i = 8;
        }
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        if (recyclerView.getLayoutDirection() == 1) {
            rect.left = iLIZIZ2;
        } else {
            rect.right = iLIZIZ2;
        }
    }

    public static final void LIZIZ$1(C1864540ycW c1864540ycW, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (recyclerView.getChildAdapterPosition(view) > 0) {
            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        }
    }

    public static final void LIZIZ$2(C1864540ycW c1864540ycW, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        if (recyclerView.getChildAdapterPosition(view) == c21673919s1.LIZIZ() - 1) {
            rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        } else {
            rect.bottom = 0;
        }
    }
}
