package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0hUw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206360hUw {
    public static final /* synthetic */ int LIZ = 0;

    public static RecyclerView LIZ(View view) {
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView recyclerViewLIZ = LIZ(viewGroup.getChildAt(i));
                if (recyclerViewLIZ != null) {
                    return recyclerViewLIZ;
                }
            }
            return null;
        }
        return null;
    }
}
