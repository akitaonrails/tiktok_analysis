package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.041d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10303041d {
    public static final void LIZ(RecyclerView recyclerView, Function1<? super View, Unit> function1) {
        if (recyclerView == null) {
            return;
        }
        Rect rect = new Rect();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition != -1) {
                boolean localVisibleRect = childAt.getLocalVisibleRect(rect);
                int iHeight = rect.height() * rect.width();
                int width = childAt.getWidth() * childAt.getHeight();
                if (localVisibleRect && iHeight >= width * 0.3f && linkedHashSet.add(Integer.valueOf(childAdapterPosition))) {
                    function1.invoke(childAt);
                }
            }
        }
    }
}
