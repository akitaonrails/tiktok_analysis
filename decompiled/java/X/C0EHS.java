package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0EHS, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EHS {
    public static final void LIZ(final RecyclerView recyclerView, int i) {
        final RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            final Context context = recyclerView.getContext();
            C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.0Eur
                @Override // X.C21674119s3
                public final int LJIILJJIL() {
                    return -1;
                }

                @Override // X.C21674119s3
                public final int LJIILL() {
                    return -1;
                }

                @Override // X.C21674119s3
                public final int LJIIIZ(int i2, View view) {
                    RecyclerView.LayoutManager layoutManager2 = layoutManager;
                    int decoratedLeft = layoutManager2.getDecoratedLeft(view);
                    int decoratedRight = layoutManager2.getDecoratedRight(view);
                    int paddingLeft = recyclerView.getPaddingLeft();
                    int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    if (recyclerView.getLayoutDirection() == 1) {
                        return LJIIIIZZ(decoratedRight, decoratedLeft, width, paddingLeft, i2);
                    }
                    return LJIIIIZZ(decoratedLeft, decoratedRight, paddingLeft, width, i2);
                }
            };
            c21674119s3.LIZ = i;
            layoutManager.startSmoothScroll(c21674119s3);
            return;
        }
        "RecyclerView must use LinearLayoutManager".toString();
        throw new IllegalArgumentException("RecyclerView must use LinearLayoutManager");
    }
}
