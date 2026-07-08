package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0e8a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077180e8a extends C0DXR {
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
            default:
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                break;
        }
    }

    public C1077180e8a(int i) {
        this.$t = i;
    }

    public static final void LIZIZ$0(C1077180e8a c1077180e8a, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    }

    public static final void LIZIZ$1(C1077180e8a c1077180e8a, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            if (C426750GoL.LIZLLL(view.getContext())) {
                rect.right = C1216270hkv.LIZIZ(16);
            } else {
                rect.left = C1216270hkv.LIZIZ(16);
            }
        }
    }
}
