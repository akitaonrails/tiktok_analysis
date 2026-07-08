package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0oGa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466540oGa extends C0DXR {
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

    public C1466540oGa(int i) {
        this.$t = i;
    }

    public static final void LIZIZ$0(C1466540oGa c1466540oGa, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        rect.left = C0EGK.LIZ(10);
    }

    public static final void LIZIZ$1(C1466540oGa c1466540oGa, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        rect.left = C0EGK.LIZ(10);
        rect.right = C0EGK.LIZ(10);
    }
}
