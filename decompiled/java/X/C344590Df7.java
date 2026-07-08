package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Df7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C344590Df7 {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZ(RecyclerView recyclerView) {
        if (!recyclerView.canScrollVertically(-1)) {
            return 1.0f;
        }
        View childAt = recyclerView.getChildAt(0);
        Rect rect = new Rect();
        View viewFindViewById = childAt.findViewById(R.id.qex);
        if (viewFindViewById == null) {
            return 0.0f;
        }
        int measuredHeight = viewFindViewById.getMeasuredHeight();
        viewFindViewById.getGlobalVisibleRect(rect);
        float f = (rect.bottom - rect.top) / measuredHeight;
        if (f == 1.0f) {
            return 0.0f;
        }
        return f;
    }
}
