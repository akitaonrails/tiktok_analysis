package X;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0h1o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188300h1o {
    public static final void LIZ(RecyclerView recyclerView) {
        int itemDecorationCount = recyclerView.getItemDecorationCount();
        for (int i = 0; i < itemDecorationCount; i++) {
            recyclerView.removeItemDecorationAt(i);
        }
    }
}
