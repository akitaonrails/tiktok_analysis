package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0zAQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1885560zAQ {
    public final ViewGroup LIZ;
    public final RecyclerView LIZIZ;
    public final C1885570zAR LIZJ;
    public final int LIZLLL = (int) C497740JfY.LIZIZ(64.0f);
    public C09AY LJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0rMx, X.0zAR] */
    public C1885560zAQ(ViewGroup viewGroup, RunnableC781530UlD runnableC781530UlD) {
        this.LIZ = viewGroup;
        this.LIZIZ = runnableC781530UlD;
        ?? r1 = new AbstractC1585810rMx() { // from class: X.0zAR
            /* JADX WARN: Type inference failed for: r0v9, types: [X.09AY, kotlin.jvm.functions.Function0] */
            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                LinearLayoutManager linearLayoutManager;
                ?? r0;
                float translationY = this.LL.LIZ.getTranslationY() - i2;
                if (translationY <= 0.0f) {
                    C786410Ut5.bd(Math.max(translationY, -r0.LIZLLL), this.LL.LIZ);
                }
                if (translationY > 0.0f) {
                    C786410Ut5.bd(0.0f, this.LL.LIZ);
                }
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1 && (r0 = this.LL.LJ) != 0) {
                    r0.invoke();
                }
            }
        };
        this.LIZJ = r1;
        runnableC781530UlD.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0zAT
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                final C1885560zAQ c1885560zAQ = this.LL;
                C476770Imp.LIZJ(c1885560zAQ.LIZ, new Runnable() { // from class: X.0zAS
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("FeedTagsScroller@a174.<init>$2$1");
                        try {
                            if (!c1885560zAQ.LIZIZ.canScrollVertically(-1)) {
                                C786410Ut5.bd(0.0f, c1885560zAQ.LIZ);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("FeedTagsScroller@a174.<init>$2$1");
                    }
                });
            }
        });
        runnableC781530UlD.addOnScrollListener(r1);
    }
}
