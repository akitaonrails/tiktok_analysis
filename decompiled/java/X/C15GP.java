package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.15GP, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C15GP implements View.OnScrollChangeListener {
    public final /* synthetic */ C15GQ LIZ;

    public C15GP(C15GQ c15gq) {
        this.LIZ = c15gq;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            C15GQ c15gq = this.LIZ;
            c15gq.getClass();
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            c15gq.LJ = recyclerView.getChildCount();
            c15gq.LJFF = linearLayoutManager.getItemCount();
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int i5 = c15gq.LJFF;
            if (i5 < c15gq.LIZJ) {
                c15gq.LJI = 0;
                c15gq.LIZJ = i5;
                if (i5 == 0) {
                    c15gq.LIZLLL = true;
                }
            }
            if (c15gq.LIZLLL && i5 > c15gq.LIZJ) {
                c15gq.LIZLLL = false;
                c15gq.LIZJ = i5;
                c15gq.LJI++;
            }
            if (!c15gq.LIZLLL && i5 - c15gq.LJ <= iFindFirstVisibleItemPosition + c15gq.LIZIZ) {
                C15GO c15go = c15gq.LIZ;
                if (c15go != null) {
                    c15go.LIZ();
                }
                c15gq.LIZLLL = true;
            }
        }
    }
}
