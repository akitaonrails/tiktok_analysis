package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0FWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C391460FWm extends C0DXR {
    public final int $t;

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (this.$t != 0) {
            super.LIZIZ(rect, view, recyclerView, c21673919s1);
        } else {
            LIZIZ$0(this, rect, view, recyclerView, c21673919s1);
        }
    }

    public C391460FWm(int i) {
        this.$t = i;
    }

    public static final void LIZIZ$0(C391460FWm c391460FWm, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        int iLIZ = C0FU0.LIZ(4.0f);
        if (recyclerView.getChildAdapterPosition(view) > 0) {
            rect.left = iLIZ;
        }
    }
}
