package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0UsA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C785840UsA extends C0DXR {
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

    public C785840UsA(int i) {
        this.$t = i;
    }

    public static final void LIZIZ$0(C785840UsA c785840UsA, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (recyclerView.getChildAdapterPosition(view) > 0) {
            rect.top = (int) C497740JfY.LIZIZ(12.0f);
        }
    }

    public static final void LIZIZ$1(C785840UsA c785840UsA, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        if (recyclerView.getChildAdapterPosition(view) > 0) {
            if (C497740JfY.LJJ()) {
                rect.right = C439101nJ.LIZ(-8);
            } else {
                rect.left = C439101nJ.LIZ(-8);
            }
        }
    }
}
