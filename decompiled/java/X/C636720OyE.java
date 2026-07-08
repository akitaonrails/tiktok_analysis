package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0OyE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C636720OyE {
    public static final void LIZ(View view, boolean z) {
        LinearLayoutManager linearLayoutManager;
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) view;
                if (recyclerView.getVisibility() == 0) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && linearLayoutManager.getOrientation() == 1) {
                        if (C301390Brd.LIZ() && (view instanceof C0DWL)) {
                            return;
                        }
                        recyclerView.setNestedScrollingEnabled(z);
                        return;
                    }
                }
            }
            C09RE c09re = new C09RE((ViewGroup) view);
            while (c09re.hasNext()) {
                LIZ((View) c09re.next(), z);
            }
        }
    }
}
